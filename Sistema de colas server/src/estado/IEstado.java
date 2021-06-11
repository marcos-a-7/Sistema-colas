package estado;

public interface IEstado
{
	public boolean puedeAsignarTurno();

	public boolean puedeLlamarSiguiente();

	public boolean puedeEliminarSiguiente();

	public boolean puedeGetCantCola();

}
