package modelo;

import java.util.Queue;

import cliente.Cliente;

public class LlamadorFIFO implements LlamarStrategy
{

	@Override
	public Cliente llamarSiguiente(Queue<Cliente> cola)
	{
		Cliente cliente = cola.poll();
		return cliente;
	}

	@Override
	public void eliminarSiguiente(Queue<Cliente> cola)
	{
		cola.poll();

	}

}
