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
			var biaoti = $(this).parents("tr").find("th:eq(1)").text();
			var canshuzhi = $(this).parents("tr").find("th:eq(2)").text();
			
			$("#cId_upd_input").val(idd);
			$("#cTypeA_upd_input").val(biaoti);
			$("#cTypeB_upd_input").val(canshuzhi);
			
			
			$("#updatecanshu").modal({
				backdrop:"static"
			});
			
			
		});
		//点击提交按钮
		$(".tijiao").click(function(){
			
			var id =  $("#cId_upd_input").val();
			
			var canshu = $("#cTypeB_upd_input").val();
			
			$.ajax({
				url:"${APP_PATH }/xiugaicanshu1",
				type:"PUT",
				data:"id="+id+"&canshu="+canshu,
				success:function(result){
					location.reload();
				}
			})
			
		});
		
		
	})
</script>
	
</head>
<body>


<!-- 修改参数模态框 -->
<div class="modal fade" id="updatecanshu" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">修改参数配置</h4>
      </div>
      <div class="modal-body">
       	<form class="form-horizontal">
		     
		     <input type="text" name="Id" readonly  unselectable="on" class="form-control33" id="cId_upd_input"  />

		  <div class="form-group">
		    <label class="col-sm-2 control-label">标题</label>
		    <div class=" col-sm-10" id="biaoti" >
		    <input type="text" readonly  unselectable="on" value="" name="cTypeB" class="form-control" id="cTypeA_upd_input" >
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">配置值</label>
		    <div class="col-sm-10">
		      <input type="text" value="" name="cTypeB" class="form-control" id="cTypeB_upd_input" >
		     
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

	
	<!-- 正文表数据 -->
	<div class="container-fluid">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h3>配置参数</h3>
			</div>
		</div>
		<br>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md10">
				<table class="table table-hover">
					<tr>
						<th>ID</th>
						<th>标题</th>
						<th>配置值</th>
						<th>操作</th>
						
						
						
					</tr>
					<c:forEach items="${canshu.list }" var="reca">
						<tr>
							<th>${reca.id }</th>
							<th>${reca.biaoti }</th>
							<th>${reca.value }</th>
												
							<th><button   class="btn btn-primary xiugai record_get_model_btn btn-sm">
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