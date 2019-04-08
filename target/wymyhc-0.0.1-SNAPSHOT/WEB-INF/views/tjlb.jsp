<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>推荐列表</title>

<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="stylesheet" href="${APP_PATH }/Home/css/stylesheet.css">
<link rel="stylesheet" href="${APP_PATH }/Home/css/stylesheet_PC.css" media="screen and (min-width:1000px)">
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
			推荐列表
		</span>
	</div>


	<!--推荐列表-->
	<div class="selectedDiv selected_1">
	
	    <c:forEach items="${tjkusers }" var="reca">
			<div class="detailsDiv">
				<div class="details_Data">
					注册时间：${reca.jihuotime }				<!--向下三角形-->
					<div style=" border-top: solid 30px #FFF; border-left: solid 15px transparent; border-right: solid 15px transparent; display: inline-block;float: right;"></div>
				</div>
				<div class="details_MessageRow">
					<span class="details_LeftMessage">
						会员帐号：
					</span>
					<span class="details_RightMessage">
						${reca.zhanghao }
					</span>
					<span class="details_LeftMessage">
						会员姓名：
					</span>
					<span class="details_RightMessage">
						${reca.zhenshiname }
					</span>
					<span class="details_LeftMessage">
						手机号码：
					</span>
					<span class="details_RightMessage">
						${reca.zhenshishoujihao }
					</span>
					<span class="details_LeftMessage">
						推荐人数：
					</span>
					<span class="details_RightMessage">
						${reca.tjrs }
					</span>
					<span class="details_LeftMessage">
						出局轮数：
					</span>
					<span class="details_RightMessage">
						${reca.suozailunshu }
					</span>
				</div>
			</div>
		</c:forEach>
	</div>
	<!--推荐列表 END-->

<script type="text/javascript">
    $('.backButton').click(function(){
        window.location.href="${APP_PATH }/toUserShou";
    })
</script>

</html>