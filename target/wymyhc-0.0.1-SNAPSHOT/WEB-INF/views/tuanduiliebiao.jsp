<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户中心-已通过</title>
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
	 $("#fabhui").click(function(){
		 window.history.back();location.reload();
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
				<h3>团队列表</h3>
								
			</div>
		</div>
		<div class="col-md-4 col-lg-8" align="right">
		    <div class="input-group">
		      <span class="input-group-btn">
		        <button class="btn btn-primary"  id="fabhui" type="button">返回</button>
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
						<th>分享积分</th>
						<th>购车积分</th>
						<th>在途积分</th>
						<th>出局积分</th>
						<th>激活时间</th>
						<th>运营中心编号</th>
						<th>状态</th>
						<th>操作</th>
						
						
					</tr>
					<c:forEach items="${list }" var="reca">
						<tr class="tabllll">
							<th >${reca.kid }</th>
							<th >${reca.khname }</th>
							<th >${reca.zhanghao }</th>
							<th >${reca.tzhanghao }</th>
							<th id="fxjf">${reca.jifen.fxjf }</th>
							<th id="gcjf">${reca.jifen.gcjf }</th>
							<th id="ztjf">${reca.jifen.ztjf }</th>
							<th id="chjf">${reca.jifen.chjf }</th>
							<th id="jihuotime">${reca.jihuotime }</th>
							<th id="yyzxid">${reca.yyzxid }</th>
							<th id="zhuangtai">${reca.zhuangtai.zhuangtai }</th>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>

		
	</div>
	


</body>
</html>