
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


public class Contact extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int a=0;
        String name=req.getParameter("name");
        String email =req.getParameter("email");
        String subject =req.getParameter("subject");
        String message =req.getParameter("message");
       Connection con =DB.getConnection();
        try{
            String q="insert into contact values(?,?,?,?)";
             PreparedStatement ps =con.prepareStatement(q);
             {
                  ps.setString(1,name);
                    ps.setString(2,email);
                    ps.setString(3,subject);
                    ps.setString(4,message);
             }
           
          ps.execute();
            a++;
             if(a>0)
                     resp.sendRedirect("contact.html?message=yes");
                      else
                         resp.sendRedirect("contact.html?message=no");
        }catch(SQLException e){
            
            System.out.print(e);
        }
    }

   
    
}
