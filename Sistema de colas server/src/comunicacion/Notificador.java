package comunicacion;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Notificador
{

	private static Notificador instance = null;
	private int port;
	private String host;

	private Notificador()
	{
		super();
		this.port = 7000;// sacar de un txt config
		this.host = "127.0.0.1";
	}

	public static Notificador getInstance()
	{
		if (instance == null)
		{
			instance = new Notificador();
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

	/**
	 * @param dni dni de la persona a llamar
	 * @param box numero de box del empleado que llama a la persona
	 * @return true si pudo realizar la accion con exito, false de lo contrario
	 */
	public void notificar(String identificador, int box)
	{

		Socket socket;
		DataOutputStream out;

		try
		{
			socket = new Socket(host, port);

			out = new DataOutputStream(socket.getOutputStream());

			out.writeUTF(identificador);
			out.write(box);

			socket.close();

		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
