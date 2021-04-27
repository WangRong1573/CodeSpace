<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">

    <link href="../../jquery/bootstrap_3.3.0/css/bootstrap.min.css" type="text/css" rel="stylesheet"/>
    <link href="../../jquery/bootstrap-datetimepicker-master/css/bootstrap-datetimepicker.min.css" type="text/css"
          rel="stylesheet"/>

    <script type="text/javascript" src="../../jquery/jquery-1.11.1-min.js"></script>
    <script type="text/javascript" src="../../jquery/bootstrap_3.3.0/js/bootstrap.min.js"></script>
    <script type="text/javascript"
            src="../../jquery/bootstrap-datetimepicker-master/js/bootstrap-datetimepicker.js"></script>
    <script type="text/javascript"
            src="../../jquery/bootstrap-datetimepicker-master/locale/bootstrap-datetimepicker.zh-CN.js"></script>
    //分页插件
    <link rel="stylesheet" type="text/css" href="../../jquery/bs_pagination/jquery.bs_pagination.min.css">
    <script type="text/javascript" src="../../jquery/bs_pagination/jquery.bs_pagination.min.js"></script>
    <script type="text/javascript" src="../../jquery/bs_pagination/en.js"></script>

    <script type="text/javascript">

        $(function () {
            $("#addBtn").click(function () {

                //日历组件
                $(".time").datetimepicker({
                    minView: "month",
                    language: 'zh-CN',
                    format: 'yyyy-mm-dd',
                    autoclose: true,
                    todayBtn: true,
                    pickerPosition: "bottom-left"
                });

                //为创建按钮绑定事件，打开添加模态窗
                //模态窗使用方式：需要操作的窗口的jQuery对象，调用modal方法：参数 show：打开，hide 关闭模态窗
                //$("#createActivityModal").modal("show");

                //取用户信息列表
                $.ajax({
                    url: "getUserList.do",
                    type: "get",
                    dataType: "json",
                    success: function (data) {
                        var html = "<option></option>";
                        $.each(data, function (i, n) {
                            html += "<option value='" + n.id + "'>" + n.name + "</option>";
                        });
                        $("#create-owner").html(html);

                        //设置默认选中用户为当前登录用户
                        $("#create-owner").val("${user.id}");

                        //获取数据后打开模态窗口
                        $("#createActivityModal").modal("show");
                    }
                })

            });

            //为保存按钮绑定事件，执行添加操作
            $("#saveBtn").click(function () {

                $.ajax({
                    url: "save.do",
                    type: "post",
                    data: {
                        "owner": $.trim($("#create-owner").val()),
                        "name": $.trim($("#create-name").val()),
                        "startDate": $.trim($("#create-startDate").val()),
                        "endDate": $.trim($("#create-endDate").val()),
                        "cost": $.trim($("#create-cost").val()),
                        "description": $.trim($("#create-description").val())
                    },
                    dataType: "json",
                    success: function (data) {
                        if (data.success) {
                            //添加成功，局部刷新列表，关闭模态窗
                            //pageList(1,2);

                            //添加后回到首页，维持每页展示记录数
                            pageList(1,$("#activityPage").bs_pagination('getOption', 'rowsPerPage'));
                            //清除添加操作时添加的数据
                            /*
                            * 此处使用dom对象和jQuery对象互相转换知识
                            * jQuery对象转换成dom对象 使用jQuery对象[下标]，或者jQuery对象.get（）方式
                            * dom对象转换成jQuery对象：$(dom对象)
                            * */
                            $("#activityAddForm")[0].reset();

                            $("#createActivityModal").modal("hide");
                        } else {
                            alert("添加市场活动失败");
                        }
                    }
                })

            });

            //默认展开列表第一页，每页两条数据
            pageList(1, 2);

            //为查询按钮绑定事件
            $("#searchBtn").click(function () {
                pageList(1, 2);
            });

            //为全选的复选框绑定事件，触发全选操作
            $("#qx").click(function () {

                $("input[name=xz]").prop("checked",this.checked);
            });
            //动态生成的元素不能以普通绑定事件的形式进行操作的，动态生成的元素需要以on方法形式来触发事件
            //语法：$(需要绑定元素的有效外层元素).on(绑定事件方式，需要绑定元素的jQuery对象，回调函数)
            $("#activityBody").on("click",$("input[name=xz]"),function () {
                //当复选框勾选个数和列表复选框个数一样时，代表本页全部选中，则title栏的复选框变为勾选状态
                $("#qx").prop("checked",$("input[name=xz]").length === $("input[name=xz]:checked").length);
            });

            //为删除按钮绑定事件
            $("#deleteBtn").click(function () {

                //找出复选框中所有已勾选的jQuery对象
                var $xz = $("input[name=xz]:checked");
                if ($xz.length === 0){
                    alert("请选择需要删除的记录");
                }else {

                    if (confirm("确定删除选择的记录吗？")){
                        //url:delete.do?k1=v1&k2=v2
                        //拼接参数
                        var param = "";
                        //将$xz中的每一个dom元素遍历，取value
                        for (var i=0;i<$xz.length;i++){
                            param += "id="+$($xz[i]).val();
                            if (i < $xz.length-1){
                                param += "&";
                            }
                        }
                        //alert(param);
                        $.ajax({
                            url:"delete.do",
                            data:param,
                            type:"get",
                            dataType:"json",
                            success:function (data) {
                                if (data.success){

                                    //pageList(1,2);
                                    //删除成功回到首页
                                    pageList(1,$("#activityPage").bs_pagination('getOption', 'rowsPerPage'));
                                }else {
                                    alert("删除失败");
                                }
                            }
                        })
                    }
                }
            });

            //为修改按钮绑定事件，打开模态窗口
            $("#editBtn").click(function () {

                var $xz = $("input[name=xz]:checked");
                if ($xz.length === 0){
                    alert("请选择要修改的记录");
                }else if ($xz.length > 1){
                    alert("只能选择一条记录");
                }else {
                    var id = $xz.val();

                    $.ajax({
                        url:"getUserListAndActivity.do",
                        data:{
                            "id":id
                        },
                        type:"get",
                        dataType:"json",
                        success:function (data) {
                            /*
                            data
                                用户列表
                                市场活动对象
                             */
                            var html = "<option></option>";
                            $.each(data.uList,function (i,n) {
                                html += "<option value='"+n.id+"'>"+n.name+"</option>";
                            });
                            $("#edit-owner").html(html);

                            $("#edit-id").val(data.a.id);
                            $("#edit-name").val(data.a.name);
                            $("#edit-owner").val(data.a.owner);
                            $("#edit-startDate").val(data.a.startDate);
                            $("#edit-endDate").val(data.a.endDate);
                            $("#edit-cost").val(data.a.cost);
                            $("#edit-description").val(data.a.description);

                            //打开模态窗
                            $("#editActivityModal").modal("show");
                        }
                    })
                }
            });

            //为更新按钮绑定事件，执行更新操作
            $("#updateBtn").click(function () {
                $.ajax({
                    url: "update.do",
                    type: "post",
                    data: {
                        "id":$("input[name=xz]:checked").val(),
                        "owner": $.trim($("#edit-owner").val()),
                        "name": $.trim($("#edit-name").val()),
                        "startDate": $.trim($("#edit-startDate").val()),
                        "endDate": $.trim($("#edit-endDate").val()),
                        "cost": $.trim($("#edit-cost").val()),
                        "description": $.trim($("#edit-description").val())
                    },
                    dataType: "json",
                    success: function (data) {
                        /*
                            * data
                            *   {"success":true/false}
                            * */
                        if (data.success) {
                            //修改成功后刷新列表
                            //pageList(1,2);
                            pageList($("#activityPage").bs_pagination('getOption', 'currentPage')
                                ,$("#activityPage").bs_pagination('getOption', 'rowsPerPage'));

                            //关闭模态窗
                            $("#editActivityModal").modal("hide");
                        } else {
                            alert("修改市场活动失败");
                        }
                    }
                })
            })



        });

        function pageList(pageNo, pageSize) {

            //取消全选的复选框勾选
            $("#qx").prop("checked",false);

            $.ajax({
                url: "pageList.do",
                data: {
                    "pageNo": pageNo,
                    "pageSize": pageSize,
                    "name": $.trim($("#search-name").val()),
                    "owner": $.trim($("#search-owner").val()),
                    "startDate": $.trim($("#search-startDate").val()),
                    "endDate": $.trim($("#search-endDate").val())
                },
                type: "get",
                dataType: "json",
                success: function (data) {
                    /*
                    data
                    * {"total":"","dataList":[{市场活动1}，{2}，{3}...]}
                    * */
                    var html = "";
                    $.each(data.dataList, function (i, n) {
                        html += '<tr class="active">';
                        html += '<td><input type="checkbox" name="xz" value="'+n.id+'"/></td>';
                        html += '<td><a style="text-decoration: none; cursor: pointer;" onclick="window.location.href=\'detail.jsp\';">'+n.name+'</a>';
                        html += '</td>';
                        html += '<td>'+n.owner+'</td>';
                        html += '<td>'+n.startDate+'</td>';
                        html += ' <td>'+n.endDate+'</td>';
                        html += ' </tr>';
                    });
                    $("#activityBody").html(html);

                    //计算总页数
                    var totalPages = data.total % pageSize ===0 ? data.total / pageSize : parseInt(data.total / pageSize) + 1;
                    $("#activityPage").bs_pagination({
                        currentPage: pageNo, // 页码
                        rowsPerPage: pageSize, // 每页显示的记录条数
                        maxRowsPerPage: 20, // 每页最多显示的记录条数
                        totalPages: totalPages, // 总页数
                        totalRows: data.total, // 总记录条数

                        visiblePageLinks: 3, // 显示几个卡片

                        showGoToPage: true,
                        showRowsPerPage: true,
                        showRowsInfo: true,
                        showRowsDefaultInfo: true,

                        onChangePage : function(event, data){
                            pageList(data.currentPage , data.rowsPerPage);
                        }
                    });
                }
            })
        }
    </script>
