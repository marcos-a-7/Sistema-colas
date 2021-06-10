package evento;

import cliente.Cliente;

public class Llamado extends Evento
{
	private Cliente cliente;
	private int box;

	public Llamado(Cliente cliente, int box)
	{
		super();
		this.cliente = cliente;
		this.box = box;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente()
	{
		return cliente;
	}

	/**
	 * @return the box
	 */
	public int getBox()
	{
		return box;
	}

	@Override
	public String toString()
	{

		return "Llamado " + super.toString() + cliente.toString() + " Nro. de box=" + box + " ";
	}

}
