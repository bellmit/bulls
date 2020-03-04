<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>编辑周期项目</title>
    <link href="${basePath}css/select2.css" media="all" rel="stylesheet" type="text/css"/>
    <link href="${basePath}css/jquery-fileupload/jquery.fileupload.css" media="all" rel="stylesheet" type="text/css"/>
    <link href="${basePath}css/jquery.fancybox.css" media="all" rel="stylesheet" type="text/css"/>
    <link href="${basePath}css/font-awesome.css" media="all" rel="stylesheet" type="text/css"/>
    <link href="${basePath}css/datepicker.css" media="all" rel="stylesheet" type="text/css"/>
    <link href="${basePath}js/ueditor/themes/default/css/ueditor.css" type="text/css" rel="stylesheet">
    <style type="text/css">
        .upload-picture a {
            display: inline-block;
            overflow: hidden;
            border: 0;
            vertical-align: top;
            margin: 0 5px 10px 0;
            background: #fff;
        }

        .gallery-item:hover {
            background: #000;
        }

        #validate-form i.icon-zoom-in {
            width: 36px;
            height: 36px;
            font-size: 18px;
            line-height: 35px;
            margin-top: 0;
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
                项目管理
            </h1>
        </div>
        <!-- DataTables Example -->
        <div class="row">
            <div class="col-lg-12">
                <div class="widget-container fluid-height clearfix">
                    <div class="heading">
                        <i class="icon-table"></i>编辑周期标
                    </div>
                    <div class="widget-content padded clearfix">
                        <form action="cycleEdit" method="post" class="form-horizontal" id="validate-form"
                              >
                            <input type="hidden" value="${project.id }" name="id"/>
                            <input type="hidden" value="${project.projectType }" name="projectType"/>
                            <c:if test="${project.projectType !=2 }">
                                <div class="form-group">
                                    <label class="control-label col-md-2">项目图片</label>

                                    <div class="col-md-7 upload-picture">
                                        <c:forEach var="pic" items="${project.pictures }">
                                            <c:if test="${pic.type==1}">
                                                <a class="gallery-item fancybox" rel="g1"
                                                   href="/upload/${pic.upload.path }"
                                                   picId="${pic.id }" title="${pic.name }">
                                                    <img src="${aPath}upload/${pic.upload.path }"/>

                                                    <div class="actions">
                                                        <i class="icon-trash"></i><i class="icon-zoom-in"></i>
                                                    </div>
                                                </a>
                                            </c:if>
                                        </c:forEach>
                                        <a data-toggle="modal" href="#myModal" id="enterprise-picture">
                                            <i class="iconfont" style="font-size: 150px;cursor: pointer;">&#xe602;</i>
                                        </a>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="control-label col-md-2">借款协议</label>

                                    <div class="col-md-7 upload-picture">
                                        <c:forEach var="pic" items="${project.pictures }">
                                            <c:if test="${pic.type==2}">
                                                <a class="gallery-item fancybox" rel="g1"
                                                   href="/upload/${pic.upload.path }"
                                                   picId="${pic.id }" title="${pic.name }">
                                                    <img src="${aPath}upload/${pic.upload.path }"/>

                                                    <div class="actions">
                                                        <i class="icon-trash"></i><i class="icon-zoom-in"></i>
                                                    </div>
                                                </a>
                                            </c:if>
                                        </c:forEach>
                                        <a data-toggle="modal" href="#myModal2" id="borrow-picture">
                                            <i class="iconfont" style="font-size: 150px;cursor: pointer;">&#xe602;</i>
                                        </a>
                                    </div>
                                </div>
                            </c:if>
                            <div class="form-group">
                                <label class="control-label col-md-2">项目名称</label>

                                <%--<div class="col-md-7">--%>
                                <%--<!-- 加载编辑器的容器 -->--%>
                                <%--<script id="container" name="title" type="text/plain" height="500">${project.title}</script>--%>
                                <%--</div>--%>
                                <div class="col-md-7">
                                    <input class="form-control" name="title" value="${project.title }"
                                           type="text">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-md-2">企业名称</label>

                                <div class="col-md-7">
                                    <input id="selectEnterprise" value="${project.enterpriseId }"
                                           name="enterpriseId" type="hidden"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-md-2">年化收益</label>

                                <div class="col-md-7">
                                    <input class="form-control" name="annualized" value="${project.annualized }"
                                           placeholder="请输入年化收益" type="text">
                                    <input name="lockMark" value="${project.lockMark }" type="hidden">
                                </div>
                            </div>
                            <input type="hidden" name="increaseAnnualized" value="0"/>
                            <%--<div class="form-group">--%>
                                <%--<label class="control-label col-md-2">年化收益加息</label>--%>

                                <%--<div class="col-md-7">--%>
                                    <%--<input class="form-control" name="increaseAnnualized" placeholder="请输入年化收益加息"--%>
                                           <%--type="text" value="${project.increaseAnnualized }">--%>
                                <%--</div>--%>
                            <%--</div>--%>
                            <div class="form-group">
                                <label class="control-label col-md-2">总融资金额</label>

                                <div class="col-md-7 input-group">
                                    <input class="form-control" name="totalAmount"
                                           value="<fmt:formatNumber type="number" value="${project.totalAmount}" groupingUsed="false" maxFractionDigits="0"/>"
                                           placeholder="请输入总融资金额,单位是元" type="text">

                                    <div class="input-group-addon">元</div>
                                </div>
                            </div>
                            <c:if test="${project.projectType !=2 }">
                                <%--<div class="form-group">--%>
                                    <%--<label class="control-label col-md-2">投资截至时间</label>--%>

                                    <%--<div class="col-md-7">--%>
                                        <%--<input class="form-control datepicker"--%>
                                               <%--value="<fmt:formatDate value="${project.deadline }" pattern="yyyy-MM-dd"/>"--%>
                                               <%--name="deadline" type="text" placeholder="请选择投资截至时间">--%>
                                    <%--</div>--%>
                                <%--</div>--%>

                                <div class="form-group">
                                    <label class="control-label col-md-2">还款期限</label>

                                    <div class="col-md-7 input-group">
                                        <input class="form-control" name="limitDays" value="${project.limitDays }"
                                               placeholder="请输入还款期限,单位为天" type="text">

                                        <div class="input-group-addon">天</div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-md-2">债权详情模板</label>

                                    <div class="col-md-7">
                                        <input id=detailId name="detailId" type="hidden" placeholder="请选择你要的债权详情模板" value="${map.detailId }"
                                        />
                                    </div>
                                </div>
                                
                                 <div class="form-group">
	                                <c:if test="${project.status == 0 }">
	                                	<label class="control-label col-md-2">设置期数</label>
		                                <div class="col-md-7">
		                                	<input class="icon-class" style="display:inline" id="period" name="period" type="checkbox" <c:if test="${on == 'on'}">checked</c:if> > 第${period}期
		                            		<input class="" id="periodHidden" name="periodHidden" type="hidden" value="${period}"/>
		                            	</div>
	                            	</c:if>
	                            	
	                            	<c:if test="${project.status != 0 && on == 'on'}">
	                            		<label class="control-label col-md-2">设置期数</label>
		                                <div class="col-md-7">
		                                	第${period}期
		                                	<input class="" id="periodHidden" name="periodHidden" type="hidden" value="${period}"/>
		                            	</div>
	                            	</c:if>
	                            	
	                            	<input class="" id="projectStatus" name="projectStatus" type="hidden" value="${project.status}"/>
	                            </div>
	                            
	                            
                                <div class="form-group">
                                    <label class="control-label col-md-2">月租金收入</label>

                                    <div class="col-md-7">
                                        <input value="${project.rentalIncome }" class="form-control"
                                               placeholder="请输入月租金收入" name="rentalIncome"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-md-2">项目详情</label>

                                    <div class="col-md-7">
                                        <textarea rows="5" class="form-control" placeholder="请输入项目描述"
                                                  name="projectDescription">${project.projectDescription }</textarea>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="control-label col-md-2">项目地址</label>

                                    <div class="col-md-7">
                                    <textarea rows="5" class="form-control" placeholder="请输入项目地址"
                                              name="address">${project.address }</textarea>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="control-label col-md-2">资金用途</label>

                                    <div class="col-md-7">
                                        <textarea rows="5" class="form-control" placeholder="请输入资金用途"
                                                  name="useOfFunds">${project.useOfFunds }</textarea>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="control-label col-md-2">还款来源</label>

                                    <div class="col-md-7">
                                        <textarea rows="5" class="form-control" placeholder="请输入还款来源"
                                                  name="repaymentSource">${project.repaymentSource }</textarea>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="control-label col-md-2">抵(质)押物</label>

                                    <div class="col-md-7">
                                        <textarea rows="5" class="form-control" placeholder="请输入抵(质)押物信息"
                                                  name="collateralInfo">${project.collateralInfo }</textarea>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="control-label col-md-2">风险保障金</label>

                                    <div class="col-md-7">
                                    <textarea rows="5" class="form-control" placeholder="请输入风险保障金信息"
                                              name="riskMoney">${project.riskMoney }</textarea>
                                    </div>
                                </div>
                            </c:if>
                            <c:if test="${project.projectType == 5 }">
                                <div class="form-group">
                                    <label class="control-label col-md-2">所属产品库</label>

                                    <div id="divProductList" class="col-md-7">

                                        <%--<label class="radio-inline">
                                            <input name="status" type="radio" value="0"
                                                   <c:if test="${project.status == 0 }">checked</c:if>>
                                        <span>
                                            草稿
                                        </span>
                                        </label>
                                        <label class="radio-inline">
                                            <input name="status" type="radio" value="1"
                                                   <c:if test="${project.status == 1 }">checked</c:if>>
                                            <span>创建</span>
                                        </label>--%>
                                    </div>
                                </div>
                            </c:if>

                            <div class="form-group">
                                <label class="control-label col-md-2">项目状态</label>
                                <div  class="col-md-7">
                                    <label class="radio-inline">
                                        <input name="status" type="radio" value="0"
                                               <c:if test="${project.status == 0 }">checked</c:if>>
                                    <span>
                                        草稿
                                    </span>
                                    </label>
                                    <label class="radio-inline">
                                        <input name="status" type="radio" value="1"
                                               <c:if test="${project.status == 1 }">checked</c:if>>
                                        <span>创建</span>
                                    </label>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-md-2"></label>

                                <div class="text-center col-md-7">
                                    <a class="btn btn-default-outline"
                                       onclick="javascript:window.history.go(-1);">取消</a>
                                    <button class="btn btn-primary" type="submit">编辑</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- end DataTables Example -->
    </div>
