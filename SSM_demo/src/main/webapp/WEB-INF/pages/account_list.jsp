<%--
  Created by IntelliJ IDEA.
  User: dunan
  Date: 2024/6/22
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<html>
<head>
    <title>Title</title>
</head>
<body style="text-align: center">
<h2>账户列表</h2>
<h3><a href="/account/toAddAccount">新增账户</a></h3>
<table width="60%" border="1" cellspacing="0" cellpadding="0" style="margin: 0 auto; text-align: center">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>money</th>
        <th>头像</th>
        <th>开户日期</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${accountList}" var="account">
        <tr>
            <td>${account.id}</td>
            <td>${account.name}</td>
            <td>${account.money}</td>
            <td><img src="SSM_demo_war/static/img/${account.head}" width="60px"></td>
            <td><fmt:formatDate value="${account.date}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
            <td>
                <a href="toUpdateAccount/${account.id}">修改</a>
                <a href="deleteAccount/${account.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
