package library_system;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Login extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField username;
    private JTextField password;
    private DbConnect dbConnect;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Login() {
        dbConnect = new DbConnect();  
        dbConnect.connect(); 
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 539, 327);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 128, 128));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        username = new JTextField();
        username.setBackground(new Color(177, 216, 216));
        username.setFont(new Font("Arial", Font.PLAIN, 16));
        username.setBounds(252, 99, 181, 28);
        contentPane.add(username);
        username.setColumns(10);
        
        password = new JTextField();
        password.setBackground(new Color(177, 216, 216));
        password.setFont(new Font("Arial", Font.PLAIN, 16));
        password.setColumns(10);
        password.setBounds(252, 137, 181, 28);
        contentPane.add(password);
        
        JTextArea txtrLogin = new JTextArea();
        txtrLogin.setForeground(new Color(255, 255, 255));
        txtrLogin.setFont(new Font("Arial", Font.BOLD, 30));
        txtrLogin.setText("LOG IN");
        txtrLogin.setBackground(new Color(0, 128, 128));
        txtrLogin.setBounds(201, 29, 112, 40);
        contentPane.add(txtrLogin);
        
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setBackground(new Color(177, 216, 216));
        comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Librarian", "Student"}));
        comboBox.setFont(new Font("Arial", Font.PLAIN, 16));
        comboBox.setBounds(252, 175, 181, 28);
        contentPane.add(comboBox);
        
        JTextArea txtrUsername_1 = new JTextArea();
        txtrUsername_1.setText("Username :");
        txtrUsername_1.setForeground(Color.WHITE);
        txtrUsername_1.setFont(new Font("Arial", Font.BOLD, 20));
        txtrUsername_1.setBackground(new Color(0, 128, 128));
        txtrUsername_1.setBounds(115, 99, 133, 30);
        contentPane.add(txtrUsername_1);
        
        JTextArea txtrPassword_1 = new JTextArea();
        txtrPassword_1.setText("Password :");
        txtrPassword_1.setForeground(Color.WHITE);
        txtrPassword_1.setFont(new Font("Arial", Font.BOLD, 20));
        txtrPassword_1.setBackground(new Color(0, 128, 128));
        txtrPassword_1.setBounds(115, 139, 125, 30);
        contentPane.add(txtrPassword_1);
        
        JTextArea txtrUserRole = new JTextArea();
        txtrUserRole.setText("User Role :");
        txtrUserRole.setForeground(Color.WHITE);
        txtrUserRole.setFont(new Font("Arial", Font.BOLD, 20));
        txtrUserRole.setBackground(new Color(0, 128, 128));
        txtrUserRole.setBounds(115, 175, 111, 30);
        contentPane.add(txtrUserRole);
        
        JButton btnLogin = new JButton("Login");
        btnLogin.setForeground(new Color(255, 255, 255));
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = username.getText();
                String pass = password.getText();
                String role = comboBox.getSelectedItem().toString();

                if (authenticate(user, pass, role)) {
                    if (role.equals("Librarian")) {
                        LibrarianDashboard librarianDashboard = new LibrarianDashboard();
                        librarianDashboard.setVisible(true);
                    } else {
                        StudentDashboard studentDashboard = new StudentDashboard();
                        studentDashboard.setVisible(true);
                    }
                    dispose(); 
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid credentials or role. Please try again.");
                }
            }
        });
        btnLogin.setFont(new Font("Arial", Font.BOLD, 15));
        btnLogin.setBackground(new Color(41, 82, 82));
        btnLogin.setBounds(332, 226, 99, 30);
        contentPane.add(btnLogin);
    }

    private boolean authenticate(String username, String password, String role) {
        try {
            Connection con = dbConnect.con;  
            String query = "SELECT * FROM Register WHERE username = ? AND password = ? AND userrole = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, role);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
