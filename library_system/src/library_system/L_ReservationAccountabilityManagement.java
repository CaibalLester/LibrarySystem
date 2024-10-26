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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

public class L_ReservationAccountabilityManagement extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;
	private JTable table_1;
	private DefaultTableModel model2;
	private JTextField txtUsername;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_19;
	private JDateChooser dateChooser;
	private JDateChooser dateChooser_1;
	private JDateChooser dateChooser_2;
	private JDateChooser dateChooser_4;
	private JDateChooser dateChooser_4_1;
	private JDateChooser dateChooser_4_1_1;
	private JDateChooser dateChooser_4_1_2;
	private JDateChooser dateChooser_4_1_3;
	private int resID;
	private int borID; 
	private JTextField textField;
	private JTextField textField_1;
	private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

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
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		model2 = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"ID","Student ID", "Full Name", "Book Title", "Reservation Date", "Reservation Expiry Date", "Pick-up Date", "Return Date", "Notes"
			}
		);
		
		table.setModel(model2);
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
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		model = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"ID", "Student ID", "Full Name", "Book Title", "Author", "Borrow Date", "Return Date", "Status of Borrowed Book", "Due Date", "Fine Amount", "Payment Date", "Notes"
			}
		);

        table_1.setModel(model);
        scrollPane_1.setViewportView(table_1);
		
		txtUsername = new JTextField();
		txtUsername.setToolTipText("user");
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 14));
		txtUsername.setColumns(10);
		txtUsername.setBackground(new Color(177, 216, 216));
		txtUsername.setBounds(547, 149, 174, 23);
		contentPane.add(txtUsername);
		
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
		btnEdit_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int studid = Integer.parseInt(textField_15.getText());
		    	int bookid = Integer.parseInt(textField_14.getText());
                Date resdate = dateChooser_4_1_3.getDate();
                Date expdate = dateChooser_4_1.getDate();
                Date pickup = dateChooser_4_1_1.getDate();
                Date retdate = dateChooser_4_1_2.getDate();
                String note = textField_6.getText();
                int id = Integer.parseInt(textField_1.getText());
                
                System.out.println("Updating Reservation No" + id + ":" + studid + ", " + bookid + ", " + resdate + ", " + expdate + ", " + pickup + ", " + retdate + ", " + note);
                updateDataRes(id, studid, bookid, resdate, expdate, pickup, retdate, note);                
               
		    }
		});
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
		btnSave.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
		    	int studid = Integer.parseInt(textField_15.getText());
		    	int bookid = Integer.parseInt(textField_14.getText());
                Date resdate = dateChooser_4_1_3.getDate();
                Date expdate = dateChooser_4_1.getDate();
                Date pickup = dateChooser_4_1_1.getDate();
                Date retdate = dateChooser_4_1_2.getDate();
                String note = textField_6.getText();
                
                System.out.println("Inserting Reservation: " + studid + ", " + bookid + ", " + resdate + ", " + expdate + ", " + pickup + ", " + retdate + ", " + note);
                insertDataRes(studid, bookid, resdate, expdate, pickup, retdate, note);
                
               
		    }
		});
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Arial", Font.BOLD, 15));
		btnSave.setBackground(new Color(41, 82, 82));
		btnSave.setBounds(1036, 456, 99, 30);
		contentPane.add(btnSave);
		
		JTextArea txtrResID = new JTextArea();
		txtrResID.setText("Reservation ID :");
		txtrResID.setForeground(Color.WHITE);
		txtrResID.setFont(new Font("Arial", Font.BOLD, 14));
		txtrResID.setBackground(new Color(0, 128, 128));
		txtrResID.setBounds(547, 123, 134, 23);
		contentPane.add(txtrResID);
		
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
		
		JTextArea txtrBookID = new JTextArea();
		txtrBookID.setText("Book ID :");
		txtrBookID.setForeground(Color.WHITE);
		txtrBookID.setFont(new Font("Arial", Font.BOLD, 14));
		txtrBookID.setBackground(new Color(0, 128, 128));
		txtrBookID.setBounds(547, 442, 111, 23);
		contentPane.add(txtrBookID);
		
		JTextArea txtrResrvationDate = new JTextArea();
		txtrResrvationDate.setText("Reservation Date :");
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
		txtrReservationNotes.setBounds(792, 530, 185, 23);
		contentPane.add(txtrReservationNotes);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(758, 149, 166, 23);
		contentPane.add(dateChooser);
		
		dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(758, 198, 166, 23);
		contentPane.add(dateChooser_1);
		
		dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(758, 298, 166, 23);
		contentPane.add(dateChooser_2);
		
		dateChooser_4 = new JDateChooser();
		dateChooser_4.setBounds(965, 250, 166, 23);
		contentPane.add(dateChooser_4);
		
		dateChooser_4_1 = new JDateChooser();
		dateChooser_4_1.setBounds(792, 419, 216, 23);
		contentPane.add(dateChooser_4_1);
		
		dateChooser_4_1_1 = new JDateChooser();
		dateChooser_4_1_1.setBounds(792, 463, 216, 23);
		contentPane.add(dateChooser_4_1_1);
		
		dateChooser_4_1_2 = new JDateChooser();
		dateChooser_4_1_2.setBounds(792, 508, 216, 23);
		contentPane.add(dateChooser_4_1_2);
		
		dateChooser_4_1_3 = new JDateChooser();
		dateChooser_4_1_3.setBounds(547, 552, 216, 23);
		contentPane.add(dateChooser_4_1_3);
		
		textField = new JTextField();
		textField.setEnabled(true);
		textField.setEditable(false);
		textField.setBounds(547, 198, 174, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(true);
		textField_1.setEditable(false);
		textField_1.setBounds(547, 508, 216, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JTextArea txtrBorID = new JTextArea();
		txtrBorID.setText("Borrow ID :");
		txtrBorID.setForeground(Color.WHITE);
		txtrBorID.setFont(new Font("Arial", Font.BOLD, 14));
		txtrBorID.setBackground(new Color(0, 128, 128));
		txtrBorID.setBounds(547, 173, 134, 23);
		contentPane.add(txtrBorID);
		
		JTextArea txtrResID_1 = new JTextArea();
		txtrResID_1.setText("Reservation ID :");
		txtrResID_1.setForeground(Color.WHITE);
		txtrResID_1.setFont(new Font("Arial", Font.BOLD, 14));
		txtrResID_1.setBackground(new Color(0, 128, 128));
		txtrResID_1.setBounds(547, 485, 111, 23);
		contentPane.add(txtrResID_1);
		
		BorrowTable();
		ReserveTable();
		
		table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int selectedRow = table.getSelectedRow();
                displaySelRowRes(selectedRow);
            }
        });
		
		table_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int selectedRow = table_1.getSelectedRow();
                displaySelRowBor(selectedRow);
            }
        });
	}
	
	// Method to load data into the table
    private void BorrowTable() {
        DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection

        try {
            Connection con = dbConnect.con; // Use the connection from DbConnect
            Statement stmt = con.createStatement();
            String query = "SELECT borrow.id, reservation_id, borrow_date, borrow.return_date, due_date, borrow.status, fines, payment_date, borrow.notes, Title, Author, fullname, StudentID FROM borrow INNER JOIN reservation ON reservation.id = reservation_id INNER JOIN book ON bookID = book_id INNER JOIN students ON studentID = student_id";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                model.addRow(new Object[]{
                	rs.getString("borrow.id"),
                	rs.getString("StudentID"),
                    rs.getString("fullname"),
                    rs.getString("Title"),
                    rs.getString("Author"),
                    rs.getDate("borrow_date"),
                    rs.getDate("return_date"),
                    rs.getString("status"),
                    rs.getDate("due_date"),
                    rs.getInt("fines"),
                    rs.getDate("payment_date"),
                    rs.getString("notes")
                });
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
 // Method to load data into the table
    private void ReserveTable() {
        DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection
        
        try {
            Connection con = dbConnect.con; // Use the connection from DbConnect
            Statement stmt = con.createStatement();
            String query = "SELECT id, Title, reservation_date, expiry_date, pickup_date, return_date, notes, fullname, StudentID FROM reservation INNER JOIN book ON bookID = book_id INNER JOIN students ON studentID = student_id";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                model2.addRow(new Object[]{
                	rs.getString("id"),
                	rs.getString("StudentID"),
                    rs.getString("fullname"),
                    rs.getString("Title"),
                    rs.getDate("reservation_date"),
                    rs.getDate("expiry_date"),
                    rs.getDate("pickup_date"),
                    rs.getDate("return_date"),
                    rs.getString("notes"),
                });
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void displaySelRowRes(int row) {
        if (row >= 0) {
            resID = Integer.parseInt(model2.getValueAt(row, 0).toString()); 
        }
        
        DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection
        
        try {
        	Connection con = dbConnect.con; // Use the connection from DbConnect
            String query = "SELECT * FROM reservation WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, resID);
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
            		textField_1.setText(rs.getString("id"));
                	textField_15.setText(rs.getString("student_id"));
                	textField_14.setText(rs.getString("book_id"));
                	dateChooser_4_1_3.setDate(rs.getDate("reservation_date"));
                	dateChooser_4_1.setDate(rs.getDate("expiry_date"));
                	dateChooser_4_1_1.setDate(rs.getDate("pickup_date"));
                	dateChooser_4_1_2.setDate(rs.getDate("return_date"));
                	textField_19.setText(rs.getString("notes"));
            }
        } catch (Exception e) {
        	e.printStackTrace();
        }
        
    }
    
    private void displaySelRowBor(int row) {
        if (row >= 0) {
            borID = Integer.parseInt(model.getValueAt(row, 0).toString()); 
        }
        
        DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection
        
        try {
        	Connection con = dbConnect.con; // Use the connection from DbConnect
            String query = "SELECT * FROM borrow WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, resID);
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {                	
                	textField.setText(rs.getString("id"));
                	txtUsername.setText(rs.getString("reservation_id"));
                	dateChooser.setDate(rs.getDate("borrow_date"));
                	dateChooser_1.setDate(rs.getDate("return_date"));
                	textField_8.setText(rs.getString("status"));
                    dateChooser_2.setDate(rs.getDate("due_date"));
                    textField_10.setText(rs.getString("fines"));
                    dateChooser_4.setDate(rs.getDate("payment_date"));
                    textField_6.setText(rs.getString("notes"));
            }
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
    
    public void insertDataRes(int student_id, int book_id, Date reservation_date, Date expiry_date, Date pickup_date, Date return_date, String notes) {
    	DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection
        Connection con = dbConnect.con; 
        String query = "INSERT INTO reservation (`student_id`, `book_id`, `reservation_date`, `expiry_date`, `pickup_date`, `return_date`, `notes`) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setInt(1, student_id);
            pst.setInt(2, book_id);
            pst.setString(3, formatter.format(reservation_date));
            pst.setString(4, formatter.format(expiry_date));
            pst.setString(5, formatter.format(pickup_date));
            pst.setString(6, formatter.format(return_date));
            pst.setString(7, notes);
            pst.executeUpdate();
            System.out.println("Reservation Info Inserted");
            javax.swing.JOptionPane.showMessageDialog(contentPane, "Reservation Info Inserted");
            ReserveTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateDataRes(int id, int student_id, int book_id, Date reservation_date, Date expiry_date, Date pickup_date, Date return_date, String notes) {
    	DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection
        Connection con = dbConnect.con; 
        String query = "UPDATE reservation SET `student_id` = ?, `book_id` = ?, `reservation_date` = ?, `expiry_date` = ?, `pickup_date` = ?, `return_date` = ?, `notes` = ? WHERE id = ?";
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setInt(1, student_id);
            pst.setInt(2, book_id);
            pst.setString(3, formatter.format(reservation_date));
            pst.setString(4, formatter.format(expiry_date));
            pst.setString(5, formatter.format(pickup_date));
            pst.setString(6, formatter.format(return_date));
            pst.setString(7, notes);
            pst.setInt(8, id);
            pst.executeUpdate();
            System.out.println("Reservation Info Updated");
            javax.swing.JOptionPane.showMessageDialog(contentPane, "Reservation Info Updated");
            ReserveTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
