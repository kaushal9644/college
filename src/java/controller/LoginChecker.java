
package controller;
import model.LoginCheck;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class LoginChecker extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("Login.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        String type =req.getParameter("type");
        String username =req.getParameter("username");
        String password =req.getParameter("password");
        
        LoginCheck LC =new LoginCheck();
        boolean login=LC.Checkuser(username, password,type);
                    
        if(login){
            if(type.equals("student"))
            {
                 HttpSession session =req.getSession(true);
                 session.setAttribute("username",username);
            resp.sendRedirect("Jsp/StudentProfile.jsp");
            }else if(type.equals("teacher")) 
            {
                 HttpSession session =req.getSession(true);
                session.setAttribute("username",username);
            resp.sendRedirect("Jsp/TeacherProfile.jsp");
            }
            else if(type.equals("admin"))
            {
                HttpSession session =req.getSession(true);
                session.setAttribute("username",username);
            resp.sendRedirect("Jsp/Admin/Admin.jsp");
            }
        }
        
        else{
            String message="no";
            resp.sendRedirect("Login.html?message="+message);
        }
    }
}
