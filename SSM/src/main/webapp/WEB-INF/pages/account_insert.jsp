<%--
  Created by IntelliJ IDEA.
  User: dunan
  Date: 2024/6/20
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="text-align: center">
<h2>新增账户</h2>
<form action="/account/insertAccount" method="post" enctype="multipart/form-data">
    账户：<input type="text" name="name"><br>
    金额：<input type="text" name="money"><br>
    头像<input type="file" name="uploadFile">
    日期：<input type="text" name="date"><br>
    <input type="submit" value="提交">
</form>

</body>
</html>