</div>

<div class="modal fade" id="myModal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button aria-hidden="true" class="close" data-dismiss="modal" type="button">&times;</button>
                <h4 class="modal-title">
                    项目图片上传
                </h4>
            </div>
            <div class="modal-body">
                <form action="" class="form-horizontal" id="picture-form">
                    <div class="form-group">
                        <label class="control-label col-md-2">图片名称</label>

                        <div class="col-md-7">
                            <input class="form-control" name="picName" id="picName" placeholder="请输入图片名称" type="text"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-md-2">图片</label>

                        <div class="col-md-3">
                                    <span class="btn btn-success fileinput-button">
					                    <i class="glyphicon glyphicon-plus"></i>
					                    <span>上传</span>
					                    <input type="file" name="file" id="fileupload">
					                </span>
                            <img src="" id="target" width="200px;"/>

                            <div class="alert alert-danger" style="display: none;width: 300px;">
                                <button class="close" data-dismiss="alert" type="button">&times;</button>
                                <span class="alert-content"></span>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button class="btn btn-default-outline" data-dismiss="modal" type="button">关闭</button>
                <button class="btn btn-primary" id="add-picture" disabled>添加</button>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="myModal2">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button aria-hidden="true" class="close" data-dismiss="modal" type="button">&times;</button>
                <h4 class="modal-title">
                    项目图片上传
                </h4>
            </div>
            <div class="modal-body">
                <form action="" class="form-horizontal" id="picture-form2">
                    <div class="form-group">
                        <label class="control-label col-md-2">图片名称</label>

                        <div class="col-md-7">
                            <input class="form-control" name="picName" id="picName2" placeholder="请输入图片名称" type="text"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-md-2">图片</label>

                        <div class="col-md-3">
                                    <span class="btn btn-success fileinput-button">
					                    <i class="glyphicon glyphicon-plus"></i>
					                    <span>上传</span>
					                    <input type="file" name="file" id="fileupload2">
					                </span>
                            <img src="" id="target2" width="200px;"/>

                            <div class="alert alert-danger" style="display: none;width: 300px;">
                                <button class="close" data-dismiss="alert" type="button">&times;</button>
                                <span class="alert-content"></span>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button class="btn btn-default-outline" data-dismiss="modal" type="button">关闭</button>
                <button class="btn btn-primary" id="add-picture2" disabled>添加</button>
            </div>
        </div>
    </div>
