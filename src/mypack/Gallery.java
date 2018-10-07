package mypack;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


@MultipartConfig
public class Gallery extends HttpServlet {
    private static final String SAVE_DIR = "uploadFiles";
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String title = request.getParameter("title");
        System.out.println("dsfd: " + request.getAttribute("title"));
        String description = request.getParameter("description");
        String category = request.getParameter("category");
//        int catid = Integer.parseInt(category);
        String path = "";
        System.out.println("title: " +title + "  desc: " + description + " cat:" + category + " ");
        HttpSession session = request.getSession(false);
        String username = (String) session.getAttribute("username");
        System.out.println(username);

        FileInputStream fis = null;
        Connection con = null;
        PreparedStatement preparedStatement = null;
        try{
            con = DBConnection.createConnection();
            String gSeq = "select gallery_sequence.nextval from dual";
            preparedStatement = con.prepareStatement(gSeq);
            int gId = 0;
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next())
                gId = rs.getInt(1);
            System.out.println("gId: " + gId + " username: "+ username);
            preparedStatement = con.prepareStatement("insert into gallery(id,title,username,likes,category_id,description,imaged) values(?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,gId);
            preparedStatement.setString(2,title);
            preparedStatement.setString(3,username);
            preparedStatement.setInt(4,0);
            preparedStatement.setString(5,category);
            preparedStatement.setString(6,description);

            String appPath = request.getServletContext().getRealPath("");
            String dir = username;
            String savePath = appPath + SAVE_DIR + File.separator + dir;
            File fileSaveDir = new File(savePath);
            if (!fileSaveDir.exists()) {
                fileSaveDir.mkdir();
            }

            Part part = request.getPart("file");
            String fileName = extractFileName(part);
            String extension = "";
            int i = fileName.lastIndexOf('.');
            if (i > 0) {
                extension = fileName.substring(i+1);
            }
            System.out.println(extension);
            path = new String(File.separator + SAVE_DIR + File.separator + username + File.separator + gId + "." + extension);
            part.write(savePath + File.separator + gId + "." + extension );
/**
 for (Part part : request.getParts()) {
 String fileName = extractFileName(part);
 String extension = "";
 int i = fileName.lastIndexOf('.');
 if (i > 0) {
 extension = fileName.substring(i+1);
 }
 System.out.println(extension);
 path = new String(savePath + File.separator + gId + "." + extension);
 part.write(savePath + File.separator + gId + "." + extension );
 }
 **/

            //
//            System.out.println(extension);
            preparedStatement.setString(7,path);
            System.out.println(path);
//            System.out.println(path);
            int count = preparedStatement.executeUpdate();
            if(count>0){
                System.out.println("insert successfully");
//                RequestDispatcher req = request.getRequestDispatcher("index.jsp");
//                req.include(request,response);
                response.sendRedirect("/");
            }
            else
                System.out.println("not successfully");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        RequestDispatcher req = request.getRequestDispatcher("upload_gallery.jsp");
        req.include(request,response);
    }


    private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length()-1);
            }
        }
        return "";
    }


    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

        try{
            HttpSession session = request.getSession(false);
            String username = session.getAttribute("username").toString();
            System.out.println(username);
            System.out.println("username: "+username);
            if (username!= null && !username.isEmpty()) {
                ArrayList<Category> categories = new ArrayList<>();
                Connection con = DBConnection.createConnection();
                PreparedStatement preparedStatement = null;
                ResultSet rs = null;
                String query = "select * from category";
                preparedStatement = con.prepareStatement(query);
                rs = preparedStatement.executeQuery();
                while (rs.next()){
                    int id = rs.getInt("id");
                    String title = rs.getString("title");
                    categories.add(new Category(id,title));
                }
                request.setAttribute("categories",categories);
                RequestDispatcher req = request.getRequestDispatcher("upload_gallery.jsp");
                req.forward(request,response);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        response.sendRedirect("/");
    }



}

