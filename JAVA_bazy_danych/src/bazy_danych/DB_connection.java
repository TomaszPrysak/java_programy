package bazy_danych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DB_connection {
	
	// url po³¹czenia z localhost (nazwaSterownika://adres/nazwaBazy)
	final static String connectionURL = "jdbc:mysql://localhost:3306/skoczkowie";
	// nazwê u¿ytkownika (profilu) w Workbenchu 
	final static String name = "root";
	// has³o dla tego konkretnego u¿ytkownika (profilu)
	final static String pass = "Pitek1962mySQLF700Gs";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// rejestracja klasy sterownika
		Class.forName("com.mysql.jdbc.Driver");
		
		// utworzenie po³¹czenia z baz¹ danych
		Connection con = DriverManager.getConnection(connectionURL, name, pass);
		
		// utworzenie wyra¿enia SQL
		Statement stmt = con.createStatement();
		// updat, delete, insert
		int d = stmt.executeUpdate("delete from zawodnicy where imie = 'Adam'");
		// wykonanie zapytania 
		ResultSet rs=stmt.executeQuery("select * from zawodnicy");
		while(rs.next()){
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getInt(6) + " " + rs.getInt(7));
		}
			// zamkniêcie po³¹czenia
			con.close();
		
		
	}

}
