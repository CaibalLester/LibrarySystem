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
import com.toedter.calendar.JDateChooser;

public class L_ReservationAccountabilityManagement extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField txtUsername;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
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
		scrollPane.setBounds(26, 393, 495, 197);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
		    new Object[][] {},
		    new String[] {
		        "Student ID", "Full Name", "Book Title", "Reservation Date", 
		        "Reservation Expiry Date", "Pick-up Date", "Return Date", "Notes"
		    }
		));

		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setViewportView(table);

		
		JTextArea txtrManageStudentResrvation = new JTextArea();
		txtrManageStudentResrvation.setText("Manage Student Resrvation");
		txtrManageStudentResrvation.setForeground(Color.WHITE);
		txtrManageStudentResrvation.setFont(new Font("Arial", Font.BOLD, 30));
		txtrManageStudentResrvation.setBackground(new Color(0, 128, 128));
		txtrManageStudentResrvation.setBounds(20, 349, 482, 40);
		contentPane.add(txtrManageStudentResrvation);
		
		JTextArea txtrManageStudentBook = new JTextArea();
		txtrManageStudentBook.setText("Manage Student Book Borrowed");
		txtrManageStudentBook.setForeground(Color.WHITE);
		txtrManageStudentBook.setFont(new Font("Arial", Font.BOLD, 30));
		txtrManageStudentBook.setBackground(new Color(0, 128, 128));
		txtrManageStudentBook.setBounds(20, 73, 482, 40);
		contentPane.add(txtrManageStudentBook);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(30, 123, 495, 216);
		scrollPane_1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		contentPane.add(scrollPane_1);

		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
		    new Object[][] {},
		    new String[] {
		        "Student ID", "Full Name", "Book Title", "Author", "Borrow Date", "Return Date", 
		        "Status of Borrowed Book", "Due Date", "Fine Amount", "Date Fine Issued", "Payment Date", "Notes"
		    }
		));

		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane_1.setViewportView(table_1);

		
		txtUsername = new JTextField();
		txtUsername.setToolTipText("user");
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 14));
		txtUsername.setColumns(10);
		txtUsername.setBackground(new Color(177, 216, 216));
		txtUsername.setBounds(547, 149, 174, 23);
		contentPane.add(txtUsername);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(177, 216, 216));
		textField_1.setBounds(547, 198, 174, 23);
		contentPane.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(177, 216, 216));
		textField_3.setBounds(547, 250, 174, 23);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(177, 216, 216));
		textField_4.setBounds(547, 298, 174, 23);
		contentPane.add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(177, 216, 216));
		textField_6.setBounds(965, 298, 170, 23);
		contentPane.add(textField_6);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_8.setColumns(10);
		textField_8.setBackground(new Color(177, 216, 216));
		textField_8.setBounds(758, 250, 166, 23);
		contentPane.add(textField_8);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_10.setColumns(10);
		textField_10.setBackground(new Color(177, 216, 216));
		textField_10.setBounds(965, 149, 170, 23);
		contentPane.add(textField_10);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_13.setColumns(10);
		textField_13.setBackground(new Color(177, 216, 216));
		textField_13.setBounds(547, 508, 216, 23);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_14.setColumns(10);
		textField_14.setBackground(new Color(177, 216, 216));
		textField_14.setBounds(547, 463, 216, 23);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_15.setColumns(10);
		textField_15.setBackground(new Color(177, 216, 216));
		textField_15.setBounds(547, 419, 216, 23);
		contentPane.add(textField_15);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_19.setColumns(10);
		textField_19.setBackground(new Color(177, 216, 216));
		textField_19.setBounds(792, 552, 216, 23);
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
		btnEdit_1.setBounds(1036, 421, 99, 30);
		contentPane.add(btnEdit_1);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Arial", Font.BOLD, 15));
		btnEdit.setBackground(new Color(41, 82, 82));
		btnEdit.setBounds(1165, 149, 99, 30);
		contentPane.add(btnEdit);
		
		JButton btnSubmit = new JButton("Save");
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 15));
		btnSubmit.setBackground(new Color(41, 82, 82));
		btnSubmit.setBounds(1165, 185, 99, 30);
		contentPane.add(btnSubmit);
		
		JButton btnSave = new JButton("Save");
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Arial", Font.BOLD, 15));
		btnSave.setBackground(new Color(41, 82, 82));
		btnSave.setBounds(1036, 456, 99, 30);
		contentPane.add(btnSave);
		
		JTextArea txtrStudenId = new JTextArea();
		txtrStudenId.setText("Studen ID :");
		txtrStudenId.setForeground(Color.WHITE);
		txtrStudenId.setFont(new Font("Arial", Font.BOLD, 14));
		txtrStudenId.setBackground(new Color(0, 128, 128));
		txtrStudenId.setBounds(547, 123, 111, 23);
		contentPane.add(txtrStudenId);
		
		JTextArea txtrFullName = new JTextArea();
		txtrFullName.setText("Full Name :");
		txtrFullName.setForeground(Color.WHITE);
		txtrFullName.setFont(new Font("Arial", Font.BOLD, 14));
		txtrFullName.setBackground(new Color(0, 128, 128));
		txtrFullName.setBounds(547, 175, 111, 23);
		contentPane.add(txtrFullName);
		
		JTextArea txtrBookTitle = new JTextArea();
		txtrBookTitle.setText("Book Title :");
		txtrBookTitle.setForeground(Color.WHITE);
		txtrBookTitle.setFont(new Font("Arial", Font.BOLD, 14));
		txtrBookTitle.setBackground(new Color(0, 128, 128));
		txtrBookTitle.setBounds(547, 228, 111, 23);
		contentPane.add(txtrBookTitle);
		
		JTextArea txtrAuthor = new JTextArea();
		txtrAuthor.setText("Author :");
		txtrAuthor.setForeground(Color.WHITE);
		txtrAuthor.setFont(new Font("Arial", Font.BOLD, 14));
		txtrAuthor.setBackground(new Color(0, 128, 128));
		txtrAuthor.setBounds(547, 277, 111, 23);
		contentPane.add(txtrAuthor);
		
		JTextArea txtrBorrowDate = new JTextArea();
		txtrBorrowDate.setText("Borrow Date :");
		txtrBorrowDate.setForeground(Color.WHITE);
		txtrBorrowDate.setFont(new Font("Arial", Font.BOLD, 14));
		txtrBorrowDate.setBackground(new Color(0, 128, 128));
		txtrBorrowDate.setBounds(758, 124, 111, 23);
		contentPane.add(txtrBorrowDate);
		
		JTextArea txtrReturnDate = new JTextArea();
		txtrReturnDate.setText("Return Date : ");
		txtrReturnDate.setForeground(Color.WHITE);
		txtrReturnDate.setFont(new Font("Arial", Font.BOLD, 14));
		txtrReturnDate.setBackground(new Color(0, 128, 128));
		txtrReturnDate.setBounds(758, 174, 111, 23);
		contentPane.add(txtrReturnDate);
		
		JTextArea txtrStatusOfBorrowed = new JTextArea();
		txtrStatusOfBorrowed.setText("Status of Borrowed Book :");
		txtrStatusOfBorrowed.setForeground(Color.WHITE);
		txtrStatusOfBorrowed.setFont(new Font("Arial", Font.BOLD, 14));
		txtrStatusOfBorrowed.setBackground(new Color(0, 128, 128));
		txtrStatusOfBorrowed.setBounds(758, 231, 185, 23);
		contentPane.add(txtrStatusOfBorrowed);
		
		JTextArea txtrDueDate = new JTextArea();
		txtrDueDate.setText("Due Date :");
		txtrDueDate.setForeground(Color.WHITE);
		txtrDueDate.setFont(new Font("Arial", Font.BOLD, 14));
		txtrDueDate.setBackground(new Color(0, 128, 128));
		txtrDueDate.setBounds(758, 276, 111, 23);
		contentPane.add(txtrDueDate);
		
		JTextArea txtrFineAmount = new JTextArea();
		txtrFineAmount.setText("Fine Amount :");
		txtrFineAmount.setForeground(Color.WHITE);
		txtrFineAmount.setFont(new Font("Arial", Font.BOLD, 14));
		txtrFineAmount.setBackground(new Color(0, 128, 128));
		txtrFineAmount.setBounds(965, 124, 111, 23);
		contentPane.add(txtrFineAmount);
		
		JTextArea txtrDateFineIssued = new JTextArea();
		txtrDateFineIssued.setText("Date Fine Issued :");
		txtrDateFineIssued.setForeground(Color.WHITE);
		txtrDateFineIssued.setFont(new Font("Arial", Font.BOLD, 14));
		txtrDateFineIssued.setBackground(new Color(0, 128, 128));
		txtrDateFineIssued.setBounds(965, 175, 139, 23);
		contentPane.add(txtrDateFineIssued);
		
		JTextArea txtrPaymentDate = new JTextArea();
		txtrPaymentDate.setText("Payment Date :");
		txtrPaymentDate.setForeground(Color.WHITE);
		txtrPaymentDate.setFont(new Font("Arial", Font.BOLD, 14));
		txtrPaymentDate.setBackground(new Color(0, 128, 128));
		txtrPaymentDate.setBounds(965, 227, 111, 23);
		contentPane.add(txtrPaymentDate);
		
		JTextArea txtrNotes = new JTextArea();
		txtrNotes.setText("Notes :");
		txtrNotes.setForeground(Color.WHITE);
		txtrNotes.setFont(new Font("Arial", Font.BOLD, 14));
		txtrNotes.setBackground(new Color(0, 128, 128));
		txtrNotes.setBounds(965, 276, 111, 23);
		contentPane.add(txtrNotes);
		
		JTextArea txtrStudentId = new JTextArea();
		txtrStudentId.setText("Student ID :");
		txtrStudentId.setForeground(Color.WHITE);
		txtrStudentId.setFont(new Font("Arial", Font.BOLD, 14));
		txtrStudentId.setBackground(new Color(0, 128, 128));
		txtrStudentId.setBounds(547, 394, 111, 23);
		contentPane.add(txtrStudentId);
		
		JTextArea txtrFullName_1 = new JTextArea();
		txtrFullName_1.setText("Full Name :");
		txtrFullName_1.setForeground(Color.WHITE);
		txtrFullName_1.setFont(new Font("Arial", Font.BOLD, 14));
		txtrFullName_1.setBackground(new Color(0, 128, 128));
		txtrFullName_1.setBounds(547, 442, 111, 23);
		contentPane.add(txtrFullName_1);
		
		JTextArea txtrBookTitle_1 = new JTextArea();
		txtrBookTitle_1.setText("Book Title :");
		txtrBookTitle_1.setForeground(Color.WHITE);
		txtrBookTitle_1.setFont(new Font("Arial", Font.BOLD, 14));
		txtrBookTitle_1.setBackground(new Color(0, 128, 128));
		txtrBookTitle_1.setBounds(547, 486, 111, 23);
		contentPane.add(txtrBookTitle_1);
		
		JTextArea txtrResrvationDate = new JTextArea();
		txtrResrvationDate.setText("Resrvation Date :");
		txtrResrvationDate.setForeground(Color.WHITE);
		txtrResrvationDate.setFont(new Font("Arial", Font.BOLD, 14));
		txtrResrvationDate.setBackground(new Color(0, 128, 128));
		txtrResrvationDate.setBounds(547, 531, 134, 22);
		contentPane.add(txtrResrvationDate);
		
		JTextArea txtrReservationExpiryDate = new JTextArea();
		txtrReservationExpiryDate.setText("Reservation Expiry Date :");
		txtrReservationExpiryDate.setForeground(Color.WHITE);
		txtrReservationExpiryDate.setFont(new Font("Arial", Font.BOLD, 14));
		txtrReservationExpiryDate.setBackground(new Color(0, 128, 128));
		txtrReservationExpiryDate.setBounds(792, 394, 185, 23);
		contentPane.add(txtrReservationExpiryDate);
		
		JTextArea txtrPickupDate = new JTextArea();
		txtrPickupDate.setText("Pick-Up Date :");
		txtrPickupDate.setForeground(Color.WHITE);
		txtrPickupDate.setFont(new Font("Arial", Font.BOLD, 14));
		txtrPickupDate.setBackground(new Color(0, 128, 128));
		txtrPickupDate.setBounds(792, 441, 111, 23);
		contentPane.add(txtrPickupDate);
		
		JTextArea txtrReturnDate_1 = new JTextArea();
		txtrReturnDate_1.setText("Return Date :");
		txtrReturnDate_1.setForeground(Color.WHITE);
		txtrReturnDate_1.setFont(new Font("Arial", Font.BOLD, 14));
		txtrReturnDate_1.setBackground(new Color(0, 128, 128));
		txtrReturnDate_1.setBounds(792, 485, 111, 23);
		contentPane.add(txtrReturnDate_1);
		
		JTextArea txtrReservationNotes = new JTextArea();
		txtrReservationNotes.setText("Reservation Notes :");
		txtrReservationNotes.setForeground(Color.WHITE);
		txtrReservationNotes.setFont(new Font("Arial", Font.BOLD, 14));
		txtrReservationNotes.setBackground(new Color(0, 128, 128));
		txtrReservationNotes.setBounds(792, 530, 111, 23);
		contentPane.add(txtrReservationNotes);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(758, 149, 166, 23);
		contentPane.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(758, 198, 166, 23);
		contentPane.add(dateChooser_1);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(758, 298, 166, 23);
		contentPane.add(dateChooser_2);
		
		JDateChooser dateChooser_3 = new JDateChooser();
		dateChooser_3.setBounds(965, 198, 166, 23);
		contentPane.add(dateChooser_3);
		
		JDateChooser dateChooser_4 = new JDateChooser();
		dateChooser_4.setBounds(965, 250, 166, 23);
		contentPane.add(dateChooser_4);
		
		JDateChooser dateChooser_4_1 = new JDateChooser();
		dateChooser_4_1.setBounds(792, 419, 216, 23);
		contentPane.add(dateChooser_4_1);
		
		JDateChooser dateChooser_4_1_1 = new JDateChooser();
		dateChooser_4_1_1.setBounds(792, 463, 216, 23);
		contentPane.add(dateChooser_4_1_1);
		
		JDateChooser dateChooser_4_1_2 = new JDateChooser();
		dateChooser_4_1_2.setBounds(792, 508, 216, 23);
		contentPane.add(dateChooser_4_1_2);
		
		JDateChooser dateChooser_4_1_3 = new JDateChooser();
		dateChooser_4_1_3.setBounds(547, 552, 216, 23);
		contentPane.add(dateChooser_4_1_3);
	}
}
