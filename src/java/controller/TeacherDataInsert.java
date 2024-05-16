
package controller;

import db.DB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TeacherDataInsert extends HttpServlet {

   
     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            int a=0;
            PrintWriter out =resp.getWriter();
            String tid =req.getParameter("tid");
            String tname = req.getParameter("tname");
            String tfname = req.getParameter("tfname");
            String gender = req.getParameter("gender");
            String dob = req.getParameter("dob");
            String post = req.getParameter("post");
            String subject = req.getParameter("subject");
            String mobilenumber =req.getParameter("mobilenumber");
            String email = req.getParameter("email");
            String state = req.getParameter("state");
            String city = req.getParameter("city");
            String address = req.getParameter("address");
            String salary = req.getParameter("salary");
            String password = req.getParameter("password");
            
            try{
                Connection con = DB.getConnection();
                String Q ="insert into teacher values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement  ps=con.prepareStatement(Q);
                {
                    ps.setString(1,tid);
                    ps.setString(2,tname);
                    ps.setString(3,tfname);
                    ps.setString(4,gender);
                    ps.setString(5,dob);
                    ps.setString(6,post);
                    ps.setString(7,subject);
                    ps.setString(8,mobilenumber);
                    ps.setString(9,email);
                    ps.setString(10,state);
                    ps.setString(11,city);
                    ps.setString(12,address);
                    ps.setString(13,salary);
                    ps.setString(14,password);
                    
                  ps.execute();
                  a++;
                }
                out.println("indert");
            }catch(SQLException e)
            {
               out.println(e);
            }
            if(a>0)
                resp.sendRedirect("Jsp/Admin/TeacherInsert.jsp?message=yes");
            
            else
                 resp.sendRedirect("Jsp/Admin/TeacherInsert.jsp?message=no");
            
    }

    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            
        resp.sendRedirect("TeacherDataInsert");
    }

  
    
}
