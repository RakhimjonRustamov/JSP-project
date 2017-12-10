<% if ((session.getAttribute("User_Id") == null) || (session.getAttribute("User_Id") == "")) {
        response.sendRedirect("registration/login.jsp");
    }
%>
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
 private dbConnect db=new dbConnect();   
 ResultSet rst=null;
 CallableStatement cs=null;
 Connection conn=null;
 Statement stm=null;
%>
<%
try{
    conn=db.initConnection();
String title =request.getParameter("title");
String text =request.getParameter("text");
Integer user_id = (Integer) session.getAttribute("User_Id");

String sql="{call Insert_Articles(?,?,?)}";  
 
CallableStatement cs = conn.prepareCall(sql);

 cs.setInt(1, user_id);
 cs.setString(2, title);
 cs.setString(3, text);


 boolean b=cs.execute();
     if(b==false){
        response.sendRedirect("../index.jsp"); 
     }
     else{
           response.sendRedirect("insert_article.jsp"); 
     }
 
}
catch(Exception e){
    
    out.println("Error" + e.getMessage());   
}
 finally{
 if(conn!=null){conn.close();}
 if(cs!=null){cs.close();}
}
   
%>

