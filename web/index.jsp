    <% if ((session.getAttribute("User_Id") == null) || (session.getAttribute("User_Id") == "")) {
        response.sendRedirect("registration/login.jsp");
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
        String sql="select article_id, article_text, article_title, creation_date from hr_articles";
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
    <link rel="icon" href="../../favicon.ico">

    <title>Articles</title>

    <!-- Bootstrap core CSS -->
    <link href="templates/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="templates/workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="templates/template.css" rel="stylesheet">
    <script src="templates/template.js"></script>
  </head>

  <body>

    <div class="container">

    
      <div class="masthead">
          <a href="registration/logout.jsp"><h3 class="text-muted">Logout</h3></a>
        <nav>
          <ul class="nav nav-justified">
            <li><a href="index.jsp"></a></li>
            <li><a href="index.jsp"></a></li>
            <li><a href="index.jsp"></a></li>
            <li><a href="index.jsp"></a></li>
            <li><a href="index.jsp"></a></li>
          </ul>
        </nav>
      </div>

      <!-- Jumbotron -->
      <div class="jumbotron">
        <h1>The Latest News!</h1>
        <p class="lead">Feel free to read the latest new about life of famous people here!</p>
        <p><a class="btn btn-lg btn-success" href="add_article.jsp" role="button">Add News </a></p>
      </div>

      
                        
      <!-- Example row of columns -->
      <div class="row">
                      <%
                            String article_id;
                            while (rst.next()) {
                            article_id = rst.getString(1);
                        %>
             <div class="col-lg-4">
          <h2><%=rst.getString("article_title")%></h2>
          <p><%= rst.getString("article_text")%> </p>
          <label>Creation Date</label> <p><%=rst.getString("creation_date")%> </p>
          <p><a class="btn btn-primary" href="article_info.jsp?article_id=<%=article_id%>" role="button">View details &raquo;</a></p>
             </div>
                      <%
                      }

if(conn != null){conn.close();}
if(rst!=null){rst.close();}
%> 
      
                 
                      
      </div>
      <!-- Site footer -->
      <footer class="footer">
        <p>&copy; <%= new java.util.Date()%>.</p>
      </footer>

    </div> <!-- /container -->
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="templates/footer.js"></script>
  </body>
</html>
