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
			结构管理
		</span>
	</div>

	
	<div class="selectedDiv selected_1">
		    <!-- 1 -->
			<div class="detailsDiv">
				<div class="details_Data">
					1.${kuser1.zhenshiname }			<!--向下三角形-->
					<div style=" border-top: solid 30px #FFF; border-left: solid 15px transparent; border-right: solid 15px transparent; display: inline-block;float: right;"></div>
				</div>
				<!--信息显示块-->
				<div class="details_MessageRow">
					<span class="details_LeftMessage">
						账号：
					</span>
					<span class="details_RightMessage">
						${kuser1.zhanghao } 
					</span>
					<span class="details_LeftMessage">
						推荐人账号：
					</span>
					<span class="details_RightMessage">
						${kuser1.tzhanghao }
					</span>
					<span class="details_LeftMessage">
						推荐人姓名：
					</span>
					<span class="details_RightMessage">
						${kuser1.tname }
					</span>
					<span class="details_LeftMessage">
						激活时间：
					</span>
					<span class="details_RightMessage">
						${kuser1.jihuotime }
					</span>
				</div>
			</div>
			<!-- 2 -->
			<div class="detailsDiv">
				<div class="details_Data">
					2. ${kuser2.zhenshiname }		<!--向下三角形-->
					<div style=" border-top: solid 30px #FFF; border-left: solid 15px transparent; border-right: solid 15px transparent; display: inline-block;float: right;"></div>
				</div>
				<!--信息显示块-->
				<div class="details_MessageRow">
					<span class="details_LeftMessage">
						账号：
					</span>
					<span class="details_RightMessage">
						${kuser2.zhanghao } 
					</span>
					<span class="details_LeftMessage">
						推荐人账号：
					</span>
					<span class="details_RightMessage">
						${kuser2.tzhanghao }
					</span>
					<span class="details_LeftMessage">
						推荐人姓名：
					</span>
					<span class="details_RightMessage">
						${kuser2.tname }
					</span>
					<span class="details_LeftMessage">
						激活时间：
					</span>
					<span class="details_RightMessage">
						${kuser2.jihuotime }
					</span>
				</div>
			</div>
			<!-- 3 -->
			<div class="detailsDiv">
				<div class="details_Data">
					3. ${kuser3.zhenshiname }		<!--向下三角形-->
					<div style=" border-top: solid 30px #FFF; border-left: solid 15px transparent; border-right: solid 15px transparent; display: inline-block;float: right;"></div>
				</div>
				<!--信息显示块-->
				<div class="details_MessageRow">
					<span class="details_LeftMessage">
						账号：
					</span>
					<span class="details_RightMessage">
						${kuser3.zhanghao } 
					</span>
					<span class="details_LeftMessage">
						推荐人账号：
					</span>
					<span class="details_RightMessage">
						${kuser3.tzhanghao }
					</span>
					<span class="details_LeftMessage">
						推荐人姓名：
					</span>
					<span class="details_RightMessage">
						${kuser3.tname }
					</span>
					<span class="details_LeftMessage">
						激活时间：
					</span>
					<span class="details_RightMessage">
						${kuser3.jihuotime }
					</span>
				</div>
			</div>
			
			<div class="detailsDiv">
				<div class="details_Data">
					4. ${kuser4.zhenshiname }		<!--向下三角形-->
					<div style=" border-top: solid 30px #FFF; border-left: solid 15px transparent; border-right: solid 15px transparent; display: inline-block;float: right;"></div>
				</div>
				<!--信息显示块-->
				<div class="details_MessageRow">
					<span class="details_LeftMessage">
						账号：
					</span>
					<span class="details_RightMessage">
						${kuser4.zhanghao } 
					</span>
					<span class="details_LeftMessage">
						推荐人账号：
					</span>
					<span class="details_RightMessage">
						${kuser4.tzhanghao }
					</span>
					<span class="details_LeftMessage">
						推荐人姓名：
					</span>
					<span class="details_RightMessage">
						${kuser4.tname }
					</span>
					<span class="details_LeftMessage">
						激活时间：
					</span>
					<span class="details_RightMessage">
						${kuser4.jihuotime }
					</span>
				</div>
			</div>
			
			<div class="detailsDiv">
				<div class="details_Data">
					5. ${kuser5.zhenshiname }	<!--向下三角形-->
					<div style=" border-top: solid 30px #FFF; border-left: solid 15px transparent; border-right: solid 15px transparent; display: inline-block;float: right;"></div>
				</div>
				<!--信息显示块-->
				<div class="details_MessageRow">
					<span class="details_LeftMessage">
						账号：
					</span>
					<span class="details_RightMessage">
						${kuser5.zhanghao } 
					</span>
					<span class="details_LeftMessage">
						推荐人账号：
					</span>
					<span class="details_RightMessage">
						${kuser5.tzhanghao }
					</span>
					<span class="details_LeftMessage">
						推荐人姓名：
					</span>
					<span class="details_RightMessage">
						${kuser5.tname }
					</span>
					<span class="details_LeftMessage">
						激活时间：
					</span>
					<span class="details_RightMessage">
						${kuser5.jihuotime }
					</span>
				</div>
			</div>
			
			<div class="detailsDiv">
				<div class="details_Data">
					6. ${kuser6.zhenshiname }	<!--向下三角形-->
					<div style=" border-top: solid 30px #FFF; border-left: solid 15px transparent; border-right: solid 15px transparent; display: inline-block;float: right;"></div>
				</div>
				<!--信息显示块-->
				<div class="details_MessageRow">
					<span class="details_LeftMessage">
						账号：
					</span>
					<span class="details_RightMessage">
						${kuser6.zhanghao } 
					</span>
					<span class="details_LeftMessage">
						推荐人账号：
					</span>
					<span class="details_RightMessage">
						${kuser6.tzhanghao }
					</span>
					<span class="details_LeftMessage">
						推荐人姓名：
					</span>
					<span class="details_RightMessage">
						${kuser6.tname }
					</span>
					<span class="details_LeftMessage">
						激活时间：
					</span>
					<span class="details_RightMessage">
						${kuser6.jihuotime }
					</span>
				</div>
			</div>
			
			<div class="detailsDiv">
				<div class="details_Data">
					7. ${kuser7.zhenshiname }	<!--向下三角形-->
					<div style=" border-top: solid 30px #FFF; border-left: solid 15px transparent; border-right: solid 15px transparent; display: inline-block;float: right;"></div>
				</div>
				<!--信息显示块-->
				<div class="details_MessageRow">
					<span class="details_LeftMessage">
						账号：
					</span>
					<span class="details_RightMessage">
						${kuser7.zhanghao } 
					</span>
					<span class="details_LeftMessage">
						推荐人账号：
					</span>
					<span class="details_RightMessage">
						${kuser7.tzhanghao }
					</span>
					<span class="details_LeftMessage">
						推荐人姓名：
					</span>
					<span class="details_RightMessage">
						${kuser7.tname }
					</span>
					<span class="details_LeftMessage">
						激活时间：
					</span>
					<span class="details_RightMessage">
						${kuser7.jihuotime }
					</span>
				</div>
			</div>
	</div>

	<script>
		$('.backButton').click(function(){
            window.location.href="${APP_PATH }/toUserShou";
        })
        
        

	</script>

</body>
</html>