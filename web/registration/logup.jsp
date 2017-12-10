<%@page contentType="text/html; charset=UTF-8"%>
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
      <h2>Registration</h2>
    <form class="login-form" action="signup.jsp" method="post">
      <input type="text" name="user_name" placeholder="username"/>
      <input type="password" name="user_password" placeholder="password"/>
      <div class="row">
      <button type="submit" >Sign Up</button>    
      <a href="login.jsp"><h4>Already Registered</h4></a>
      </div>
    </form>
     
      
  </div>
</div>
        </div>
    </body>
</html>
