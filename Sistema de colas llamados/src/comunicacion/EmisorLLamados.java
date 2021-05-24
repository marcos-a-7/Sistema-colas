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

public class EmisorLLamados
{
	private static EmisorLLamados instance = null;
	private int port;
	private String host;

	private EmisorLLamados()
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
			this.port = Integer.parseInt(properties.getProperty("portEmpleado", "9000"));

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

	public static EmisorLLamados getInstance()
	{
		if (instance == null)
		{
			instance = new EmisorLLamados();
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

	public Mensaje enviarLlamado(int box) throws IOException
	{
		Mensaje salida = null;

		Socket socket;
		DataInputStream in;
		DataOutputStream out;

		socket = new Socket(host, port);

		in = new DataInputStream(socket.getInputStream());
		out = new DataOutputStream(socket.getOutputStream());

		out.write(box);

		String dni = in.readUTF();
		int cantCola = in.read();

		salida = new Mensaje(dni, cantCola);
		socket.close();

		return salida;
	}
}
