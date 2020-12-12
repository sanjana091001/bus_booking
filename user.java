package bus_booking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class user {

    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
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
				
				// This will load the MySQL driver, each DB has its own driver
	        	Class.forName("org.postgresql.Driver");
	            // Setup the connection with the DB
	        	connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_ticket_booking",
	                    "postgres", "postgres");
	            // Statements allow to issue SQL queries to the database
	            statement = connect.createStatement();
	         // PreparedStatements can use variables and are more efficient
	            preparedStatement = connect
	                    .prepareStatement("update user_table set passvalues (?, ?)");
	            
	            
	            // Parameters start with 1
	            String id=userid;
	            preparedStatement.setString(1, id);
	            String pass1=pass;
	            preparedStatement.setString(2, pass1);
	           
	            preparedStatement.executeUpdate();

	            preparedStatement = connect
	                    .prepareStatement("SELECT * from user_table");
	            resultSet = preparedStatement.executeQuery();
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
{
				
	        	Class.forName("org.postgresql.Driver");
	            // Setup the connection with the DB
	        	connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_ticket_booking",
	                    "postgres", "postgres");
	            // Statements allow to issue SQL queries to the database
	            statement = connect.createStatement();
	         // PreparedStatements can use variables and are more efficient
	            preparedStatement = connect
	                    .prepareStatement("insert into user_table values (?, ?)");
	            
	            
	            // Parameters start with 1
	            String id=userid;
	            preparedStatement.setString(1, id);
	            String pass1=pass;
	            preparedStatement.setString(2, pass1);
	           
	            preparedStatement.executeUpdate();

	            preparedStatement = connect
	                    .prepareStatement("SELECT * from user_table");
	            resultSet = preparedStatement.executeQuery();
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
}
