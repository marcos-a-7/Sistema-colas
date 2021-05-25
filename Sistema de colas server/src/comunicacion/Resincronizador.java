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
	private int port, portServer2, portEmpleado, portCliente;

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
			properties.load(new FileInputStream(new File("config2.cfg")));
			this.ipServer2 = properties.getProperty("ipServer2", "127.0.0.1");
			this.port = Integer.parseInt(properties.getProperty("portResincro", "12000"));
			this.portServer2 = Integer.parseInt(properties.getProperty("portResincroServer2", "13000"));
			this.portEmpleado = Integer.parseInt(properties.getProperty("portEmpleado2", "19000"));
			this.portCliente = Integer.parseInt(properties.getProperty("portCliente2", "20000"));
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

	public void actualizarLlamado(int box)
	{
		Socket socket;
		DataOutputStream out;

		try
		{
			socket = new Socket(this.ipServer2, this.portEmpleado);

			out = new DataOutputStream(socket.getOutputStream());

			out.writeBoolean(true);
			out.write(box);

			socket.close();
		} catch (IOException e)
		{
		}
	}

	public void actualizarRegistro(String dni)
	{
		Socket socket;
		DataOutputStream out;

		try
		{
			socket = new Socket(this.ipServer2, this.portCliente);

			out = new DataOutputStream(socket.getOutputStream());

			out.writeBoolean(true);
			out.writeUTF(dni);

			socket.close();

		} catch (IOException e)
		{
		}
	}

	@SuppressWarnings("unchecked")
	public void sincronizar()
	{
		Socket socket;
		ObjectInputStream in;
		DataOutputStream out;
		boolean check = false;
		int i = 0;

		while (i < 3 && !check) // reintenta hasta 3 veces sincronizar con el otro servidor
		{
			i++;
			try
			{
				socket = new Socket(ipServer2, portServer2);
				in = new ObjectInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());

				this.asignadorTurnos.setCola((Queue<String>) in.readObject());
				check = true;
				out.writeBoolean(check);

				socket.close();

			} catch (IOException e)
			{
			} catch (ClassNotFoundException e)
			{
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
