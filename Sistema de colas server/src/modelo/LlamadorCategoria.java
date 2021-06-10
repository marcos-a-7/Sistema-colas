package modelo;

import java.util.Iterator;
import java.util.Queue;

import cliente.Cliente;

public class LlamadorCategoria implements LlamarStrategy
{

	@Override
	public Cliente llamarSiguiente(Queue<Cliente> cola)
	{
		Cliente cliente = this.buscarClienteMayorCategoria(cola);
		cola.remove(this.buscarClienteMayorCategoria(cola));
		return cliente;
	}

	@Override
	public void eliminarSiguiente(Queue<Cliente> cola)
	{
		cola.remove(this.buscarClienteMayorCategoria(cola));

	}

	private Cliente buscarClienteMayorCategoria(Queue<Cliente> cola)
	{
		Iterator<Cliente> it = cola.iterator();
		Cliente actual;
		Cliente clienteMax = it.next();
		while (it.hasNext())
		{
			actual = it.next();
			if (actual.getCategoria() > clienteMax.getCategoria())
			{
				clienteMax = actual;
			}
		}
		return clienteMax;
	}

}
