<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/27
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>$学员注册页面$</title>
</head>
<body>
<%
    //    设置请求参数编码utf-8
    request.setCharacterEncoding("utf-8");
    //    通过request请求的getParameter读取账户和密码
    String name = request.getParameter("name");
    String pwd = request.getParameter("pwd");
%>

<%--说明以post方式提交数据拽,提交到reginfo.jsp--%>
<form name="form1" method="post" action="reginfo.jsp">
    <table border="0" align="center">
        <tr>
            <td>用户名</td>
            <td><input type="text" name="name" value="<%=name%>"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="pwd" value="<%=pwd%>"></td>
        </tr>
        <tr>
            <td>信息来源</td>
            <td>
                <input type="checkbox" name="channel" value="报刊">报刊
                <input type="checkbox" name="channel" value="网络">网络
                <input type="checkbox" name="channel" value="朋友推荐"> 朋友推荐
                <input type="checkbox" name="channel" value="电视"> 电视
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" name="sub1" value="提交">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
