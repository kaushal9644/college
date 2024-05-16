package org.apache.jsp.Jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class StudentprofileTimetable_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Student Class Time Tebale</title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/all.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"  ../css/all.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"  ../css/lightbox.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"  ../css/flexslider.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"  ../css/owl.carousel.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"  ../css/owl.theme.default.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"  ../css/jquery.rateyo.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/jquery.mmenu.all.css\" /> \n");
      out.write("\t <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/meanmenu.min.css\"> \n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../inner-page-style.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/syllbus.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/Loder.css\">\n");
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
      out.write("  background-color: #ddd;   \n");
      out.write("  color: black;  \n");
      out.write("} \n");
      out.write("\n");
      out.write("</style>   \n");
      out.write("    <script>\n");
      out.write("            $(function(){\n");
      out.write("            $(\"#header\").load(\"header.html\"); \n");
      out.write("            $(\"#footer\").load(\"footer.html\"); });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"loader\" class=\"loader\"></div>\n");
      out.write("         ");

         String username =(String)session.getAttribute("username");
            if(username==null || username.trim()=="")
            {
                 response.sendRedirect("../Login.html");
            }
      out.write("\n");
      out.write("        <div id=\"header\"></div>\n");
      out.write("        <div class=\"navbar\">  \n");
      out.write("  <a href=\"StudentProfile.jsp\">Home</a>   \n");
      out.write("  <a href=\"StudentprofileUpdate.jsp\">Profile Update</a>\n");
      out.write("<a href=\"StudentprofilePassword.jsp\">Change Password</a> \n");
      out.write("  <a href=\"https://davv.mponline.gov.in/portal/Services/DAVV/UTD_APP/semfee/semfeesubmission.aspx\">Fees</a>\n");
      out.write("\n");
      out.write("  <a href=\"StudentprofileSyllbus.jsp\">Syllbus</a>\n");
      out.write("  <a href=\"Studentprofileskill.jsp\">Online Skill Test</a>  \n");
      out.write("  <a href=\"StudentprofileTimetable.jsp\">Lab Manual</a>  \n");
      out.write("</div> \n");
      out.write("           <div class=\"main-content-area\" id=\"main-content-area\">\n");
      out.write("                <div class=\"content-left padding-border\">\n");
      out.write("       \n");
      out.write("                     <div class=\"all-news\">\n");
      out.write("                            <a href=\"../pdf/Lab manual  Computer Organization and Assembly Language Programming.pdf\">\n");
      out.write("                               <button type=\"button\" class=\"collapsible\">CS-2023 Computer Organization and Hardware Maintenance</button>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"../pdf/Lab manual  Data Structures and Algorithms.pdf\">\n");
      out.write("                                <div class=\"content\"></div>\n");
      out.write("                                <br>\n");
      out.write("                                <button type=\"button\" class=\"collapsible\">CS-2222 Data Structures and Algorithms</button>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"../pdf/Lab manual Computer Graphics & Multimedia Fundamentals.pdf\">\n");
      out.write("                                <div class=\"content\"></div>\n");
      out.write("                                <br>\n");
      out.write("                                <button type=\"button\" class=\"collapsible\">CS-3505 Computer Graphics & Multimedia Fundamentals</button>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"../pdf/Lab manual Computer Organization and Hardware Maintenance.pdf\">\n");
      out.write("                                <div class=\"content\"></div>\n");
      out.write("                                <br>\n");
      out.write("                                <button type=\"button\" class=\"collapsible\">CS-4022 Computer Organization and Assembly Language Programming</button>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"../pdf/Lab manual Programming and Problem Solving Using C.pdf\">\n");
      out.write("                                <div class=\"content\"></div>\n");
      out.write("                                <br>\n");
      out.write("                                <button type=\"button\" class=\"collapsible\">CS-4205 Programming and Problem Solving Using C</button>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"../pdf/Lab manual Object Oriented Programming using JAVA.pdf\">\n");
      out.write("                                <div class=\"content\"></div><br>\n");
      out.write("                                <button type=\"button\" class=\"collapsible\">CS-4211 Object Oriented Programming using JAVA</button>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"../pdf/Lab manual Computer Graphics & Multimedia.pdf\">\n");
      out.write("                                <div class=\"content\"></div><br>\n");
      out.write("                                <button type=\"button\" class=\"collapsible\">CS-4508 Computer Graphics & Multimedia</button>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"../pdf/Lab manual  Operating Systems.pdf\">\n");
      out.write("                                <div class=\"content\"></div><br>\n");
      out.write("                                <button type=\"button\" class=\"collapsible\">CS-5511 Operating Systems</button>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"../pdf/Lab manual  Advanced Algorithm Design.pdf\">\n");
      out.write("                                <div class=\"content\"></div><br>\n");
      out.write("                                <button type=\"button\" class=\"collapsible\">CS-6221 Advanced Algorithm Design</button>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"../pdf/Lab manual Internet of Things.pdf\">\n");
      out.write("                                <div class=\"content\"></div><br>\n");
      out.write("                                <button type=\"button\" class=\"collapsible\">CS-6630 Internet of Things</button>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
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
