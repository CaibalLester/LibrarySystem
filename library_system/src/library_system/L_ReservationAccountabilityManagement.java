package library_system;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class L_ReservationAccountabilityManagement extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField txtUsername;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L_ReservationAccountabilityManagement frame = new L_ReservationAccountabilityManagement();
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
	public L_ReservationAccountabilityManagement() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1310, 648);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrReservationAccountabilityManagement = new JTextArea();
		txtrReservationAccountabilityManagement.setText("RESERVATION ACCOUNTABILITY MANAGEMENT");
		txtrReservationAccountabilityManagement.setForeground(Color.WHITE);
		txtrReservationAccountabilityManagement.setFont(new Font("Arial", Font.BOLD, 30));
		txtrReservationAccountabilityManagement.setBackground(new Color(0, 128, 128));
		txtrReservationAccountabilityManagement.setBounds(37, 23, 795, 40);
		contentPane.add(txtrReservationAccountabilityManagement);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 384, 495, 197);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Student ID", "Full Name", "Book Title", "Reservation Date", "Reservation Expiry Date", "Pick-up Date", "Return Date", "Notes"
			}
		));
		
		JTextArea txtrManageStudentResrvation = new JTextArea();
		txtrManageStudentResrvation.setText("Manage Student Resrvation");
		txtrManageStudentResrvation.setForeground(Color.WHITE);
		txtrManageStudentResrvation.setFont(new Font("Arial", Font.BOLD, 30));
		txtrManageStudentResrvation.setBackground(new Color(0, 128, 128));
		txtrManageStudentResrvation.setBounds(26, 330, 482, 40);
		contentPane.add(txtrManageStudentResrvation);
		
		JTextArea txtrManageStudentBook = new JTextArea();
		txtrManageStudentBook.setText("Manage Student Book Borrowed");
		txtrManageStudentBook.setForeground(Color.WHITE);
		txtrManageStudentBook.setFont(new Font("Arial", Font.BOLD, 30));
		txtrManageStudentBook.setBackground(new Color(0, 128, 128));
		txtrManageStudentBook.setBounds(20, 73, 482, 40);
		contentPane.add(txtrManageStudentBook);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(30, 123, 495, 197);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Student ID", "Full Name", "Book Title", "Author", "Borrow Date", "Return Date", "Status of Borrowed Book", "Due Date", "Fine Amount", "Date Fine Issued", "Payment Date", "Notes"
			}
		));
		
		txtUsername = new JTextField();
		txtUsername.setToolTipText("user");
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 14));
		txtUsername.setColumns(10);
		txtUsername.setBackground(new Color(177, 216, 216));
		txtUsername.setBounds(569, 127, 216, 23);
		contentPane.add(txtUsername);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(177, 216, 216));
		textField_1.setBounds(569, 160, 216, 23);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(177, 216, 216));
		textField_2.setBounds(569, 193, 216, 23);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(177, 216, 216));
		textField_3.setBounds(569, 226, 216, 23);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(177, 216, 216));
		textField_4.setBounds(569, 259, 216, 23);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(177, 216, 216));
		textField_5.setBounds(569, 292, 216, 23);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(177, 216, 216));
		textField_6.setBounds(814, 292, 216, 23);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(177, 216, 216));
		textField_7.setBounds(814, 259, 216, 23);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_8.setColumns(10);
		textField_8.setBackground(new Color(177, 216, 216));
		textField_8.setBounds(814, 226, 216, 23);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_9.setColumns(10);
		textField_9.setBackground(new Color(177, 216, 216));
		textField_9.setBounds(814, 193, 216, 23);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_10.setColumns(10);
		textField_10.setBackground(new Color(177, 216, 216));
		textField_10.setBounds(814, 160, 216, 23);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_11.setColumns(10);
		textField_11.setBackground(new Color(177, 216, 216));
		textField_11.setBounds(814, 127, 216, 23);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_12.setColumns(10);
		textField_12.setBackground(new Color(177, 216, 216));
		textField_12.setBounds(569, 483, 216, 23);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_13.setColumns(10);
		textField_13.setBackground(new Color(177, 216, 216));
		textField_13.setBounds(569, 450, 216, 23);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_14.setColumns(10);
		textField_14.setBackground(new Color(177, 216, 216));
		textField_14.setBounds(569, 417, 216, 23);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_15.setColumns(10);
		textField_15.setBackground(new Color(177, 216, 216));
		textField_15.setBounds(569, 384, 216, 23);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_16.setColumns(10);
		textField_16.setBackground(new Color(177, 216, 216));
		textField_16.setBounds(814, 384, 216, 23);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_17.setColumns(10);
		textField_17.setBackground(new Color(177, 216, 216));
		textField_17.setBounds(814, 417, 216, 23);
		contentPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_18.setColumns(10);
		textField_18.setBackground(new Color(177, 216, 216));
		textField_18.setBounds(814, 450, 216, 23);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_19.setColumns(10);
		textField_19.setBackground(new Color(177, 216, 216));
		textField_19.setBounds(814, 483, 216, 23);
		contentPane.add(textField_19);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianDashboard librarianDashboard = new LibrarianDashboard("userID");
				librarianDashboard.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Arial", Font.BOLD, 15));
		btnBack.setBackground(new Color(41, 82, 82));
		btnBack.setBounds(1165, 560, 99, 30);
		contentPane.add(btnBack);
		
		JButton btnEdit_1 = new JButton("Edit");
		btnEdit_1.setForeground(Color.WHITE);
		btnEdit_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnEdit_1.setBackground(new Color(41, 82, 82));
		btnEdit_1.setBounds(1056, 384, 99, 30);
		contentPane.add(btnEdit_1);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Arial", Font.BOLD, 15));
		btnEdit.setBackground(new Color(41, 82, 82));
		btnEdit.setBounds(1056, 126, 99, 30);
		contentPane.add(btnEdit);
		
		JButton btnSubmit = new JButton("Save");
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 15));
		btnSubmit.setBackground(new Color(41, 82, 82));
		btnSubmit.setBounds(1056, 162, 99, 30);
		contentPane.add(btnSubmit);
		
		JButton btnSave = new JButton("Save");
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Arial", Font.BOLD, 15));
		btnSave.setBackground(new Color(41, 82, 82));
		btnSave.setBounds(1056, 419, 99, 30);
		contentPane.add(btnSave);
	}

}
