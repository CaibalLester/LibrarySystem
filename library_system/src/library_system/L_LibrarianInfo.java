package library_system;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class L_LibrarianInfo extends JFrame {

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
					L_LibrarianInfo frame = new L_LibrarianInfo();
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
	public L_LibrarianInfo() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1310, 648);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrPassword = new JTextArea();
		txtrPassword.setText("Gender :");
		txtrPassword.setForeground(Color.WHITE);
		txtrPassword.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword.setBackground(new Color(0, 128, 128));
		txtrPassword.setBounds(80, 166, 107, 30);
		contentPane.add(txtrPassword);
		
		JTextArea txtrUsername = new JTextArea();
		txtrUsername.setText("Full Name :");
		txtrUsername.setForeground(Color.WHITE);
		txtrUsername.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername.setBackground(new Color(0, 128, 128));
		txtrUsername.setBounds(80, 126, 111, 30);
		contentPane.add(txtrUsername);
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setText("Email :");
		txtrEmail.setForeground(Color.WHITE);
		txtrEmail.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmail.setBackground(new Color(0, 128, 128));
		txtrEmail.setBounds(80, 206, 65, 30);
		contentPane.add(txtrEmail);
		
		JTextArea txtrFullName = new JTextArea();
		txtrFullName.setText("Contact Number :");
		txtrFullName.setForeground(Color.WHITE);
		txtrFullName.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName.setBackground(new Color(0, 128, 128));
		txtrFullName.setBounds(80, 246, 188, 30);
		contentPane.add(txtrFullName);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBackground(new Color(177, 216, 216));
		textField.setBounds(1025, 123, 216, 30);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(177, 216, 216));
		textField_1.setBounds(1025, 207, 216, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(177, 216, 216));
		textField_2.setBounds(1025, 247, 216, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(177, 216, 216));
		textField_3.setBounds(1025, 167, 216, 30);
		contentPane.add(textField_3);
		
		JTextArea txtrFullName_1_1 = new JTextArea();
		txtrFullName_1_1.setText("Program :");
		txtrFullName_1_1.setForeground(Color.WHITE);
		txtrFullName_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_1.setBackground(new Color(0, 128, 128));
		txtrFullName_1_1.setBounds(80, 326, 111, 30);
		contentPane.add(txtrFullName_1_1);
		
		JTextArea txtrFullName_1_2 = new JTextArea();
		txtrFullName_1_2.setText("Year Level :");
		txtrFullName_1_2.setForeground(Color.WHITE);
		txtrFullName_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_2.setBackground(new Color(0, 128, 128));
		txtrFullName_1_2.setBounds(80, 362, 118, 30);
		contentPane.add(txtrFullName_1_2);
		
		JTextArea txtrFullName_1_3 = new JTextArea();
		txtrFullName_1_3.setText("Librarian Address :");
		txtrFullName_1_3.setForeground(Color.WHITE);
		txtrFullName_1_3.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_3.setBackground(new Color(0, 128, 128));
		txtrFullName_1_3.setBounds(80, 402, 175, 30);
		contentPane.add(txtrFullName_1_3);
		
		JTextArea txtrEmergencyContact = new JTextArea();
		txtrEmergencyContact.setText("Emergency Contact :");
		txtrEmergencyContact.setForeground(Color.WHITE);
		txtrEmergencyContact.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmergencyContact.setBackground(new Color(0, 128, 128));
		txtrEmergencyContact.setBounds(80, 286, 202, 30);
		contentPane.add(txtrEmergencyContact);
		
		JTextArea txtrLibrarianPersonalInformation = new JTextArea();
		txtrLibrarianPersonalInformation.setText("LIBRARIAN PERSONAL INFORMATION");
		txtrLibrarianPersonalInformation.setForeground(Color.WHITE);
		txtrLibrarianPersonalInformation.setFont(new Font("Arial", Font.BOLD, 30));
		txtrLibrarianPersonalInformation.setBackground(new Color(0, 128, 128));
		txtrLibrarianPersonalInformation.setBounds(58, 32, 594, 40);
		contentPane.add(txtrLibrarianPersonalInformation);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 15));
		btnSubmit.setBackground(new Color(41, 82, 82));
		btnSubmit.setBounds(1142, 460, 99, 30);
		contentPane.add(btnSubmit);
		
		JTextArea txtrUsername_1 = new JTextArea();
		txtrUsername_1.setText("Full Name :");
		txtrUsername_1.setForeground(new Color(0, 128, 128));
		txtrUsername_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_1.setBackground(Color.WHITE);
		txtrUsername_1.setBounds(878, 122, 111, 30);
		contentPane.add(txtrUsername_1);
		
		JTextArea txtrPassword_1 = new JTextArea();
		txtrPassword_1.setText("Gender :");
		txtrPassword_1.setForeground(new Color(0, 128, 128));
		txtrPassword_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1.setBackground(Color.WHITE);
		txtrPassword_1.setBounds(902, 166, 107, 30);
		contentPane.add(txtrPassword_1);
		
		JTextArea txtrEmail_1 = new JTextArea();
		txtrEmail_1.setText("Email :");
		txtrEmail_1.setForeground(new Color(0, 128, 128));
		txtrEmail_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmail_1.setBackground(Color.WHITE);
		txtrEmail_1.setBounds(922, 206, 65, 30);
		contentPane.add(txtrEmail_1);
		
		JTextArea txtrFullName_1 = new JTextArea();
		txtrFullName_1.setText("Contact Number :");
		txtrFullName_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1.setBackground(Color.WHITE);
		txtrFullName_1.setBounds(822, 246, 188, 30);
		contentPane.add(txtrFullName_1);
		
		JTextArea txtrEmergencyContact_1 = new JTextArea();
		txtrEmergencyContact_1.setText("Emergency Contact :");
		txtrEmergencyContact_1.setForeground(new Color(0, 128, 128));
		txtrEmergencyContact_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmergencyContact_1.setBackground(Color.WHITE);
		txtrEmergencyContact_1.setBounds(791, 286, 202, 30);
		contentPane.add(txtrEmergencyContact_1);
		
		JTextArea txtrFullName_1_1_1 = new JTextArea();
		txtrFullName_1_1_1.setText("Program :");
		txtrFullName_1_1_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_1_1.setBackground(Color.WHITE);
		txtrFullName_1_1_1.setBounds(891, 326, 99, 30);
		contentPane.add(txtrFullName_1_1_1);
		
		JTextArea txtrFullName_1_2_1 = new JTextArea();
		txtrFullName_1_2_1.setText("Year Level :");
		txtrFullName_1_2_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1_2_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_2_1.setBackground(Color.WHITE);
		txtrFullName_1_2_1.setBounds(871, 362, 118, 30);
		contentPane.add(txtrFullName_1_2_1);
		
		JTextArea txtrFullName_1_3_1 = new JTextArea();
		txtrFullName_1_3_1.setText("Librarian Address :");
		txtrFullName_1_3_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1_3_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_3_1.setBackground(Color.WHITE);
		txtrFullName_1_3_1.setBounds(814, 402, 175, 30);
		contentPane.add(txtrFullName_1_3_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(177, 216, 216));
		textField_4.setBounds(1025, 287, 216, 30);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(177, 216, 216));
		textField_5.setBounds(1025, 326, 216, 30);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(177, 216, 216));
		textField_6.setBounds(1025, 362, 216, 30);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(177, 216, 216));
		textField_7.setBounds(1025, 402, 216, 30);
		contentPane.add(textField_7);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Arial", Font.BOLD, 15));
		btnEdit.setBackground(new Color(41, 82, 82));
		btnEdit.setBounds(1033, 460, 99, 30);
		contentPane.add(btnEdit);
		
		JTextArea txtrUsername_1_1 = new JTextArea();
		txtrUsername_1_1.setForeground(new Color(0, 128, 128));
		txtrUsername_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_1_1.setBackground(Color.WHITE);
		txtrUsername_1_1.setBounds(779, 97, 488, 417);
		contentPane.add(txtrUsername_1_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianDashboard librarianDashboard = new LibrarianDashboard();
				librarianDashboard.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Arial", Font.BOLD, 15));
		btnBack.setBackground(new Color(41, 82, 82));
		btnBack.setBounds(1165, 555, 99, 30);
		contentPane.add(btnBack);
		
		JTextArea txtrUsername_2 = new JTextArea();
		txtrUsername_2.setText("*****");
		txtrUsername_2.setForeground(Color.WHITE);
		txtrUsername_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2.setBackground(new Color(0, 128, 128));
		txtrUsername_2.setBounds(213, 126, 465, 30);
		contentPane.add(txtrUsername_2);
		
		JTextArea txtrUsername_2_1 = new JTextArea();
		txtrUsername_2_1.setText("*****");
		txtrUsername_2_1.setForeground(Color.WHITE);
		txtrUsername_2_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2_1.setBackground(new Color(0, 128, 128));
		txtrUsername_2_1.setBounds(188, 166, 490, 30);
		contentPane.add(txtrUsername_2_1);
		
		JTextArea txtrUsername_2_2 = new JTextArea();
		txtrUsername_2_2.setText("*****");
		txtrUsername_2_2.setForeground(Color.WHITE);
		txtrUsername_2_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2_2.setBackground(new Color(0, 128, 128));
		txtrUsername_2_2.setBounds(168, 206, 510, 30);
		contentPane.add(txtrUsername_2_2);
		
		JTextArea txtrUsername_2_3 = new JTextArea();
		txtrUsername_2_3.setText("*****");
		txtrUsername_2_3.setForeground(Color.WHITE);
		txtrUsername_2_3.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2_3.setBackground(new Color(0, 128, 128));
		txtrUsername_2_3.setBounds(270, 246, 408, 30);
		contentPane.add(txtrUsername_2_3);
		
		JTextArea txtrUsername_2_4 = new JTextArea();
		txtrUsername_2_4.setText("*****");
		txtrUsername_2_4.setForeground(Color.WHITE);
		txtrUsername_2_4.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2_4.setBackground(new Color(0, 128, 128));
		txtrUsername_2_4.setBounds(304, 286, 374, 30);
		contentPane.add(txtrUsername_2_4);
		
		JTextArea txtrUsername_2_5 = new JTextArea();
		txtrUsername_2_5.setText("*****");
		txtrUsername_2_5.setForeground(Color.WHITE);
		txtrUsername_2_5.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2_5.setBackground(new Color(0, 128, 128));
		txtrUsername_2_5.setBounds(201, 326, 477, 30);
		contentPane.add(txtrUsername_2_5);
		
		JTextArea txtrUsername_2_5_1 = new JTextArea();
		txtrUsername_2_5_1.setText("*****");
		txtrUsername_2_5_1.setForeground(Color.WHITE);
		txtrUsername_2_5_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2_5_1.setBackground(new Color(0, 128, 128));
		txtrUsername_2_5_1.setBounds(213, 362, 465, 30);
		contentPane.add(txtrUsername_2_5_1);
		
		JTextArea txtrUsername_2_5_2 = new JTextArea();
		txtrUsername_2_5_2.setText("*****");
		txtrUsername_2_5_2.setForeground(Color.WHITE);
		txtrUsername_2_5_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2_5_2.setBackground(new Color(0, 128, 128));
		txtrUsername_2_5_2.setBounds(270, 402, 408, 30);
		contentPane.add(txtrUsername_2_5_2);
	}

}
