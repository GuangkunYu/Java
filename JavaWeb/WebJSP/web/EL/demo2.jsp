<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: LDYGK
  Date: 2020/11/16
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL获取数据</title>
</head>
<body>
<h3>EL获取数组的数据</h3>
<%
    String[] arrs = {"aa", "bb", "cc"};
    pageContext.setAttribute("arrs", arrs);
%>

${ arrs[0] }
${ arrs[1] }
${ arrs[2] }

<h3>EL获取List集合数据</h3>
<%
    List<String> list = new ArrayList<>();
    list.add("11");
    list.add("22");
    list.add("33");
    list.add("44");
    pageContext.setAttribute("list", list);
%>

${ list[0] }
${ list[1] }
${ list[2] }
${ list[3] }

<h3>EL获取Map集合数据</h3>
<%
    Map<String, Integer> map = new HashMap<>();
    map.put("aaa", 111);
    map.put("bbb", 222);
    map.put("ccc", 333);
    pageContext.setAttribute("map", map);
%>

${ map.aaa }
${ map.bbb }
${ map.ccc }
</body>
</html>
