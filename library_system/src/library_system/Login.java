package library_system;

import java.awt.EventQueue;

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

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public Login() {
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(177, 216, 216));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"select user...", "Librarian", "Student"}));
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
		
		JButton btnLogin = new JButton("login");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setFont(new Font("Arial", Font.BOLD, 15));
		btnLogin.setBackground(new Color(41, 82, 82));
		btnLogin.setBounds(332, 226, 99, 30);
		contentPane.add(btnLogin);
	}

}
