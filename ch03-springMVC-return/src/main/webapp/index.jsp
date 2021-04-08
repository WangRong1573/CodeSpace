<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/8
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    url:"returnVoid.do",
                    data:{
                        name:"mike",
                        age:30
                    },
                    dataType:"json",
                    success:function (resp) {
                        alert(resp.name+ "   "+resp.age);
                    }
                })
            })
        })
    </script>
</head>
<body>
<form action="returnString.do" method="post">
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age"><br>
    <input type="submit" value="提交">
</form>
<br>
<button id="btn">使用按钮发送ajax请求，测试返回void类型</button>
</body>
</html>
