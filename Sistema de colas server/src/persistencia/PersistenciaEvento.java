package persistencia;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class PersistenciaEvento extends Persistencia
{
	private FileWriter fw;

	@Override
	public void abrirInput(String nombre) throws IOException
	{

	}

	@Override
	public void abrirOutput(String nombre) throws IOException
	{
		this.fw = new FileWriter(nombre, true);

	}

	@Override
	public void cerrarOutput() throws IOException
	{
		if (fw != null)
			fw.close();

	}

	@Override
	public void cerrarInput() throws IOException
	{

	}

	@Override
	public void escribir(Serializable objeto) throws IOException
	{
		if (fw != null)
			fw.write(objeto.toString() + "\n");
	}

	@Override
	public Serializable leer() throws IOException, ClassNotFoundException
	{
		return null;
	}

}
