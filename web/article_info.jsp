


<%@page import="oracle.jdbc.OracleTypes"%>
<% if ((session.getAttribute("User_Id") == null) || (session.getAttribute("User_Id") == "")) {
        response.sendRedirect("registration/login.jsp");
    }
%>

<%@ page import="java.sql.*"%>
<%@ page import="java.lang.String"%>
<%@ page import="fido.database.dbConnect"
         contentType="text/html; charset=UTF-8"    %>


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
        <div class="container">

            <%!
                private dbConnect db = new dbConnect();
                String id = null;
                String uname = null;
                ResultSet rst = null;
                Connection conn = null;
                Statement stm = null;
                CallableStatement cs = null;
            %>

            <%
                id = request.getParameter("article_id");

                try {

                    conn = db.initConnection();
                    String sql = "select article_text, article_title from hr_articles where article_id=" + id;
                    stm = conn.createStatement();
                    rst = stm.executeQuery(sql);
                    

                    String join_sql = "{call Article_Info(?,?)}";
                    CallableStatement cs = conn.prepareCall(join_sql);
                    int in_article = Integer.parseInt(id);
                    cs.setInt(1, in_article);
                    cs.registerOutParameter(2, Types.VARCHAR);
                    cs.executeUpdate();
                    uname = cs.getString(2);
                    out.println("  Author of Article : " + uname);
                } catch (Exception e) {
                    out.println("Error" + e.getMessage());
                }

            %>

            <%                            
                while (rst.next()) {

            %>


            <div class="row">
                <div class="col-sm-12 col-md-12">
                    <div class="thumbnail">
                        <div class="caption">
                            <h3 style="text-align: center"> <%= rst.getString("article_title")%></h3>

                            <p><%= rst.getString("article_text")%></p> 

                            <%}%>     
                            <%
                                if (conn != null) {
                                    conn.close();
                                    rst.close();
                                }
                            %>




                        </div>
                    </div>
                </div>  

                <%!
                    private dbConnect db2 = new dbConnect();
                    Connection conn2 = null;
                    String article_com = null;
                    Statement stm2 = null;
                    ResultSet rst2 = null;

                %>
                <%
                    try {
                        conn2 = db2.initConnection();
                        article_com = request.getParameter("article_id");
                        int in_com_article = Integer.parseInt(article_com);

                        String comment_sql = "select t.comment_text, To_Char(t.creation_date, 'dd.mm.yyyy')creation_date, h.user_name from hr_comments t INNER JOIN hr_users h ON h.user_id=t.user_id AND t.article_id=" + article_com;
                        stm2 = conn2.createStatement();
                        rst2 = stm2.executeQuery(comment_sql);

                    } catch (Exception e) {
                        out.println("Error " + e.getMessage());
                    }


                %>

                <% while (rst2.next()) {%>

                <link rel="stylesheet" type="text/css" href="templates/comment.css">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-12 col-md-12">
                            <div class="panel panel-white post panel-shadow">
                                <div class="post-heading">
                                    <div class="pull-left image">
                                        <img src="templates/images/user_1.jpg" class="img-circle avatar" alt="user profile image">
                                    </div>
                                    <div class="pull-left meta">
                                        <div class="title h5">
                                            <b><%= rst2.getString("user_name")%></b>
                                            made a post.
                                        </div>

                                        <h6 class="text-muted time"><%= rst2.getString("creation_date")%></h6>
                                    </div>
                                </div> 
                                <div class="post-description"> 
                                    <p><%= rst2.getString("comment_text")%></p>

                                </div>
                            </div>
                        </div>

                    </div>
                </div>                    <%
                    }
                    if (conn2 != null) {
                        conn2.close();
                    }
                    if (rst2 != null) {
                        rst2.close();
                    }
                %>


                <% String a_id = request.getParameter("article_id");%>
                <% // out.println(a_id);%>
                <form action="operations/insert_comment.jsp?article_id=<%=a_id%>" method="post"> 
                    <div class="form-group">
                        <label for="exampleTextarea">Leave your comments</label>
                        <textarea class="form-control" id="exampleTextarea" name="comment"  rows="6"></textarea>
                    </div>

            </div>
            <button style="margin-left:50px; width:100px; " type="submit" class="btn btn-primary">Submit</button>
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
