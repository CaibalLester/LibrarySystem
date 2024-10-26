package library_system;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class S_Books extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private JTextArea txtrMyBooks;
    private JTextField title;
    private JTextField author;
    private JTextField isbn;
    private JTextField publisher;
    private JTextField yearpublished;
    private JTextField quantity;
    private JTextField pages;
    private JButton btnAdd;
    private JButton btnBack;
    private DefaultTableModel model;
    private JTable table_1;
    private JTextArea txtrTitle;
    private JTextArea txtrAuthor;
    private JTextArea txtrIsbn;
    private JTextArea txtrPublisher;
    private JTextArea txtrYearPublished;
    private JTextArea txtrQuantity;
    private JTextArea txtrPages;
    private JTextArea txtrStatus;
    private JComboBox<String> status;
    private JScrollPane scrollPane_1;
    private DbConnect dbConnect;
    private JTextField book_id;
    private DefaultTableModel model1;
    private String userId;
    private JTextField studentId;
    private JTextArea studentid;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	DbConnect dbConnect = new DbConnect();
                    dbConnect.connect();  
                    String userId = "sampleUserId";
                    S_Books frame = new S_Books(userId);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public S_Books(String userId) {
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

        JTextArea txtrBorrowingComplianceManagement = new JTextArea();
        txtrBorrowingComplianceManagement.setText("STUDENT BOOK INFORMATION");
        txtrBorrowingComplianceManagement.setForeground(Color.WHITE);
        txtrBorrowingComplianceManagement.setFont(new Font("Arial", Font.BOLD, 30));
        txtrBorrowingComplianceManagement.setBackground(new Color(0, 128, 128));
        txtrBorrowingComplianceManagement.setBounds(30, 28, 522, 40);
        contentPane.add(txtrBorrowingComplianceManagement);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(39, 163, 367, 406);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        contentPane.add(scrollPane);

        table = new JTable();
        model = new DefaultTableModel(
                new Object[][] {},
                new String[] { "BookID", "Title", "Author", "ISBN", "Publisher", "Year Published", "Quantity", "Pages", "Status" }
        );
        table.setModel(model);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        scrollPane.setViewportView(table);
  
        JScrollPane scrollPane_2 = new JScrollPane();
        scrollPane.setColumnHeaderView(scrollPane_2);

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

        title = new JTextField();
        title.setFont(new Font("Arial", Font.PLAIN, 16));
        title.setColumns(10);
        title.setBackground(new Color(177, 216, 216));
        title.setBounds(780, 283, 241, 30);
        contentPane.add(title);

        author = new JTextField();
        author.setFont(new Font("Arial", Font.PLAIN, 16));
        author.setColumns(10);
        author.setBackground(new Color(177, 216, 216));
        author.setBounds(780, 341, 241, 30);
        contentPane.add(author);

        isbn = new JTextField();
        isbn.setFont(new Font("Arial", Font.PLAIN, 16));
        isbn.setColumns(10);
        isbn.setBackground(new Color(177, 216, 216));
        isbn.setBounds(780, 396, 241, 30);
        contentPane.add(isbn);

        publisher = new JTextField();
        publisher.setFont(new Font("Arial", Font.PLAIN, 16));
        publisher.setColumns(10);
        publisher.setBackground(new Color(177, 216, 216));
        publisher.setBounds(780, 449, 241, 30);
        contentPane.add(publisher);

        yearpublished = new JTextField();
        yearpublished.setFont(new Font("Arial", Font.PLAIN, 16));
        yearpublished.setColumns(10);
        yearpublished.setBackground(new Color(177, 216, 216));
        yearpublished.setBounds(780, 502, 241, 30);
        contentPane.add(yearpublished);

        quantity = new JTextField();
        quantity.setFont(new Font("Arial", Font.PLAIN, 16));
        quantity.setColumns(10);
        quantity.setBackground(new Color(177, 216, 216));
        quantity.setBounds(1045, 161, 241, 30);
        contentPane.add(quantity);

        pages = new JTextField();
        pages.setFont(new Font("Arial", Font.PLAIN, 16));
        pages.setColumns(10);
        pages.setBackground(new Color(177, 216, 216));
        pages.setBounds(1045, 219, 241, 30);
        contentPane.add(pages);

        btnAdd = new JButton("Add");
        btnAdd.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
		    	String stitle = title.getText();
		    	String sauthor = author.getText();
                String sisbn = isbn.getText();
                String spublisher = publisher.getText();
                String syearpublished = yearpublished.getText();
                String squantity = quantity.getText();
                String spages = pages.getText();
                String sstatus = (String) status.getSelectedItem();
                String sbook_id = book_id.getText();
                String sstudentId = studentId.getText();
                
                System.out.println("Inserting students: " + stitle + ", " + sauthor + ", " + sisbn + ", " + spublisher + ", " + syearpublished + ", " + squantity + ", " + spages + ", " + sstatus+ ", " + sbook_id+ ", " +sstudentId);
                insertData(stitle, sauthor, sisbn, spublisher,syearpublished,squantity,spages,sstatus,sbook_id,sstudentId);
                
               
		    }
		});
        btnAdd.setForeground(Color.WHITE);
        btnAdd.setFont(new Font("Arial", Font.BOLD, 15));
        btnAdd.setBackground(new Color(41, 82, 82));
        btnAdd.setBounds(1187, 338, 99, 33);
        contentPane.add(btnAdd);

        btnBack = new JButton("Back");
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
        btnBack.setBounds(1168, 559, 99, 30);
        contentPane.add(btnBack);
        
        scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(439, 163, 320, 406);
        scrollPane_1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        contentPane.add(scrollPane_1);

        table_1 = new JTable();
        model1 = new DefaultTableModel(
                new Object[][] {},
                new String[] { "BookID", "Title", "Author", "ISBN", "Publisher", "Year Published", "Quantity", "Pages", "Status" }
        );
        table_1.setModel(model1);

        table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        scrollPane_1.setViewportView(table_1);
 
        
        txtrTitle = new JTextArea();
        txtrTitle.setText("Title :");
        txtrTitle.setForeground(Color.WHITE);
        txtrTitle.setFont(new Font("Arial", Font.BOLD, 14));
        txtrTitle.setBackground(new Color(0, 128, 128));
        txtrTitle.setBounds(780, 259, 111, 23);
        contentPane.add(txtrTitle);
        
        txtrAuthor = new JTextArea();
        txtrAuthor.setText("Author :");
        txtrAuthor.setForeground(Color.WHITE);
        txtrAuthor.setFont(new Font("Arial", Font.BOLD, 14));
        txtrAuthor.setBackground(new Color(0, 128, 128));
        txtrAuthor.setBounds(780, 321, 111, 23);
        contentPane.add(txtrAuthor);
        
        txtrIsbn = new JTextArea();
        txtrIsbn.setText("ISBN :");
        txtrIsbn.setForeground(Color.WHITE);
        txtrIsbn.setFont(new Font("Arial", Font.BOLD, 14));
        txtrIsbn.setBackground(new Color(0, 128, 128));
        txtrIsbn.setBounds(780, 374, 111, 23);
        contentPane.add(txtrIsbn);
        
        txtrPublisher = new JTextArea();
        txtrPublisher.setText("Publisher :");
        txtrPublisher.setForeground(Color.WHITE);
        txtrPublisher.setFont(new Font("Arial", Font.BOLD, 14));
        txtrPublisher.setBackground(new Color(0, 128, 128));
        txtrPublisher.setBounds(780, 425, 111, 23);
        contentPane.add(txtrPublisher);
        
        txtrYearPublished = new JTextArea();
        txtrYearPublished.setText("Year Published :");
        txtrYearPublished.setForeground(Color.WHITE);
        txtrYearPublished.setFont(new Font("Arial", Font.BOLD, 14));
        txtrYearPublished.setBackground(new Color(0, 128, 128));
        txtrYearPublished.setBounds(780, 480, 111, 23);
        contentPane.add(txtrYearPublished);
        
        txtrQuantity = new JTextArea();
        txtrQuantity.setText("Quantity :");
        txtrQuantity.setForeground(Color.WHITE);
        txtrQuantity.setFont(new Font("Arial", Font.BOLD, 14));
        txtrQuantity.setBackground(new Color(0, 128, 128));
        txtrQuantity.setBounds(1045, 139, 111, 23);
        contentPane.add(txtrQuantity);
        
        txtrPages = new JTextArea();
        txtrPages.setText("Pages :");
        txtrPages.setForeground(Color.WHITE);
        txtrPages.setFont(new Font("Arial", Font.BOLD, 14));
        txtrPages.setBackground(new Color(0, 128, 128));
        txtrPages.setBounds(1045, 194, 111, 23);
        contentPane.add(txtrPages);
        
        txtrStatus = new JTextArea();
        txtrStatus.setText("Status :");
        txtrStatus.setForeground(Color.WHITE);
        txtrStatus.setFont(new Font("Arial", Font.BOLD, 14));
        txtrStatus.setBackground(new Color(0, 128, 128));
        txtrStatus.setBounds(1045, 259, 111, 23);
        contentPane.add(txtrStatus);
        
        status = new JComboBox<String>();
        status.setModel(new DefaultComboBoxModel(new String[] {"", "Available", "Checked Out", "Reserved"}));
        status.setFont(new Font("Arial", Font.PLAIN, 16));
        status.setBackground(new Color(177, 216, 216));
        status.setBounds(1045, 284, 241, 30);
        contentPane.add(status);
        
        book_id = new JTextField();
        book_id.setFont(new Font("Arial", Font.PLAIN, 16));
        book_id.setColumns(10);
        book_id.setBackground(new Color(177, 216, 216));
        book_id.setBounds(780, 220, 241, 30);
        contentPane.add(book_id);
        
        JTextArea txtrTitle_1 = new JTextArea();
        txtrTitle_1.setText("Book ID :");
        txtrTitle_1.setForeground(Color.WHITE);
        txtrTitle_1.setFont(new Font("Arial", Font.BOLD, 14));
        txtrTitle_1.setBackground(new Color(0, 128, 128));
        txtrTitle_1.setBounds(780, 196, 111, 23);
        contentPane.add(txtrTitle_1);
        
        studentId = new JTextField();
        studentId.setFont(new Font("Arial", Font.PLAIN, 16));
        studentId.setColumns(10);
        studentId.setBackground(new Color(177, 216, 216));
        studentId.setBounds(780, 163, 241, 30);
        contentPane.add(studentId);
        
        studentid = new JTextArea();
        studentid.setText("Student ID :");
        studentid.setForeground(Color.WHITE);
        studentid.setFont(new Font("Arial", Font.BOLD, 14));
        studentid.setBackground(new Color(0, 128, 128));
        studentid.setBounds(780, 139, 111, 23);
        contentPane.add(studentid);

        loadDataIntoTable();

        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int selectedRow = table.getSelectedRow();
                displaySelectedRow(selectedRow);
            }
        });
        
        anotherloadDataIntoTable();
        displayme(userId);
    }

    private void loadDataIntoTable() {
        DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); 

        try {
            Connection con = dbConnect.con; 
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM book";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                model.addRow(new Object[]{
                	rs.getString("BookID"),
                    rs.getString("Title"),
                    rs.getString("Author"),
                    rs.getString("ISBN"),
                    rs.getString("Publisher"),
                    rs.getInt("YearPublished"),
                    rs.getInt("Quantity"),
                    rs.getInt("Pages"),
                    rs.getString("Status")
                    
                });
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void anotherloadDataIntoTable() {
        DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); 

        try {
            Connection con = dbConnect.con;
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM bookborrowing";
            ResultSet rs = stmt.executeQuery(query);

            model1.setRowCount(0);

            while (rs.next()) {
                model1.addRow(new Object[]{
                    rs.getString("BookID"),
                    rs.getString("Title"),
                    rs.getString("Author"),
                    rs.getString("ISBN"),
                    rs.getString("Publisher"),
                    rs.getInt("YearPublished"),
                    rs.getInt("Quantity"),
                    rs.getInt("Pages"),
                    rs.getString("Status")
                });
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }

    private void displaySelectedRow(int row) {
        if (row >= 0) {
            title.setText(model.getValueAt(row, 1).toString()); 
            author.setText(model.getValueAt(row, 2).toString()); 
            isbn.setText(model.getValueAt(row, 3).toString()); 
            publisher.setText(model.getValueAt(row, 4).toString()); 
            yearpublished.setText(model.getValueAt(row, 5).toString()); 
            quantity.setText(model.getValueAt(row, 6).toString()); 
            pages.setText(model.getValueAt(row, 7).toString());
            String selectedStatus = model.getValueAt(row, 8).toString(); 
            status.setSelectedItem(selectedStatus);
            book_id.setText(model.getValueAt(row, 0).toString());
        }
    }
    
    public void insertData(String Title, String Author, String ISBN, String Publisher, String YearPublished, String Quantity, String Pages, String Status, String BookID, String studentId) {
        Connection con = dbConnect.con; 
        String query = "INSERT INTO bookborrowing (`Title`, `Author`, `ISBN`, `Publisher`, `YearPublished`, `Quantity`, `Pages`, `Status`, `BookID`, `StudentID`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
            pst.setString(10, studentId);
            pst.executeUpdate();
            System.out.println("Student Info Inserted");
            javax.swing.JOptionPane.showMessageDialog(contentPane, "Student Info Inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void displayme(String userId) {
        Connection con = dbConnect.con; 
        String query = "SELECT * FROM students WHERE user_id = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, userId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String fetchedUsername = rs.getString("StudentID");
                studentId.setText(fetchedUsername);     
            } else {
                System.out.println("User not found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
