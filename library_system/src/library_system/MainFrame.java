package library_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_2 = new JPanel();
		contentPane_2.setBounds(0, 0, 738, 490);
		contentPane_2.setLayout(null);
		contentPane_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_2.setBackground(new Color(64, 128, 128));
		contentPane.add(contentPane_2);
		
		JTextArea txtrWelcome = new JTextArea();
		txtrWelcome.setText("Welcome");
		txtrWelcome.setForeground(new Color(255, 255, 255));
		txtrWelcome.setFont(new Font("Gigi", Font.BOLD, 97));
		txtrWelcome.setBackground(new Color(64, 128, 128));
		txtrWelcome.setBounds(128, 38, 410, 105);
		contentPane_2.add(txtrWelcome);
		
		JButton btnLogIn = new JButton("LOG IN");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
                login.setVisible(true);
                dispose(); 
			}
		});
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.setFont(new Font("Arial", Font.BOLD, 15));
		btnLogIn.setBackground(new Color(0, 185, 185));
		btnLogIn.setBounds(116, 256, 193, 43);
		contentPane_2.add(btnLogIn);
		
		JButton btnManageStudents_1_4 = new JButton("REGISTER");
		btnManageStudents_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register register = new Register();
				register.setVisible(true);
				dispose(); 
			}
		});
		btnManageStudents_1_4.setForeground(Color.WHITE);
		btnManageStudents_1_4.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageStudents_1_4.setBackground(new Color(0, 185, 185));
		btnManageStudents_1_4.setBounds(319, 256, 193, 43);
		contentPane_2.add(btnManageStudents_1_4);
		
		JTextArea txtrToLibrarySystem = new JTextArea();
		txtrToLibrarySystem.setText("to Library System");
		txtrToLibrarySystem.setForeground(Color.WHITE);
		txtrToLibrarySystem.setFont(new Font("Century Gothic", Font.BOLD, 69));
		txtrToLibrarySystem.setBackground(new Color(64, 128, 128));
		txtrToLibrarySystem.setBounds(49, 134, 612, 105);
		contentPane_2.add(txtrToLibrarySystem);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBounds(371, 10, 1, 1);
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(175, 216, 216));
		contentPane.add(contentPane_1);
		
		JTextArea txtrStudentDashboard = new JTextArea();
		txtrStudentDashboard.setText("Student Dashboard");
		txtrStudentDashboard.setForeground(new Color(0, 128, 128));
		txtrStudentDashboard.setFont(new Font("Arial", Font.BOLD, 30));
		txtrStudentDashboard.setBackground(new Color(177, 216, 216));
		txtrStudentDashboard.setBounds(25, 23, 310, 43);
		contentPane_1.add(txtrStudentDashboard);
		
		JTextArea txtrStudentNumber = new JTextArea();
		txtrStudentNumber.setText("Student Number :");
		txtrStudentNumber.setForeground(new Color(0, 128, 128));
		txtrStudentNumber.setFont(new Font("Arial", Font.BOLD, 15));
		txtrStudentNumber.setBackground(new Color(177, 216, 216));
		txtrStudentNumber.setBounds(25, 85, 134, 22);
		contentPane_1.add(txtrStudentNumber);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setText("Name : ");
		txtrName.setForeground(new Color(0, 128, 128));
		txtrName.setFont(new Font("Arial", Font.BOLD, 15));
		txtrName.setBackground(new Color(177, 216, 216));
		txtrName.setBounds(25, 108, 60, 22);
		contentPane_1.add(txtrName);
		
		JTextArea txtrName_1 = new JTextArea();
		txtrName_1.setText("***");
		txtrName_1.setForeground(new Color(0, 128, 128));
		txtrName_1.setFont(new Font("Arial", Font.BOLD, 15));
		txtrName_1.setBackground(new Color(177, 216, 216));
		txtrName_1.setBounds(90, 108, 167, 22);
		contentPane_1.add(txtrName_1);
		
		JTextArea txtrLibrarianNumber_1 = new JTextArea();
		txtrLibrarianNumber_1.setText("***");
		txtrLibrarianNumber_1.setForeground(new Color(0, 128, 128));
		txtrLibrarianNumber_1.setFont(new Font("Arial", Font.BOLD, 15));
		txtrLibrarianNumber_1.setBackground(new Color(177, 216, 216));
		txtrLibrarianNumber_1.setBounds(164, 85, 134, 22);
		contentPane_1.add(txtrLibrarianNumber_1);
		
		JButton btnManageStudents = new JButton("Manage Borrowed Books");
		btnManageStudents.setForeground(Color.WHITE);
		btnManageStudents.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageStudents.setBackground(new Color(0, 128, 128));
		btnManageStudents.setBounds(26, 156, 241, 43);
		contentPane_1.add(btnManageStudents);
		
		JButton btnManageStudents_1 = new JButton("Manage Books");
		btnManageStudents_1.setForeground(Color.WHITE);
		btnManageStudents_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageStudents_1.setBackground(new Color(0, 128, 128));
		btnManageStudents_1.setBounds(296, 156, 241, 43);
		contentPane_1.add(btnManageStudents_1);
		
		JButton btnManageStudents_1_3 = new JButton("Manage Fines");
		btnManageStudents_1_3.setForeground(Color.WHITE);
		btnManageStudents_1_3.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageStudents_1_3.setBackground(new Color(0, 128, 128));
		btnManageStudents_1_3.setBounds(26, 218, 241, 43);
		contentPane_1.add(btnManageStudents_1_3);
		
		JButton btnManageStudents_1_2 = new JButton("Manage Reservations");
		btnManageStudents_1_2.setForeground(Color.WHITE);
		btnManageStudents_1_2.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageStudents_1_2.setBackground(new Color(0, 128, 128));
		btnManageStudents_1_2.setBounds(296, 218, 241, 43);
		contentPane_1.add(btnManageStudents_1_2);
		
		JButton btnManageStudents_1_1 = new JButton("Manage My Information");
		btnManageStudents_1_1.setForeground(Color.WHITE);
		btnManageStudents_1_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnManageStudents_1_1.setBackground(new Color(0, 128, 128));
		btnManageStudents_1_1.setBounds(26, 283, 511, 43);
		contentPane_1.add(btnManageStudents_1_1);
	}

}
