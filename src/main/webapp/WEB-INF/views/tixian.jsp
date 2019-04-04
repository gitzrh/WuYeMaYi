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
			资金提现
		</span>
	</div>
	
	<!--设置密码种类-->
	<div class="changeSelect">
		<div class="changeTypeSelect changeTypeSelect_selected">购车积分提现</div>
		<div class="changeTypeSelect">出局积分提现</div>
		<div class="changeTypeSelect">分享积分提现</div>
		<div class="changeTypeSelect">运营津贴提现</div>
	</div>
	
	<!-- 购车积分提现 -->
	<form action="#" class="selectedDiv selected_1" method="post" id="myform">
		<!---->
		<div class="messageDidsplayDiv">
			<div class="leftMessage">真实户名:</div>
			<input type="text" value="${zkuser.zhenshiname }" readonly="readonly" id="realname1" class="rightMessage">
		</div>
		<!---->
		<div class="messageDidsplayDiv">
			<div class="leftMessage">银行名称:</div>
			<input type="text" value="${zkuser.yinhangname }" readonly="readonly" id="bank_name1" class="rightMessage">
		</div>
		<!---->
		<div class="messageDidsplayDiv">
			<div class="leftMessage">开户地址:</div>
			<input type="text" value="${zkuser.kaihudizhi }" readonly="readonly" id="bank_address1" class="rightMessage">
		</div>
		<!---->
		<div class="messageDidsplayDiv">
			<div class="leftMessage">银行卡号:</div>
			<input type="text" value="${zkuser.yinhangkajao }" readonly="readonly" id="bank_card1" class="rightMessage">
		</div>
		<!---->
		<div class="messageDidsplayDiv">
			<div class="leftMessage">提现金额:</div>
			<input type="number" placeholder="请输入提现金额" name="gc_jf" id="gc_jf" class="rightMessage">
		</div>

		<!--确认按钮-->
		<div class="etermineButton gcbtn" id="dl">
			确认
		</div>

		<span style="color:#FFF;text-align:center;display:block;font-size:3.5rem;margin-top:5%;">购车积分提现手续费:${gouche }</span>
	</form>
	
	<!-- 出局积分提现 -->
	<form action="#" class="selectedDiv selected_2" style="display: none;" method="post" id="myformB">
		<!---->
		<div class="messageDidsplayDiv">
			<div class="leftMessage">真实户名:</div>
			<input type="text" value="${zkuser.zhenshiname }" readonly="readonly" name="realname2" class="rightMessage">

		</div>
		<!---->
		<div class="messageDidsplayDiv">
			<div class="leftMessage">银行名称:</div>
			<input type="text" value="${zkuser.yinhangname }" readonly="readonly" name="bank_name2" class="rightMessage">

		</div>
		<!---->
		<div class="messageDidsplayDiv">
			<div class="leftMessage">开户地址:</div>
			<input type="text" value="${zkuser.kaihudizhi }" readonly="readonly" name="bank_address2" class="rightMessage">

		</div>
		<!---->
		<div class="messageDidsplayDiv">
			<div class="leftMessage">银行卡号:</div>
			<input type="text" value="${zkuser.yinhangkajao }" readonly="readonly" name="bank_card2" class="rightMessage">

		</div>
		<!---->
		<div class="messageDidsplayDiv">
			<div class="leftMessage">提现金额:</div>
			<input type="number" placeholder="请输入提现金额" name="cj_jf" id="cj_jf" class="rightMessage">

		</div>

		<!--确认按钮-->
		<div class="etermineButton cjbtn" id="cjbtn">
			确认
		</div>

		<span style="color:#FFF;text-align:center;display:block;font-size:3.5rem;margin-top:5%;">出局积分提现手续费:${chuju }</span>
	</form>
	
	<!-- 分享积分提现  -->
	<form action="#" class="selectedDiv selected_3" style="display: none;" method="post" id="myformC">
		<!---->
		<div class="messageDidsplayDiv">
			<div class="leftMessage">真实户名:</div>
			<input type="text" value="${zkuser.zhenshiname }" readonly="readonly" name="realname" class="rightMessage">

		</div>
		<!---->
		<div class="messageDidsplayDiv">
			<div class="leftMessage">银行名称:</div>
			<input type="text" value="${zkuser.yinhangname }" readonly="readonly" name="bank_name" class="rightMessage">

		</div>
		<!---->
		<div class="messageDidsplayDiv">
			<div class="leftMessage">开户地址:</div>
			<input type="text" value="${zkuser.kaihudizhi }" readonly="readonly" name="bank_address" class="rightMessage">

		</div>
		<!---->
		<div class="messageDidsplayDiv">
			<div class="leftMessage">银行卡号:</div>
			<input type="text" value="${zkuser.yinhangkajao }" readonly="readonly" name="bank_card" class="rightMessage">

		</div>
		<!---->
		<div class="messageDidsplayDiv">
			<div class="leftMessage">提现金额:</div>
			<input type="number" placeholder="请输入提现金额" name="fx_jf" id="fx_jf" class="rightMessage">

		</div>

		<!--确认按钮-->
		<div class="etermineButton" id="fxbtn">
			确认
		</div>

		<span style="color:#FFF;text-align:center;display:block;font-size:3.5rem;margin-top:5%;">分享积分提现手续费:${fenxiang }</span>
	</form>
	
	<!-- 购车积分提现 -->
	<form action="#" class="selectedDiv selected_4" style="display: none;" method="post" id="myformD">

		<span style="color:#FFF;text-align:center;display:block;font-size:3.5rem;margin-top:5%;">敬请期待!</span>
	</form>


	<script type="text/javascript">
	$(function(){
		

		function myalert1(str) {
		  var div = '<div class="layui" style="color:red;text-align:center;font-size:36px"></div>';
		  $('.selected_1').append(div)
		  $('.layui').html(str);
		  $('.layui').show();
		  setTimeout(function() {
		    $('.layui').hide();
		    $('.layui').remove();
		  }, 2000)
		}
		
		function myalert2(str) {
			  var div = '<div class="layui" style="color:red;text-align:center;font-size:36px"></div>';
			  $('.selected_2').append(div)
			  $('.layui').html(str);
			  $('.layui').show();
			  setTimeout(function() {
			    $('.layui').hide();
			    $('.layui').remove();
			  }, 2000)
			}
	
		
		$(".gcbtn").click(function(){
			var gcjf = $("#gc_jf").val();
			var realname1 = $("#realname1").val();
			var bankname1 = $("#bank_name1").val();
			var bankaddress1 = $("#bank_address1").val();
			var bankcard1 = $("#bank_card1").val();
			$.ajax({
        	    url:"${APP_PATH }/txgcjb",
        	    type: "POST",
        	    data: "gcjf="+gcjf+"&realname1="+realname1+"&bankname1="+bankname1+"&bankaddress1="+bankaddress1+"&bankcard1="+bankcard1,
        	    success:function(result){
        	    	var code = result.code;
        	    	if (code == 100) {
        	    		myalert1(result.extent.gcjb);
					}
        	    	if(code == 200){
						myalert1(result.extent.gcjb);
					}
        	    }
        	});
		});
		

		$(".cjbtn").click(function(){
			var cjjf = $("#cj_jf").val();
			var realname2 = $("#realname2").val();
			var bankname2 = $("#bank_name2").val();
			var bankaddress2 = $("#bank_address2").val();
			var bankcard2 = $("#bank_card2").val();
			$.ajax({
        	    url:"${APP_PATH }/txcjjf",
        	    type: "POST",
        	    data: "cjjf="+cjjf+"&realname2="+realname2+"&bankname2="+bankname2+"&bankaddress2="+bankaddress2+"&bankcard2="+bankcard2,
        	    success:function(result){
        	    	var code = result.code;
        	    	if (code == 100) {
        	    		myalert2(result.extent.gcjb);
					}
        	    	if(code == 200){
						myalert2(result.extent.gcjb);
					}
        	    }
        	});
		})
		
		
		$(".fxbtn").click(function(){
			var fxjf = $("#fx_jf").val();
			$.ajax({
        	    url:"/index.php?s=/Home/Ucenter/zijin_tixian.html",
        	    type: "POST",
        	    data: {fx_jf:fx_jf},
        	    success: function (result) {
        	        
        	    }
        	})
		})
		
		$('.backButton').click(function(){
        	window.location.href="/index.php?s=/Home/Shop/index.html";
        	// window.location.href="Title.htm";
        	// window.history.back();
    	})
	})
	</script>


</body>
</html>