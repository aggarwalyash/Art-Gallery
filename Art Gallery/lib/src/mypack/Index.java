package mypack;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Index extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection con = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        ArrayList<GalleryBean> gallery = new ArrayList<>();
        try{
            con = DBConnection.createConnection();
            String query = "select * from gallery";
            preparedStatement = con.prepareStatement(query);
            rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String username = rs.getString("username");
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
                gallery.add(galleryBean);
            }
        }
        catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }
        request.setAttribute("gallery",gallery);
        RequestDispatcher req = request.getRequestDispatcher("index.jsp");
        req.forward(request,response);
    }
}
