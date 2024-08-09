<%--
  Created by IntelliJ IDEA.
  User: dunan
  Date: 2024/6/21
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>欢迎登录</h2>
<form action="/user/login" method="post">
  账号：<input type="text" name="username"><br>
  密码：<input type="text" name="password"><br>
  <input type="submit" value=" 登   录 ">
</form>
没有账户？点击这里<a href="/user/toRegister">注册</a>

</body>
</html>
