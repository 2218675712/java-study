<%@ page import="jndi.TestPageAccessURL" %>
<%@ page import="javax.naming.NamingException" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/3
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
$END$
<%
    TestPageAccessURL test = new TestPageAccessURL();
    try {
        test.testJNDI();
    } catch (NamingException | SQLException e) {
        e.printStackTrace();
    }finally {
        System.out.println("运行成功");
    }
%>
<p>运行成功</p>
</body>
</html>
