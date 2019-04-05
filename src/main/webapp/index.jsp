<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	%>
    <title>登录</title>
    <link rel="stylesheet" href="${APP_PATH }/Home/css/stylesheet.css">
    <link rel="stylesheet" href="${APP_PATH }/Home/css/stylesheet_PC.css" media="screen and (min-width:1000px)">
    <link href="${APP_PATH }/Home/css/layer.css">
    <script src="${APP_PATH }/Home/js/jquery-3.2.1.min.js"></script>
    <script src="${APP_PATH }/Home/js/comment.js"></script>
    <script src="${APP_PATH }/Home/js/layer.js"></script>
  <script src="${APP_PATH }/Home/js/unicode.js"></script>
  <script src="${APP_PATH }/Home/js/gVerify-1.js"></script>
    <style>
        input{
				outline:none!important;
			}
            .foget-psw a{
                font-size:4.5rem!important;
                float: right;
                margin-right: 1.5rem;
                margin-top: 1.5rem;
                text-decoration:none;
                color:red;
            }
            .leftMessage{
                width:180px!important;
            }
      		.layui-m-layer-msg .layui-m-layercont {
              padding: 31px 179px;
              font-size: 3.5rem;
          }
	</style>
	<script type="text/javascript">
	$(function(){
		
		  function myalert(str) {
  		  var div = '<div class="layui" style="color:red;text-align:center;font-size:36px"></div>';
  		  $('#dl').append(div)
  		  $('.layui').html(str);
  		  $('.layui').show();
  		  setTimeout(function() {
  		    $('.layui').hide();
  		    $('.layui').remove();
  		  }, 2000)
  		}
		function Trim(str)
		 { 
		  return str.replace(/(^\s*)|(\s*$)/g, ""); 
		}

		
		
		$("#imgVerify").click(function(){
			document.getElementById("imgVerify").src="AuthImage?"+Math.random();
		})
		
		$("#dl").click(function(){
			var yzm = $.trim($("#code_input_yanzh").val());
			var kzhanghao = $.trim($("#phone").val());
			var kpassword = $.trim($("#password").val());
			var regzhanghao = /^[1][0-9][0-9]{9}$/;
			if(!regzhanghao.test(kzhanghao)){
				myalert("电话格式错误");
			}else{
				
			$.ajax({
				url:"${APP_PATH }/loginUser",
				type:"GET",
				data:"zhanghao="+kzhanghao+"&kpassword="+kpassword+"&yanzhma="+yzm,
				success:function(result){
						var code = result.code;
						if (code == 100) {
							
							window.location.href="${APP_PATH }/toUserShou";
							
							
							
						}else{
							myalert(result.extent.login);
							
						}
					}
				
			})
			}
		})
		
		
	})
	
	</script>
</head>

<body class="bodyHeight" style="background-image: url(Home/img/timg.gif);background-position: center;background-repeat: no-repeat;background-size: 100% 100%;">
  	<div style='padding-top:164px;text-align: center'>
      	<img src='Home/img/logo.png' style="width: 747px;">
  	</div>

    <!--topTitle -->
    <form action="" style='margin-top: 215px;'>
        <div class="messageDidsplayDiv">
            <div class="leftMessage" style='color:#fff;'>会员帐号:</div>
            <input type="text" placeholder="请输入帐号" name="phone" id="phone" class="rightMessage" style='border-bottom: solid 2px #fff;color:#Fff;width:430px'>
        </div>
        <div class="messageDidsplayDiv">
            <div class="leftMessage" style='color:#fff;width:180px;'>登陆密码:</div>
            <input type="password" placeholder="请输入登陆密码" name="password" id="password" class="rightMessage" style='border-bottom: solid 2px #fff;color:#fff;margin-top:5%;width:430px'>

        </div>
      <div class="messageDidsplayDiv">
            <div class="leftMessage" style='color:#fff;width:180px;'>验证码:</div>
            <input type="text" placeholder="请输入验证码" name="password" id="code_input_yanzh" class="rightMessage" style='border: solid 2px #fff;color:#fff;margin-top:5%;width:315px'>
			<div id="v_container" style="width: 200px;height: 79px; display: inline-block;position:relative;top:26px;left:30px;">
			<img class="verifyimg reloadverify" id="imgVerify"  src="${APP_PATH }/AuthImage" alt="点击更换验证码">
			</div>
        </div>
        <div class="etermineButton" id="dl" style="background:rgba(0,0,0,0);margin-top: 150px;">
            登录
        </div>
       
      <div style='margin-top:240px;text-align:center;'><span style='color:#fff;display:inline-block;font-size: 4rem;'> 五叶蚂蚁好车</span></div>
    </form>

</body>

</html>