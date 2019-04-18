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
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link rel="shortcut  icon" type="image/x-icon" href="${APP_PATH }/Home/img/bitbug_favicon.ico" media="screen"/>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

<script type="text/javascript">
 
 $(function(){
	 $("#fabhui").click(function(){
		 window.history.back();
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
				<h3>团队列表</h3>
			</div>
		</div>
		<div class="col-md-4 col-lg-8" align="right">
		    <div class="input-group">
		      <span class="input-group-btn">
		        <button class="btn btn-primary"  id="fabhui" type="button" >返回</button>
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