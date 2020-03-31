<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/31
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
欢迎您：
<%
    String name = (String) session.getAttribute("uname");
    if (name == null) {
        response.sendRedirect("login.jsp");
    } else {
        out.println(name);
    }
%>
<a href="invalidate.jsp">注销</a>
</body>
</html>