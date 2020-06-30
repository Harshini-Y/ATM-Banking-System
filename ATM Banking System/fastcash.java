package atm;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class fastcash extends JFrame {

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
					fastcash frame = new fastcash();
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
	public fastcash() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1340, 798);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select Withdrawal Amount :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblNewLabel.setBounds(340, 42, 686, 85);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Rs. 100");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component frame=null;
				JOptionPane.showMessageDialog(frame,"Please Collect Your Money!");
				thankyou frame1 = new thankyou();
				frame1.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setBounds(193, 185, 385, 74);
		getContentPane().add(btnNewButton);
		
		JButton btnRs = new JButton("Rs. 500");
		btnRs.setBackground(Color.GREEN);
		btnRs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component frame=null;
				JOptionPane.showMessageDialog(frame,"Please Collect Your Money!");
				thankyou frame1 = new thankyou();
				frame1.setVisible(true);
			}
		});
		btnRs.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnRs.setBounds(193, 311, 385, 74);
		getContentPane().add(btnRs);
		
		JButton btnRs_1 = new JButton("Rs. 1000");
		btnRs_1.setBackground(Color.RED);
		btnRs_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component frame=null;
				JOptionPane.showMessageDialog(frame,"Please Collect Your Money!");
				thankyou frame1 = new thankyou();
				frame1.setVisible(true);
			}
		});
		btnRs_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnRs_1.setBounds(193, 454, 385, 74);
		getContentPane().add(btnRs_1);
		
		JButton btnRs_2 = new JButton("Rs. 1500");
		btnRs_2.setBackground(Color.YELLOW);
		btnRs_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component frame=null;
				JOptionPane.showMessageDialog(frame,"Please Collect Your Money!");
				thankyou frame1 = new thankyou();
				frame1.setVisible(true);
			}
		});
		btnRs_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnRs_2.setBounds(696, 185, 385, 74);
		getContentPane().add(btnRs_2);
		
		JButton btnRs_3 = new JButton("Rs. 5000");
		btnRs_3.setBackground(Color.CYAN);
		btnRs_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component frame=null;
				JOptionPane.showMessageDialog(frame,"Please Collect Your Money!");
				thankyou frame1 = new thankyou();
				frame1.setVisible(true);
			}
			
		});
		btnRs_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnRs_3.setBounds(696, 311, 385, 74);
		getContentPane().add(btnRs_3);
		
		JButton btnRs_4 = new JButton("Rs. 10000");
		btnRs_4.setBackground(Color.MAGENTA);
		btnRs_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component frame=null;
				JOptionPane.showMessageDialog(frame,"Please Collect Your Money!");
				thankyou frame1 = new thankyou();
				frame1.setVisible(true);
			}
		});
		btnRs_4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnRs_4.setBounds(696, 454, 385, 74);
		getContentPane().add(btnRs_4);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login frame = new login();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_1.setBounds(340, 623, 171, 49);
		getContentPane().add(btnNewButton_1);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(Color.BLACK);
		btnExit.setForeground(Color.WHITE);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atm window = new atm();
				window.frame.setVisible(true);
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnExit.setBounds(786, 623, 171, 49);
		getContentPane().add(btnExit);
	}

}
