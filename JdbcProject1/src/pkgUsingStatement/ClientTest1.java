package pkgUsingStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientTest1
{
	public static void main(String[] args) throws SQLException
	{
		Connection connection = DB_Util1.getConnection();
		if(connection != null)
		{
			System.out.println("JDBC:connection is taken...");
			Statement st = connection.createStatement();
			String query = "SELECT * FROM employee_table;";
			ResultSet rs = st.executeQuery(query);
				
			while(rs.next())
			{
				System.out.println(rs.getString(1) + " " + rs.getString(2) +
						" " + rs.getString(3) + " " + rs.getInt(4) + 
						" " + rs.getDate(5) + " " + rs.getString(6));
			}
			
			try
			{
				connection.close();
				st.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("JDBC:connection is not taken...");
		}
	}
}
