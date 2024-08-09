<%--
  Created by IntelliJ IDEA.
  User: dunan
  Date: 2024/6/20
  Time: 11:40
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
<h2>查询所有账户</h2>
<form action="/account/fuzzyAccount" method="post">
    name:<input type="text" name="name">
    money:<input type="text" name="minMoney">-<input type="text" name="maxMoney">
    <input type="submit" value="查询">
</form>
<h4><a href="/account/toInsertAccount">新增</a></h4>
<table width="70%" border="1" cellspacing="0" cellpadding="0" style="margin: 0 auto">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>money</th>
        <th>头像</th>
        <th>日期</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${accountList}" var="account">
        <tr>
            <td>${account.id}</td>
            <td>${account.name}</td>
            <td>${account.money}</td>
            <td><img src="/img/${account.head}" width="80px"></td>
            <td><fmt:formatDate value="${account.date}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
            <td><a href="/account/toUpdateAccount/${account.id}">修改</a>
            <a href="/account/deleteAccount/${account.id}">删除</a></td>
        </tr>
    </c:forEach>
</table>
欢迎<font color="#ff1493" size="40px">${sessionScope.user.username}</font>登录
点击这里<a href="/user/logout">退出</a>
</body>
</html>