package library_system;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

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
		txtrRegister.setFont(new Font("Arial", Font.BOLD, 30));
		txtrRegister.setBackground(new Color(0, 128, 128));
		txtrRegister.setForeground(new Color(255, 255, 255));
		txtrRegister.setText("REGISTER");
		txtrRegister.setBounds(245, 39, 181, 40);
		contentPane.add(txtrRegister);
		
		JTextArea txtrUsername = new JTextArea();
		txtrUsername.setText("Username:");
		txtrUsername.setForeground(Color.WHITE);
		txtrUsername.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername.setBackground(new Color(0, 128, 128));
		txtrUsername.setBounds(181, 103, 107, 30);
		contentPane.add(txtrUsername);
		
		username = new JTextField();
		username.setBackground(new Color(177, 216, 216));
		username.setFont(new Font("Arial", Font.PLAIN, 16));
		username.setBounds(298, 103, 216, 30);
		contentPane.add(username);
		username.setColumns(10);
		
		JTextArea txtrPassword = new JTextArea();
		txtrPassword.setText("Password:");
		txtrPassword.setForeground(Color.WHITE);
		txtrPassword.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword.setBackground(new Color(0, 128, 128));
		txtrPassword.setBounds(181, 143, 107, 30);
		contentPane.add(txtrPassword);
		
		password = new JTextField();
		password.setBackground(new Color(177, 216, 216));
		password.setFont(new Font("Arial", Font.PLAIN, 16));
		password.setColumns(10);
		password.setBounds(298, 143, 216, 30);
		contentPane.add(password);
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setText("Email:");
		txtrEmail.setForeground(Color.WHITE);
		txtrEmail.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmail.setBackground(new Color(0, 128, 128));
		txtrEmail.setBounds(223, 182, 65, 30);
		contentPane.add(txtrEmail);
		
		email = new JTextField();
		email.setBackground(new Color(177, 216, 216));
		email.setFont(new Font("Arial", Font.PLAIN, 16));
		email.setColumns(10);
		email.setBounds(298, 181, 216, 30);
		contentPane.add(email);
		
		JTextArea txtrFullName = new JTextArea();
		txtrFullName.setText("Full Name:");
		txtrFullName.setForeground(Color.WHITE);
		txtrFullName.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName.setBackground(new Color(0, 128, 128));
		txtrFullName.setBounds(182, 220, 111, 30);
		contentPane.add(txtrFullName);
		
		fullname = new JTextField();
		fullname.setBackground(new Color(177, 216, 216));
		fullname.setFont(new Font("Arial", Font.PLAIN, 16));
		fullname.setColumns(10);
		fullname.setBounds(298, 220, 216, 30);
		contentPane.add(fullname);
		
		// User Role label and combo box
		JTextArea role = new JTextArea();
		role.setText("User Role:");
		role.setForeground(Color.WHITE);
		role.setFont(new Font("Arial", Font.BOLD, 20));
		role.setBackground(new Color(0, 128, 128));
		role.setBounds(182, 259, 111, 30);
		contentPane.add(role);
		
		userrole = new JComboBox<>();
		userrole.setBackground(new Color(177, 216, 216));
		userrole.setModel(new DefaultComboBoxModel<>(new String[] {"Select role...", "Librarian", "Student"}));
		userrole.setFont(new Font("Arial", Font.PLAIN, 16));
		userrole.setBounds(298, 261, 216, 28);
		contentPane.add(userrole);
		
		JButton btnSubmit = new JButton("Submit");
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
		btnSubmit.setBackground(new Color(41, 82, 82));
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 15));
		btnSubmit.setBounds(415, 315, 99, 30);
		contentPane.add(btnSubmit);
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
