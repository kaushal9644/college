
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


public class QuickContact extends HttpServlet {

      protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        PrintWriter out =resp.getWriter();
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String message =req.getParameter("message");
        Connection con=null;
       con = DB.getConnection();
        String q="insert into QuickContact values(?,?,?)";
        try {
            PreparedStatement ps =con.prepareStatement(q);
                ps.setString(1, name);
                ps.setString(2,email);
                ps.setString(3, message);
            
                ps.execute();
                resp.sendRedirect("index.html");
           } catch (SQLException ex) {
             resp.sendRedirect("index.html");
          }
          
        }
        
    }

