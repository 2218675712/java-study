<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/27
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //    设置请求参数编码utf-8
    request.setCharacterEncoding("utf-8");
    //    通过request请求的getParameter读取账户和密码
    String name = request.getParameter("name");
    String pwd = request.getParameter("pwd");


//    验证用户名密码是否正确,如果正确则页面重定向
    if (name.equals("admin") && pwd.equals("123456")) {
//        缺点重定向后丢失数据
//        response.sendRedirect("welcome.jsp");
//        解决方法,通过请求转发
        //    声明请求转发
        RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
        rd.forward(request, response);
    } else {
//        response.sendRedirect("index.jsp");
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }
%>
</body>
</html>
