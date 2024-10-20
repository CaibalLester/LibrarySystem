package library_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class L_Books extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
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
					L_Books frame = new L_Books();
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
	public L_Books() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1310, 648);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrBorrowingComplianceManagement = new JTextArea();
		txtrBorrowingComplianceManagement.setText("LIBRARY BOOK INFORMATION");
		txtrBorrowingComplianceManagement.setForeground(Color.WHITE);
		txtrBorrowingComplianceManagement.setFont(new Font("Arial", Font.BOLD, 30));
		txtrBorrowingComplianceManagement.setBackground(new Color(0, 128, 128));
		txtrBorrowingComplianceManagement.setBounds(30, 20, 587, 40);
		contentPane.add(txtrBorrowingComplianceManagement);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 155, 564, 406);
		contentPane.add(scrollPane);
		

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Title", "Author", "ISBN", "Publisher", "Year Published", "Quantity", "Pages", "Status" 
				}
			));

		
		JTextArea txtrLibraryBooks = new JTextArea();
		txtrLibraryBooks.setText("Library Books");
		txtrLibraryBooks.setForeground(Color.WHITE);
		txtrLibraryBooks.setFont(new Font("Arial", Font.BOLD, 30));
		txtrLibraryBooks.setBackground(new Color(0, 128, 128));
		txtrLibraryBooks.setBounds(20, 100, 214, 40);
		contentPane.add(txtrLibraryBooks);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBackground(new Color(177, 216, 216));
		textField.setBounds(835, 155, 287, 30);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(177, 216, 216));
		textField_1.setBounds(835, 192, 287, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(177, 216, 216));
		textField_2.setBounds(835, 232, 287, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(177, 216, 216));
		textField_3.setBounds(835, 272, 287, 30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(177, 216, 216));
		textField_4.setBounds(835, 310, 287, 30);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(177, 216, 216));
		textField_5.setBounds(835, 349, 287, 30);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(177, 216, 216));
		textField_6.setBounds(835, 425, 287, 30);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(177, 216, 216));
		textField_7.setBounds(835, 389, 287, 30);
		contentPane.add(textField_7);
		
		JButton btnAddBook = new JButton("Edit Book");
		btnAddBook.setForeground(Color.WHITE);
		btnAddBook.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddBook.setBackground(new Color(41, 82, 82));
		btnAddBook.setBounds(835, 465, 130, 30);
		contentPane.add(btnAddBook);
		
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
		btnBack.setBounds(1168, 551, 99, 30);
		contentPane.add(btnBack);
		
		JTextArea txtrPassword_1_1 = new JTextArea();
		txtrPassword_1_1.setText("Title");
		txtrPassword_1_1.setForeground(Color.WHITE);
		txtrPassword_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1.setBounds(664, 159, 130, 30);
		contentPane.add(txtrPassword_1_1);
		
		JTextArea txtrPassword_1_1_1 = new JTextArea();
		txtrPassword_1_1_1.setText("Author");
		txtrPassword_1_1_1.setForeground(Color.WHITE);
		txtrPassword_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_1.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_1.setBounds(664, 192, 130, 30);
		contentPane.add(txtrPassword_1_1_1);
		
		JTextArea txtrPassword_1_1_2 = new JTextArea();
		txtrPassword_1_1_2.setText("ISBN");
		txtrPassword_1_1_2.setForeground(Color.WHITE);
		txtrPassword_1_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_2.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_2.setBounds(664, 232, 130, 30);
		contentPane.add(txtrPassword_1_1_2);
		
		JTextArea txtrPassword_1_1_3 = new JTextArea();
		txtrPassword_1_1_3.setText("Publisher");
		txtrPassword_1_1_3.setForeground(Color.WHITE);
		txtrPassword_1_1_3.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_3.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_3.setBounds(664, 272, 130, 30);
		contentPane.add(txtrPassword_1_1_3);
		
		JTextArea txtrPassword_1_1_4 = new JTextArea();
		txtrPassword_1_1_4.setText("Year Published");
		txtrPassword_1_1_4.setForeground(Color.WHITE);
		txtrPassword_1_1_4.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_4.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_4.setBounds(664, 310, 154, 30);
		contentPane.add(txtrPassword_1_1_4);
		
		JTextArea txtrPassword_1_1_5 = new JTextArea();
		txtrPassword_1_1_5.setText("Quantity");
		txtrPassword_1_1_5.setForeground(Color.WHITE);
		txtrPassword_1_1_5.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_5.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_5.setBounds(664, 349, 130, 30);
		contentPane.add(txtrPassword_1_1_5);
		
		JTextArea txtrPassword_1_1_6 = new JTextArea();
		txtrPassword_1_1_6.setText("Pages");
		txtrPassword_1_1_6.setForeground(Color.WHITE);
		txtrPassword_1_1_6.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_6.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_6.setBounds(664, 389, 130, 30);
		contentPane.add(txtrPassword_1_1_6);
		
		JTextArea txtrPassword_1_1_7 = new JTextArea();
		txtrPassword_1_1_7.setText("Status");
		txtrPassword_1_1_7.setForeground(Color.WHITE);
		txtrPassword_1_1_7.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_7.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_7.setBounds(664, 429, 130, 30);
		contentPane.add(txtrPassword_1_1_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_8.setColumns(10);
		textField_8.setBackground(new Color(255, 255, 255));
		textField_8.setBounds(259, 110, 242, 30);
		contentPane.add(textField_8);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFont(new Font("Arial", Font.BOLD, 15));
		btnSearch.setBackground(new Color(41, 82, 82));
		btnSearch.setBounds(506, 110, 99, 30);
		contentPane.add(btnSearch);
		
		JButton btnAddBook_1 = new JButton("Add Book");
		btnAddBook_1.setForeground(Color.WHITE);
		btnAddBook_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnAddBook_1.setBackground(new Color(41, 82, 82));
		btnAddBook_1.setBounds(992, 465, 130, 30);
		contentPane.add(btnAddBook_1);
	}

}
