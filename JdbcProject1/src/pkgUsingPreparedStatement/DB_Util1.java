package pkgUsingPreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB_Util1
{
	private static final String DB_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME = "root";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/paper";
	
	private static Connection connection = null;
	private static Properties properties=null;
	
	static
	{
		try
		{
			Class.forName(DB_DRIVER_CLASS);
			properties = new Properties();
			properties.put("user", DB_USERNAME);
			connection = DriverManager.getConnection(DB_URL, properties);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection()
	{
		return connection;
	}
}
