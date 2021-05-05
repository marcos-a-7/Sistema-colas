package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Interfaz_Servidor extends JFrame
{

	private JFrame frame;
	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lbl_IP;
	private JLabel label;
	private JLabel lblNewLabel;
	private JLabel lblPuertoDeAplicacion;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_PuertoCliente;
	private JTextField textField_IPTele;
	private JTextField textField_PuertoBox;
	private JTextField textField_PuertoTele;
	private JButton btn_Guardar;
	private JButton btn_Ejecutar;

	/**
	 * Create the frame.
	 */
	public Interfaz_Servidor()
	{
		this.frame = new JFrame("Server");
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setBounds(100, 100, 447, 308);
		this.contentPane = new JPanel();
		this.contentPane.setBackground(Color.LIGHT_GRAY);
		this.contentPane.setForeground(Color.WHITE);
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.frame.setContentPane(this.contentPane);
		this.contentPane.setLayout(new GridLayout(0, 2, 0, 0));

		this.panel = new JPanel();
		this.panel.setBackground(Color.LIGHT_GRAY);
		this.contentPane.add(this.panel);

		this.lbl_IP = new JLabel("IP:");

		this.label = new JLabel("");

		this.lblNewLabel = new JLabel("Puerto de aplicacion del cliente: ");

		this.lblPuertoDeAplicacion = new JLabel("Puerto de aplicacion del box: ");

		this.lblNewLabel_1 = new JLabel("Puerto de aplicacion del televisor: ");

		this.lblNewLabel_2 = new JLabel("IP de aplicacion del televisor: ");

		this.btn_Guardar = new JButton("Guardar");
		this.btn_Guardar.setActionCommand("GUARDAR");

		this.btn_Ejecutar = new JButton("Ejecutar");
		this.btn_Ejecutar.setActionCommand("EJECUTAR");
		GroupLayout gl_panel = new GroupLayout(this.panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap(36, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup().addComponent(this.label).addGap(18)
								.addComponent(this.lbl_IP))
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(this.lblPuertoDeAplicacion).addComponent(this.lblNewLabel))
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(this.lblNewLabel_2).addComponent(this.lblNewLabel_1)
										.addGroup(gl_panel.createSequentialGroup().addComponent(this.btn_Guardar)
												.addGap(18).addComponent(this.btn_Ejecutar, GroupLayout.PREFERRED_SIZE,
														81, GroupLayout.PREFERRED_SIZE)))))
				.addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup().addGap(12).addComponent(this.label))
								.addGroup(gl_panel.createSequentialGroup().addContainerGap().addComponent(this.lbl_IP)))
						.addGap(52).addComponent(this.lblNewLabel).addGap(18).addComponent(this.lblPuertoDeAplicacion)
						.addGap(24).addComponent(this.lblNewLabel_1).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(this.lblNewLabel_2).addGap(26)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(this.btn_Guardar)
								.addComponent(this.btn_Ejecutar))
						.addGap(24)));
		this.panel.setLayout(gl_panel);

		this.panel_1 = new JPanel();
		this.panel_1.setBackground(Color.LIGHT_GRAY);
		this.contentPane.add(this.panel_1);

		this.textField_PuertoCliente = new JTextField();
		this.textField_PuertoCliente.setColumns(10);

		this.textField_IPTele = new JTextField();
		this.textField_IPTele.setColumns(10);

		this.textField_PuertoBox = new JTextField();
		this.textField_PuertoBox.setColumns(10);

		this.textField_PuertoTele = new JTextField();
		this.textField_PuertoTele.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(this.panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(this.textField_PuertoTele, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(this.textField_IPTele, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(this.textField_PuertoBox, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(this.textField_PuertoCliente, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		gl_panel_1
				.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup().addGap(79)
								.addComponent(this.textField_PuertoCliente, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(this.textField_PuertoBox, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(19)
								.addComponent(this.textField_PuertoTele, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(this.textField_IPTele, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(59, Short.MAX_VALUE)));
		this.panel_1.setLayout(gl_panel_1);
		this.frame.setVisible(true);
	}

	public void setLbl_IP(int IP)
	{
		this.lbl_IP.setText(Integer.toString(IP));
	}

	public int getTextField_PuertoCliente()
	{
		return Integer.parseInt(textField_PuertoCliente.getText());
	}

	public void setTextField_PuertoCliente(int PuertoCliente)
	{
		this.textField_PuertoCliente.setText(Integer.toString(PuertoCliente));
	}

	public String getTextField_IPTele()
	{
		return textField_IPTele.getText();
	}

	public void setTextField_IPTele(int IPTele)
	{
		this.textField_IPTele.setText(Integer.toString(IPTele));
		;
	}

	public int getTextField_PuertoBox()
	{
		return Integer.parseInt(textField_PuertoBox.getText());
	}

	public void setTextField_PuertoBox(int PuertoBox)
	{
		this.textField_PuertoBox.setText(Integer.toString(PuertoBox));
	}

	public int getTextField_PuertoTele()
	{
		return Integer.parseInt(textField_PuertoTele.getText());
	}

	public void setTextField_PuertoTele(int PuertoTele)
	{
		this.textField_PuertoTele.setText(Integer.toString(PuertoTele));
	}

	public void setActionListener(ActionListener actionListener)
	{
		this.btn_Ejecutar.addActionListener(actionListener);
		this.btn_Guardar.addActionListener(actionListener);
	}

	public void ocultarVentana()
	{
		this.frame.setVisible(false);
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
