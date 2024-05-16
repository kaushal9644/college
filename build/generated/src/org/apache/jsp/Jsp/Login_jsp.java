package org.apache.jsp.Jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("   <head>\n");
      out.write("      <meta charset=\"utf-8\">\n");
      out.write("      <title>Login Page</title>\n");
      out.write("     \n");
      out.write("      <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/loginpage.css\" />\n");
      out.write("\n");
      out.write("   </head>\n");
      out.write("   \n");
      out.write("   <body>\n");
      out.write("      \n");
      out.write("      <div class=\"wrapper\">\n");
      out.write("         <div class=\"title\">\n");
      out.write("            Login Form\n");
      out.write("         </div>\n");
      out.write("          <form action=\"LoginChecker\" method=\"post\">\n");
      out.write("            <div class=\"#\">\n");
      out.write("               <div class=\"radio-inputs\">\n");
      out.write("               <label class=\"radio\" required>\n");
      out.write("                   <input type=\"radio\" name=\"type\"  value=\"teacher\">\n");
      out.write("                 <span class=\"name\">Teacher</span>\n");
      out.write("               </label>\n");
      out.write("               <label class=\"radio\">\n");
      out.write("                 <input type=\"radio\" name=\"type\" value=\"student\">\n");
      out.write("                 <span class=\"name\">Student</span>\n");
      out.write("               </label>\n");
      out.write("             </div>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"field\">\n");
      out.write("               <input type=\"text\" required name=\"username\">\n");
      out.write("               <label>Username</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"field\">\n");
      out.write("               <input type=\"password\" required name=\"password\">\n");
      out.write("               <label>Password</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content\">\n");
      out.write("               <div class=\"checkbox\">\n");
      out.write("                  <input type=\"checkbox\" id=\"remember-me\">\n");
      out.write("                  <label for=\"remember-me\">Remember me</label>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"pass-link\">\n");
      out.write("                  <a href=\"#\">Forgot password?</a>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"field\">\n");
      out.write("               <input type=\"submit\" value=\"Login\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("         </form>\n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("        <script>\n");
      out.write("        const urlParams = new URLSearchParams(window.location.search);\n");
      out.write("        const message = urlParams.get('message');\n");
      out.write("        if (message) {\n");
      out.write("            Swal.fire({\n");
      out.write("                icon: \"error\",\n");
      out.write("                title: \"Oops...\",\n");
      out.write("                text: \"Something went wrong!\"\n");
      out.write("              });\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("   </body>\n");
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
