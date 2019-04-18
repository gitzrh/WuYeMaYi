<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户中心-待激活</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="shortcut  icon" type="image/x-icon" href="${APP_PATH }/Home/img/bitbug_favicon.ico" media="screen"/>
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">

	$(function(){
		$(".qidong").click(function(){
			
			var ddhh = $(this).parent().parent().find("th:eq(2)").text();
			var textt = $(this).parent().parent().find("th:eq(1)").text();
			var tzhanghao = $(this).parent().parent().find("th:eq(3)").text();
			
			if(confirm("确定要激活【"+ textt +"】吗？")){
				
				
			
			$.ajax({
				url:"${APP_PATH }/qidong",
				type:"PUT",
				data:"zhanghao="+ddhh+"&tzhanghao="+tzhanghao,
				success:function(result){
					
						
						location.reload();
					

				}
				
				})
			}
		})
			
		//删除	
		$(".chuanchu").click(function(){
			var zhanghao = $(this).parent().parent().find("th:eq(2)").text();
			var textt = $(this).parent().parent().find("th:eq(1)").text();
			if(confirm("确定要删除【"+ textt +"】吗？")){
				
				$.ajax({
					url:"${APP_PATH }/shanchuwei",
					type:"POST",
					data:"zhanghao="+zhanghao,
					success:function(result){
						
							
							location.reload();
						

					}
					
					})
				
				
			}
			
		})
			
	 $("#fabhui").click(function(){
		 location.reload();
	 })
	})
</script>		
</head>
<body>

<!-- 搭建显示页面 -->
	<div class="container-fluid">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h3>用户中心  — 待审核</h3>
			</div>
		</div>
		<br>
		<div class="col-md-4 col-lg-8" align="right">
		    <div class="input-group">
		      <span class="input-group-btn">
		        <button class="btn btn-primary"  id="fabhui" type="button">刷新</button>
		      </span>
		    </div>
		  </div>
		  <br><br>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md10">
				<table class="table table-hover">
					<tr>
						<th>UID</th>
						<th>姓名</th>
						<th>账号</th>
						<th>推荐人账号</th>
						<th>注册时间</th>
						<th>运营编号</th>
						<th>状态</th>
						<th>操作</th>
						
						
					</tr>
					<c:forEach items="${pageInfo.list }" var="reca">
						<tr>
							<th>${reca.kid }</th>
							<th>${reca.khname }</th>
							<th>${reca.zhanghao }</th>
							<th>${reca.tzhanghao }</th>
							<th>${reca.zhucetime }</th>
							<th>${reca.yyzxid }</th>
							<th>${reca.zhuangtai.zhuangtai }</th>
							<th>
								<button  id="qidong" class="btn qidong btn-primary record_get_model_btn btn-sm">
								<span class="glyphicon glyphicon-list" aria-hidden="true"></span>
								启动
								</button>
								<button   class=" chuanchu btn btn-danger record_get_model_btn btn-sm">
								<span class="glyphicon glyphicon-list" aria-hidden="true"></span>
								删除
								</button>
								
							</th>
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
					<li><a href="${APP_PATH }/getallwei?pn=1">首页</a></li>
					<c:if test="${pageInfo.hasPreviousPage }">
						<li><a href="${APP_PATH }/getallwei?pn=${pageInfo.pageNum-1}"
							aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
						</a></li>
					</c:if>


					<c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
						<c:if test="${page_Num == pageInfo.pageNum }">
							<li class="active"><a href="#">${page_Num }</a></li>
						</c:if>
						<c:if test="${page_Num != pageInfo.pageNum }">
							<li><a href="${APP_PATH }/getallwei?pn=${page_Num }">${page_Num }</a></li>
						</c:if>

					</c:forEach>
					<c:if test="${pageInfo.hasNextPage }">
						<li><a href="${APP_PATH }/getallwei?pn=${pageInfo.pageNum+1 }"
							aria-label="Next"> <span aria-hidden="true">&raquo;</span>
						</a></li>
					</c:if>
					<li><a href="${APP_PATH }/getallwei?pn=${pageInfo.pages}">末页</a></li>
				</ul>
				
				</nav>
			</div>
		</div>
		
	</div>
	


</body>
</html>