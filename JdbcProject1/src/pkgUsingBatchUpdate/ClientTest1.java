package pkgUsingBatchUpdate;

import java.sql.Connection;
import java.sql.Statement;

public class ClientTest1
{
	public static void main(String[] args)
	{
		Connection conn = DB_Util1.getConnection();
		if(conn != null)
		{
			System.out.println("JDBC:connection is taken..");
		}
		
		try
		{
			Statement st = conn.createStatement();
			String query1 = "INSERT INTO employee_table(empId,empName,empCity,empAge,empDoJ,empStartingChar)"
					+ "VALUES('E7', 'Dhanya', 'Jodhpur', 31, '2013-08-10', 'D');";
			st.addBatch(query1);
			String query2 = "UPDATE employee_table SET empName='Dimple' WHERE empId='E6';";
			st.addBatch(query2);
			String query3 = "DELETE FROM employee_table WHERE empId='E7';";
			st.addBatch(query3);
			int i[] = st.executeBatch();
			for(int j=0; j<i.length; j++)
			{
				System.out.println(i[j]);
			}
			conn.close();
			st.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
