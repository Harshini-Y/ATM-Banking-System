package atm;
import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class signup extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnNewRadioButton_3;
	private JRadioButton rdbtnNewRadioButton_4;
	private JRadioButton rdbtnNewRadioButton_5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup frame = new signup();
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
	public signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1111, 791);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("APPLICATION FORM");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(353, 0, 379, 75);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Page 1 : Personal Details");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(391, 58, 279, 49);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2.setBounds(127, 112, 119, 41);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(408, 116, 420, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Father's Name :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_3.setBounds(127, 174, 189, 41);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(408, 178, 420, 41);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Date Of Birth :");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_4.setBounds(127, 238, 189, 41);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(408, 242, 420, 41);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Gender :");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_5.setBounds(127, 306, 189, 41);
		contentPane.add(lblNewLabel_5);
		
		rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected())
				{
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(408, 318, 105, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1.isSelected())
				{
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnNewRadioButton_1.setBounds(535, 318, 105, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		
		rdbtnNewRadioButton_2 = new JRadioButton("Other");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_2.isSelected())
				{
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnNewRadioButton_2.setBounds(688, 320, 105, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(408, 361, 420, 41);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Email Address :");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_6.setBounds(127, 357, 189, 41);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Marital Status :");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_7.setBounds(127, 419, 189, 41);
		contentPane.add(lblNewLabel_7);
		
		rdbtnNewRadioButton_3 = new JRadioButton("Married");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_3.isSelected())
				{
					rdbtnNewRadioButton_4.setSelected(false);
					rdbtnNewRadioButton_5.setSelected(false);
				}
				
			}
		});
		rdbtnNewRadioButton_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnNewRadioButton_3.setBounds(408, 431, 105, 21);
		contentPane.add(rdbtnNewRadioButton_3);
		
		rdbtnNewRadioButton_4 = new JRadioButton("Unmarried");
		rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_4.isSelected())
				{
					rdbtnNewRadioButton_3.setSelected(false);
					rdbtnNewRadioButton_5.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnNewRadioButton_4.setBounds(535, 431, 135, 21);
		contentPane.add(rdbtnNewRadioButton_4);
		
		rdbtnNewRadioButton_5 = new JRadioButton("Other");
		rdbtnNewRadioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_5.isSelected())
				{
					rdbtnNewRadioButton_3.setSelected(false);
					rdbtnNewRadioButton_4.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnNewRadioButton_5.setBounds(688, 431, 105, 21);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JLabel lblNewLabel_11 = new JLabel("Address :");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_11.setBounds(127, 470, 189, 41);
		contentPane.add(lblNewLabel_11);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(408, 466, 420, 41);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_8 = new JLabel("City  :");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_8.setBounds(127, 528, 189, 41);
		contentPane.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(408, 532, 420, 41);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Pin Code :");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_9.setBounds(127, 588, 189, 41);
		contentPane.add(lblNewLabel_9);
		
		textField_5 = new JTextField();
		textField_5.setBounds(408, 588, 420, 41);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("State :");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_10.setBounds(127, 639, 189, 41);
		contentPane.add(lblNewLabel_10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(408, 639, 420, 41);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component frame=null;
				JOptionPane.showMessageDialog(frame,"Data Saved");
				signup2 frame1 = new signup2();
				frame1.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setBounds(908, 696, 96, 39);
		contentPane.add(btnNewButton);
			
	}
}
