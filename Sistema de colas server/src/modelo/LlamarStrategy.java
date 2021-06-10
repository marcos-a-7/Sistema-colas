package modelo;

import java.util.Queue;

import cliente.Cliente;

public interface LlamarStrategy
{
	public Cliente llamarSiguiente(Queue<Cliente> cola);

	public void eliminarSiguiente(Queue<Cliente> cola);
}
