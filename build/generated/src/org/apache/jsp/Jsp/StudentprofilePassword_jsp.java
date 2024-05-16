package org.apache.jsp.Jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import db.DB;

public final class StudentprofilePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Student Profile</title>\n");
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
      out.write("   <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/admin.css\">  \n");
      out.write("    <script>\n");
      out.write("            $(function(){\n");
      out.write("            $(\"#header\").load(\"header.html\"); \n");
      out.write("            $(\"#footer\").load(\"footer.html\"); });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"loader\" class=\"loader\"></div>\n");
      out.write("        <div id=\"header\"></div>\n");
      out.write("        <div class=\"navbar\">  \n");
      out.write("  <a href=\"StudentProfile.jsp\">Home</a> \n");
      out.write("  <a href=\"StudentprofileUpdate.jsp\">Profile Update</a> \n");
      out.write("  <a href=\"StudentprofilePassword.jsp\">Change Password</a> \n");
      out.write("  <a href=\"https://davv.mponline.gov.in/portal/Services/DAVV/UTD_APP/semfee/semfeesubmission.aspx\">Fees</a>  \n");
      out.write("  <a href=\"StudentprofileSyllbus.jsp\">Syllbus</a>\n");
      out.write("  <a href=\"Studentprofileskill.jsp\">Online Skill Test</a>  \n");
      out.write("  <a href=\"StudentprofileTimetable.jsp\">Lab Manual</a>  \n");
      out.write("</div> \n");
      out.write("             ");

                         String username =(String)session.getAttribute("username");
            if(username==null || username.trim()=="")
            {
                 response.sendRedirect("../Login.html");
            }
              
      out.write("\n");
      out.write("                \n");
      out.write("               <div class=\"main-content-area\" id=\"main-content-area\">\n");
      out.write("                <div class=\"content-left padding-border\">\n");
      out.write("              <h2>Change Your PassWord</h2>\n");
      out.write("          <form method=\"post\" action=\"../StudentChangePass\">    \n");
      out.write("          <div class=\"form-group\">     \n");
      out.write("        <label>Create Password</label>\n");
      out.write("        <input type=\"password\" name=\"Pass1\"  placeholder=\"Enter Password\" >\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label>Re Enter Password</label>\n");
      out.write("        <input type=\"password\" name=\"Pass2\"   placeholder=\"Re-Enter Password\">\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div class=\"form-group submit-btn\">\n");
      out.write("        <input type=\"submit\" value=\"Submit\">\n");
      out.write("      </div>\n");
      out.write("    </form> \n");
      out.write("     \n");
      out.write("                    \n");
      out.write("                </div></div>\n");
      out.write("        <div id=\"footer\"></div>\n");
      out.write("          <script>\n");
      out.write("        const urlParams = new URLSearchParams(window.location.search);\n");
      out.write("        const message = urlParams.get('message');\n");
      out.write("        if (message=='yes') {\n");
      out.write("           Swal.fire({\n");
      out.write("              title: \"Update!\",\n");
      out.write("              text: \"You Password is Update!\",\n");
      out.write("              icon: \"success\"\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("         else if(message=='no')\n");
      out.write("        {\n");
      out.write("            Swal.fire({\n");
      out.write("                icon: \"error\",\n");
      out.write("                title: \"Oops...\",\n");
      out.write("                text: \"Something went wrong!\"\n");
      out.write("              });\n");
      out.write("        }\n");
      out.write("        else if(message=='notmatch'){\n");
      out.write("            Swal.fire({\n");
      out.write("                icon: \"error\",\n");
      out.write("                title: \"Oops...\",\n");
      out.write("                text: \"Password not match..!\"\n");
      out.write("              });\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
