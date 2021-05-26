package monitor;

import vista.Interfaz_Monitor;

public class Monitor implements Runnable
{
	private static Monitor instance = null;
	Interfaz_Monitor ventana;
	private boolean[] server1, server2, televisor, registro;

	private Monitor()
	{
		super();
		ventana = new Interfaz_Monitor();
		this.server1 = new boolean[2];
		this.server2 = new boolean[2];
		this.televisor = new boolean[2];
		this.registro = new boolean[2];
	}

	/**
	 * @return the server1
	 */
	public boolean isServer1()
	{
		return server1[0] || server1[1];
	}

	/**
	 * @param server1 the server1 to set
	 */
	public void setServer1(boolean server1)
	{
		this.server1[0] = server1;
		this.server1[1] = server1;
		this.ventana.actualizaServer1(server1);
	}

	/**
	 * @return the server2
	 */
	public boolean isServer2()
	{
		return server2[0] || server2[1];
	}

	/**
	 * @param server2 the server2 to set
	 */
	public void setServer2(boolean server2)
	{
		this.server2[0] = server2;
		this.server2[1] = server2;
		this.ventana.actualizaServer2(server2);
	}

	/**
	 * @return the televisor
	 */
	public boolean isTelevisor()
	{
		return televisor[0] || televisor[1];
	}

	/**
	 * @param televisor the televisor to set
	 */
	public void setTelevisor(boolean televisor)
	{
		this.televisor[0] = televisor;
		this.televisor[1] = televisor;
		this.ventana.actualizaTelevisor(televisor);
	}

	/**
	 * @return the registro
	 */
	public boolean isRegistro()
	{
		return registro[0] || registro[1];
	}

	/**
	 * @param registro the registro to set
	 */
	public void setRegistro(boolean registro)
	{
		this.registro[0] = registro;
		this.registro[1] = registro;
		this.ventana.actualizaRegistro(registro);
	}

	public static Monitor getInstance()
	{
		if (instance == null)
		{
			instance = new Monitor();
		}
		return instance;
	}

	public void actualizarEstados()
	{
		if (this.server1[0])
		{
			this.server1[0] = false;
		} else
		{
			this.server1[1] = false;
		}

		if (this.server2[0])
		{
			this.server2[0] = false;
		} else
		{
			this.server2[1] = false;
		}

		if (this.televisor[0])
		{
			this.televisor[0] = false;
		} else
		{
			this.televisor[1] = false;
		}

		if (this.registro[0])
		{
			this.registro[0] = false;
		} else
		{
			this.registro[1] = false;
		}

		actualizaVista();
	}

	private void actualizaVista()
	{
		ventana.actualizaServer1(this.isServer1());
		ventana.actualizaServer2(this.isServer2());
		ventana.actualizaTelevisor(this.isTelevisor());
		ventana.actualizaRegistro(this.isRegistro());
	}

	@Override
	public void run()
	{
		while (true)
		{
			try
			{
				Thread.sleep(5000);
				actualizarEstados();
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}

		}

	}

}
