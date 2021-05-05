package comunicacion;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class EmisorLLamados
{
	private static EmisorLLamados instance = null;
	private int port;
	private String host;

	private EmisorLLamados()
	{
		super();
		this.port = 9000; // leer amos de archivo cfg
		this.host = "127.0.0.1";
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

	public Mensaje enviarLlamado(int box)
	{
		Mensaje salida = null;

		Socket socket;
		DataInputStream in;
		DataOutputStream out;

		try
		{
			socket = new Socket(host, port);

			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());

			out.write(box);

			String dni = in.readUTF();
			int cantCola = in.read();

			salida = new Mensaje(dni, cantCola);
			socket.close();

		} catch (IOException e)
		{
			e.printStackTrace();
		}
		return salida;
	}
}
