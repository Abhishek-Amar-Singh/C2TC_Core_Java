package pkgResultSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pkgUsingBatchUpdate.DB_Util1;

public class ResultSetDemo
{
	public static void main(String[] args) throws SQLException
	{
		Connection conn = DB_Util1.getConnection();
		if(conn != null)
		{
			System.out.println("JDBC:connection is taken..");
		}
		
		Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = st.executeQuery("select * from employee_table");
		
		System.out.println("4th record is:");
		rs.absolute(4);
		System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));

		System.out.println("3rd record is:");
		rs.relative(-1);//currentCursorAtRowPosition - 1
		System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
		
		//update 5th record
		rs.absolute(5);
		rs.updateString(2, "Dhanya");
		rs.updateRow();
		
		try
		{
			conn.close();
			st.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
