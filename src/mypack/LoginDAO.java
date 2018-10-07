package mypack;

import javax.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginDAO {
    public static String loginUser(UserInfoBean userInfoBean){
        String userName = userInfoBean.getUserName();
        String password = userInfoBean.getPassword();
        Connection con = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try{
            con = DBConnection.createConnection();
            String query = "select name,email,username from users where username=? and password=?";
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1,userName);
            preparedStatement.setString(2,password);
            rs = preparedStatement.executeQuery();
            System.out.println("rs: "+rs);
            int count = 0;
            while (rs.next() && count<1){
                System.out.println("Inside this");
                count++;
                String fullName[] = rs.getString("name").split(" ");
                String email = rs.getString("email");
//                String pass = rs.getString("password");
                String username = rs.getString("username");
                return username;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "False";
    }
}
