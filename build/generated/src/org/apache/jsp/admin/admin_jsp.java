package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    \n");
      out.write("    <title>Starter Template for Bootstrap</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"../templates/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("    <link href=\"../templates/workaround.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"starter-template.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\n");
      out.write("    <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n");
      out.write("    <script src=\"../templates/template.js\"></script>\n");
      out.write("\n");
      out.write("  \n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a class=\"navbar-brand\" href=\"admin.jsp\">Admin Panel</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"collapse navbar-collapse\">\n");
      out.write("          <ul class=\"nav navbar-nav\">\n");
      out.write("            <li class=\"active\"><a href=\"admin.jsp\">Dashboard</a></li>\n");
      out.write("            <li><a href=\"articles.jsp\">Articles</a></li>\n");
      out.write("            <li><a href=\"comments.jsp\">Comments</a></li>\n");
      out.write("            <li><a  href=\"../index.jsp\">View Blog</a></li>\n");
      out.write("            <li><a  href=\"logout.jsp\">Log Out</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div><!--/.nav-collapse -->\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("            \n");
      out.write("        <h1 style=\"text-align:center\">Manage Your Dashboard</h1>\n");
      out.write("   <table class=\"table\">\n");
      out.write("  <thead class=\"thead-inverse\">\n");
      out.write("    <tr>\n");
      out.write("      <th>User Id</th>\n");
      out.write("      <th>Username</th>\n");
      out.write("      <th>Registration Date</th>\n");
      out.write("      <th>Delete User</th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">1</th>\n");
      out.write("      <td>Mark</td>\n");
      out.write("      <td>Otto</td>\n");
      out.write("      <td><button type=\"submit\" value=\"userid\" class=\"btn btn-primary\" style=\"border-radius: 8px;\"  >Delete</button></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">2</th>\n");
      out.write("      <td>Jacob</td>\n");
      out.write("      <td>Thornton</td>\n");
      out.write("      <td><button type=\"submit\" value=\"userid\" class=\"btn btn-primary\" style=\"border-radius: 8px;\"  >Delete</button></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">3</th>    \n");
      out.write("      <td>Larry</td>\n");
      out.write("      <td>the Bird</td>\n");
      out.write("      <td><button type=\"submit\" value=\"userid\" class=\"btn btn-primary\" style=\"border-radius: 8px;\"  >Delete</button></td>\n");
      out.write("    </tr>\n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("   \n");
      out.write("\n");
      out.write("    <script src=\"../templates/bootstrap.min.js\"></script>\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("    <script src=\"../stemplates/footerjs.js\"></script>\n");
      out.write("  </body>\n");
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
