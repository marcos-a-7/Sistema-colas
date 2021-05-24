package comunicacion;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

import vista.Interfaz_monitor;

public class ReceptorNotificaciones implements Runnable
{
	private static ReceptorNotificaciones instance = null;
	private Interfaz_monitor ventana;
	private int port;

	private ReceptorNotificaciones()
	{
		super();
		leerConfig();
		this.ventana = new Interfaz_monitor();
		this.ventana.vaciarTurnos();
		this.recibirNotificacion();
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

	public static ReceptorNotificaciones getInstance()
	{
		if (instance == null)
		{
			instance = new ReceptorNotificaciones();
		}
		return instance;
	}

	private void leerConfig()
	{
		Properties properties = new Properties();
		try
		{
			properties.load(new FileInputStream(new File("config.cfg")));
			this.port = Integer.parseInt(properties.getProperty("portTele", "8000"));

		} catch (UnsupportedEncodingException | FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

	private void recibirNotificacion()
	{
		ServerSocket server = null;
		Socket socket = null;
		DataInputStream in;

		try
		{
			server = new ServerSocket(port);
			while (true)
			{
				socket = server.accept();

				in = new DataInputStream(socket.getInputStream());

				String dni = in.readUTF();
				int box = in.read();

				this.ventana.actualizaTurnos(dni, box);

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
