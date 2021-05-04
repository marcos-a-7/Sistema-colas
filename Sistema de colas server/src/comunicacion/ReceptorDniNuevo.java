package comunicacion;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import modelo.AsignadorTurnos;

public class ReceptorDniNuevo
{
	private static ReceptorDniNuevo instance = null;
	private AsignadorTurnos asignadorTurnos = null;
	private int port;

	private ReceptorDniNuevo()
	{
		super();
		this.port = 9000;// leer de archivo cfg
		this.asignadorTurnos = AsignadorTurnos.getInstance();
		recibirDni();
	}

	public static ReceptorDniNuevo getInstance()
	{
		if (instance == null)
		{
			instance = new ReceptorDniNuevo();
		}
		return instance;
	}

	private void recibirDni()
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

				boolean check = asignadorTurnos.asignarTurno(in.readUTF());

				out.writeBoolean(check);
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
