package pkgUsingCallable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientTest1
{
	static CallableStatement cs = null;
	static Statement st = null;
	
	public static void main(String[] args) throws SQLException
	{
		Connection connection = DB_Util1.getConnection();
		if(connection != null)
		{
			System.out.println("JDBC:connection is taken..");
		}
		
		try
		{
			String query = "CREATE OR REPLACE PROCEDURE employeePro()\r\n"
					+ "BEGIN\r\n"
					+ "SELECT * FROM employee_table WHERE empStartingChar='S' or empStartingChar='V';\r\n"
					+ "END";
			
			st = connection.createStatement();
			int i = st.executeUpdate(query);
			
			cs = (CallableStatement) connection.prepareCall("CALL employeePro();");
			int i1 = cs.executeUpdate();
			System.out.println(i1);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			connection.close();
			cs.close(); 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
