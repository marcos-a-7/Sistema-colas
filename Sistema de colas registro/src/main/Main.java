package main;

import controlador.ControladorRegistro;
import monitor.Heartbeat;

public class Main
{

	public static void main(String[] args)
	{
		new ControladorRegistro();
		new Thread(Heartbeat.getInstance()).start();
	}

}
