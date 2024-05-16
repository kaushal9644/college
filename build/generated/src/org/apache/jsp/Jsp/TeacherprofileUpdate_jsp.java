package org.apache.jsp.Jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.String;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import db.DB;

public final class TeacherprofileUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Faculty Profile update</title>\n");
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
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/admin.css\">\n");
      out.write(" \n");
      out.write("    <script>\n");
      out.write("            $(function(){\n");
      out.write("            $(\"#header\").load(\"header.html\"); \n");
      out.write("            $(\"#footer\").load(\"footer.html\"); });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div id=\"loader\" class=\"loader\"></div>\n");
      out.write("          <div id=\"header\"></div>\n");
      out.write("         <div class=\"navbar\">  \n");
      out.write("    <a href=\"TeacherProfile.jsp\">Peofile</a> \n");
      out.write("    <a href=\"TeacherprofileUpdate.jsp\">Update Profile</a> \n");
      out.write("        <a href=\"TeacherPass.jsp\">Change Password</a> \n");
      out.write("\n");
      out.write("</div> \n");
      out.write("           <div class=\"main-content-area\" id=\"main-content-area\">\n");
      out.write("                <div class=\"content-left padding-border\">\n");
      out.write("        \n");
      out.write("           \n");
      out.write("                     ");

                            String username =(String)session.getAttribute("username");
            if(username==null || username.trim()=="")
            {
                 response.sendRedirect("../Login.html");
            }
           String tid =username;
           String name=null;
           String fname = null;
           String salary=null;
           String post=null;
           String subject=null;
           Connection con =DB.getConnection();
          
           try{
               
           String q="select tname,tfname,salary,post,subject  from teacher where tid='"+tid+"'";
           PreparedStatement ps =con.prepareStatement(q);
           ResultSet rs =ps.executeQuery();
           if(rs.next())
            {
                name=rs.getString("tname");
                fname=rs.getString("tfname");
                salary=rs.getString("salary");
                post=rs.getString("post");
                subject=rs.getString("subject");
            }
            
           }catch(Exception e )
           {
              System.out.print(e);
           }
       
      out.write("\n");
      out.write("      <form action=\"../TeacherUpdate\" method=\"post\">\n");
      out.write("      <h1>Update Your Profile </h1>\n");
      out.write("     \n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label>Faculty ID</label>\n");
      out.write("        <input type=\"text\" name=\"tid\" value=\"");
      out.print(tid);
      out.write("\" readonly>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label>Faculty Full Name</label>\n");
      out.write("        <input type=\"text\" name=\"tname\" value=\"");
      out.print(name);
      out.write("\" readonly>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group \">\n");
      out.write("        <label>Faculty Father's Name</label>\n");
      out.write("        <input type=\"text\" name=\"tfname\" value=\"");
      out.print(fname);
      out.write("\" readonly>\n");
      out.write("      </div>\n");
      out.write("       <div class=\"form-group \">\n");
      out.write("        <label>Gender</label>\n");
      out.write("        <select name=\"gender\" required>\n");
      out.write("          <option value=\"\" selected disabled>Select your gender</option>\n");
      out.write("          <option value=\"M\">Male</option>\n");
      out.write("          <option value=\"F\">Female</option>\n");
      out.write("          <option value=\"T\">Other</option>\n");
      out.write("        </select>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group \">\n");
      out.write("        <label for=\"date\">Birth Date</label>\n");
      out.write("        <input type=\"date\" name=\"dob\" placeholder=\"Select dob\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group \">\n");
      out.write("        <label>Post</label>\n");
      out.write("       <input type=\"text\" name=\"post\" value=\"");
      out.print(post);
      out.write("\" readonly>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group \">\n");
      out.write("        <label>Subject</label>\n");
      out.write("       <input type=\"text\" name=\"subject\" value=\"");
      out.print(subject);
      out.write("\" readonly>\n");
      out.write("      </div>\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("        <label>Mobile Number</label>\n");
      out.write("        <input type=\"text\" name=\"mobilenumber\" placeholder=\"Enter Mobile Number\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label>Email Address</label>\n");
      out.write("        <input type=\"text\" name=\"email\" placeholder=\"Enter email address\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group \">\n");
      out.write("        <label>Enter State</label>\n");
      out.write("        <select name=\"state\" required>\n");
      out.write("                        <option value=\"\" selected disabled>Select State</option>\n");
      out.write("                        <option value=\"AN\">Andaman and Nicobar Islands</option>\n");
      out.write("                        <option value=\"AP\">Andhra Pradesh</option>\n");
      out.write("                        <option value=\"AR\">Arunachal Pradesh</option>\n");
      out.write("                        <option value=\"AS\">Assam</option>\n");
      out.write("                        <option value=\"BR\">Bihar</option>\n");
      out.write("                        <option value=\"CH\">Chandigarh</option>\n");
      out.write("                        <option value=\"CT\">Chhattisgarh</option>\n");
      out.write("                        <option value=\"DN\">Dadra and Nagar Haveli</option>\n");
      out.write("                        <option value=\"DD\">Daman and Diu</option>\n");
      out.write("                        <option value=\"DL\">Delhi</option>\n");
      out.write("                        <option value=\"GA\">Goa</option>\n");
      out.write("                        <option value=\"GJ\">Gujarat</option>\n");
      out.write("                        <option value=\"HR\">Haryana</option>\n");
      out.write("                        <option value=\"HP\">Himachal Pradesh</option>\n");
      out.write("                        <option value=\"JK\">Jammu and Kashmir</option>\n");
      out.write("                        <option value=\"JH\">Jharkhand</option>\n");
      out.write("                        <option value=\"KA\">Karnataka</option>\n");
      out.write("                        <option value=\"KL\">Kerala</option>\n");
      out.write("                        <option value=\"LA\">Ladakh</option>\n");
      out.write("                        <option value=\"LD\">Lakshadweep</option>\n");
      out.write("                        <option value=\"MP\">Madhya Pradesh</option>\n");
      out.write("                        <option value=\"MH\">Maharashtra</option>\n");
      out.write("                        <option value=\"MN\">Manipur</option>\n");
      out.write("                        <option value=\"ML\">Meghalaya</option>\n");
      out.write("                        <option value=\"MZ\">Mizoram</option>\n");
      out.write("                        <option value=\"NL\">Nagaland</option>\n");
      out.write("                        <option value=\"OR\">Odisha</option>\n");
      out.write("                        <option value=\"PY\">Puducherry</option>\n");
      out.write("                        <option value=\"PB\">Punjab</option>\n");
      out.write("                        <option value=\"RJ\">Rajasthan</option>\n");
      out.write("                        <option value=\"SK\">Sikkim</option>\n");
      out.write("                        <option value=\"TN\">Tamil Nadu</option>\n");
      out.write("                        <option value=\"TG\">Telangana</option>\n");
      out.write("                        <option value=\"TR\">Tripura</option>\n");
      out.write("                        <option value=\"UP\">Uttar Pradesh</option>\n");
      out.write("                        <option value=\"UT\">Uttarakhand</option>\n");
      out.write("                        <option value=\"WB\">West Bengal</option>\n");
      out.write("        </select>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label>City</label>\n");
      out.write("        <input type=\"text\" name=\"city\" placeholder=\"Enter City\"required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"email\">Address</label>\n");
      out.write("        <input type=\"text\" name=\"address\" placeholder=\"Enter Address\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label>Salary</label>\n");
      out.write("        <input type=\"text\" name=\"salary\" value=\"");
      out.print(salary);
      out.write("\" readonly>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group password\">\n");
      out.write("        <label>Password</label>\n");
      out.write("        <input type=\"password\" name=\"password\" placeholder=\"Create password\" required>\n");
      out.write("       \n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group submit-btn\">\n");
      out.write("        <input type=\"submit\" value=\"Submit\">\n");
      out.write("      </div>\n");
      out.write("    </form>\n");
      out.write("                </div></div>\n");
      out.write("        <div id=\"footer\"></div>\n");
      out.write("        <script>\n");
      out.write("        const urlParams = new URLSearchParams(window.location.search);\n");
      out.write("        const message = urlParams.get('message');\n");
      out.write("        if (message=='yes') {\n");
      out.write("           Swal.fire({\n");
      out.write("              title: \"Update!\",\n");
      out.write("              text: \"You Profile is Update!\",\n");
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
      out.write("        }</script>\n");
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
      out.write("\n");
      out.write("   \n");
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
