package atm;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class signup2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
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
					signup2 frame = new signup2();
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
	public signup2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1360, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Page 2 : Additional Details");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(436, 25, 447, 61);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Religion :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(236, 126, 131, 34);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Hindu", "Muslim", "Sikh", "Christian", "Others"}));
		comboBox.setBounds(449, 126, 290, 34);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Category :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2.setBounds(236, 183, 131, 34);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "General", "OBC", "SC", "ST", "Others"}));
		comboBox_1.setBounds(449, 187, 290, 34);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_3 = new JLabel("Income :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_3.setBounds(236, 241, 131, 34);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000", "Above 10,00,000"}));
		comboBox_2.setBounds(449, 245, 290, 34);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_4 = new JLabel("Qualification :");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_4.setBounds(236, 303, 186, 34);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Select", "Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others"}));
		comboBox_3.setBounds(449, 307, 290, 34);
		contentPane.add(comboBox_3);
		
		JLabel lblNewLabel_5 = new JLabel("Occupation :");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_5.setBounds(236, 365, 186, 34);
		contentPane.add(lblNewLabel_5);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Select", "Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"}));
		comboBox_4.setBounds(449, 369, 290, 34);
		contentPane.add(comboBox_4);
		
		JLabel lblNewLabel_6 = new JLabel("PAN Number :");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_6.setBounds(236, 436, 186, 34);
		contentPane.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(449, 436, 290, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Aadhar Number :");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_7.setBounds(236, 503, 202, 34);
		contentPane.add(lblNewLabel_7);
		
		textField_1 = new JTextField();
		textField_1.setBounds(449, 503, 290, 34);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Senior Citizen :");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_8.setBounds(236, 555, 186, 34);
		contentPane.add(lblNewLabel_8);
		
		rdbtnNewRadioButton = new JRadioButton("Yes");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected())
				{
					rdbtnNewRadioButton_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(449, 566, 105, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("No");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1.isSelected())
				{
					rdbtnNewRadioButton.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnNewRadioButton_1.setBounds(591, 566, 105, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_9 = new JLabel("Existing Account :");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_9.setBounds(236, 610, 202, 34);
		contentPane.add(lblNewLabel_9);
		
		rdbtnNewRadioButton_2 = new JRadioButton("Yes");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_2.isSelected())
				{
					rdbtnNewRadioButton_3.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnNewRadioButton_2.setBounds(449, 621, 105, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton_3 = new JRadioButton("No");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_3.isSelected())
				{
					rdbtnNewRadioButton_2.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnNewRadioButton_3.setBounds(591, 621, 105, 21);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component frame=null;
				JOptionPane.showMessageDialog(frame,"Data Saved");
				signup3 frame1 = new signup3();
				frame1.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setBounds(785, 654, 96, 39);
		contentPane.add(btnNewButton);
	}
}
