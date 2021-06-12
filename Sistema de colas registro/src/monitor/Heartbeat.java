package monitor;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.Properties;

public class Heartbeat implements Runnable
{
	private static Heartbeat instance = null;
	private int port;
	private String host;
	private String id;

	private Heartbeat()
	{
		super();
		leerConfig();
	}

	public static Heartbeat getInstance()
	{
		if (instance == null)
		{
			instance = new Heartbeat();
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
	 * @return the host
	 */
	public String getHost()
	{
		return host;
	}

	/**
	 * @param host the host to set
	 */
	public void setHost(String host)
	{
		this.host = host;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(int port)
	{
		this.port = port;
	}

	private void leerConfig()
	{
		Properties properties = new Properties();
		try
		{
			properties.load(new FileInputStream(new File("config.cfg")));
			this.id = properties.getProperty("id");
			this.host = properties.getProperty("ipMonitor", "127.0.0.1");
			this.port = Integer.parseInt(properties.getProperty("portMonitor", "15000"));

		} catch (UnsupportedEncodingException | FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

	/**
	 * metodo que notifica al monitor que el componente esta funcionando
	 */
	public void notificar()
	{

		Socket socket;
		DataOutputStream out;

		try
		{
			socket = new Socket(host, port);

			out = new DataOutputStream(socket.getOutputStream());

			out.writeUTF(id);

			socket.close();

		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void run()
	{
		while (true)
		{
			try
			{
				this.notificar();
				Thread.sleep(2500);

			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

	}

}
