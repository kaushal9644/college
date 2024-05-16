package org.apache.jsp.Jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import db.DB;

public final class AllStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin</title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/all.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"  ../../css/all.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"  ../../css/lightbox.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"  ../../css/flexslider.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"  ../../css/owl.carousel.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"  ../../css/owl.theme.default.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"  ../../css/jquery.rateyo.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/jquery.mmenu.all.css\" /> \n");
      out.write("\t <link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/meanmenu.min.css\"> \n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../inner-page-style.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/syllbus.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/Loder.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css\">\n");
      out.write("    <link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>\n");
      out.write("    <link rel='stylesheet prefetch' href='https://s3-us-west-2.amazonaws.com/s.cdpn.io/123941/rwd.table.min.css'>\n");
      out.write("\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Raleway:400,500,600,700\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.js\" integrity=\"sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60=\" crossorigin=\"anonymous\"> </script>\n");
      out.write("    <style>  \n");
      out.write(".navbar {  \n");
      out.write("  background-color: #024871 ; \n");
      out.write("  overflow: hidden; \n");
      out.write("}  \n");
      out.write("  \n");
      out.write(".navbar a {  \n");
      out.write("  float: left; \n");
      out.write("  display: #0444b3; \n");
      out.write("  color: white;\n");
      out.write("    font-size: 20px;\n");
      out.write("  text-align: center;  \n");
      out.write("  padding: 14px 16px;  \n");
      out.write("  text-decoration: none; \n");
      out.write("}  \n");
      out.write("  \n");
      out.write("\n");
      out.write(".navbar a:hover {  \n");
      out.write("  background-color: #035C91;   \n");
      out.write("  color: black;  \n");
      out.write("} \n");
      out.write(".subnav {\n");
      out.write("  float: left;\n");
      out.write("  overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".subnav .subnavbtn {\n");
      out.write("  font-size: 20px;  \n");
      out.write("  border: none;\n");
      out.write("  outline: none;\n");
      out.write("  color: white;\n");
      out.write("  margin-top: 5px;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  background-color: inherit;\n");
      out.write("  }\n");
      out.write("\n");
      out.write(".navbar a:hover, .subnav:hover .subnavbtn {\n");
      out.write("  background-color: #2596be;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".subnav-content {\n");
      out.write("  display: none;\n");
      out.write("  position: absolute;\n");
      out.write("  left: 0;\n");
      out.write("  background-color: #024871;\n");
      out.write("  \n");
      out.write("  z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".subnav-content a {\n");
      out.write("  float: left;\n");
      out.write("  color: white;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".subnav-content a:hover {\n");
      out.write("  background-color: #eee;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".subnav:hover .subnav-content {\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("#customers {\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 100%;\n");
      out.write("  font-size: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers td, #customers th {\n");
      out.write("  border: 1px solid #ddd;\n");
      out.write("  padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers tr:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write("#customers tr:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write("#customers th {\n");
      out.write("    \n");
      out.write("  padding-top: 12px;\n");
      out.write("  padding-bottom: 12px;\n");
      out.write("  text-align: left;\n");
      out.write("  background-color: #04AA6D;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>   \n");
      out.write("    <script>\n");
      out.write("            $(function(){\n");
      out.write("            $(\"#header\").load(\"header.html\"); \n");
      out.write("            $(\"#footer\").load(\"../footer.html\"); });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"loader\" class=\"loader\"></div>\n");
      out.write("        <div id=\"header\"></div>\n");
      out.write("        <div class=\"navbar\">  \n");
      out.write("  <a href=\"Admin.jsp\">Home</a> \n");
      out.write(" <div class=\"subnav\">\n");
      out.write("    <button class=\"subnavbtn\">Student <i class=\"fa fa-caret-down\"></i></button>\n");
      out.write("    <div class=\"subnav-content\">\n");
      out.write("     <a href=\"AllStudent.jsp\">All Student</a>\n");
      out.write("      <a href=\"StudentInsert.jsp\">Insert</a>\n");
      out.write("      <a href=\"StudentUpdate.jsp\">Update</a>\n");
      out.write("      <a href=\"StudentDelete.jsp\">Delete</a>\n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("  <div class=\"subnav\">\n");
      out.write("  <button class=\"subnavbtn\">Faculty <i class=\"fa fa-caret-down\"></i></button>\n");
      out.write("    <div class=\"subnav-content\">\n");
      out.write("      <a href=\"AllTeacher.jsp\">All Faculty</a>\n");
      out.write("      <a href=\"TeacherInsert.jsp\">Insert</a>\n");
      out.write("      <a href=\"TeacherUpdate.jsp\">Update</a>\n");
      out.write("      <a href=\"#TeacherDelete.jsp\">Delete</a>\n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("  \n");
      out.write("</div> \n");
      out.write("                     ");
      
            Connection con =DB.getConnection(); 
            PreparedStatement ps=con.prepareStatement("select * from student2 ");
            ResultSet rs =ps.executeQuery();    
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
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
      out.write("                    \n");
      out.write("                </div></div>\n");
      out.write("        <div id=\"footer\"></div>\n");
      out.write("         <script>\n");
      out.write("        document.onreadystatechange = function () {\n");
      out.write("            if (document.readyState !== \"complete\") {\n");
      out.write("                document.querySelector(\n");
      out.write("                    \"body\").style.visibility = \"hidden\";\n");
      out.write("                document.querySelector(\n");
      out.write("                    \"#loader\").style.visibility = \"visible\";\n");
      out.write("            } else {\n");
      out.write("                document.querySelector(\n");
      out.write("                    \"#loader\").style.display = \"none\";\n");
      out.write("                document.querySelector(\n");
      out.write("                    \"body\").style.visibility = \"visible\";\n");
      out.write("            }\n");
      out.write("        };\n");
      out.write("    </script>\n");
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
