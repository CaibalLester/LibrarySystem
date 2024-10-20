package library_system;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class L_Students extends JFrame {

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
	private JTextField textField_8;
	private JTable table;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L_Students frame = new L_Students();
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
	public L_Students() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1310, 648);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrManageStudent = new JTextArea();
		txtrManageStudent.setText("MANAGE STUDENT INFORMATION");
		txtrManageStudent.setForeground(Color.WHITE);
		txtrManageStudent.setFont(new Font("Arial", Font.BOLD, 30));
		txtrManageStudent.setBackground(new Color(0, 128, 128));
		txtrManageStudent.setBounds(34, 25, 522, 40);
		contentPane.add(txtrManageStudent);
		
		JTextArea txtrStudentInformation = new JTextArea();
		txtrStudentInformation.setText("Student Information");
		txtrStudentInformation.setForeground(Color.WHITE);
		txtrStudentInformation.setFont(new Font("Arial", Font.BOLD, 30));
		txtrStudentInformation.setBackground(new Color(0, 128, 128));
		txtrStudentInformation.setBounds(24, 105, 307, 40);
		contentPane.add(txtrStudentInformation);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBackground(new Color(177, 216, 216));
		textField.setBounds(1017, 154, 240, 30);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(177, 216, 216));
		textField_1.setBounds(1017, 191, 240, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(177, 216, 216));
		textField_2.setBounds(1017, 231, 240, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(177, 216, 216));
		textField_3.setBounds(1017, 271, 240, 30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(177, 216, 216));
		textField_4.setBounds(1017, 309, 240, 30);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(177, 216, 216));
		textField_5.setBounds(1017, 348, 240, 30);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(177, 216, 216));
		textField_6.setBounds(1017, 424, 240, 30);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(177, 216, 216));
		textField_7.setBounds(1017, 384, 240, 30);
		contentPane.add(textField_7);
		
		JButton btnAddBook = new JButton("Add");
		btnAddBook.setForeground(Color.WHITE);
		btnAddBook.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddBook.setBackground(new Color(41, 82, 82));
		btnAddBook.setBounds(1143, 500, 114, 30);
		contentPane.add(btnAddBook);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Arial", Font.BOLD, 15));
		btnBack.setBackground(new Color(41, 82, 82));
		btnBack.setBounds(1172, 556, 99, 30);
		contentPane.add(btnBack);
		
		JTextArea txtrPassword_1_1 = new JTextArea();
		txtrPassword_1_1.setText("Student ID");
		txtrPassword_1_1.setForeground(Color.WHITE);
		txtrPassword_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1.setBounds(783, 154, 130, 30);
		contentPane.add(txtrPassword_1_1);
		
		JTextArea txtrPassword_1_1_1 = new JTextArea();
		txtrPassword_1_1_1.setText("Full Name");
		txtrPassword_1_1_1.setForeground(Color.WHITE);
		txtrPassword_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_1.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_1.setBounds(783, 187, 130, 30);
		contentPane.add(txtrPassword_1_1_1);
		
		JTextArea txtrPassword_1_1_2 = new JTextArea();
		txtrPassword_1_1_2.setText("Gender");
		txtrPassword_1_1_2.setForeground(Color.WHITE);
		txtrPassword_1_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_2.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_2.setBounds(783, 227, 130, 30);
		contentPane.add(txtrPassword_1_1_2);
		
		JTextArea txtrPassword_1_1_3 = new JTextArea();
		txtrPassword_1_1_3.setText("Email");
		txtrPassword_1_1_3.setForeground(Color.WHITE);
		txtrPassword_1_1_3.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_3.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_3.setBounds(783, 267, 130, 30);
		contentPane.add(txtrPassword_1_1_3);
		
		JTextArea txtrPassword_1_1_4 = new JTextArea();
		txtrPassword_1_1_4.setText("Contact Number");
		txtrPassword_1_1_4.setForeground(Color.WHITE);
		txtrPassword_1_1_4.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_4.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_4.setBounds(783, 305, 177, 30);
		contentPane.add(txtrPassword_1_1_4);
		
		JTextArea txtrPassword_1_1_5 = new JTextArea();
		txtrPassword_1_1_5.setText("Emergency Contact");
		txtrPassword_1_1_5.setForeground(Color.WHITE);
		txtrPassword_1_1_5.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_5.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_5.setBounds(783, 344, 200, 30);
		contentPane.add(txtrPassword_1_1_5);
		
		JTextArea txtrPassword_1_1_6 = new JTextArea();
		txtrPassword_1_1_6.setText("Program");
		txtrPassword_1_1_6.setForeground(Color.WHITE);
		txtrPassword_1_1_6.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_6.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_6.setBounds(783, 384, 130, 30);
		contentPane.add(txtrPassword_1_1_6);
		
		JTextArea txtrPassword_1_1_7 = new JTextArea();
		txtrPassword_1_1_7.setText("Year Level");
		txtrPassword_1_1_7.setForeground(Color.WHITE);
		txtrPassword_1_1_7.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_7.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_7.setBounds(783, 424, 130, 30);
		contentPane.add(txtrPassword_1_1_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_8.setColumns(10);
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(366, 115, 242, 30);
		contentPane.add(textField_8);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFont(new Font("Arial", Font.BOLD, 15));
		btnSearch.setBackground(new Color(41, 82, 82));
		btnSearch.setBounds(613, 115, 99, 30);
		contentPane.add(btnSearch);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 155, 681, 413);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Student ID", "Full Name", "Gender", "Email", "Contact Number", "Emergency Contact", "Program", "Year Level", "Student Address"
			}
		));
		
		JTextArea txtrPassword_1_1_7_1 = new JTextArea();
		txtrPassword_1_1_7_1.setText("Student Address");
		txtrPassword_1_1_7_1.setForeground(Color.WHITE);
		txtrPassword_1_1_7_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_7_1.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_7_1.setBounds(783, 459, 200, 30);
		contentPane.add(txtrPassword_1_1_7_1);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_9.setColumns(10);
		textField_9.setBackground(new Color(177, 216, 216));
		textField_9.setBounds(1017, 460, 240, 30);
		contentPane.add(textField_9);
		
		JButton btnAdd = new JButton("Edit");
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Arial", Font.BOLD, 15));
		btnAdd.setBackground(new Color(41, 82, 82));
		btnAdd.setBounds(1019, 500, 114, 30);
		contentPane.add(btnAdd);
	}

}
