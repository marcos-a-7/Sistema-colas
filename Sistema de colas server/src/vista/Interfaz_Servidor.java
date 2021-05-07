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
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;

public class Interfaz_Servidor extends JFrame
{

	private JFrame frame;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lbl_IP;
	private JLabel label;
	private JPanel panel_1;
	private JButton btn_Ejecutar;

	/**
	 * Create the frame.
	 */
	public Interfaz_Servidor()
	{
		this.frame = new JFrame("Server");
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setBounds(100, 100, 423, 217);
		this.contentPane = new JPanel();
		this.contentPane.setBackground(Color.LIGHT_GRAY);
		this.contentPane.setForeground(Color.WHITE);
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.frame.setContentPane(this.contentPane);
		this.contentPane.setLayout(new GridLayout(2, 1, 0, 0));
		
				this.panel = new JPanel();
				this.contentPane.add(this.panel);
				this.panel.setBackground(Color.LIGHT_GRAY);
				
						this.lbl_IP = new JLabel("IP:");
						
								this.label = new JLabel("");
										GroupLayout gl_panel = new GroupLayout(this.panel);
										gl_panel.setHorizontalGroup(
											gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup()
													.addContainerGap(411, Short.MAX_VALUE)
													.addComponent(this.label)
													.addContainerGap())
												.addGroup(gl_panel.createSequentialGroup()
													.addGap(107)
													.addComponent(this.lbl_IP)
													.addContainerGap(300, Short.MAX_VALUE))
										);
										gl_panel.setVerticalGroup(
											gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup()
													.addGap(12)
													.addComponent(this.label)
													.addGap(26)
													.addComponent(this.lbl_IP)
													.addGap(130))
										);
										this.panel.setLayout(gl_panel);
		
		this.panel_1 = new JPanel();
		this.panel_1.setBackground(Color.LIGHT_GRAY);
		this.contentPane.add(this.panel_1);
		
		this.btn_Ejecutar = new JButton("Ejecutar");
		this.btn_Ejecutar.setActionCommand("EJECUTAR");
		GroupLayout gl_panel_1 = new GroupLayout(this.panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addGap(165)
					.addComponent(this.btn_Ejecutar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(159))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addGap(34)
					.addComponent(this.btn_Ejecutar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(27))
		);
		this.panel_1.setLayout(gl_panel_1);
		this.frame.setVisible(true);
	}

	public void setLbl_IP(String IP)
	{
		this.lbl_IP.setText(IP);
	}


	public void setActionListener(ActionListener actionListener)
	{
		this.btn_Ejecutar.addActionListener(actionListener);
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
