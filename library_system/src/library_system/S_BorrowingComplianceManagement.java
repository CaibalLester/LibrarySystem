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
import javax.swing.DefaultComboBoxModel;
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
import java.util.ArrayList;
import java.util.Date;

public class S_BorrowingComplianceManagement extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	private JPanel contentPane;
	private DbConnect dbConnect;
	private DefaultTableModel model;
	private JTable table_1;
	private JDateChooser dateChooser;
	private JDateChooser dateChooser_2;
	private JDateChooser dateChooser_4_1_3;
	private JDateChooser dateChooser_4_1;
	private JDateChooser dateChooser_4_1_1;
	private JTextArea textArea_1;
	private JComboBox<Integer> comboBox;
	private ArrayList<Integer> bookids = new ArrayList<Integer>();
	private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	private static String userId;
	private int studid;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DbConnect dbConnect = new DbConnect();
                    dbConnect.connect();   
					S_BorrowingComplianceManagement frame = new S_BorrowingComplianceManagement(userId);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public S_BorrowingComplianceManagement(String userID) {
		supply_comboBox();
		userId = userID;
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
		
		JTextArea txtrBorrowingComplianceManagement = new JTextArea();
		txtrBorrowingComplianceManagement.setText("BORROWING COMPLIANCE MANAGEMENT");
		txtrBorrowingComplianceManagement.setForeground(Color.WHITE);
		txtrBorrowingComplianceManagement.setFont(new Font("Arial", Font.BOLD, 32));
		txtrBorrowingComplianceManagement.setBackground(new Color(0, 128, 128));
		txtrBorrowingComplianceManagement.setBounds(44, 30, 679, 40);
		contentPane.add(txtrBorrowingComplianceManagement);
		
		textArea_1 = new JTextArea();
		textArea_1.setBounds(444, 404, 381, 173);
		contentPane.add(textArea_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(45, 80, 1208, 292);
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
		
		JTextArea txtrBorrowDate = new JTextArea();
		txtrBorrowDate.setText("Borrow Date :");
		txtrBorrowDate.setForeground(Color.WHITE);
		txtrBorrowDate.setFont(new Font("Arial", Font.BOLD, 14));
		txtrBorrowDate.setBackground(new Color(0, 128, 128));
		txtrBorrowDate.setBounds(44, 379, 111, 23);
		contentPane.add(txtrBorrowDate);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(44, 404, 166, 23);
		contentPane.add(dateChooser);
		
		JTextArea txtrDueDate = new JTextArea();
		txtrDueDate.setText("Due Date :");
		txtrDueDate.setForeground(Color.WHITE);
		txtrDueDate.setFont(new Font("Arial", Font.BOLD, 14));
		txtrDueDate.setBackground(new Color(0, 128, 128));
		txtrDueDate.setBounds(44, 432, 111, 23);
		contentPane.add(txtrDueDate);
		
		dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(44, 454, 166, 23);
		contentPane.add(dateChooser_2);
		
		JTextArea txtrResrvationDate = new JTextArea();
		txtrResrvationDate.setText("Reservation Date :");
		txtrResrvationDate.setForeground(Color.WHITE);
		txtrResrvationDate.setFont(new Font("Arial", Font.BOLD, 14));
		txtrResrvationDate.setBackground(new Color(0, 128, 128));
		txtrResrvationDate.setBounds(44, 480, 134, 22);
		contentPane.add(txtrResrvationDate);
		
		dateChooser_4_1_3 = new JDateChooser();
		dateChooser_4_1_3.setBounds(44, 501, 166, 23);
		contentPane.add(dateChooser_4_1_3);
		
		JTextArea txtrReservationExpiryDate = new JTextArea();
		txtrReservationExpiryDate.setText("Expiry Date :");
		txtrReservationExpiryDate.setForeground(Color.WHITE);
		txtrReservationExpiryDate.setFont(new Font("Arial", Font.BOLD, 14));
		txtrReservationExpiryDate.setBackground(new Color(0, 128, 128));
		txtrReservationExpiryDate.setBounds(44, 529, 185, 23);
		contentPane.add(txtrReservationExpiryDate);
		
		dateChooser_4_1 = new JDateChooser();
		dateChooser_4_1.setBounds(44, 554, 166, 23);
		contentPane.add(dateChooser_4_1);
		
		JTextArea txtrPickupDate = new JTextArea();
		txtrPickupDate.setText("Pick-Up Date :");
		txtrPickupDate.setForeground(Color.WHITE);
		txtrPickupDate.setFont(new Font("Arial", Font.BOLD, 14));
		txtrPickupDate.setBackground(new Color(0, 128, 128));
		txtrPickupDate.setBounds(246, 382, 166, 23);
		contentPane.add(txtrPickupDate);
		
		dateChooser_4_1_1 = new JDateChooser();
		dateChooser_4_1_1.setBounds(246, 404, 166, 23);
		contentPane.add(dateChooser_4_1_1);
		
		JTextArea txtrReservationNotes = new JTextArea();
		txtrReservationNotes.setText("Reservation Notes :");
		txtrReservationNotes.setForeground(Color.WHITE);
		txtrReservationNotes.setFont(new Font("Arial", Font.BOLD, 14));
		txtrReservationNotes.setBackground(new Color(0, 128, 128));
		txtrReservationNotes.setBounds(444, 383, 185, 23);
		contentPane.add(txtrReservationNotes);
		
		JTextArea txtrBookId = new JTextArea();
		txtrBookId.setText("Book ID :");
		txtrBookId.setForeground(Color.WHITE);
		txtrBookId.setFont(new Font("Arial", Font.BOLD, 14));
		txtrBookId.setBackground(new Color(0, 128, 128));
		txtrBookId.setBounds(246, 429, 111, 23);
		contentPane.add(txtrBookId);
		
		comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel<>(bookids.toArray(new Integer[0])));
		comboBox.setBounds(246, 455, 166, 22);
		contentPane.add(comboBox);
		
		JButton btnSubmit = new JButton("Save");
		btnSubmit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Date borrowDate = dateChooser.getDate();
        		Date dueDate = dateChooser_2.getDate();
        		Date reservationDate = dateChooser_4_1_3.getDate();
        		Date reservationExpiryDate = dateChooser_4_1.getDate();
        		Date pickupDate = dateChooser_4_1_1.getDate();
        		String reservationNotes = textArea_1.getText();
        		int bookID = Integer.parseInt(comboBox.getSelectedItem().toString());

                insertData(borrowDate, dueDate,reservationDate, reservationExpiryDate, pickupDate, reservationNotes, bookID);
		    }
		});
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 15));
		btnSubmit.setBackground(new Color(41, 82, 82));
		btnSubmit.setBounds(1072, 400, 181, 30);
		contentPane.add(btnSubmit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDashboard StudentDashboard = new StudentDashboard(userId);
				StudentDashboard.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Arial", Font.BOLD, 15));
		btnBack.setBackground(new Color(41, 82, 82));
		btnBack.setBounds(1147, 533, 106, 45);
		contentPane.add(btnBack);
        Image img = new ImageIcon(this.getClass().getResource("/white.png")).getImage();

       BorrowTable(userId);  
       
        // Load data into the table
      
	}
	
	private void BorrowTable(String userId) {
        DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection

        try {
            Connection con = dbConnect.con; // Use the connection from DbConnect
            String find = "SELECT StudentID FROM students WHERE user_id = " + userId;
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(find);
            
            if(res.next()) {
            studid = res.getInt(1);
            String query = "SELECT id, borrow.StudentID, FullName, Title, Author, BorrowDate, DueDate, borrow.FineAmount, DateFineIssued, PaymentDate, FineNotes, ReservationDate, ReservationExpiryDate, PickupDate, ReservationNotes, borrow.BookID\r\n"
            		+ "FROM borrow INNER JOIN book ON book.BookID = borrow.BookID INNER JOIN students ON students.StudentID = borrow.StudentID WHERE borrow.StudentID = ? ";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, studid);
            ResultSet rs = pst.executeQuery();

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
            } else {
            	System.out.println("Student Info Not Set");
                javax.swing.JOptionPane.showMessageDialog(contentPane, "Student Info Not Set");
            }
        } catch (Exception e) {
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

	    	while (rs.next()) { 
	    	    bookids.add(rs.getInt(1));
	    	}
	    	
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
	
	public void insertData(Date borrowDate, Date dueDate, Date reservationDate, Date reservationExpiryDate, Date pickupDate, String reservationNotes, int bookID) {
    	DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection
        Connection con = dbConnect.con; 
        String query = "INSERT INTO borrow (`BorrowDate`, `DueDate`, `ReservationDate`, `ReservationExpiryDate`, `PickupDate`, `ReservationNotes`, `BookID`, `StudentID`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pst = con.prepareStatement(query)) {
        	pst.setString(1, formatter.format(borrowDate)); 
        	pst.setString(2, formatter.format(dueDate)); 
        	pst.setString(3, formatter.format(reservationDate)); 
        	pst.setString(4, formatter.format(reservationExpiryDate)); 
        	pst.setString(5, formatter.format(pickupDate)); 
        	pst.setString(6, reservationNotes);
        	pst.setInt(7, bookID);
        	pst.setInt(8, studid);
            pst.executeUpdate();
            System.out.println("Borrow Books Inserted");
            javax.swing.JOptionPane.showMessageDialog(contentPane, "Borrow Books Inserted");

            try {
                Statement st = con.createStatement();
                String qry = "SELECT id, borrow.StudentID, FullName, Title, Author, BorrowDate, DueDate, borrow.FineAmount, DateFineIssued, PaymentDate, FineNotes, ReservationDate, ReservationExpiryDate, PickupDate, ReservationNotes, borrow.BookID\r\n"
                		+ "FROM borrow INNER JOIN book ON book.BookID = borrow.BookID INNER JOIN students ON students.StudentID = borrow.StudentID WHERE id = (SELECT MAX(id) FROM borrow);";
                ResultSet res = st.executeQuery(qry);

                while (res.next()) {
                    model.addRow(new Object[]{
                    		res.getInt("id"),
                    		res.getString("FullName"),
                    		res.getString("Title"),
                    		res.getString("Author"),
                    		res.getDate("BorrowDate"),
                    		res.getDate("DueDate"),
                    		res.getDouble("FineAmount"),
                    		res.getDate("DateFineIssued"),
                    		res.getDate("PaymentDate"),
                    		res.getString("FineNotes"),
                    		res.getDate("ReservationDate"),
                    		res.getDate("ReservationExpiryDate"),
                    		res.getDate("PickupDate"),
                    		res.getString("ReservationNotes"),
                    		res.getInt("BookID"),
                    		res.getInt("StudentID"),
                    });
                }
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
