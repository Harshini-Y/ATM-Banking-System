package atm;
import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class pinchange extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pinchange frame = new pinchange();
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
	public pinchange() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1390, 744);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHANGE YOUR PIN :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblNewLabel.setBounds(438, 152, 514, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Current PIN :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(439, 276, 162, 40);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(666, 280, 259, 41);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("New PIN :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2.setBounds(439, 360, 162, 40);
		contentPane.add(lblNewLabel_2);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(666, 360, 259, 40);
		contentPane.add(passwordField_1);
		
		JLabel lblNewLabel_3 = new JLabel("Re-enter New PIN :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_3.setBounds(439, 449, 208, 40);
		contentPane.add(lblNewLabel_3);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(666, 449, 259, 41);
		contentPane.add(passwordField_2);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Arrays.equals(passwordField_1.getPassword(), passwordField_2.getPassword())) {
				Component frame=null;
				JOptionPane.showMessageDialog(frame,"PIN Changed Successfully!");
				}
				else{
					Component frame=null;
					JOptionPane.showMessageDialog(frame,"Re-enter new pin again!");
					
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setBounds(451, 539, 196, 59);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login frame = new login();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_1.setBounds(718, 539, 196, 59);
		contentPane.add(btnNewButton_1);
	}



}
