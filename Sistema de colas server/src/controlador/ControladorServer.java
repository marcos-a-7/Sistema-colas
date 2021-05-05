package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import comunicacion.Notificador;
import comunicacion.ReceptorDniNuevo;
import comunicacion.ReceptorLlamadas;
import vista.Interfaz_Servidor;
import vista.Interfaz_ServidorCorriendo;

public class ControladorServer implements ActionListener
{
	Interfaz_Servidor ventanaCfg;
	Interfaz_ServidorCorriendo ventana = null;

	public ControladorServer()
	{
		super();
		this.ventanaCfg = new Interfaz_Servidor();
		this.ventanaCfg.setActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String comando = e.getActionCommand();

		switch (comando)
		{
		case "GUARDAR":
			guardarConfig();
			break;
		case "EJECUTAR":
			ejecutar();
			break;

		case "DETENER":
			detener();
			break;

		}

	}

	private void detener()
	{
		System.exit(0);
	}

	private void ejecutar()
	{
		BufferedReader reader = null;
		try
		{
			reader = new BufferedReader(new InputStreamReader(new FileInputStream("config.cfg"), "UTF-8"));
			String ipTele = reader.readLine();
			int puertoTele = Integer.parseInt(reader.readLine());
			int puertoBox = Integer.parseInt(reader.readLine());
			int puertoCliente = Integer.parseInt(reader.readLine());
			reader.close();

			Notificador.getInstance().setPort(puertoTele);
			Notificador.getInstance().setHost(ipTele);
			ReceptorLlamadas.getInstance().setPort(puertoBox);
			ReceptorDniNuevo.getInstance().setPort(puertoCliente);

			Thread receptorLlamadas = new Thread(ReceptorLlamadas.getInstance());
			Thread receptorDni = new Thread(ReceptorDniNuevo.getInstance());
			receptorLlamadas.start();
			receptorDni.start();

			this.ventanaCfg.ocultarVentana();
			this.ventana = new Interfaz_ServidorCorriendo();
			this.ventana.setActionListener(this);

		} catch (UnsupportedEncodingException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void guardarConfig()
	{
		BufferedWriter writer = null;
		try
		{
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("config.cfg"), "UTF-8"));
			writer.write(ventanaCfg.getTextField_IPTele() + "\n");
			writer.write(Integer.toString(ventanaCfg.getTextField_PuertoTele()) + "\n");
			writer.write(Integer.toString(ventanaCfg.getTextField_PuertoBox()) + "\n");
			writer.write(Integer.toString(ventanaCfg.getTextField_PuertoCliente()));

			writer.close();
			this.ventanaCfg.imprimeMensaje("La configuracion se guardo correctamente");
		} catch (UnsupportedEncodingException | FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
