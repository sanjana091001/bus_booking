package bus_booking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class bus{
	Connection c = null;
	Statement stmt = null;
	int bus_no;
	int no_of_seats;
	String bus_type;
	String bus_owner;
	String bus_driver;
	String bus_conductor;
	String bus_id;
	int route_no;
	bus(int bus_no, int no_of_seats,String bus_type,String bus_owner,String bus_driver,String bus_conductor,String bus_id, int route_no)
	{
		this.bus_no=bus_no;
		this.no_of_seats=no_of_seats;
		this.bus_type=bus_type;
		this.bus_owner=bus_owner;
		this.bus_driver=bus_driver;
		this.bus_conductor=bus_conductor;
		this.bus_id=bus_id;
		this.route_no=route_no;
	}
	public
	void addBus()
	{
		try 
		{
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_ticket_booking", "postgres", "postgres");
		c.setAutoCommit(false);
		stmt = c.createStatement();
		String sql = "INSERT INTO bus VALUES("+bus_conductor+","+route_no+","+no_of_seats+","+bus_driver+","+bus_owner+","+bus_id+");";
		stmt.executeUpdate(sql);
		System.out.println("Bus Added successfully");
		stmt.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
	}
	void searchBus(String bus_id)
	{
		try
		{
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_ticket_booking", "postgres", "postgres");
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery( "SELECT * FROM bus where bus_id="+bus_id+";" );
			while ( rs.next()) 
			{
				String bus_conductor = rs.getString("bus_conductor");
				int route_no = rs.getInt("route_no");
				int no_of_seats  = rs.getInt("no_of_seats");
				String bus_driver = rs.getString("bus_driver");
				String bus_owner = rs.getString("bus_owner");
				System.out.println( "Bus Conductor = " + bus_conductor );
				System.out.println( "Route number = " + route_no );
				System.out.println( "Number of seats = " + no_of_seats );
				System.out.println( "Bus Driver = " + bus_driver );
				System.out.println( "Bus Owner = " + bus_owner );
				System.out.println();
			}
			rs.close();
			stmt.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
		
	}
	void editBus(String bus_id)
	{
		System.out.println("What do you want to edit?");
		
	}
	void deleteBus(String bus_id)
	{
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_ticket_booking", "postgres", "postgres");
		c.setAutoCommit(false);
		stmt = c.createStatement();
		String sql = "DELETE from bus where bus_id = "+bus_id+";";
		stmt.executeUpdate(sql);
		c.commit();
		System.out.println("Deleted successfully");
		stmt.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
	}
};