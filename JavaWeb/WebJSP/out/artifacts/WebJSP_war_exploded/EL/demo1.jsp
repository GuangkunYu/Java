<%--
  Created by IntelliJ IDEA.
  User: LDYGK
  Date: 2020/11/16
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL获取数据</title>
</head>
<body>
<h1>EL获取数据</h1>
<%
    pageContext.setAttribute("name", "张三");
    request.setAttribute("name", "李四");
    session.setAttribute("name", "王五");
    application.setAttribute("name", "赵六");
%>

<%= pageContext.getAttribute("name") %>   ---->    ${ pageScope.name } <br>
<%= request.getAttribute("name") %>   ---->    ${ requestScope.name } <br>
<%= session.getAttribute("name") %>   ---->    ${ sessionScope.name } <br>
<%= application.getAttribute("name") %>   ---->    ${ applicationScope.name } <br>

<h3>EL简写</h3>
${ name }
</body>
</html>