</head>
<body>
<!-- 创建市场活动的模态窗口 -->
<div class="modal fade" id="createActivityModal" role="dialog">
    <div class="modal-dialog" role="document" style="width: 85%;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    <span aria-hidden="true">×</span>
                </button>
                <h4 class="modal-title" id="myModalLabel1">创建市场活动</h4>
            </div>
            <div class="modal-body">

                <form id="activityAddForm" class="form-horizontal" role="form">

                    <div class="form-group">
                        <label for="create-owner" class="col-sm-2 control-label">所有者<span
                                style="font-size: 15px; color: red;">*</span></label>
                        <div class="col-sm-10" style="width: 300px;">
                            <select class="form-control" id="create-owner">
                                //userList
                            </select>
                        </div>
                        <label for="create-name" class="col-sm-2 control-label">名称<span
                                style="font-size: 15px; color: red;">*</span></label>
                        <div class="col-sm-10" style="width: 300px;">
                            <input type="text" class="form-control" id="create-name">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="create-startTime" class="col-sm-2 control-label">开始日期</label>
                        <div class="col-sm-10" style="width: 300px;">
                            <input type="text" class="form-control time" id="create-startDate" readonly>
                        </div>
                        <label for="create-endTime" class="col-sm-2 control-label">结束日期</label>
                        <div class="col-sm-10" style="width: 300px;">
                            <input type="text" class="form-control time" id="create-endDate" readonly>
                        </div>
                    </div>
                    <div class="form-group">

                        <label for="create-cost" class="col-sm-2 control-label">成本</label>
                        <div class="col-sm-10" style="width: 300px;">
                            <input type="text" class="form-control" id="create-cost">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="create-describe" class="col-sm-2 control-label">描述</label>
                        <div class="col-sm-10" style="width: 81%;">
                            <textarea class="form-control" rows="3" id="create-description"></textarea>
                        </div>
                    </div>

                </form>

            </div>
            <div class="modal-footer">
                <%--data-dismiss="modal" 表示关闭模态窗--%>
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="saveBtn">保存</button>
            </div>
        </div>
    </div>
