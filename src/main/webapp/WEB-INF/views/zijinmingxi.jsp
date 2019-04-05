<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>资金明细</title>

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
			资金明细
		</span>
	</div>
	<!--设置密码种类-->
	<div class="changeSelect">
		<div class="changeTypeSelect changeTypeSelect_selected" id="1">分享金币</div>
		<div class="changeTypeSelect" id="4">出局金币</div>
		<div class="changeTypeSelect" id="3">购车金币</div>
		<div class="changeTypeSelect" id="2">在途金币</div>
	</div>

	<!--分享积分 -->
	<div class="selectedDiv selected_1" style="">
		<!--信息块-->
		<c:forEach items="${zijinfxs }" var="reca">
			<div class="detailsDiv">
				<div class="details_Data">
					${reca.time }			<!--向下三角形-->
					<div style=" border-top: solid 30px #FFF; border-left: solid 15px transparent; border-right: solid 15px transparent; display: inline-block;float: right;"></div>
				</div>
				<!--信息显示块-->
				<div class="details_MessageRow" style="">
					<!--一条信息-->
					<span class="details_LeftMessage">
						分享金币 用途：
					</span>
					<span class="details_RightMessage">
						${reca.biandonleix } 
					</span>
					<span class="details_LeftMessage">
						数量：
					</span>
					<span class="details_RightMessage">
						${reca.jinbishu }
					</span>
					<!--一条信息 END-->
				</div>
				<!--信息显示块 END-->
			</div>	
		</c:forEach>
	</div>

	<!--分享积分  END-->

	<!--出局奖金-->
	<div class="selectedDiv selected_2" style="display:none;">
		<!--信息块-->
		<c:forEach items="${zijincjs }" var="reca">
			<div class="detailsDiv">
				<div class="details_Data">
					${reca.time }			<!--向下三角形-->
					<div style=" border-top: solid 30px #FFF; border-left: solid 15px transparent; border-right: solid 15px transparent; display: inline-block;float: right;"></div>
				</div>
				<!--信息显示块-->
				<div class="details_MessageRow">
					<!--一条信息-->
					<span class="details_LeftMessage">
						出局金币 用途：
					</span>
					<span class="details_RightMessage">
						${reca.biandonleix } 
					</span>
					<!--一条信息 END-->
					<!--一条信息-->
					<span class="details_LeftMessage">
						数量：
					</span>
					<span class="details_RightMessage">
						${reca.jinbishu }
					</span>
					<!--一条信息 END-->
				</div>
				<!--信息显示块 END-->
			</div>
		</c:forEach>
	</div>

	<!--报单币 END-->

	<!--购车积分-->
	<div class="selectedDiv selected_3" style="display:none;">
		<!--信息块-->
		<c:forEach items="${zijingcs }" var="reca">
			<div class="detailsDiv">
				<div class="details_Data">
					${reca.time }			<!--向下三角形-->
					<div style=" border-top: solid 30px #FFF; border-left: solid 15px transparent; border-right: solid 15px transparent; display: inline-block;float: right;"></div>
				</div>
				<!--信息显示块-->
				<div class="details_MessageRow">
					<!--一条信息-->
					<span class="details_LeftMessage">
						购车金币 用途：
					</span>
					<span class="details_RightMessage">
						${reca.biandonleix } 
					</span>
					<!--一条信息 END-->
					<!--一条信息-->
					<span class="details_LeftMessage">
						数量：
					</span>
					<span class="details_RightMessage">
						${reca.jinbishu } 
					</span>
					<!--一条信息 END-->
				</div>
				<!--信息显示块 END-->
			</div>
		</c:forEach>
	</div>

	<!--购车积分 END-->
	
	<!--在途金币-->
	<div class="selectedDiv selected_4" style="display:none;">
		<c:forEach items="${zijinzts }" var="reca">
			<div class="detailsDiv">
				<div class="details_Data">
					${reca.time }			<!--向下三角形-->
					<div style=" border-top: solid 30px #FFF; border-left: solid 15px transparent; border-right: solid 15px transparent; display: inline-block;float: right;"></div>
				</div>
				<!--信息显示块-->
				<div class="details_MessageRow">
					<!--一条信息-->
					<span class="details_LeftMessage">
						在途金币 用途：
					</span>
					<span class="details_RightMessage">
						${reca.biandonleix }
					</span>
					<!--一条信息 END-->
					<!--一条信息-->
					<span class="details_LeftMessage">
						数量：
					</span>
					<span class="details_RightMessage">
						${reca.jinbishu }
					</span>
					<!--一条信息 END-->
				</div>
				<!--信息显示块 END-->
			</div>
		</c:forEach>
	</div>

	<!--购车积分 END-->



	<script>
		$('.backButton').click(function(){
        	window.location.href="${APP_PATH }/toUserShou";
    	})
	
      	window.onload=function(){
          var ur =location.href;

          var type=parseInt(ur.split('?')[1].split("/")[5]);
                    console.log($('.changeTypeSelect')[type-1]);
            if(type == 1){
              $("#1").addClass('changeTypeSelect_selected');
             if($('.selected_1').css('display') == 'block'){
					$('.selectedDiv').slideUp();
					return;
				}
              $('.selected_1').slideDown();
            }else if(type == 2){
              $("#2").addClass("changeTypeSelect_selected");
              if($('.selected_4').css('display') == 'block'){
					$('.selectedDiv').slideUp();
					return;
				}
              $('.selected_4').slideDown();
            }else if(type==3){
              $("#3").addClass('changeTypeSelect_selected');
              if($('.selected_3').css('display') == 'block'){
					$('.selectedDiv').slideUp();
					return;
				}
              $('.selected_3').slideDown();
            }else if(type==4){
              $("#4").addClass('changeTypeSelect_selected');
             if($('.selected_2').css('display') == 'block'){
					$('.selectedDiv').slideUp();
					return;
				}
              $('.selected_2').slideDown();
            }
        };    
   
	</script>


<div id="qb-sougou-search" style="display: none; opacity: 0;"><p>搜索</p><p class="last-btn">复制</p><iframe src=""></iframe></div></body>
</html>