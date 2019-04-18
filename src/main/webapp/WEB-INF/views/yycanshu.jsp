<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<title>Insert title here</title>
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="shortcut  icon" type="image/x-icon" href="${APP_PATH }/Home/img/bitbug_favicon.ico" media="screen"/>
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

<script type="text/javascript">
	$(function(){
		
		//修改参数
		$(".xiugai").click(function(){
			$("#cId_upd_input").hide();
			var idd = $(this).parents("tr").find("th:eq(0)").text();
			var lvname = $(this).parents("tr").find("th:eq(1)").text();
			var fulijin = $(this).parents("tr").find("th:eq(2)").text();
			var zongrenshu = $(this).parents("tr").find("th:eq(3)").text();
			var zhituishu = $(this).parents("tr").find("th:eq(4)").text();
			var zhekoubi = $(this).parents("tr").find("th:eq(5)").text();
			
			$("#cId_upd_input").val(idd);
			$("#LV_upd_input").val(lvname);
			$("#JB_upd_input").val(fulijin);
			$("#ZR_upd_input").val(zongrenshu);
			$("#ZT_upd_input").val(zhituishu);
			$("#ZK_upd_input").val(zhekoubi);
			
			
			$("#updatecanshu").modal({
				backdrop:"static"
			});
			
			
		});
		//点击提交按钮
		$(".tijiao").click(function(){
			
			var id =  $("#cId_upd_input").val();
			var lvname = $("#LV_upd_input").val();
			var fulijin = $("#JB_upd_input").val();
			var zongrenshu = $("#ZR_upd_input").val();
			var zhituishu = $("#ZT_upd_input").val();
			var zhekoubi = $("#ZK_upd_input").val();
			
			
			$.ajax({
				url:"${APP_PATH }/xiugaicanshu2",
				type:"PUT",
				data:"id="+id+"&lvname="+lvname+"&fulijin="+fulijin+"&zongrenshu="+zongrenshu+"&zhituishu="+zhituishu+"&zhekoubi="+zhekoubi,
				success:function(result){
					location.reload();
				}
			})
			
		});
		//点击新增
		$("#add_bao").click(function(){
			
			$("#addcanshu").modal({
				backdrop:"static"
			});
		});
		//点击确认新增
			$(".queding").click(function(){
				var lvname = $("#L_upd_input").val();
				var fulijin = $("#J_upd_input").val();
				var zongrenshu = $("#Z_upd_input").val();
				var zhituishu = $("#Z_upd_input").val();
				var zhekoubi = $("#Z_upd_input").val();
		
				$.ajax({
					url:"${APP_PATH }/addcanshu",
					type:"POST",
					data:"lvname="+lvname+"&fulijin="+fulijin+"&zongrenshu="+zongrenshu+"&zhituishu="+zhituishu+"&zhekoubi="+zhekoubi,
					success:function(result){
						location.reload();
					}
				})
			});
	})
	
	</script>
</head>
<body>
<!-- 新增模态框 -->
<div class="modal fade" id="addcanshu" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">运营中心-增加参数</h4>
      </div>
      <div class="modal-body">
       	<form class="form-horizontal">
		  <div class="form-group">
		    <label class="col-sm-2 control-label">等级名称</label>
		    <div class=" col-sm-10" id="biaoti" >
		    <input type="text"  value="" name="cTypeB" class="form-control" id="L_upd_input" >
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">福利金</label>
		    <div class="col-sm-10">
		      <input type="text" value="" name="cTypeB" class="form-control" id="J_upd_input" >
		     
		    </div>
		    </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">升级需要总人数</label>
		    <div class="col-sm-10">
		      <input type="text" value="" name="cTypeB" class="form-control" id="Z_upd_input" >
		     
		    </div>
		    </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">升级需要直推人数</label>
		    <div class="col-sm-10">
		      <input type="text" value="" name="cTypeB" class="form-control" id="Z_upd_input" >
		     
		    </div>
		  </div>		    		  
		  <div class="form-group">
		    <label class="col-sm-2 control-label">折扣比例</label>
		    <div class="col-sm-10">
		      <input type="text" value="" name="cTypeB" class="form-control" id="Z_upd_input" >
		     
		    </div>
		  </div>		    		  
		 </form>
       		   
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary queding" >确定</button>
      </div>
    </div>
  </div>
</div>

<!-- 修改参数模态框 -->
<div class="modal fade" id="updatecanshu" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">运营中心-参数修改</h4>
      </div>
      <div class="modal-body">
       	<form class="form-horizontal">
		     
		     <input type="text" name="Id" class="form-control33" id="cId_upd_input" readonly  unselectable="on" />

		  <div class="form-group">
		    <label class="col-sm-2 control-label">等级名称</label>
		    <div class=" col-sm-10" id="biaoti" >
		    <input type="text"  value="" name="cTypeB" class="form-control" id="LV_upd_input" >
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">福利金</label>
		    <div class="col-sm-10">
		      <input type="text" value="" name="cTypeB" class="form-control" id="JB_upd_input" >
		     
		    </div>
		    </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">升级需要总人数</label>
		    <div class="col-sm-10">
		      <input type="text" value="" name="cTypeB" class="form-control" id="ZR_upd_input" >
		     
		    </div>
		    </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">升级需要直推人数</label>
		    <div class="col-sm-10">
		      <input type="text" value="" name="cTypeB" class="form-control" id="ZT_upd_input" >
		     
		    </div>
		  </div>		    		  
		  <div class="form-group">
		    <label class="col-sm-2 control-label">折扣比例</label>
		    <div class="col-sm-10">
		      <input type="text" value="" name="cTypeB" class="form-control" id="ZK_upd_input" >
		     
		    </div>
		  </div>		    		  
		 </form>
       		   
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary tijiao" >提交</button>
      </div>
    </div>
  </div>
</div>

	<!-- 表正文 -->
	<div class="container-fluid">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h3>配置参数-运营中心等级</h3>
			</div>
		</div>
		<div class="row">
			<div class="col-md-2 col-md-offset-10" >
				<button class="btn btn-primary" id="add_bao">新增</button>
			</div>
		</div>
		<br>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md10">
				<table class="table table-hover">
					<tr>
						<th>ID</th>
						<th>等级名称</th>
						<th>福利金</th>
						<th>升级需要总人数</th>
						<th>升级需要直推人数</th>
						<th>折扣比例</th>
						<th>操作</th>
						
						
						
					</tr>
					<c:forEach items="${yycanshu.list }" var="reca">
						<tr>
							<th>${reca.id }</th>
							<th>${reca.lvname }</th>
							<th>${reca.fulijin }</th>
							<th>${reca.zongnum }</th>
							<th>${reca.zhituinum }</th>
							<th>${reca.zhekoubili }</th>
												
							<th><button   class="btn xiugai btn-primary yycans_get_model_btn btn-sm">
								<span class="glyphicon glyphicon-list" aria-hidden="true"></span>
								编辑
								</button></th>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>

</body>
</html>