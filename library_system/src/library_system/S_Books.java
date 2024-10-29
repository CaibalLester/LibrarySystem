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
import javax.swing.ScrollPaneConstants;
import java.awt.ScrollPane;

public class S_Books extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton btnBack;
    private DefaultTableModel model;
    private DbConnect dbConnect;
    private static String userId;
    private JTextField textField;
    private JComboBox<String> comboBox;
    private JTable table;


    public void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	DbConnect dbConnect = new DbConnect();
                    dbConnect.connect();  
                    S_Books frame = new S_Books(userId);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public S_Books(String userID) {
    	userId = userID;
        dbConnect = new DbConnect();  
        dbConnect.connect(); 
        setBackground(new Color(255, 255, 255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 856, 648);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 128, 128));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JTextArea txtrBorrowingComplianceManagement = new JTextArea();
        txtrBorrowingComplianceManagement.setText("BOOKS INFORMATION");
        txtrBorrowingComplianceManagement.setForeground(Color.WHITE);
        txtrBorrowingComplianceManagement.setFont(new Font("Arial", Font.BOLD, 30));
        txtrBorrowingComplianceManagement.setBackground(new Color(0, 128, 128));
        txtrBorrowingComplianceManagement.setBounds(30, 28, 522, 40);
        contentPane.add(txtrBorrowingComplianceManagement);
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
        btnBack.setBounds(709, 28, 99, 30);
        contentPane.add(btnBack);
        
        comboBox = new JComboBox<>();
        comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Title", "Author", "ISBN", "Publisher","YearPublished"}));
        comboBox.setBounds(30, 104, 195, 30);
        contentPane.add(comboBox);
        
        textField = new JTextField();
        textField.setBounds(235, 104, 415, 30);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JButton btnSearch = new JButton("Search");
        btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String categ = comboBox.getSelectedItem().toString();
				String search = textField.getText();
				Search(categ, search);
			}
		});
        btnSearch.setForeground(Color.WHITE);
        btnSearch.setFont(new Font("Arial", Font.BOLD, 15));
        btnSearch.setBackground(new Color(41, 82, 82));
        btnSearch.setBounds(660, 103, 148, 30);
        contentPane.add(btnSearch);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(30, 158, 778, 405);
        contentPane.add(scrollPane);
        
        table = new JTable();
        scrollPane.setViewportView(table);
        model = new DefaultTableModel(
            new Object[][] {},
            new String[] {"Book ID", "Title", "Author", "ISBN", "Publisher", "Year Published", "Quantity", "Pages", "Status"}
        );
        table.setModel(model);
        scrollPane.setViewportView(table);

        loadDataIntoTable();

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
    
    private void Search(String categ, String search) {
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
		dtm.setRowCount(0);
		
        DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection

        try {
            Connection con = dbConnect.con; // Use the connection from DbConnect
            String query = "SELECT * FROM book WHERE " + categ + " LIKE ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1,"%" + search + "%");
            ResultSet rs = pst.executeQuery();
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
}
