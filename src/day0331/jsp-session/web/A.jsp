<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/31
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //同一个服务端有效
%>

<%=session.getAttribute("uname")%>
<%
    Cookie cookie[] = request.getCookies();
    for (Cookie cookie1 : cookie) {
        //验证SessionID和JSESSIONID相等
        if (cookie1.getName().equals("JSESSIONID"))
            System.out.println("JSESSIONID" + cookie1.getValue());
    }
%>
</body>
</html>