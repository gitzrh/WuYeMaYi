<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>轮播图管理</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<script type="text/javascript" src="${APP_PATH }/static/jquery-2.0.3.min.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<div class="container-fluid">

<script type="text/javascript">
			$(function(){
				
				$(".btn-primary").click(function(){
					var id = $(this).attr("name");
					
					$.ajax({
						url:"${APP_PATH}/selectzx",
						type:"GET",
						data: "id="+id,
						success:function(result){
							var code = result.code;
		        	    	if (code == 100) {
		        	    		var head = result.extent.zixunguanli.head;
		        	    		var text = result.extent.zixunguanli.text;
		        	    		$(".modal-ckbt").text(head);
		        	    		$(".modal-text").text(text);
							}
		        	    	
						}
					})
					
					$("#zixunchakan").modal({
						backdrop:"static"
					});
				}); 
				
				$(".btn-success").click(function(){
					
					$("#xinzengzixun").modal({
						backdrop:"static"
					});
				});
				
				
				$("#tijiao").click(function(){
					var head = $(".cTypeA_upd_input").val();
					var text = $(".in-text").val();
					$.ajax({
						url:"${APP_PATH}/indexzx",
						type:"POST",
						data: "head="+head+"&text="+text,
						success:function(result){
							var code = result.code;
		        	    	if (code == 100) {
		        	    		location.reload();
							}
						}
					})
				});
				
				$(".btn-danger").click(function(){
					var id = $(this).attr("name");
					$.ajax({
						url:"${APP_PATH}/deletezx",
						type:"POST",
						data: "id="+id,
						success:function(result){
							var code = result.code;
		        	    	if (code == 100) {
		        	    		location.reload();
							}
						}
					})
				});
				
				
			})
			
</script>
		
		<!-- 增加咨询 -->
		<div class="modal fade" id="xinzengzixun" tabindex="-1" role="dialog">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title">新增资讯</h4>
		      </div>
		      
		      <div class="modal-body">
		       	<form class="form-horizontal">
				  <div class="form-group">
				    <label class="col-sm-2 control-label">标题:</label>
				    <div class=" col-sm-10" id="biaoti" >
				    	<input type="text"  unselectable="on" value="" name="cTypeB" class="form-control cTypeA_upd_input">
				    </div>
				  </div>
				  <div class="form-group">
				    <label class="col-sm-2 control-label">内容:</label>
				    <div class="col-sm-10">
				      <textarea rows="20" cols="30" class="in-text"></textarea>
				    </div>
				  </div>		    		  
				 </form>
		      </div>
		      
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
		        <button type="button" class="btn btn-primary" id="tijiao">提交</button>
		      </div>
		    </div>
		  </div>
		</div>
		
		<!-- 查看资讯 -->
		<div class="modal fade" id="zixunchakan" tabindex="-1" role="dialog">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		    
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h3 class="modal-title modal-ckbt"></h3>
		      </div>
		      
		      <div class="form-group">
			    <h5 class="modal-title modal-text"></h5>
			  </div>
		      
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
		      </div>
		    </div>
		  </div>
		</div>
		
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h3>资讯管理</h3>
			</div>
		</div>
		<br>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md10">
				<table class="table table-hover">
					<tbody>
						<tr>
							<th>ID</th>
							<th>标题</th>
							<th>操作</th>
							<th>
								<button type="button" class="btn btn-success">新增</button>
							</th>
						</tr>
						
						<c:forEach items="${zixunguanlis }" var="reca">
							<tr>
								<th>${reca.id }</th>
								<th>${reca.head }</th>
								<th>
									<button type="button" class="btn btn-primary" name="${reca.id }">查看</button>
									<button class="btn btn-danger" name="${reca.id }">删除</button>
								</th>
							</tr>
						</c:forEach>
						
					</tbody>
				</table>
			</div>
		</div>
		
	</div>
</html>