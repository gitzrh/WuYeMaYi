<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<title>合伙人申请</title>
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

<body class="bodyHeight" style="height: 1967px;">

	<!--topTitle -->
	<div class="pageTitleDiv">
		<div class="backButton">
			返回
		</div>
		<span class="pageTitleText">
			合伙人申请
		</span>
	</div>
	
	<div class="selectedDiv selected_1">
			<div class="messageDidsplayDiv">
			<div class="leftMessage">合伙人姓名:</div>
				<input type="text" placeholder="请输入合伙人姓名" name="account" id="name" class="rightMessage">
			</div>
			<div class="messageDidsplayDiv">
				<div class="leftMessage">联系方式：</div>
				<input type="text" placeholder="请输入联系方式" name="username" id="phone" class="rightMessage">
			</div>
			<div class="messageDidsplayDiv">
				<div class="leftMessage">合伙人地址：</div>
				<input type="text" placeholder="请输入合伙人地址" id="address" name="address" class="rightMessage">
			</div>
			<div class="messageDidsplayDiv">
				<div class="leftMessage" style="margin-left: -45rem;">备注：</div>
			</div>
			<div class="messageDidsplayDiv">
				<textarea placeholder="备注" id="remark" style="width: 51%;height: 25.5rem;padding: 2%;margin-top: -8%;margin-left: 31%;font-size: 4rem;"></textarea>
			</div>
			<div class="etermineButton" id="hhrbtn">
            	申请城市合伙人
        	</div>
	</div>
	
<script type="text/javascript">
    
	function myalert1(str) {
		  var div = '<div class="layui" style="color:red;text-align:center;font-size:36px"></div>';
		  $('.selected_1').append(div)
		  $('.layui').html(str);
		  $('.layui').show();
		  setTimeout(function() {
		    $('.layui').hide();
		    $('.layui').remove();
		  }, 3000)
	}
    
    $("#hhrbtn").click(function(){
        var phone = $.trim($("#phone").val());
        var name = $.trim($("#name").val());
        var address = $.trim($("#address").val());
        var remark = $.trim($("#remark").val());

        $.ajax({
            url:"${APP_PATH }/sqyyzx",
            type: "POST",
            data: "phone="+phone+"&name="+name+"&address="+address+"&remark="+remark,
            success: function (result) {
            	var code = result.code;
            	if (code == 100) {
            		myalert1("申请成功!");
    	    		window.location.href="${APP_PATH }/toUserShou";
				}
            }
        })
    })
	
    
    $('.backButton').click(function(){
            window.location.href="${APP_PATH }/toUserShou";
      })
</script>


</body>
</html>