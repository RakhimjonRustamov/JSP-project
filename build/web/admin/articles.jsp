<% if ((session.getAttribute("User_Id") == null) || (session.getAttribute("User_Id") == "")) {
        response.sendRedirect("../registration/login.jsp");
    }
%>
<%@page import="fido.database.dbConnect"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@ page import="java.lang.String"%>
<%@ page import="java.util.Locale"
         contentType="text/html; charset=UTF-8" %> 
   <%!
          private dbConnect db=new dbConnect();
          Statement stm=null;
          ResultSet rst=null;
          
   %>
   <% 
    
    Locale.setDefault(Locale.ENGLISH);
 %>

  <%
        
        Connection conn=db.initConnection();
        try{
        stm=conn.createStatement();
        String sql="select t.article_id, t.user_id, t.article_title, t.article_text, To_Char(t.creation_date)creation_date from hr_articles t";
        rst=stm.executeQuery(sql);
         } catch (Exception e) {
                    e.getMessage();
         }
       
    %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    
    <title>Starter Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="../templates/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../templates/workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="starter-template.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../templates/template.js"></script>

  
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="admin.jsp">Admin Panel</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li ><a href="admin.jsp">Dashboard</a></li>
            <li class="active"><a href="articles.jsp">Articles</a></li>
            <li><a href="comments.jsp">Comments</a></li>
            <li><a  href="../index.jsp">View Blog</a></li>
            <li><a  href="logout.jsp">Log Out</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>


    <div class="container">
            
        <h1 style="text-align:center">Manage Your Dashboard</h1>
   <table class="table">
  <thead class="thead-inverse">
    <tr>
      <th> Article Id </th>
      <th>Title</th>
      <th>User Id</th>
      <th>Creation Date</th>
      <th>Delete Article</th>
    </tr>
  </thead>
  <tbody>
      <%
       while (rst.next()) {
           
    %>
    <tr>
      <td><%= rst.getString("article_id")%></td>
      <td><%= rst.getString("article_title")%></td>
      <td><%= rst.getString("user_id")%></td>
        <td><%= rst.getString("creation_date")%></td>
  <form action="../operations/del_article.jsp" method="post"> <td><button type="submit" value="<%= rst.getString("article_id")%>" name="article_id" class="btn btn-primary" style="border-radius: 8px;"  >Delete</button></td> </form>
    </tr>
          <%
                      }

if(conn != null){conn.close();}
if(rst!=null){rst.close();}
%> 
      
    
  </tbody>
</table>
        
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
   

    <script src="../templates/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../stemplates/footerjs.js"></script>
  </body>
</html>
