

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection
{
	static Connection c;
	public static Connection connect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c= DriverManager.getConnection("jdbc:mysql://localhost:3306/budget_db","root","sv27");
			System.out.println("Connected");
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return c;
	}
	public static void main(String[] args)
	{
		connect();

	}

}
