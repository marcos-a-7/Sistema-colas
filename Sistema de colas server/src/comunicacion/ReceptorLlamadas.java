package comunicacion;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import modelo.AsignadorTurnos;

public class ReceptorLlamadas implements Runnable
{
	private static ReceptorLlamadas instance;
	private AsignadorTurnos asignadorTurnos;
	private int port;

	private ReceptorLlamadas()
	{
		super();
		this.port = 10000;// obtener de un txt cfg
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

		try
		{
			server = new ServerSocket(port);
			while (true)
			{
				socket = server.accept();

				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());

				int box = in.read();
				String dniSig = this.asignadorTurnos.llamarSiguiente(box);// envio el box para llamar al siguiente

				out.writeUTF(dniSig);// devuelvo el dni del siguiente al sistema de empleado
				socket.close();
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
