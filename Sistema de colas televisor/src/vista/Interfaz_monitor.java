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

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.JOptionPane;
public class Interfaz_monitor extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel_2;
	private JPanel panel_3;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JPanel panel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_19;
	private JPanel panel_5;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JPanel panel_6;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JPanel panel_7;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JPanel panel_8;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JPanel panel_9;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JPanel panel_10;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_monitor frame = new Interfaz_monitor();
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
	public Interfaz_monitor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
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
		
		this.lblNewLabel_1 = new JLabel("123456587");
		this.lblNewLabel_1.setForeground(new Color(255, 255, 255));
		this.lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 60));
		
		this.lblNewLabel_2 = new JLabel("BOX  3");
		this.lblNewLabel_2.setForeground(Color.WHITE);
		this.lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 80));
		GroupLayout gl_panel_1 = new GroupLayout(this.panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(49)
							.addComponent(this.lblNewLabel))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(77)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(this.lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
								.addComponent(this.lblNewLabel_1))))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(49)
					.addComponent(this.lblNewLabel)
					.addGap(151)
					.addComponent(this.lblNewLabel_1)
					.addGap(128)
					.addComponent(this.lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(136, Short.MAX_VALUE))
		);
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
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_4.createSequentialGroup()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addContainerGap()
							.addComponent(this.lblNewLabel_19))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(133)
							.addComponent(this.lblNewLabel_5)
							.addPreferredGap(ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
							.addComponent(this.lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))
					.addGap(97))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addComponent(this.lblNewLabel_19, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.lblNewLabel_5)
						.addComponent(this.lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		this.panel_4.setLayout(gl_panel_4);
		
		this.panel_3 = new JPanel();
		this.panel_3.setBorder(new LineBorder(new Color(255, 255, 255), 4, true));
		this.panel_3.setBackground(new Color(192, 192, 192));
		this.panel_2.add(this.panel_3);
		
		this.lblNewLabel_3 = new JLabel("36235144");
		this.lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 30));
		
		this.lblNewLabel_4 = new JLabel("2");
		this.lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 30));
		GroupLayout gl_panel_3 = new GroupLayout(this.panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(78)
					.addComponent(this.lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
					.addComponent(this.lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addGap(29))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.lblNewLabel_3))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		this.panel_3.setLayout(gl_panel_3);
		
		this.panel_5 = new JPanel();
		this.panel_5.setBorder(new LineBorder(new Color(255, 255, 255), 4, true));
		this.panel_5.setBackground(Color.LIGHT_GRAY);
		this.panel_2.add(this.panel_5);
		
		this.lblNewLabel_7 = new JLabel("36235144");
		this.lblNewLabel_7.setFont(new Font("Arial Black", Font.PLAIN, 30));
		
		this.lblNewLabel_8 = new JLabel("4");
		this.lblNewLabel_8.setFont(new Font("Arial Black", Font.PLAIN, 30));
		GroupLayout gl_panel_5 = new GroupLayout(this.panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 499, Short.MAX_VALUE)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(78)
					.addComponent(this.lblNewLabel_7)
					.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
					.addComponent(this.lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addGap(29))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGap(0, 89, Short.MAX_VALUE)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.lblNewLabel_7))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		this.panel_5.setLayout(gl_panel_5);
		
		this.panel_6 = new JPanel();
		this.panel_6.setBorder(new LineBorder(new Color(255, 255, 255), 4, true));
		this.panel_6.setBackground(Color.LIGHT_GRAY);
		this.panel_2.add(this.panel_6);
		
		this.lblNewLabel_9 = new JLabel("36235144");
		this.lblNewLabel_9.setFont(new Font("Arial Black", Font.PLAIN, 30));
		
		this.lblNewLabel_10 = new JLabel("5");
		this.lblNewLabel_10.setFont(new Font("Arial Black", Font.PLAIN, 30));
		GroupLayout gl_panel_6 = new GroupLayout(this.panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 499, Short.MAX_VALUE)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addGap(78)
					.addComponent(this.lblNewLabel_9)
					.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
					.addComponent(this.lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addGap(29))
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGap(0, 89, Short.MAX_VALUE)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.lblNewLabel_9))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		this.panel_6.setLayout(gl_panel_6);
		
		this.panel_7 = new JPanel();
		this.panel_7.setBorder(new LineBorder(new Color(255, 255, 255), 4, true));
		this.panel_7.setBackground(Color.LIGHT_GRAY);
		this.panel_2.add(this.panel_7);
		
		this.lblNewLabel_11 = new JLabel("36235144");
		this.lblNewLabel_11.setFont(new Font("Arial Black", Font.PLAIN, 30));
		
		this.lblNewLabel_12 = new JLabel("1");
		this.lblNewLabel_12.setFont(new Font("Arial Black", Font.PLAIN, 30));
		GroupLayout gl_panel_7 = new GroupLayout(this.panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 499, Short.MAX_VALUE)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addGap(78)
					.addComponent(this.lblNewLabel_11)
					.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
					.addComponent(this.lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addGap(29))
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGap(0, 89, Short.MAX_VALUE)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.lblNewLabel_11))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		this.panel_7.setLayout(gl_panel_7);
		
		this.panel_8 = new JPanel();
		this.panel_8.setBorder(new LineBorder(new Color(255, 255, 255), 4, true));
		this.panel_8.setBackground(Color.LIGHT_GRAY);
		this.panel_2.add(this.panel_8);
		
		this.lblNewLabel_13 = new JLabel("36235144");
		this.lblNewLabel_13.setFont(new Font("Arial Black", Font.PLAIN, 30));
		
		this.lblNewLabel_14 = new JLabel("6");
		this.lblNewLabel_14.setFont(new Font("Arial Black", Font.PLAIN, 30));
		GroupLayout gl_panel_8 = new GroupLayout(this.panel_8);
		gl_panel_8.setHorizontalGroup(
			gl_panel_8.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 499, Short.MAX_VALUE)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addGap(78)
					.addComponent(this.lblNewLabel_13)
					.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
					.addComponent(this.lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addGap(29))
		);
		gl_panel_8.setVerticalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGap(0, 89, Short.MAX_VALUE)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.lblNewLabel_13))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		this.panel_8.setLayout(gl_panel_8);
		
		this.panel_9 = new JPanel();
		this.panel_9.setBorder(new LineBorder(new Color(255, 255, 255), 4, true));
		this.panel_9.setBackground(Color.LIGHT_GRAY);
		this.panel_2.add(this.panel_9);
		
		this.lblNewLabel_15 = new JLabel("36235144");
		this.lblNewLabel_15.setFont(new Font("Arial Black", Font.PLAIN, 30));
		
		this.lblNewLabel_16 = new JLabel("7");
		this.lblNewLabel_16.setFont(new Font("Arial Black", Font.PLAIN, 30));
		GroupLayout gl_panel_9 = new GroupLayout(this.panel_9);
		gl_panel_9.setHorizontalGroup(
			gl_panel_9.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 499, Short.MAX_VALUE)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addGap(78)
					.addComponent(this.lblNewLabel_15)
					.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
					.addComponent(this.lblNewLabel_16, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addGap(29))
		);
		gl_panel_9.setVerticalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGap(0, 89, Short.MAX_VALUE)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel_9.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.lblNewLabel_16, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.lblNewLabel_15))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		this.panel_9.setLayout(gl_panel_9);
		
		this.panel_10 = new JPanel();
		this.panel_10.setBorder(new LineBorder(new Color(255, 255, 255), 4, true));
		this.panel_10.setBackground(Color.LIGHT_GRAY);
		this.panel_2.add(this.panel_10);
		
		this.lblNewLabel_17 = new JLabel("36235144");
		this.lblNewLabel_17.setFont(new Font("Arial Black", Font.PLAIN, 30));
		
		this.lblNewLabel_18 = new JLabel("3");
		this.lblNewLabel_18.setFont(new Font("Arial Black", Font.PLAIN, 30));
		GroupLayout gl_panel_10 = new GroupLayout(this.panel_10);
		gl_panel_10.setHorizontalGroup(
			gl_panel_10.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 499, Short.MAX_VALUE)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addGap(78)
					.addComponent(this.lblNewLabel_17)
					.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
					.addComponent(this.lblNewLabel_18, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addGap(29))
		);
		gl_panel_10.setVerticalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGap(0, 89, Short.MAX_VALUE)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel_10.createParallelGroup(Alignment.BASELINE)
						.addComponent(this.lblNewLabel_18, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.lblNewLabel_17))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		this.panel_10.setLayout(gl_panel_10);
		JOptionPane.showConfirmDialog(null, "¿Todos los datos ingresados son correctos?", "Confirmar turno", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

	}
}
