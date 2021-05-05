package comunicacion;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import vista.Interfaz_monitor;

public class receptorNotificaciones implements Runnable
{
	private static receptorNotificaciones instance = null;
	private Interfaz_monitor ventana;
	private int port;

	private receptorNotificaciones()
	{
		super();
		this.port = 9000;// leer de archivo cfg
		this.ventana = new Interfaz_monitor();
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

	public static receptorNotificaciones getInstance()
	{
		if (instance == null)
		{
			instance = new receptorNotificaciones();
		}
		return instance;
	}

	private void recibirNotificacion()
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

				String dni = in.readUTF();
				int box = in.read();

				this.ventana.actualizaTurnos(dni, box);

				out.writeBoolean(true);
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
		recibirNotificacion();

	}

}
