import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "");

		Statement st = con.createStatement();

		String query = "INSERT INTO user (`username`, `email`, `password`, `number`) VALUES" + "('Nishanta', 'nishanta23@gmail.com', 'nishanta29', 9824133112)";

		int rows = st.executeUpdate(query);
		
		System.out.println("Added Successfully");

		con.close();
		
	}

}