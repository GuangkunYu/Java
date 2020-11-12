<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登录成功</h1>
<%
    Integer count = 0;
    if (this.getServletContext().getAttribute("count") != null){
        count = (Integer) this.getServletContext().getAttribute("count");
    }
%>
<h3>登录成功的总人数：<%= count%></h3>
</body>
</html>