package mypack;

import java.sql.*;

public class DBConnection {
    public static Connection createConnection(){
        Connection con = null;
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "yash";
        String password = "96877300";
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Printing connection object "+con);

        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("Class Not found");
        }
        catch (SQLException e){
            e.printStackTrace();
            System.out.println("Sql exception occured");

        }
        return con;
    }
}

