package modelo;

import java.util.Iterator;
import java.util.Queue;

import cliente.Cliente;

public class LlamadorDniDescendente implements LlamarStrategy
{

	@Override
	public Cliente llamarSiguiente(Queue<Cliente> cola)
	{
		Cliente cliente = this.buscarClienteMayorDni(cola);
		cola.remove(this.buscarClienteMayorDni(cola));
		return cliente;
	}

	@Override
	public void eliminarSiguiente(Queue<Cliente> cola)
	{
		cola.remove(this.buscarClienteMayorDni(cola));

	}

	private Cliente buscarClienteMayorDni(Queue<Cliente> cola)
	{
		Iterator<Cliente> it = cola.iterator();
		Cliente actual;
		Cliente clienteMax = it.next();
		while (it.hasNext())
		{
			actual = it.next();
			if (actual.getDni().compareTo(clienteMax.getDni()) > 0)
			{
				clienteMax = actual;
			}
		}
		return clienteMax;
	}

}
