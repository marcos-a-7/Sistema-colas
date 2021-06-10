package modelo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

import cliente.Cliente;

public class Repositorio
{
	private String repositorio;

	public Repositorio(String direccionRepositorio)
	{
		super();
		this.repositorio = direccionRepositorio;
	}

	@SuppressWarnings("unchecked")
	public Cliente traerCliente(String dni)
	{
		Cliente cliente = null;
		HashMap<String, Cliente> clientes = new HashMap<String, Cliente>();
		ObjectInputStream ois = null;
		try
		{
			ois = new ObjectInputStream(new FileInputStream(this.repositorio));
			clientes = (HashMap<String, Cliente>) ois.readObject();
			cliente = clientes.get(dni);
		} catch (IOException e)
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		if (ois != null)
		{
			try
			{
				ois.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		if (cliente == null)
		{
			cliente = new Cliente(dni);
		}
		return cliente;
	}
}
