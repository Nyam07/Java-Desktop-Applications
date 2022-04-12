

package Project;

/**
 *
 * @author NYAM
 * purpose: provide a connection to the database
 * You must import the package project in order to use the method for creating a connection
 */
import java.sql.*;
public class ConnectionProvider {
   //create a method for connection to database
    public static Connection getCon(){
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
          return con;
        }
        catch(Exception e){
            return null;
        }
    }
}
