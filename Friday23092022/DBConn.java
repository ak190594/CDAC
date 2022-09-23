package Friday23092022;


import java.sql.*;

public class DBConn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/staff",
                "root", "");
 
            // mydb is database
            // mydbuser is name of database
            // mydbuser is password of database
 
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                "select * from college");
            String code;
            String title;
            while (resultSet.next()) {
                code = resultSet.getString("first_name");
                title = resultSet.getString("last_name").trim();
                System.out.println("first name : " + code
                                   + " last name : " + title);
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
