package estado;

public class Principal implements IEstado
{

	@Override
	public boolean puedeAsignarTurno()
	{
		return true;
	}

	@Override
	public boolean puedeLlamarSiguiente()
	{
		return true;
	}

	@Override
	public boolean puedeEliminarSiguiente()
	{
		return false;
	}

	@Override
	public boolean puedeGetCantCola()
	{
		return true;
	}

}
