package library_system;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class S_BorrowingComplianceManagement extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					S_BorrowingComplianceManagement frame = new S_BorrowingComplianceManagement();
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
	public S_BorrowingComplianceManagement() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1310, 648);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBackground(new Color(177, 216, 216));
		textField.setBounds(1011, 244, 216, 30);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(177, 216, 216));
		textField_1.setBounds(1011, 284, 216, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(177, 216, 216));
		textField_2.setBounds(1011, 204, 216, 30);
		contentPane.add(textField_2);
		
		JTextArea txtrBorrowingComplianceManagement = new JTextArea();
		txtrBorrowingComplianceManagement.setText("BORROWING COMPLIANCE MANAGEMENT");
		txtrBorrowingComplianceManagement.setForeground(Color.WHITE);
		txtrBorrowingComplianceManagement.setFont(new Font("Arial", Font.BOLD, 30));
		txtrBorrowingComplianceManagement.setBackground(new Color(0, 128, 128));
		txtrBorrowingComplianceManagement.setBounds(44, 30, 795, 40);
		contentPane.add(txtrBorrowingComplianceManagement);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 15));
		btnSubmit.setBackground(new Color(41, 82, 82));
		btnSubmit.setBounds(1128, 453, 99, 30);
		contentPane.add(btnSubmit);
		
		JTextArea txtrPassword_1 = new JTextArea();
		txtrPassword_1.setText("Student ID");
		txtrPassword_1.setForeground(new Color(0, 128, 128));
		txtrPassword_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1.setBackground(Color.WHITE);
		txtrPassword_1.setBounds(760, 203, 107, 30);
		contentPane.add(txtrPassword_1);
		
		JTextArea txtrEmail_1 = new JTextArea();
		txtrEmail_1.setText("Full Name");
		txtrEmail_1.setForeground(new Color(0, 128, 128));
		txtrEmail_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmail_1.setBackground(Color.WHITE);
		txtrEmail_1.setBounds(760, 243, 130, 30);
		contentPane.add(txtrEmail_1);
		
		JTextArea txtrFullName_1 = new JTextArea();
		txtrFullName_1.setText("Book Title");
		txtrFullName_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1.setBackground(Color.WHITE);
		txtrFullName_1.setBounds(760, 283, 188, 30);
		contentPane.add(txtrFullName_1);
		
		JTextArea txtrEmergencyContact_1 = new JTextArea();
		txtrEmergencyContact_1.setText("Author");
		txtrEmergencyContact_1.setForeground(new Color(0, 128, 128));
		txtrEmergencyContact_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmergencyContact_1.setBackground(Color.WHITE);
		txtrEmergencyContact_1.setBounds(760, 323, 175, 30);
		contentPane.add(txtrEmergencyContact_1);
		
		JTextArea txtrFullName_1_1_1 = new JTextArea();
		txtrFullName_1_1_1.setText("Borrowed Date :");
		txtrFullName_1_1_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_1_1.setBackground(Color.WHITE);
		txtrFullName_1_1_1.setBounds(760, 363, 235, 30);
		contentPane.add(txtrFullName_1_1_1);
		
		JTextArea txtrFullName_1_2_1 = new JTextArea();
		txtrFullName_1_2_1.setText("Notes :");
		txtrFullName_1_2_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1_2_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_2_1.setBackground(Color.WHITE);
		txtrFullName_1_2_1.setBounds(760, 403, 138, 30);
		contentPane.add(txtrFullName_1_2_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(177, 216, 216));
		textField_3.setBounds(1011, 324, 216, 30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(177, 216, 216));
		textField_4.setBounds(1011, 363, 216, 30);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(177, 216, 216));
		textField_5.setBounds(1011, 403, 216, 30);
		contentPane.add(textField_5);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Arial", Font.BOLD, 15));
		btnEdit.setBackground(new Color(41, 82, 82));
		btnEdit.setBounds(1011, 453, 99, 30);
		contentPane.add(btnEdit);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Arial", Font.BOLD, 15));
		btnBack.setBackground(new Color(41, 82, 82));
		btnBack.setBounds(1151, 553, 99, 30);
		contentPane.add(btnBack);
		
		JTextArea txtrUsername_1_1 = new JTextArea();
		txtrUsername_1_1.setForeground(new Color(0, 128, 128));
		txtrUsername_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_1_1.setBackground(Color.WHITE);
		txtrUsername_1_1.setBounds(748, 120, 502, 407);
		contentPane.add(txtrUsername_1_1);
		
		JTextArea txtrPassword_1_1 = new JTextArea();
		txtrPassword_1_1.setText("Student ID :");
		txtrPassword_1_1.setForeground(Color.WHITE);
		txtrPassword_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1.setBounds(57, 121, 130, 30);
		contentPane.add(txtrPassword_1_1);
		
		JTextArea txtrEmail_1_1 = new JTextArea();
		txtrEmail_1_1.setText("Full Name :");
		txtrEmail_1_1.setForeground(Color.WHITE);
		txtrEmail_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmail_1_1.setBackground(new Color(0, 128, 128));
		txtrEmail_1_1.setBounds(57, 149, 130, 30);
		contentPane.add(txtrEmail_1_1);
		
		JTextArea txtrFullName_1_1 = new JTextArea();
		txtrFullName_1_1.setText("Book Title :");
		txtrFullName_1_1.setForeground(Color.WHITE);
		txtrFullName_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_1.setBackground(new Color(0, 128, 128));
		txtrFullName_1_1.setBounds(57, 184, 130, 30);
		contentPane.add(txtrFullName_1_1);
		
		JTextArea txtrEmergencyContact_1_1 = new JTextArea();
		txtrEmergencyContact_1_1.setText("Author :");
		txtrEmergencyContact_1_1.setForeground(Color.WHITE);
		txtrEmergencyContact_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmergencyContact_1_1.setBackground(new Color(0, 128, 128));
		txtrEmergencyContact_1_1.setBounds(57, 214, 99, 30);
		contentPane.add(txtrEmergencyContact_1_1);
		
		JTextArea txtrFullName_1_1_1_1 = new JTextArea();
		txtrFullName_1_1_1_1.setText("Borrow Date :");
		txtrFullName_1_1_1_1.setForeground(Color.WHITE);
		txtrFullName_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_1_1_1.setBackground(new Color(0, 128, 128));
		txtrFullName_1_1_1_1.setBounds(57, 271, 147, 30);
		contentPane.add(txtrFullName_1_1_1_1);
		
		JTextArea txtrFullName_1_2_1_1 = new JTextArea();
		txtrFullName_1_2_1_1.setText("Due Date :");
		txtrFullName_1_2_1_1.setForeground(Color.WHITE);
		txtrFullName_1_2_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_2_1_1.setBackground(new Color(0, 128, 128));
		txtrFullName_1_2_1_1.setBounds(57, 350, 138, 30);
		contentPane.add(txtrFullName_1_2_1_1);
		
		JTextArea txtrFullName_1_3_1_2 = new JTextArea();
		txtrFullName_1_3_1_2.setText("Return Date :");
		txtrFullName_1_3_1_2.setForeground(Color.WHITE);
		txtrFullName_1_3_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_3_1_2.setBackground(new Color(0, 128, 128));
		txtrFullName_1_3_1_2.setBounds(57, 299, 130, 30);
		contentPane.add(txtrFullName_1_3_1_2);
		
		JTextArea txtrFullName_1_3_1_1_1 = new JTextArea();
		txtrFullName_1_3_1_1_1.setText("Status of Borrowed Book :");
		txtrFullName_1_3_1_1_1.setForeground(Color.WHITE);
		txtrFullName_1_3_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_3_1_1_1.setBackground(new Color(0, 128, 128));
		txtrFullName_1_3_1_1_1.setBounds(57, 324, 254, 30);
		contentPane.add(txtrFullName_1_3_1_1_1);
		
		JTextArea txtrPassword_1_1_1 = new JTextArea();
		txtrPassword_1_1_1.setText("*****");
		txtrPassword_1_1_1.setForeground(Color.WHITE);
		txtrPassword_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_1.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_1.setBounds(210, 120, 462, 30);
		contentPane.add(txtrPassword_1_1_1);
		
		JTextArea txtrPassword_1_1_2 = new JTextArea();
		txtrPassword_1_1_2.setText("*****");
		txtrPassword_1_1_2.setForeground(Color.WHITE);
		txtrPassword_1_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_2.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_2.setBounds(197, 149, 475, 30);
		contentPane.add(txtrPassword_1_1_2);
		
		JTextArea txtrPassword_1_1_3 = new JTextArea();
		txtrPassword_1_1_3.setText("*****");
		txtrPassword_1_1_3.setForeground(Color.WHITE);
		txtrPassword_1_1_3.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_3.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_3.setBounds(197, 183, 475, 30);
		contentPane.add(txtrPassword_1_1_3);
		
		JTextArea txtrPassword_1_1_4 = new JTextArea();
		txtrPassword_1_1_4.setText("*****");
		txtrPassword_1_1_4.setForeground(Color.WHITE);
		txtrPassword_1_1_4.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_4.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_4.setBounds(166, 213, 506, 30);
		contentPane.add(txtrPassword_1_1_4);
		
		JTextArea txtrPassword_1_1_5 = new JTextArea();
		txtrPassword_1_1_5.setText("*****");
		txtrPassword_1_1_5.setForeground(Color.WHITE);
		txtrPassword_1_1_5.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_5.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_5.setBounds(214, 269, 458, 30);
		contentPane.add(txtrPassword_1_1_5);
		
		JTextArea txtrPassword_1_1_6 = new JTextArea();
		txtrPassword_1_1_6.setText("*****");
		txtrPassword_1_1_6.setForeground(Color.WHITE);
		txtrPassword_1_1_6.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_6.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_6.setBounds(197, 349, 475, 30);
		contentPane.add(txtrPassword_1_1_6);
		
		JTextArea txtrPassword_1_1_7 = new JTextArea();
		txtrPassword_1_1_7.setText("*****");
		txtrPassword_1_1_7.setForeground(Color.WHITE);
		txtrPassword_1_1_7.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_7.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_7.setBounds(210, 298, 462, 30);
		contentPane.add(txtrPassword_1_1_7);
		
		JTextArea txtrPassword_1_1_8 = new JTextArea();
		txtrPassword_1_1_8.setText("*****");
		txtrPassword_1_1_8.setForeground(Color.WHITE);
		txtrPassword_1_1_8.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_8.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_8.setBounds(325, 323, 345, 30);
		contentPane.add(txtrPassword_1_1_8);
		
		JTextArea txtrFullName_1_3_1_1_1_1 = new JTextArea();
		txtrFullName_1_3_1_1_1_1.setText("Notes :");
		txtrFullName_1_3_1_1_1_1.setForeground(Color.WHITE);
		txtrFullName_1_3_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_3_1_1_1_1.setBackground(new Color(0, 128, 128));
		txtrFullName_1_3_1_1_1_1.setBounds(57, 507, 71, 30);
		contentPane.add(txtrFullName_1_3_1_1_1_1);
		
		JTextArea txtrPassword_1_1_8_2 = new JTextArea();
		txtrPassword_1_1_8_2.setText("*****");
		txtrPassword_1_1_8_2.setForeground(Color.WHITE);
		txtrPassword_1_1_8_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_8_2.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_8_2.setBounds(143, 510, 529, 30);
		contentPane.add(txtrPassword_1_1_8_2);
		
		JTextArea txtrFullName_1_3_1_1_1_1_1 = new JTextArea();
		txtrFullName_1_3_1_1_1_1_1.setText("Fine Amount :");
		txtrFullName_1_3_1_1_1_1_1.setForeground(Color.WHITE);
		txtrFullName_1_3_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_3_1_1_1_1_1.setBackground(new Color(0, 128, 128));
		txtrFullName_1_3_1_1_1_1_1.setBounds(57, 390, 147, 30);
		contentPane.add(txtrFullName_1_3_1_1_1_1_1);
		
		JTextArea txtrFullName_1_3_1_1_1_1_2 = new JTextArea();
		txtrFullName_1_3_1_1_1_1_2.setText("Date Fine Issued :");
		txtrFullName_1_3_1_1_1_1_2.setForeground(Color.WHITE);
		txtrFullName_1_3_1_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_3_1_1_1_1_2.setBackground(new Color(0, 128, 128));
		txtrFullName_1_3_1_1_1_1_2.setBounds(57, 423, 182, 30);
		contentPane.add(txtrFullName_1_3_1_1_1_1_2);
		
		JTextArea txtrFullName_1_3_1_1_1_1_3 = new JTextArea();
		txtrFullName_1_3_1_1_1_1_3.setText("Payment Date :");
		txtrFullName_1_3_1_1_1_1_3.setForeground(Color.WHITE);
		txtrFullName_1_3_1_1_1_1_3.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_3_1_1_1_1_3.setBackground(new Color(0, 128, 128));
		txtrFullName_1_3_1_1_1_1_3.setBounds(57, 448, 158, 30);
		contentPane.add(txtrFullName_1_3_1_1_1_1_3);
		
		JTextArea txtrPassword_1_1_8_2_1 = new JTextArea();
		txtrPassword_1_1_8_2_1.setText("*****");
		txtrPassword_1_1_8_2_1.setForeground(Color.WHITE);
		txtrPassword_1_1_8_2_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_8_2_1.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_8_2_1.setBounds(227, 453, 441, 30);
		contentPane.add(txtrPassword_1_1_8_2_1);
		
		JTextArea txtrPassword_1_1_8_2_2 = new JTextArea();
		txtrPassword_1_1_8_2_2.setText("*****");
		txtrPassword_1_1_8_2_2.setForeground(Color.WHITE);
		txtrPassword_1_1_8_2_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_8_2_2.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_8_2_2.setBounds(236, 423, 436, 30);
		contentPane.add(txtrPassword_1_1_8_2_2);
		
		JTextArea txtrPassword_1_1_8_2_2_1 = new JTextArea();
		txtrPassword_1_1_8_2_2_1.setText("*****");
		txtrPassword_1_1_8_2_2_1.setForeground(Color.WHITE);
		txtrPassword_1_1_8_2_2_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_8_2_2_1.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_8_2_2_1.setBounds(218, 395, 415, 30);
		contentPane.add(txtrPassword_1_1_8_2_2_1);
	}

}
