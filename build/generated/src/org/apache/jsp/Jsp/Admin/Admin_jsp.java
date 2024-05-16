package org.apache.jsp.Jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import db.DB;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"../../css/syllbus.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/Loder.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/admin.css\">\n");
      out.write("       \n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Raleway:400,500,600,700\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.js\" integrity=\"sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60=\" crossorigin=\"anonymous\"> </script>\n");
      out.write("   \n");
      out.write("    <script>\n");
      out.write("            $(function(){\n");
      out.write("            $(\"#header\").load(\"header.html\"); \n");
      out.write("            $(\"#footer\").load(\"../footer.html\"); });\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("#data {\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#data td, #data th {\n");
      out.write("  border: 1px solid #ddd;\n");
      out.write("  padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#data tr:hover {background-color: #CEECFE;}\n");
      out.write("#data tr{\n");
      out.write("font-size:15px;\n");
      out.write("}\n");
      out.write("#data th {\n");
      out.write("font-size:16px;\n");
      out.write("  padding-top: 12px;\n");
      out.write("  padding-bottom: 12px;\n");
      out.write("  text-align: left;\n");
      out.write("  background-color: #035C91;\n");
      out.write("  color: white;\n");
      out.write("  /*/////////////////*/\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  list-style: none;\n");
      out.write("  transition: 0.2s cubic-bezier(0.175, 0.885, 0.32, 1.275);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".content-right {\n");
      out.write("  width: 28%;\n");
      out.write("  right: 0;\n");
      out.write("  margin: 1rem 0;\n");
      out.write("}\n");
      out.write(".primary-container .sticky {\n");
      out.write("  position: fixed;\n");
      out.write("  top: 0;\n");
      out.write("  width: 30%;\n");
      out.write("}\n");
      out.write(".content-right h1 {\n");
      out.write("  font-size: 22px;\n");
      out.write("  color: #343434;\n");
      out.write("  margin: 20px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".main-content-area .content-right {\n");
      out.write("  margin-top: 80px;\n");
      out.write("}\n");
      out.write(".content-right .sidebar-content {\n");
      out.write("  margin-top: 20px;\n");
      out.write("}\n");
      out.write(".content-right span {\n");
      out.write("  padding: 10px;\n");
      out.write("  color: #555;\n");
      out.write("  font-size: 12px;\n");
      out.write("}\n");
      out.write(".quote-container {\n");
      out.write("  padding: 48px 20px 60px 25px;\n");
      out.write("  margin: 45px 0 0 -15px;\n");
      out.write("  border-radius: 10px;\n");
      out.write("  max-width: 240px;\n");
      out.write("  font-family: \"Roboto Condensed\", sans-serif;\n");
      out.write("  position: relative;\n");
      out.write("  box-shadow: 5px 5px 20px #134486;\n");
      out.write("}\n");
      out.write(".quote-container .tag {\n");
      out.write("  position: absolute;\n");
      out.write("  top: -20px;\n");
      out.write("  left: 0;\n");
      out.write("  font-size: 100px;\n");
      out.write("  opacity: 0.4;\n");
      out.write("}\n");
      out.write("#quoteBody {\n");
      out.write("  font-family: \"Times New Roman\", Times, serif;\n");
      out.write("  font-family: \"Roboto Condensed\", sans-serif;\n");
      out.write("  line-height: 1.5;\n");
      out.write("  font-size: 16px;\n");
      out.write("  color: #134486;\n");
      out.write("}\n");
      out.write("#authorBody {\n");
      out.write("  text-align: right;\n");
      out.write("  margin: 25px 0;\n");
      out.write("}\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("        ");

        String username =(String)session.getAttribute("username");
            if(username==null || username.trim()=="")
            {
                 response.sendRedirect("../../Login.html");
            }
      out.write("\n");
      out.write("        <div id=\"loader\" class=\"loader\"></div>\n");
      out.write("        <div id=\"header\"></div>\n");
      out.write("        <div class=\"navbar\">  \n");
      out.write("  <a href=\"Admin.jsp\">Home</a> \n");
      out.write(" <div class=\"subnav\">\n");
      out.write("    <button class=\"subnavbtn\">Student <i class=\"fa fa-caret-down\"></i></button>\n");
      out.write("    <div class=\"subnav-content\">\n");
      out.write("      <a href=\"AllStudent.jsp\">All Student</a>\n");
      out.write("      <a href=\"StudentInsert.jsp\">Insert</a>\n");
      out.write("      <a href=\"StudentUpdate.jsp\">Update</a>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("  <div class=\"subnav\">\n");
      out.write("  <button class=\"subnavbtn\">Faculty <i class=\"fa fa-caret-down\"></i></button>\n");
      out.write("    <div class=\"subnav-content\">\n");
      out.write("      <a href=\"AllTeacher.jsp\">All Faculty</a>\n");
      out.write("      <a href=\"TeacherInsert.jsp\">Insert</a>\n");
      out.write("      <a href=\"TeacherUpdate.jsp\">Update</a>\n");
      out.write("   \n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("  \n");
      out.write("</div> \n");
      out.write("         \n");
      out.write("         <div class=\"main-content-area\" id=\"main-content-area\">\n");
      out.write("                <div class=\"content-left padding-border\">\n");
      out.write("                    <h1>Contact Message</h1>\n");
      out.write("                    ");

                        Connection con=DB.getConnection();
                        PreparedStatement ps=con.prepareStatement("select * from contact");
                            ResultSet rs=ps.executeQuery();
                            
      out.write("\n");
      out.write("                              <table id=\"data\">\n");
      out.write("                          <tr>\n");
      out.write("                              <th>Name</th><th>Email</th><th>Subject</th><th>Message</th>\n");
      out.write("                          </tr>");

                        while(rs.next())
                                  {                   
                      
      out.write("\n");
      out.write("                    \n");
      out.write("                          <tr>\n");
      out.write("                              <td>");
      out.print(rs.getString("name"));
      out.write("</td>\n");
      out.write("                              <td>");
      out.print(rs.getString("Email"));
      out.write("</td>\n");
      out.write("                              <td>");
      out.print(rs.getString("subject"));
      out.write("</td>\n");
      out.write("                               <td>");
      out.print(rs.getString("message"));
      out.write("</td>\n");
      out.write("                              </tr>\n");
      out.write("                     \n");
      out.write("                      \n");
      out.write("                      ");
}
                      
      out.write(" </table>\n");
      out.write("                </div></div>\n");
      out.write("          <div class=\"main-content-area\" id=\"main-content-area\">\n");
      out.write("                <div class=\"content-left padding-border\">\n");
      out.write("                    <h1>Quick Contact message</h1>\n");
      out.write("                     ");

                        Connection con1=DB.getConnection();
                        PreparedStatement ps1=con1.prepareStatement("select * from quickcontact");
                            ResultSet rs1=ps1.executeQuery();
                            
      out.write("\n");
      out.write("                            <table id=\"data\">\n");
      out.write("                          <tr>\n");
      out.write("                              <th>Name</th><th>Email</th><th>Message</th>\n");
      out.write("                          </tr>");

                        while(rs1.next())
                                  {                   
                      
      out.write("\n");
      out.write("                    \n");
      out.write("                          <tr>\n");
      out.write("                              <td>");
      out.print(rs1.getString("name"));
      out.write("</td>\n");
      out.write("                              <td>");
      out.print(rs1.getString("Email"));
      out.write("</td>\n");
      out.write("                               <td>");
      out.print(rs1.getString("message"));
      out.write("</td>\n");
      out.write("                              </tr>\n");
      out.write("                     \n");
      out.write("                      \n");
      out.write("                      ");
}
                      
      out.write(" </table>\n");
      out.write("                </div> \n");
      out.write("          <div class=\"sidebar content-right\">           \n");
      out.write("                        <div class=\"quote-container\">\n");
      out.write("                        <div class=\"quote-inner\">\n");
      out.write("                            <blockquote id=\"quoteBody\">All of us do not have equal talent. But, all of us have an equal opportunity to develop our talents.</blockquote>\n");
      out.write("                            <div id=\"authorBody\">Dr. A.P.J. Abdul Kalam</div>\n");
      out.write("                            <!-- <button id=\"nxtQuote\" class=\"quote-button\">Next Quote</button> -->\n");
      out.write("                             </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div></div>\n");
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
