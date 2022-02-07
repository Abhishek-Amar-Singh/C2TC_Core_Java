package pkgUsingPreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientTest1
{
	static PreparedStatement ps = null;
	
	public static void main(String[] args)
	{
		Connection conn = DB_Util1.getConnection();
		if(conn != null)
		{
			System.out.println("JDBC:connection is taken..");
		}
		
		String query = "UPDATE employee_table SET empName='Dhanya' where empId='E6';";
		try
		{
			ps = conn.prepareStatement(query);
			int n = ps.executeUpdate();
			System.out.println(n);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			conn.close();
			ps.close();
		}
		catch(Exception e)
		{
		   System.out.println(e);
		}
	}
}
