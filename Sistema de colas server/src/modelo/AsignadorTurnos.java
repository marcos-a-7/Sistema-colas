package modelo;

import java.util.Queue;

import comunicacion.Notificador;

public class AsignadorTurnos
{
	private static AsignadorTurnos instance = null;
	Queue<String> cola;
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

	public boolean asignarTurno(String dni)
	{
		boolean salida = false;
		cola.add(dni);
		salida = true;
		return salida;
	}

	/**
	 * @return la cantidad de personas en la cola
	 */
	public int getCantCola()
	{
		return cola.size();
	}

	/**
	 * @return el siguiente elemento en la cola o null si esta vacia
	 */
	public String llamarSiguiente(int box)
	{
		String dniSig = cola.poll();
		notificador.notificar(dniSig, box);
		return dniSig;
	}
}
