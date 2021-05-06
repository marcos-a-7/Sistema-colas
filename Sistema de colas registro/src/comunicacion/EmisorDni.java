package comunicacion;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

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
		BufferedReader reader = null;
		try
		{
			reader = new BufferedReader(new InputStreamReader(new FileInputStream("config.cfg"), "UTF-8"));
			this.host = reader.readLine().replaceAll("ipServer ", "");
			System.out.println(host);
			this.port = Integer.parseInt(reader.readLine().replaceAll("portCliente ", ""));
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
			e.printStackTrace();
		}
		return salida;
	}

}
