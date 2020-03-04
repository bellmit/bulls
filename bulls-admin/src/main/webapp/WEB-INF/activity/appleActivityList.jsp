<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>九月苹果活动详情列表</title>
    <link href="${basePath}css/select2.css" media="all" rel="stylesheet" type="text/css"/>
    <link href="${basePath}css/font-awesome.css" media="all" rel="stylesheet" type="text/css"/>
    <link href="${basePath}css/datepicker.css" media="all" rel="stylesheet" type="text/css"/>
    <style type="text/css">
        .table {
            table-layout: fixed;
        }

        .table .over {
            overflow: hidden;
            width: 40%;
            text-overflow: ellipsis;
            white-space: nowrap;
        }
    </style>
</head>
<body>
<div class="modal-shiftfix">
    <!-- Navigation -->
    <jsp:include page="../common/header.jsp"></jsp:include>
    <!-- End Navigation -->
    <div class="container-fluid main-content">
        <div class="page-title">
            <h1>
                活动列表
            </h1>
        </div>
        <!-- DataTables Example -->
        <div class="row">
            <div class="col-lg-12">
                <div class="widget-container fluid-height clearfix">
                    <div class="heading">
                        <i class="icon-table"></i>九月苹果活动详情列表
                        <shiro:hasPermission name="user:export:app">
                            <a style="margin-left: 10px;" class="btn btn-sm btn-primary-outline pull-right hidden-xs"
                               href="${basePath}report/appleReport?activityId=${activityId}&keyword=${keyword}&keyword1=${keyword1}&keyword2=<fmt:formatDate value="${keyword2 }" pattern="yyyy-MM-dd"/>"
                               id="add-row"><i class="icon-plus"></i>导出excel</a>
                        </shiro:hasPermission>
                    </div>
                    <div class="widget-content padded clearfix">
                        <form class="form-inline hidden-xs col-lg-4 pull-right" id="form" method="get"
                              action="appleActivityList">
                            <input type="hidden" name="activityId" value="${activityId}">

                            <div class="row">
                                <div class="form-group col-md-6">
                                    <input class="form-control datepicker" id="keyword2" name="keyword2" type="text"
                                           placeholder="请选择中奖时间" value="<fmt:formatDate value="${keyword2 }" pattern="yyyy-MM-dd"/>"/>
                                </div>
                                <div class="form-group col-md-6">
                                    <input class="form-control keyword" id="keyword1" name="keyword1" type="text"
                                           placeholder="请输入奖品名称" value="${keyword1 }"/>
                                </div>
                            </div>
                            <div class="row">
                                <div class="form-group col-md-9">
                                    <input class="form-control keyword" id="keyword" name="keyword" type="text"
                                           placeholder="请输入用户电话，或者真实姓名" value="${keyword }"/>
                                </div>
                                <div class="form-group col-md-3">
                                    <button class="btn btn-primary pull-right hidden-xs" type="submit">
                                        查询
                                    </button>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="widget-content padded clearfix">
                        <table class="table table-bordered table-hover">
                            <thead>
                            <tr>
                                <th>序号</th>
                                <th>奖品名称</th>
                                <th>中奖姓名</th>
                                <th>投资金额</th>
                                <th>手机号码</th>
                                <th>注册时间</th>
                                <th>中奖时间</th>
                                <th>留言信息</th>
                                <th>收货地址</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="i" items="${list }" varStatus="s">
                                <tr>
                                    <td>${s.count}</td>
                                    <td>
                                            ${i.name}
                                    </td>
                                    <td>
                                            ${i.true_name}
                                    </td>
                                    <td>
                                            ${i.totalAmount }
                                    </td>
                                    <td>
                                            ${i.phone }
                                    </td>
                                    <td>
                                        <fmt:formatDate value="${i.register_time}" pattern="yyyy-MM-dd HH:mm:ss"/>
                                    </td>
                                    <td>
                                        <fmt:formatDate value="${i.time }" pattern="yyyy-MM-dd HH:mm:ss"/>
                                    </td>
                                    <td>
                                            ${i.remark}
                                    </td>
                                    <td>
                                            ${i.address}
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                        <ul id="pagination" style="float: right"></ul>
                    </div>
                </div>
            </div>
        </div>
        <!-- end DataTables Example -->
    </div>
</div>
<script src="${basePath}js/bootstrap-datepicker.js" type="text/javascript"></script>
<script type="text/javascript" src="${basePath}js/bootstrap-paginator.min.js"></script>
<script src="${basePath}js/select2.js" type="text/javascript"></script>
<script type="text/javascript">
    function aa() {
        $("#form").submit();
    }
    $(function () {
        $(".datepicker").datepicker({
            format: 'yyyy-mm-dd'
        });
        $('.select2able').select2();
        $(".keyword").keyup(function (e) {
            e = e || window.e;
            if (e.keyCode == 13) {
                $("#form").submit();
            }
        });
        $('#pagination').bootstrapPaginator({
            currentPage: parseInt('${page}'),
            totalPages: parseInt('${pages}'),
            bootstrapMajorVersion: 3,
            alignment: "right",
            pageUrl: function (type, page, current) {
                return "appleActivityList?activityId=${activityId}&keyword=${keyword}&keyword1=${keyword1}&keyword2=${keyword2}&page=" + page;
            }
        });
        var activityOption = {
            placeholder: "请选择活动标题",
            minimumInputLength: 0,
            ajax: {
                url: "${basePath}activity/getActivityTitle",
                dataType: 'json',
                quietMillis: 100,
                data: function (term) {
                    return {
                        username: term, //search term
                    };
                },
                results: function (data) {
                    return {results: data};
                }
            },
            initSelection: function (element, callback) {
                //初始化赋值
                callback({id: '', name: '全部活动'});//调用formatSelection
            },
            formatResult: function (object, container, query) {
                return object.name;
            },
            formatSelection: function (object, container) {
                //选中时触发
                var id = object.id;
                $('#activityId').val(id);
                return object.name;
            },
            escapeMarkup: function (m) {
                return m;
            } // we do not want to escape markup since we are displaying html in results
        };
        $('#activityId').select2(activityOption)

        var giftOption = {
            placeholder: "请选择活动标题",
            minimumInputLength: 0,
            ajax: {
                url: "${basePath}activity/getActivityGiftItems",
                dataType: 'json',
                quietMillis: 100,
                data: function () {
                    return {
                        activityId: $("#activityId").val(), //search term
                    };
                },
                results: function (data) {
                    return {results: data};
                }
            },
            initSelection: function (element, callback) {
                //初始化赋值
                callback({id: '', name: '全部奖品'});//调用formatSelection
            },
            formatResult: function (object, container, query) {
                return object.name;
            },
            formatSelection: function (object, container) {

                //选中时触发
                var id = object.id;
                $('#giftId').val(id);
                return object.name;
            },
            escapeMarkup: function (m) {
                return m;
            } // we do not want to escape markup since we are displaying html in results
        };
        $('#giftId').select2(giftOption);
    });
</script>
</body>
</html>