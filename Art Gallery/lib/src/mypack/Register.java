package mypack;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Register extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> messages = new HashMap<String, String>();
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("userName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        String gender = request.getParameter("gender");
        if(firstName.isEmpty()){
            messages.put("firstname","First name is required");
        }
        if(lastName.isEmpty()){
            messages.put("lastname","Last name is required");
        }
        if(username.isEmpty()){
            messages.put("username","Username is required");
        }
        if(email.isEmpty()){
            messages.put("email","Email is required");
        }
        if(password.isEmpty()){
            messages.put("password","Password is required");
        }
        if(phone.isEmpty())
            messages.put("phone","Phone number is required.");
        if(gender.isEmpty())
            messages.put("gender","Gender is required");
        if(!messages.isEmpty()){
            RequestDispatcher req = request.getRequestDispatcher("loginsignup.jsp");
            req.include(request,response);
        }
        else{
            UserInfoBean userInfoBean = new UserInfoBean();
            userInfoBean.setFirstName(firstName);
            userInfoBean.setLastName(lastName);
            userInfoBean.setUserName(username);
            userInfoBean.setEmail(email);
            userInfoBean.setPassword(password);
            userInfoBean.setPhone(phone);
            char g = 'M';
            if(gender.equals("Female"))
                g = 'F';
            userInfoBean.setGender(g);
            UserInfoBean user = RegisterDAO.registerUser(userInfoBean);
            if(user!=null){
                System.out.println("Inside user=!null");
                HttpSession session = request.getSession();
                session.setAttribute("username", user.getUserName());
                session.setAttribute("email",user.getEmail());
                session.setAttribute("name",user.getFullName());
                response.sendRedirect("/");
            }
            else{
                System.out.println("qwertty");
                RequestDispatcher req = request.getRequestDispatcher("loginsignup.jsp");
                req.include(request,response);
            }
        }
    }


    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
//        HttpSession session = request.getSession(false);
//        if (session == null) {
        RequestDispatcher req = request.getRequestDispatcher("loginsignup.jsp");
        req.include(request,response);
        System.out.println("Inside GET");
//        } else {
//            RequestDispatcher req = request.getRequestDispatcher("index.jsp");
//            req.include(request,response);
//        }

    }
}
