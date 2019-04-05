<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" style="background-image:none">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>推广二维码</title>
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


<body class="bodyHeight" style="height: 1841px;">
	<!--topTitle -->
	<div class="pageTitleDiv">
		<div class="backButton">
			返回
		</div>
		<span class="pageTitleText">
			推广二维码
		</span>
	</div>
	
	<div style="width:100%;height:1107px;position:relative;text-align: center;">
		<img src="${APP_PATH }/Home/img/bg.png" alt="">
    	<div style="width:300px;height:300px;position:absolute;left:306px;top:758px;">
          
         	<div class="changeSelect">
				<img src="${APP_PATH }/add/${erzhang }.png">
			</div>
      	</div>
      
  	</div>
	
	<script>
	
		$(".backButton").click(function(){
            window.location.href="${APP_PATH }/toUserShou";
        })
        
        window.onload = function(){
			setTimeout(test,3000);//1000毫秒=1秒后执行test方法
		}
		
		function test(){
			$.ajax({
				url:"${APP_PATH }/shanchut",
				type:"GET",
				success:function(result){
						
					}
				
			})
		}

	</script>


</body>

</html>