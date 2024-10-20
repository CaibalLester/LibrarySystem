package library_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class S_Reservation extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					S_Reservation frame = new S_Reservation();
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
	public S_Reservation() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1310, 648);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(177, 216, 216));
		textField_1.setBounds(1003, 190, 216, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(177, 216, 216));
		textField_2.setBounds(1003, 230, 216, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(177, 216, 216));
		textField_3.setBounds(1003, 150, 216, 30);
		contentPane.add(textField_3);
		
		JTextArea txtrManageStudentResrvation = new JTextArea();
		txtrManageStudentResrvation.setText("STUDENT BOOK RESERVATION");
		txtrManageStudentResrvation.setForeground(Color.WHITE);
		txtrManageStudentResrvation.setFont(new Font("Arial", Font.BOLD, 30));
		txtrManageStudentResrvation.setBackground(new Color(0, 128, 128));
		txtrManageStudentResrvation.setBounds(36, 31, 505, 40);
		contentPane.add(txtrManageStudentResrvation);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 15));
		btnSubmit.setBackground(new Color(41, 82, 82));
		btnSubmit.setBounds(1120, 433, 99, 30);
		contentPane.add(btnSubmit);
		
		JTextArea txtrPassword_1 = new JTextArea();
		txtrPassword_1.setText("Student ID");
		txtrPassword_1.setForeground(new Color(0, 128, 128));
		txtrPassword_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1.setBackground(Color.WHITE);
		txtrPassword_1.setBounds(752, 149, 107, 30);
		contentPane.add(txtrPassword_1);
		
		JTextArea txtrEmail_1 = new JTextArea();
		txtrEmail_1.setText("Full Name");
		txtrEmail_1.setForeground(new Color(0, 128, 128));
		txtrEmail_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmail_1.setBackground(Color.WHITE);
		txtrEmail_1.setBounds(752, 189, 130, 30);
		contentPane.add(txtrEmail_1);
		
		JTextArea txtrFullName_1 = new JTextArea();
		txtrFullName_1.setText("Book Title");
		txtrFullName_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1.setBackground(Color.WHITE);
		txtrFullName_1.setBounds(752, 229, 188, 30);
		contentPane.add(txtrFullName_1);
		
		JTextArea txtrEmergencyContact_1 = new JTextArea();
		txtrEmergencyContact_1.setText("Reservation Date");
		txtrEmergencyContact_1.setForeground(new Color(0, 128, 128));
		txtrEmergencyContact_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmergencyContact_1.setBackground(Color.WHITE);
		txtrEmergencyContact_1.setBounds(752, 269, 175, 30);
		contentPane.add(txtrEmergencyContact_1);
		
		JTextArea txtrFullName_1_2_1 = new JTextArea();
		txtrFullName_1_2_1.setText("Pick-Up Date");
		txtrFullName_1_2_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1_2_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_2_1.setBackground(Color.WHITE);
		txtrFullName_1_2_1.setBounds(752, 309, 138, 30);
		contentPane.add(txtrFullName_1_2_1);
		
		JTextArea txtrFullName_1_3_1 = new JTextArea();
		txtrFullName_1_3_1.setText("Return Date");
		txtrFullName_1_3_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1_3_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_3_1.setBackground(Color.WHITE);
		txtrFullName_1_3_1.setBounds(752, 349, 175, 30);
		contentPane.add(txtrFullName_1_3_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(177, 216, 216));
		textField_4.setBounds(1003, 270, 216, 30);
		contentPane.add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(177, 216, 216));
		textField_6.setBounds(1003, 309, 216, 30);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(177, 216, 216));
		textField_7.setBounds(1003, 349, 216, 30);
		contentPane.add(textField_7);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Arial", Font.BOLD, 15));
		btnEdit.setBackground(new Color(41, 82, 82));
		btnEdit.setBounds(1003, 433, 99, 30);
		contentPane.add(btnEdit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDashboard studentDashboard = new StudentDashboard();
				studentDashboard.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Arial", Font.BOLD, 15));
		btnBack.setBackground(new Color(41, 82, 82));
		btnBack.setBounds(1143, 554, 99, 30);
		contentPane.add(btnBack);
		
		JTextArea txtrFullName_1_3_1_1 = new JTextArea();
		txtrFullName_1_3_1_1.setText("Reservation Notes");
		txtrFullName_1_3_1_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1_3_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_3_1_1.setBackground(Color.WHITE);
		txtrFullName_1_3_1_1.setBounds(752, 389, 175, 30);
		contentPane.add(txtrFullName_1_3_1_1);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_8.setColumns(10);
		textField_8.setBackground(new Color(177, 216, 216));
		textField_8.setBounds(1003, 393, 216, 30);
		contentPane.add(textField_8);
		
		JTextArea txtrUsername_1_1 = new JTextArea();
		txtrUsername_1_1.setForeground(new Color(0, 128, 128));
		txtrUsername_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_1_1.setBackground(Color.WHITE);
		txtrUsername_1_1.setBounds(740, 121, 502, 367);
		contentPane.add(txtrUsername_1_1);
		
		JTextArea txtrPassword_1_1 = new JTextArea();
		txtrPassword_1_1.setText("Student ID :");
		txtrPassword_1_1.setForeground(new Color(255, 255, 255));
		txtrPassword_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1.setBounds(49, 150, 130, 30);
		contentPane.add(txtrPassword_1_1);
		
		JTextArea txtrEmail_1_1 = new JTextArea();
		txtrEmail_1_1.setText("Full Name :");
		txtrEmail_1_1.setForeground(new Color(255, 255, 255));
		txtrEmail_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmail_1_1.setBackground(new Color(0, 128, 128));
		txtrEmail_1_1.setBounds(49, 190, 130, 30);
		contentPane.add(txtrEmail_1_1);
		
		JTextArea txtrFullName_1_1 = new JTextArea();
		txtrFullName_1_1.setText("Book Title :");
		txtrFullName_1_1.setForeground(new Color(255, 255, 255));
		txtrFullName_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_1.setBackground(new Color(0, 128, 128));
		txtrFullName_1_1.setBounds(49, 230, 130, 30);
		contentPane.add(txtrFullName_1_1);
		
		JTextArea txtrEmergencyContact_1_1 = new JTextArea();
		txtrEmergencyContact_1_1.setText("Reservation Date :");
		txtrEmergencyContact_1_1.setForeground(new Color(255, 255, 255));
		txtrEmergencyContact_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmergencyContact_1_1.setBackground(new Color(0, 128, 128));
		txtrEmergencyContact_1_1.setBounds(49, 270, 175, 30);
		contentPane.add(txtrEmergencyContact_1_1);
		
		JTextArea txtrFullName_1_1_1_1 = new JTextArea();
		txtrFullName_1_1_1_1.setText("Reservation Expiry Date :");
		txtrFullName_1_1_1_1.setForeground(new Color(255, 255, 255));
		txtrFullName_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_1_1_1.setBackground(new Color(0, 128, 128));
		txtrFullName_1_1_1_1.setBounds(49, 310, 254, 30);
		contentPane.add(txtrFullName_1_1_1_1);
		
		JTextArea txtrFullName_1_2_1_1 = new JTextArea();
		txtrFullName_1_2_1_1.setText("Pick-Up Date :");
		txtrFullName_1_2_1_1.setForeground(new Color(255, 255, 255));
		txtrFullName_1_2_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_2_1_1.setBackground(new Color(0, 128, 128));
		txtrFullName_1_2_1_1.setBounds(49, 350, 138, 30);
		contentPane.add(txtrFullName_1_2_1_1);
		
		JTextArea txtrFullName_1_3_1_2 = new JTextArea();
		txtrFullName_1_3_1_2.setText("Return Date :");
		txtrFullName_1_3_1_2.setForeground(new Color(255, 255, 255));
		txtrFullName_1_3_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_3_1_2.setBackground(new Color(0, 128, 128));
		txtrFullName_1_3_1_2.setBounds(49, 390, 130, 30);
		contentPane.add(txtrFullName_1_3_1_2);
		
		JTextArea txtrFullName_1_3_1_1_1 = new JTextArea();
		txtrFullName_1_3_1_1_1.setText("Reservation Notes :");
		txtrFullName_1_3_1_1_1.setForeground(new Color(255, 255, 255));
		txtrFullName_1_3_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_3_1_1_1.setBackground(new Color(0, 128, 128));
		txtrFullName_1_3_1_1_1.setBounds(49, 430, 188, 30);
		contentPane.add(txtrFullName_1_3_1_1_1);
		
		JTextArea txtrPassword_1_1_1 = new JTextArea();
		txtrPassword_1_1_1.setText("*****");
		txtrPassword_1_1_1.setForeground(Color.WHITE);
		txtrPassword_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_1.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_1.setBounds(202, 149, 462, 30);
		contentPane.add(txtrPassword_1_1_1);
		
		JTextArea txtrPassword_1_1_2 = new JTextArea();
		txtrPassword_1_1_2.setText("*****");
		txtrPassword_1_1_2.setForeground(Color.WHITE);
		txtrPassword_1_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_2.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_2.setBounds(189, 190, 475, 30);
		contentPane.add(txtrPassword_1_1_2);
		
		JTextArea txtrPassword_1_1_3 = new JTextArea();
		txtrPassword_1_1_3.setText("*****");
		txtrPassword_1_1_3.setForeground(Color.WHITE);
		txtrPassword_1_1_3.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_3.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_3.setBounds(189, 229, 475, 30);
		contentPane.add(txtrPassword_1_1_3);
		
		JTextArea txtrPassword_1_1_4 = new JTextArea();
		txtrPassword_1_1_4.setText("*****");
		txtrPassword_1_1_4.setForeground(Color.WHITE);
		txtrPassword_1_1_4.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_4.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_4.setBounds(251, 269, 413, 30);
		contentPane.add(txtrPassword_1_1_4);
		
		JTextArea txtrPassword_1_1_5 = new JTextArea();
		txtrPassword_1_1_5.setText("*****");
		txtrPassword_1_1_5.setForeground(Color.WHITE);
		txtrPassword_1_1_5.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_5.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_5.setBounds(310, 309, 354, 30);
		contentPane.add(txtrPassword_1_1_5);
		
		JTextArea txtrPassword_1_1_6 = new JTextArea();
		txtrPassword_1_1_6.setText("*****");
		txtrPassword_1_1_6.setForeground(Color.WHITE);
		txtrPassword_1_1_6.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_6.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_6.setBounds(202, 349, 462, 30);
		contentPane.add(txtrPassword_1_1_6);
		
		JTextArea txtrPassword_1_1_7 = new JTextArea();
		txtrPassword_1_1_7.setText("*****");
		txtrPassword_1_1_7.setForeground(Color.WHITE);
		txtrPassword_1_1_7.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_7.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_7.setBounds(202, 389, 462, 30);
		contentPane.add(txtrPassword_1_1_7);
		
		JTextArea txtrPassword_1_1_8 = new JTextArea();
		txtrPassword_1_1_8.setText("*****");
		txtrPassword_1_1_8.setForeground(Color.WHITE);
		txtrPassword_1_1_8.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_8.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_8.setBounds(266, 429, 413, 30);
		contentPane.add(txtrPassword_1_1_8);
	}
}
