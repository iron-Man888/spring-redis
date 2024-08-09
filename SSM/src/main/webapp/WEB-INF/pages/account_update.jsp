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
<body>
<h3>修改账户</h3>

<%--<c:forEach items="${accountList}" var="account">--%>
    <form action="/account/updateAccount" method="post" enctype="multipart/form-data">
        <input type="hidden" name="id" value="${account.id}" ><br>
        更改账户：<input type="text" name="name" value="${account.name}"><br>
        <br>
        更改金额：<input type="text" name="money" value="${account.money}"><br>
        <br>
        更改头像头像<input type="file" name="uploadFile"><br>
        <img src="/img/${account.head}" width="100px" ><br>
        <br>
        日期：<input type="text" name="date"
                    value="<fmt:formatDate value='${account.date}'
                    pattern='yyyy-MM-dd'></fmt:formatDate> ">
        <br>
        <input type="submit" value=" 提  交 ">
    </form>
<%--</c:forEach>--%>
</body>
</html>