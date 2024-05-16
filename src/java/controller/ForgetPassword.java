
package controller;

import db.DB;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ForgetPassword extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            
        String type=req.getParameter("type");
        String id=req.getParameter("id");
        String name=req.getParameter("name");
        String fname=req.getParameter("fname");
        
        String getname="";
        String getfname="";
        String getpass="";
        
        Connection con =DB.getConnection();
            
       if(type.equals("student"))
       {
            try {
            PreparedStatement ps=con.prepareStatement("select password,sname,sfname from student2 where sid='"+id+"'");
            ResultSet rs=ps.executeQuery();
            
            while(rs.next())
            {
                getname=rs.getString("sname");
                getfname=rs.getString("sfname");
                getpass=rs.getString("password");
            }
                    } catch (SQLException ex) {
            Logger.getLogger(ForgetPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
       }else 
       { try {
            PreparedStatement ps=con.prepareStatement("select password,tname,tfname from teacher where tid='"+id+"'");
            ResultSet rs=ps.executeQuery();
            
            while(rs.next())
            {
                getname=rs.getString("tname");
                getfname=rs.getString("tfname");
                getpass=rs.getString("password");
            }
                    } catch (SQLException ex) {
            Logger.getLogger(ForgetPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
           
       }

       
       if(name.equals(getname.trim()) && fname.equals(getfname.trim()))
       {
          resp.sendRedirect("ForgetPassword.html?pass="+getpass);
       }
       else
           resp.sendRedirect("ForgetPassword.html?pass=no");
        
        
    }

  
        
}
