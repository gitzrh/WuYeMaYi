<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>运营中心--申请</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<script type="text/javascript"
	src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link
	href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	
	<script type="text/javascript">
	$(function(){
		
		var id;
		var zhanghao;
		var name;
		$(".tongguo").click(function(){
			
			 id = $(this).parent().parent().find("th:eq(0)").text();
			 zhanghao = $(this).parent().parent().find("th:eq(1)").text();
			 name = $(this).parent().parent().find("th:eq(2)").text();
			
			
			
			$("#shezhibiaoma").modal({
				backdrop:"static"
			});
			
			
		})
		
		$(".tijiaoss").click(function(){
			var bianhao =$.trim($("#bianhao_upd_input").val());
			
			$.ajax({
				url:"${APP_PATH }/tongguoyysq",
				type:"PUT",
				data:"id="+id+"&zhanghao="+zhanghao+"&name="+name+"&bianhao="+bianhao,
				success:function(result){
					
						
						location.reload();
					

				}
				
			})
		
		})
		
		$(".jujue").click(function(){
			 ids = $(this).parent().parent().find("th:eq(0)").text();
			 names = $(this).parent().parent().find("th:eq(2)").text();
			 if(confirm("确定要拒绝【"+ names+"】吗？")){
			 $.ajax({
					url:"${APP_PATH }/jujueyysq",
					type:"PUT",
					data:"id="+ids,
					success:function(result){
						
							
							location.reload();
						

					}
					
				})
			 }
		})
	})
		
	</script>
</head>
<body>
	<!-- 运营中心编码设置模态框 -->
<div class="modal fade" id="shezhibiaoma" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">设置运营中心编号</h4>
      </div>
      <div class="modal-body">
       	<form class="form-horizontal">
		  <div class="form-group">
		    <div class="col-sm-6">
		     
		      <input type="text" placeholder="请输入运营中心编号" value="" name="cTypeB" class="form-control" id="bianhao_upd_input" >
		    </div>
		  </div>	
		 
		 </form>
       		   
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary tijiaoss" >提交</button>
      </div>
    </div>
  </div>
</div>
	<!-- 搭建显示页面 -->
	<div class="container-fluid">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h3>运营中心-通过审核</h3>
			</div>
		</div>
		<br>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md10">
				<table class="table table-hover">
					<tr>
						<th>ID</th>
						<th>申请人账号</th>
						<th>申请人姓名</th>
						<th>申请人联系方式</th>
						<th>申请人地址</th>
						<th>申请时间</th>
						<th>通过时间</th>
						<th>状态</th>
						<th>操作</th>
						
						
					</tr>
					<c:forEach items="${pageInfo.list }" var="reca">
						<tr>
							<th>${reca.id }</th>
							<th>${reca.sqzhanghao }</th>
							<th>${reca.sqname }</th>
							<th>${reca.sqdianhua }</th>
							<th>${reca.dizhi }</th>
							<th>${reca.sqtime }</th>
							<th>${reca.tgtime }</th>
							<th>${reca.beizhu }</th>
							
						<c:if test="${reca.zhaungtaiid=='2' }"> 
						
							<th>待审核</th> 
							<th><button   class="btn btn-primary tongguo record_get_model_btn btn-sm">
								<span class="glyphicon glyphicon-list" aria-hidden="true"></span>
								通过
								</button>
								<button   class="btn btn-primary jujue record_get_model_btn btn-sm">
								<span class="glyphicon glyphicon-list" aria-hidden="true"></span>
								拒绝
								</button>
							</th>
						
							</c:if>	
						<c:if test="${reca.zhaungtaiid=='1' }"> <th>已通过</th> 	</c:if>	
						<c:if test="${reca.zhaungtaiid=='3' }"> <th>已拒绝</th> 	</c:if>	
							
							
							
							
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>

		<!-- 显示分页信息 -->
		<div class="row">
			<!--分页文字信息  -->
			<div class="col-md-6">当前 ${pageInfo.pageNum }页,总${pageInfo.pages }
				页,总 ${pageInfo.total } 条记录</div>
			<!-- 分页条信息 -->
			<div class="col-md-6">
				<nav aria-label="Page navigation">
				<ul class="pagination  kehuhu">
					<li><a href="${APP_PATH }/yysqyem?pn=1">首页</a></li>
					<c:if test="${pageInfo.hasPreviousPage }">
						<li><a href="${APP_PATH }/yysqyem?pn=${pageInfo.pageNum-1}"
							aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
						</a></li>
					</c:if>


					<c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
						<c:if test="${page_Num == pageInfo.pageNum }">
							<li class="active"><a href="#">${page_Num }</a></li>
						</c:if>
						<c:if test="${page_Num != pageInfo.pageNum }">
							<li><a href="${APP_PATH }/yysqyem?pn=${page_Num }">${page_Num }</a></li>
						</c:if>

					</c:forEach>
					<c:if test="${pageInfo.hasNextPage }">
						<li><a href="${APP_PATH }/yysqyem?pn=${pageInfo.pageNum+1 }"
							aria-label="Next"> <span aria-hidden="true">&raquo;</span>
						</a></li>
					</c:if>
					<li><a href="${APP_PATH }/yysqyem?pn=${pageInfo.pages}">末页</a></li>
				</ul>
				
				</nav>
			</div>
		</div>
		
	</div>
</body>
</html>