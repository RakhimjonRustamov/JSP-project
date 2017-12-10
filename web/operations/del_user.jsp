
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
<%@ page import="java.util.Locale"
         contentType="text/html; charset=UTF-8" %> 
   <%!
            private dbConnect db=new dbConnect();
            Connection conn=null;  
            CallableStatement cs=null;
   %>
   <% 
    
    Locale.setDefault(Locale.ENGLISH);
 %>

  <%
        Connection conn=db.initConnection();
        out.println("here");
    
        int in_user=Integer.parseInt(request.getParameter("user_id"));
        try{
        String sql="{call Delete_User(?)}";
        CallableStatement cs = conn.prepareCall(sql);
         cs.setInt(1, in_user);
         boolean b=cs.execute();
        if(b==false){
        response.sendRedirect("../admin/admin.jsp"); 
         }
         
         } catch (Exception e) {
                    e.getMessage();
         }
        finally{
        if(conn!=null){conn.close();
        
        }
        }
    %>