<%--
  Created by IntelliJ IDEA.
  User: LDYGK
  Date: 2020/11/11
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>hello JSP...</h1>
<!--
    声明标签：
        写在下面这个脚本中的代码，翻译成servlet内部的成员变量或成员方法
-->
<%!
    // 申明变量
    int i = 3;
%>

<!--
    表达式标签：
       写在这个脚本中的代码，翻译成方法内部的out.print()中的内容
-->
<%= i%>

<!--
    程序代码
        写在下面这个脚本中的代码，翻译成方法内部的局部变量或方法内部代码片段
-->
<%
    // 程序代码
    int x = 5;
%>
<%= x %>

</body>
</html>
