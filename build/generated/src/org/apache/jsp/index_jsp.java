package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import fido.database.dbConnect;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.lang.String;
import java.util.Locale;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


          private dbConnect db=new dbConnect();
          Statement stm=null;
          ResultSet rst=null;
          
   
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("    ");
 if ((session.getAttribute("User_Id") == null) || (session.getAttribute("User_Id") == "")) {
        response.sendRedirect("registration/login.jsp");
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("   ");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
 
    
    Locale.setDefault(Locale.ENGLISH);
 
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("    ");

        
        Connection conn=db.initConnection();
        try{
        stm=conn.createStatement();
        String sql="select article_id, article_text, article_title, creation_date from hr_articles";
        rst=stm.executeQuery(sql);
         } catch (Exception e) {
                    e.getMessage();
         }
       
    
      out.write("\n");
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
      out.write("    <title>Articles</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"templates/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("    <link href=\"templates/workaround.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"templates/template.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"templates/template.js\"></script>\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("      <div class=\"masthead\">\n");
      out.write("          <a href=\"registration/logout.jsp\"><h3 class=\"text-muted\">Logout</h3></a>\n");
      out.write("        <nav>\n");
      out.write("          <ul class=\"nav nav-justified\">\n");
      out.write("            <li><a href=\"index.jsp\"></a></li>\n");
      out.write("            <li><a href=\"index.jsp\"></a></li>\n");
      out.write("            <li><a href=\"index.jsp\"></a></li>\n");
      out.write("            <li><a href=\"index.jsp\"></a></li>\n");
      out.write("            <li><a href=\"index.jsp\"></a></li>\n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!-- Jumbotron -->\n");
      out.write("      <div class=\"jumbotron\">\n");
      out.write("        <h1>The Latest News!</h1>\n");
      out.write("        <p class=\"lead\">Feel free to read the latest new about life of famous people here!</p>\n");
      out.write("        <p><a class=\"btn btn-lg btn-success\" href=\"add_article.jsp\" role=\"button\">Add News </a></p>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      \n");
      out.write("                        \n");
      out.write("      <!-- Example row of columns -->\n");
      out.write("      <div class=\"row\">\n");
      out.write("                      ");

                            String article_id;
                            while (rst.next()) {
                            article_id = rst.getString(1);
                        
      out.write("\n");
      out.write("             <div class=\"col-lg-4\">\n");
      out.write("          <h2>");
      out.print(rst.getString("article_title"));
      out.write("</h2>\n");
      out.write("          <p>");
      out.print( rst.getString("article_text"));
      out.write(" </p>\n");
      out.write("          <label>Creation Date</label> <p>");
      out.print(rst.getString("creation_date"));
      out.write(" </p>\n");
      out.write("          <p><a class=\"btn btn-primary\" href=\"article_info.jsp?article_id=");
      out.print(article_id);
      out.write("\" role=\"button\">View details &raquo;</a></p>\n");
      out.write("             </div>\n");
      out.write("                      ");

                      }

if(conn != null){conn.close();}
if(rst!=null){rst.close();}

      out.write(" \n");
      out.write("      \n");
      out.write("                 \n");
      out.write("                      \n");
      out.write("      </div>\n");
      out.write("      <!-- Site footer -->\n");
      out.write("      <footer class=\"footer\">\n");
      out.write("        <p>&copy; ");
      out.print( new java.util.Date());
      out.write(".</p>\n");
      out.write("      </footer>\n");
      out.write("\n");
      out.write("    </div> <!-- /container -->\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("    <script src=\"templates/footer.js\"></script>\n");
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
