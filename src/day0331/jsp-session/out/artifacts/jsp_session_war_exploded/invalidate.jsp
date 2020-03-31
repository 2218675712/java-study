<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/31
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.invalidate();//session失效
    response.sendRedirect("login.jsp");
    //session.removeAttribute("uname");//部分失效
%>
</body>
</html>