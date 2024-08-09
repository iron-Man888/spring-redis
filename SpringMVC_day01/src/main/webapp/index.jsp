<%--
  Created by IntelliJ IDEA.
  User: dunan
  Date: 2024/6/18
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3><a href="/hello">hello</a></h3>
<h3><a href="/account/findUser">findUser</a></h3>
<h3><a href="/account/findUser1">findUser1</a></h3>
<h3><a href="/account/findUser2">findUser2</a></h3>
<h3><a href="/account/findUser4?name=张三">findUser4</a></h3>
<h3><a href="/account/findUser5?name=张三&age=13">findUser5</a></h3>
<form action="/account/findUser6" method="post">
    账户名称：<input type="text" name="name"><br>
    账户金额：<input type="text" name="money"><br>
    账户省份：<input type="text" name="address.provinceName"><br>
    账户城市：<input type="text" name="address.cityName"><br>
    <input type="submit" value=" 保  存 "><br>
</form>
<h3><a href="/account/findUser7/tiedanzhang/13">findUser5</a></h3>
<form action="/account/findUser8" method="post">
    账户名称：<input type="text" name="name"><br>
    账户金额：<input type="text" name="money"><br>
    账户省份：<input type="text" name="address.provinceName"><br>
    账户城市：<input type="text" name="address.cityName"><br>
    账户城市：<input type="text" name="date"><br>
    <input type="submit" value=" 保  存 "><br>
</form>
<input type="button" value=" 测试ajax请求json和响应json1 " id="testJson1"><br>
<input type="button" value=" 测试ajax请求json和响应json2 " id="testJson2"><br>
<input type="button" value=" 测试ajax请求json和响应json3 " id="testJson3"><br>
<h3><a href="/account/findUser9?name=张三&age=13">servlet API接收参数</a></h3>
<h3><a href="/account/findUser10">ModelAndView数据传递</a></h3>
<h3><a href="/account/findUser11">Model数据传递</a></h3>
<h3><a href="/account/findUser12">servlet API数据传递</a></h3>




</body>
<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
<script type="text/javascript">
    $(function () {
        $("#testJson1").click(function () {
            $.ajax({
                type: "post",
                url: "/account/saveAccount1",
                contentType: "application/json;charset=UTF-8",
                data: '{"id":1,"name":"张铁柱","money":999.0}',
                success: function (data) {
                    if (data.status == 200) {
                        alert(data.msg.name);
                        alert(data.msg.money);
                    }
                }
            })
        });

        $("#testJson2").click(function () {
            $.ajax({
                type: "post",
                url: "/account/saveAccount2",
                contentType: "application/json;charset=UTF-8",
                data: '{"name":"威武大将军","age":2}',
                success: function (data) {
                    if (data.status == 200) {
                        alert(data.msg.name);
                        alert(data.status);
                    }
                }
            })
        });

        $("#testJson3").click(function () {
            $.ajax({
                type: "post",
                url: "/account/saveAccount3",
                contentType: "application/json;charset=UTF-8",
                data: '{"ww":"我靠","cc":250,"nn":"乱来"}',
                success: function (data) {
                    alert(data.wokao);
                    alert(data.smn);
                }
            })
        });


    })
</script>
</html>
