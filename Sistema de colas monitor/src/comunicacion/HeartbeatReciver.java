package comunicacion;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

import monitor.Monitor;

public class HeartbeatReciver implements Runnable
{
	private Monitor monitor;
	private static HeartbeatReciver instance = null;
	private int port;

	private HeartbeatReciver()
	{
		super();
		monitor = Monitor.getInstance();
		leerConfig();
	}

	private void leerConfig()
	{
		Properties properties = new Properties();
		try
		{
			properties.load(new FileInputStream(new File("config.cfg")));
			this.port = Integer.parseInt(properties.getProperty("portMonitor", "15000"));

		} catch (UnsupportedEncodingException | FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

	public static HeartbeatReciver getInstance()
	{
		if (instance == null)
		{
			instance = new HeartbeatReciver();
		}
		return instance;
	}

	private void recibir()
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

				String id = in.readUTF();
				actualizarEstado(id);
				if (id.equals("server1"))
				{
					out.writeBoolean(!monitor.isServer2());
				} else if (id.equals("server2"))
				{
					out.writeBoolean(!monitor.isServer1());
				}
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

	private void actualizarEstado(String id)
	{
		switch (id)
		{
		case "server1":
			monitor.setServer1(true);
			break;
		case "server2":
			monitor.setServer2(true);
			break;
		case "registro":
			monitor.setRegistro(true);
			break;
		case "televisor":
			monitor.setTelevisor(true);
			break;
		}

	}

	@Override
	public void run()
	{
		recibir();

	}
}
