package cliente;

import java.io.Serializable;

public class Cliente implements Serializable
{
	private String dni;
	private String apellido;
	private String nombre;
	private int categoria;

	public Cliente(String dni, String apellido, String nombre, int categoria)
	{
		super();
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.categoria = categoria;
	}

	public Cliente(String dni)
	{
		this.dni = dni;
		this.apellido = "";
		this.nombre = "";
		this.categoria = 0;
	}

	/**
	 * @return the dni
	 */
	public String getDni()
	{
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni)
	{
		this.dni = dni;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido()
	{
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	/**
	 * @return the categoria
	 */
	public int getCategoria()
	{
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(int categoria)
	{
		this.categoria = categoria;
	}

	@Override
	public String toString()
	{
		return "dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", categoria=" + categoria;
	}

}
