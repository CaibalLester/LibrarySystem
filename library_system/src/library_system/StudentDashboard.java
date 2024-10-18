package library_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.JButton;

public class StudentDashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDashboard frame = new StudentDashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StudentDashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 406);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 216, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrStudentDashboard = new JTextArea();
		txtrStudentDashboard.setText("Student Dashboard");
		txtrStudentDashboard.setForeground(new Color(0, 128, 128));
		txtrStudentDashboard.setFont(new Font("Arial", Font.BOLD, 30));
		txtrStudentDashboard.setBackground(new Color(177, 216, 216));
		txtrStudentDashboard.setBounds(25, 23, 310, 43);
		contentPane.add(txtrStudentDashboard);
		
		JTextArea txtrStudentNumber = new JTextArea();
		txtrStudentNumber.setText("Student Number :");
		txtrStudentNumber.setForeground(new Color(0, 128, 128));
		txtrStudentNumber.setFont(new Font("Arial", Font.BOLD, 15));
		txtrStudentNumber.setBackground(new Color(177, 216, 216));
		txtrStudentNumber.setBounds(25, 85, 134, 22);
		contentPane.add(txtrStudentNumber);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setText("Name : ");
		txtrName.setForeground(new Color(0, 128, 128));
		txtrName.setFont(new Font("Arial", Font.BOLD, 15));
		txtrName.setBackground(new Color(177, 216, 216));
		txtrName.setBounds(25, 108, 60, 22);
		contentPane.add(txtrName);
		
		JTextArea txtrName_1 = new JTextArea();
		txtrName_1.setText("***");
		txtrName_1.setForeground(new Color(0, 128, 128));
		txtrName_1.setFont(new Font("Arial", Font.BOLD, 15));
		txtrName_1.setBackground(new Color(177, 216, 216));
		txtrName_1.setBounds(90, 108, 167, 22);
		contentPane.add(txtrName_1);
		
		JTextArea txtrLibrarianNumber_1 = new JTextArea();
		txtrLibrarianNumber_1.setText("***");
		txtrLibrarianNumber_1.setForeground(new Color(0, 128, 128));
		txtrLibrarianNumber_1.setFont(new Font("Arial", Font.BOLD, 15));
		txtrLibrarianNumber_1.setBackground(new Color(177, 216, 216));
		txtrLibrarianNumber_1.setBounds(164, 85, 134, 22);
		contentPane.add(txtrLibrarianNumber_1);
		
		JButton btnManageStudents = new JButton("Manage Borrowed Books");
		btnManageStudents.setForeground(Color.WHITE);
		btnManageStudents.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageStudents.setBackground(new Color(0, 128, 128));
		btnManageStudents.setBounds(26, 156, 241, 43);
		contentPane.add(btnManageStudents);
		
		JButton btnManageStudents_1 = new JButton("Manage Books");
		btnManageStudents_1.setForeground(Color.WHITE);
		btnManageStudents_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageStudents_1.setBackground(new Color(0, 128, 128));
		btnManageStudents_1.setBounds(296, 156, 241, 43);
		contentPane.add(btnManageStudents_1);
		
		JButton btnManageStudents_1_3 = new JButton("Manage Fines");
		btnManageStudents_1_3.setForeground(Color.WHITE);
		btnManageStudents_1_3.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageStudents_1_3.setBackground(new Color(0, 128, 128));
		btnManageStudents_1_3.setBounds(26, 218, 241, 43);
		contentPane.add(btnManageStudents_1_3);
		
		JButton btnManageStudents_1_2 = new JButton("Manage Reservations");
		btnManageStudents_1_2.setForeground(Color.WHITE);
		btnManageStudents_1_2.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageStudents_1_2.setBackground(new Color(0, 128, 128));
		btnManageStudents_1_2.setBounds(296, 218, 241, 43);
		contentPane.add(btnManageStudents_1_2);
		
		JButton btnManageStudents_1_1 = new JButton("Manage My Information");
		btnManageStudents_1_1.setForeground(Color.WHITE);
		btnManageStudents_1_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageStudents_1_1.setBackground(new Color(0, 128, 128));
		btnManageStudents_1_1.setBounds(26, 283, 511, 43);
		contentPane.add(btnManageStudents_1_1);
	}
}