</div>

<script src="${basePath}js/select2.js" type="text/javascript"></script>
<script src="${basePath}js/bootstrap-fileupload.js" type="text/javascript"></script>
<script src="${basePath}js/jquery-fileupload/jquery.ui.widget.js" type="text/javascript"></script>
<script src="${basePath}js/jquery-fileupload/jquery.fileupload.js" type="text/javascript"></script>
<script src="${basePath}js/jquery.validate.js" type="text/javascript"></script>
<script src="${basePath}js/jquery.fancybox.pack.js" type="text/javascript"></script>
<script src="${basePath}js/bootstrap-datepicker.js" type="text/javascript"></script>
<script src="${basePath}js/ueditor/ueditor.config.js" type="text/javascript"></script>
<script src="${basePath}js/ueditor/ueditor.all.min.js" type="text/javascript"></script>
<script src="${basePath}js/ueditor/ueditor.parse.min.js" type="text/java script"></script>
<script type="text/javascript">
    $(function () {
        $(".datepicker").datepicker({
            format: 'yyyy-mm-dd'
        });
        var ue = UE.getEditor('container', {
            initialFrameHeight: 100,
            allowDivTransToP: false
        });
//        UE.getEditor('editor').addOutputRule(function (root) {
//            // 这里是在解决一个ueditor的bug(对我来说是个bug), 每次编辑框获取焦点的时候都会自动插入<p><br/></p>
//            // 只处理第一个空的段落，后面的段落可能是人为添加
//            var firstPNode = root.getNodesByTagName("p")[0];
//            firstPNode && /^\s*(<br\/>\s*)?$/.test(firstPNode.innerHTML()) && firstPNode.parentNode.removeChild(firstPNode);
//        });
        $('#selectEnterprise').select2({
            placeholder: "请输入企业名称搜索",
            minimumInputLength: 0,
            ajax: {
                url: "${basePath}enterprise/list/usable?type=0",
                dataType: 'json',
                quietMillis: 100,
                data: function (term) {
                    return {
                        keyword: term, //search term
                    };
                },
                results: function (data) {
                    return {results: data};
                }
            },
            initSelection: function (element, callback) {
                callback({id: '${project.enterpriseId}', name: '${project.enterprise.name}'});//调用formatSelection
            },
            formatResult: function (object, container, query) {
                return object.name;
            },
            formatSelection: function (object, container) {
                //选中时触发
                return object.name;
            },
            escapeMarkup: function (m) {
                return m;
            } // we do not want to escape markup since we are displaying html in results
        });


        $(".upload-picture").on("click", ".icon-trash", function () {
            var $this = $(this);
            if (confirm("您确定要删除该图片吗?,图片一旦删除，将不可恢复!")) {
                var picId = $this.parent().parent().attr("picId");
                $.ajax({
                    url: "delete/picture?id=" + picId,
                    type: "post",
                    dataType: "json",
                    success: function (data) {
                        if (data.status == "success") {
                            $("#picture-" + picId).remove();
                            $this.parent().parent().remove();
                        } else {
                            alert("服务器忙,请稍后重试");
                        }
                    }
                });
            }
            return false;
        });
        //进来清空
        $(".upload-picture").click(function () {
            $("#picName").val("");
            $("#target").attr("src", "");
            $("#add-picture").attr("disabled", true);

            $("#picName2").val("");
            $("#target2").attr("src", "");
            $("#add-picture2").attr("disabled", true);
        });
        $(".fancybox").fancybox({
            maxWidth: 700,
            height: 'auto',
            fitToView: false,
            autoSize: true,
            padding: 15,
            nextEffect: 'fade',
            prevEffect: 'fade',
            helpers: {
                title: {
                    type: "outside"
                }
            }
        });
        $("#fileupload").fileupload({
            url: "upload?type=1",
            maxFileSize: 10000000, //10M
            autoUpload: false, //不自动上传
            acceptFileTypes: /(\.|\/)(gif|jpe?g|png|bmp)$/i,
            formData: new FormData().append("picName", $.trim($("#picName").val())),
            add: function (e, data) {
                var file = data.files[0];
                if (!new RegExp(/(\.|\/)(gif|jpe?g|png|bmp)$/i).test(file.type)) {
                    $(".alert-danger .alert-content").text("错误的图片类型");
                    $(".alert-danger").fadeIn().delay(2000).fadeOut();
                    return false;
                }
                if (file.size > 512000) {//10M
                    $(".alert-danger .alert-content").text("图片大于500K");
                    $(".alert-danger").fadeIn().delay(2000).fadeOut();
                    return false;
                }
                var reader = new FileReader();
                reader.onload = function (e) {
                    $('#target').attr('src', e.target.result);
                };
                reader.readAsDataURL(file);
                data.context = $("#add-picture").unbind("click").bind("click", function () {
                    if ($.trim($("#picName").val()) == '') {
                        alert("请输入图片名称");
                        return;
                    }
                    data.submit();
                });
                $("#add-picture").attr("disabled", false);
            },
            done: function (e, result) {
                var data = JSON.parse(result.result);
                if (data.status == "error") {
                    $(".alert-danger .alert-content").text(data.message);
                    $(".alert-danger").fadeIn().delay(2000).fadeOut();
                } else {
                    var $html = $('<a class="gallery-item fancybox" rel="g1" title="" picId="">' +
                            '<img src="" />' +
                            '<div class="actions">' +
                            '<i class="icon-trash"></i><i class="icon-zoom-in"></i>' +
                            '</div>' +
                            '</a>');
                    var path = '${aPath}upload/' + data.object.picturePath;
                    $html.attr("href", path).attr("title", data.object.name).attr("picId", data.object.id);
                    $html.find("img").attr("src", path);
                    $html.insertBefore($("#enterprise-picture"));
                    $("#myModal").modal("hide");
                    //添加隐藏输入框 保存当前的图片ID
                    $("#validate-form").append('<input id="picture-' + data.object.id + '" type="hidden" name="picture" value="' + data.object.id + '"/>');
                }
            }
        });

        $("#fileupload2").fileupload({
            url: "upload?type=2",
            autoUpload: false, //不自动上传
            formData: new FormData().append("picName", $.trim($("#picName2").val())),
            add: function (e, data) {
                var file = data.files[0];
                if (!new RegExp(/(\.|\/)(gif|jpe?g|png|bmp)$/i).test(file.type)) {
                    $(".alert-danger .alert-content").text("错误的图片类型");
                    $(".alert-danger").fadeIn().delay(2000).fadeOut();
                    return false;
                }
                if (file.size > 512000) {//10M
                    $(".alert-danger .alert-content").text("图片大于500k");
                    $(".alert-danger").fadeIn().delay(2000).fadeOut();
                    return false;
                }
                var reader = new FileReader();
                reader.onload = function (e) {
                    $('#target2').attr('src', e.target.result);
                };
                reader.readAsDataURL(file);
                data.context = $("#add-picture2").unbind("click").bind("click", function () {
                    if ($.trim($("#picName2").val()) == '') {
                        alert("请输入图片名称");
                        return;
                    }
                    data.submit();
                });
                $("#add-picture2").attr("disabled", false);
            },
            added: function (e, data) {
                console.log(data.files);
            },
            done: function (e, result) {
                var data = JSON.parse(result.result);
                console.log(data);
                if (data.status == "error") {
                    $(".alert-danger .alert-content").text(data.message);
                    $(".alert-danger").fadeIn().delay(2000).fadeOut();
                } else {
                    var $html = $('<a class="gallery-item fancybox" rel="g1" title="" picId="">' +
                            '<img src="" />' +
                            '<div class="actions">' +
                            '<i class="icon-trash"></i><i class="icon-zoom-in"></i>' +
                            '</div>' +
                            '</a>');
                    var path = '${aPath}upload/' + data.object.picturePath;
                    $html.attr("href", path).attr("title", data.object.name).attr("picId", data.object.id);
                    $html.find("img").attr("src", path);
                    $html.insertBefore($("#borrow-picture"));
                    $("#myModal2").modal("hide");
                    //添加隐藏输入框 保存当前的图片ID
                    $("#validate-form").append('<input id="picture-' + data.object.id + '" type="hidden" name="picture2" value="' + data.object.id + '"/>');
                }
            }
        });

        $('.select2able').select2();
        $("#validate-form").validate({
            rules: {
                title: {
                    required: true,
                    maxlength: 128,
                    remote: {
                        url: "checkName?id=${project.id}",     //后台处理程序
                        type: "get",
                        dataType: "json",
                        data: {                     //要传递的数据
                            username: function () {
                                return $("#title").val();
                            }
                        }
                    }
                },
                annualized: {
                    range: [0, 1]
                },
                deadline: {
                    date: true
                },
                limitDays: {
                    digits: true
                },
                totalAmount: {
                    digits: true
                },
                projectDescription: {
                    maxlength: 1024
                },
                useOfFunds: {
                    maxlength: 1024
                },
                repaymentSource: {
                    maxlength: 1024
                },
                investorsNum: {
                    digits: true
                },
                collateralInfo: {
                    maxlength: 1024
                },
                riskControlMethod: {
                    maxlength: 1024
                },
                involvingLawsuitInfo: {
                    maxlength: 1024
                },
                suggestion: {
                    maxlength: 1024
                }
            },
            messages: {
                title: {
                    required: "请输入项目名",
                    maxlength: "项目名不超过128个字符",
                    remote: "项目名称已存在"
                },
                annualized: {
                    range: "请输入0-1之间的小数"
                },
                deadline: {
                    date: "请输入正确的时间格式"
                },
                limitDays: {
                    digits: "请输入正确的整数"
                },
                totalAmount: {
                    digits: "请输入正确的整数"
                },
                projectDescription: {
                    maxlength: "不能超过1024个字符"
                },
                useOfFunds: {
                    maxlength: "不能超过1024个字符"
                },
                repaymentSource: {
                    maxlength: "不能超过1024个字符"
                },
                investorsNum: {
                    digits: "请输入正确的整数"
                },
                collateralInfo: {
                    maxlength: "不能超过1024个字符"
                },
                riskControlMethod: {
                    maxlength: "不能超过1024个字符"
                },
                involvingLawsuitInfo: {
                    maxlength: "不能超过1024个字符"
                },
                suggestion: {
                    maxlength: "不能超过1024个字符"
                }
            }
        });
        var detailOption = {
            placeholder: "请选债权模版",
            minimumInputLength: 0,
            ajax: {
                url: "${basePath}project/getContractTitleList",
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
                callback({id: '${map.detailId}', title: '${map.detailTitle}'});//调用formatSelection
            },
            formatResult: function (object, container, query) {
                return object.title;
            },
            formatSelection: function (object, container) {
                //选中时触发
                var id = object.id;
                $('#detailId').val(id);
                return object.title;
            },
            escapeMarkup: function (m) {
                return m;
            } // we do not want to escape markup since we are displaying html in results
        };
        $('#detailId').select2(detailOption);

        <c:if test="${!empty map.userId}">
        var option = {
            placeholder: "请输入用户昵称、手机号或者真实姓名搜索",
            minimumInputLength: 0,
            multiple: true,
            ajax: {
                url: "${basePath}user/useSuperInvestor",
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
                callback({id: '${map.userId}', username: '${map.username}', phone: '${map.phone}'});//调用formatSelection
            },
            formatResult: function (object, container, query) {
                return object.username + "(" + object.phone + ")";
            },
            formatSelection: function (object, container) {
                //选中时触发

                $.ajax({
                    type: "GET",
                    url: "${basePath}project/userAssetsBalance",
                    data: {userId: object.id, totalAmount: $("#totalAmount").val()},
                    dataType: "json",
                    success: function (adata) {
                        if (adata) {
                            alert("超级投资人余额不足");
                        }
                    }
                });
                return object.username + "(" + object.phone + ")";
            },
            escapeMarkup: function (m) {
                return m;
            }, // we do not want to escape markup since we are displaying html in results
        };

        $('#selectUser').select2(option);
        </c:if>

        $.ajax({
            type: "GET",
            url: "${basePath}product/ajaxProductList",
            data: {status: 1},
            dataType: "json",
            success: function (adata) {
                var html = "";
                var id = ${project.productId};
                for(var i=0;i<adata.length;i++) {
                    if(adata[i] != null){
                        var defaultCheck="";
                        if(id == adata[i]["id"]) {
                            defaultCheck = " checked";
                        }
                        html = html + "<label class='radio-inline'><input name='productId' type='radio' value="+adata[i]["id"]+defaultCheck+">"
                                +"<span>"+adata[i]["name"]+"</span></label>";
                    }
                }
                $("#divProductList").html(html);
            }
        });
    });

    <%--function checkCreditorConfig() {--%>
    <%--var projectId = ${project.id };--%>
    <%--var flag = false;--%>
    <%--$.ajax({--%>
    <%--url: '${basePath}project/checkProjectHasCreditor',--%>
    <%--type: 'get',--%>
    <%--data: 'projectId=' + projectId,--%>
    <%--async: false,--%>
    <%--dataType: "json",--%>
    <%--success: function (result) {--%>
    <%--if (result) {--%>
    <%--flag = true;--%>
    <%--alert("保存成功");--%>
    <%--} else {--%>
    <%--alert("保存失败，未配置债权信息");--%>
    <%--flag = false;--%>
    <%--}--%>
    <%--}--%>
    <%--});--%>
    <%--return flag;--%>
    <%--}--%>
</script>
</body>
</html>