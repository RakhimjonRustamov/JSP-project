package org.apache.jsp.registration;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Types;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.lang.String;
import java.sql.Statement;
import fido.database.dbConnect;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    private dbConnect db = new dbConnect();
    ResultSet rst = null;
    CallableStatement cs = null;
    PreparedStatement pst = null;
    Connection conn = null;
    Statement stm = null;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

    try {
        conn = db.initConnection();
        String user_name = request.getParameter("user_name");
        String user_password = request.getParameter("user_password");

        String sql = "{call User_Login(?,?,?,?,?,?,?)}";
        cs = conn.prepareCall(sql);
        cs.setString(1, user_name);
        cs.setString(2, user_password);
        cs.registerOutParameter(3, java.sql.Types.VARCHAR);
        cs.registerOutParameter(4, java.sql.Types.VARCHAR);
        cs.registerOutParameter(5, java.sql.Types.INTEGER);
        cs.registerOutParameter(6, java.sql.Types.INTEGER);
        cs.registerOutParameter(7, java.sql.Types.VARCHAR);
        cs.executeUpdate();

// Result Values---
        String u_name = cs.getString(3);
        String u_pass = cs.getString(4);
        int user_id = cs.getInt(5);
        if (user_id == 1 && user_name.equals(u_name)) {
            session.setAttribute("User_Id", user_id);
            session.setAttribute("Username", user_name);
            response.sendRedirect("../admin/admin.jsp");
        } else if (user_id != 1 && user_name.equals(u_name) && user_password.equals(u_pass)) {
            session.setAttribute("User_Id", user_id);
            session.setAttribute("Username", user_name);
            response.sendRedirect("../index.jsp");
        } else {
            out.println("Login is Failed");
        }

    } catch (Exception e) {
        out.println("Error" + e.getMessage());

    } finally {
        if (conn != null) {
            conn.close();
        }
        if (cs != null) {
            cs.close();
        }
    }



      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
