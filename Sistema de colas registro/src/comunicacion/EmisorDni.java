package comunicacion;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.Properties;

public class EmisorDni
{
	private static EmisorDni instance = null;
	private int port;
	private String host;

	private EmisorDni()
	{
		super();
		leerConfig();
	}

	private void leerConfig()
	{
		Properties properties = new Properties();
		try
		{
			properties.load(new FileInputStream(new File("config.cfg")));
			this.host = properties.getProperty("ipServer", "127.0.0.1");
			this.port = Integer.parseInt(properties.getProperty("portCliente", "10000"));

		} catch (UnsupportedEncodingException | FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

	public static EmisorDni getInstance()
	{
		if (instance == null)
		{
			instance = new EmisorDni();
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

	public boolean enviarCliente(String dni)
	{
		boolean salida = false;

		Socket socket;
		DataInputStream in;
		DataOutputStream out;

		try
		{
			socket = new Socket(host, port);

			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());

			out.writeUTF(dni);

			salida = in.readBoolean();

			socket.close();

		} catch (IOException e)
		{
			e.printStackTrace();// conexion al servidor secundario
		}
		return salida;
	}

}
