package main;

import comunicacion.ReceptorNotificaciones;
import monitor.Heartbeat;

public class Main
{

	public static void main(String[] args)
	{
		new Thread(ReceptorNotificaciones.getInstance()).start();
		new Thread(Heartbeat.getInstance()).start();

	}

}
