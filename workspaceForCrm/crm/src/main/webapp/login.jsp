<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
<%
	String path = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();
%>
--%>
<!DOCTYPE html>
<html>
<head>
    <%--	<base href="<%=path%>">--%>
    <meta charset="UTF-8">
    <link href="jquery/bootstrap_3.3.0/css/bootstrap.min.css" type="text/css" rel="stylesheet"/>
    <script type="text/javascript" src="jquery/jquery-1.11.1-min.js"></script>
    <script type="text/javascript" src="jquery/bootstrap_3.3.0/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(function () {

            if(window.top!=window){
                window.top.location = window.location;
            }
        	//页面加载完毕后，将用户名文本框内容清空
			$("#loginAct").val("");
            //页面加载完毕后，用户名输入框自动获取焦点
            $("#loginAct").focus();

            //给登录按钮绑定事件，执行登录操作
			$("#submitBtn").click(function () {
				login();
			});

			//键盘监听事件，按下enter键执行登录操作
			$(window).keydown(function (event) {
				if (event.keyCode === 13){
					login();
				}
			});
        });

        //自定义的方法写在$(function()){}外
        function login() {
			//验证账号密码不能为空

			//去掉文本中的前后空格，使用$.trim()
			var loginAct = $.trim($("#loginAct").val());
			var loginPwd = $.trim($("#loginPwd").val());
			if (loginAct === "" || loginPwd === ""){
				$("#msg").html("用户名/密码不能为空");
				return false;
			}
			$.ajax({
				url:"setting/user/login.do",
				data:{
					"loginAct":loginAct,
					"loginPwd":loginPwd
				},
				type:"post",
				dataType:"json",
				success:function (data) {
					//返回信息{"success":true/false,"msg":"错误原因"}
					if (data.success){
						//登录成功跳转到欢迎页
						window.location.href = "workbench/index.jsp";
					}else {
						$("#msg").html(data.msg);
					}
				}
			})
		}
    </script>
</head>
<body>
<div style="position: absolute; top: 0px; left: 0px; width: 60%;">
    <img src="image/IMG_7114.JPG" style="width: 100%; height: 90%; position: relative; top: 50px;">
</div>
<div id="top" style="height: 50px; background-color: #3C3C3C; width: 100%;">
    <div style="position: absolute; top: 5px; left: 0px; font-size: 30px; font-weight: 400; color: white; font-family: 'times new roman'">
        CRM &nbsp;<span style="font-size: 12px;">&copy;2017&nbsp;动力节点</span></div>
</div>

<div style="position: absolute; top: 120px; right: 100px;width:450px;height:400px;border:1px solid #D5D5D5">
    <div style="position: absolute; top: 0px; right: 60px;">
        <div class="page-header">
            <h1>登录</h1>
        </div>
        <form action="workbench/index.jsp" class="form-horizontal" role="form">
            <div class="form-group form-group-lg">
                <div style="width: 350px;">
                    <input class="form-control" type="text" placeholder="用户名" id="loginAct">
                </div>
                <div style="width: 350px; position: relative;top: 20px;">
                    <input class="form-control" type="password" placeholder="密码" id="loginPwd">
                </div>
                <div class="checkbox" style="position: relative;top: 30px; left: 10px;">

                    <span id="msg" style="color: red"></span>

                </div>
                <%--按钮写在form中默认的行为是提交表单，一定要将按钮设置为button--%>
                <button type="button" id="submitBtn" class="btn btn-primary btn-lg btn-block"
                        style="width: 350px; position: relative;top: 45px;">登录
                </button>
            </div>
        </form>
    </div>
</div>
</body>
</html>