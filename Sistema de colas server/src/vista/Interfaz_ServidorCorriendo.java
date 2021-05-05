package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;

public class Interfaz_ServidorCorriendo extends JFrame {

	private JPanel contentPane;
	private JLabel lbl_ServerRun;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_ServidorCorriendo frame = new Interfaz_ServidorCorriendo();
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
	public Interfaz_ServidorCorriendo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 185);
		this.contentPane = new JPanel();
		this.contentPane.setBackground(Color.LIGHT_GRAY);
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		
		this.lbl_ServerRun = new JLabel("El Servidor esta corriendo, no cerrar esta ventana");
		this.lbl_ServerRun.setForeground(new Color(128, 0, 0));
		
		this.btnNewButton = new JButton("Detener");
		this.btnNewButton.setBackground(SystemColor.activeCaption);
		GroupLayout gl_contentPane = new GroupLayout(this.contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(169)
							.addComponent(this.btnNewButton))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(78)
							.addComponent(this.lbl_ServerRun)))
					.addContainerGap(105, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addComponent(this.lbl_ServerRun)
					.addGap(18)
					.addComponent(this.btnNewButton)
					.addContainerGap(51, Short.MAX_VALUE))
		);
		this.contentPane.setLayout(gl_contentPane);
	}

}
