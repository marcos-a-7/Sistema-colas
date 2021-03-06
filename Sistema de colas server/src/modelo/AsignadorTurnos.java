package modelo;

import java.util.LinkedList;
import java.util.Queue;

import comunicacion.Notificador;

/**
 * @author marco
 *
 */
public class AsignadorTurnos
{
	private static AsignadorTurnos instance = null;
	Queue<String> cola = new LinkedList<String>();

	Notificador notificador;

	private AsignadorTurnos()
	{
		super();
		this.notificador = Notificador.getInstance();
	}

	public static AsignadorTurnos getInstance()
	{
		if (instance == null)
		{
			instance = new AsignadorTurnos();
		}
		return instance;
	}

	public synchronized boolean asignarTurno(String dni)
	{
		boolean salida = false;
		cola.add(dni);
		salida = true;
		return salida;
	}

	/**
	 * @return the cola
	 */
	public synchronized Queue<String> getCola()
	{
		return cola;
	}

	/**
	 * @param cola the cola to set
	 */
	public synchronized void setCola(Queue<String> cola)
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
	public synchronized String llamarSiguiente(int box)
	{
		String dniSig = "";
		if (!this.cola.isEmpty())
		{
			dniSig = cola.poll();
			notificador.notificar(dniSig, box);
		}
		return dniSig;
	}

	/**
	 * elimina el siguiente de la cola
	 */
	public synchronized void eliminarSiguiente()
	{
		if (!this.cola.isEmpty())
		{
			cola.poll();
		}
	}
}
