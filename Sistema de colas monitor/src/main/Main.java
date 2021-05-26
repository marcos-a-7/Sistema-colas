package main;

import comunicacion.HeartbeatReciver;
import monitor.Monitor;

public class Main
{

	public static void main(String[] args)
	{
		new Thread(HeartbeatReciver.getInstance()).start();
		new Thread(Monitor.getInstance()).start();

	}

}
