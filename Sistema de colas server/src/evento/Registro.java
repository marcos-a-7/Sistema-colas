package evento;

import cliente.Cliente;

public class Registro extends Evento
{
	private Cliente cliente;

	public Registro(Cliente cliente)
	{
		super();
		this.cliente = cliente;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente()
	{
		return cliente;
	}

	@Override
	public String toString()
	{

		return "Registro " + super.toString() + cliente.toString() + " ";
	}

}
