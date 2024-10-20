package library_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class S_Books extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextArea txtrMyBooks;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JButton btnAdd;
	private JButton btnBack;
	private JScrollPane scrollPane;
	private JTable table_1;
	private JScrollPane scrollPane_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					S_Books frame = new S_Books();
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
	public S_Books() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1310, 648);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrBorrowingComplianceManagement = new JTextArea();
		txtrBorrowingComplianceManagement.setText("STUDENT BOOK INFORMATION");
		txtrBorrowingComplianceManagement.setForeground(Color.WHITE);
		txtrBorrowingComplianceManagement.setFont(new Font("Arial", Font.BOLD, 30));
		txtrBorrowingComplianceManagement.setBackground(new Color(0, 128, 128));
		txtrBorrowingComplianceManagement.setBounds(30, 28, 522, 40);
		contentPane.add(txtrBorrowingComplianceManagement);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 163, 367, 406);
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
		txtrLibraryBooks.setBounds(20, 108, 287, 40);
		contentPane.add(txtrLibraryBooks);
		
		txtrMyBooks = new JTextArea();
		txtrMyBooks.setText("My Books");
		txtrMyBooks.setForeground(Color.WHITE);
		txtrMyBooks.setFont(new Font("Arial", Font.BOLD, 30));
		txtrMyBooks.setBackground(new Color(0, 128, 128));
		txtrMyBooks.setBounds(439, 108, 308, 40);
		contentPane.add(txtrMyBooks);
		
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBackground(new Color(177, 216, 216));
		textField.setBounds(835, 163, 287, 30);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(177, 216, 216));
		textField_1.setBounds(835, 200, 287, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(177, 216, 216));
		textField_2.setBounds(835, 240, 287, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(177, 216, 216));
		textField_3.setBounds(835, 280, 287, 30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(177, 216, 216));
		textField_4.setBounds(835, 318, 287, 30);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(177, 216, 216));
		textField_5.setBounds(835, 357, 287, 30);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(177, 216, 216));
		textField_6.setBounds(835, 433, 287, 30);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(177, 216, 216));
		textField_7.setBounds(835, 397, 287, 30);
		contentPane.add(textField_7);
		
		btnAdd = new JButton("Add");
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Arial", Font.BOLD, 15));
		btnAdd.setBackground(new Color(41, 82, 82));
		btnAdd.setBounds(1023, 473, 99, 30);
		contentPane.add(btnAdd);
		
		btnBack = new JButton("Back");
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Arial", Font.BOLD, 15));
		btnBack.setBackground(new Color(41, 82, 82));
		btnBack.setBounds(1168, 559, 99, 30);
		contentPane.add(btnBack);
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Title", "Author", "ISBN", "Publisher", "Year Published", "Quantity", "Pages", "Status" 
				}
			));
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(438, 163, 342, 406);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Title", "Author", "ISBN", "Publisher", "Year Published", "Quantity", "Pages", "Status" 
			}
		));
		
	}
}
