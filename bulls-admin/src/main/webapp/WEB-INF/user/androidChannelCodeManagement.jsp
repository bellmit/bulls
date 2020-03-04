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
    <title>渠道代码管理</title>
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
                渠道代码管理
            </h1>
        </div>
        <!-- DataTables Example -->
        <div class="row">
            <div class="col-lg-12">
                <div class="widget-container fluid-height clearfix">
                    <div class="heading">
                        <i class="icon-table"></i>渠道代码管理
                        <shiro:hasPermission name="user:add:app">
                            <a class="btn btn-sm btn-primary-outline pull-right hidden-xs"
                               href="${basePath}user/gotoAndroidChannelCode" id="add-row"><i class="icon-plus"></i>添加渠道记录</a>
                        </shiro:hasPermission>
                        <!-- <button class="btn btn-primary pull-right hidden-xs" type="button" onclick="aa()"> 搜索 </button> -->
                    </div>
                    <div class="widget-content padded clearfix">
                        <%--                         	<form class="form-inline hidden-xs col-lg-5 pull-right" id="form" action="list">
                                                        <input type="hidden" name="page" value="1" />
                                                        <div class="row">
                                                            <div class="form-group col-md-6 col-md-offset-6">
                                                                <div>
                                                                    <input class="form-control keyword" name="keyword" type="text" placeholder="请输入机构名称" value="${keyword }"/>
                                                                </div>
                                                            </div>

                                                        </div>
                                                        <input type="hidden" name="page" value="${page }" />
                                                    </form> --%>
                        <table class="table table-bordered table-hover">
                            <thead>
                            <tr>
                                <th>
                                    渠道引流代码
                                </th>
                                <th>
                                    机构名称
                                </th>
                                <th>
                                    创建人
                                </th>
                                <th class="hidden-xs over">
                                    创建时间
                                </th>
                                <th>
                                   安卓/微信
                                </th>
                                <th width="120">
                                    操作
                                </th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="i" items="${list }">
                                <tr>

                                    <td>
                                            ${i.code}
                                    </td>
                                    <td>
                                            ${i.cname }
                                    </td>
                                    <td>
                                            ${i.creatername }
                                    </td>
                                    <td>
                                        <fmt:formatDate value="${i.create_time }" pattern="yyyy-MM-dd HH:mm:ss"/>
                                    </td>
                                    <td>
                                        <c:if test="${i.source ==0 }"><span class="label label-success">安卓</span></c:if>
                                        <c:if test="${i.source ==1 }"><span class="label label-warning">微信</span></c:if>
                                    </td>
                                    <td>
                                        <a href="${basePath}user/editAndroidChannel?id=${i.id}">编辑</a>
                                        &nbsp;
                                        <a href="javascript:void(0)" onclick="deleteAndroidChannel(${i.id})">删除</a>
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
    function deleteAndroidChannel(id) {
        if (confirm("是否删除该安卓渠道编码配置？")) {
            jQuery.ajax({
                url: "${basePath }user/deleteAndroidChannel",
                type: "POST",
                data: "id=" + id,
                dataType: "json",
                success: function (data) {
                    if (data.status == 0) {
                        window.location.href = "${basePath}user/androidChannelCodeManagement";
                    } else {
                        alert("删除失败！")
                    }
                }
            });
        }
    }
    ;

    function aa() {
        $("#form").submit();
    }
    ;
    $(function () {
        $(".datepicker").datepicker({
            format: 'yyyy-mm-dd'
        });
        $('.select2able').select2({width: "150"});
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
                return "androidChannelCodeManagement?page=" + page;
            }
        });

        $(".datepicker").datepicker({
            showSecond: true,
            timeFormat: "hh:mm:ss",
            dateFormat: "yy-mm-dd"
        });
    });

</script>
</body>
</html>