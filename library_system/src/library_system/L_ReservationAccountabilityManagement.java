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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;

public class L_ReservationAccountabilityManagement extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private DefaultTableModel model;
	private JTable table_1;
	private JTextField textField_10;
	private JDateChooser dateChooser;
	private JDateChooser dateChooser_2;
	private JDateChooser dateChooser_3;
	private JDateChooser dateChooser_4;
	private JDateChooser dateChooser_4_1;
	private JDateChooser dateChooser_4_1_1;
	private JDateChooser dateChooser_4_1_3;
	private JComboBox<Integer> comboBox;
	private JComboBox<Integer> comboBox_1;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private int borID; 
	private ArrayList<Integer> bookids = new ArrayList<Integer>();
	private ArrayList<Integer> studentids = new ArrayList<Integer>();
	private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	private JTextField textField;

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
		
		supply_comboBox(); 
		
		setResizable(false);
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
		
		JTextArea txtrManageStudentBook = new JTextArea();
		txtrManageStudentBook.setText("Manage Student Borrow Transactions");
		txtrManageStudentBook.setForeground(Color.WHITE);
		txtrManageStudentBook.setFont(new Font("Arial", Font.BOLD, 20));
		txtrManageStudentBook.setBackground(new Color(0, 128, 128));
		txtrManageStudentBook.setBounds(74, 62, 384, 30);
		contentPane.add(txtrManageStudentBook);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(38, 103, 1208, 292);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		model = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"ID",            		  // Maps to "ID"   
					"Student Full Name",      // Maps to "Full Name"
				    "Title",                  // Maps to "Book Title"
				    "Author", 				  // Maps to "Author"
				    "BorrowDate",             // Maps to "Borrow Date"
				    "DueDate",                // Maps to "Due Date"
				    "FineAmount",             // Maps to "Fine Amount"
				    "DateFineIssued",         // Maps to "Date Fine Issued"
				    "PaymentDate",            // Maps to "Payment Date"
				    "FineNotes",              // Maps to "Fine Notes"
				    "ReservationDate",        // Maps to "Reservation Date"
				    "ReservationExpiryDate",  // Maps to "Reservation Expiry Date"
				    "PickupDate",             // Maps to "Pick-up Date"
				    "ReservationNotes",       // Maps to "Reservation Notes"
				    "BookID",                 // Maps to "Book ID"
				    "StudentID",			  // Maps to "Student ID"
			}
		);

        table_1.setModel(model);
        scrollPane_1.setViewportView(table_1);
		
		textField_10 = new JTextField();
		textField_10.setText("0.0");
		textField_10.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_10.setColumns(10);
		textField_10.setBackground(new Color(177, 216, 216));
		textField_10.setBounds(37, 530, 166, 23);
		contentPane.add(textField_10);
		
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
		btnBack.setBounds(1140, 556, 106, 45);
		contentPane.add(btnBack);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int id = Integer.parseInt(textField.getText());
        		Date borrowDate = dateChooser.getDate();
        		Date dueDate = dateChooser_2.getDate();
        		double fineAmount = Double.parseDouble(textField_10.getText());
        		Date dateFineIssued = dateChooser_3.getDate();
        		Date paymentDate = dateChooser_4.getDate();
        		String fineNotes = textArea.getText();
        		Date reservationDate = dateChooser_4_1_3.getDate();
        		Date reservationExpiryDate = dateChooser_4_1.getDate();
        		Date pickupDate = dateChooser_4_1_1.getDate();
        		String reservationNotes = textArea_1.getText();
        		int bookID = Integer.parseInt(comboBox_1.getSelectedItem().toString());
        		int studentID = Integer.parseInt(comboBox.getSelectedItem().toString());

                updateData(id,borrowDate, dueDate, fineAmount, dateFineIssued, paymentDate, fineNotes, reservationDate, reservationExpiryDate, pickupDate, reservationNotes, bookID, studentID);
		    }
		});
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Arial", Font.BOLD, 15));
		btnEdit.setBackground(new Color(41, 82, 82));
		btnEdit.setBounds(1065, 427, 181, 30);
		contentPane.add(btnEdit);
		
		JButton btnSubmit = new JButton("Save");
		btnSubmit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Date borrowDate = dateChooser.getDate();
        		Date dueDate = dateChooser_2.getDate();
        		double fineAmount = Double.parseDouble(textField_10.getText());
        		Date dateFineIssued = dateChooser_3.getDate();
        		Date paymentDate = dateChooser_4.getDate();
        		String fineNotes = textArea.getText();
        		Date reservationDate = dateChooser_4_1_3.getDate();
        		Date reservationExpiryDate = dateChooser_4_1.getDate();
        		Date pickupDate = dateChooser_4_1_1.getDate();
        		String reservationNotes = textArea_1.getText();
        		int bookID = Integer.parseInt(comboBox_1.getSelectedItem().toString());
        		int studentID = Integer.parseInt(comboBox.getSelectedItem().toString());

                insertData(borrowDate, dueDate, fineAmount, dateFineIssued, paymentDate, fineNotes, reservationDate, reservationExpiryDate, pickupDate, reservationNotes, bookID, studentID);
		    }
		});
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 15));
		btnSubmit.setBackground(new Color(41, 82, 82));
		btnSubmit.setBounds(1065, 463, 181, 30);
		contentPane.add(btnSubmit);
		
		JTextArea txtrBorrowDate = new JTextArea();
		txtrBorrowDate.setText("Borrow Date :");
		txtrBorrowDate.setForeground(Color.WHITE);
		txtrBorrowDate.setFont(new Font("Arial", Font.BOLD, 14));
		txtrBorrowDate.setBackground(new Color(0, 128, 128));
		txtrBorrowDate.setBounds(37, 402, 111, 23);
		contentPane.add(txtrBorrowDate);
		
		JTextArea txtrDueDate = new JTextArea();
		txtrDueDate.setText("Due Date :");
		txtrDueDate.setForeground(Color.WHITE);
		txtrDueDate.setFont(new Font("Arial", Font.BOLD, 14));
		txtrDueDate.setBackground(new Color(0, 128, 128));
		txtrDueDate.setBounds(37, 455, 111, 23);
		contentPane.add(txtrDueDate);
		
		JTextArea txtrFineAmount = new JTextArea();
		txtrFineAmount.setText("Fine Amount :");
		txtrFineAmount.setForeground(Color.WHITE);
		txtrFineAmount.setFont(new Font("Arial", Font.BOLD, 14));
		txtrFineAmount.setBackground(new Color(0, 128, 128));
		txtrFineAmount.setBounds(37, 505, 111, 23);
		contentPane.add(txtrFineAmount);
		
		JTextArea txtrPaymentDate = new JTextArea();
		txtrPaymentDate.setText("Payment Date :");
		txtrPaymentDate.setForeground(Color.WHITE);
		txtrPaymentDate.setFont(new Font("Arial", Font.BOLD, 14));
		txtrPaymentDate.setBackground(new Color(0, 128, 128));
		txtrPaymentDate.setBounds(236, 404, 111, 23);
		contentPane.add(txtrPaymentDate);
		
		JTextArea txtrNotes = new JTextArea();
		txtrNotes.setText("Fine Notes :");
		txtrNotes.setForeground(Color.WHITE);
		txtrNotes.setFont(new Font("Arial", Font.BOLD, 14));
		txtrNotes.setBackground(new Color(0, 128, 128));
		txtrNotes.setBounds(435, 406, 166, 23);
		contentPane.add(txtrNotes);
		
		JTextArea txtrStudentId = new JTextArea();
		txtrStudentId.setText("Student ID :");
		txtrStudentId.setForeground(Color.WHITE);
		txtrStudentId.setFont(new Font("Arial", Font.BOLD, 14));
		txtrStudentId.setBackground(new Color(0, 128, 128));
		txtrStudentId.setBounds(854, 406, 111, 23);
		contentPane.add(txtrStudentId);
		
		JTextArea txtrResrvationDate = new JTextArea();
		txtrResrvationDate.setText("Reservation Date :");
		txtrResrvationDate.setForeground(Color.WHITE);
		txtrResrvationDate.setFont(new Font("Arial", Font.BOLD, 14));
		txtrResrvationDate.setBackground(new Color(0, 128, 128));
		txtrResrvationDate.setBounds(236, 456, 134, 22);
		contentPane.add(txtrResrvationDate);
		
		JTextArea txtrReservationExpiryDate = new JTextArea();
		txtrReservationExpiryDate.setText("Expiry Date :");
		txtrReservationExpiryDate.setForeground(Color.WHITE);
		txtrReservationExpiryDate.setFont(new Font("Arial", Font.BOLD, 14));
		txtrReservationExpiryDate.setBackground(new Color(0, 128, 128));
		txtrReservationExpiryDate.setBounds(236, 505, 185, 23);
		contentPane.add(txtrReservationExpiryDate);
		
		JTextArea txtrPickupDate = new JTextArea();
		txtrPickupDate.setText("Pick-Up Date :");
		txtrPickupDate.setForeground(Color.WHITE);
		txtrPickupDate.setFont(new Font("Arial", Font.BOLD, 14));
		txtrPickupDate.setBackground(new Color(0, 128, 128));
		txtrPickupDate.setBounds(236, 556, 166, 23);
		contentPane.add(txtrPickupDate);
		
		JTextArea txtrReservationNotes = new JTextArea();
		txtrReservationNotes.setText("Reservation Notes :");
		txtrReservationNotes.setForeground(Color.WHITE);
		txtrReservationNotes.setFont(new Font("Arial", Font.BOLD, 14));
		txtrReservationNotes.setBackground(new Color(0, 128, 128));
		txtrReservationNotes.setBounds(645, 406, 185, 23);
		contentPane.add(txtrReservationNotes);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(37, 427, 166, 23);
		contentPane.add(dateChooser);
		
		dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(37, 477, 166, 23);
		contentPane.add(dateChooser_2);
		
		dateChooser_4 = new JDateChooser();
		dateChooser_4.setBounds(236, 427, 166, 23);
		contentPane.add(dateChooser_4);
		
		dateChooser_4_1 = new JDateChooser();
		dateChooser_4_1.setBounds(236, 530, 166, 23);
		contentPane.add(dateChooser_4_1);
		
		dateChooser_4_1_1 = new JDateChooser();
		dateChooser_4_1_1.setBounds(236, 578, 166, 23);
		contentPane.add(dateChooser_4_1_1);
		
		dateChooser_4_1_3 = new JDateChooser();
		dateChooser_4_1_3.setBounds(236, 477, 166, 23);
		contentPane.add(dateChooser_4_1_3);
		
		JTextArea txtrDateFine = new JTextArea();
		txtrDateFine.setText("Date Fine Issued :");
		txtrDateFine.setForeground(Color.WHITE);
		txtrDateFine.setFont(new Font("Arial", Font.BOLD, 14));
		txtrDateFine.setBackground(new Color(0, 128, 128));
		txtrDateFine.setBounds(37, 553, 134, 23);
		contentPane.add(txtrDateFine);
		
		dateChooser_3 = new JDateChooser();
		dateChooser_3.setBounds(37, 578, 166, 23);
		contentPane.add(dateChooser_3);
		
		JTextArea txtrBookId = new JTextArea();
		txtrBookId.setText("Book ID :");
		txtrBookId.setForeground(Color.WHITE);
		txtrBookId.setFont(new Font("Arial", Font.BOLD, 14));
		txtrBookId.setBackground(new Color(0, 128, 128));
		txtrBookId.setBounds(854, 454, 111, 23);
		contentPane.add(txtrBookId);
		
		comboBox = new JComboBox<>();
		comboBox.setBounds(854, 432, 166, 22);
		comboBox.setModel(new DefaultComboBoxModel<>(studentids.toArray(new Integer[0])));
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox<>();
		comboBox_1.setBounds(854, 480, 166, 22);
		comboBox_1.setModel(new DefaultComboBoxModel<>(bookids.toArray(new Integer[0])));
		contentPane.add(comboBox_1);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int id = Integer.parseInt(textField.getText());
                deleteData(id);
		    }
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Arial", Font.BOLD, 15));
		btnDelete.setBackground(new Color(41, 82, 82));
		btnDelete.setBounds(1065, 500, 181, 30);
		contentPane.add(btnDelete);
		
		textArea = new JTextArea();
		textArea.setBounds(435, 428, 173, 173);
		contentPane.add(textArea);
		
		textArea_1 = new JTextArea();
		textArea_1.setBounds(645, 427, 173, 173);
		contentPane.add(textArea_1);
		
		JTextArea txtrCurrent = new JTextArea();
		txtrCurrent.setText("Selected :");
		txtrCurrent.setForeground(Color.WHITE);
		txtrCurrent.setFont(new Font("Arial", Font.BOLD, 14));
		txtrCurrent.setBackground(new Color(0, 128, 128));
		txtrCurrent.setBounds(854, 550, 111, 23);
		contentPane.add(txtrCurrent);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Arial", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBackground(new Color(177, 216, 216));
		textField.setBounds(854, 575, 166, 23);
		contentPane.add(textField);
		
		BorrowTable();

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
            String query = "SELECT id, borrow.StudentID, FullName, Title, Author, BorrowDate, DueDate, borrow.FineAmount, DateFineIssued, PaymentDate, FineNotes, ReservationDate, ReservationExpiryDate, PickupDate, ReservationNotes, borrow.BookID\r\n"
            		+ "FROM borrow INNER JOIN book ON book.BookID = borrow.BookID INNER JOIN students ON students.StudentID = borrow.StudentID;";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                model.addRow(new Object[]{
                		rs.getInt("id"),
                		rs.getString("FullName"),
                		rs.getString("Title"),
                		rs.getString("Author"),
                		rs.getDate("BorrowDate"),
                		rs.getDate("DueDate"),
                		rs.getDouble("FineAmount"),
                		rs.getDate("DateFineIssued"),
                		rs.getDate("PaymentDate"),
                		rs.getString("FineNotes"),
                		rs.getDate("ReservationDate"),
                		rs.getDate("ReservationExpiryDate"),
                		rs.getDate("PickupDate"),
                		rs.getString("ReservationNotes"),
                		rs.getInt("BookID"),
                		rs.getInt("StudentID"),
                });
            }
            con.close();
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
            pst.setInt(1, borID);
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
            	textField.setText(rs.getString("id"));                                   
            	dateChooser.setDate(rs.getDate("BorrowDate"));          
            	dateChooser_2.setDate(rs.getDate("DueDate"));                
            	textField_10.setText(String.valueOf(rs.getDouble("FineAmount"))); 
            	dateChooser_3.setDate(rs.getDate("DateFineIssued"));  
            	dateChooser_4.setDate(rs.getDate("PaymentDate"));        
            	textArea.setText(rs.getString("FineNotes"));            
            	dateChooser_4_1_3.setDate(rs.getDate("ReservationDate")); 
            	dateChooser_4_1.setDate(rs.getDate("ReservationExpiryDate")); 
            	dateChooser_4_1_1.setDate(rs.getDate("PickupDate"));          
            	textArea_1.setText(rs.getString("ReservationNotes")); 
            	comboBox_1.setSelectedItem(String.valueOf(rs.getInt("BookID")));
            	comboBox.setSelectedItem(String.valueOf(rs.getInt("studentID")));
            }
        } catch (Exception e) {
        	e.printStackTrace();
        }
        
    }

    public void insertData(Date borrowDate, Date dueDate, Double fineAmount, Date dateFineIssued, Date paymentDate, String fineNotes, Date reservationDate, Date reservationExpiryDate, Date pickupDate, String reservationNotes, int bookID, int studentID) {
    	DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection
        Connection con = dbConnect.con; 
        String query = "INSERT INTO borrow (`BorrowDate`, `DueDate`, `FineAmount`, `DateFineIssued`, `PaymentDate`, `FineNotes`, `ReservationDate`, `ReservationExpiryDate`, `PickupDate`, `ReservationNotes`, `BookID`, `StudentID`) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pst = con.prepareStatement(query)) {
        	pst.setString(1, formatter.format(borrowDate)); 
        	pst.setString(2, formatter.format(dueDate)); 
        	if(fineAmount != null) {
        		pst.setDouble(3, fineAmount); 
        	} else {
        		pst.setNull(3, java.sql.Types.DOUBLE); 
        	}
        	if (dateFineIssued != null) {
        	    pst.setString(4, formatter.format(dateFineIssued));
        	} else {
        	    pst.setNull(4, java.sql.Types.DATE); // Set to NULL if dateFineIssued is null
        	}

        	if (paymentDate != null) {
        	    pst.setString(5, formatter.format(paymentDate));
        	} else {
        	    pst.setNull(5, java.sql.Types.DATE); // Set to NULL if paymentDate is null
        	}

        	if (fineNotes != null) {
        	    pst.setString(6, fineNotes);
        	} else {
        	    pst.setNull(6, java.sql.Types.VARCHAR); // Set to NULL if fineNotes is null
        	}
        	pst.setString(7, formatter.format(reservationDate)); 
        	pst.setString(8, formatter.format(reservationExpiryDate)); 
        	pst.setString(9, formatter.format(pickupDate)); 
        	pst.setString(10, reservationNotes);
        	pst.setInt(11, bookID);
        	pst.setInt(12, studentID);
            pst.executeUpdate();
            System.out.println("Borrow Books Inserted");
            javax.swing.JOptionPane.showMessageDialog(contentPane, "Borrow Books Inserted");
            L_ReservationAccountabilityManagement frame = new L_ReservationAccountabilityManagement();
			frame.setVisible(true);
			dispose();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateData(int id, Date borrowDate, Date dueDate, Double fineAmount, Date dateFineIssued, Date paymentDate, String fineNotes, Date reservationDate, Date reservationExpiryDate, Date pickupDate, String reservationNotes, int bookID, int studentID) {
    	DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection
        Connection con = dbConnect.con; 
        String query = "UPDATE borrow SET `BorrowDate` = ?, `DueDate` = ?, `FineAmount` = ?, `DateFineIssued` = ?, `PaymentDate` = ?, `FineNotes` = ?, `ReservationDate` = ?, `ReservationExpiryDate` = ?, `PickupDate` = ?, `ReservationNotes` = ?, `BookID` = ?, `StudentID` = ? WHERE `id` = ?";
        try (PreparedStatement pst = con.prepareStatement(query)) {
        	pst.setString(1, formatter.format(borrowDate)); 
        	pst.setString(2, formatter.format(dueDate));
        	if(fineAmount != null) {
        		pst.setDouble(3, fineAmount); 
        	} else {
        		pst.setNull(3, java.sql.Types.DOUBLE); 
        	}
        	if (dateFineIssued != null) {
        	    pst.setString(4, formatter.format(dateFineIssued));
        	} else {
        	    pst.setNull(4, java.sql.Types.DATE); // Set to NULL if dateFineIssued is null
        	}

        	if (paymentDate != null) {
        	    pst.setString(5, formatter.format(paymentDate));
        	} else {
        	    pst.setNull(5, java.sql.Types.DATE); // Set to NULL if paymentDate is null
        	}

        	if (fineNotes != null) {
        	    pst.setString(6, fineNotes);
        	} else {
        	    pst.setNull(6, java.sql.Types.VARCHAR); // Set to NULL if fineNotes is null
        	}
        	pst.setString(7, formatter.format(reservationDate)); 
        	pst.setString(8, formatter.format(reservationExpiryDate)); 
        	pst.setString(9, formatter.format(pickupDate)); 
        	pst.setString(10, reservationNotes);
        	pst.setInt(11, bookID);
        	pst.setInt(12, studentID);
        	pst.setInt(13, id);
            pst.executeUpdate();
            
            System.out.println("Borrow Books Updated");
            javax.swing.JOptionPane.showMessageDialog(contentPane, "Borrow Books Updated");
            L_ReservationAccountabilityManagement frame = new L_ReservationAccountabilityManagement();
			frame.setVisible(true);
			dispose();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void supply_comboBox() {
    	DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection

        try {
	        Connection con = dbConnect.con; // Use the connection from DbConnect
	        Statement stmt = con.createStatement();
	        String query = "SELECT BookID from book";
	        ResultSet rs = stmt.executeQuery(query);
	        
	        Statement stmt1 = con.createStatement();
	        String query1 = "SELECT StudentID from students";
	        ResultSet rs1 = stmt1.executeQuery(query1);
	
	    	while (rs.next()) { 
	    	    bookids.add(rs.getInt(1));
	    	}
	    	
	    	while (rs1.next()) { 
	    	    studentids.add(rs1.getInt(1));
	    	}
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }

    public void deleteData(int id) {
    	DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection
        Connection con = dbConnect.con; 
        String query = "DELETE FROM borrow WHERE `id` = ?";
        try (PreparedStatement pst = con.prepareStatement(query)) {
        	pst.setInt(1,id ); 
            pst.executeUpdate();
            
            System.out.println("Deleted Successfully! Borrow ID: " + id);
            javax.swing.JOptionPane.showMessageDialog(contentPane, "Deleted Successfully! Borrow ID: " + id);
            L_ReservationAccountabilityManagement frame = new L_ReservationAccountabilityManagement();
			frame.setVisible(true);
			dispose();
        } catch (SQLException e) {
            e.printStackTrace();
        }	
    }
}

