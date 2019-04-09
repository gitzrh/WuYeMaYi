<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%
		pageContext.setAttribute("APP_PATH", request.getContextPath());
	%>
<title>个人信息</title>

<link rel="stylesheet" href="${APP_PATH }/Home/css/stylesheet.css">
<link rel="stylesheet" href="${APP_PATH }/Home/css/style.css">
<link rel="stylesheet" href="${APP_PATH }/Home/css/style.css">
<script src="${APP_PATH }/Home/js/jquery-3.2.1.min.js"></script>
<script src="${APP_PATH }/Home/js/comment.js"></script>
<script src="${APP_PATH }/Home/js/layer.js"></script>
<style>
	input{
		outline:none!important;
	}
	.messageDidsplayDiv{
		margin:5% 0 5% -8rem;
	}
</style>

</head>


<body class="bodyHeight" style="height: 944px;">

	<!--topTitle -->
	<div class="pageTitleDiv">
		<div class="backButton">
			返回
		</div>
		<span class="pageTitleText">
			个人信息
		</span>
	</div>
	
	<!--设置密码种类-->
	<div class="changeSelect">
		<div class="changeTypeSelect changeTypeSelect_selected">个人信息</div>
		<div class="changeTypeSelect">银行信息</div>
	</div>
	
	<!--交易1-->
	<div class="selectedDiv selected_1" style="">
		<!--交易记录 END-->
		<form action="#" method="post" id="myform">
			<div class="messageDidsplayDiv">
				<div class="leftMessage">会员帐号:</div>
				<input type="text" placeholder="${kuser.zhanghao }" class="rightMessage" readonly="">
			</div>
			<!---->
			<div class="messageDidsplayDiv">
				<div class="leftMessage">会员名称:</div>
				<input type="text" placeholder="${kuser.khname }" id="username" class="rightMessage" readonly="">
			</div>
			<!---->
			<div class="messageDidsplayDiv">
				<div class="leftMessage">手机号码:</div>
				<input type="text" placeholder="${kuser.zhenshishoujihao }" name="phone" id="phone" class="rightMessage">
			</div>
			<!---->
			<div class="messageDidsplayDiv">
				<div class="leftMessage">身份证号:</div>
				<input type="text" placeholder="${kuser.shenfenid }" name="identity_card" id="identity_card" class="rightMessage">
			</div>
			<div class="etermineButton bankbutton1" id="infobutton">
				确认
			</div>
			<div class="messageDidsplayDiv"></div>
			<div class="messageDidsplayDiv"></div>
			<div class="messageDidsplayDiv"></div>
			<div class="messageDidsplayDiv"></div>
			<div class="messageDidsplayDiv"></div>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<div class="leftMessage" style="color:red">${sessionScope.ok }</div>
		</form>
		
	</div>
	<!--交21-->
	<div class="selectedDiv selected_2" style="display: none;">
		<!--交易记录 END-->
		<form action="#" method="post" id="myformT">
			<div class="messageDidsplayDiv">
				<div class="leftMessage">开户姓名:</div>
				<input type="text" placeholder="${kuser.zhenshiname }" id="realname" name="${kuser.zhenshiname }" class="rightMessage">
			</div>
			<!---->
			<div class="messageDidsplayDiv">
				<div class="leftMessage">收款银行:</div>
				<input type="text" placeholder="${kuser.yinhangname }" name="${kuser.yinhangname }" id="bank_name" class="rightMessage">
			</div>
			<!---->
			<div class="messageDidsplayDiv">
				<div class="leftMessage">银行卡号:</div>
				<input type="text" placeholder="${kuser.yinhangkajao }" name="${kuser.yinhangkajao }" id="bank_card" class="rightMessage"> 
			</div>
			<!---->
			<div class="messageDidsplayDiv">
				<div class="leftMessage">开户地址:</div>
				<input type="text" placeholder="${kuser.kaihudizhi }" name="${kuser.kaihudizhi }" id="kaihu_address" class="rightMessage">
			</div>
			<div class="messageDidsplayDiv">
				<div class="leftMessage">支付宝帐号:</div>
				<input type="text" placeholder="${kuser.zhifubaoid }" name="${kuser.zhifubaoid }" id="alipay" class="rightMessage">
			</div>
			<!--确认按钮-->
			<div class="etermineButton bankbutton2" id="bankbutton">
				确认
			</div>
			<div class="messageDidsplayDiv"></div>
			<div class="messageDidsplayDiv"></div>
			<div class="messageDidsplayDiv"></div>
			<div class="messageDidsplayDiv"></div>
			<div class="messageDidsplayDiv"></div>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<div class="leftMessage" style="color:red">${sessionScope.yhok }</div>
		</form>
	</div>


	<script>
		function myalert1(str) {
		  var div = '<div class="layui" style="color:red;text-align:center;font-size:36px"></div>';
		  $('.bankbutton1').append(div)
		  $('.layui').html(str);
		  $('.layui').show();
		  setTimeout(function() {
		    $('.layui').hide();
		    $('.layui').remove();
		  }, 2000)
		}	
		
		function myalert2(str) {
			  var div = '<div class="layui" style="color:red;text-align:center;font-size:36px"></div>';
			  $('.bankbutton2').append(div)
			  $('.layui').html(str);
			  $('.layui').show();
			  setTimeout(function() {
			    $('.layui').hide();
			    $('.layui').remove();
			  }, 2000)
			}
	
	
		$("#infobutton").click(function(){
			var phone = $("#phone").val();
			var identity_card = $("#identity_card").val();
			$.ajax({
        	    url:"${APP_PATH }/updatePhCa",
        	    type: "GET",
        	    data:"phone="+phone+"&card="+identity_card,
        	    success:function(res){
        	    	myalert1("修改成功!");
        	    	window.location.href="${APP_PATH }/toUserShou";
        	    }
        	})
		})
		
		$("#realname").change(function(){
			var realname = $("#realname").val();
			$("#realname").attr("name",realname);
		})
		
		$("#bank_name").change(function(){
			var bankname = $("#bank_name").val();
			$("#bank_name").attr("name",bankname);
		})
		
		$("#bank_card").change(function(){
			var bankcard = $("#bank_card").val();
			$("#bank_card").attr("name",bankcard);
		})
		
		$("#kaihu_address").change(function(){
			var kaihuaddress = $("#kaihu_address").val();
			$("#kaihu_address").attr("name",kaihuaddress);
		})
		
		$("#alipay").change(function(){
			var alipay = $("#alipay").val();
			$("#alipay").attr("name",alipay);
		})
	
		
		$("#bankbutton").click(function(){
			var realname = $("#realname").attr("name");
			var bank_name = $("#bank_name").attr("name");
			var bank_card = $("#bank_card").attr("name");
			var kaihu_address = $("#kaihu_address").attr("name");
			var alipay = $("#alipay").attr("name");
			$.ajax({
        	    url:"${APP_PATH }/updateyh",
        	    type: "POST",
        	    data: "realname="+realname+"&bankname="+bank_name+"&bankcard="+bank_card+"&kaihuaddress="+kaihu_address+"&alipay="+alipay,
        	    success: function (res) {
        	    	myalert2("修改成功!");
        	    	window.location.href="${APP_PATH }/toUserShou";
        	    }
        	})
		})
		
		
		$('.backButton').click(function(){
            window.location.href="${APP_PATH }/toUserShou";
        })

	</script>


</body>

</html>