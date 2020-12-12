package bus_booking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class booking implements bus_ticket_booking{
	Connection c = null;
	Statement stmt = null;
	String boarding;
	String destination;
	int date;
	int booking_id;
	int booking_date;
	booking(int d, String boa, String des)
	{
		date=d;
		boarding=boa;
		destination=des;
	}
		void addBooking(int pass_no,bus bus1  )
		{
			try
			{
				Class.forName("org.postgresql.Driver");
				c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_ticket_booking", "postgres", "postgres");
				c.setAutoCommit(false);
				stmt = c.createStatement();
				String sql = "UPDATE bus SET no_of_seats=no_of_seats-1 WHERE bus_id="+bus1.bus_id;
				stmt.executeUpdate(sql);
				c.commit();
				System.out.println("Booked Succesfully");
				stmt.close();
				//ticket number not assigned
			}
			catch (Exception e)
			{
				e.printStackTrace();
				System.err.println(e.getClass().getName()+": "+e.getMessage());
				System.exit(0);
			}
		}
		public void payment()
		{
			//print amount			
		}
		public void cancellation(int ticket_no, bus bus1)
		{
			try
			{//after assigning ticket number
				Class.forName("org.postgresql.Driver");
				c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_ticket_booking", "postgres", "postgres");
				c.setAutoCommit(false);
				stmt = c.createStatement();
				String sql = "UPDATE bus SET no_of_seats=no_of_seats+1 WHERE bus_id="+ bus1.bus_id+";";
				stmt.executeUpdate(sql);
				c.commit();
				System.out.println("Booked Successfully");
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
