package library_system;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class L_LibrarianInfo extends JFrame {

	private static final long serialVersionUID = 1L;
	private static String userId;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextArea txtrUsername_2;
	private JTextArea txtrUsername_2_1;
	private JTextArea txtrUsername_2_2;
	private JTextArea txtrUsername_2_3;
	private JTextArea txtrUsername_2_4;
	private JTextArea txtrUsername_2_5_2;
	private JTextArea textArea;
	private JComboBox<String> comboBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L_LibrarianInfo frame = new L_LibrarianInfo(userId);
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
	public L_LibrarianInfo(String userID) {
		userId = userID;
		setResizable(false);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1260, 627);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBackground(new Color(72, 209, 204));
		textArea.setBounds(940, 335, 217, 115);
		contentPane.add(textArea);
		
		JTextArea txtrPassword = new JTextArea();
		txtrPassword.setText("Gender :");
		txtrPassword.setForeground(new Color(0, 128, 128));
		txtrPassword.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword.setBackground(new Color(255, 255, 255));
		txtrPassword.setBounds(80, 166, 107, 30);
		contentPane.add(txtrPassword);
		
		JTextArea txtrUsername = new JTextArea();
		txtrUsername.setText("Full Name :");
		txtrUsername.setForeground(new Color(0, 139, 139));
		txtrUsername.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername.setBackground(new Color(255, 255, 255));
		txtrUsername.setBounds(80, 126, 111, 30);
		contentPane.add(txtrUsername);
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setText("Email :");
		txtrEmail.setForeground(new Color(0, 128, 128));
		txtrEmail.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmail.setBackground(new Color(255, 255, 255));
		txtrEmail.setBounds(80, 206, 65, 30);
		contentPane.add(txtrEmail);
		
		JTextArea txtrFullName = new JTextArea();
		txtrFullName.setText("Contact Number :");
		txtrFullName.setForeground(new Color(0, 128, 128));
		txtrFullName.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName.setBackground(new Color(255, 255, 255));
		txtrFullName.setBounds(80, 246, 188, 30);
		contentPane.add(txtrFullName);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBackground(new Color(177, 216, 216));
		textField.setBounds(940, 125, 216, 30);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(177, 216, 216));
		textField_1.setBounds(940, 209, 216, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(177, 216, 216));
		textField_2.setBounds(940, 249, 216, 30);
		contentPane.add(textField_2);
		
		JTextArea txtrFullName_1_3 = new JTextArea();
		txtrFullName_1_3.setText("Librarian Address :");
		txtrFullName_1_3.setForeground(new Color(0, 128, 128));
		txtrFullName_1_3.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_3.setBackground(new Color(255, 255, 255));
		txtrFullName_1_3.setBounds(80, 327, 175, 30);
		contentPane.add(txtrFullName_1_3);
		
		JTextArea txtrEmergencyContact = new JTextArea();
		txtrEmergencyContact.setText("Emergency Contact :");
		txtrEmergencyContact.setForeground(new Color(0, 128, 128));
		txtrEmergencyContact.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmergencyContact.setBackground(new Color(255, 255, 255));
		txtrEmergencyContact.setBounds(80, 286, 202, 30);
		contentPane.add(txtrEmergencyContact);
		
		JTextArea txtrLibrarianPersonalInformation = new JTextArea();
		txtrLibrarianPersonalInformation.setText("LIBRARIAN PERSONAL INFORMATION");
		txtrLibrarianPersonalInformation.setForeground(Color.WHITE);
		txtrLibrarianPersonalInformation.setFont(new Font("Arial", Font.BOLD, 30));
		txtrLibrarianPersonalInformation.setBackground(new Color(0, 128, 128));
		txtrLibrarianPersonalInformation.setBounds(58, 32, 594, 40);
		contentPane.add(txtrLibrarianPersonalInformation);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String Fullname = textField.getText();
        		String Gender = comboBox.getSelectedItem().toString();
        		String Email = textField_1.getText();
        		String ContactNumber = textField_2.getText();
        		String EmergencyNumber = textField_4.getText();
        		String LibrarianAddress = textArea.getText();

        		saveInfo(userId, Fullname, Gender, Email, ContactNumber, EmergencyNumber, LibrarianAddress);
		    }
		});
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 15));
		btnSubmit.setBackground(new Color(41, 82, 82));
		btnSubmit.setBounds(1057, 462, 99, 30);
		contentPane.add(btnSubmit);
		
		JTextArea txtrUsername_1 = new JTextArea();
		txtrUsername_1.setText("Full Name :");
		txtrUsername_1.setForeground(new Color(0, 128, 128));
		txtrUsername_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_1.setBackground(Color.WHITE);
		txtrUsername_1.setBounds(793, 124, 111, 30);
		contentPane.add(txtrUsername_1);
		
		JTextArea txtrPassword_1 = new JTextArea();
		txtrPassword_1.setText("Gender :");
		txtrPassword_1.setForeground(new Color(0, 128, 128));
		txtrPassword_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1.setBackground(Color.WHITE);
		txtrPassword_1.setBounds(817, 168, 107, 30);
		contentPane.add(txtrPassword_1);
		
		JTextArea txtrEmail_1 = new JTextArea();
		txtrEmail_1.setText("Email :");
		txtrEmail_1.setForeground(new Color(0, 128, 128));
		txtrEmail_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmail_1.setBackground(Color.WHITE);
		txtrEmail_1.setBounds(837, 208, 65, 30);
		contentPane.add(txtrEmail_1);
		
		JTextArea txtrFullName_1 = new JTextArea();
		txtrFullName_1.setText("Contact Number :");
		txtrFullName_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1.setBackground(Color.WHITE);
		txtrFullName_1.setBounds(737, 248, 188, 30);
		contentPane.add(txtrFullName_1);
		
		JTextArea txtrEmergencyContact_1 = new JTextArea();
		txtrEmergencyContact_1.setText("Emergency Contact :");
		txtrEmergencyContact_1.setForeground(new Color(0, 128, 128));
		txtrEmergencyContact_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmergencyContact_1.setBackground(Color.WHITE);
		txtrEmergencyContact_1.setBounds(706, 288, 202, 30);
		contentPane.add(txtrEmergencyContact_1);
		
		JTextArea txtrFullName_1_3_1 = new JTextArea();
		txtrFullName_1_3_1.setText("Librarian Address :");
		txtrFullName_1_3_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1_3_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_3_1.setBackground(Color.WHITE);
		txtrFullName_1_3_1.setBounds(723, 329, 198, 30);
		contentPane.add(txtrFullName_1_3_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(177, 216, 216));
		textField_4.setBounds(940, 289, 216, 30);
		contentPane.add(textField_4);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianDashboard librarianDashboard = new LibrarianDashboard(userId);
				librarianDashboard.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Arial", Font.BOLD, 15));
		btnBack.setBackground(new Color(41, 82, 82));
		btnBack.setBounds(1075, 539, 99, 30);
		contentPane.add(btnBack);
		
		txtrUsername_2 = new JTextArea();
		txtrUsername_2.setEditable(false);
		txtrUsername_2.setText("*****");
		txtrUsername_2.setForeground(new Color(0, 128, 128));
		txtrUsername_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2.setBackground(new Color(255, 255, 255));
		txtrUsername_2.setBounds(304, 126, 321, 30);
		contentPane.add(txtrUsername_2);
		
		txtrUsername_2_1 = new JTextArea();
		txtrUsername_2_1.setEditable(false);
		txtrUsername_2_1.setText("*****");
		txtrUsername_2_1.setForeground(new Color(0, 128, 128));
		txtrUsername_2_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2_1.setBackground(new Color(255, 255, 255));
		txtrUsername_2_1.setBounds(304, 166, 321, 30);
		contentPane.add(txtrUsername_2_1);
		
		txtrUsername_2_2 = new JTextArea();
		txtrUsername_2_2.setEditable(false);
		txtrUsername_2_2.setText("*****");
		txtrUsername_2_2.setForeground(new Color(0, 128, 128));
		txtrUsername_2_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2_2.setBackground(new Color(255, 255, 255));
		txtrUsername_2_2.setBounds(304, 206, 321, 30);
		contentPane.add(txtrUsername_2_2);
		
		txtrUsername_2_3 = new JTextArea();
		txtrUsername_2_3.setEditable(false);
		txtrUsername_2_3.setText("*****");
		txtrUsername_2_3.setForeground(new Color(0, 128, 128));
		txtrUsername_2_3.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2_3.setBackground(new Color(255, 255, 255));
		txtrUsername_2_3.setBounds(304, 246, 321, 30);
		contentPane.add(txtrUsername_2_3);
		
		txtrUsername_2_4 = new JTextArea();
		txtrUsername_2_4.setEditable(false);
		txtrUsername_2_4.setText("*****");
		txtrUsername_2_4.setForeground(new Color(0, 128, 128));
		txtrUsername_2_4.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2_4.setBackground(new Color(255, 255, 255));
		txtrUsername_2_4.setBounds(304, 286, 321, 30);
		contentPane.add(txtrUsername_2_4);
		
		txtrUsername_2_5_2 = new JTextArea();
		txtrUsername_2_5_2.setEditable(false);
		txtrUsername_2_5_2.setText("*****");
		txtrUsername_2_5_2.setForeground(new Color(0, 128, 128));
		txtrUsername_2_5_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_2_5_2.setBackground(new Color(255, 255, 255));
		txtrUsername_2_5_2.setBounds(304, 327, 321, 66);
		contentPane.add(txtrUsername_2_5_2);
		
		comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"", "Male", "Female"}));
		comboBox.setBounds(940, 168, 216, 27);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("");
        Image img = new ImageIcon(this.getClass().getResource("/white.png")).getImage();
        lblNewLabel.setIcon(new ImageIcon(img));
        lblNewLabel.setBounds(67, 112, 1229, 398);
        contentPane.add(lblNewLabel);
        
        fetchInfo(userId);
	}
	
	private void fetchInfo(String id) {
		DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection
        Connection con = dbConnect.con; // Access the connection from DbConnect
        String query = "SELECT * FROM librarian WHERE userID = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
            	txtrUsername_2.setText(rs.getString("Fullname"));
            	txtrUsername_2_1.setText(rs.getString("Gender"));
            	txtrUsername_2_2.setText(rs.getString("Email"));
            	txtrUsername_2_3.setText(rs.getString("ContactNumber"));
            	txtrUsername_2_4.setText(rs.getString("EmergencyNumber"));
            	txtrUsername_2_5_2.setText(rs.getString("LibrarianAddress"));
            } else {
                System.out.println("User Info not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	private void saveInfo(String id, String Fullname, String Gender, String Email, String ContactNumber, String EmergencyNumber, String LibrarianAddress) {
		DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection
        Connection con = dbConnect.con; // Access the connection from DbConnect
        String query = "SELECT * FROM librarian WHERE userID = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
            	updateInfo(id, Fullname, Gender, Email, ContactNumber, EmergencyNumber, LibrarianAddress);
            } else {
            	String qry = "INSERT INTO librarian (Fullname, Gender, Email, ContactNumber, EmergencyNumber, LibrarianAddress, userID) VALUES ( ?, ?, ?, ?, ?, ?, ?)";
            	try (PreparedStatement pst = con.prepareStatement(qry)) {
            	    pst.setString(1, Fullname);
            	    pst.setString(2, Gender);
            	    pst.setString(3, Email);
            	    pst.setString(4, ContactNumber);
            	    pst.setString(5, EmergencyNumber);
            	    pst.setString(6, LibrarianAddress);
            	    pst.setString(7, id);
            	    pst.executeUpdate();
            	    
            	    System.out.println("Info Saved");
                    javax.swing.JOptionPane.showMessageDialog(contentPane, "Info Saved");
                    L_LibrarianInfo frame = new L_LibrarianInfo(userId);
        			frame.setVisible(true);
        			dispose();
            	    
            	} catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	private void updateInfo(String id, String Fullname, String Gender, String Email, String ContactNumber, String EmergencyNumber, String LibrarianAddress) {
		DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection
        Connection con = dbConnect.con; // Access the connection from DbConnect
        String query = "UPDATE librarian SET Fullname = ?, Gender = ?, Email = ?, ContactNumber = ?, EmergencyNumber = ?, LibrarianAddress = ? WHERE userID = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
        	stmt.setString(1, Fullname);
        	stmt.setString(2, Gender);
        	stmt.setString(3, Email);
        	stmt.setString(4, ContactNumber);
        	stmt.setString(5, EmergencyNumber);
            stmt.setString(6, LibrarianAddress);
            stmt.setString(7, id);
            stmt.executeUpdate();
            
            System.out.println("Info Updated");
            javax.swing.JOptionPane.showMessageDialog(contentPane, "Info Updated");
            L_LibrarianInfo frame = new L_LibrarianInfo(userId);
			frame.setVisible(true);
			dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
