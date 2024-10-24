package library_system;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
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
    private DefaultTableModel model;
    private JTable table_1;

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

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(39, 163, 367, 406);
        contentPane.add(scrollPane);

        table = new JTable();
        model = new DefaultTableModel(
                new Object[][] {},
                new String[] { "Title", "Author", "ISBN", "Publisher", "Year Published", "Quantity", "Pages", "Status" }
        );
        table.setModel(model);
        scrollPane.setViewportView(table);

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
        textField_6.setBounds(835, 394, 287, 30);
        contentPane.add(textField_6);

        textField_7 = new JTextField();
        textField_7.setFont(new Font("Arial", Font.PLAIN, 16));
        textField_7.setColumns(10);
        textField_7.setBackground(new Color(177, 216, 216));
        textField_7.setBounds(835, 434, 287, 30);
        contentPane.add(textField_7);

        btnAdd = new JButton("Add");
        btnAdd.setForeground(Color.WHITE);
        btnAdd.setFont(new Font("Arial", Font.BOLD, 15));
        btnAdd.setBackground(new Color(41, 82, 82));
        btnAdd.setBounds(1023, 473, 99, 30);
        contentPane.add(btnAdd);

        btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StudentDashboard studentDashboard = new StudentDashboard();
                studentDashboard.setVisible(true);
                dispose();
            }
        });
        btnBack.setForeground(Color.WHITE);
        btnBack.setFont(new Font("Arial", Font.BOLD, 15));
        btnBack.setBackground(new Color(41, 82, 82));
        btnBack.setBounds(1168, 559, 99, 30);
        contentPane.add(btnBack);
        
        table_1 = new JTable();
        table_1.setBounds(439, 163, 320, 406);
        contentPane.add(table_1);

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
            String query = "SELECT * FROM book";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                model.addRow(new Object[]{
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

    // Method to display selected row in text fields
    private void displaySelectedRow(int row) {
        if (row >= 0) {
            textField.setText(model.getValueAt(row, 0).toString()); // Title
            textField_1.setText(model.getValueAt(row, 1).toString()); // Author
            textField_2.setText(model.getValueAt(row, 2).toString()); // ISBN
            textField_3.setText(model.getValueAt(row, 3).toString()); // Publisher
            textField_4.setText(model.getValueAt(row, 4).toString()); // Year Published
            textField_5.setText(model.getValueAt(row, 5).toString()); // Quantity
            textField_6.setText(model.getValueAt(row, 6).toString()); // Pages
            textField_7.setText(model.getValueAt(row, 7).toString()); // Status
        }
    }
}
