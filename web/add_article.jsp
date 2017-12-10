
<%
    if ((session.getAttribute("User_Id") == null) || (session.getAttribute("User_Id") == "")) {
        response.sendRedirect("registration/login.jsp");
    }
%>
<%@page contentType="text/html; charset=UTF-8"%>

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

    <title>Starter Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="templates/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="templates/workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="starter-template.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="templates/template.js"></script>

  
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top navbar-collapse">
      <div class="container">
        <div class="navbar-header">
            <h1 style="text-align:center; color: white;">Add New Article </h1>
        </div>
      </div>
    </nav>

    <div class="container">
        
        <form action="operations/insert_article.jsp" method="post"> 
 <div class="form-group">
    <label for="articletitile">Article Titile</label>
    <input type="text" class="form-control" id="articletitle" name="title" placeholder="Enter Title">
  </div>
    
  <div class="form-group">
    <label for="exampleTextarea">Example textarea</label>
    <textarea class="form-control" name="text" id="exampleTextarea" rows="6"></textarea>
  </div>
  </div>
  <button style="margin-left:30px; width:100px; " type="submit" class="btn btn-primary">Submit</button>
</form>
   
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
   

    <script src="templates/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="templates/footerjs.js"></script>
  </body>
</html>
