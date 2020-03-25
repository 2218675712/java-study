<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/25
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%--$END$
&lt;%&ndash;  小脚本&ndash;%&gt;
<%
    int num = 10;
%>
&lt;%&ndash;表达式&ndash;%&gt;
<%=num%>
&lt;%&ndash;声明&ndash;%&gt;
<%!
    int sum(int num1, int num2) {
        return num1 + num2;
    }
%>
<%=sum(10, 20)%>
<!--客户端可以查看到-->
&lt;%&ndash;客户端无法看到&ndash;%&gt;--%>

<%!
    int countLeapyear(int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                count++;
            }
        }
        return count;
    }
%>
<p>从2000-2013年共有<%=countLeapyear(2000, 2013)%>个闰年</p>
</body>
</html>
