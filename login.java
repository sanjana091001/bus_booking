package bus_booking;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class login {
	Connection c = null;
	Statement stmt = null;
	String username;
	String password;
	int flag1=0, flag2=0;
	login(String username, String password)
	{
		this.username=username;
		this.password=password;
	}
	int adminLogin()
	{
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_ticket_booking", "postgres", "postgres");
		stmt = c.createStatement();
		ResultSet rs = stmt.executeQuery( "SELECT "+username+" from admin_table where password="+password+";" );
		ResultSet rs2 = stmt.executeQuery( "SELECT "+password+" from admin_table where username="+username+";" );
		String  ret_username = rs.getString("username");
		String  ret_password = rs.getString("password");
		if(ret_username==username && ret_password==password)
		{
			flag1=1;
		}
		else
		{
			return 0;
		}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
		if(flag1==1)
			return 1;
		else
			return 0;
	}
	int userLogin()
	{
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_ticket_booking", "postgres", "postgres");
		stmt = c.createStatement();
		ResultSet rs = stmt.executeQuery( "SELECT "+username+" from user_table where password="+password+";" );
		ResultSet rs2 = stmt.executeQuery( "SELECT "+password+" from user_table where username="+username+";" );
		String  ret_username = rs.getString("username");
		String  ret_password = rs.getString("password");
		if(ret_username==username && ret_password==password)
		{
			flag2=1;
		}
		else
		{
			return 0;
		}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
		if(flag2==1)
			return 1;
		else
			return 0;
	}
}
