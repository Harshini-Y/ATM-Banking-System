package atm;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.Font;
import java.awt.Window;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		getContentPane().setForeground(Color.RED);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1014, 656);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("CASH WITHDRAWAL");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				withdrawal frame = new withdrawal();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(588, 108, 337, 88);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DEPOSIT");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deposit frame = new deposit();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_1.setBounds(98, 108, 337, 88);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("FAST CASH");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fastcash frame = new fastcash();
				frame.setVisible(true);
			}
		});
		btnNewButton_2.setBackground(Color.PINK);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_2.setBounds(360, 249, 337, 88);
		getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("PLEASE SELECT YOUR TRANSACTION");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(163, 10, 683, 75);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_4 = new JButton("PIN CHANGE");
		btnNewButton_4.setBackground(Color.GREEN);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pinchange frame = new pinchange();
				frame.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_4.setBounds(98, 390, 337, 88);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("BALANCE ENQUIRY");
		btnNewButton_5.setBackground(Color.CYAN);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component frame = null;
				JOptionPane.showMessageDialog(frame,"Your Current Balance is Rs.4500");
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_5.setBounds(588, 390, 337, 88);
		getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("EXIT");
		btnNewButton_6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				atm window = new atm();
			    window.frame.setVisible(true);
			}
		});
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setBackground(Color.BLACK);
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_6.setBounds(360, 506, 337, 88);
		getContentPane().add(btnNewButton_6);
	}
}
