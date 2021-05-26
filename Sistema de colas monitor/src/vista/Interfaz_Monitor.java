package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Font;

public class Interfaz_Monitor extends JFrame
{

	private JFrame frame;
	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lbl_Server1;
	private JPanel panel_2;
	private JLabel lblNewLabel_3;
	private JLabel lbl_Server2;
	private JPanel panel_3;
	private JLabel lblNewLabel_4;
	private JLabel lbl_Televisor;
	private JPanel panel_4;
	private JLabel lblNewLabel_5;
	private JLabel lbl_Registradora;

	/**
	 * Create the frame.
	 */
	public Interfaz_Monitor()
	{
		this.frame = new JFrame("Monitor de estados");
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setBounds(100, 100, 362, 230);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.frame.setContentPane(this.contentPane);
		this.contentPane.setLayout(new GridLayout(5, 0, 0, 0));

		this.panel = new JPanel();
		this.contentPane.add(this.panel);

		this.lblNewLabel = new JLabel("Estado");

		this.lblNewLabel_1 = new JLabel("Aplicaci\u00F3n");
		GroupLayout gl_panel = new GroupLayout(this.panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_panel.createSequentialGroup().addGap(80).addComponent(this.lblNewLabel_1)
						.addPreferredGap(ComponentPlacement.RELATED, 90, Short.MAX_VALUE).addComponent(this.lblNewLabel)
						.addGap(87)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(this.lblNewLabel)
								.addComponent(this.lblNewLabel_1))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		this.panel.setLayout(gl_panel);

		this.panel_1 = new JPanel();
		this.panel_1.setBorder(new LineBorder(SystemColor.activeCaption, 1, true));
		this.contentPane.add(this.panel_1);

		this.lblNewLabel_2 = new JLabel("Servidor 1");
		this.lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));

		this.lbl_Server1 = new JLabel("Conectado");
		this.lbl_Server1.setFont(new Font("Tahoma", Font.BOLD, 11));
		this.lbl_Server1.setForeground(Color.GREEN);
		GroupLayout gl_panel_1 = new GroupLayout(this.panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addGap(80).addComponent(this.lblNewLabel_2)
						.addPreferredGap(ComponentPlacement.RELATED, 81, Short.MAX_VALUE).addComponent(this.lbl_Server1)
						.addGap(80)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(this.lblNewLabel_2)
								.addComponent(this.lbl_Server1))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		this.panel_1.setLayout(gl_panel_1);

		this.panel_2 = new JPanel();
		this.panel_2.setBorder(new LineBorder(SystemColor.activeCaption, 1, true));
		this.contentPane.add(this.panel_2);

		this.lblNewLabel_3 = new JLabel("Servidor 2");
		this.lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));

		this.lbl_Server2 = new JLabel("Desconectado");
		this.lbl_Server2.setFont(new Font("Tahoma", Font.BOLD, 11));
		this.lbl_Server2.setForeground(Color.RED);
		GroupLayout gl_panel_2 = new GroupLayout(this.panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGap(0, 336, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup().addGap(80).addComponent(this.lblNewLabel_3)
						.addPreferredGap(ComponentPlacement.RELATED, 81, Short.MAX_VALUE).addComponent(this.lbl_Server2)
						.addGap(80)));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGap(0, 36, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE).addComponent(this.lblNewLabel_3)
								.addComponent(this.lbl_Server2))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		this.panel_2.setLayout(gl_panel_2);

		this.panel_3 = new JPanel();
		this.panel_3.setBorder(new LineBorder(SystemColor.activeCaption, 1, true));
		this.contentPane.add(this.panel_3);

		this.lblNewLabel_4 = new JLabel("Televisor");
		this.lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));

		this.lbl_Televisor = new JLabel("New label");
		this.lbl_Televisor.setFont(new Font("Tahoma", Font.BOLD, 11));
		GroupLayout gl_panel_3 = new GroupLayout(this.panel_3);
		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING).addGap(0, 336, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup().addGap(80).addComponent(this.lblNewLabel_4)
						.addPreferredGap(ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
						.addComponent(this.lbl_Televisor).addGap(80)));
		gl_panel_3.setVerticalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING).addGap(0, 36, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE).addComponent(this.lblNewLabel_4)
								.addComponent(this.lbl_Televisor))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		this.panel_3.setLayout(gl_panel_3);

		this.panel_4 = new JPanel();
		this.panel_4.setBorder(new LineBorder(SystemColor.activeCaption, 1, true));
		this.contentPane.add(this.panel_4);

		this.lblNewLabel_5 = new JLabel("Registradora");
		this.lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));

		this.lbl_Registradora = new JLabel("New label");
		this.lbl_Registradora.setFont(new Font("Tahoma", Font.BOLD, 11));
		GroupLayout gl_panel_4 = new GroupLayout(this.panel_4);
		gl_panel_4.setHorizontalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING).addGap(0, 336, Short.MAX_VALUE)
				.addGroup(gl_panel_4.createSequentialGroup().addGap(80).addComponent(this.lblNewLabel_5)
						.addPreferredGap(ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
						.addComponent(this.lbl_Registradora).addGap(80)));
		gl_panel_4.setVerticalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING).addGap(0, 36, Short.MAX_VALUE)
				.addGroup(gl_panel_4.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE).addComponent(this.lblNewLabel_5)
								.addComponent(this.lbl_Registradora))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		this.panel_4.setLayout(gl_panel_4);

		this.actualizaServer1(false);
		this.actualizaServer2(false);
		this.actualizaTelevisor(false);
		this.actualizaRegistro(false);
		this.frame.setVisible(true);
	}

	public void actualizaServer1(boolean status)
	{

		if (status)
		{
			this.lbl_Server1.setText("Conectado");
			this.lbl_Server1.setForeground(Color.GREEN);
		} else
		{
			this.lbl_Server1.setText("Desconectado");
			this.lbl_Server1.setForeground(Color.RED);
		}

	}

	public void actualizaServer2(boolean status)
	{
		if (status)
		{
			this.lbl_Server2.setText("Conectado");
			this.lbl_Server2.setForeground(Color.GREEN);
		} else
		{
			this.lbl_Server2.setText("Desconectado");
			this.lbl_Server2.setForeground(Color.RED);
		}
	}

	public void actualizaTelevisor(boolean status)
	{
		if (status)
		{
			this.lbl_Televisor.setText("Conectado");
			this.lbl_Televisor.setForeground(Color.GREEN);
		} else
		{
			this.lbl_Televisor.setText("Desconectado");
			this.lbl_Televisor.setForeground(Color.RED);
		}
	}

	public void actualizaRegistro(boolean status)
	{
		if (status)
		{
			this.lbl_Registradora.setText("Conectado");
			this.lbl_Registradora.setForeground(Color.GREEN);
		} else
		{
			this.lbl_Registradora.setText("Desconectado");
			this.lbl_Registradora.setForeground(Color.RED);
		}
	}

}
