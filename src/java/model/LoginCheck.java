
package model;

import db.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class LoginCheck {
    public boolean Checkuser(String username, String password ,String type)
   {
       String getpass="";
        Statement st=DB.getStatement();
         if(type.equals("student"))
         {
            String q="select password from student2 where sid='"+username+"' ";
            try {
                ResultSet rs =st.executeQuery(q);
                if(rs.next())
                {
                    getpass=rs.getString("password");
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
         }else if(type.equals("teacher"))
         {
             String q="select password from teacher where tid='"+username+"' ";
            try {
                ResultSet rs =st.executeQuery(q);
                if(rs.next())
                {
                    getpass=rs.getString("password");
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            } 
         }
         else if(type.equals("admin")){
             
             if(password.equals("1234")&&username.equals("admin")&&password.trim()!=null && username.trim() !=null){
                 return true;
             }
             else
                 return false;
         }
       
         if(password.equals(getpass)&&username.trim()!=null)
         {
             return true;
         }
         else
             return false;
       
       
   
   
   }
    
}
