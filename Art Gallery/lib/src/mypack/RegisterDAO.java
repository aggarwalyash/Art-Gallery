package mypack;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class RegisterDAO {
    public static UserInfoBean registerUser(UserInfoBean userInfoBean){
        String firstName = userInfoBean.getFirstName();
        String lastName = userInfoBean.getLastName();
        String userName = userInfoBean.getUserName();
        String fullName = userInfoBean.getFullName();
        String email = userInfoBean.getEmail();
        String password = userInfoBean.getPassword();
        String phone = userInfoBean.getPhone();
        String gender = userInfoBean.getGender();
        UserInfoBean user = null;
        Connection con = null;
        PreparedStatement preparedStatement = null;
        try{
            con = DBConnection.createConnection();
            String query = "insert into users(name,email,password,username,phone,gender) values(?,?,?,?,?,?)";
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1,fullName);
            preparedStatement.setString(2,email);
            preparedStatement.setString(3,password);
            preparedStatement.setString(4,userName);
            preparedStatement.setString(5,phone);
            String g = "M";
            if(gender.equals("Female")){
                g = "F";
            }
            preparedStatement.setString(6,g);
            int i = preparedStatement.executeUpdate();
            if(i!=0){
                user = new UserInfoBean();
                userInfoBean.setFirstName(firstName);
                userInfoBean.setLastName(lastName);
                userInfoBean.setUserName(userName);
                userInfoBean.setEmail(email);
                return user;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
}
