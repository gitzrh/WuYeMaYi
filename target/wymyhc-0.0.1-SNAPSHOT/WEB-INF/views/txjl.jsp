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
			提现记录
		</span>
	</div>

	
	<div class="selectedDiv selected_1">
		<c:forEach items="${tixians }" var="reca">
		
			<div class="detailsDiv">
				<div class="details_Data">
					${reca.tixiantime }			<!--向下三角形-->
					<div style=" border-top: solid 30px #FFF; border-left: solid 15px transparent; border-right: solid 15px transparent; display: inline-block;float: right;"></div>
				</div>
				<!--信息显示块-->
				<div class="details_MessageRow">
					<span class="details_LeftMessage">
						金币类型：
					</span>
					<span class="details_RightMessage">
						${reca.jinbileixing }	 
					</span>
					<span class="details_LeftMessage">
						提现金额：
					</span>
					<span class="details_RightMessage">
						${reca.txjibi } 
					</span>
					<span class="details_LeftMessage">
						收款姓名：
					</span>
					<span class="details_RightMessage">
						${reca.username } 
					</span>
					<span class="details_LeftMessage">
						银行卡号：
					</span>
					<span class="details_RightMessage">
						${reca.yinhangkaid }
					</span>
					<span class="details_LeftMessage">
						提现状态：
					</span>
					<span class="details_RightMessage">
						<c:if test="${reca.zhuangtaiid == 5 }">
							待审核
						</c:if>
						<c:if test="${reca.zhuangtaiid == 6 }">
							已完成
						</c:if>
						<c:if test="${reca.zhuangtaiid == 7 }">
							已拒绝
						</c:if>
					</span>
				</div>
			</div>
		</c:forEach>
	</div>

	<script>
		$('.backButton').click(function(){
            window.location.href="${APP_PATH }/toUserShou";
        })
        
        

	</script>

</body>
</html>