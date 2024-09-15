package Project;
import java.sql.*;
public class ConnectionProvider {
        public static Connection getCon(){
//
//        Connection con;
//        PreparedStatement pat;
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database?useSSL=false&serverTimezone=UTC", "root", "12345");
             return Con;
             
           } catch(ClassNotFoundException | SQLException e)
           {
               
               return null;
                   }
    }
}

