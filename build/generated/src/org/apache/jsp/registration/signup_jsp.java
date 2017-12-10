package org.apache.jsp.registration;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.lang.String;
import java.util.Locale;
import java.sql.*;
import fido.database.dbConnect;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


private dbConnect db=new dbConnect();
PreparedStatement pst= null;
ResultSet rst=null;
CallableStatement cs=null;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

  Locale.setDefault(Locale.ENGLISH);

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");

    try{
    Connection conn=db.initConnection();
    int updateQuery = 0;
String user_name=request.getParameter("user_name");
String user_password=request.getParameter("user_password");
     String sql="{call Insert_Users(?,?)}";
     CallableStatement cs = conn.prepareCall(sql);
     cs.setString(1, user_name);
     cs.setString(2, user_password);
     boolean b=cs.execute();
     if(b==false){
        response.sendRedirect("login.jsp"); 
     }
     else{
         out.println("Registration is Failed");
     }
    }
    catch(Exception e){
    out.println("Error "+ e.getMessage());
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
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
