package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Vista_registro extends JFrame

{
	private JFrame frame;
	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_inferior;
	private JPanel panel_superior;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JTextField textField_dni;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnConfirmar;
	private JButton btnBorrar;
	private JButton btn0;
	private JButton btnVaciar;

	/**
	 * Create the frame.
	 */
	public Vista_registro()
	{
		this.frame = new JFrame("Registro");
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setBounds(100, 100, 775, 766);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		this.frame.setContentPane(this.contentPane);

		this.panel = new JPanel();
		this.contentPane.add(this.panel, BorderLayout.CENTER);
		this.panel.setLayout(new GridLayout(2, 0, 0, 0));

		this.panel_superior = new JPanel();
		this.panel.add(this.panel_superior);
		this.panel_superior.setLayout(new GridLayout(2, 0, 0, 0));

		this.panel_2 = new JPanel();
		this.panel_superior.add(this.panel_2);
		this.panel_2.setLayout(new BoxLayout(this.panel_2, BoxLayout.X_AXIS));

		this.lblNewLabel = new JLabel("Para sacar turno ingrese su DNI");
		this.lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 40));
		this.lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.panel_2.add(this.lblNewLabel);

		this.panel_1 = new JPanel();
		this.panel_superior.add(this.panel_1);
		this.panel_1.setLayout(new BoxLayout(this.panel_1, BoxLayout.X_AXIS));

		this.textField_dni = new JTextField();
		this.textField_dni.setHorizontalAlignment(SwingConstants.RIGHT);
		this.textField_dni.setBackground(Color.WHITE);
		this.textField_dni.setFont(new Font("Arial Black", Font.PLAIN, 80));
		this.panel_1.add(this.textField_dni);
		this.textField_dni.setColumns(10);

		this.panel_inferior = new JPanel();
		this.panel.add(this.panel_inferior);

		this.btn7 = new JButton("7");
		this.btn7.setFont(new Font("Arial Black", Font.PLAIN, 20));

		this.btn8 = new JButton("8");
		this.btn8.setFont(new Font("Arial Black", Font.PLAIN, 20));

		this.btn9 = new JButton("9");
		this.btn9.setFont(new Font("Arial Black", Font.PLAIN, 20));

		this.btn4 = new JButton("4");
		this.btn4.setFont(new Font("Arial Black", Font.PLAIN, 20));

		this.btn5 = new JButton("5");
		this.btn5.setFont(new Font("Arial Black", Font.PLAIN, 20));

		this.btn6 = new JButton("6");
		this.btn6.setFont(new Font("Arial Black", Font.PLAIN, 20));

		this.btn1 = new JButton("1");
		this.btn1.setFont(new Font("Arial Black", Font.PLAIN, 20));

		this.btn2 = new JButton("2");
		this.btn2.setFont(new Font("Arial Black", Font.PLAIN, 20));

		this.btn3 = new JButton("3");
		this.btn3.setFont(new Font("Arial Black", Font.PLAIN, 20));

		this.btnConfirmar = new JButton("CONFIRMAR");
		this.btnConfirmar.setFont(new Font("Arial Black", Font.PLAIN, 20));

		btnVaciar = new JButton("VACIAR");
		btnVaciar.setFont(new Font("Arial Black", Font.PLAIN, 20));

		this.btnBorrar = new JButton("\u2190");
		this.btnBorrar.setActionCommand("BORRAR");
		this.btnBorrar.setFont(new Font("Arial Black", Font.PLAIN, 60));

		this.btn0 = new JButton("0");
		this.btn0.setFont(new Font("Arial Black", Font.PLAIN, 20));
		GroupLayout gl_panel_inferior = new GroupLayout(this.panel_inferior);
		gl_panel_inferior.setHorizontalGroup(gl_panel_inferior.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_inferior.createSequentialGroup().addGap(114).addGroup(gl_panel_inferior
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_inferior.createSequentialGroup()
								.addComponent(this.btn7, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(this.btn8, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(this.btn9, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_inferior.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel_inferior.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_inferior.createSequentialGroup()
												.addComponent(this.btn4, GroupLayout.PREFERRED_SIZE, 69,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(this.btn5, GroupLayout.PREFERRED_SIZE, 69,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18).addComponent(this.btn6, GroupLayout.PREFERRED_SIZE, 69,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_inferior.createSequentialGroup().addGroup(gl_panel_inferior
												.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(this.btn0, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(Alignment.LEADING,
														gl_panel_inferior.createSequentialGroup()
																.addComponent(this.btn1, GroupLayout.PREFERRED_SIZE, 69,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(18).addComponent(this.btn2,
																		GroupLayout.PREFERRED_SIZE, 69,
																		GroupLayout.PREFERRED_SIZE)))
												.addGap(18).addComponent(this.btn3, GroupLayout.PREFERRED_SIZE, 69,
														GroupLayout.PREFERRED_SIZE)))))
						.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
						.addGroup(gl_panel_inferior.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnVaciar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(this.btnBorrar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(this.btnConfirmar))
						.addContainerGap(140, Short.MAX_VALUE)));
		gl_panel_inferior.setVerticalGroup(gl_panel_inferior.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_inferior.createSequentialGroup().addContainerGap(54, Short.MAX_VALUE)
						.addGroup(gl_panel_inferior.createParallelGroup(Alignment.LEADING)
								.addComponent(this.btn9, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addComponent(this.btn8, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addComponent(this.btn7, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addComponent(this.btnBorrar, GroupLayout.PREFERRED_SIZE, 60,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_panel_inferior.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_inferior.createParallelGroup(Alignment.BASELINE)
										.addComponent(this.btn4, GroupLayout.PREFERRED_SIZE, 60,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(this.btn5, GroupLayout.PREFERRED_SIZE, 60,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(btnVaciar, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addComponent(this.btn6, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_panel_inferior.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_inferior.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(this.btn1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 60,
												Short.MAX_VALUE)
										.addComponent(this.btn2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 60,
												Short.MAX_VALUE)
										.addComponent(this.btn3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 60,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(this.btnConfirmar, GroupLayout.PREFERRED_SIZE, 71,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(this.btn0, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addGap(17)));
		this.panel_inferior.setLayout(gl_panel_inferior);
		frame.setVisible(true);
	}

	public String getDni()
	{
		return this.textField_dni.getText();
	}

	public void addNumDni(int num)
	{
		this.textField_dni.setText(this.textField_dni.getText() + num);
	}

	public void borrarNumDni()
	{
		String dni = this.textField_dni.getText();
		if (!dni.isEmpty())
		{
			this.textField_dni.setText(dni.substring(0, dni.length() - 1));
		}

	}

	public void vaciarNumDni()
	{
		this.textField_dni.setText("");
	}


	public void setActionListener(ActionListener actionListener)
	{
		this.btn0.addActionListener(actionListener);
		this.btn1.addActionListener(actionListener);
		this.btn2.addActionListener(actionListener);
		this.btn3.addActionListener(actionListener);
		this.btn4.addActionListener(actionListener);
		this.btn5.addActionListener(actionListener);
		this.btn6.addActionListener(actionListener);
		this.btn7.addActionListener(actionListener);
		this.btn8.addActionListener(actionListener);
		this.btn9.addActionListener(actionListener);
		this.btnBorrar.addActionListener(actionListener);
		this.btnConfirmar.addActionListener(actionListener);
		this.btnVaciar.addActionListener(actionListener);
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
