<%@page contentType="text/html; charset=UTF-8"%>

<%
session.setAttribute("User_Id", null);
session.invalidate();
response.sendRedirect("login.jsp");
%>