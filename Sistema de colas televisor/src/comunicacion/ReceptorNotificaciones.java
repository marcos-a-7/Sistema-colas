package comunicacion;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;

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
		BufferedReader reader = null;
		try
		{
			reader = new BufferedReader(new InputStreamReader(new FileInputStream("config.cfg"), "UTF-8"));
			this.port = Integer.parseInt(reader.readLine().replaceAll("portTele ", ""));
			reader.close();

		} catch (UnsupportedEncodingException | FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
