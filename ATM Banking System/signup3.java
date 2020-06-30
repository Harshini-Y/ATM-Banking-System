package atm;

import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class signup3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnNewRadioButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup3 frame = new signup3();
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
	public signup3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1307, 796);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Page 3 : Account Details");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(444, 10, 447, 61);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Account Type :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(126, 114, 181, 35);
		contentPane.add(lblNewLabel_1);
		
		rdbtnNewRadioButton = new JRadioButton("Savings Account");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected())
				{
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
					rdbtnNewRadioButton_3.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(126, 172, 169, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Fixed Deposit Account");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1.isSelected())
				{
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
					rdbtnNewRadioButton_3.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnNewRadioButton_1.setBounds(459, 174, 219, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("Current Account");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_2.isSelected())
				{
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_3.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnNewRadioButton_2.setBounds(126, 219, 181, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton_3 = new JRadioButton("Recurring Deposit Account");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_3.isSelected())
				{
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnNewRadioButton_3.setBounds(459, 219, 269, 21);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("CARD NUMBER :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2.setBounds(126, 274, 213, 35);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("(Your 16-digit card number)");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(126, 305, 213, 21);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("XXXX-XXXX-XXXX-8436");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_4.setBounds(459, 274, 323, 35);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("(It would appear on ATM Card/Cheque Book & Statements)");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(459, 309, 378, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("PIN :");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_6.setBounds(126, 355, 137, 43);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("(4-Digit PASSWORD)");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(126, 391, 154, 21);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("XXXX");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_8.setBounds(464, 359, 112, 35);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Services Required :");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_9.setBounds(126, 431, 219, 35);
		contentPane.add(lblNewLabel_9);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("ATM CARD");
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 22));
		chckbxNewCheckBox.setBounds(126, 485, 154, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Internet Banking");
		chckbxNewCheckBox_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		chckbxNewCheckBox_1.setBounds(460, 485, 195, 21);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Mobile Banking");
		chckbxNewCheckBox_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		chckbxNewCheckBox_2.setBounds(126, 526, 201, 21);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("EMAIL Alerts");
		chckbxNewCheckBox_3.setFont(new Font("Times New Roman", Font.BOLD, 22));
		chckbxNewCheckBox_3.setBounds(459, 526, 181, 21);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Cheque Book");
		chckbxNewCheckBox_4.setFont(new Font("Times New Roman", Font.BOLD, 22));
		chckbxNewCheckBox_4.setBounds(126, 564, 181, 21);
		contentPane.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("E-Statement");
		chckbxNewCheckBox_5.setFont(new Font("Times New Roman", Font.BOLD, 22));
		chckbxNewCheckBox_5.setBounds(459, 564, 196, 21);
		contentPane.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("I hereby declare that above entered details are correct to the best of my knowledge.");
		chckbxNewCheckBox_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		chckbxNewCheckBox_6.setBounds(126, 628, 730, 21);
		contentPane.add(chckbxNewCheckBox_6);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component frame = null;
				JOptionPane.showMessageDialog(frame,"Form Submitted Successfully!");
				Component frame1 = null;
				JOptionPane.showMessageDialog(frame1,"Please collect your Card No.and PIN from the Bank.");
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setBounds(368, 685, 137, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CANCEL");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component frame = null;
				JOptionPane.showMessageDialog(frame,"Form Cancelled!");
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_1.setBounds(568, 685, 160, 50);
		contentPane.add(btnNewButton_1);
	}

}
