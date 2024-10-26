package library_system;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class Register extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField password;
	private JTextField email;
	private JTextField fullname;
	private JComboBox<String> userrole;
	private DbConnect db;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Register() {
		setType(Type.POPUP);
		db = new DbConnect();
		db.connect();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 436);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea txtrRegister = new JTextArea();
		txtrRegister.setBounds(120, 72, 159, 40);
		txtrRegister.setFont(new Font("Arial", Font.BOLD, 30));
		txtrRegister.setBackground(new Color(0, 128, 128));
		txtrRegister.setForeground(new Color(255, 255, 255));
		txtrRegister.setText("REGISTER");
		contentPane.add(txtrRegister);
		
		JTextArea txtrUsername = new JTextArea();
		txtrUsername.setBounds(110, 138, 107, 22);
		txtrUsername.setText("Username:");
		txtrUsername.setForeground(Color.WHITE);
		txtrUsername.setFont(new Font("Arial", Font.BOLD, 15));
		txtrUsername.setBackground(new Color(0, 128, 128));
		contentPane.add(txtrUsername);
		
		username = new JTextField();
		username.setBounds(110, 162, 216, 30);
		username.setBackground(new Color(255, 255, 255));
		username.setFont(new Font("Arial", Font.PLAIN, 16));
		contentPane.add(username);
		username.setColumns(10);
		
		JTextArea txtrPassword = new JTextArea();
		txtrPassword.setBounds(110, 195, 107, 22);
		txtrPassword.setText("Password:");
		txtrPassword.setForeground(Color.WHITE);
		txtrPassword.setFont(new Font("Arial", Font.BOLD, 15));
		txtrPassword.setBackground(new Color(0, 128, 128));
		contentPane.add(txtrPassword);
		
		password = new JPasswordField();
		password.setBounds(110, 217, 216, 30);
		password.setBackground(new Color(255, 255, 255));
		password.setFont(new Font("Arial", Font.PLAIN, 16));
		password.setColumns(10);
		contentPane.add(password);
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setBounds(110, 257, 65, 17);
		txtrEmail.setText("Email:");
		txtrEmail.setForeground(Color.WHITE);
		txtrEmail.setFont(new Font("Arial", Font.BOLD, 15));
		txtrEmail.setBackground(new Color(0, 128, 128));
		contentPane.add(txtrEmail);
		
		email = new JTextField();
		email.setBounds(110, 284, 216, 30);
		email.setBackground(new Color(255, 255, 255));
		email.setFont(new Font("Arial", Font.PLAIN, 16));
		email.setColumns(10);
		contentPane.add(email);
		
		JTextArea txtrFullName = new JTextArea();
		txtrFullName.setBounds(352, 138, 111, 22);
		txtrFullName.setText("Full Name:");
		txtrFullName.setForeground(Color.WHITE);
		txtrFullName.setFont(new Font("Arial", Font.BOLD, 15));
		txtrFullName.setBackground(new Color(0, 128, 128));
		contentPane.add(txtrFullName);
		
		fullname = new JTextField();
		fullname.setBounds(352, 162, 216, 30);
		fullname.setBackground(new Color(255, 255, 255));
		fullname.setFont(new Font("Arial", Font.PLAIN, 16));
		fullname.setColumns(10);
		contentPane.add(fullname);
		
		// User Role label and combo box
		JTextArea role = new JTextArea();
		role.setBounds(352, 194, 111, 22);
		role.setText("User Role:");
		role.setForeground(Color.WHITE);
		role.setFont(new Font("Arial", Font.BOLD, 15));
		role.setBackground(new Color(0, 128, 128));
		contentPane.add(role);
		
		userrole = new JComboBox<>();
		userrole.setBounds(352, 219, 216, 28);
		userrole.setBackground(new Color(255, 255, 255));
		userrole.setModel(new DefaultComboBoxModel<>(new String[] {"Select role...", "Librarian", "Student"}));
		userrole.setFont(new Font("Arial", Font.PLAIN, 16));
		contentPane.add(userrole);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(469, 284, 99, 30);
		btnSubmit.setForeground(new Color(255, 255, 255));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname = username.getText();
				String pass = password.getText();
				String mail = email.getText();
				String fname = fullname.getText();
				String role = userrole.getSelectedItem().toString();
				
				if(uname.isEmpty() || pass.isEmpty() || mail.isEmpty() || fname.isEmpty() || role.equals("Select role...")) {
					JOptionPane.showMessageDialog(null, "Please fill all fields!");
				} else {
					insertData(uname, pass, mail, fname, role);
				}
			}
		});
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mainframe = new MainFrame();
				mainframe.setVisible(true);
				dispose(); 
			}
		});
		
		btnSubmit.setBackground(new Color(41, 82, 82));
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(btnSubmit);
		
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
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/lone.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(301, 51, 368, 77);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image lineimg = new ImageIcon(this.getClass().getResource("/lone.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(lineimg));
		lblNewLabel_1.setBounds(-22, 51, 107, 77);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image lineimgs = new ImageIcon(this.getClass().getResource("/lone.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(lineimgs));
		lblNewLabel_2.setBounds(-14, 22, 437, 40);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image lineimge = new ImageIcon(this.getClass().getResource("/lone.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(lineimge));
		lblNewLabel_3.setBounds(-22, 312, 700, 77);
		contentPane.add(lblNewLabel_3);
	}

	private void insertData(String username, String password, String email, String fullname, String userrole) {
		String query = "INSERT INTO register (username, password, email, fullname, userrole) VALUES (?, ?, ?, ?, ?)";

		try {
		    PreparedStatement pst = db.con.prepareStatement(query);
		    pst.setString(1, username);
		    pst.setString(2, password);
		    pst.setString(3, email);
		    pst.setString(4, fullname);
		    pst.setString(5, userrole);
		 
		    System.out.println("Executing query: " + query);
		    System.out.println("Values: " + username + ", " + password + ", " + email + ", " + fullname + ", " + userrole);
		    pst.executeUpdate();
		    JOptionPane.showMessageDialog(null, "User registered successfully!");
		} catch (SQLException e) {
		    System.out.println("SQL Error: " + e.getMessage());
		    e.printStackTrace();
		    JOptionPane.showMessageDialog(null, "Failed to register user! " + e.getMessage());
		}
	}
}
