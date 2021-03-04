<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/4
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script type="text/javascript">
      var deptObj = ${requestScope.key};
      function test() {
        document.getElementById("deptNo").value = deptObj.deptNo;
        document.getElementById("dName").value = deptObj.dName;
        document.getElementById("loc").value = deptObj.loc;
      }
    </script>
  </head>
  <body onload="test()">
  <table border="1" align="center">
    <tr>
      <td>部门编号：</td>
      <td><input type="text" id="deptNo"></td>
    </tr>
    <tr>
      <td>部门名称：</td>
      <td><input type="text" id="dName"></td>
    </tr>
    <tr>
      <td>部门地址：</td>
      <td><input type="text" id="loc"></td>
    </tr>
  </table>
  </body>
</html>
