<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/9
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=path%>">
</head>
<body>
<p>ssm整合开发栗子</p>
<table>
    <tr>
        <td>
            <a href="addStudent.jsp">注册学生</a>
        </td>
    </tr>

    <tr>
        <td>
            <a href="show.jsp">查看所有学生信息</a>
        </td>
    </tr>
</table>
</body>
</html>
