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
<script type="text/javascript"
	src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link
	href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js">
	
	</script>
</head>
<body>
	<div class="container-fluid">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h3>配置参数-运营中心等级</h3>
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
												
							<th><button   class="btn btn-primary record_get_model_btn btn-sm">
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