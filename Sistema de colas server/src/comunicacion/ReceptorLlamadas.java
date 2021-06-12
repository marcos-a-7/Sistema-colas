package comunicacion;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import cliente.Cliente;
import modelo.AsignadorTurnos;

public class ReceptorLlamadas implements Runnable
{
	private static ReceptorLlamadas instance;
	private AsignadorTurnos asignadorTurnos;
	private int port;

	private ReceptorLlamadas()
	{
		super();
		this.asignadorTurnos = AsignadorTurnos.getInstance();

	}

	public static ReceptorLlamadas getInstance()
	{
		if (instance == null)
		{
			instance = new ReceptorLlamadas();
		}
		return instance;
	}

	/**
	 * @return the port
	 */
	public int getPort()
	{
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(int port)
	{
		this.port = port;
	}

	private void recibirLlamado()
	{
		ServerSocket server = null;
		Socket socket = null;
		DataInputStream in;
		DataOutputStream out;
		ObjectOutputStream outObject;
		boolean isServer;

		try
		{
			server = new ServerSocket(port);
			while (true)
			{
				socket = server.accept();

				in = new DataInputStream(socket.getInputStream());

				isServer = in.readBoolean();
				

				if (!isServer)// la conexion no proviene de un servidor
				{
					int box = in.read();
					//in.close();
					Cliente clienteSig = this.asignadorTurnos.llamarSiguiente(box);// traigo el siguiente del asignador
																					// de
					outObject = new ObjectOutputStream(socket.getOutputStream()); // turnos
					outObject.writeObject(clienteSig);// devuelvo el dni del siguiente al sistema de empleado
					//outObject.close();
					out = new DataOutputStream(socket.getOutputStream());
					out.write(this.asignadorTurnos.getCantCola());
					//out.close();
					socket.close();
					Resincronizador.getInstance().actualizarLlamado(box);
				} else // la conexion proviene de un servidor
				{
					int box = in.read();

					this.asignadorTurnos.eliminarSiguiente(box);
					socket.close();
				}
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		} finally
		{
			if (server != null)
			{
				try
				{
					server.close();
				} catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void run()
	{
		recibirLlamado();

	}
}
