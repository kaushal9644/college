package org.apache.jsp.Jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import db.DB;

public final class AllStudentData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <meta charset=\"UTF-8\">  \n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css\">\n");
      out.write("    <link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>\n");
      out.write("    <link rel='stylesheet prefetch' href='https://s3-us-west-2.amazonaws.com/s.cdpn.io/123941/rwd.table.min.css'>\n");
      out.write("\n");
      out.write("        <title>Student Show Data</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write(" th {\n");
      out.write("  background-color: #3498DB;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("    background-color: #EBF5FB;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("  \n");
      out.write("    <body>\n");
      out.write("        <h1>All Student Show Data</h1>\n");
      out.write("        ");
      
            Connection con =DB.getConnection(); 
            PreparedStatement ps=con.prepareStatement("select * from student2 ");
            ResultSet rs =ps.executeQuery();    
        
      out.write("\n");
      out.write(" \n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-xs-12\">\n");
      out.write("      <div class=\"table-responsive\" data-pattern=\"priority-columns\">\n");
      out.write("        <table  class=\"table table-bordered table-hover\">\n");
      out.write("          <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th data-priority=\"1\"> ID </th><th data-priority=\"2\">Student Name</th><th data-priority=\"3\">Father's Name</th><th data-priority=\"4\">Gender</th><th data-priority=\"5\">DOB</th><th data-priority=\"6\"> Course </th><th data-priority=\"7\">Semester </th><th data-priority=\"8\"> Mobile number</th><th data-priority=\"9\"> Email</th><th data-priority=\"10\"> State</th><th data-priority=\"11\"> City </th><th data-priority=\"12\">District </th><th data-priority=\"13\"> Village</th><th data-priority=\"14\"> Password</th>\n");
      out.write("                </tr>\n");
      out.write("             </thead>\n");
      out.write("          <tbody>\n");
      out.write("            ");

            while(rs.next())
            {
              
      out.write("\n");
      out.write("               <tr>\n");
      out.write("                    <td> ");
      out.print(rs.getString("sid"));
      out.write(" </td><td>");
      out.print(rs.getString("sname"));
      out.write("</td><td>");
      out.print(rs.getString("sfname"));
      out.write("</td><td>");
      out.print(rs.getString("gender"));
      out.write("</td><td>");
      out.print(rs.getString("dob"));
      out.write("</td><td>");
      out.print(rs.getString("course"));
      out.write(" </td><td>");
      out.print(rs.getString("semester"));
      out.write(" </td><td> ");
      out.print(rs.getString("mobilenumber"));
      out.write("</td> <td> ");
      out.print(rs.getString("email"));
      out.write("</td><td> ");
      out.print(rs.getString("state"));
      out.write("</td><td> ");
      out.print(rs.getString("city"));
      out.write(" </td><td>");
      out.print(rs.getString("district"));
      out.write(" </td><td> ");
      out.print(rs.getString("village"));
      out.write("</td><td> ");
      out.print(rs.getString("password"));
      out.write("</td>\n");
      out.write("                </tr> \n");
      out.write("             \n");
      out.write("        ");
 
            }
          
            
            
      out.write("\n");
      out.write("             </tbody>\n");
      out.write("        </table>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("             \n");
      out.write("            <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("            <script src='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.2/js/bootstrap.min.js'></script>\n");
      out.write("            <script src='https://s3-us-west-2.amazonaws.com/s.cdpn.io/123941/rwd-table-patterns.js'></script>\n");
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
