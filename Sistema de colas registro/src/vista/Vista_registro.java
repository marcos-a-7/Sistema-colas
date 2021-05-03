package vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
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

public class Vista_registro extends JFrame implements ActionListener
{

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_inferior;
	private JPanel panel_superior;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Vista_registro frame = new Vista_registro();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vista_registro()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 740);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
		
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
		
		this.textField = new JTextField();
		this.textField.setFont(new Font("Arial Black", Font.PLAIN, 70));
		this.panel_1.add(this.textField);
		this.textField.setColumns(10);
		
		this.panel_inferior = new JPanel();
		this.panel.add(this.panel_inferior);
		
		this.btnNewButton = new JButton("7");
		this.btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 20));
		
		this.btnNewButton_1 = new JButton("8");
		this.btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		this.btnNewButton_1.addActionListener(this);
		
		this.btnNewButton_2 = new JButton("9");
		this.btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		
		this.btnNewButton_3 = new JButton("4");
		this.btnNewButton_3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		
		this.btnNewButton_4 = new JButton("5");
		this.btnNewButton_4.setFont(new Font("Arial Black", Font.PLAIN, 20));
		
		this.btnNewButton_5 = new JButton("6");
		this.btnNewButton_5.setFont(new Font("Arial Black", Font.PLAIN, 20));
		
		this.btnNewButton_6 = new JButton("1");
		this.btnNewButton_6.setFont(new Font("Arial Black", Font.PLAIN, 20));
		
		this.btnNewButton_7 = new JButton("2");
		this.btnNewButton_7.setFont(new Font("Arial Black", Font.PLAIN, 20));
		
		this.btnNewButton_8 = new JButton("3");
		this.btnNewButton_8.setFont(new Font("Arial Black", Font.PLAIN, 20));
		
		this.btnNewButton_9 = new JButton("CONFIRMAR");
		this.btnNewButton_9.setFont(new Font("Arial Black", Font.PLAIN, 20));
		
		this.btnNewButton_10 = new JButton("VACIAR");
		this.btnNewButton_10.addActionListener(this);
		this.btnNewButton_10.setFont(new Font("Arial Black", Font.PLAIN, 20));
		
		this.btnNewButton_11 = new JButton("\u2190");
		this.btnNewButton_11.setFont(new Font("Arial Black", Font.PLAIN, 60));
		GroupLayout gl_panel_inferior = new GroupLayout(this.panel_inferior);
		gl_panel_inferior.setHorizontalGroup(
			gl_panel_inferior.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_inferior.createSequentialGroup()
					.addGap(114)
					.addGroup(gl_panel_inferior.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_inferior.createSequentialGroup()
							.addComponent(this.btnNewButton_6, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(this.btnNewButton_7, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(this.btnNewButton_8, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_inferior.createSequentialGroup()
							.addComponent(this.btnNewButton_3, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(this.btnNewButton_4, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(this.btnNewButton_5, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_inferior.createSequentialGroup()
							.addComponent(this.btnNewButton, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(this.btnNewButton_1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(this.btnNewButton_2, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))
					.addGap(81)
					.addGroup(gl_panel_inferior.createParallelGroup(Alignment.LEADING, false)
						.addComponent(this.btnNewButton_11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(this.btnNewButton_10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(this.btnNewButton_9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(108, Short.MAX_VALUE))
		);
		gl_panel_inferior.setVerticalGroup(
			gl_panel_inferior.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_inferior.createSequentialGroup()
					.addContainerGap(12, Short.MAX_VALUE)
					.addGroup(gl_panel_inferior.createParallelGroup(Alignment.LEADING)
						.addComponent(this.btnNewButton_2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.btnNewButton_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.btnNewButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.btnNewButton_11, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_panel_inferior.createParallelGroup(Alignment.LEADING)
						.addComponent(this.btnNewButton_3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.btnNewButton_4, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.btnNewButton_5, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.btnNewButton_10, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(25)
					.addGroup(gl_panel_inferior.createParallelGroup(Alignment.LEADING)
						.addComponent(this.btnNewButton_9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_panel_inferior.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(this.btnNewButton_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
							.addComponent(this.btnNewButton_7, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
							.addComponent(this.btnNewButton_8, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
					.addContainerGap())
		);
		this.panel_inferior.setLayout(gl_panel_inferior);
	}
	public void actionPerformed(ActionEvent arg0) {
	}
}
