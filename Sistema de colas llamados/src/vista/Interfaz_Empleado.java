package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.border.LineBorder;
import java.awt.Color;

public class Interfaz_Empleado extends JFrame
{

	private JFrame frame;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblDni;
	private JButton btnLlamar;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblCantidadDeClientes_1;

	/**
	 * Create the frame.
	 */
	public Interfaz_Empleado(int box)
	{
		this.frame = new JFrame("BOX " + box);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setBounds(100, 100, 800, 600);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		this.frame.setContentPane(this.contentPane);

		this.panel = new JPanel();
		this.contentPane.add(this.panel, BorderLayout.CENTER);
		this.panel.setLayout(new GridLayout(2, 1, 0, 0));

		this.panel_1 = new JPanel();
		this.panel.add(this.panel_1);

		this.lblDni = new JLabel("DNI:  ");
		this.lblDni.setFont(new Font("Arial Black", Font.PLAIN, 26));

		this.lblNewLabel = new JLabel("Datos del cliente");
		this.lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 26));
		GroupLayout gl_panel_1 = new GroupLayout(this.panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_panel_1.createSequentialGroup().addContainerGap(270, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup().addGap(10).addComponent(this.lblDni,
										GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
								.addComponent(this.lblNewLabel, GroupLayout.PREFERRED_SIZE, 253,
										GroupLayout.PREFERRED_SIZE))
						.addGap(251)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addGap(39)
						.addComponent(this.lblNewLabel, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(this.lblDni, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(72, Short.MAX_VALUE)));
		this.panel_1.setLayout(gl_panel_1);

		this.panel_2 = new JPanel();
		this.panel_2.setBackground(new Color(192, 192, 192));
		this.panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		this.panel.add(this.panel_2);

		this.btnLlamar = new JButton("Llamar al siguiente");
		this.btnLlamar.setActionCommand("LLAMAR");
		this.btnLlamar.setFont(new Font("Arial Black", Font.PLAIN, 26));

		this.lblCantidadDeClientes_1 = new JLabel("Cantidad de clientes en espera:  ");
		this.lblCantidadDeClientes_1.setFont(new Font("Arial Black", Font.PLAIN, 26));
		GroupLayout gl_panel_2 = new GroupLayout(this.panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2.createSequentialGroup().addGap(144).addComponent(
										this.lblCantidadDeClientes_1, GroupLayout.PREFERRED_SIZE, 510,
										GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_2.createSequentialGroup().addGap(195).addComponent(this.btnLlamar,
										GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(167, Short.MAX_VALUE)));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_2
				.createSequentialGroup().addGap(47)
				.addComponent(this.lblCantidadDeClientes_1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
				.addGap(35).addComponent(this.btnLlamar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(45, Short.MAX_VALUE)));
		this.panel_2.setLayout(gl_panel_2);
		this.frame.setVisible(true);
	}

	public void setActionListener(ActionListener actionListener)
	{
		this.btnLlamar.addActionListener(actionListener);
	}

	public void setDni(String dni)
	{
		this.lblDni.setText("DNI: " + dni);
	}

	public void setCantidadClientes(int cant)
	{
		this.lblCantidadDeClientes_1.setText("Cantidad de clientes en espera: " + cant);
	}

	/**
	 * imprimeMensaje<br>
	 * imprime un mensaje pasado por parametro en una ventana emergente<br>
	 * 
	 * @param mensaje : mensaje a imprimir
	 */
	public void imprimeMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(this, mensaje);
	}
}
