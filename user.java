package bus_booking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class user {
	Connection c = null;
	Statement stmt = null;
	String userid;
	String pass;
	user(String userid, String pass)
	{
		this.userid=userid;
		this.pass=pass;
	}
	public
		void addDetails()
		{
			try
			{
				Class.forName("org.postgresql.Driver");
				c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_ticket_booking", "postgres", "postgres");
				c.setAutoCommit(false);
				stmt = c.createStatement();
				String sql = "INSERT INTO  (username, password) "
						+ "VALUES("+userid+","+pass+");";
				stmt.executeUpdate(sql);
				System.out.println("Inserted successfully");
				stmt.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
				System.err.println(e.getClass().getName()+": "+e.getMessage());
				System.exit(0);
			}
		}
		void modifyDetails(String new_pass)
		{
			try
			{
				stmt = c.createStatement();
				String sql = "UPDATE user set password="+new_pass+"where username="+userid+";";
				stmt.executeUpdate(sql);
				c.commit();
				System.out.println("Updated Succesfully");
				stmt.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
				System.err.println(e.getClass().getName()+": "+e.getMessage());
				System.exit(0);
			}
			
		}
}
