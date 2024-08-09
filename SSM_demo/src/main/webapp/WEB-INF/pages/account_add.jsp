<%--
  Created by IntelliJ IDEA.
  User: dunan
  Date: 2024/6/22
  Time: 15:25
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
<h2>新增账户</h2>
<div style="text-align: center; margin: 0 auto; ">
    <form action="/account/addAccount" method="post" enctype="multipart/form-data">
        请输入姓名：<input type="text" name="name"><br>
        请输入金额：<input type="text" name="money"><br>
        请输入日期：<input type="text" name="date"><br>
        请上传头像：<input type="file" name="uploadFile"><br>
        <input type="submit" value="提交">
    </form>


</div>
</body>
</html>
