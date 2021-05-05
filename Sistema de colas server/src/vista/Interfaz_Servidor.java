package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Interfaz_Servidor extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_Servidor frame = new Interfaz_Servidor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz_Servidor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 308);
		this.contentPane = new JPanel();
		this.contentPane.setBackground(Color.LIGHT_GRAY);
		this.contentPane.setForeground(Color.WHITE);
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
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
		GroupLayout gl_panel = new GroupLayout(this.panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(34)
					.addComponent(this.label)
					.addGap(18)
					.addComponent(this.lbl_IP)
					.addGap(127))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(44, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addComponent(this.lblPuertoDeAplicacion)
							.addComponent(this.lblNewLabel))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 1, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(this.lblNewLabel_2)
								.addComponent(this.lblNewLabel_1))))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(12)
							.addComponent(this.label))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(this.lbl_IP)))
					.addGap(52)
					.addComponent(this.lblNewLabel)
					.addGap(18)
					.addComponent(this.lblPuertoDeAplicacion)
					.addGap(24)
					.addComponent(this.lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(this.lblNewLabel_2)
					.addGap(73))
		);
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
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(this.textField_PuertoTele, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.textField_IPTele, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.textField_PuertoBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.textField_PuertoCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(123, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(79)
					.addComponent(this.textField_PuertoCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(this.textField_PuertoBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addComponent(this.textField_PuertoTele, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(this.textField_IPTele, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(59, Short.MAX_VALUE))
		);
		this.panel_1.setLayout(gl_panel_1);
	}
}
