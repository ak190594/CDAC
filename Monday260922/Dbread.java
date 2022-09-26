package Monday260922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;  
public class Dbread
{

	public static void main(String args[])
	{  
		Connection connection = null;
		try
			{  
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrd","root", "");
 
            // mydb is database
            // mydbuser is name of database
            // mydbuser is password of database
 
	            Statement statement;
	            statement = connection.createStatement();
	            ResultSet resultSet;
	            resultSet = statement.executeQuery(
	                "select * from officers");
	            String name;
	            String pcno;
	            String Designation;
	            while (resultSet.next()) {
	                name = resultSet.getString("OfficerName");
	                pcno = resultSet.getString("OfficerPCno");
	                Designation = resultSet.getString("Designation");
	                System.out.println("OfficerName : " + name
	                                   + " OfficerPCno : " + pcno + "Designation :" +Designation );
	               
	            }
	            resultSet.close();
	            statement.close();
	            connection.close();
	        }
	        catch (Exception exception) {
	            System.out.println(exception);
	        }
			
		}

	}