</div>

<!-- 修改市场活动的模态窗口 -->
<div class="modal fade" id="editActivityModal" role="dialog">
    <div class="modal-dialog" role="document" style="width: 85%;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    <span aria-hidden="true">×</span>
                </button>
                <h4 class="modal-title" id="myModalLabel2">修改市场活动</h4>
            </div>
            <div class="modal-body">

                <form class="form-horizontal" role="form">
                    <input type="hidden" id="edit-id"/>
                    <div class="form-group">
                        <label for="edit-marketActivityOwner" class="col-sm-2 control-label">所有者<span
                                style="font-size: 15px; color: red;">*</span></label>
                        <div class="col-sm-10" style="width: 300px;">
                            <select class="form-control" id="edit-owner">

                            </select>
                        </div>
                        <label for="edit-marketActivityName" class="col-sm-2 control-label">名称<span
                                style="font-size: 15px; color: red;">*</span></label>
                        <div class="col-sm-10" style="width: 300px;">
                            <input type="text" class="form-control" id="edit-name">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="edit-startTime" class="col-sm-2 control-label">开始日期</label>
                        <div class="col-sm-10" style="width: 300px;">
                            <input type="text" class="form-control time" id="edit-startDate">
                        </div>
                        <label for="edit-endTime" class="col-sm-2 control-label">结束日期</label>
                        <div class="col-sm-10" style="width: 300px;">
                            <input type="text" class="form-control time" id="edit-endDate">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="edit-cost" class="col-sm-2 control-label">成本</label>
                        <div class="col-sm-10" style="width: 300px;">
                            <input type="text" class="form-control" id="edit-cost">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="edit-describe" class="col-sm-2 control-label">描述</label>
                        <div class="col-sm-10" style="width: 81%;">
                            <textarea class="form-control" rows="3" id="edit-description"></textarea>
                        </div>
                    </div>

                </form>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="updateBtn">更新</button>
            </div>
        </div>
    </div>
