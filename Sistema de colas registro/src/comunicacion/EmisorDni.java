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

	public boolean enviarCliente(String dni)
	{
		boolean[] salida = new boolean[2];
		salida[0] = false;
		salida[1] = false;

		Socket socket;
		DataInputStream in;
		DataOutputStream out;

		for (int i = 0; i < 2; i++)
		{
			try
			{
				socket = new Socket(host[i], port[i]);

				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());

				out.writeUTF(dni);

				salida[i] = in.readBoolean();

				socket.close();

			} catch (IOException e)
			{
				//e.printStackTrace();
			}
		}
		return salida[0] || salida[1];
	}

}
