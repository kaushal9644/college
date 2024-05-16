
package controller;

import db.DB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StudentDataInsert extends HttpServlet {

   
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
             int a=0;
            PrintWriter out =resp.getWriter();
            String sid =req.getParameter("sid");
            String sname = req.getParameter("sname");
            String sfname = req.getParameter("sfname");
            String gender = req.getParameter("gender");
            String dob = req.getParameter("dob");
            String course = req.getParameter("course");
            String semester = req.getParameter("semester");
            String mobilenumber =req.getParameter("mobilenumber");
            String email = req.getParameter("email");
            String state = req.getParameter("state");
            String city = req.getParameter("citps.setString(1,sid);\n" +
"                    ps.setString(2,sname);\n" +
"                    ps.setString(3,sfname);\n" +
"                    ps.setString(4,gender);\n" +
"                    ps.setString(5,dob);\n" +
"                    ps.setString(6,course);\n" +
"                    ps.setString(7,semester);\n" +
"                    ps.setString(8,mobilenumber);\n" +
"                    ps.setString(9,email);\n" +
"                    ps.setString(10,state);\n" +
"                    ps.setString(11,city);\n" +
"                    ps.setString(12,district);\n" +
"                    ps.setString(13,village);\n" +
"                    ps.setString(14,password);y");
            String district = req.getParameter("district");
            String village = req.getParameter("village");
            String password = req.getParameter("password");
            
            try{
                Connection con = DB.getConnection();
                String Q ="insert into student2 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement  ps=con.prepareStatement(Q);
                {
                    ps.setString(1,sid);
                    ps.setString(2,sname);
                    ps.setString(3,sfname);
                    ps.setString(4,gender);
                    ps.setString(5,dob);
                    ps.setString(6,course);
                    ps.setString(7,semester);
                    ps.setString(8,mobilenumber);
                    ps.setString(9,email);
                    ps.setString(10,state);
                    ps.setString(11,city);
                    ps.setString(12,district);
                    ps.setString(13,village);
                    ps.setString(14,password);
                   
                  ps.execute();
                  a++;
                }
                 
            }catch(SQLException e)
            {
               out.println(e);
            }
            if(a>0)
                resp.sendRedirect("Jsp/Admin/StudentInsert.jsp?message=yes");
           else
               resp.sendRedirect("Jsp/Admin/StudentInsert.jsp?message=no"); 
            
    }

    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            
        resp.sendRedirect("StudentDataInsert.html");
    }

    
}
