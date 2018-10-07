package mypack;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

public class Login extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        UserInfoBean userInfoBean = new UserInfoBean();
        userInfoBean.setUserName(userName);
        userInfoBean.setPassword(password);
        String username = LoginDAO.loginUser(userInfoBean);
        if(username.equals("False")){
//            System.out.println("user==null inside");
            RequestDispatcher req = request.getRequestDispatcher("loginsignup.jsp");
            req.include(request,response);
        }
        else{
            HttpSession session = request.getSession();
            session.setAttribute("username",username);
//            session.setAttribute("username",userName);
            response.sendRedirect("/");
        }
    }

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String pathToWeb = getServletContext().getRealPath(File.separator)+"uploadFiles" + File.separator;
        System.out.println(pathToWeb);
        RequestDispatcher req = request.getRequestDispatcher("loginsignup.jsp");
        req.include(request,response);
    }
}
