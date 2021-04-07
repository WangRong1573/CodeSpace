<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/7
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="some.do">测试springMVC处理请求</a>
<form action="reg.do" method="post">
    用户名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age"><br>
    <input type="submit" value="提交">
</form>
<br>
请求中参数名和处理器方法的形参名不一致时：
<form action="receiveParam.do" method="post">
    用户名：<input type="text" name="pname"><br>
    年龄：<input type="text" name="page"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
