<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%
		pageContext.setAttribute("APP_PATH", request.getContextPath());
	%>
	<title>资金提现</title>
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
	</style>
</head>

<body class="bodyHeight" style="height: 1942px;">
	<!--topTitle -->
	<div class="pageTitleDiv">
		<div class="backButton">
			返回
		</div>
		<span class="pageTitleText">
			合伙人申请
		</span>
	</div>
	
	<form class="selectedDiv">
		<span style="color:#fff;text-align:center;display:block;font-size:5.0rem;margin-top:30%;">拒绝了您的申请,您可以重新申请!</span>
		
		<div class="etermineButton" id="hhrbtn" style="margin-top:25%;">
           	重新申请
       	</div>
	</form>
	
		

<script type="text/javascript">

	$('.backButton').click(function(){
	    window.location.href="${APP_PATH }/toUserShou";
	})
	
	$('.etermineButton').click(function(){
	    window.location.href="${APP_PATH }/cxsq";
	})

</script>

</body>
</html>