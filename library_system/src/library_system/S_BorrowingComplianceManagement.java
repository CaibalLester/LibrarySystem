package library_system;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class S_BorrowingComplianceManagement extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	private JPanel contentPane;
	private JTextField datefineissued;
	private JTextField paymentdate;
	private JTextField finenotes;
	private JTextField reservationnote;
	private JTextField reservationexpirydate;
	private JTextField fullname;
	private JTextField studentid;
	private JTextField bookid;
	private JTextField status;
	private JTextField pages;
	private JTextField quantity;
	private JTextField yearpublished;
	private JTextField publisher;
	private JTextField isbn;
	private JTextField author;
	private JTextField booktitle;
	private JTextField bookstatus;
	private JTextField returndate;
	private JTextField fineamount;
	private JTable table;
	private DbConnect dbConnect;
	private DefaultTableModel model;
	private DefaultTableModel model1;
	private JDateChooser pickupdate;
	private JDateChooser reservationdate;
	private JDateChooser duedate;
	private JDateChooser borrowdate;
	private String userId;
	private JTextField borrowingid;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DbConnect dbConnect = new DbConnect();
                    dbConnect.connect();  
                    String userId = "sampleUserId"; 
					S_BorrowingComplianceManagement frame = new S_BorrowingComplianceManagement(userId);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public S_BorrowingComplianceManagement(String userId) {
		this.userId = userId;
		dbConnect = new DbConnect();  
        dbConnect.connect(); 
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1310, 648);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		datefineissued = new JTextField();
		datefineissued.setFont(new Font("Arial", Font.PLAIN, 16));
		datefineissued.setColumns(10);
		datefineissued.setBackground(new Color(177, 216, 216));
		datefineissued.setBounds(786, 443, 216, 30);
		contentPane.add(datefineissued);
		
		JTextArea txtrBorrowingComplianceManagement = new JTextArea();
		txtrBorrowingComplianceManagement.setText("BORROWING COMPLIANCE MANAGEMENT");
		txtrBorrowingComplianceManagement.setForeground(Color.WHITE);
		txtrBorrowingComplianceManagement.setFont(new Font("Arial", Font.BOLD, 32));
		txtrBorrowingComplianceManagement.setBackground(new Color(0, 128, 128));
		txtrBorrowingComplianceManagement.setBounds(44, 30, 679, 40);
		contentPane.add(txtrBorrowingComplianceManagement);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Arial", Font.BOLD, 15));
		btnEdit.setBackground(new Color(41, 82, 82));
		btnEdit.setBounds(1151, 379, 99, 30);
		contentPane.add(btnEdit);
		
		paymentdate = new JTextField();
		paymentdate.setFont(new Font("Arial", Font.PLAIN, 16));
		paymentdate.setColumns(10);
		paymentdate.setBackground(new Color(177, 216, 216));
		paymentdate.setBounds(786, 497, 216, 30);
		contentPane.add(paymentdate);
		
		finenotes = new JTextField();
		finenotes.setFont(new Font("Arial", Font.PLAIN, 16));
		finenotes.setColumns(10);
		finenotes.setBackground(new Color(177, 216, 216));
		finenotes.setBounds(786, 553, 216, 30);
		contentPane.add(finenotes);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDashboard studentDashboard = new StudentDashboard(userId);
				studentDashboard.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Arial", Font.BOLD, 15));
		btnBack.setBackground(new Color(41, 82, 82));
		btnBack.setBounds(1151, 553, 99, 30);
		contentPane.add(btnBack);
		
		JTextArea txtrPassword_1_1 = new JTextArea();
		txtrPassword_1_1.setText("Student ID :");
		txtrPassword_1_1.setForeground(Color.WHITE);
		txtrPassword_1_1.setFont(new Font("Arial", Font.BOLD, 17));
		txtrPassword_1_1.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1.setBounds(34, 204, 130, 25);
		contentPane.add(txtrPassword_1_1);
		
		JTextArea txtrEmail_1_1 = new JTextArea();
		txtrEmail_1_1.setText("Full Name :");
		txtrEmail_1_1.setForeground(Color.WHITE);
		txtrEmail_1_1.setFont(new Font("Arial", Font.BOLD, 17));
		txtrEmail_1_1.setBackground(new Color(0, 128, 128));
		txtrEmail_1_1.setBounds(34, 260, 130, 30);
		contentPane.add(txtrEmail_1_1);
		
		JTextArea txtrFullName_1_1 = new JTextArea();
		txtrFullName_1_1.setText("Book Title :");
		txtrFullName_1_1.setForeground(Color.WHITE);
		txtrFullName_1_1.setFont(new Font("Arial", Font.BOLD, 17));
		txtrFullName_1_1.setBackground(new Color(0, 128, 128));
		txtrFullName_1_1.setBounds(281, 109, 130, 25);
		contentPane.add(txtrFullName_1_1);
		
		JTextArea txtrEmergencyContact_1_1 = new JTextArea();
		txtrEmergencyContact_1_1.setText("Author :");
		txtrEmergencyContact_1_1.setForeground(Color.WHITE);
		txtrEmergencyContact_1_1.setFont(new Font("Arial", Font.BOLD, 17));
		txtrEmergencyContact_1_1.setBackground(new Color(0, 128, 128));
		txtrEmergencyContact_1_1.setBounds(281, 167, 99, 25);
		contentPane.add(txtrEmergencyContact_1_1);
		
		JTextArea txtrFullName_1_1_1_1 = new JTextArea();
		txtrFullName_1_1_1_1.setText("Borrow Date :");
		txtrFullName_1_1_1_1.setForeground(Color.WHITE);
		txtrFullName_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 17));
		txtrFullName_1_1_1_1.setBackground(new Color(0, 128, 128));
		txtrFullName_1_1_1_1.setBounds(535, 350, 147, 30);
		contentPane.add(txtrFullName_1_1_1_1);
		
		JTextArea txtrFullName_1_2_1_1 = new JTextArea();
		txtrFullName_1_2_1_1.setText("Due Date :");
		txtrFullName_1_2_1_1.setForeground(Color.WHITE);
		txtrFullName_1_2_1_1.setFont(new Font("Arial", Font.BOLD, 17));
		txtrFullName_1_2_1_1.setBackground(new Color(0, 128, 128));
		txtrFullName_1_2_1_1.setBounds(535, 527, 138, 25);
		contentPane.add(txtrFullName_1_2_1_1);
		
		JTextArea txtrFullName_1_3_1_2 = new JTextArea();
		txtrFullName_1_3_1_2.setText("Return Date :");
		txtrFullName_1_3_1_2.setForeground(Color.WHITE);
		txtrFullName_1_3_1_2.setFont(new Font("Arial", Font.BOLD, 17));
		txtrFullName_1_3_1_2.setBackground(new Color(0, 128, 128));
		txtrFullName_1_3_1_2.setBounds(535, 415, 130, 25);
		contentPane.add(txtrFullName_1_3_1_2);
		
		JTextArea txtrFullName_1_3_1_1_1 = new JTextArea();
		txtrFullName_1_3_1_1_1.setText("Status of Borrowed Book :");
		txtrFullName_1_3_1_1_1.setForeground(Color.WHITE);
		txtrFullName_1_3_1_1_1.setFont(new Font("Arial", Font.BOLD, 17));
		txtrFullName_1_3_1_1_1.setBackground(new Color(0, 128, 128));
		txtrFullName_1_3_1_1_1.setBounds(535, 475, 254, 25);
		contentPane.add(txtrFullName_1_3_1_1_1);
		
		JTextArea txtrFullName_1_3_1_1_1_1 = new JTextArea();
		txtrFullName_1_3_1_1_1_1.setText("Fine Notes :");
		txtrFullName_1_3_1_1_1_1.setForeground(Color.WHITE);
		txtrFullName_1_3_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 17));
		txtrFullName_1_3_1_1_1_1.setBackground(new Color(0, 128, 128));
		txtrFullName_1_3_1_1_1_1.setBounds(786, 527, 241, 30);
		contentPane.add(txtrFullName_1_3_1_1_1_1);
		
		JTextArea txtrFullName_1_3_1_1_1_1_1 = new JTextArea();
		txtrFullName_1_3_1_1_1_1_1.setText("Fine Amount :");
		txtrFullName_1_3_1_1_1_1_1.setForeground(Color.WHITE);
		txtrFullName_1_3_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 17));
		txtrFullName_1_3_1_1_1_1_1.setBackground(new Color(0, 128, 128));
		txtrFullName_1_3_1_1_1_1_1.setBounds(786, 350, 241, 30);
		contentPane.add(txtrFullName_1_3_1_1_1_1_1);
		
		JTextArea txtrFullName_1_3_1_1_1_1_2 = new JTextArea();
		txtrFullName_1_3_1_1_1_1_2.setText("Date Fine Issued :");
		txtrFullName_1_3_1_1_1_1_2.setForeground(Color.WHITE);
		txtrFullName_1_3_1_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 17));
		txtrFullName_1_3_1_1_1_1_2.setBackground(new Color(0, 128, 128));
		txtrFullName_1_3_1_1_1_1_2.setBounds(786, 415, 241, 30);
		contentPane.add(txtrFullName_1_3_1_1_1_1_2);
		
		JTextArea txtrFullName_1_3_1_1_1_1_3 = new JTextArea();
		txtrFullName_1_3_1_1_1_1_3.setText("Payment Date :");
		txtrFullName_1_3_1_1_1_1_3.setForeground(Color.WHITE);
		txtrFullName_1_3_1_1_1_1_3.setFont(new Font("Arial", Font.BOLD, 17));
		txtrFullName_1_3_1_1_1_1_3.setBackground(new Color(0, 128, 128));
		txtrFullName_1_3_1_1_1_1_3.setBounds(786, 475, 241, 30);
		contentPane.add(txtrFullName_1_3_1_1_1_1_3);
        Image img = new ImageIcon(this.getClass().getResource("/white.png")).getImage();
        
        JDateChooser pickupdate = new JDateChooser();
        pickupdate.setBounds(33, 497, 216, 30);
        contentPane.add(pickupdate);
        
        reservationnote = new JTextField();
        reservationnote.setFont(new Font("Arial", Font.PLAIN, 16));
        reservationnote.setColumns(10);
        reservationnote.setBackground(new Color(177, 216, 216));
        reservationnote.setBounds(33, 553, 216, 30);
        contentPane.add(reservationnote);
        
        JTextArea txtrPassword_1_1_1 = new JTextArea();
        txtrPassword_1_1_1.setText("Book ID :");
        txtrPassword_1_1_1.setForeground(Color.WHITE);
        txtrPassword_1_1_1.setFont(new Font("Arial", Font.BOLD, 17));
        txtrPassword_1_1_1.setBackground(new Color(0, 128, 128));
        txtrPassword_1_1_1.setBounds(34, 146, 130, 25);
        contentPane.add(txtrPassword_1_1_1);
        
        JTextArea txtrFullName_1_1_2 = new JTextArea();
        txtrFullName_1_1_2.setText("ISBN :");
        txtrFullName_1_1_2.setForeground(Color.WHITE);
        txtrFullName_1_1_2.setFont(new Font("Arial", Font.BOLD, 17));
        txtrFullName_1_1_2.setBackground(new Color(0, 128, 128));
        txtrFullName_1_1_2.setBounds(281, 229, 130, 25);
        contentPane.add(txtrFullName_1_1_2);
        
        JTextArea txtrEmergencyContact_1_1_1 = new JTextArea();
        txtrEmergencyContact_1_1_1.setText("Publisher :");
        txtrEmergencyContact_1_1_1.setForeground(Color.WHITE);
        txtrEmergencyContact_1_1_1.setFont(new Font("Arial", Font.BOLD, 17));
        txtrEmergencyContact_1_1_1.setBackground(new Color(0, 128, 128));
        txtrEmergencyContact_1_1_1.setBounds(281, 286, 99, 25);
        contentPane.add(txtrEmergencyContact_1_1_1);
        
        JTextArea txtrFullName_1_1_3 = new JTextArea();
        txtrFullName_1_1_3.setText("Year Published :");
        txtrFullName_1_1_3.setForeground(Color.WHITE);
        txtrFullName_1_1_3.setFont(new Font("Arial", Font.BOLD, 17));
        txtrFullName_1_1_3.setBackground(new Color(0, 128, 128));
        txtrFullName_1_1_3.setBounds(281, 350, 161, 30);
        contentPane.add(txtrFullName_1_1_3);
        
        JTextArea txtrEmergencyContact_1_1_2 = new JTextArea();
        txtrEmergencyContact_1_1_2.setText("Quantity :");
        txtrEmergencyContact_1_1_2.setForeground(Color.WHITE);
        txtrEmergencyContact_1_1_2.setFont(new Font("Arial", Font.BOLD, 17));
        txtrEmergencyContact_1_1_2.setBackground(new Color(0, 128, 128));
        txtrEmergencyContact_1_1_2.setBounds(281, 415, 99, 25);
        contentPane.add(txtrEmergencyContact_1_1_2);
        
        JTextArea txtrEmergencyContact_1_1_2_1 = new JTextArea();
        txtrEmergencyContact_1_1_2_1.setText("Pages :");
        txtrEmergencyContact_1_1_2_1.setForeground(Color.WHITE);
        txtrEmergencyContact_1_1_2_1.setFont(new Font("Arial", Font.BOLD, 17));
        txtrEmergencyContact_1_1_2_1.setBackground(new Color(0, 128, 128));
        txtrEmergencyContact_1_1_2_1.setBounds(281, 475, 99, 20);
        contentPane.add(txtrEmergencyContact_1_1_2_1);
        
        JTextArea txtrEmergencyContact_1_1_2_2 = new JTextArea();
        txtrEmergencyContact_1_1_2_2.setText("Status :");
        txtrEmergencyContact_1_1_2_2.setForeground(Color.WHITE);
        txtrEmergencyContact_1_1_2_2.setFont(new Font("Arial", Font.BOLD, 17));
        txtrEmergencyContact_1_1_2_2.setBackground(new Color(0, 128, 128));
        txtrEmergencyContact_1_1_2_2.setBounds(285, 527, 99, 25);
        contentPane.add(txtrEmergencyContact_1_1_2_2);
        
        JTextArea txtrEmergencyContact_1_1_2_2_1 = new JTextArea();
        txtrEmergencyContact_1_1_2_2_1.setText("Reservation Expiry Date :");
        txtrEmergencyContact_1_1_2_2_1.setForeground(Color.WHITE);
        txtrEmergencyContact_1_1_2_2_1.setFont(new Font("Arial", Font.BOLD, 17));
        txtrEmergencyContact_1_1_2_2_1.setBackground(new Color(0, 128, 128));
        txtrEmergencyContact_1_1_2_2_1.setBounds(30, 415, 223, 30);
        contentPane.add(txtrEmergencyContact_1_1_2_2_1);
        
        JTextArea txtrEmergencyContact_1_1_2_1_1 = new JTextArea();
        txtrEmergencyContact_1_1_2_1_1.setText("Reservation Date :");
        txtrEmergencyContact_1_1_2_1_1.setForeground(Color.WHITE);
        txtrEmergencyContact_1_1_2_1_1.setFont(new Font("Arial", Font.BOLD, 17));
        txtrEmergencyContact_1_1_2_1_1.setBackground(new Color(0, 128, 128));
        txtrEmergencyContact_1_1_2_1_1.setBounds(33, 350, 185, 30);
        contentPane.add(txtrEmergencyContact_1_1_2_1_1);
        
        JTextArea txtrEmergencyContact_1_1_2_2_1_1 = new JTextArea();
        txtrEmergencyContact_1_1_2_2_1_1.setText("Pick Up Date :");
        txtrEmergencyContact_1_1_2_2_1_1.setForeground(Color.WHITE);
        txtrEmergencyContact_1_1_2_2_1_1.setFont(new Font("Arial", Font.BOLD, 17));
        txtrEmergencyContact_1_1_2_2_1_1.setBackground(new Color(0, 128, 128));
        txtrEmergencyContact_1_1_2_2_1_1.setBounds(30, 475, 202, 25);
        contentPane.add(txtrEmergencyContact_1_1_2_2_1_1);
        
        JTextArea txtrEmergencyContact_1_1_2_2_1_1_1 = new JTextArea();
        txtrEmergencyContact_1_1_2_2_1_1_1.setText("Reservation Notes :");
        txtrEmergencyContact_1_1_2_2_1_1_1.setForeground(Color.WHITE);
        txtrEmergencyContact_1_1_2_2_1_1_1.setFont(new Font("Arial", Font.BOLD, 17));
        txtrEmergencyContact_1_1_2_2_1_1_1.setBackground(new Color(0, 128, 128));
        txtrEmergencyContact_1_1_2_2_1_1_1.setBounds(30, 527, 202, 30);
        contentPane.add(txtrEmergencyContact_1_1_2_2_1_1_1);
        
        reservationexpirydate = new JTextField();
        reservationexpirydate.setFont(new Font("Arial", Font.PLAIN, 16));
        reservationexpirydate.setColumns(10);
        reservationexpirydate.setBackground(new Color(177, 216, 216));
        reservationexpirydate.setBounds(33, 443, 216, 30);
        contentPane.add(reservationexpirydate);
        
        fullname = new JTextField();
        fullname.setFont(new Font("Arial", Font.PLAIN, 16));
        fullname.setColumns(10);
        fullname.setBackground(new Color(177, 216, 216));
        fullname.setBounds(33, 291, 216, 30);
        contentPane.add(fullname);
        
        studentid = new JTextField();
        studentid.setFont(new Font("Arial", Font.PLAIN, 16));
        studentid.setColumns(10);
        studentid.setBackground(new Color(177, 216, 216));
        studentid.setBounds(33, 229, 216, 30);
        contentPane.add(studentid);
        
        bookid = new JTextField();
        bookid.setFont(new Font("Arial", Font.PLAIN, 16));
        bookid.setColumns(10);
        bookid.setBackground(new Color(177, 216, 216));
        bookid.setBounds(34, 170, 216, 30);
        contentPane.add(bookid);
        
        JDateChooser reservationdate = new JDateChooser();
        reservationdate.setBounds(34, 379, 216, 30);
        contentPane.add(reservationdate);
        
        status = new JTextField();
        status.setFont(new Font("Arial", Font.PLAIN, 16));
        status.setColumns(10);
        status.setBackground(new Color(177, 216, 216));
        status.setBounds(281, 553, 216, 30);
        contentPane.add(status);
        
        pages = new JTextField();
        pages.setFont(new Font("Arial", Font.PLAIN, 16));
        pages.setColumns(10);
        pages.setBackground(new Color(177, 216, 216));
        pages.setBounds(281, 497, 216, 30);
        contentPane.add(pages);
        
        quantity = new JTextField();
        quantity.setFont(new Font("Arial", Font.PLAIN, 16));
        quantity.setColumns(10);
        quantity.setBackground(new Color(177, 216, 216));
        quantity.setBounds(281, 443, 216, 30);
        contentPane.add(quantity);
        
        yearpublished = new JTextField();
        yearpublished.setFont(new Font("Arial", Font.PLAIN, 16));
        yearpublished.setColumns(10);
        yearpublished.setBackground(new Color(177, 216, 216));
        yearpublished.setBounds(281, 379, 216, 30);
        contentPane.add(yearpublished);
        
        publisher = new JTextField();
        publisher.setFont(new Font("Arial", Font.PLAIN, 16));
        publisher.setColumns(10);
        publisher.setBackground(new Color(177, 216, 216));
        publisher.setBounds(281, 311, 216, 30);
        contentPane.add(publisher);
        
        isbn = new JTextField();
        isbn.setFont(new Font("Arial", Font.PLAIN, 16));
        isbn.setColumns(10);
        isbn.setBackground(new Color(177, 216, 216));
        isbn.setBounds(281, 254, 216, 30);
        contentPane.add(isbn);
        
        author = new JTextField();
        author.setFont(new Font("Arial", Font.PLAIN, 16));
        author.setColumns(10);
        author.setBackground(new Color(177, 216, 216));
        author.setBounds(281, 193, 216, 30);
        contentPane.add(author);
        
        booktitle = new JTextField();
        booktitle.setFont(new Font("Arial", Font.PLAIN, 16));
        booktitle.setColumns(10);
        booktitle.setBackground(new Color(177, 216, 216));
        booktitle.setBounds(281, 135, 216, 30);
        contentPane.add(booktitle);
        
        JDateChooser duedate = new JDateChooser();
        duedate.setBounds(535, 553, 216, 30);
        contentPane.add(duedate);
        
        bookstatus = new JTextField();
        bookstatus.setFont(new Font("Arial", Font.PLAIN, 16));
        bookstatus.setColumns(10);
        bookstatus.setBackground(new Color(177, 216, 216));
        bookstatus.setBounds(535, 497, 216, 30);
        contentPane.add(bookstatus);
        
        returndate = new JTextField();
        returndate.setFont(new Font("Arial", Font.PLAIN, 16));
        returndate.setColumns(10);
        returndate.setBackground(new Color(177, 216, 216));
        returndate.setBounds(535, 443, 216, 30);
        contentPane.add(returndate);
        
        JDateChooser borrowdate = new JDateChooser();
        borrowdate.setBounds(535, 379, 216, 30);
        contentPane.add(borrowdate);
        
        fineamount = new JTextField();
        fineamount.setFont(new Font("Arial", Font.PLAIN, 16));
        fineamount.setColumns(10);
        fineamount.setBackground(new Color(177, 216, 216));
        fineamount.setBounds(786, 379, 216, 30);
        contentPane.add(fineamount);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(543, 109, 707, 231);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        contentPane.add(scrollPane);

        table = new JTable();
        model = new DefaultTableModel(
                new Object[][] {},
                new String[] {
                    "BorrowingID", "Book ID", "Student ID", "Full Name", "Title", "Author", "ISBN", 
                    "Publisher", "Year Published", "Quantity", "Pages", "Status", "Borrow Date", 
                    "Return Date", "Book Status", "Due Date", "Fine Amount", "Date Fine Issued", 
                    "Payment Date", "Fine Notes", "Reservation Date", "Reservation Expiry Date", 
                    "Pick Up Date", "Reservation Notes"
                }
        );
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        scrollPane.setViewportView(table);

        
        borrowingid = new JTextField();
        borrowingid.setFont(new Font("Arial", Font.PLAIN, 16));
        borrowingid.setColumns(10);
        borrowingid.setBackground(new Color(177, 216, 216));
        borrowingid.setBounds(33, 104, 216, 30);
        contentPane.add(borrowingid);
        
        JTextArea txtrPassword_1_1_1_1 = new JTextArea();
        txtrPassword_1_1_1_1.setText("Book ID :");
        txtrPassword_1_1_1_1.setForeground(Color.WHITE);
        txtrPassword_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 17));
        txtrPassword_1_1_1_1.setBackground(new Color(0, 128, 128));
        txtrPassword_1_1_1_1.setBounds(33, 80, 130, 25);
        contentPane.add(txtrPassword_1_1_1_1);
        
        
        
        
        // Load data into the table
        loadDataIntoTable();


        // Add table selection listener to display in text fields
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int selectedRow = table.getSelectedRow();
                displaySelectedRow(selectedRow);
            }
        });
        
      
	}
	
	 // Method to load data into the table
    private void loadDataIntoTable() {
        DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection

        try {
            Connection con = dbConnect.con; // Use the connection from DbConnect
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM bookborrowing";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                model.addRow(new Object[]{
                    getValueOrNA(rs.getString("BorrowingID")),
                    getValueOrNA(rs.getString("BookID")),
                    getValueOrNA(rs.getString("StudentID")),
                    getValueOrNA(rs.getString("FullName")),
                    getValueOrNA(rs.getString("Title")),
                    getValueOrNA(rs.getString("Author")),
                    getValueOrNA(rs.getString("ISBN")),
                    getValueOrNA(rs.getString("Publisher")),
                    rs.getInt("YearPublished") == 0 ? "N/A" : rs.getInt("YearPublished"),
                    rs.getInt("Quantity") == 0 ? "N/A" : rs.getInt("Quantity"),
                    rs.getInt("Pages") == 0 ? "N/A" : rs.getInt("Pages"),
                    getValueOrNA(rs.getString("Status")),
                    getValueOrNA(rs.getString("BorrowDate")),
                    getValueOrNA(rs.getString("ReturnDate")),
                    getValueOrNA(rs.getString("BookStatus")),
                    getValueOrNA(rs.getString("DueDate")),
                    getValueOrNA(rs.getString("FineAmount")),
                    getValueOrNA(rs.getString("DateFineIssued")),
                    getValueOrNA(rs.getString("PaymentDate")),
                    getValueOrNA(rs.getString("FineNotes")),
                    getValueOrNA(rs.getString("ReservationDate")),
                    getValueOrNA(rs.getString("ReservationExpiryDate")),
                    getValueOrNA(rs.getString("PickupDate")),
                    getValueOrNA(rs.getString("ReservationNotes"))
                });
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
   

    private void displaySelectedRow(int row) {
    	if (row >= 0) {
    	    borrowingid.setText(getValueOrNA(model.getValueAt(row, 0).toString()));
    	    bookid.setText(getValueOrNA(model.getValueAt(row, 1).toString())); 
    	    studentid.setText(getValueOrNA(model.getValueAt(row, 2).toString())); 
    	    fullname.setText(getValueOrNA(model.getValueAt(row, 3).toString()));        	
    	    booktitle.setText(getValueOrNA(model.getValueAt(row, 4).toString())); 
    	    author.setText(getValueOrNA(model.getValueAt(row, 5).toString())); 
    	    isbn.setText(getValueOrNA(model.getValueAt(row, 6).toString())); 
    	    publisher.setText(getValueOrNA(model.getValueAt(row, 7).toString())); 
    	    yearpublished.setText(getValueOrNA(model.getValueAt(row, 8).toString())); 
    	    quantity.setText(getValueOrNA(model.getValueAt(row, 9).toString())); 
    	    pages.setText(getValueOrNA(model.getValueAt(row, 10).toString()));
    	    status.setText(getValueOrNA(model.getValueAt(row, 11).toString()));

    	    returndate.setText(getValueOrNA(model.getValueAt(row, 13).toString()));
    	    bookstatus.setText(getValueOrNA(model.getValueAt(row, 14).toString()));

    	    fineamount.setText(getValueOrNA(model.getValueAt(row, 16).toString()));
    	    datefineissued.setText(getValueOrNA(model.getValueAt(row, 17).toString()));
    	    paymentdate.setText(getValueOrNA(model.getValueAt(row, 18).toString()));
    	    finenotes.setText(getValueOrNA(model.getValueAt(row, 19).toString()));

    	    reservationexpirydate.setText(getValueOrNA(model.getValueAt(row, 21).toString()));
    	    reservationnote.setText(getValueOrNA(model.getValueAt(row, 23).toString()));

    	    try {
    	        borrowdate.setDate(parseDate(getValueOrNA(model.getValueAt(row, 12).toString())));
    	        duedate.setDate(parseDate(getValueOrNA(model.getValueAt(row, 15).toString())));
    	        reservationdate.setDate(parseDate(getValueOrNA(model.getValueAt(row, 20).toString())));
    	        pickupdate.setDate(parseDate(getValueOrNA(model.getValueAt(row, 22).toString())));
    	    } catch (ParseException e) {
    	        e.printStackTrace();
    	    }
    	}

            
            fineamount.setText(model.getValueAt(row, 16).toString());
            datefineissued.setText(model.getValueAt(row, 17).toString());
            paymentdate.setText(model.getValueAt(row, 18).toString());
            finenotes.setText(model.getValueAt(row, 19).toString());
            reservationexpirydate.setText(model.getValueAt(row, 21).toString());
        }
    
    
    private Date parseDate(String dateString) throws ParseException {
        return dateFormat.parse(dateString);
    }
    
    private String getValueOrNA(String value) {
        return value == null ? "N/A" : value;
    }

    
    public void insertData(String Title, String Author, String ISBN, String Publisher, String YearPublished, String Quantity, String Pages, String Status, String BookID) {
        Connection con = dbConnect.con; 
        String query = "INSERT INTO bookborrowing (`Title`, `Author`, `ISBN`, `Publisher`, `YearPublished`, `Quantity`, `Pages`, `Status`, `BookID`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, Title);
            pst.setString(2, Author);
            pst.setString(3, ISBN);
            pst.setString(4, Publisher);
            pst.setString(5, YearPublished);
            pst.setString(6, Quantity);
            pst.setString(7, Pages);
            pst.setString(8, Status);
            pst.setString(9, BookID);
            pst.executeUpdate();
            System.out.println("Student Info Inserted");
            javax.swing.JOptionPane.showMessageDialog(contentPane, "Student Info Inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
}
