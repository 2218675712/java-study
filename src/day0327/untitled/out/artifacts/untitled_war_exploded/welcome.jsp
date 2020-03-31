<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/27
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //    设置请求参数编码utf - 8
    request.setCharacterEncoding("utf-8");
//    通过request请求的getParameter读取用户名
    String name = request.getParameter("name");
//
    out.println("欢迎" + name + "用户登录");
%>

</body>
</html>
