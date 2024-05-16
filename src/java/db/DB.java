
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DB {
     static  Connection con =null;
  static  Statement st=null;
    
  static 
  {
       try{
           Class.forName("com.mysql.jdbc.Driver");
           System.out.print("Driver load..");
       }catch (ClassNotFoundException ex) {
           System.out.println("Class Not Found");
      }
       try{

           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","kaushal"); 
           st=con.createStatement();
       }
      catch(SQLException e){
           
           System.out.print(e);
      }
       
  }
  
  public static Statement getStatement()
  {
      return st;
     
  }
  public static Connection getConnection()
  {
      return con;
    
  }

   
    
    
}
