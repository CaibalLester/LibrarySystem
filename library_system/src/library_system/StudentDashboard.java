package library_system;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDashboard extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private DbConnect dbConnect;
    private JTextArea fullname;
    private JTextArea username;
    private String userId;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                StudentDashboard frame = new StudentDashboard("userId");
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public StudentDashboard(String userId) {
        this.userId = userId;
        dbConnect = new DbConnect();  
        dbConnect.connect(); 
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 439, 362);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(175, 216, 216));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JTextArea txtrStudentDashboard = new JTextArea();
        txtrStudentDashboard.setText("Student Dashboard");
        txtrStudentDashboard.setForeground(new Color(0, 128, 128));
        txtrStudentDashboard.setFont(new Font("Arial", Font.BOLD, 30));
        txtrStudentDashboard.setBackground(new Color(177, 216, 216));
        txtrStudentDashboard.setBounds(107, 21, 310, 43);
        contentPane.add(txtrStudentDashboard);
        
        JTextArea txtrStudentNumber = new JTextArea();
        txtrStudentNumber.setText("Student Number :");
        txtrStudentNumber.setForeground(new Color(0, 128, 128));
        txtrStudentNumber.setFont(new Font("Arial", Font.BOLD, 15));
        txtrStudentNumber.setBackground(new Color(177, 216, 216));
        txtrStudentNumber.setBounds(107, 83, 134, 22);
        contentPane.add(txtrStudentNumber);
        
        JTextArea txtrName = new JTextArea();
        txtrName.setText("Name : ");
        txtrName.setForeground(new Color(0, 128, 128));
        txtrName.setFont(new Font("Arial", Font.BOLD, 15));
        txtrName.setBackground(new Color(177, 216, 216));
        txtrName.setBounds(107, 106, 60, 22);
        contentPane.add(txtrName);
        
        fullname = new JTextArea();
        fullname.setText("***");
        fullname.setForeground(new Color(0, 128, 128));
        fullname.setFont(new Font("Arial", Font.BOLD, 15));
        fullname.setBackground(new Color(177, 216, 216));
        fullname.setBounds(177, 106, 167, 22);
        contentPane.add(fullname);
        
        username = new JTextArea();
        username.setText("***");
        username.setForeground(new Color(0, 128, 128));
        username.setFont(new Font("Arial", Font.BOLD, 15));
        username.setBackground(new Color(177, 216, 216));
        username.setBounds(256, 83, 134, 22);
        contentPane.add(username);

        JButton btnManageBorrowing = new JButton("Manage Borrowed Books");
        btnManageBorrowing.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                S_BorrowingComplianceManagement BorrowingComplianceManagement = new S_BorrowingComplianceManagement(userId);
                BorrowingComplianceManagement.setVisible(true);
                dispose();
            }
        });
        btnManageBorrowing.setForeground(Color.WHITE);
        btnManageBorrowing.setFont(new Font("Arial", Font.BOLD, 15));
        btnManageBorrowing.setBackground(new Color(0, 128, 128));
        btnManageBorrowing.setBounds(107, 138, 241, 43);
        contentPane.add(btnManageBorrowing);
        
        JButton btnManageBooks = new JButton("Manage Books");
        btnManageBooks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                S_Books SBooks = new S_Books(userId);
                SBooks.setVisible(true);
                dispose();
            }
        });
        btnManageBooks.setForeground(Color.WHITE);
        btnManageBooks.setFont(new Font("Arial", Font.BOLD, 15));
        btnManageBooks.setBackground(new Color(0, 128, 128));
        btnManageBooks.setBounds(107, 244, 241, 43);
        contentPane.add(btnManageBooks);
        
        JButton btnManageStudentInfo = new JButton("Manage My Info");
        btnManageStudentInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (userId != null) { 
                    S_StudentInfo SStudentInfo = new S_StudentInfo(userId, dbConnect); // Pass userId and dbConnect
                    SStudentInfo.setVisible(true);
                    dispose(); 
                } else {
                    JOptionPane.showMessageDialog(null, "User ID not available!");
                }
            }
        });



        btnManageStudentInfo.setForeground(Color.WHITE);
        btnManageStudentInfo.setFont(new Font("Arial", Font.BOLD, 15));
        btnManageStudentInfo.setBackground(new Color(0, 128, 128));
        btnManageStudentInfo.setBounds(107, 191, 241, 43);
        contentPane.add(btnManageStudentInfo);
        
        JLabel lblNewLabel = new JLabel("");
        Image img = new ImageIcon(this.getClass().getResource("/stwo.png")).getImage();
        lblNewLabel.setIcon(new ImageIcon(img));
        lblNewLabel.setBounds(31, 0, 60, 382);
        contentPane.add(lblNewLabel);

        displayUserInfo(userId); 
    }
    
    private void displayUserInfo(String userId) {
        Connection con = dbConnect.con; 
        String query = "SELECT user_id, fullname FROM register WHERE user_id = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, userId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String fetchedUsername = rs.getString("user_id");
                String fetchedFullname = rs.getString("fullname");

                username.setText(fetchedUsername); 
                fullname.setText(fetchedFullname); 
            } else {
                System.out.println("User not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
