package pkgUsingStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Util1
{
	private static final String DB_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "";
	private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/";
	private static final String DB_NAME = "paper";
	
	private static Connection connection = null;
	
	static
	{
		try
		{
			Class.forName(DB_DRIVER_CLASS);
			connection = DriverManager.getConnection(MYSQL_URL+DB_NAME, DB_USERNAME, DB_PASSWORD);
		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection()
	{
		return connection;
	}

}
