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
				$(".btn-success").click(function(){
					$("#xinzenglunbotu").modal({
						backdrop:"static"
					});
				}); 
				
				$(".btn-danger").click(function(){
					var id = $(this).attr("name");
					
					$.ajax({
						url:"${APP_PATH}/deletetp",
						type:"GET",
						data: "id="+id,
						success:function(result){
							var code = result.code;
		        	    	if (code == 100) {
		        	    		alert("删除成功!")
		        	    		location.reload();
							}
		        	    	
						}
					})
					
					
				});
				
			})
		  
			function validate(){
			  var a=document.getElementById("file");
			  var form=document.getElementById("upload");
			  if(a.value==""){		   
				   alert("请先选择图片");
		           return false;
				  }
			  else{
				  form.submit();
				  location.reload();
			  }		  
		  }
			
		 
						 
</script>

		<div class="modal fade" id="xinzenglunbotu" tabindex="-1" role="dialog">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		    
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title">新增图片</h4>
		      </div>
		      
		      <form id="upload" action="${APP_PATH }/thumb" method="post" enctype="multipart/form-data" >
				<input id="file" type="file" name="image" id="image" >  
				<input  type="submit" value="上传" onclick="validate()">
				<a class="mas"></a>
		      </form>
		      
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
		      </div>
		    </div>
		  </div>
		</div>
		
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h3>轮播图管理</h3>
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
							<th>图片</th>
							<th>操作</th>
							<th>
								<button type="button" class="btn btn-success">新增</button>
							</th>
						</tr>
						
						<c:forEach items="${lunbotuls }" var="reca">
							<tr>
								<th>${reca.id }</th>
								<th>
									<img style="width: 10%" src="${reca.zhuangtaiid }"/>
								</th>
								<th>
									<button class="btn btn-danger" name="${reca.id }">
										<span class="glyphicon glyphicon-list" aria-hidden="true"></span>
										删除
									</button>
								</th>
							</tr>
						</c:forEach>
						
					</tbody>
				</table>
			</div>
		</div>
		
	</div>
</html>