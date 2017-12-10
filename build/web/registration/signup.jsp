
<%@page import="java.sql.Connection"%>
<%@ page import="java.lang.String"%>
<%@ page import="java.util.Locale"%>
<%@ page import="java.sql.*"%>
<%@ page import="fido.database.dbConnect"%>
<%@page contentType="text/html; charset=UTF-8"%>
<%
  Locale.setDefault(Locale.ENGLISH);
%>
<%!
private dbConnect db=new dbConnect();
ResultSet rst=null;
CallableStatement cs=null;
Connection conn=null; 
%>


<%
    try{
    Connection conn=db.initConnection();
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
    finally{
    if(conn!=null){conn.close();}
    if(cs!=null){cs.close();}
    }
%>


