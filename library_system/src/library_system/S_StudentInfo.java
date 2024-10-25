package library_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;


public class S_StudentInfo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField FullName;
    private JComboBox<String> Gender;
    private JTextField Email;
    private JTextField ContactNumber;
    private JTextField EmergencyContact;
    private JTextField Program;
    private JComboBox<String> YearLevel;
    private JTextField StudentAddress;
    private JTextField USERME;
    private JTextArea sfullname;
    private JTextArea sgender;
    private JTextArea semail;
    private JTextArea scontactnumber;
    private JTextArea semergencynumber;
    private JTextArea sprogram;
    private JTextArea syearlevel;
    private JTextArea saddress;
    private DbConnect dbConnect;
    private String userId;
    


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DbConnect dbConnect = new DbConnect();
                    dbConnect.connect();  
                    String userId = "sampleUserId";  
                    S_StudentInfo frame = new S_StudentInfo(userId, dbConnect);  
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }



	public S_StudentInfo(String userId, DbConnect dbConnect) {
		this.userId = userId;
        this.dbConnect = dbConnect; 
        
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1310, 648);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JTextArea txtrStudentInformation = new JTextArea();
		txtrStudentInformation.setBounds(51, 28, 631, 40);
		txtrStudentInformation.setText("STUDENT PERSONAL INFORMATION");
		txtrStudentInformation.setForeground(new Color(255, 255, 255));
		txtrStudentInformation.setFont(new Font("Arial", Font.BOLD, 30));
		txtrStudentInformation.setBackground(new Color(0, 128, 128));
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	String fullname = FullName.getText();
		    	String gender = (String) Gender.getSelectedItem();
                String email = Email.getText();
                String contact = ContactNumber.getText();
                String emergencyContact = EmergencyContact.getText();
                String program = Program.getText();
                String yearlevel = (String) YearLevel.getSelectedItem();
                String address = StudentAddress.getText();
                String user_id = USERME.getText();
                
                System.out.println("Inserting students: " + fullname + ", " + gender + ", " + email + ", " + contact + ", " + emergencyContact + ", " + program + ", " + yearlevel + ", " + address+ ", " + user_id);
                insertData(fullname, gender, email, contact,emergencyContact,program,yearlevel,address,user_id);
                
               
		    }
		});
		btnSubmit.setBounds(1135, 456, 99, 30);
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 15));
		btnSubmit.setBackground(new Color(41, 82, 82));
		
		FullName = new JTextField(20);
		FullName.setBounds(1018, 137, 216, 30);
		FullName.setFont(new Font("Arial", Font.PLAIN, 16));
		FullName.setColumns(10);
		FullName.setBackground(new Color(177, 216, 216));
		
		Email = new JTextField(20);
		Email.setBounds(1018, 221, 216, 30);
		Email.setFont(new Font("Arial", Font.PLAIN, 16));
		Email.setColumns(10);
		Email.setBackground(new Color(177, 216, 216));
		
		ContactNumber = new JTextField(20);
		ContactNumber.setBounds(1018, 261, 216, 30);
		ContactNumber.setFont(new Font("Arial", Font.PLAIN, 16));
		ContactNumber.setColumns(10);
		ContactNumber.setBackground(new Color(177, 216, 216));
		contentPane.setLayout(null);
		contentPane.add(FullName);
		contentPane.add(Email);
		contentPane.add(ContactNumber);
		contentPane.add(txtrStudentInformation);
		contentPane.add(btnSubmit);
		
		JTextArea txtrUsername_1 = new JTextArea();
		txtrUsername_1.setBounds(871, 136, 111, 30);
		txtrUsername_1.setText("Full Name :");
		txtrUsername_1.setForeground(new Color(0, 128, 128));
		txtrUsername_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrUsername_1);
		
		JTextArea txtrPassword_1 = new JTextArea();
		txtrPassword_1.setBounds(895, 180, 107, 30);
		txtrPassword_1.setText("Gender :");
		txtrPassword_1.setForeground(new Color(0, 128, 128));
		txtrPassword_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrPassword_1);
		
		JTextArea txtrEmail_1 = new JTextArea();
		txtrEmail_1.setBounds(915, 220, 65, 30);
		txtrEmail_1.setText("Email :");
		txtrEmail_1.setForeground(new Color(0, 128, 128));
		txtrEmail_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmail_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrEmail_1);
		
		JTextArea txtrFullName_1 = new JTextArea();
		txtrFullName_1.setBounds(815, 260, 188, 30);
		txtrFullName_1.setText("Contact Number :");
		txtrFullName_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrFullName_1);
		
		JTextArea txtrEmergencyContact_1 = new JTextArea();
		txtrEmergencyContact_1.setBounds(784, 300, 202, 30);
		txtrEmergencyContact_1.setText("Emergency Contact :");
		txtrEmergencyContact_1.setForeground(new Color(0, 128, 128));
		txtrEmergencyContact_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmergencyContact_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrEmergencyContact_1);
		
		JTextArea txtrFullName_1_1_1 = new JTextArea();
		txtrFullName_1_1_1.setBounds(884, 340, 99, 30);
		txtrFullName_1_1_1.setText("Program :");
		txtrFullName_1_1_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_1_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrFullName_1_1_1);
		
		JTextArea txtrFullName_1_2_1 = new JTextArea();
		txtrFullName_1_2_1.setBounds(864, 376, 118, 30);
		txtrFullName_1_2_1.setText("Year Level :");
		txtrFullName_1_2_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1_2_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_2_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrFullName_1_2_1);
		
		JTextArea txtrFullName_1_3_1 = new JTextArea();
		txtrFullName_1_3_1.setBounds(807, 416, 175, 30);
		txtrFullName_1_3_1.setText("Student Address :");
		txtrFullName_1_3_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1_3_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_3_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrFullName_1_3_1);
		
		EmergencyContact = new JTextField(20);
		EmergencyContact.setFont(new Font("Arial", Font.PLAIN, 16));
		EmergencyContact.setColumns(10);
		EmergencyContact.setBackground(new Color(177, 216, 216));
		EmergencyContact.setBounds(1018, 301, 216, 30);
		contentPane.add(EmergencyContact);
		
		Program = new JTextField(20);
		Program.setFont(new Font("Arial", Font.PLAIN, 16));
		Program.setColumns(10);
		Program.setBackground(new Color(177, 216, 216));
		Program.setBounds(1018, 340, 216, 30);
		contentPane.add(Program);
		
		StudentAddress = new JTextField(20);
		StudentAddress.setFont(new Font("Arial", Font.PLAIN, 16));
		StudentAddress.setColumns(10);
		StudentAddress.setBackground(new Color(177, 216, 216));
		StudentAddress.setBounds(1018, 416, 216, 30);
		contentPane.add(StudentAddress);
		
		JButton btnBack = new JButton("Back");
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
		btnBack.setBounds(1158, 551, 99, 30);
		contentPane.add(btnBack);
		
		Gender = new JComboBox<>(new String[]{"Male", "Female"});
		Gender.setFont(new Font("Arial", Font.PLAIN, 16));
		Gender.setBackground(Color.WHITE);
		Gender.setBounds(1018, 181, 216, 28);
		contentPane.add(Gender);
		
		
		YearLevel = new JComboBox<>(new String[]{"1", "2", "3", "4"});
		YearLevel.setFont(new Font("Arial", Font.PLAIN, 16));
		YearLevel.setBackground(Color.WHITE);
		YearLevel.setBounds(1018, 383, 216, 28);
		contentPane.add(YearLevel);
		Image img = new ImageIcon(this.getClass().getResource("/white.png")).getImage();
		Image imgs = new ImageIcon(this.getClass().getResource("/white.png")).getImage();
		
		USERME = new JTextField(10);
		USERME.setFont(new Font("Arial", Font.PLAIN, 16));
		USERME.setBackground(new Color(177, 216, 216));
		USERME.setBounds(1018, 97, 216, 30);
		contentPane.add(USERME);
		
		JTextArea use = new JTextArea();
		use.setText("User ID :");
		use.setForeground(new Color(0, 128, 128));
		use.setFont(new Font("Arial", Font.BOLD, 20));
		use.setBackground(Color.WHITE);
		use.setBounds(871, 96, 111, 30);
		contentPane.add(use);
		
		displayUserInfo(userId);
		displayme(userId);
	}
	
	 public void insertData(String FullName, String Gender, String Email, String ContactNumber, String EmergencyNumber, String Program, String YearLevel, String StudentAddress, String user_id) {
		 Connection con = dbConnect.con; 
		 String query = "INSERT INTO students ( `FullName`, `Gender`, `Email`, `ContactNumber`, `EmergencyNumber`, `Program`, `YearLevel`, `StudentAddress`, `user_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	        try (PreparedStatement pst = con.prepareStatement(query)) {
	            pst.setString(1, FullName);
	            pst.setString(2, Gender);
	            pst.setString(3, Email);
	            pst.setString(4, ContactNumber);
	            pst.setString(5, EmergencyNumber);
	            pst.setString(6, Program);
	            pst.setString(7, YearLevel);
	            pst.setString(8, StudentAddress);
	            pst.setString(9, user_id);
	            pst.executeUpdate();
	            System.out.println("Student Info Inserted");
	            javax.swing.JOptionPane.showMessageDialog(contentPane, "Student Info Inserted");
	        } catch (SQLException e) {
	            e.printStackTrace();
	            javax.swing.JOptionPane.showMessageDialog(contentPane, "Error inserting student info. Please check your input and try again.");
	        }
	    }
	 

	 
	 private void displayUserInfo(String userId) {
	        Connection con = dbConnect.con; 
	        String query = "SELECT user_id, fullname, email FROM register WHERE user_id = ?";
	        try (PreparedStatement stmt = con.prepareStatement(query)) {
	            stmt.setString(1, userId);
	            ResultSet rs = stmt.executeQuery();
	            if (rs.next()) {
	                String fetchedUsername = rs.getString("fullname");
	                String fetchedPassword = rs.getString("email");
	                String fetchedUser = rs.getString("user_id");


	                FullName.setText(fetchedUsername); 
	                Email.setText(fetchedPassword); 
	                USERME.setText(fetchedUser); 
	            } else {
	                System.out.println("User not found");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	 
	 private void displayme(String userId) {
	        Connection con = dbConnect.con; 
	        String query = "SELECT * FROM students WHERE user_id = ?";
	        try (PreparedStatement stmt = con.prepareStatement(query)) {
	            stmt.setString(1, userId);
	            ResultSet rs = stmt.executeQuery();
	            if (rs.next()) {
	                String fetchedUsername = rs.getString("ContactNumber");
	                String fetchedPassword = rs.getString("EmergencyNumber");
	                String fetchedPorogram= rs.getString("Program");
	                String fetchedUStudentAddress= rs.getString("StudentAddress");



	                ContactNumber.setText(fetchedUsername); 
	                EmergencyContact.setText(fetchedPassword); 
	                Program.setText(fetchedPorogram); 
	                StudentAddress.setText(fetchedUStudentAddress); 
	                
	                
	            } else {
	                System.out.println("User not found");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}
