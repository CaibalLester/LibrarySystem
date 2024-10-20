package library_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibrarianDashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianDashboard frame = new LibrarianDashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public LibrarianDashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 347);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 216, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrLibrarianDashboard = new JTextArea();
		txtrLibrarianDashboard.setBounds(31, 10, 310, 43);
		txtrLibrarianDashboard.setText("Librarian Dashboard");
		txtrLibrarianDashboard.setForeground(new Color(0, 128, 128));
		txtrLibrarianDashboard.setFont(new Font("Arial", Font.BOLD, 30));
		txtrLibrarianDashboard.setBackground(new Color(177, 216, 216));
		contentPane.add(txtrLibrarianDashboard);
		
		JTextArea txtrLibrarianNumber = new JTextArea();
		txtrLibrarianNumber.setBounds(30, 63, 144, 22);
		txtrLibrarianNumber.setText("Librarian Number :");
		txtrLibrarianNumber.setForeground(new Color(0, 128, 128));
		txtrLibrarianNumber.setFont(new Font("Arial", Font.BOLD, 15));
		txtrLibrarianNumber.setBackground(new Color(177, 216, 216));
		contentPane.add(txtrLibrarianNumber);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setBounds(30, 86, 60, 22);
		txtrName.setText("Name : ");
		txtrName.setForeground(new Color(0, 128, 128));
		txtrName.setFont(new Font("Arial", Font.BOLD, 15));
		txtrName.setBackground(new Color(177, 216, 216));
		contentPane.add(txtrName);
		
		JTextArea txtrLibrarianNumber_1 = new JTextArea();
		txtrLibrarianNumber_1.setBounds(169, 63, 134, 22);
		txtrLibrarianNumber_1.setText("***");
		txtrLibrarianNumber_1.setForeground(new Color(0, 128, 128));
		txtrLibrarianNumber_1.setFont(new Font("Arial", Font.BOLD, 15));
		txtrLibrarianNumber_1.setBackground(new Color(177, 216, 216));
		contentPane.add(txtrLibrarianNumber_1);
		
		JTextArea txtrName_1 = new JTextArea();
		txtrName_1.setBounds(86, 86, 167, 22);
		txtrName_1.setText("***");
		txtrName_1.setForeground(new Color(0, 128, 128));
		txtrName_1.setFont(new Font("Arial", Font.BOLD, 15));
		txtrName_1.setBackground(new Color(177, 216, 216));
		contentPane.add(txtrName_1);
		
		JButton btnManageStudentBooks = new JButton("Manage Student Books");
		btnManageStudentBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						L_ReservationAccountabilityManagement ReservationAccountabilityManagement = new L_ReservationAccountabilityManagement();
						ReservationAccountabilityManagement.setVisible(true);
						dispose(); 
			}
		});
		btnManageStudentBooks.setForeground(Color.WHITE);
		btnManageStudentBooks.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageStudentBooks.setBackground(new Color(0, 128, 128));
		btnManageStudentBooks.setBounds(31, 153, 241, 43);
		contentPane.add(btnManageStudentBooks);
		
		JButton btnManageBook = new JButton("Manage Books");
		btnManageBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L_Books l_Books = new L_Books();
				l_Books.setVisible(true);
				dispose(); 
			}
		});
		btnManageBook.setForeground(Color.WHITE);
		btnManageBook.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageBook.setBackground(new Color(0, 128, 128));
		btnManageBook.setBounds(301, 153, 241, 43);
		contentPane.add(btnManageBook);
		
		JButton btnManageMyInfo = new JButton("Manage My Info");
		btnManageMyInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L_LibrarianInfo LibrarianInfo = new L_LibrarianInfo();
				LibrarianInfo.setVisible(true);
				dispose(); 
			}
		});
		btnManageMyInfo.setForeground(Color.WHITE);
		btnManageMyInfo.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageMyInfo.setBackground(new Color(0, 128, 128));
		btnManageMyInfo.setBounds(31, 215, 241, 43);
		contentPane.add(btnManageMyInfo);
		
		JButton btnManageStudents = new JButton("Manage Students");
		btnManageStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L_Students Students = new L_Students();
				Students.setVisible(true);
				dispose();
			}
		});
		btnManageStudents.setForeground(Color.WHITE);
		btnManageStudents.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageStudents.setBackground(new Color(0, 128, 128));
		btnManageStudents.setBounds(301, 215, 241, 43);
		contentPane.add(btnManageStudents);
	}
}
