package atm;
import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class deposit extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel show_validation_here1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deposit frame = new deposit();
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
	public deposit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1384, 798);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Amount You Want To Deposit :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblNewLabel.setBounds(265, 121, 889, 83);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				try {
					int i=Integer.parseInt(textField.getText());
					show_validation_here1.setText("");
				}catch(NumberFormatException e1) {
					show_validation_here1.setText("Invalid Number");
					
				}
			}
		});
		textField.setBounds(432, 252, 503, 53);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("DEPOSIT");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component frame = null;
				JOptionPane.showMessageDialog(frame,"Deposited Successfully!");
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setBounds(610, 359, 160, 61);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login frame = new login();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_1.setBounds(1063, 605, 145, 53);
		contentPane.add(btnNewButton_1);
		
		show_validation_here1 = new JLabel("");
		show_validation_here1.setForeground(Color.RED);
		show_validation_here1.setBounds(432, 326, 92, 13);
		contentPane.add(show_validation_here1);
	}

}
