package evento;

import cliente.Cliente;

public abstract class EventoFactory
{
	public static Evento crearEvento(Cliente cliente)
	{
		return new Registro(cliente);
	}

	public static Evento crearEvento(Cliente cliente, int box)
	{
		return new Llamado(cliente, box);
	}
}
