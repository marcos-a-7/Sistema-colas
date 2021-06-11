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
	private int[] port = new int[2];
	private String[] host = new String[2];

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
			this.host[0] = properties.getProperty("ipServer", "127.0.0.1");
			this.port[0] = Integer.parseInt(properties.getProperty("portCliente", "10000"));
			this.host[1] = properties.getProperty("ipServer2", "127.0.0.1");
			this.port[1] = Integer.parseInt(properties.getProperty("portCliente2", "10000"));

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

	private void switchServer()
	{
		String hostAux = this.host[0];
		int portAux = this.port[0];
		this.port[0] = this.port[1];
		this.host[0] = this.host[1];
		this.port[1] = portAux;
		this.host[1] = hostAux;
	}

	private boolean enviar(String dni) throws IOException
	{
		boolean salida = false;
		Socket socket;
		DataInputStream in;
		DataOutputStream out;

		socket = new Socket(host[0], port[0]);

		in = new DataInputStream(socket.getInputStream());
		out = new DataOutputStream(socket.getOutputStream());

		out.writeBoolean(false);
		out.writeUTF(dni);

		salida = in.readBoolean();

		socket.close();
		return salida;
	}

	public boolean enviarCliente(String dni) throws IOException
	{
		boolean salida = false;
		try
		{
			salida = enviar(dni);
			if (salida == false)
			{
				throw new IOException();
			}

		} catch (IOException e)
		{
			switchServer();
			salida = enviar(dni);
		}

		return salida;
	}

}
