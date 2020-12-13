package bus_booking;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class login {
	private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
	
	Connection c = null;
	Statement stmt = null;
	String ret_username;
	String ret_password;
	String username;
	String password;
	int flag1=0, flag2=0;
	
	login(String username, String password)
	{
		this.username=username;
		this.password=password;
	}
	void adminLogin()
	{
		try {
			
        	Class.forName("org.postgresql.Driver");
            // Setup the connection with the DB
        	connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_ticket_booking",
                    "postgres", "postgres");
         
            statement = connect.createStatement();
         
            preparedStatement = connect
                    .prepareStatement( ("SELECT * from admin_table where username=? and password=?"));
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
                    resultSet = preparedStatement.executeQuery();
                    while (resultSet.next()) {
                        String usern = resultSet.getString("username");   
                        ret_username=usern;
                        String passw = resultSet.getString("password");     
                        ret_password=passw;
                    }
                    if(this.username.equals(ret_username)==true && this.password.equals(ret_password)==true)
                    	System.out.print("Valid!!!");
                    else
                    	System.out.print("Invalidd");


		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
	}
	void userLogin()
	{
		try {
			Class.forName("org.postgresql.Driver");
            // Setup the connection with the DB
        	connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_ticket_booking",
                    "postgres", "postgres");
         
            statement = connect.createStatement();
         
            preparedStatement = connect
                    .prepareStatement( ("SELECT * from user_table where username=? and password=?"));
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
                    resultSet = preparedStatement.executeQuery();
                    while (resultSet.next()) {
                    	String usern = resultSet.getString("username");
                    	ret_username=usern;
                    	String passw = resultSet.getString("password");     
                    	ret_password=passw;
                    }
                    if(this.username.equals(ret_username)==true && this.password.equals(password)==true)
                	System.out.print("Valid!!!");
                else
                	System.out.print("Invalidd");


	}
	catch (Exception e)
	{
		e.printStackTrace();
		System.err.println(e.getClass().getName()+": "+e.getMessage());
		System.exit(0);
	}
}
	private void writeMetaData(ResultSet resultSet) throws SQLException {
        System.out.println("The columns in the table are: ");

        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
            System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
        }
    }

    private void writeResultSet(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
        	

           
            String usern = resultSet.getString("username");
            String passw = resultSet.getString("password");
            
            
        }
        
    }

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