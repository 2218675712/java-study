<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>校验页面</title>
</head>
<body>
<%
    //设置编码方式
    request.setCharacterEncoding("utf-8");
    //获得登录的用户名和密码
    String name = request.getParameter("uname");
    String password = request.getParameter("upwd");
    //校验是否登录成功
    if (name.equals("zz") && password.equals("1111")) {
        //如果登录成功，开始建立session（Session一般在用户登录成功时创建）
        session.setAttribute("uname", name);//建立session
        session.setAttribute("upwd", password);
        //获得sessionID，并将session在控制台输出
        System.out.println("sessionID" + session.getId());
        //设置session有效时间
        //session.setMaxInactiveInterval(10);
        //这里不用创建Cookie，服务端内部会自己创建JSessionID
        //Cookie cookie=new Cookie("uname",name);

        //response.addCookie(cookie);
        request.getRequestDispatcher("welcome.jsp").forward(request, response);
    } else {
        response.sendRedirect("login.jsp");
    }
%>
</body>
</html>