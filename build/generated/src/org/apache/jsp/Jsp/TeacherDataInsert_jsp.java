package org.apache.jsp.Jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TeacherDataInsert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Teacher</title>\n");
      out.write("   \n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("  <style>\n");
      out.write("      @import url('https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;500;600;700&display=swap');\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  font-family: 'Open Sans', sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  display: flex;\n");
      out.write("  align-items: center;\n");
      out.write("  justify-content: center;\n");
      out.write("  padding: 0 10px;\n");
      out.write("  min-height: 100xh;\n");
      out.write("  background: #1BB295;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form {\n");
      out.write("  padding: 25px;\n");
      out.write("  background: #fff;\n");
      out.write("  max-width: 700px;\n");
      out.write("  width: 100%;\n");
      out.write("  border-radius: 7px;\n");
      out.write("  box-shadow: 0 10px 15px rgba(0, 0, 0, 0.05);\n");
      out.write("}\n");
      out.write("\n");
      out.write("form h2 {\n");
      out.write("  font-size: 27px;\n");
      out.write("  text-align: center;\n");
      out.write("  margin: 0px 0 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form .form-group {\n");
      out.write("  margin-bottom: 15px;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form label {\n");
      out.write("  display: block;\n");
      out.write("  font-size: 15px;\n");
      out.write("  margin-bottom: 7px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form input,\n");
      out.write("form select {\n");
      out.write("  height: 45px;\n");
      out.write("  padding: 10px;\n");
      out.write("  width: 100%;\n");
      out.write("  font-size: 15px;\n");
      out.write("  outline: none;\n");
      out.write("  background: #fff;\n");
      out.write("  border-radius: 3px;\n");
      out.write("  border: 1px solid #bfbfbf;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form input:focus,\n");
      out.write("form select:focus {\n");
      out.write("  border-color: #9a9a9a;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".submit-btn {\n");
      out.write("  margin-top: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".submit-btn input {\n");
      out.write("  color: white;\n");
      out.write("  border: none;\n");
      out.write("  height: auto;\n");
      out.write("  font-size: 16px;\n");
      out.write("  padding: 13px 0;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  font-weight: 500;\n");
      out.write("  text-align: center;\n");
      out.write("  background: #1BB295;\n");
      out.write("  transition: 0.2s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".submit-btn input:hover {\n");
      out.write("  background: #179b81;\n");
      out.write("}\n");
      out.write("\n");
      out.write("  </style>\n");
      out.write("  <body>\n");
      out.write("      <form action=\"TeacherDataInsert\" method=\"post\">\n");
      out.write("      <h2>Insert Data of Student</h2>\n");
      out.write("     \n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label>Teacher ID</label>\n");
      out.write("        <input type=\"text\" name=\"tid\" placeholder=\"Enter Teacher Id\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label>Teacher Full Name</label>\n");
      out.write("        <input type=\"text\" name=\"tname\" placeholder=\"Enter Full name\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group \">\n");
      out.write("        <label>Teacher Father's Name</label>\n");
      out.write("        <input type=\"text\" name=\"tfname\" placeholder=\"Enter Father's  name\" required>\n");
      out.write("      </div>\n");
      out.write("       <div class=\"form-group \">\n");
      out.write("        <label>Gender</label>\n");
      out.write("        <select name=\"gender\" required>\n");
      out.write("          <option value=\"\" selected disabled>Select your gender</option>\n");
      out.write("          <option value=\"Male\">Male</option>\n");
      out.write("          <option value=\"Female\">Female</option>\n");
      out.write("          <option value=\"Other\">Other</option>\n");
      out.write("        </select>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group \">\n");
      out.write("        <label for=\"date\">Birth Date</label>\n");
      out.write("        <input type=\"date\" name=\"dob\" placeholder=\"Select dob\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group \">\n");
      out.write("        <label>Post</label>\n");
      out.write("        <select name=\"post\" required>\n");
      out.write("          <option value=\"\" selected disabled>Select Post</option>\n");
      out.write("           <option value=\"senior lecturer\">Senior Lecturer</option>\n");
      out.write("            <option value=\"lecturer\">Lecturer</option>\n");
      out.write("            <option value=\"Other\">Other</option>\n");
      out.write("        </select>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group \">\n");
      out.write("        <label>Subject</label>\n");
      out.write("        <select name=\"subject\" required>\n");
      out.write("          <option value=\"\" selected disabled>Select Subject</option>\n");
      out.write("         <option value=\"OS\">Operating System</option>\n");
      out.write("          <option value=\"Java\">Java</option>\n");
      out.write("          <option value=\"DSA\">DSA</option>\n");
      out.write("          <option value=\"computer network\">Computer Network</option>\n");
      out.write("          <option value=\"Other\">Others</option>>\n");
      out.write("        </select>\n");
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
      out.write("                        <option value=\"\" selected disabled>Select your gender</option>\n");
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
      out.write("        <input type=\"text\" name=\"salary\" placeholder=\"Enter Salary\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group password\">\n");
      out.write("        <label>Password</label>\n");
      out.write("        <input type=\"password\" name=\"password\" placeholder=\"Create password\" required>\n");
      out.write("       \n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group submit-btn\">\n");
      out.write("        <input type=\"submit\" value=\"Submit\">\n");
      out.write("      </div>\n");
      out.write("    </form>   \n");
      out.write("  </body>\n");
      out.write("</html>");
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
