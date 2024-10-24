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
//    private JTextArea sfullname;
//    private JTextArea sgender;
//    private JTextArea semail;
//    private JTextArea scontactnumber;
//    private JTextArea semergencynumber;
//    private JTextArea sprogram;
//    private JTextArea syearlevel;
//    private JTextArea saddress;
    private DbConnect dbConnect;
    private String userId;
    DbConnect db; 


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Create a DbConnect instance and provide a sample userId
                    DbConnect dbConnect = new DbConnect();
                    dbConnect.connect();  // Ensure the connection is established

                    String userId = "sampleUserId";  // Replace with a valid userId for testing

                    S_StudentInfo frame = new S_StudentInfo(userId, dbConnect);  // Pass the required parameters
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
                
                System.out.println("Inserting students: " + fullname + ", " + gender + ", " + email + ", " + contact + ", " + emergencyContact + ", " + program + ", " + yearlevel + ", " + address);
                insertData(fullname, gender, email, contact,emergencyContact,program,yearlevel,address);
                
                FullName.setText("");
                Gender.setSelectedIndex(0);
                Email.setText("");
                ContactNumber.setText("");
                EmergencyContact.setText("");
                Program.setText("");
                YearLevel.setSelectedIndex(0); 
                StudentAddress.setText("");
		    }
		});
		
			

		btnSubmit.setBounds(1135, 456, 99, 30);
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 15));
		btnSubmit.setBackground(new Color(41, 82, 82));
		
		JTextArea txtrUsername = new JTextArea();
		txtrUsername.setBounds(73, 122, 111, 30);
		txtrUsername.setText("Full Name :");
		txtrUsername.setForeground(new Color(0, 128, 128));
		txtrUsername.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername.setBackground(new Color(255, 255, 255));
		
		FullName = new JTextField(20);
		FullName.setBounds(1018, 119, 216, 30);
		FullName.setFont(new Font("Arial", Font.PLAIN, 16));
		FullName.setColumns(10);
		FullName.setBackground(new Color(177, 216, 216));
		
		JTextArea txtrPassword = new JTextArea();
		txtrPassword.setBounds(73, 162, 107, 30);
		txtrPassword.setText("Gender :");
		txtrPassword.setForeground(new Color(0, 128, 128));
		txtrPassword.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword.setBackground(new Color(255, 255, 255));
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setBounds(73, 202, 65, 30);
		txtrEmail.setText("Email :");
		txtrEmail.setForeground(new Color(0, 128, 128));
		txtrEmail.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmail.setBackground(new Color(255, 255, 255));
		
		Email = new JTextField(20);
		Email.setBounds(1018, 203, 216, 30);
		Email.setFont(new Font("Arial", Font.PLAIN, 16));
		Email.setColumns(10);
		Email.setBackground(new Color(177, 216, 216));
		
		JTextArea txtrFullName = new JTextArea();
		txtrFullName.setBounds(73, 242, 188, 30);
		txtrFullName.setText("Contact Number :");
		txtrFullName.setForeground(new Color(0, 128, 128));
		txtrFullName.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName.setBackground(new Color(255, 255, 255));
		
		ContactNumber = new JTextField(20);
		ContactNumber.setBounds(1018, 243, 216, 30);
		ContactNumber.setFont(new Font("Arial", Font.PLAIN, 16));
		ContactNumber.setColumns(10);
		ContactNumber.setBackground(new Color(177, 216, 216));
		
		JTextArea txtrEmergencyContact = new JTextArea();
		txtrEmergencyContact.setBounds(73, 282, 202, 30);
		txtrEmergencyContact.setText("Emergency Contact :");
		txtrEmergencyContact.setForeground(new Color(0, 128, 128));
		txtrEmergencyContact.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmergencyContact.setBackground(new Color(255, 255, 255));
		
		JTextArea txtrFullName_1_1 = new JTextArea();
		txtrFullName_1_1.setBounds(73, 322, 111, 30);
		txtrFullName_1_1.setText("Program :");
		txtrFullName_1_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_1.setBackground(new Color(255, 255, 255));
		
		JTextArea txtrFullName_1_2 = new JTextArea();
		txtrFullName_1_2.setBounds(73, 358, 118, 30);
		txtrFullName_1_2.setText("Year Level :");
		txtrFullName_1_2.setForeground(new Color(0, 128, 128));
		txtrFullName_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_2.setBackground(new Color(255, 255, 255));
		
		JTextArea txtrFullName_1_3 = new JTextArea();
		txtrFullName_1_3.setBounds(73, 398, 175, 30);
		txtrFullName_1_3.setText("Student Address :");
		txtrFullName_1_3.setForeground(new Color(0, 128, 128));
		txtrFullName_1_3.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_3.setBackground(new Color(255, 255, 255));
		contentPane.setLayout(null);
		contentPane.add(txtrPassword);
		contentPane.add(txtrUsername);
		contentPane.add(txtrEmail);
		contentPane.add(txtrFullName);
		contentPane.add(FullName);
		contentPane.add(Email);
		contentPane.add(ContactNumber);
		contentPane.add(txtrFullName_1_1);
		contentPane.add(txtrFullName_1_2);
		contentPane.add(txtrFullName_1_3);
		contentPane.add(txtrEmergencyContact);
		contentPane.add(txtrStudentInformation);
		contentPane.add(btnSubmit);
		
		JTextArea txtrUsername_1 = new JTextArea();
		txtrUsername_1.setBounds(871, 118, 111, 30);
		txtrUsername_1.setText("Full Name :");
		txtrUsername_1.setForeground(new Color(0, 128, 128));
		txtrUsername_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrUsername_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrUsername_1);
		
		JTextArea txtrPassword_1 = new JTextArea();
		txtrPassword_1.setBounds(895, 162, 107, 30);
		txtrPassword_1.setText("Gender :");
		txtrPassword_1.setForeground(new Color(0, 128, 128));
		txtrPassword_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrPassword_1);
		
		JTextArea txtrEmail_1 = new JTextArea();
		txtrEmail_1.setBounds(915, 202, 65, 30);
		txtrEmail_1.setText("Email :");
		txtrEmail_1.setForeground(new Color(0, 128, 128));
		txtrEmail_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmail_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrEmail_1);
		
		JTextArea txtrFullName_1 = new JTextArea();
		txtrFullName_1.setBounds(815, 242, 188, 30);
		txtrFullName_1.setText("Contact Number :");
		txtrFullName_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrFullName_1);
		
		JTextArea txtrEmergencyContact_1 = new JTextArea();
		txtrEmergencyContact_1.setBounds(784, 282, 202, 30);
		txtrEmergencyContact_1.setText("Emergency Contact :");
		txtrEmergencyContact_1.setForeground(new Color(0, 128, 128));
		txtrEmergencyContact_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrEmergencyContact_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrEmergencyContact_1);
		
		JTextArea txtrFullName_1_1_1 = new JTextArea();
		txtrFullName_1_1_1.setBounds(884, 322, 99, 30);
		txtrFullName_1_1_1.setText("Program :");
		txtrFullName_1_1_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_1_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrFullName_1_1_1);
		
		JTextArea txtrFullName_1_2_1 = new JTextArea();
		txtrFullName_1_2_1.setBounds(864, 358, 118, 30);
		txtrFullName_1_2_1.setText("Year Level :");
		txtrFullName_1_2_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1_2_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_2_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrFullName_1_2_1);
		
		JTextArea txtrFullName_1_3_1 = new JTextArea();
		txtrFullName_1_3_1.setBounds(807, 398, 175, 30);
		txtrFullName_1_3_1.setText("Student Address :");
		txtrFullName_1_3_1.setForeground(new Color(0, 128, 128));
		txtrFullName_1_3_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrFullName_1_3_1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtrFullName_1_3_1);
		
		EmergencyContact = new JTextField(20);
		EmergencyContact.setFont(new Font("Arial", Font.PLAIN, 16));
		EmergencyContact.setColumns(10);
		EmergencyContact.setBackground(new Color(177, 216, 216));
		EmergencyContact.setBounds(1018, 283, 216, 30);
		contentPane.add(EmergencyContact);
		
		Program = new JTextField(20);
		Program.setFont(new Font("Arial", Font.PLAIN, 16));
		Program.setColumns(10);
		Program.setBackground(new Color(177, 216, 216));
		Program.setBounds(1018, 322, 216, 30);
		contentPane.add(Program);
		
		StudentAddress = new JTextField(20);
		StudentAddress.setFont(new Font("Arial", Font.PLAIN, 16));
		StudentAddress.setColumns(10);
		StudentAddress.setBackground(new Color(177, 216, 216));
		StudentAddress.setBounds(1018, 398, 216, 30);
		contentPane.add(StudentAddress);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Arial", Font.BOLD, 15));
		btnEdit.setBackground(new Color(41, 82, 82));
		btnEdit.setBounds(1026, 456, 99, 30);
		contentPane.add(btnEdit);
		
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
		
		JTextArea sfullname = new JTextArea();
		sfullname.setText("*****");
		sfullname.setForeground(new Color(0, 128, 128));
		sfullname.setFont(new Font("Arial", Font.BOLD, 20));
		sfullname.setBackground(new Color(255, 255, 255));
		sfullname.setBounds(206, 122, 465, 30);
		contentPane.add(sfullname);
		
		JTextArea sgender = new JTextArea();
		sgender.setText("*****");
		sgender.setForeground(new Color(0, 128, 128));
		sgender.setFont(new Font("Arial", Font.BOLD, 20));
		sgender.setBackground(new Color(255, 255, 255));
		sgender.setBounds(181, 162, 490, 30);
		contentPane.add(sgender);
		
		JTextArea semail = new JTextArea();
		semail.setText("*****");
		semail.setForeground(new Color(0, 128, 128));
		semail.setFont(new Font("Arial", Font.BOLD, 20));
		semail.setBackground(new Color(255, 255, 255));
		semail.setBounds(161, 202, 510, 30);
		contentPane.add(semail);
		
		JTextArea scontactnumber = new JTextArea();
		scontactnumber.setText("*****");
		scontactnumber.setForeground(new Color(0, 128, 128));
		scontactnumber.setFont(new Font("Arial", Font.BOLD, 20));
		scontactnumber.setBackground(new Color(255, 255, 255));
		scontactnumber.setBounds(263, 242, 408, 30);
		contentPane.add(scontactnumber);
		
		JTextArea semergencycontact = new JTextArea();
		semergencycontact.setText("*****");
		semergencycontact.setForeground(new Color(0, 128, 128));
		semergencycontact.setFont(new Font("Arial", Font.BOLD, 20));
		semergencycontact.setBackground(new Color(255, 255, 255));
		semergencycontact.setBounds(297, 282, 374, 30);
		contentPane.add(semergencycontact);
		
		JTextArea sprogram = new JTextArea();
		sprogram.setText("*****");
		sprogram.setForeground(new Color(0, 128, 128));
		sprogram.setFont(new Font("Arial", Font.BOLD, 20));
		sprogram.setBackground(new Color(255, 255, 255));
		sprogram.setBounds(194, 322, 477, 30);
		contentPane.add(sprogram);
		
		JTextArea syearlevel = new JTextArea();
		syearlevel.setText("*****");
		syearlevel.setForeground(new Color(0, 128, 128));
		syearlevel.setFont(new Font("Arial", Font.BOLD, 20));
		syearlevel.setBackground(new Color(255, 255, 255));
		syearlevel.setBounds(206, 358, 465, 30);
		contentPane.add(syearlevel);
		
		JTextArea saddress = new JTextArea();
		saddress.setText("*****");
		saddress.setForeground(new Color(0, 128, 128));
		saddress.setFont(new Font("Arial", Font.BOLD, 20));
		saddress.setBackground(new Color(255, 255, 255));
		saddress.setBounds(263, 398, 408, 30);
		contentPane.add(saddress);
		
		Gender = new JComboBox<>(new String[]{"Male", "Female"});
		Gender.setFont(new Font("Arial", Font.PLAIN, 16));
		Gender.setBackground(Color.WHITE);
		Gender.setBounds(1018, 163, 216, 28);
		contentPane.add(Gender);
		
		
		YearLevel = new JComboBox<>(new String[]{"1", "2", "3", "4"});
		YearLevel.setFont(new Font("Arial", Font.PLAIN, 16));
		YearLevel.setBackground(Color.WHITE);
		YearLevel.setBounds(1018, 365, 216, 28);
		contentPane.add(YearLevel);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/white.png")).getImage();
        lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(763, 99, 496, 410);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image imgs = new ImageIcon(this.getClass().getResource("/white.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(imgs));
		lblNewLabel_1.setBounds(51, 99, 667, 410);
		contentPane.add(lblNewLabel_1);
		
		displayUserInfo(userId);
//		studentshow(userId);
	}
	
	 public void insertData(String FullName, String Gender, String Email, String ContactNumber, String EmergencyNumber, String Program, String YearLevel, String StudentAddress) {
		 Connection con = dbConnect.con; 
		 String query = "INSERT INTO students ( `FullName`, `Gender`, `Email`, `ContactNumber`, `EmergencyNumber`, `Program`, `YearLevel`, `StudentAddress`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	        try (PreparedStatement pst = con.prepareStatement(query)) {
	            pst.setString(1, FullName);
	            pst.setString(2, Gender);
	            pst.setString(3, Email);
	            pst.setString(4, ContactNumber);
	            pst.setString(5, EmergencyNumber);
	            pst.setString(6, Program);
	            pst.setString(7, YearLevel);
	            pst.setString(8, StudentAddress);
	            pst.executeUpdate();
	            System.out.println("Student Info Inserted");
	        } catch (SQLException e) {
	            e.printStackTrace();
	            javax.swing.JOptionPane.showMessageDialog(contentPane, "Error inserting student info. Please check your input and try again.");
	        }
	    }
	 

	 
	 private void displayUserInfo(String userId) {
	        Connection con = dbConnect.con; 
	        String query = "SELECT fullname, email FROM register WHERE user_id = ?";
	        try (PreparedStatement stmt = con.prepareStatement(query)) {
	            stmt.setString(1, userId);
	            ResultSet rs = stmt.executeQuery();
	            if (rs.next()) {
	                String fetchedUsername = rs.getString("fullname");
	                String fetchedPassword = rs.getString("email");

	                FullName.setText(fetchedUsername); 
	                Email.setText(fetchedPassword); 
	            } else {
	                System.out.println("User not found");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	 
//	 private void studentshow(String userId) {
//	        Connection con = dbConnect.con; 
//	        String query = "SELECT * FROM students WHERE StudentID = ?";
//	        try (PreparedStatement stmt = con.prepareStatement(query)) {
//	            stmt.setString(1, userId);
//	            ResultSet rs = stmt.executeQuery();
//	            if (rs.next()) {
//	                String fetchedFullName = rs.getString("FullName");
//	                String fetchedGender = rs.getString("Gender");
//	                String fetchedEmail = rs.getString("Email");
//	                String fetchedContactNumber = rs.getString("ContactNumber");
//	                String fetchedEmergencyNumber = rs.getString("EmergencyNumber");
//	                String fetchedProgram = rs.getString("Program");
//	                String fetchedYearLevel = rs.getString("YearLevel");
//	                String fetchedStudentAddress= rs.getString("StudentAddress");
//
//	                sfullname.setText(fetchedFullName); 
//	                sgender.setText(fetchedGender); 
//	                semail.setText(fetchedEmail); 
//	                scontactnumber.setText(fetchedContactNumber); 
//	                semergencynumber.setText(fetchedEmergencyNumber); 
//	                sprogram.setText(fetchedProgram); 
//	                syearlevel.setText(fetchedYearLevel); 
//	                saddress.setText(fetchedStudentAddress);  
//	            } else {
//	                System.out.println("User not found");
//	            }
//	        } catch (SQLException e) {
//	            e.printStackTrace();
//	        }
//	    } 
}
