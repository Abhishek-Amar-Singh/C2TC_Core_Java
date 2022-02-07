package pkgUsingStatement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientTest2
{
	private static void update(Statement st, String query)
	{
		try
		{
			int executeUpdate = st.executeUpdate(query);
			System.out.println("No. of rows affected: " + executeUpdate);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) throws SQLException
	{
		Connection connection = DB_Util1.getConnection();
		if(connection != null)
		{
			System.out.println("JDBC:connection is taken...");
			Statement st = connection.createStatement();
			String query = "UPDATE employee_table SET empName='Sufiya', empStartingChar='S'  WHERE empId='E1';";
			update(st, query);
			
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
