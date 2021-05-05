package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import comunicacion.EmisorDni;
import vista.Vista_registro;

public class ControladorRegistro implements ActionListener
{
	Vista_registro ventana;
	EmisorDni comunicador;

	public ControladorRegistro()
	{
		super();
		this.ventana = new Vista_registro();
		this.ventana.setActionListener(this);
		this.comunicador = EmisorDni.getInstance();
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		String comando = arg0.getActionCommand();

		switch (comando)
		{
		case "1":
			this.ventana.addNumDni(1);
			break;
		case "2":
			this.ventana.addNumDni(2);
			break;
		case "3":
			this.ventana.addNumDni(3);
			break;
		case "4":
			this.ventana.addNumDni(4);
			break;
		case "5":
			this.ventana.addNumDni(5);
			break;
		case "6":
			this.ventana.addNumDni(6);
			break;
		case "7":
			this.ventana.addNumDni(7);
			break;
		case "8":
			this.ventana.addNumDni(8);
			break;
		case "9":
			this.ventana.addNumDni(9);
			break;
		case "0":
			this.ventana.addNumDni(0);
			break;
		case "BORRAR":
			this.ventana.borrarNumDni();
			break;
		case "VACIAR":
			this.ventana.vaciarNumDni();
			break;
		case "CONFIRMAR":
			String dni = this.ventana.getDni();
			this.crearCliente(dni);
			break;

		}

	}

	private void crearCliente(String dni)
	{
		if (dni.isEmpty())
		{
			this.ventana.imprimeMensaje("Debe Ingresar un DNI");
		} else
		{
			boolean check = this.comunicador.enviarCliente(dni);
			this.ventana.vaciarNumDni();
			if (check)
			{
				this.ventana.imprimeMensaje("Turno solicitado correctamente, espere a ser llamado por el televisor");
			} else
			{
				this.ventana.imprimeMensaje("No se pudo asignar el turno, intente nuevamente");
			}
		}

	}

}
