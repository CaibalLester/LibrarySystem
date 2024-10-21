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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class L_Books extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private JTextField title;
    private JTextField author;
    private JTextField isbn;
    private JTextField publisher;
    private JTextField yearpublished;
    private JTextField quantity;
    private JTextField pages;
    private DefaultTableModel model; 
    private JComboBox<String> status; 
    private DbConnect db; 


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


    public L_Books() {	
        db = new DbConnect();
        db.connect();
        
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
        
        model = new DefaultTableModel(
            new Object[][] {},
            new String[] {"Book ID", "Title", "Author", "ISBN", "Publisher", "Year Published", "Quantity", "Pages", "Status"}
        );
        table = new JTable(model);
        scrollPane.setViewportView(table);
    	db = new DbConnect();
    	db.connect();
    	loadBooks();
    	table.addMouseListener(new java.awt.event.MouseAdapter() {
    	    public void mouseClicked(java.awt.event.MouseEvent evt) {
    	        int selectedRow = table.getSelectedRow();
    	        if (selectedRow != -1) {
    	            // Get values from the selected row
    	            title.setText(model.getValueAt(selectedRow, 1).toString());
    	            author.setText(model.getValueAt(selectedRow, 2).toString());
    	            isbn.setText(model.getValueAt(selectedRow, 3).toString());
    	            publisher.setText(model.getValueAt(selectedRow, 4).toString());
    	            yearpublished.setText(model.getValueAt(selectedRow, 5).toString());
    	            quantity.setText(model.getValueAt(selectedRow, 6).toString());
    	            pages.setText(model.getValueAt(selectedRow, 7).toString());
    	            status.setSelectedItem(model.getValueAt(selectedRow, 8).toString());
    	        }
    	    }
    	});

        JTextArea txtrLibraryBooks = new JTextArea();
        txtrLibraryBooks.setText("Library Books");
        txtrLibraryBooks.setForeground(Color.WHITE);
        txtrLibraryBooks.setFont(new Font("Arial", Font.BOLD, 30));
        txtrLibraryBooks.setBackground(new Color(0, 128, 128));
        txtrLibraryBooks.setBounds(20, 100, 214, 40);
        contentPane.add(txtrLibraryBooks);
        
        title = new JTextField();
        title.setFont(new Font("Arial", Font.PLAIN, 16));
        title.setColumns(10);
        title.setBackground(new Color(177, 216, 216));
        title.setBounds(835, 155, 287, 30);
        contentPane.add(title);
        
        author = new JTextField();
        author.setFont(new Font("Arial", Font.PLAIN, 16));
        author.setColumns(10);
        author.setBackground(new Color(177, 216, 216));
        author.setBounds(835, 192, 287, 30);
        contentPane.add(author);
        
        isbn = new JTextField();
        isbn.setFont(new Font("Arial", Font.PLAIN, 16));
        isbn.setColumns(10);
        isbn.setBackground(new Color(177, 216, 216));
        isbn.setBounds(835, 232, 287, 30);
        contentPane.add(isbn);
        
        publisher = new JTextField();
        publisher.setFont(new Font("Arial", Font.PLAIN, 16));
        publisher.setColumns(10);
        publisher.setBackground(new Color(177, 216, 216));
        publisher.setBounds(835, 272, 287, 30);
        contentPane.add(publisher);
        
        yearpublished = new JTextField();
        yearpublished.setFont(new Font("Arial", Font.PLAIN, 16));
        yearpublished.setColumns(10);
        yearpublished.setBackground(new Color(177, 216, 216));
        yearpublished.setBounds(835, 310, 287, 30);
        contentPane.add(yearpublished);
        
        quantity = new JTextField();
        quantity.setFont(new Font("Arial", Font.PLAIN, 16));
        quantity.setColumns(10);
        quantity.setBackground(new Color(177, 216, 216));
        quantity.setBounds(835, 349, 287, 30);
        contentPane.add(quantity);
        
        pages = new JTextField();
        pages.setFont(new Font("Arial", Font.PLAIN, 16));
        pages.setColumns(10);
        pages.setBackground(new Color(177, 216, 216));
        pages.setBounds(835, 389, 287, 30);
        contentPane.add(pages);
        
        JButton btnEditBook = new JButton("Edit Book");
        btnEditBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    int bookID = (int) model.getValueAt(selectedRow, 0); // Get BookID from the selected row
                    String titleText = title.getText();
                    String authorText = author.getText();
                    String isbnText = isbn.getText();
                    String publisherText = publisher.getText();
                    String yearPublishedText = yearpublished.getText();
                    String quantityText = quantity.getText();
                    String pagesText = pages.getText();
                    String statusText = status.getSelectedItem().toString();
                    
                    updateBook(bookID, titleText, authorText, isbnText, publisherText, yearPublishedText, quantityText, pagesText, statusText);

                    model.setValueAt(titleText, selectedRow, 1);
                    model.setValueAt(authorText, selectedRow, 2);
                    model.setValueAt(isbnText, selectedRow, 3);
                    model.setValueAt(publisherText, selectedRow, 4);
                    model.setValueAt(yearPublishedText, selectedRow, 5);
                    model.setValueAt(quantityText, selectedRow, 6);
                    model.setValueAt(pagesText, selectedRow, 7);
                    model.setValueAt(statusText, selectedRow, 8);
                } else {
                    javax.swing.JOptionPane.showMessageDialog(contentPane, "Please select a book to edit.");
                }
            }
        });

        btnEditBook.setForeground(Color.WHITE);
        btnEditBook.setFont(new Font("Arial", Font.BOLD, 15));
        btnEditBook.setBackground(new Color(41, 82, 82));
        btnEditBook.setBounds(1132, 152, 130, 30);
        contentPane.add(btnEditBook);
        
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
        
        JTextArea txtrTitle = new JTextArea();
        txtrTitle.setText("Title");
        txtrTitle.setForeground(Color.WHITE);
        txtrTitle.setFont(new Font("Arial", Font.BOLD, 20));
        txtrTitle.setBackground(new Color(0, 128, 128));
        txtrTitle.setBounds(664, 159, 130, 30);
        contentPane.add(txtrTitle);
        
        JTextArea txtrAuthor = new JTextArea();
        txtrAuthor.setText("Author");
        txtrAuthor.setForeground(Color.WHITE);
        txtrAuthor.setFont(new Font("Arial", Font.BOLD, 20));
        txtrAuthor.setBackground(new Color(0, 128, 128));
        txtrAuthor.setBounds(664, 192, 130, 30);
        contentPane.add(txtrAuthor);
        
        JTextArea txtrISBN = new JTextArea();
        txtrISBN.setText("ISBN");
        txtrISBN.setForeground(Color.WHITE);
        txtrISBN.setFont(new Font("Arial", Font.BOLD, 20));
        txtrISBN.setBackground(new Color(0, 128, 128));
        txtrISBN.setBounds(664, 232, 130, 30);
        contentPane.add(txtrISBN);
        
        JTextArea txtrPublisher = new JTextArea();
        txtrPublisher.setText("Publisher");
        txtrPublisher.setForeground(Color.WHITE);
        txtrPublisher.setFont(new Font("Arial", Font.BOLD, 20));
        txtrPublisher.setBackground(new Color(0, 128, 128));
        txtrPublisher.setBounds(664, 272, 130, 30);
        contentPane.add(txtrPublisher);
        
        JTextArea txtrYearPublished = new JTextArea();
        txtrYearPublished.setText("Year Published");
        txtrYearPublished.setForeground(Color.WHITE);
        txtrYearPublished.setFont(new Font("Arial", Font.BOLD, 20));
        txtrYearPublished.setBackground(new Color(0, 128, 128));
        txtrYearPublished.setBounds(664, 310, 130, 30);
        contentPane.add(txtrYearPublished);
        
        JTextArea txtrQuantity = new JTextArea();
        txtrQuantity.setText("Quantity");
        txtrQuantity.setForeground(Color.WHITE);
        txtrQuantity.setFont(new Font("Arial", Font.BOLD, 20));
        txtrQuantity.setBackground(new Color(0, 128, 128));
        txtrQuantity.setBounds(664, 349, 130, 30);
        contentPane.add(txtrQuantity);
        
        JTextArea txtrPages = new JTextArea();
        txtrPages.setText("Pages");
        txtrPages.setForeground(Color.WHITE);
        txtrPages.setFont(new Font("Arial", Font.BOLD, 20));
        txtrPages.setBackground(new Color(0, 128, 128));
        txtrPages.setBounds(664, 389, 130, 30);
        contentPane.add(txtrPages);
        
        status = new JComboBox<String>();
        status.setModel(new DefaultComboBoxModel<String>(new String[] {"Available", "Checked Out", "Reserved"}));
        status.setFont(new Font("Arial", Font.PLAIN, 16));
        status.setBackground(new Color(177, 216, 216));
        status.setBounds(835, 429, 287, 30);
        contentPane.add(status);
        
        JTextArea txtrStatus = new JTextArea();
        txtrStatus.setText("Status");
        txtrStatus.setForeground(Color.WHITE);
        txtrStatus.setFont(new Font("Arial", Font.BOLD, 20));
        txtrStatus.setBackground(new Color(0, 128, 128));
        txtrStatus.setBounds(664, 429, 130, 30);
        contentPane.add(txtrStatus);
        
        JButton btnAddBook = new JButton("Add Book");
        btnAddBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String titleText = title.getText();
                String authorText = author.getText();
                String isbnText = isbn.getText();
                String publisherText = publisher.getText();
                String yearPublishedText = yearpublished.getText();
                String quantityText = quantity.getText();
                String pagesText = pages.getText();
                String statusText = status.getSelectedItem().toString();
                
                System.out.println("Inserting Book: " + titleText + ", " + authorText + ", " + isbnText + ", " + publisherText + ", " + yearPublishedText + ", " + quantityText + ", " + pagesText + ", " + statusText);
                insertBook(titleText, authorText, isbnText, publisherText, yearPublishedText, quantityText, pagesText, statusText);
                model.addRow(new String[]{titleText, authorText, isbnText, publisherText, yearPublishedText, quantityText, pagesText, statusText});
                
                title.setText("");
                author.setText("");
                isbn.setText("");
                publisher.setText("");
                yearpublished.setText("");
                quantity.setText("");
                pages.setText("");
                status.setSelectedIndex(0);
            }
        });
        btnAddBook.setForeground(Color.WHITE);
        btnAddBook.setFont(new Font("Arial", Font.BOLD, 15));
        btnAddBook.setBackground(new Color(41, 82, 82));
        btnAddBook.setBounds(1132, 232, 130, 30);
        contentPane.add(btnAddBook);
        
        JButton btnDeleteBook = new JButton("Delete Book");
        btnDeleteBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    int bookID = (int) model.getValueAt(selectedRow, 0);
                    deleteBook(bookID);
                    model.removeRow(selectedRow);
                } else {
                    javax.swing.JOptionPane.showMessageDialog(contentPane, "Please select a book to delete.");
                }
            }
        });
        btnDeleteBook.setForeground(Color.WHITE);
        btnDeleteBook.setFont(new Font("Arial", Font.BOLD, 15));
        btnDeleteBook.setBackground(new Color(41, 82, 82));
        btnDeleteBook.setBounds(1132, 192, 130, 30);
        contentPane.add(btnDeleteBook);
        
        JButton btnrefresh = new JButton("Refresh");
        btnrefresh.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		loadBooks();
        	}
        });
        btnrefresh.setForeground(Color.WHITE);
        btnrefresh.setFont(new Font("Arial", Font.BOLD, 15));
        btnrefresh.setBackground(new Color(41, 82, 82));
        btnrefresh.setBounds(1132, 272, 130, 30);
        contentPane.add(btnrefresh);

 }

    public void insertBook(String title, String author, String isbn, String publisher, String yearPublished, String quantity, String pages, String status) {
        String query = "INSERT INTO book (Title, Author, ISBN, Publisher, YearPublished, Quantity, Pages, Status) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pst = db.con.prepareStatement(query)) {
            pst.setString(1, title);
            pst.setString(2, author);
            pst.setString(3, isbn);
            pst.setString(4, publisher);
            pst.setString(5, yearPublished);
            pst.setString(6, quantity);
            pst.setString(7, pages);
            pst.setString(8, status);
            pst.executeUpdate();
            System.out.println("Book Inserted");
        } catch (SQLException e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(contentPane, "Error inserting book. Please check your input and try again.");
        }
    }

    public void deleteBook(int bookID) {
        String query = "DELETE FROM book WHERE BookID=?";
        try (PreparedStatement pst = db.con.prepareStatement(query)) {
            pst.setInt(1, bookID);
            pst.executeUpdate();
            System.out.println("Book Deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateBook(int bookID, String title, String author, String isbn, String publisher, String yearPublished, String quantity, String pages, String status) {
        String query = "UPDATE book SET Title=?, Author=?, ISBN=?, Publisher=?, YearPublished=?, Quantity=?, Pages=?, Status=? WHERE BookID=?";
        try (PreparedStatement pst = db.con.prepareStatement(query)) {
            pst.setString(1, title);
            pst.setString(2, author);
            pst.setString(3, isbn);
            pst.setString(4, publisher);
            pst.setString(5, yearPublished);
            pst.setString(6, quantity);
            pst.setString(7, pages);
            pst.setString(8, status);
            pst.setInt(9, bookID); 
            pst.executeUpdate();
            System.out.println("Book Updated");
            javax.swing.JOptionPane.showMessageDialog(contentPane, "Book updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(contentPane, "Error updating book. Please check your input and try again.");
        }
    }

    public void loadBooks() {
        String query = "SELECT BookID, Title, Author, ISBN, Publisher, YearPublished, Quantity, Pages, Status FROM book";
        try (PreparedStatement pst = db.con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            model.setRowCount(0); 
            while (rs.next()) {
                int bookID = rs.getInt("BookID"); 
                String title = rs.getString("Title");
                String author = rs.getString("Author");
                String isbn = rs.getString("ISBN");
                String publisher = rs.getString("Publisher");
                String yearPublished = rs.getString("YearPublished");
                String quantity = rs.getString("Quantity");
                String pages = rs.getString("Pages");
                String status = rs.getString("Status");

                model.addRow(new Object[]{bookID, title, author, isbn, publisher, yearPublished, quantity, pages, status}); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
