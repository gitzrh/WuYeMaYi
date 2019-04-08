<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<title>运营中心</title>
<link rel="stylesheet" href="${APP_PATH }/Home/css/stylesheet.css">
<link rel="stylesheet" href="${APP_PATH }/Home/css/stylesheet_PC.css" media="screen and (min-width:1000px)">
<script src="${APP_PATH }/Home/js/jquery-3.2.1.min.js"></script>
<script src="${APP_PATH }/Home/js/comment.js"></script>
<script src="${APP_PATH }/Home/js/layer.js"></script>
<link rel="stylesheet" href="${APP_PATH }/Home/css/layer.css">
	<style>
	input {
			outline: none !important;
		}
		.tx{
			width: 15rem;
		    height: 7rem;
		    font-size: 4rem;
		    margin-left: 2rem;
		    background: none;
		    color: #Fff;
		}
	</style>
</head>

<body class="bodyHeight" style="height: 1967px;">
	<div class="pageTitleDiv">
		<div class="backButton">
			返回
		</div>
		<span class="pageTitleText">
			运营中心
		</span>
	</div>
	
	<div class="messageDidsplayDiv">
		<div class="leftMessage">等级：</div>
		<input type="text" value="${yyzx.yyzxlvid -1 }" readonly="readonly" name="realname" class="rightMessage" style="border:none">
	</div>
	<div class="messageDidsplayDiv">
		<div class="leftMessage">直推人数：</div>
		<input type="text" value="${yyzx.ztnum }人" readonly="readonly" name="realname" class="rightMessage" style="border:none">
	</div>
			<div class="messageDidsplayDiv">
		<div class="leftMessage">团队人数：</div>
		<input type="text" value="${yyzx.yynum }人" readonly="readonly" name="realname" class="rightMessage" style="border:none">
	</div>
	<div class="messageDidsplayDiv">
		<div class="leftMessage">运营津贴：</div>
		<input type="text" value="${yyzx.yyjinbi }" readonly="readonly" name="realname" class="rightMessage" style="border:none">
	</div>

	<script>
	$('.backButton').click(function(){
		window.location.href="${APP_PATH }/toUserShou";
    	})
	
	</script>

</body>
</html>