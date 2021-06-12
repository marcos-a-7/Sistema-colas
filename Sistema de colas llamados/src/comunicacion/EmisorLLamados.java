package comunicacion;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.Properties;

import cliente.Cliente;

public class EmisorLLamados
{
	private static EmisorLLamados instance = null;
	private int[] port = new int[2];
	private String[] host = new String[2];

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
			this.host[0] = properties.getProperty("ipServer", "127.0.0.1");
			this.port[0] = Integer.parseInt(properties.getProperty("portEmpleado", "9000"));
			this.host[1] = properties.getProperty("ipServer2", "127.0.0.1");
			this.port[1] = Integer.parseInt(properties.getProperty("portEmpleado2", "19000"));

		} catch (UnsupportedEncodingException | FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
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

	private void switchServer()
	{
		String hostAux = this.host[0];
		int portAux = this.port[0];
		this.port[0] = this.port[1];
		this.host[0] = this.host[1];
		this.port[1] = portAux;
		this.host[1] = hostAux;
	}

	private Mensaje llamar(int box) throws IOException
	{
		Socket socket;
		DataInputStream in;
		ObjectInputStream inObject;
		DataOutputStream out;
		Cliente cliente;
		Mensaje mensaje = null;

		socket = new Socket(host[0], port[0]);
		try
		{

			out = new DataOutputStream(socket.getOutputStream());

			out.writeBoolean(false);
			out.write(box);
			// out.close();

			inObject = new ObjectInputStream(socket.getInputStream());
			cliente = (Cliente) inObject.readObject();
			// inObject.close();

			in = new DataInputStream(socket.getInputStream());
			int cantCola = in.read();
			// in.close();

			mensaje = new Mensaje(cliente, cantCola);

		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}

		socket.close();

		return mensaje;

	}

	public Mensaje enviarLlamado(int box) throws IOException
	{
		Mensaje salida = null;

		try
		{
			salida = llamar(box);
			System.out.println(salida.getCantCola());
			if (salida.getCantCola() == 255)
			{
				throw new IOException();
			}

		} catch (IOException e)
		{
			switchServer();
			
			salida = llamar(box);
			System.out.println(salida.getCantCola());
		}

		return salida;
	}
}
