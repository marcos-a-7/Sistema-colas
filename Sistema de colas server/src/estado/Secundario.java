package estado;


public class Secundario implements IEstado
{

	@Override
	public boolean puedeAsignarTurno()
	{
		return false;
	}

	@Override
	public boolean puedeLlamarSiguiente()
	{
		return false;
	}

	@Override
	public boolean puedeEliminarSiguiente()
	{
		return true;
	}

	@Override
	public boolean puedeGetCantCola()
	{
		return false;
	}


}
