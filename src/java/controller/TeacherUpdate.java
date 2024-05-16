
package controller;

import db.DB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TeacherUpdate extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        String tid =request.getParameter("tid");
            String tname = request.getParameter("tname");
            String tfname = request.getParameter("tfname");
            String gender = request.getParameter("gender");
            String dob = request.getParameter("dob");
            String post = request.getParameter("post");
            String subject = request.getParameter("subject");
            String mobilenumber =request.getParameter("mobilenumber");
            String email = request.getParameter("email");
            String state = request.getParameter("state");
            String city = request.getParameter("city");
            String address = request.getParameter("address");
            String salary = request.getParameter("salary");
            String password = request.getParameter("password");
             int a=0;
            try{
            Connection con =DB.getConnection();   
           String q="update teacher set tname=?,tfname=?, gender=?,dob=?,post=?,subject=?,mobilenumber=?,email=?,state=?,city=?,address=?,salary=?,password=? where tid=?";
           PreparedStatement ps =con.prepareStatement(q);

           
                   
                    ps.setString(1,tname);
                    ps.setString(2,tfname);
                    ps.setString(3,gender);
                    ps.setString(4,dob);
                    ps.setString(5,post);
                    ps.setString(6,subject);
                    ps.setString(7,mobilenumber);
                    ps.setString(8,email);
                    ps.setString(9,state);
                    ps.setString(10,city);
                    ps.setString(11,address);
                    ps.setString(12,salary);
                    ps.setString(13,password);
                    ps.setString(14,tid);
                    
                   a=  ps.executeUpdate();
           
            
            
           
            }catch(Exception e )
           {
              out.print(e);
           }
            if(a>0)
            resp.sendRedirect("Jsp/TeacherprofileUpdate.jsp?message=yes");
            else
             resp.sendRedirect("Jsp/TeacherprofileUpdate.jsp?message=no");   
    }

  
}
