
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
            Statement stm=null;
            Connection conn=null;   
            ResultSet rst=null;
   %>
   <% 
    
    Locale.setDefault(Locale.ENGLISH);
 %>

  <%
        
        Connection conn=db.initConnection();
        String comment_id=request.getParameter("comment_id");
        
        try{
            
        stm=conn.createStatement();
        String sql="Delete from hr_comments where comment_id="+comment_id;
        rst=stm.executeQuery(sql);
            if(rst!=null){
            response.sendRedirect("../admin/comments.jsp");  
            }
       
         } catch (Exception e) {
                    e.getMessage();
         }
        finally{
        if(conn!=null){conn.close();
        if(rst!=null){rst.close();}
        }
        
        }
       
    %>