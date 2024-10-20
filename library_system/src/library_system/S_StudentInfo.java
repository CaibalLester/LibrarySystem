package library_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class S_StudentInfo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					S_StudentInfo frame = new S_StudentInfo();
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
	public S_StudentInfo() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1310, 648);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JTextArea txtrStudentInformation = new JTextArea();
		txtrStudentInformation.setBounds(51, 28, 505, 40);
		txtrStudentInformation.setText("MY PERSONAL INFORMATION");
		txtrStudentInformation.setForeground(new Color(255, 255, 255));
		txtrStudentInformation.setFont(new Font("Arial", Font.BOLD, 30));
		txtrStudentInformation.setBackground(new Color(0, 128, 128));
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(1135, 456, 99, 30);
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 15));
		btnSubmit.setBackground(new Color(41, 82, 82));
		
		JTextArea txtrUsername = new JTextArea();
		txtrUsername.setBounds(73, 122, 111, 30);
		txtrUsername.setText("Full Name :");
		txtrUsername.setForeground(Color.WHITE);
		txtrUsername.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername.setBackground(new Color(0, 128, 128));
		
		textField = new JTextField();
		textField.setBounds(1018, 119, 216, 30);
		textField.setFont(new Font("Arial", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBackground(new Color(177, 216, 216));
		
		JTextArea txtrPassword = new JTextArea();
		txtrPassword.setBounds(73, 162, 107, 30);
		txtrPassword.setText("Gender :");
		txtrPassword.setForeground(Color.WHITE);
		txtrPassword.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword.setBackground(new Color(0, 128, 128));
		
		textField_1 = new JTextField();
		textField_1.setBounds(1018, 163, 216, 30);
		textField_1.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(177, 216, 216));
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setBounds(73, 202, 65, 30);
		txtrEmail.setText("Email :");
		txtrEmail.setForeground(Color.WHITE);
		txtrEmail.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmail.setBackground(new Color(0, 128, 128));
		
		textField_2 = new JTextField();
		textField_2.setBounds(1018, 203, 216, 30);
		textField_2.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(177, 216, 216));
		
		JTextArea txtrFullName = new JTextArea();
		txtrFullName.setBounds(73, 242, 188, 30);
		txtrFullName.setText("Contact Number :");
		txtrFullName.setForeground(Color.WHITE);
		txtrFullName.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName.setBackground(new Color(0, 128, 128));
		
		textField_3 = new JTextField();
		textField_3.setBounds(1018, 243, 216, 30);
		textField_3.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(177, 216, 216));
		
		JTextArea txtrEmergencyContact = new JTextArea();
		txtrEmergencyContact.setBounds(73, 282, 202, 30);
		txtrEmergencyContact.setText("Emergency Contact :");
		txtrEmergencyContact.setForeground(Color.WHITE);
		txtrEmergencyContact.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmergencyContact.setBackground(new Color(0, 128, 128));
		
		JTextArea txtrFullName_1_1 = new JTextArea();
		txtrFullName_1_1.setBounds(73, 322, 111, 30);
		txtrFullName_1_1.setText("Program :");
		txtrFullName_1_1.setForeground(Color.WHITE);
		txtrFullName_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_1.setBackground(new Color(0, 128, 128));
		
		JTextArea txtrFullName_1_2 = new JTextArea();
		txtrFullName_1_2.setBounds(73, 358, 118, 30);
		txtrFullName_1_2.setText("Year Level :");
		txtrFullName_1_2.setForeground(Color.WHITE);
		txtrFullName_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_2.setBackground(new Color(0, 128, 128));
		
		JTextArea txtrFullName_1_3 = new JTextArea();
		txtrFullName_1_3.setBounds(73, 398, 175, 30);
		txtrFullName_1_3.setText("Student Address :");
		txtrFullName_1_3.setForeground(Color.WHITE);
		txtrFullName_1_3.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_3.setBackground(new Color(0, 128, 128));
		contentPane.setLayout(null);
		contentPane.add(txtrPassword);
		contentPane.add(txtrUsername);
		contentPane.add(txtrEmail);
		contentPane.add(txtrFullName);
		contentPane.add(textField);
		contentPane.add(textField_2);
		contentPane.add(textField_3);
		contentPane.add(textField_1);
		contentPane.add(txtrFullName_1_1);
		contentPane.add(txtrFullName_1_2);
		contentPane.add(txtrFullName_1_3);
		contentPane.add(txtrEmergencyContact);
		contentPane.add(txtrStudentInformation);
		contentPane.add(btnSubmit);
		
		JTextArea txtrUsername_1 = new JTextArea();
		txtrUsername_1.setBounds(871, 118, 111, 30);
		txtrUsername_1.setText("Full Name :");
		txtrUsername_1.setForeground(new Color(0, 128, 128));
		txtrUsername_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrUsername_1);
		
		JTextArea txtrPassword_1 = new JTextArea();
		txtrPassword_1.setBounds(895, 162, 107, 30);
		txtrPassword_1.setText("Gender :");
		txtrPassword_1.setForeground(new Color(0, 128, 128));
		txtrPassword_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrPassword_1);
		
		JTextArea txtrEmail_1 = new JTextArea();
		txtrEmail_1.setBounds(915, 202, 65, 30);
		txtrEmail_1.setText("Email :");
		txtrEmail_1.setForeground(new Color(0, 128, 128));
		txtrEmail_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmail_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrEmail_1);
		
		JTextArea txtrFullName_1 = new JTextArea();
		txtrFullName_1.setBounds(815, 242, 188, 30);
		txtrFullName_1.setText("Contact Number :");
		txtrFullName_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrFullName_1);
		
		JTextArea txtrEmergencyContact_1 = new JTextArea();
		txtrEmergencyContact_1.setBounds(784, 282, 202, 30);
		txtrEmergencyContact_1.setText("Emergency Contact :");
		txtrEmergencyContact_1.setForeground(new Color(0, 128, 128));
		txtrEmergencyContact_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmergencyContact_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrEmergencyContact_1);
		
		JTextArea txtrFullName_1_1_1 = new JTextArea();
		txtrFullName_1_1_1.setBounds(884, 322, 99, 30);
		txtrFullName_1_1_1.setText("Program :");
		txtrFullName_1_1_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_1_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrFullName_1_1_1);
		
		JTextArea txtrFullName_1_2_1 = new JTextArea();
		txtrFullName_1_2_1.setBounds(864, 358, 118, 30);
		txtrFullName_1_2_1.setText("Year Level :");
		txtrFullName_1_2_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1_2_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_2_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrFullName_1_2_1);
		
		JTextArea txtrFullName_1_3_1 = new JTextArea();
		txtrFullName_1_3_1.setBounds(807, 398, 175, 30);
		txtrFullName_1_3_1.setText("Student Address :");
		txtrFullName_1_3_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1_3_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_3_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrFullName_1_3_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(177, 216, 216));
		textField_4.setBounds(1018, 283, 216, 30);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(177, 216, 216));
		textField_5.setBounds(1018, 322, 216, 30);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(177, 216, 216));
		textField_6.setBounds(1018, 358, 216, 30);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(177, 216, 216));
		textField_7.setBounds(1018, 398, 216, 30);
		contentPane.add(textField_7);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Arial", Font.BOLD, 15));
		btnEdit.setBackground(new Color(41, 82, 82));
		btnEdit.setBounds(1026, 456, 99, 30);
		contentPane.add(btnEdit);
		
		JTextArea txtrUsername_1_1 = new JTextArea();
		txtrUsername_1_1.setForeground(new Color(0, 128, 128));
		txtrUsername_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_1_1.setBackground(Color.WHITE);
		txtrUsername_1_1.setBounds(772, 93, 488, 417);
		contentPane.add(txtrUsername_1_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Arial", Font.BOLD, 15));
		btnBack.setBackground(new Color(41, 82, 82));
		btnBack.setBounds(1158, 551, 99, 30);
		contentPane.add(btnBack);
		
		JTextArea txtrUsername_2 = new JTextArea();
		txtrUsername_2.setText("*****");
		txtrUsername_2.setForeground(Color.WHITE);
		txtrUsername_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2.setBackground(new Color(0, 128, 128));
		txtrUsername_2.setBounds(206, 122, 465, 30);
		contentPane.add(txtrUsername_2);
		
		JTextArea txtrUsername_2_1 = new JTextArea();
		txtrUsername_2_1.setText("*****");
		txtrUsername_2_1.setForeground(Color.WHITE);
		txtrUsername_2_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2_1.setBackground(new Color(0, 128, 128));
		txtrUsername_2_1.setBounds(181, 162, 490, 30);
		contentPane.add(txtrUsername_2_1);
		
		JTextArea txtrUsername_2_2 = new JTextArea();
		txtrUsername_2_2.setText("*****");
		txtrUsername_2_2.setForeground(Color.WHITE);
		txtrUsername_2_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2_2.setBackground(new Color(0, 128, 128));
		txtrUsername_2_2.setBounds(161, 202, 510, 30);
		contentPane.add(txtrUsername_2_2);
		
		JTextArea txtrUsername_2_3 = new JTextArea();
		txtrUsername_2_3.setText("*****");
		txtrUsername_2_3.setForeground(Color.WHITE);
		txtrUsername_2_3.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2_3.setBackground(new Color(0, 128, 128));
		txtrUsername_2_3.setBounds(263, 242, 408, 30);
		contentPane.add(txtrUsername_2_3);
		
		JTextArea txtrUsername_2_4 = new JTextArea();
		txtrUsername_2_4.setText("*****");
		txtrUsername_2_4.setForeground(Color.WHITE);
		txtrUsername_2_4.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2_4.setBackground(new Color(0, 128, 128));
		txtrUsername_2_4.setBounds(297, 282, 374, 30);
		contentPane.add(txtrUsername_2_4);
		
		JTextArea txtrUsername_2_5 = new JTextArea();
		txtrUsername_2_5.setText("*****");
		txtrUsername_2_5.setForeground(Color.WHITE);
		txtrUsername_2_5.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2_5.setBackground(new Color(0, 128, 128));
		txtrUsername_2_5.setBounds(194, 322, 477, 30);
		contentPane.add(txtrUsername_2_5);
		
		JTextArea txtrUsername_2_5_1 = new JTextArea();
		txtrUsername_2_5_1.setText("*****");
		txtrUsername_2_5_1.setForeground(Color.WHITE);
		txtrUsername_2_5_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2_5_1.setBackground(new Color(0, 128, 128));
		txtrUsername_2_5_1.setBounds(206, 358, 465, 30);
		contentPane.add(txtrUsername_2_5_1);
		
		JTextArea txtrUsername_2_5_2 = new JTextArea();
		txtrUsername_2_5_2.setText("*****");
		txtrUsername_2_5_2.setForeground(Color.WHITE);
		txtrUsername_2_5_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2_5_2.setBackground(new Color(0, 128, 128));
		txtrUsername_2_5_2.setBounds(263, 398, 408, 30);
		contentPane.add(txtrUsername_2_5_2);
	}
}
