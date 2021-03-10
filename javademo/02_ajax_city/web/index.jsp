<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/10
  Time: 20:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>使用json</title>
    <script type="text/javascript">
      function doSearch() {
        var xmlHttp = new XMLHttpRequest();
        xmlHttp.onreadystatechange = function () {
          //获取json字符串
          var jsonStr = xmlHttp.responseText;
          //将json格式字符串转为json对象,后续使用jQuery代替
          var jsonObj = eval("("+jsonStr+")");

          //方式1：
          // document.getElementById("proname").value = jsonObj.name;
          // document.getElementById("projiancheng").value = jsonObj.jiancheng;
          // document.getElementById("proshenghui").value = jsonObj.shenghui;

          //方式2：调用方法形式
          callback(jsonObj);

        };
        var id = document.getElementById("proid").value;

        //true 表示异步处理请求，使用异步对象发起请求后，不用等待数据处理完毕，就可以执行其他操作
        //false 同步，同步对象必须处理完成请求，从服务器获取数据后，才能执行send之后代码
        xmlHttp.open("get","citySearch?id="+id,true);
        xmlHttp.send();

        //测试同步异步区别
        //alert("send之后代码")
      }

      function callback(json) {
        document.getElementById("proname").value = json.name;
        document.getElementById("projiancheng").value = json.jiancheng;
        document.getElementById("proshenghui").value = json.shenghui;
      }
    </script>
  </head>
  <body>
  <table border="1">
    <tr>
      <td>编号：</td>
      <td><input type="text" id="proid"> <input type="button" value="搜索" onclick="doSearch()"></td>
    </tr>
    <tr>
      <td>城市名称：</td>
      <td><input type="text" id="proname"></td>
    </tr>
    <tr>
      <td>城市简称：</td>
      <td><input type="text" id="projiancheng"></td>
    </tr>
    <tr>
      <td>省会名称：</td>
      <td><input type="text" id="proshenghui"></td>
    </tr>
  </table>
  </body>
</html>
