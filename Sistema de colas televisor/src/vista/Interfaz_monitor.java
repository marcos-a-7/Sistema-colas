package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.event.ActionListener;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.JOptionPane;

public class Interfaz_monitor extends JFrame
{

	private JFrame frame;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblDniTurno1;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblBoxTurno1;
	private JPanel panel_3;
	private JLabel lblDniTurno2;
	private JLabel lblBoxTurno2;
	private JPanel panel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_19;
	private JPanel panel_5;
	private JLabel lblDniTurno3;
	private JLabel lblBoxTurno3;
	private JPanel panel_6;
	private JLabel lblDniTurno4;
	private JLabel lblBoxTurno4;
	private JPanel panel_7;
	private JLabel lblDniTurno5;
	private JLabel lblBoxTurno5;
	private JPanel panel_8;
	private JLabel lblDniTurno6;
	private JLabel lblBoxTurno6;
	private JPanel panel_9;
	private JLabel lblDniTurno7;
	private JLabel lblBoxTurno7;
	private JPanel panel_10;
	private JLabel lblDniTurno8;
	private JLabel lblBoxTurno8;

	/**
	 * Create the frame.
	 */
	public Interfaz_monitor()
	{
		this.frame = new JFrame("Televisor");
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setBounds(100, 100, 1024, 768);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.frame.setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));

		this.panel = new JPanel();
		this.contentPane.add(this.panel, BorderLayout.CENTER);
		this.panel.setLayout(new GridLayout(0, 2, 0, 0));

		this.panel_1 = new JPanel();
		this.panel_1.setBackground(new Color(72, 61, 139));
		this.panel.add(this.panel_1);

		this.lblNewLabel = new JLabel("Nuevo Turno");
		this.lblNewLabel.setForeground(new Color(255, 255, 255));
		this.lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 60));

		this.lblDniTurno1 = new JLabel("123456587");
		this.lblDniTurno1.setForeground(new Color(255, 255, 255));
		this.lblDniTurno1.setFont(new Font("Arial Black", Font.PLAIN, 60));

		this.lblBoxTurno1 = new JLabel("BOX  3");
		this.lblBoxTurno1.setForeground(Color.WHITE);
		this.lblBoxTurno1.setFont(new Font("Arial Black", Font.PLAIN, 80));
		GroupLayout gl_panel_1 = new GroupLayout(this.panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup().addGap(49).addComponent(this.lblNewLabel))
								.addGroup(gl_panel_1.createSequentialGroup().addGap(77)
										.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
												.addComponent(this.lblBoxTurno1, GroupLayout.PREFERRED_SIZE, 360,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(this.lblDniTurno1))))
						.addContainerGap(33, Short.MAX_VALUE)));
		gl_panel_1
				.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup().addGap(49).addComponent(this.lblNewLabel)
								.addGap(151).addComponent(this.lblDniTurno1).addGap(128).addComponent(this.lblBoxTurno1,
										GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(136, Short.MAX_VALUE)));
		this.panel_1.setLayout(gl_panel_1);

		this.panel_2 = new JPanel();
		this.panel_2.setBackground(new Color(192, 192, 192));
		this.panel.add(this.panel_2);
		this.panel_2.setLayout(new GridLayout(8, 0, 0, 0));

		this.panel_4 = new JPanel();
		this.panel_4.setBorder(null);
		this.panel_4.setBackground(Color.LIGHT_GRAY);
		this.panel_2.add(this.panel_4);

		this.lblNewLabel_5 = new JLabel("DNI");
		this.lblNewLabel_5.setFont(new Font("Arial Black", Font.PLAIN, 30));

		this.lblNewLabel_6 = new JLabel("BOX");
		this.lblNewLabel_6.setFont(new Font("Arial Black", Font.PLAIN, 30));

		this.lblNewLabel_19 = new JLabel("Turnos anteriores");
		this.lblNewLabel_19.setFont(new Font("Arial Black", Font.PLAIN, 30));
		GroupLayout gl_panel_4 = new GroupLayout(this.panel_4);
		gl_panel_4.setHorizontalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_panel_4.createSequentialGroup().addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								gl_panel_4.createSequentialGroup().addContainerGap().addComponent(this.lblNewLabel_19))
						.addGroup(gl_panel_4.createSequentialGroup().addGap(133).addComponent(this.lblNewLabel_5)
								.addPreferredGap(ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
								.addComponent(this.lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 84,
										GroupLayout.PREFERRED_SIZE)))
						.addGap(97)));
		gl_panel_4.setVerticalGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel_4
				.createSequentialGroup()
				.addComponent(this.lblNewLabel_19, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE).addComponent(this.lblNewLabel_5)
						.addComponent(this.lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
				.addContainerGap()));
		this.panel_4.setLayout(gl_panel_4);

		this.panel_3 = new JPanel();
		this.panel_3.setBorder(new LineBorder(new Color(255, 255, 255), 4, true));
		this.panel_3.setBackground(new Color(192, 192, 192));
		this.panel_2.add(this.panel_3);

		this.lblDniTurno2 = new JLabel("36235144");
		this.lblDniTurno2.setFont(new Font("Arial Black", Font.PLAIN, 30));

		this.lblBoxTurno2 = new JLabel("2");
		this.lblBoxTurno2.setFont(new Font("Arial Black", Font.PLAIN, 30));
		GroupLayout gl_panel_3 = new GroupLayout(this.panel_3);
		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup().addGap(78).addComponent(this.lblDniTurno2)
						.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
						.addComponent(this.lblBoxTurno2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addGap(29)));
		gl_panel_3.setVerticalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup().addGap(22)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
								.addComponent(this.lblBoxTurno2, GroupLayout.PREFERRED_SIZE, 43,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(this.lblDniTurno2))
						.addContainerGap(16, Short.MAX_VALUE)));
		this.panel_3.setLayout(gl_panel_3);

		this.panel_5 = new JPanel();
		this.panel_5.setBorder(new LineBorder(new Color(255, 255, 255), 4, true));
		this.panel_5.setBackground(Color.LIGHT_GRAY);
		this.panel_2.add(this.panel_5);

		this.lblDniTurno3 = new JLabel("36235144");
		this.lblDniTurno3.setFont(new Font("Arial Black", Font.PLAIN, 30));

		this.lblBoxTurno3 = new JLabel("4");
		this.lblBoxTurno3.setFont(new Font("Arial Black", Font.PLAIN, 30));
		GroupLayout gl_panel_5 = new GroupLayout(this.panel_5);
		gl_panel_5.setHorizontalGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING).addGap(0, 499, Short.MAX_VALUE)
				.addGroup(gl_panel_5.createSequentialGroup().addGap(78).addComponent(this.lblDniTurno3)
						.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
						.addComponent(this.lblBoxTurno3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addGap(29)));
		gl_panel_5.setVerticalGroup(gl_panel_5.createParallelGroup(Alignment.LEADING).addGap(0, 89, Short.MAX_VALUE)
				.addGroup(gl_panel_5.createSequentialGroup().addGap(22)
						.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(this.lblBoxTurno3, GroupLayout.PREFERRED_SIZE, 43,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(this.lblDniTurno3))
						.addContainerGap(16, Short.MAX_VALUE)));
		this.panel_5.setLayout(gl_panel_5);

		this.panel_6 = new JPanel();
		this.panel_6.setBorder(new LineBorder(new Color(255, 255, 255), 4, true));
		this.panel_6.setBackground(Color.LIGHT_GRAY);
		this.panel_2.add(this.panel_6);

		this.lblDniTurno4 = new JLabel("36235144");
		this.lblDniTurno4.setFont(new Font("Arial Black", Font.PLAIN, 30));

		this.lblBoxTurno4 = new JLabel("5");
		this.lblBoxTurno4.setFont(new Font("Arial Black", Font.PLAIN, 30));
		GroupLayout gl_panel_6 = new GroupLayout(this.panel_6);
		gl_panel_6.setHorizontalGroup(gl_panel_6.createParallelGroup(Alignment.TRAILING).addGap(0, 499, Short.MAX_VALUE)
				.addGroup(gl_panel_6.createSequentialGroup().addGap(78).addComponent(this.lblDniTurno4)
						.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
						.addComponent(this.lblBoxTurno4, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addGap(29)));
		gl_panel_6.setVerticalGroup(gl_panel_6.createParallelGroup(Alignment.LEADING).addGap(0, 89, Short.MAX_VALUE)
				.addGroup(gl_panel_6.createSequentialGroup().addGap(22)
						.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
								.addComponent(this.lblBoxTurno4, GroupLayout.PREFERRED_SIZE, 43,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(this.lblDniTurno4))
						.addContainerGap(16, Short.MAX_VALUE)));
		this.panel_6.setLayout(gl_panel_6);

		this.panel_7 = new JPanel();
		this.panel_7.setBorder(new LineBorder(new Color(255, 255, 255), 4, true));
		this.panel_7.setBackground(Color.LIGHT_GRAY);
		this.panel_2.add(this.panel_7);

		this.lblDniTurno5 = new JLabel("36235144");
		this.lblDniTurno5.setFont(new Font("Arial Black", Font.PLAIN, 30));

		this.lblBoxTurno5 = new JLabel("1");
		this.lblBoxTurno5.setFont(new Font("Arial Black", Font.PLAIN, 30));
		GroupLayout gl_panel_7 = new GroupLayout(this.panel_7);
		gl_panel_7.setHorizontalGroup(gl_panel_7.createParallelGroup(Alignment.TRAILING).addGap(0, 499, Short.MAX_VALUE)
				.addGroup(gl_panel_7.createSequentialGroup().addGap(78).addComponent(this.lblDniTurno5)
						.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
						.addComponent(this.lblBoxTurno5, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addGap(29)));
		gl_panel_7.setVerticalGroup(gl_panel_7.createParallelGroup(Alignment.LEADING).addGap(0, 89, Short.MAX_VALUE)
				.addGroup(gl_panel_7.createSequentialGroup().addGap(22)
						.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
								.addComponent(this.lblBoxTurno5, GroupLayout.PREFERRED_SIZE, 43,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(this.lblDniTurno5))
						.addContainerGap(16, Short.MAX_VALUE)));
		this.panel_7.setLayout(gl_panel_7);

		this.panel_8 = new JPanel();
		this.panel_8.setBorder(new LineBorder(new Color(255, 255, 255), 4, true));
		this.panel_8.setBackground(Color.LIGHT_GRAY);
		this.panel_2.add(this.panel_8);

		this.lblDniTurno6 = new JLabel("36235144");
		this.lblDniTurno6.setFont(new Font("Arial Black", Font.PLAIN, 30));

		this.lblBoxTurno6 = new JLabel("6");
		this.lblBoxTurno6.setFont(new Font("Arial Black", Font.PLAIN, 30));
		GroupLayout gl_panel_8 = new GroupLayout(this.panel_8);
		gl_panel_8.setHorizontalGroup(gl_panel_8.createParallelGroup(Alignment.TRAILING).addGap(0, 499, Short.MAX_VALUE)
				.addGroup(gl_panel_8.createSequentialGroup().addGap(78).addComponent(this.lblDniTurno6)
						.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
						.addComponent(this.lblBoxTurno6, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addGap(29)));
		gl_panel_8.setVerticalGroup(gl_panel_8.createParallelGroup(Alignment.LEADING).addGap(0, 89, Short.MAX_VALUE)
				.addGroup(gl_panel_8.createSequentialGroup().addGap(22)
						.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
								.addComponent(this.lblBoxTurno6, GroupLayout.PREFERRED_SIZE, 43,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(this.lblDniTurno6))
						.addContainerGap(16, Short.MAX_VALUE)));
		this.panel_8.setLayout(gl_panel_8);

		this.panel_9 = new JPanel();
		this.panel_9.setBorder(new LineBorder(new Color(255, 255, 255), 4, true));
		this.panel_9.setBackground(Color.LIGHT_GRAY);
		this.panel_2.add(this.panel_9);

		this.lblDniTurno7 = new JLabel("36235144");
		this.lblDniTurno7.setFont(new Font("Arial Black", Font.PLAIN, 30));

		this.lblBoxTurno7 = new JLabel("7");
		this.lblBoxTurno7.setFont(new Font("Arial Black", Font.PLAIN, 30));
		GroupLayout gl_panel_9 = new GroupLayout(this.panel_9);
		gl_panel_9.setHorizontalGroup(gl_panel_9.createParallelGroup(Alignment.TRAILING).addGap(0, 499, Short.MAX_VALUE)
				.addGroup(gl_panel_9.createSequentialGroup().addGap(78).addComponent(this.lblDniTurno7)
						.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
						.addComponent(this.lblBoxTurno7, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addGap(29)));
		gl_panel_9.setVerticalGroup(gl_panel_9.createParallelGroup(Alignment.LEADING).addGap(0, 89, Short.MAX_VALUE)
				.addGroup(gl_panel_9.createSequentialGroup().addGap(22)
						.addGroup(gl_panel_9.createParallelGroup(Alignment.BASELINE)
								.addComponent(this.lblBoxTurno7, GroupLayout.PREFERRED_SIZE, 43,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(this.lblDniTurno7))
						.addContainerGap(16, Short.MAX_VALUE)));
		this.panel_9.setLayout(gl_panel_9);

		this.panel_10 = new JPanel();
		this.panel_10.setBorder(new LineBorder(new Color(255, 255, 255), 4, true));
		this.panel_10.setBackground(Color.LIGHT_GRAY);
		this.panel_2.add(this.panel_10);

		this.lblDniTurno8 = new JLabel("36235144");
		this.lblDniTurno8.setFont(new Font("Arial Black", Font.PLAIN, 30));

		this.lblBoxTurno8 = new JLabel("3");
		this.lblBoxTurno8.setFont(new Font("Arial Black", Font.PLAIN, 30));
		GroupLayout gl_panel_10 = new GroupLayout(this.panel_10);
		gl_panel_10.setHorizontalGroup(gl_panel_10.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 499, Short.MAX_VALUE)
				.addGroup(gl_panel_10.createSequentialGroup().addGap(78).addComponent(this.lblDniTurno8)
						.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
						.addComponent(this.lblBoxTurno8, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addGap(29)));
		gl_panel_10.setVerticalGroup(gl_panel_10.createParallelGroup(Alignment.LEADING).addGap(0, 89, Short.MAX_VALUE)
				.addGroup(gl_panel_10.createSequentialGroup().addGap(22)
						.addGroup(gl_panel_10.createParallelGroup(Alignment.BASELINE)
								.addComponent(this.lblBoxTurno8, GroupLayout.PREFERRED_SIZE, 43,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(this.lblDniTurno8))
						.addContainerGap(16, Short.MAX_VALUE)));
		this.panel_10.setLayout(gl_panel_10);
		JOptionPane.showConfirmDialog(null, "¿Todos los datos ingresados son correctos?", "Confirmar turno",
				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		this.frame.setVisible(true);
	}

	public void actualizaTurnos(String dni, int box)
	{
		this.lblBoxTurno8.setText(this.lblBoxTurno7.getText());
		this.lblDniTurno8.setText(this.lblDniTurno7.getText());

		this.lblBoxTurno7.setText(this.lblBoxTurno6.getText());
		this.lblDniTurno7.setText(this.lblDniTurno6.getText());

		this.lblBoxTurno6.setText(this.lblBoxTurno5.getText());
		this.lblDniTurno6.setText(this.lblDniTurno5.getText());

		this.lblBoxTurno5.setText(this.lblBoxTurno4.getText());
		this.lblDniTurno5.setText(this.lblDniTurno4.getText());

		this.lblBoxTurno4.setText(this.lblBoxTurno3.getText());
		this.lblDniTurno4.setText(this.lblDniTurno3.getText());

		this.lblBoxTurno3.setText(this.lblBoxTurno2.getText());
		this.lblDniTurno3.setText(this.lblDniTurno2.getText());

		this.lblBoxTurno2.setText(this.lblBoxTurno1.getText().substring(4));
		this.lblDniTurno2.setText(this.lblDniTurno1.getText());

		this.lblBoxTurno1.setText("BOX " + box);
		this.lblDniTurno1.setText(dni);
	}

	public void vaciarTurnos()
	{
		this.lblBoxTurno1.setText("BOX ");
		this.lblBoxTurno2.setText("");
		this.lblBoxTurno3.setText("");
		this.lblBoxTurno4.setText("");
		this.lblBoxTurno5.setText("");
		this.lblBoxTurno6.setText("");
		this.lblBoxTurno7.setText("");
		this.lblBoxTurno8.setText("");

		this.lblDniTurno1.setText("");
		this.lblDniTurno2.setText("");
		this.lblDniTurno3.setText("");
		this.lblDniTurno4.setText("");
		this.lblDniTurno5.setText("");
		this.lblDniTurno6.setText("");
		this.lblDniTurno7.setText("");
		this.lblDniTurno8.setText("");

	}

}
