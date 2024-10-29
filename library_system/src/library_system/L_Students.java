package library_system;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class L_Students extends JFrame {

	private static final long serialVersionUID = 1L;
	private static String userId;
	private DefaultTableModel model;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTable table;
	private JComboBox<String> comboBox;
	private JComboBox<Integer> comboBox_1;
	private JComboBox<Integer> comboBox_2;
	private int studid;
	private ArrayList<Integer> user = new ArrayList<Integer>();

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					L_Students frame = new L_Students(userId);
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
	public L_Students(String userID) {
		userId = userID;
		supply_comboBox();
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1310, 648);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrManageStudent = new JTextArea();
		txtrManageStudent.setText("MANAGE STUDENT INFORMATION");
		txtrManageStudent.setForeground(Color.WHITE);
		txtrManageStudent.setFont(new Font("Arial", Font.BOLD, 30));
		txtrManageStudent.setBackground(new Color(0, 128, 128));
		txtrManageStudent.setBounds(34, 25, 522, 40);
		contentPane.add(txtrManageStudent);
		
		JTextArea txtrStudentInformation = new JTextArea();
		txtrStudentInformation.setText("Student Information");
		txtrStudentInformation.setForeground(Color.WHITE);
		txtrStudentInformation.setFont(new Font("Arial", Font.BOLD, 30));
		txtrStudentInformation.setBackground(new Color(0, 128, 128));
		txtrStudentInformation.setBounds(24, 105, 307, 40);
		contentPane.add(txtrStudentInformation);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Arial", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBackground(new Color(177, 216, 216));
		textField.setBounds(1017, 154, 240, 30);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(177, 216, 216));
		textField_1.setBounds(1017, 191, 240, 30);
		contentPane.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(177, 216, 216));
		textField_3.setBounds(1017, 271, 240, 30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(177, 216, 216));
		textField_4.setBounds(1017, 309, 240, 30);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(177, 216, 216));
		textField_5.setBounds(1017, 348, 240, 30);
		contentPane.add(textField_5);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(177, 216, 216));
		textField_7.setBounds(1017, 384, 240, 30);
		contentPane.add(textField_7);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String FullName = textField_1.getText();
        		String Gender = comboBox.getSelectedItem().toString();
        		String Email = textField_3.getText();
        		String ContactNumber = textField_4.getText();
        		String EmergencyNumber = textField_5.getText();
        		String Program = textField_7.getText();
        		int YearLevel = Integer.parseInt(comboBox_1.getSelectedItem().toString());
        		String StudentAddress = textField_9.getText();
        		int user_id = Integer.parseInt(comboBox_2.getSelectedItem().toString());

        		insertData(FullName, Gender, Email, ContactNumber, EmergencyNumber, Program, YearLevel, StudentAddress, user_id);
		    }
		});
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Arial", Font.BOLD, 15));
		btnAdd.setBackground(new Color(41, 82, 82));
		btnAdd.setBounds(899, 556, 114, 30);
		contentPane.add(btnAdd);
		
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
		btnBack.setBounds(1158, 556, 99, 30);
		contentPane.add(btnBack);
		
		JTextArea txtrPassword_1_1 = new JTextArea();
		txtrPassword_1_1.setText("Student ID");
		txtrPassword_1_1.setForeground(Color.WHITE);
		txtrPassword_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1.setBounds(783, 154, 130, 30);
		contentPane.add(txtrPassword_1_1);
		
		JTextArea txtrPassword_1_1_1 = new JTextArea();
		txtrPassword_1_1_1.setText("Full Name");
		txtrPassword_1_1_1.setForeground(Color.WHITE);
		txtrPassword_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_1.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_1.setBounds(783, 187, 130, 30);
		contentPane.add(txtrPassword_1_1_1);
		
		JTextArea txtrPassword_1_1_2 = new JTextArea();
		txtrPassword_1_1_2.setText("Gender");
		txtrPassword_1_1_2.setForeground(Color.WHITE);
		txtrPassword_1_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_2.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_2.setBounds(783, 227, 130, 30);
		contentPane.add(txtrPassword_1_1_2);
		
		JTextArea txtrPassword_1_1_3 = new JTextArea();
		txtrPassword_1_1_3.setText("Email");
		txtrPassword_1_1_3.setForeground(Color.WHITE);
		txtrPassword_1_1_3.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_3.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_3.setBounds(783, 267, 130, 30);
		contentPane.add(txtrPassword_1_1_3);
		
		JTextArea txtrPassword_1_1_4 = new JTextArea();
		txtrPassword_1_1_4.setText("Contact Number");
		txtrPassword_1_1_4.setForeground(Color.WHITE);
		txtrPassword_1_1_4.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_4.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_4.setBounds(783, 305, 177, 30);
		contentPane.add(txtrPassword_1_1_4);
		
		JTextArea txtrPassword_1_1_5 = new JTextArea();
		txtrPassword_1_1_5.setText("Emergency Contact");
		txtrPassword_1_1_5.setForeground(Color.WHITE);
		txtrPassword_1_1_5.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_5.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_5.setBounds(783, 344, 200, 30);
		contentPane.add(txtrPassword_1_1_5);
		
		JTextArea txtrPassword_1_1_6 = new JTextArea();
		txtrPassword_1_1_6.setText("Program");
		txtrPassword_1_1_6.setForeground(Color.WHITE);
		txtrPassword_1_1_6.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_6.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_6.setBounds(783, 384, 130, 30);
		contentPane.add(txtrPassword_1_1_6);
		
		JTextArea txtrPassword_1_1_7 = new JTextArea();
		txtrPassword_1_1_7.setText("Year Level");
		txtrPassword_1_1_7.setForeground(Color.WHITE);
		txtrPassword_1_1_7.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_7.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_7.setBounds(783, 424, 130, 30);
		contentPane.add(txtrPassword_1_1_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_8.setColumns(10);
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(366, 115, 242, 30);
		contentPane.add(textField_8);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField_8.getText();
				Search(name);
			}
		});
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFont(new Font("Arial", Font.BOLD, 15));
		btnSearch.setBackground(new Color(41, 82, 82));
		btnSearch.setBounds(613, 115, 99, 30);
		contentPane.add(btnSearch);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 155, 681, 413);
		contentPane.add(scrollPane);
		
		table = new JTable();
		model = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Student ID", "Full Name", "Gender", "Email", "Contact Number", "Emergency Contact", "Program", "Year Level", "Student Address", "User ID"
			}
		);
		table.setModel(model);
        scrollPane.setViewportView(table);
		
		JTextArea txtrPassword_1_1_7_1 = new JTextArea();
		txtrPassword_1_1_7_1.setText("Student Address");
		txtrPassword_1_1_7_1.setForeground(Color.WHITE);
		txtrPassword_1_1_7_1.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_7_1.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_7_1.setBounds(783, 459, 200, 30);
		contentPane.add(txtrPassword_1_1_7_1);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_9.setColumns(10);
		textField_9.setBackground(new Color(177, 216, 216));
		textField_9.setBounds(1017, 460, 240, 30);
		contentPane.add(textField_9);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int selectedRow = table.getSelectedRow();
        		int id = Integer.parseInt(textField.getText());
        		String FullName = textField_1.getText();
        		String Gender = comboBox.getSelectedItem().toString();
        		String Email = textField_3.getText();
        		String ContactNumber = textField_4.getText();
        		String EmergencyNumber = textField_5.getText();
        		String Program = textField_7.getText();
        		int YearLevel = Integer.parseInt(comboBox_1.getSelectedItem().toString());
        		String StudentAddress = textField_9.getText();
        		int user_id = Integer.parseInt(comboBox_2.getSelectedItem().toString());
                
                updateData(id, FullName, Gender, Email, ContactNumber, EmergencyNumber, Program, YearLevel, StudentAddress, user_id);
                
                model.setValueAt(id, selectedRow, 0);
                model.setValueAt(FullName, selectedRow, 1);
                model.setValueAt(Gender, selectedRow, 2);
                model.setValueAt(Email, selectedRow, 3);
                model.setValueAt(ContactNumber, selectedRow, 4);
                model.setValueAt(EmergencyNumber, selectedRow, 5);
                model.setValueAt(Program, selectedRow, 6);
                model.setValueAt(YearLevel, selectedRow, 7);
                model.setValueAt(StudentAddress, selectedRow, 8);
                model.setValueAt(user_id, selectedRow, 9);


		    }
		});
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Arial", Font.BOLD, 15));
		btnEdit.setBackground(new Color(41, 82, 82));
		btnEdit.setBounds(775, 556, 114, 30);
		contentPane.add(btnEdit);
		
		comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"", "Male", "Female"}));
		comboBox.setBounds(1017, 231, 240, 27);
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox<>();
		comboBox_1.setModel(new DefaultComboBoxModel<>(new Integer[] {1, 2, 3, 4}));
		comboBox_1.setBounds(1017, 424, 240, 27);
		contentPane.add(comboBox_1);
		
		JTextArea txtrPassword_1_1_7_2 = new JTextArea();
		txtrPassword_1_1_7_2.setText("User ID");
		txtrPassword_1_1_7_2.setForeground(Color.WHITE);
		txtrPassword_1_1_7_2.setFont(new Font("Arial", Font.BOLD, 20));
		txtrPassword_1_1_7_2.setBackground(new Color(0, 128, 128));
		txtrPassword_1_1_7_2.setBounds(785, 499, 130, 30);
		contentPane.add(txtrPassword_1_1_7_2);
		
		comboBox_2 = new JComboBox<Integer>();
		comboBox_2.setModel(new DefaultComboBoxModel<>(user.toArray(new Integer[0])));
		comboBox_2.setBounds(1018, 500, 240, 27);
		contentPane.add(comboBox_2);
		
		Table();
		
		table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int selectedRow = table.getSelectedRow();
                displaySelRow(selectedRow);
            }
        });
	}
	
	private void Table() {
        DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection

        try {
            Connection con = dbConnect.con; // Use the connection from DbConnect
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                model.addRow(new Object[]{
                		rs.getInt("StudentID"),
                		rs.getString("FullName"),
                		rs.getString("Gender"),
                		rs.getString("Email"),
                		rs.getString("ContactNumber"),
                		rs.getString("EmergencyNumber"),
                		rs.getString("Program"),
                		rs.getString("YearLevel"),
                		rs.getString("StudentAddress"),
                		rs.getString("user_id"),
                });
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public void supply_comboBox() {
    	DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection

        try {
	        Connection con = dbConnect.con; // Use the connection from DbConnect
	        Statement stmt = con.createStatement();
	        String query = "SELECT user_id FROM register WHERE userrole = 'Student'";
	        ResultSet rs = stmt.executeQuery(query);
	
	    	while (rs.next()) { 
	    	    user.add(rs.getInt("user_id"));
	    	}

        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
	
	private void displaySelRow(int row) {
        if (row >= 0) {
            studid = Integer.parseInt(model.getValueAt(row, 0).toString()); 
        }
        
        DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection
        
        try {
        	Connection con = dbConnect.con; // Use the connection from DbConnect
            String query = "SELECT * FROM students WHERE StudentID = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, studid);
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
            	textField.setText(rs.getString("StudentID")); 
            	textField_1.setText(rs.getString("FullName"));
            	comboBox.setSelectedItem(rs.getString("Gender"));
            	textField_3.setText(rs.getString("Email"));
            	textField_4.setText(rs.getString("ContactNumber"));
            	textField_5.setText(rs.getString("EmergencyNumber"));
            	textField_7.setText(rs.getString("Program"));
            	comboBox_1.setSelectedItem(rs.getInt("YearLevel"));
            	textField_9.setText(rs.getString("StudentAddress"));
            	comboBox_2.setSelectedItem(rs.getInt("user_id"));
            }
        } catch (Exception e) {
        	e.printStackTrace();
        }
        
    }
	
	private void Search(String name) {
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
		dtm.setRowCount(0);
		
        DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection

        try {
            Connection con = dbConnect.con; // Use the connection from DbConnect
            String query = "SELECT * FROM students WHERE FullName LIKE ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1,"%" + name + "%");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{
                		rs.getInt("StudentID"),
                		rs.getString("FullName"),
                		rs.getString("Gender"),
                		rs.getString("Email"),
                		rs.getString("ContactNumber"),
                		rs.getString("EmergencyNumber"),
                		rs.getString("Program"),
                		rs.getString("YearLevel"),
                		rs.getString("StudentAddress"),
                		rs.getString("user_id"),
                });
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	public void insertData(String Fullname, String Gender, String Email, String ContactNumber, String EmergencyNumber, String Program, int YearLevel, String StudentAddress, int user_id) {
    	DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection
        Connection con = dbConnect.con; 
        String query = "INSERT INTO `students`(`FullName`, `Gender`, `Email`, `ContactNumber`, `EmergencyNumber`, `Program`, `YearLevel`, `StudentAddress`, `user_id`) VALUES (?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement pst = con.prepareStatement(query)) {
        	pst.setString(1, Fullname);
        	pst.setString(2, Gender);
        	pst.setString(3, Email);
        	pst.setString(4, ContactNumber);
        	pst.setString(5, EmergencyNumber);
        	pst.setString(6, Program);
        	pst.setInt(7, YearLevel);
        	pst.setString(8, StudentAddress);
        	pst.setInt(9, user_id);
            pst.executeUpdate();
            System.out.println("Students Info Inserted");
            javax.swing.JOptionPane.showMessageDialog(contentPane, "Students Info Inserted");

            try {
                Statement st = con.createStatement();
                String qry = "SELECT * FROM students WHERE StudentID = (SELECT MAX(StudentID) FROM students);";
                ResultSet res = st.executeQuery(qry);

                while (res.next()) {
                    model.addRow(new Object[]{
                    		res.getInt("StudentID"),
                    		res.getString("FullName"),
                    		res.getString("Gender"),
                    		res.getString("Email"),
                    		res.getString("ContactNumber"),
                    		res.getString("EmergencyNumber"),
                    		res.getString("Program"),
                    		res.getString("YearLevel"),
                    		res.getString("StudentAddress"),
                    		res.getString("user_id"),
                    });
                }
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	public void updateData(int id, String Fullname, String Gender, String Email, String ContactNumber, String EmergencyNumber, String Program, int YearLevel, String StudentAddress, int user_id) {
    	DbConnect dbConnect = new DbConnect();
        dbConnect.connect(); // Establish connection
        Connection con = dbConnect.con; 
        String query = "UPDATE `students` SET `FullName` = ?, `Gender` = ?, `Email` = ?, `ContactNumber` = ?, `EmergencyNumber` = ?, `Program` = ?, `YearLevel` = ?, `StudentAddress` = ?, `user_id` = ? WHERE `StudentID` = ?;";
        try (PreparedStatement pst = con.prepareStatement(query)) {
        	pst.setString(1, Fullname);
        	pst.setString(2, Gender);
        	pst.setString(3, Email);
        	pst.setString(4, ContactNumber);
        	pst.setString(5, EmergencyNumber);
        	pst.setString(6, Program);
        	pst.setInt(7, YearLevel);
        	pst.setString(8, StudentAddress);
        	pst.setInt(9, user_id);
        	pst.setInt(10, id);
            pst.executeUpdate();
            
            System.out.println("Student Info Updated");
            javax.swing.JOptionPane.showMessageDialog(contentPane, "Student Info Updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
