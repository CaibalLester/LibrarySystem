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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 577, 347);
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
		
		JButton btnManageBorrowing = new JButton("Manage Borrowed Books");
		btnManageBorrowing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				S_BorrowingComplianceManagement BorrowingComplianceManagement = new S_BorrowingComplianceManagement();
				BorrowingComplianceManagement.setVisible(true);
				dispose();
			}
		});
		btnManageBorrowing.setForeground(Color.WHITE);
		btnManageBorrowing.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageBorrowing.setBackground(new Color(0, 128, 128));
		btnManageBorrowing.setBounds(26, 156, 241, 43);
		contentPane.add(btnManageBorrowing);
		
		JButton btnManageBooks = new JButton("Manage Books");
		btnManageBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				S_Books SBooks = new S_Books();
				SBooks.setVisible(true);
				dispose();
			}
		});
		btnManageBooks.setForeground(Color.WHITE);
		btnManageBooks.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageBooks.setBackground(new Color(0, 128, 128));
		btnManageBooks.setBounds(296, 156, 241, 43);
		contentPane.add(btnManageBooks);
		
		JButton btnManageStudentInfo = new JButton("Manage My Info");
		btnManageStudentInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				S_StudentInfo SStudentInfo = new S_StudentInfo();
				SStudentInfo.setVisible(true);
				dispose();
			}
		});
		btnManageStudentInfo.setForeground(Color.WHITE);
		btnManageStudentInfo.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageStudentInfo.setBackground(new Color(0, 128, 128));
		btnManageStudentInfo.setBounds(26, 218, 241, 43);
		contentPane.add(btnManageStudentInfo);
		
		JButton btnManageReserve = new JButton("Manage Reservations");
		btnManageReserve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				S_Reservation SReservation = new S_Reservation();
				SReservation.setVisible(true);
				dispose();
			}
		});
		btnManageReserve.setForeground(Color.WHITE);
		btnManageReserve.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageReserve.setBackground(new Color(0, 128, 128));
		btnManageReserve.setBounds(296, 218, 241, 43);
		contentPane.add(btnManageReserve);
	}
}