</div>


<div>
    <div style="position: relative; left: 10px; top: -10px;">
        <div class="page-header">
            <h3>市场活动列表</h3>
        </div>
    </div>
</div>
<div style="position: relative; top: -20px; left: 0px; width: 100%; height: 100%;">
    <div style="width: 100%; position: absolute;top: 5px; left: 10px;">

        <div class="btn-toolbar" role="toolbar" style="height: 80px;">
            <form class="form-inline" role="form" style="position: relative;top: 8%; left: 5px;">

                <div class="form-group">
                    <div class="input-group">
                        <div class="input-group-addon">名称</div>
                        <input class="form-control" type="text" id="search-name">
                    </div>
                </div>

                <div class="form-group">
                    <div class="input-group">
                        <div class="input-group-addon">所有者</div>
                        <input class="form-control" type="text" id="search-owner">
                    </div>
                </div>


                <div class="form-group">
                    <div class="input-group">
                        <div class="input-group-addon">开始日期</div>
                        <input class="form-control" type="text" id="search-startDate"/>
                    </div>
                </div>
                <div class="form-group">
                    <div class="input-group">
                        <div class="input-group-addon">结束日期</div>
                        <input class="form-control" type="text" id="search-endDate">
                    </div>
                </div>

                <button type="button" id="searchBtn" class="btn btn-default">查询</button>

            </form>
        </div>
        <div class="btn-toolbar" role="toolbar"
             style="background-color: #F7F7F7; height: 50px; position: relative;top: 5px;">
            <div class="btn-group" style="position: relative; top: 18%;">
                <%--
                	data-toggle="modal" 表示触发该按钮，将要打开一个模态窗
                	data-target="#createActivityModal"：表示打开模态窗的标识，使用#id形式找到模态窗

                	实际开发中，对于处理模态窗的操作，不要写死在元素中，应自己写js代码操作

                	一般命名规则：
                	add/create：跳转到添加页或者打开添加模态窗口
                	save：执行添加操作
                	edit：跳转到修改页或者打开修改模态窗口
                	update：执行修改操作
                	get：执行查询操作 find、query、select
                --%>
                <button type="button" class="btn btn-primary" id="addBtn">
                    <span class="glyphicon glyphicon-plus"></span> 创建
                </button>
                <button type="button" class="btn btn-default" id="editBtn"><span
                        class="glyphicon glyphicon-pencil"></span> 修改
                </button>
                <button type="button" class="btn btn-danger" id="deleteBtn"><span class="glyphicon glyphicon-minus"></span> 删除</button>
            </div>

        </div>
        <div style="position: relative;top: 10px;">
            <table class="table table-hover">
                <thead>
                <tr style="color: #B3B3B3;">
                    <td><input type="checkbox" id="qx"/></td>
                    <td>名称</td>
                    <td>所有者</td>
                    <td>开始日期</td>
                    <td>结束日期</td>
                </tr>
                </thead>
                <tbody id="activityBody">
                <%--<tr class="active">
                    <td><input type="checkbox"/></td>
                    <td><a style="text-decoration: none; cursor: pointer;" onclick="window.location.href='detail.jsp';">发传单</a>
                    </td>
                    <td>zhangsan</td>
                    <td>2020-10-10</td>
                    <td>2020-10-20</td>
                </tr>
                <tr class="active">
                    <td><input type="checkbox"/></td>
                    <td><a style="text-decoration: none; cursor: pointer;" onclick="window.location.href='detail.jsp';">发传单</a>
                    </td>
                    <td>zhangsan</td>
                    <td>2020-10-10</td>
                    <td>2020-10-20</td>
                </tr>--%>
                </tbody>
            </table>
        </div>

        <div style="height: 50px; position: relative;top: 30px;">
            <div id="activityPage"></div>
        </div>

    </div>

</div>
</body>
</html>