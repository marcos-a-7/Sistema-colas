package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Queue;

import cliente.Cliente;
import comunicacion.Notificador;
import evento.EventoFactory;
import persistencia.Persistencia;
import persistencia.PersistenciaBIN;
import persistencia.PersistenciaEvento;

/**
 * @author marcos
 *
 */
public class AsignadorTurnos
{
	private static AsignadorTurnos instance = null;
	Queue<Cliente> cola = new LinkedList<Cliente>();
	private Repositorio repositorio;
	private Persistencia persistencia;
	private Persistencia persistenciaEventos;
	private String direccionPersistencia;

	Notificador notificador;
	private LlamarStrategy llamador;
	private String direccionEventos;

	private AsignadorTurnos()
	{
		super();
		this.notificador = Notificador.getInstance();
		this.repositorio = new Repositorio("repositorio.bin");
		persistencia = new PersistenciaBIN();
		persistenciaEventos = new PersistenciaEvento();
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
			this.direccionPersistencia = properties.getProperty("dirPersistenciaCola", "cola.bin");
			this.direccionEventos = properties.getProperty("dirEventos", "eventos.txt");
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
		Cliente cliente = repositorio.traerCliente(dni);
		this.cola.add(cliente);
		salida = true;
		persistirCola();
		try
		{
			this.persistenciaEventos.guardar(this.direccionEventos, (Serializable) EventoFactory.crearEvento(cliente));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
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
			try
			{
				this.persistenciaEventos.guardar(this.direccionEventos,
						(Serializable) EventoFactory.crearEvento(clienteSig, box));
			} catch (IOException e)
			{
				e.printStackTrace();
			}
			persistirCola();
		}
		return clienteSig;
	}

	/**
	 * elimina el siguiente de la cola
	 */
	public synchronized void eliminarSiguiente(int box)
	{
		Cliente clienteSig = null;
		if (!this.cola.isEmpty())
		{
			clienteSig = this.llamador.llamarSiguiente(this.cola);
			try
			{
				this.persistenciaEventos.guardar(this.direccionEventos,
						(Serializable) EventoFactory.crearEvento(clienteSig, box));
			} catch (IOException e)
			{
				e.printStackTrace();
			}
			persistirCola();
		}
	}

	public void persistirCola()
	{
		try
		{
			this.persistencia.guardar(direccionPersistencia, (Serializable) this.cola);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void cargarCola()
	{
		try
		{
			this.setCola((Queue<Cliente>) this.persistencia.cargar(direccionPersistencia));
		} catch (ClassNotFoundException | IOException e)
		{
			e.printStackTrace();
		}
	}

}
