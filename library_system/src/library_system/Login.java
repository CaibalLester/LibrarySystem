package library_system;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class Login extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField username;
    private JTextField password;
    private String userId, role;
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
        username.setBackground(new Color(255, 255, 255));
        username.setFont(new Font("Arial", Font.PLAIN, 16));
        username.setBounds(252, 87, 181, 28);
        contentPane.add(username);
        username.setColumns(10);
        
        password = new JPasswordField();
        password.setBackground(new Color(255, 255, 255));
        password.setFont(new Font("Arial", Font.PLAIN, 16));
        password.setColumns(10);
        password.setBounds(252, 125, 181, 28);
        contentPane.add(password);
        
        JTextArea txtrLogin = new JTextArea();
        txtrLogin.setForeground(new Color(255, 255, 255));
        txtrLogin.setFont(new Font("Arial", Font.BOLD, 30));
        txtrLogin.setText("LOG IN");
        txtrLogin.setBackground(new Color(0, 128, 128));
        txtrLogin.setBounds(115, 24, 112, 40);
        contentPane.add(txtrLogin);
        
        JTextArea txtrUsername_1 = new JTextArea();
        txtrUsername_1.setText("Username :");
        txtrUsername_1.setForeground(Color.WHITE);
        txtrUsername_1.setFont(new Font("Arial", Font.BOLD, 20));
        txtrUsername_1.setBackground(new Color(0, 128, 128));
        txtrUsername_1.setBounds(115, 87, 133, 30);
        contentPane.add(txtrUsername_1);
        
        JTextArea txtrPassword_1 = new JTextArea();
        txtrPassword_1.setText("Password :");
        txtrPassword_1.setForeground(Color.WHITE);
        txtrPassword_1.setFont(new Font("Arial", Font.BOLD, 20));
        txtrPassword_1.setBackground(new Color(0, 128, 128));
        txtrPassword_1.setBounds(115, 127, 125, 30);
        contentPane.add(txtrPassword_1);
        
        JButton btnLogin = new JButton("Login");
        btnLogin.setForeground(new Color(0, 128, 128));
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = username.getText();
                String pass = password.getText();

                authenticate(user,pass);
                if (userId != null) {
                    if (role.equals("Librarian")) {
                        LibrarianDashboard librarianDashboard = new LibrarianDashboard(userId); 
                        librarianDashboard.setVisible(true);
                    } else {
                        StudentDashboard studentDashboard = new StudentDashboard(userId); 
                        studentDashboard.setVisible(true);
                    }
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid credentials or role. Please try again.");
                }
                
            }
        });



        btnLogin.setFont(new Font("Arial", Font.BOLD, 15));
        btnLogin.setBackground(new Color(255, 255, 255));
        btnLogin.setBounds(334, 233, 99, 30);
        contentPane.add(btnLogin);
        
        JLabel lblNewLabel_1 = new JLabel("");
        Image lineimg = new ImageIcon(this.getClass().getResource("/lone.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(lineimg));
        lblNewLabel_1.setBounds(242, 0, 297, 77);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("");
        Image lineim = new ImageIcon(this.getClass().getResource("/lone.png")).getImage();
        lblNewLabel_1_1.setIcon(new ImageIcon(lineim));
        lblNewLabel_1_1.setBounds(-43, 203, 350, 77);
        contentPane.add(lblNewLabel_1_1);
        
        JButton btnGoback = new JButton("Go back");
        btnGoback.setForeground(new Color(255, 255, 255));
        btnGoback.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		MainFrame Main = new MainFrame();
        		Main.setVisible(true);
				dispose();
        	}
        });
        btnGoback.setBounds(10, 11, 95, 28);
        btnGoback.setFont(new Font("Arial", Font.BOLD, 15));
        btnGoback.setBackground(new Color(0, 128, 128));
        contentPane.add(btnGoback);
    }

    private void authenticate(String username, String password) {
        try {
            Connection con = dbConnect.con;
            String query = "SELECT user_id, userrole FROM register WHERE username = ? AND password = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                userId = rs.getString("user_id");
                role = rs.getString("userrole");
            } else {
            	userId = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
