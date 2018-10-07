package mypack;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Profile extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        String username = session.getAttribute("username").toString();
        Connection con = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs;
        ArrayList<GalleryBean> gallery = new ArrayList<>();
        UserInfoBean userInfoBean = new UserInfoBean();
        try{
            con = DBConnection.createConnection();
            String query = "select * from users where username=?";
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1,username);
            rs = preparedStatement.executeQuery();
            if (rs.next()){
                String name = rs.getString("name");
                String email = rs.getString("email");
                String gender = rs.getString("gender");
                char g = 'M';
                String phone = rs.getString("phone");
                userInfoBean.setUserName(username);
                userInfoBean.setEmail(email);
                userInfoBean.setFirstName(name);
                if(gender.equals("F"))
                    g = 'F';
                userInfoBean.setGender(g);
                userInfoBean.setPhone(phone);
            }
            query = "select * from gallery where username=?";
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1,username);
            rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String title = rs.getString("title");
                int likes = rs.getInt("likes");
                String catid = rs.getString("category_id");
                String description = rs.getString("description");
                String destination = rs.getString("imaged");
                GalleryBean galleryBean = new GalleryBean();
                galleryBean.setId(id);
                galleryBean.setTitle(title);
                galleryBean.setUsername(username);
                galleryBean.setLikes(likes);
                galleryBean.setCategoryId(catid);
                galleryBean.setDescription(description);
                galleryBean.setDestination(destination);
                System.out.println("GalleryBean: " + galleryBean);
                gallery.add(galleryBean);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        request.setAttribute("user",userInfoBean);
        request.setAttribute("gallery",gallery);
        RequestDispatcher req = request.getRequestDispatcher("myprofile.jsp");
        req.forward(request,response);
    }
}
