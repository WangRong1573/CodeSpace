<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/4
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script type="text/javascript">
        let stu = ${requestScope.key};
        window.alert("id: "+stu.sid+" name: "+stu.name);
    </script>
</head>
<body>
</body>
</html>
