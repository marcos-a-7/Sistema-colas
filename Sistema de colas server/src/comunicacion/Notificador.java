package comunicacion;

import java.io.DataInputStream;
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
	 * @param dni dni de la persona a llamar
	 * @param box numero de box del empleado que llama a la persona
	 * @return true si pudo realizar la accion con exito, false de lo contrario
	 */
	public boolean notificar(String dni, int box)
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
			out.write(box);

			salida = in.readBoolean();

			socket.close();

		} catch (IOException e)
		{
			e.printStackTrace();
		}
		return salida;
	}

}
