package org.apache.jsp.Jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import db.DB;

public final class StudentData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Student Show Data</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("table {\n");
      out.write("  font-family: arial, sans-serif;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td, th {\n");
      out.write("  border: 1px solid #dddddd;\n");
      out.write("  text-align: left;\n");
      out.write("  padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {\n");
      out.write("  background-color: #dddddd;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    <body>\n");
      out.write("        <h1>Student Show Data</h1>\n");
      out.write("        ");

            String id ="101";
                
            Connection con =DB.getConnection(); 
            PreparedStatement ps=con.prepareStatement("select * from student2 where sid='"+id+"'");
            ResultSet rs =ps.executeQuery();
            while(rs.next())
            {
              
      out.write("\n");
      out.write("              <table>\n");
      out.write("                  <tr>\n");
      out.write("                      <td>ID : </td><td>");
      out.print(rs.getString("sid"));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                      <td>Name : </td><td>");
      out.print(rs.getString("sname"));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                      <td>Father Name : </td><td>");
      out.print(rs.getString("sfname"));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                      <td>Gender : </td><td>");
      out.print(rs.getString("gender"));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                      <td>DOB : </td><td>");
      out.print(rs.getString("dob"));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                      <td>Course : </td><td>");
      out.print(rs.getString("course"));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                      <td>Semester : </td><td>");
      out.print(rs.getString("semester"));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                      <td>Mobile Number : </td><td>");
      out.print(rs.getString("mobilenumber"));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                      <td>Email : </td><td>");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("                  </tr><tr>\n");
      out.write("                      <td>State : </td><td>");
      out.print(rs.getString("state"));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                      <td>City : </td><td>");
      out.print(rs.getString("city"));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                      <td>District : </td><td>");
      out.print(rs.getString("district"));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                      <td>Village : </td><td>");
      out.print(rs.getString("village"));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                      <td>Password : </td><td>");
      out.print(rs.getString("password"));
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("              </table>\n");
      out.write("        ");
 
            }
          
            
            
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
