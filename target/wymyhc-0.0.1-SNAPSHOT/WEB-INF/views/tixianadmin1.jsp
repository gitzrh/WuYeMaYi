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
<!-- web路径：
不以/开始的相对路径，找资源，以当前资源的路径为基准，经常容易出问题。
以/开始的相对路径，找资源，以服务器的路径为标准(http://localhost:3306)；需要加上项目名
		http://localhost:3306/crud
 -->
<script type="text/javascript"
	src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link
	href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">

	$(function(){
		$(".tongguo").click(function(){
			
			var ddhh = $(this).parent().parent().find("th:eq(0)").text();
			var textt = $(this).parent().parent().find("th:eq(7)").text();
			
			
			if(confirm("确定通过【"+ textt +"】的提现吗？")){
				
				
			
			$.ajax({
				url:"${APP_PATH }/tixiantguo",
				type:"PUT",
				data:"id="+ddhh,
				success:function(result){
					
						
						location.reload();
					

				}
				
				})
			}
		})
			
		
		$(".jujue").click(function(){
			var ddhh = $(this).parent().parent().find("th:eq(0)").text();
			var textt = $(this).parent().parent().find("th:eq(7)").text();
			
			var zhanghao = $(this).parent().parent().find("th:eq(1)").text();
			var jibileixing = $(this).parent().parent().find("th:eq(2)").text();
			var jibbishu = $(this).parent().parent().find("th:eq(3)").text();
			
			if(confirm("确定拒绝【"+ textt +"】的提现吗？")){
				
				
				
				$.ajax({
					url:"${APP_PATH }/jujuetixian",
					type:"PUT",
					data:"id="+ddhh+"&zhanghao="+zhanghao+"&jibileixing="+jibileixing+"&jibbishu="+jibbishu,
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

<!-- 搭建显示页面 -->
	<div class="container-fluid">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h3>提现列表--待审核</h3>
			</div>
		</div>
		<br>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md10">
				<table class="table table-hover">
					<tr>
						<th>TID</th>
						<th>提现账号</th>
						<th>金币类型</th>
						<th>提现金币</th>
						<th>手续费</th>
						<th>实际到账</th>
						<th>申请时间</th>
						<th>持卡人姓名</th>
						<th>银行名字</th>
						<th>开户地址</th>
						<th>银行卡号</th>
						<th>状态</th>
						<th>操作</th>
						
						
					</tr>
					<c:forEach items="${pageInfo.list }" var="reca">
						<tr>
							<th>${reca.id }</th>
							<th>${reca.zhanghao }</th>
							<th>${reca.jinbileixing }</th>
							<th>${reca.txjibi }</th>
							<th>${reca.shouxufei }</th>
							<th>${reca.shijidaozhang }</th>
							<th>${reca.tixiantime }</th>
							<th>${reca.username }</th>
							<th>${reca.yinhangname }</th>
							<th>${reca.kaihudizhi }</th>
							<th>${reca.yinhangkaid }</th>
							<th>${reca.zhuangtai.zhuangtai }</th>
							
							<th>
								<button  id="tongguo" class=" tongguo btn  btn-primary record_get_model_btn btn-sm">
									<span class="glyphicon glyphicon-list" aria-hidden="true"></span>
									通过
								</button>
								<button  id="jujue" class=" jujue btn  btn-primary record_get_model_btn btn-sm">
									<span class="glyphicon glyphicon-list" aria-hidden="true"></span>
									拒绝
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
					<li><a href="${APP_PATH }/tixianShenhe?pn=1">首页</a></li>
					<c:if test="${pageInfo.hasPreviousPage }">
						<li><a href="${APP_PATH }/tixianShenhe?pn=${pageInfo.pageNum-1}"
							aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
						</a></li>
					</c:if>


					<c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
						<c:if test="${page_Num == pageInfo.pageNum }">
							<li class="active"><a href="#">${page_Num }</a></li>
						</c:if>
						<c:if test="${page_Num != pageInfo.pageNum }">
							<li><a href="${APP_PATH }/tixianShenhe?pn=${page_Num }">${page_Num }</a></li>
						</c:if>

					</c:forEach>
					<c:if test="${pageInfo.hasNextPage }">
						<li><a href="${APP_PATH }/tixianShenhe?pn=${pageInfo.pageNum+1 }"
							aria-label="Next"> <span aria-hidden="true">&raquo;</span>
						</a></li>
					</c:if>
					<li><a href="${APP_PATH }/tixianShenhe?pn=${pageInfo.pages}">末页</a></li>
				</ul>
				
				</nav>
			</div>
		</div>
		
	</div>
	


</body>
</html>