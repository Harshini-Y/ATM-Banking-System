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

public class withdrawal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel show_validation_here;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					withdrawal frame = new withdrawal();
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
	public withdrawal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1228, 797);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PLEASE ENTER YOUR AMOUNT : ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 45));
		lblNewLabel.setBounds(244, 231, 838, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MAXIMUM DAILY WITHDRAWAL AMOUNT IS 10000/-");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel_1.setBounds(159, 120, 923, 57);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				try {
					int i=Integer.parseInt(textField.getText());
					show_validation_here.setText("");
				}catch(NumberFormatException e1) {
					show_validation_here.setText("Invalid Number");
					
				}
			}
		});
		textField.setBounds(403, 316, 407, 51);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("WITHDRAW");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=Integer.parseInt(textField.getText());
				Component frame = null;
				if(i>10000) {
				JOptionPane.showMessageDialog(frame,"Daily Limit Exceeded!");
				}
				else {
					JOptionPane.showMessageDialog(frame,"Please Collect Your Money");
					
				}
				thankyou frame1 = new thankyou();
				frame1.setVisible(true);
			    }
			});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setBounds(509, 415, 201, 51);
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
		btnNewButton_1.setBounds(873, 603, 113, 51);
		contentPane.add(btnNewButton_1);
		
		show_validation_here = new JLabel("");
		show_validation_here.setFont(new Font("Times New Roman", Font.BOLD, 15));
		show_validation_here.setForeground(Color.RED);
		show_validation_here.setBounds(403, 378, 135, 13);
		contentPane.add(show_validation_here);
	}

}
