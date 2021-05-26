package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;

import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;

import comunicacion.Notificador;
import comunicacion.ReceptorDniNuevo;
import comunicacion.ReceptorLlamadas;
import comunicacion.Resincronizador;
import monitor.Heartbeat;
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
		String localIpAddress;
		try
		{
			localIpAddress = InetAddress.getLocalHost().getHostAddress();
			this.ventanaCfg.setLbl_IP("IP: " + localIpAddress);
		} catch (UnknownHostException e)
		{
			e.printStackTrace();
		}

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String comando = e.getActionCommand();

		switch (comando)
		{
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
		Properties properties = new Properties();
		try
		{
			properties.load(new FileInputStream(new File("config.cfg")));
			String ipTele = properties.getProperty("ipTele", "127.0.0.1");
			int puertoTele = Integer.parseInt(properties.getProperty("portTele", "8000"));
			int puertoBox = Integer.parseInt(properties.getProperty("portEmpleado", "9000"));
			int puertoCliente = Integer.parseInt(properties.getProperty("portCliente", "10000"));

			Notificador.getInstance().setPort(puertoTele);
			Notificador.getInstance().setHost(ipTele);
			ReceptorLlamadas.getInstance().setPort(puertoBox);
			ReceptorDniNuevo.getInstance().setPort(puertoCliente);

			Thread receptorLlamadas = new Thread(ReceptorLlamadas.getInstance());
			Thread receptorDni = new Thread(ReceptorDniNuevo.getInstance());
			Thread resincronizador = new Thread(Resincronizador.getInstance());

			Resincronizador.getInstance().sincronizar();

			resincronizador.start();
			receptorLlamadas.start();
			receptorDni.start();

			this.ventanaCfg.ocultarVentana();
			this.ventana = new Interfaz_ServidorCorriendo();
			this.ventana.setActionListener(this);
			new Thread(Heartbeat.getInstance()).start();

		} catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
