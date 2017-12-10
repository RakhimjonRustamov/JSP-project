
<%@page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->


<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="../templates/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="../templates/bootstrap-theme.min.css">
        <link rel="stylesheet" type="text/css" href="../templates/rest.css">
        <script src="../templates/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
        <div class="login-page">
  <div class="form">
      <h2>Welcome</h2>
    <form class="login-form" action="signin.jsp" method="post">
        <input type="text" name="user_name" placeholder="username" required="required"/>
      <input type="password" name="user_password" placeholder="password" required="required"/>
      <div class="row">
      <button type="submit" >Sign In</button>    
      <a href="logup.jsp"><h4>Not Registered</h4></a>
      </div>
    </form>
     
      
  </div>
</div>
        </div>
    </body>
</html>
