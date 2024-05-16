
package controller;

import db.DB;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class StudentChangePass extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
                HttpSession session =req.getSession(true);
                String username =(String)session.getAttribute("username");
                String pass1=req.getParameter("pass1");
                String pass2=req.getParameter("pass2");

                Connection con=DB.getConnection();
                
                if(pass1.equals(pass2))
                {
                    try{
                        String q="update student2 set password=? where sid='"+username+"'";
                        PreparedStatement ps =con.prepareStatement(q);
                         ps.setString(1,pass1);
                         //ps.setString(14,sid);
                          int a=0;
                            a= ps.executeUpdate();
                      
                      if(a>0)
                     resp.sendRedirect("Jsp/StudentprofilePassword.jsp?message=yes");
                      else
                         resp.sendRedirect("Jsp/StudentprofilePassword.jsp?message=no");
                        
                    }catch(SQLException e){
                        
                    }
                }
                else{
                      resp.sendRedirect("Jsp/StudentprofilePassword.jsp?message=notmatch");
                }
                
    }

 
    }

 
