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
		setBounds(100, 100, 631, 339);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(177, 216, 216));
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
		
		JButton btnManageStudents = new JButton("Manage Books");
		btnManageStudents.setBounds(31, 134, 255, 43);
		btnManageStudents.setForeground(new Color(255, 255, 255));
		btnManageStudents.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageStudents.setBackground(new Color(0, 128, 128));
		contentPane.add(btnManageStudents);
		
		JButton btnManageStudents_1 = new JButton("Manage Students");
		btnManageStudents_1.setBounds(323, 134, 255, 43);
		btnManageStudents_1.setForeground(Color.WHITE);
		btnManageStudents_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageStudents_1.setBackground(new Color(0, 128, 128));
		contentPane.add(btnManageStudents_1);
		
		JButton btnManageStudents_1_1 = new JButton("Reservation Accountability Management");
		btnManageStudents_1_1.setBounds(31, 206, 547, 43);
		btnManageStudents_1_1.setForeground(Color.WHITE);
		btnManageStudents_1_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageStudents_1_1.setBackground(new Color(0, 128, 128));
		contentPane.add(btnManageStudents_1_1);
	}
}
