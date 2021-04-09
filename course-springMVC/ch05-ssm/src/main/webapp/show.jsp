<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/9
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=path%>">
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function () {
            loadData();

            function loadData() {
                $.ajax({
                    url: "student/query.do",
                    dataType: "json",
                    success: function (resp) {
                        //每次加载清空旧数据
                        $("#info").html("");
                        $.each(resp, function (i, ele) {
                            $("#info").append("<tr>")
                                .append("<td>" + ele.id + "</td>")
                                .append("<td>" + ele.name + "</td>")
                                .append("<td>" + ele.age + "</td>")
                                .append("</tr>");
                        })
                    }
                })
            }
        })
    </script>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>学生编号</td>
        <td>姓名</td>
        <td>年龄</td>
    </tr>
    </thead>
    <tbody id="info">

    </tbody>
</table>
</body>
</html>
