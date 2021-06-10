package persistencia;

import java.io.IOException;
import java.io.Serializable;

public abstract class Persistencia implements IPersistencia<Serializable>
{
	public void guardar(String rutaArchivo, Serializable objeto) throws IOException
	{
		abrirOutput(rutaArchivo);
		escribir(objeto);
		cerrarOutput();
	}

	public Serializable cargar(String rutaArchivo) throws IOException, ClassNotFoundException
	{
		abrirInput(rutaArchivo);
		Serializable objeto = leer();
		cerrarInput();
		return objeto;
	}
}
