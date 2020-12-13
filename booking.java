package bus_booking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class booking implements bus_ticket_booking{
	private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
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
		void addBooking(int pass_no,String busid  )
		{
			try
			{// This will load the MySQL driver, each DB has its own driver
	        	Class.forName("org.postgresql.Driver");
	            // Setup the connection with the DB
	        	connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_ticket_booking",
	                    "postgres", "postgres");
	            // Statements allow to issue SQL queries to the database
	            statement = connect.createStatement();
            	 preparedStatement=connect.prepareStatement("update bus set no_of_seats=no_of_seats-? where bus_id=?");
            	 int passno=pass_no;
 	            preparedStatement.setInt(1, passno);
 	            String busid1=busid;
 	            preparedStatement.setString(2, busid1);
 	           
 	            preparedStatement.executeUpdate();
 	           preparedStatement = connect
	                    .prepareStatement("SELECT * from bus");
	            resultSet = preparedStatement.executeQuery();
            	System.out.print("\nUpdated.");
			}
			catch (Exception e)
			{
				e.printStackTrace();
				System.err.println(e.getClass().getName()+": "+e.getMessage());
				System.exit(0);
			}
		}
		 public void cancellation(int pass_no, String busid1)
		{
			try
			{
				// This will load the MySQL driver, each DB has its own driver
	        	Class.forName("org.postgresql.Driver");
	            // Setup the connection with the DB
	        	connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_ticket_booking",
	                    "postgres", "postgres");
	            // Statements allow to issue SQL queries to the database
	            statement = connect.createStatement();
            	 preparedStatement=connect.prepareStatement("update bus set no_of_seats=no_of_seats+? where bus_id=?");
            	 int passno=pass_no;
 	            preparedStatement.setInt(1, passno);
 	            String busid=busid1;
 	            preparedStatement.setString(2, busid);
 	           
 	            preparedStatement.executeUpdate();
 	           preparedStatement = connect
	                    .prepareStatement("SELECT * from bus");
	            resultSet = preparedStatement.executeQuery();
            	System.out.print("\nUpdated.");
			}
			catch (Exception e)
			{
				e.printStackTrace();
				System.err.println(e.getClass().getName()+": "+e.getMessage());
				System.exit(0);
			}
		}
		 private void writeMetaData(ResultSet resultSet) throws SQLException {
		        //  Now get some metadata from the database
		        // Result set get the result of the SQL query

		        System.out.println("The columns in the table are: ");

		        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
		        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
		            System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
		        }
		    }

		    // You need to close the resultSet
		    private void close() {
		        try {
		            if (resultSet != null) {
		                resultSet.close();
		            }

		            if (statement != null) {
		                statement.close();
		            }

		            if (connect != null) {
		                connect.close();
		            }
		        } catch (Exception e) {

		        }
		    }
};
