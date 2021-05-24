package comunicacion;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Queue;

import modelo.AsignadorTurnos;

public class Resincronizador implements Runnable
{
	private static Resincronizador instance = null;
	private AsignadorTurnos asignadorTurnos = AsignadorTurnos.getInstance();
	private String ipServer2;
	private int port, portServer2;

	private Resincronizador()
	{
		super();
		leeConfig();
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

	private void leeConfig()
	{
		Properties properties = new Properties();

		try
		{
			properties.load(new FileInputStream(new File("config.cfg")));
			this.ipServer2 = properties.getProperty("ipServer2", "127.0.0.1");
			this.port = Integer.parseInt(properties.getProperty("portResincro", "12000"));
			this.portServer2 = Integer.parseInt(properties.getProperty("portResincroServer2", "13000"));
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Resincronizador getInstance()
	{
		if (instance == null)
		{
			instance = new Resincronizador();
		}
		return instance;
	}

	@SuppressWarnings("unchecked")
	public void sincronizar()
	{
		Socket socket;
		ObjectInputStream in;
		DataOutputStream out;
		boolean check = false;
		int i = 0;

		while (i < 5 && !check) // reintenta hasta 5 veces sincronizar con el otro servidor
		{
			i++;
			try
			{
				System.out.println("" + ipServer2 + " " + portServer2);
				socket = new Socket(ipServer2, portServer2);
				in = new ObjectInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());

				this.asignadorTurnos.setCola((Queue<String>) in.readObject());
				check = true;
				out.writeBoolean(check);

				socket.close();

			} catch (IOException e)
			{
				System.out.println("excepcion");
			} catch (ClassNotFoundException e)
			{
				System.out.println("excepcion2");
			}
		}

	}

	@Override
	public void run()
	{
		ServerSocket server = null;
		Socket socket = null;
		DataInputStream in;
		ObjectOutputStream out;

		try
		{
			server = new ServerSocket(port);
			while (true)
			{
				socket = server.accept();

				in = new DataInputStream(socket.getInputStream());
				out = new ObjectOutputStream(socket.getOutputStream());

				out.writeObject(this.asignadorTurnos.getCola());

				in.readBoolean();

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
}
