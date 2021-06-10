package comunicacion;

import cliente.Cliente;

public class Mensaje
{
	private Cliente cliente;
	private int cantCola;

	public Mensaje(Cliente cliente, int cantCola)
	{
		super();
		this.cliente = cliente;
		this.cantCola = cantCola;
	}

	/**
	 * @return the dni
	 */
	public Cliente getCliente()
	{
		return this.cliente;
	}

	/**
	 * @return the cantCola
	 */
	public int getCantCola()
	{
		return this.cantCola;
	}

}
