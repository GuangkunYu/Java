<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h1>登录页面</h1>
<%
    // 判断request域中是否有错误信息：（第一次没有）
    String msg="";
    if (request.getAttribute("msg") != null){
        // 有错误信息，需要显示
        msg = (String) request.getAttribute("msg");
    }

%>
<h3><font color="red"><%= msg %></font></h3>
<form action="/Login/LoginServlet" method="post">
    <table border="1" width="400">
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录"></td>
        </tr>
    </table>
</form>
</body>
</html>
