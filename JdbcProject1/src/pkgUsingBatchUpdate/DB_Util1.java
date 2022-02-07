package pkgUsingBatchUpdate;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB_Util1
{
	private static final String DB_DRIVER_CLASS = "driverClassName";
	private static final String DB_USERNAME = "dbUsername";
	private static final String DB_PASSWORD = null;
	private static final String DB_URL = "db_url";
	
	private static Connection connection = null;
	private static Properties properties = null;
	static
	{
		try 
		{
			properties = new Properties();
			properties.load(new FileInputStream("src/pkgUsingBatchUpdate/db.properties"));
			Class.forName(properties.getProperty(DB_DRIVER_CLASS));
			connection = DriverManager.getConnection(properties.getProperty(DB_URL), properties.getProperty(DB_USERNAME), DB_PASSWORD);
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
