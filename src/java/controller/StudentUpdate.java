
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


public class StudentUpdate extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
   String sid =request.getParameter("sid");
            String sname = request.getParameter("sname");
            String sfname = request.getParameter("sfname");
            String gender = request.getParameter("gender");
            String dob = request.getParameter("dob");
            String course = request.getParameter("course");
            String semester = request.getParameter("semester");
            String mobilenumber =request.getParameter("mobilenumber");
            String email = request.getParameter("email");
            String state = request.getParameter("state");
            String city = request.getParameter("city");
            String district = request.getParameter("district");
            String village = request.getParameter("village");
            String password = request.getParameter("password");
            
            try{
            Connection con =DB.getConnection();   
           String q="update student2 set sname=?,sfname=?, gender=?,dob=?,course=?,semester=?,mobilenumber=?,email=?,state=?,city=?,district=?,village=?,password=? where sid=?";
           PreparedStatement ps =con.prepareStatement(q);

           
                   
                    ps.setString(1,sname);
                    ps.setString(2,sfname);
                    ps.setString(3,gender);
                    ps.setString(4,dob);
                    ps.setString(5,course);
                    ps.setString(6,semester);
                    ps.setString(7,mobilenumber);
                    ps.setString(8,email);
                    ps.setString(9,state);
                    ps.setString(10,city);
                    ps.setString(11,district);
                    ps.setString(12,village);
                    ps.setString(13,password);
                    ps.setString(14,sid);
                    
                    int a=0;
                            a= ps.executeUpdate();
                      
                      if(a>0)
                     resp.sendRedirect("Jsp/StudentprofileUpdate.jsp?message=yes");
                      else
                         resp.sendRedirect("Jsp/StudentprofileUpdate.jsp?message=no"); 
            }catch(Exception e )
           {
              System.out.print(e);
           }    }

   
}
