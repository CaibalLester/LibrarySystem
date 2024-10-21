package library_system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;



public class DbConnect {
	private String url = "jdbc:mysql://localhost:3306/librarysystem";
	private String username = "root";
	private String password ="";
	
	public Connection con;
	
	public ResultSet result;
	
	public void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url, username, password);
			
			System.out.println("Database Connected");
			
			
		
		}catch(Exception e) {
			System.err.println("Failed to Connect");
			e.printStackTrace();
		}
	}
}
