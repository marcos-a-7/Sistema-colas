package comunicacion;

public class Mensaje
{
	private String dni;
	private int cantCola;

	public Mensaje(String dni, int cantCola)
	{
		super();
		this.dni = dni;
		this.cantCola = cantCola;
	}

	/**
	 * @return the dni
	 */
	public String getDni()
	{
		return dni;
	}

	/**
	 * @return the cantCola
	 */
	public int getCantCola()
	{
		return cantCola;
	}

}
