<%@page import="java.sql.Types"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.CallableStatement"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.lang.String"%>
<%@ page import="java.sql.Statement"%>
<%@page import="fido.database.dbConnect"%>
<%@page contentType="text/html; charset=UTF-8"%>
<%!
    private dbConnect db = new dbConnect();
    ResultSet rst = null;
    CallableStatement cs = null;
    Connection conn = null;
    Statement stm = null;
%>
<%
    try {
        conn = db.initConnection();
        String user_name = request.getParameter("user_name");
        String user_password = request.getParameter("user_password");
        Integer errCode;
        String errMsg;

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
        
        errCode =cs.getInt(6);
        errMsg=cs.getString(7);
        

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


%>







