package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import comunicacion.EmisorLLamados;
import comunicacion.Mensaje;
import vista.Interfaz_Empleado;

public class ControladorEmpleado implements ActionListener
{
	private Interfaz_Empleado ventana;
	private int box;
	private EmisorLLamados llamador;

	public ControladorEmpleado(int box)
	{
		super();
		this.box = box;
		this.ventana = new Interfaz_Empleado(box);
		this.ventana.setActionListener(this);
		llamador = EmisorLLamados.getInstance();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String comando = e.getActionCommand();

		if (comando.equals("LLAMAR"))
		{
			this.llamarNuevo();
		}
	}

	private void llamarNuevo()
	{
		Mensaje mensaje = llamador.enviarLlamado(this.box);

		if (mensaje.getDni().isEmpty())
		{
			this.ventana.imprimeMensaje("No hay personas en la cola de espera, llame nuevamente mas tarde");
			this.ventana.setCantidadClientes(mensaje.getCantCola());
		} else
		{
			this.ventana.setDni(mensaje.getDni());
			this.ventana.setCantidadClientes(mensaje.getCantCola());
		}
	}

}
