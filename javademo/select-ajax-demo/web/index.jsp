<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/14
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function () {
            load();

            function load() {
                $.ajax(
                    {
                        url: "searchProvince",
                        contentType: "json",
                        success: function (resp) {
                            //删除旧数据，防止重复添加
                            $("#pro").empty();
                            $.each(resp, function (index, element) {
                                $("#pro").append("<option value='" + element.id + "'>" + element.name + "</option>");
                            })
                        }
                    }
                )
            };

            //给省份的select绑定change事件
            $("#pro").change(function () {
                var id = $("#pro>option:selected").val();
                $.post(
                    "queryCity",
                    {pid: id},
                    callback,
                    "json"
                )
            });

            function callback(resp) {
                $("#city").empty();
                $.each(resp, function (i, n) {
                    $("#city").append("<option value='" + n.id + "'>" + n.name + "</option>");
                })
            }


        })
    </script>
</head>
<body>
<table border="1">
    <tr>
        <td>
            省份：
        </td>
        <td>
            <select id="pro">
                <option value="0">请选择...</option>
            </select>
        </td>
    </tr>
    <tr>
        <td>
            城市：
        </td>
        <td>
            <select id="city">
                <option value="0">请选择...</option>
            </select>
        </td>
    </tr>
</table>
</body>
</html>
