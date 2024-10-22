package library_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
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
		setBounds(100, 100, 465, 395);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 216, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JTextArea txtrLibrarianDashboard = new JTextArea();
		txtrLibrarianDashboard.setBounds(114, 9, 310, 43);
		txtrLibrarianDashboard.setText("Librarian Dashboard");
		txtrLibrarianDashboard.setForeground(new Color(0, 128, 128));
		txtrLibrarianDashboard.setFont(new Font("Arial", Font.BOLD, 30));
		txtrLibrarianDashboard.setBackground(new Color(177, 216, 216));
		contentPane.add(txtrLibrarianDashboard);
		
		
		JTextArea txtrLibrarianNumber = new JTextArea();
		txtrLibrarianNumber.setBounds(113, 62, 144, 22);
		txtrLibrarianNumber.setText("Librarian Number :");
		txtrLibrarianNumber.setForeground(new Color(0, 128, 128));
		txtrLibrarianNumber.setFont(new Font("Arial", Font.BOLD, 15));
		txtrLibrarianNumber.setBackground(new Color(177, 216, 216));
		contentPane.add(txtrLibrarianNumber);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setBounds(113, 85, 60, 22);
		txtrName.setText("Name : ");
		txtrName.setForeground(new Color(0, 128, 128));
		txtrName.setFont(new Font("Arial", Font.BOLD, 15));
		txtrName.setBackground(new Color(177, 216, 216));
		contentPane.add(txtrName);
		
		JTextArea txtrLibrarianNumber_1 = new JTextArea();
		txtrLibrarianNumber_1.setBounds(262, 62, 134, 22);
		txtrLibrarianNumber_1.setText("***");
		txtrLibrarianNumber_1.setForeground(new Color(0, 128, 128));
		txtrLibrarianNumber_1.setFont(new Font("Arial", Font.BOLD, 15));
		txtrLibrarianNumber_1.setBackground(new Color(177, 216, 216));
		contentPane.add(txtrLibrarianNumber_1);
		
		JTextArea txtrName_1 = new JTextArea();
		txtrName_1.setBounds(183, 85, 167, 22);
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
		btnManageStudentBooks.setBounds(114, 125, 241, 43);
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
		btnManageBook.setBounds(114, 232, 241, 43);
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
		btnManageMyInfo.setBounds(114, 178, 241, 43);
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
		btnManageStudents.setBounds(114, 286, 241, 43);
		contentPane.add(btnManageStudents);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/stwo.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(31, 0, 60, 382);
		contentPane.add(lblNewLabel);
	}
}
