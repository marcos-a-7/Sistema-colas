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
			this.port[1] = Integer.parseInt(properties.getProperty("portEmpleado2", "9000"));

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

	public Mensaje enviarLlamado(int box) throws IOException
	{
		Mensaje[] mensaje = new Mensaje[2];
		Mensaje salida = null;
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

				out.write(box);

				String dni = in.readUTF();
				int cantCola = in.read();

				mensaje[i] = new Mensaje(dni, cantCola);
				socket.close();
			} catch (IOException e)
			{
				// e.printStackTrace();
			}
		}
		int j = 0;
		do
		{
			salida = mensaje[j++];
		} while (salida == null && j < 2);

		if (salida == null)
		{
			throw new IOException("Imposible conectar con el servidor, intente nuevamente mas tarde");
		}
		return salida;
	}
}
