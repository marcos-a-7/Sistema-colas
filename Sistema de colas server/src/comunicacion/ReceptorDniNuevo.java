package comunicacion;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import modelo.AsignadorTurnos;

public class ReceptorDniNuevo implements Runnable
{
	private static ReceptorDniNuevo instance = null;
	private AsignadorTurnos asignadorTurnos = null;
	private int port;

	private ReceptorDniNuevo()
	{
		super();
		this.asignadorTurnos = AsignadorTurnos.getInstance();
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

	public static ReceptorDniNuevo getInstance()
	{
		if (instance == null)
		{
			instance = new ReceptorDniNuevo();
		}
		return instance;
	}

	private void recibirDni()
	{
		ServerSocket server = null;
		Socket socket = null;
		DataInputStream in;
		DataOutputStream out;
		boolean isServer;
		try
		{
			server = new ServerSocket(port);
			while (true)
			{
				socket = server.accept();

				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
				isServer = in.readBoolean();

				String dni = in.readUTF();
				boolean check = asignadorTurnos.asignarTurno(dni);

				if (!isServer)
				{
					out.writeBoolean(check);
					socket.close();
					Resincronizador.getInstance().actualizarRegistro(dni);
				} else
				{
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
		recibirDni();

	}

}
