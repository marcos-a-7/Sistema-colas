package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Queue;

import cliente.Cliente;
import comunicacion.Notificador;

/**
 * @author marcos
 *
 */
public class AsignadorTurnos
{
	private static AsignadorTurnos instance = null;
	Queue<Cliente> cola = new LinkedList<Cliente>();
	private Repositorio repositorio;

	Notificador notificador;
	private LlamarStrategy llamador;

	private AsignadorTurnos()
	{
		super();
		this.notificador = Notificador.getInstance();
		this.repositorio = new Repositorio("repositorio.bin");
		leerConfig();
	}

	public static AsignadorTurnos getInstance()
	{
		if (instance == null)
		{
			instance = new AsignadorTurnos();
		}
		return instance;
	}

	private void leerConfig()
	{
		Properties properties = new Properties();
		try
		{
			properties.load(new FileInputStream(new File("config.cfg")));
			String estrategia = properties.getProperty("criterio", "FIFO");
			switch (estrategia)
			{
			case "FIFO":
				this.llamador = new LlamadorFIFO();
				break;
			case "categoria":
				this.llamador = new LlamadorCategoria();
				break;
			case "dniDescendente":
				this.llamador = new LlamadorDniDescendente();
				break;
			case "dniAscendente":
				this.llamador = new LlamadorDniAscendente();
			}

		} catch (UnsupportedEncodingException | FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

	public synchronized boolean asignarTurno(String dni)
	{
		boolean salida = false;
		cola.add(repositorio.traerCliente(dni));
		salida = true;
		return salida;
	}

	/**
	 * @return the cola
	 */
	public synchronized Queue<Cliente> getCola()
	{
		return cola;
	}

	/**
	 * @param cola the cola to set
	 */
	public synchronized void setCola(Queue<Cliente> cola)
	{
		this.cola = cola;
	}

	/**
	 * @return la cantidad de personas en la cola
	 */
	public synchronized int getCantCola()
	{
		return cola.size();
	}

	/**
	 * @return el siguiente elemento en la cola o null si esta vacia
	 */
	public synchronized Cliente llamarSiguiente(int box)
	{
		Cliente clienteSig = null;
		if (!this.cola.isEmpty())
		{
			clienteSig = this.llamador.llamarSiguiente(this.cola);
			if (clienteSig.getCategoria() == 0)
			{
				notificador.notificar(clienteSig.getDni(), box);
			} else
			{
				notificador.notificar(clienteSig.getApellido() + " " + clienteSig.getNombre(), box);
			}
		}
		return clienteSig;
	}

	/**
	 * elimina el siguiente de la cola
	 */
	public synchronized void eliminarSiguiente()
	{
		if (!this.cola.isEmpty())
		{
			this.llamador.eliminarSiguiente(this.cola);
		}
	}
}
