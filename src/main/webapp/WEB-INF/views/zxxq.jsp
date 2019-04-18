<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>提现记录</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet" href="${APP_PATH }/Home/css/stylesheet.css">
<link rel="stylesheet" href="${APP_PATH }/Home/css/stylesheet_PC.css" media="screen and (min-width:1000px)">
<link rel="shortcut  icon" type="image/x-icon" href="${APP_PATH }/Home/img/bitbug_favicon.ico" media="screen"/>
<script src="${APP_PATH }/Home/js/jquery-3.2.1.min.js"></script>
<script src="${APP_PATH }/Home/js/comment.js"></script>
<style>
	input {
		outline: none !important;
	}
</style>

</head>

<body class="bodyHeight" style="height: 1797px;">
	<!--topTitle -->
	<div class="pageTitleDiv">
		<div class="backButton">
			返回
		</div>
		<span class="pageTitleText">
			资讯详情
		</span>
	</div>

	
	<form action="#" class="selectedDiv" method="post" id="myformD">
		<span style="color:#FFF;text-align:center;display:block;font-size:5.0rem;margin-top:10%;">${zixunguanlixq.head }</span>
		<span style="color:#FFF;text-align:center;display:block;font-size:3.0rem;margin-top:30%;">${zixunguanlixq.text }</span>
	</form>
		

	<script>
	
		$('.backButton').click(function(){
            window.location.href="${APP_PATH }/toUserShou";
        })
        
        

	</script>

</body>
</html>