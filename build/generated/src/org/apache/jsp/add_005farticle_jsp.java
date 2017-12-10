package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005farticle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"icon\" href=\"../../favicon.ico\">\n");
      out.write("\n");
      out.write("    <title>Starter Template for Bootstrap</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"templates/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("    <link href=\"templates/workaround.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"starter-template.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\n");
      out.write("    <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n");
      out.write("    <script src=\"templates/template.js\"></script>\n");
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
      out.write("            <h1 style=\"text-align:center; color: white;\">Add New Article </h1>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("<form>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputEmail1\">Email address</label>\n");
      out.write("    <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\">\n");
      out.write("    <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("    <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleSelect1\">Example select</label>\n");
      out.write("    <select class=\"form-control\" id=\"exampleSelect1\">\n");
      out.write("      <option>1</option>\n");
      out.write("      <option>2</option>\n");
      out.write("      <option>3</option>\n");
      out.write("      <option>4</option>\n");
      out.write("      <option>5</option>\n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleSelect2\">Example multiple select</label>\n");
      out.write("    <select multiple class=\"form-control\" id=\"exampleSelect2\">\n");
      out.write("      <option>1</option>\n");
      out.write("      <option>2</option>\n");
      out.write("      <option>3</option>\n");
      out.write("      <option>4</option>\n");
      out.write("      <option>5</option>\n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleTextarea\">Example textarea</label>\n");
      out.write("    <textarea class=\"form-control\" id=\"exampleTextarea\" rows=\"3\"></textarea>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputFile\">File input</label>\n");
      out.write("    <input type=\"file\" class=\"form-control-file\" id=\"exampleInputFile\" aria-describedby=\"fileHelp\">\n");
      out.write("    <small id=\"fileHelp\" class=\"form-text text-muted\">This is some placeholder block-level help text for the above input. It's a bit lighter and easily wraps to a new line.</small>\n");
      out.write("  </div>\n");
      out.write("  <fieldset class=\"form-group\">\n");
      out.write("    <legend>Radio buttons</legend>\n");
      out.write("    <div class=\"form-check\">\n");
      out.write("      <label class=\"form-check-label\">\n");
      out.write("        <input type=\"radio\" class=\"form-check-input\" name=\"optionsRadios\" id=\"optionsRadios1\" value=\"option1\" checked>\n");
      out.write("        Option one is this and that&mdash;be sure to include why it's great\n");
      out.write("      </label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-check\">\n");
      out.write("    <label class=\"form-check-label\">\n");
      out.write("        <input type=\"radio\" class=\"form-check-input\" name=\"optionsRadios\" id=\"optionsRadios2\" value=\"option2\">\n");
      out.write("        Option two can be something else and selecting it will deselect option one\n");
      out.write("      </label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-check disabled\">\n");
      out.write("    <label class=\"form-check-label\">\n");
      out.write("        <input type=\"radio\" class=\"form-check-input\" name=\"optionsRadios\" id=\"optionsRadios3\" value=\"option3\" disabled>\n");
      out.write("        Option three is disabled\n");
      out.write("      </label>\n");
      out.write("    </div>\n");
      out.write("  </fieldset>\n");
      out.write("  <div class=\"form-check\">\n");
      out.write("    <label class=\"form-check-label\">\n");
      out.write("      <input type=\"checkbox\" class=\"form-check-input\">\n");
      out.write("      Check me out\n");
      out.write("    </label>\n");
      out.write("  </div>\n");
      out.write("  <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("</form>\n");
      out.write("   \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("   \n");
      out.write("\n");
      out.write("    <script src=\"templates/bootstrap.min.js\"></script>\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("    <script src=\"templates/footerjs.js\"></script>\n");
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
