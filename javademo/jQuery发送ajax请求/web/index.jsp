<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/13
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
      $(function () {
        $("#pBtn").click(function () {
          var pid = $("#pid").val();
          $.ajax(
                  {
                    url:"search",
                    type:"get",
                    data:{
                      "pid":pid
                    },
                    dataType:"json",
                    success:function (resp) {
                      //resp是json对象
                      $("#pname").val(resp.name);
                      $("#pjiancheng").val(resp.jiancheng);
                      $("#pshenghui").val(resp.shenghui);
                    }
                  }
          )
        });
        })

    </script>
  </head>
  <body>
    <table border="1">
      <tr>
        <td>城市编号：</td>
        <td><input type="text" id="pid"> <input type="button" id="pBtn" value="搜索"></td>
      </tr>
      <tr>
        <td>城市名称：</td>
        <td><input type="text" id="pname"></td>
      </tr>
      <tr>
        <td>简称：</td>
        <td><input type="text" id="pjiancheng"></td>
      </tr>
      <tr>
        <td>省会：</td>
        <td><input type="text" id="pshenghui"></td>
      </tr>
    </table>
  </body>
</html>
