<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/9
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<head>
    <title>注册页</title>
    <base href="<%=path%>">
</head>
<body>
<form action="student/add.do" method="post">
    <table>
        <tr>
            <td>
                用户名：
            </td>
            <td>
                <input type="text" name="name">
            </td>
        </tr>
        <tr>
            <td>
                年龄：
            </td>
            <td>
                <input type="text" name="age">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="注册">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
