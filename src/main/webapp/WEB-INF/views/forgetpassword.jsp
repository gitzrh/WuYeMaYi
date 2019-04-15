<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<title>忘记密码</title>

<link rel="stylesheet" href="${APP_PATH }/Home/css/stylesheet.css">
<link rel="stylesheet" href="${APP_PATH }/Home/css/stylesheet_PC.css" media="screen and (min-width:1000px)">
<script src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<script src="${APP_PATH }/Home/js/comment.js"></script>

</head>

<body class="bodyHeight" style="height: 816px;">
    <!--topTitle -->
    <div class="pageTitleDiv">
        <div class="backButton fanhui">返回</div>
        <span class="pageTitleText">忘记密码</span>
    </div>
    
    <form class="updatepassword" action="" method="post" id="myform">
    
        <div class="messageDidsplayDiv div1">
			<div class="leftMessage">手机号:</div>
			<input type="text" placeholder="请输入绑定的手机号" id="realname1" class="rightMessage phone">
		</div>
        
        <div class="messageDidsplayDiv div2">
            <div class="leftMessage" style="width: 290px;">新登录密码:</div>
            <input type="password" placeholder="请输入新密码" name="tzhanghao" id="tzhanghao" class="rightMessage inputPassword">
        </div>
      
      	<div class="messageDidsplayDiv div3">
            <div class="leftMessage" style="width: 290px;">确认新密码:</div>
            <input type="password" placeholder="确认新密码" name="yyzxid" id="yyzxid" class="rightMessage inputPassword2">
        </div>

		<div class="messageDidsplayDiv div4">
            <div class="leftMessage" style='color:#fff;width:180px;'>验证码:</div>
            <input type="text" placeholder="请输入验证码" name="password" id="code_input_yanzh" class="rightMessage verification_code" style='border: solid 2px #fff;color:#fff;margin-top:5%;width:315px'>
			<div id="v_container" style="width: 200px;height: 79px; display: inline-block;position:relative;top:26px;left:30px;">
				<img class="verifyimg reloadverify" id="imgVerify"  src="${APP_PATH }/AuthImage" alt="点击更换验证码">
			</div>
        </div>
        
        <div class="messageDidsplayDiv div5">
            <div class="leftMessage" style='color:#fff;width:180px;'>手机验证:</div>
            <input type="text" placeholder="请输入验证码" name="" id="code_input_yanzh" class="rightMessage verification_phone" style='border: solid 2px #fff;color:#fff;margin-top:5%;width:315px'>
			<div id="v_container" style="width: 225px;height: 69px; display: inline-block;position:relative;top:16px;left:30px;">
				<input type="button" class="backButton huoquphone" value="获取">
			</div>
        </div>
		
        <!--确认按钮-->
        <div class="etermineButton btn_submit"  id="zhuce">确认修改</div>
    </form>
    
<script type="text/javascript">
		
		
		function myalert1(str) {
			  var div = '<div class="layui" style="color:red;text-align:center;font-size:36px"></div>';
			  $('.updatepassword').append(div)
			  $('.layui').html(str);
			  $('.layui').show();
			  setTimeout(function() {
			    $('.layui').hide();
			    $('.layui').remove();
			  }, 3000)
		}
		
		function myalert2(str) {
			  var div = '<div class="layui" style="color:red;text-align:center;font-size:36px"></div>';
			  $('.div2').append(div)
			  $('.layui').html(str);
			  $('.layui').show();
			  setTimeout(function() {
			    $('.layui').hide();
			    $('.layui').remove();
			  }, 3000)
		}
		
		function myalert3(str,div) {
			  var div = '<div class="layui" style="color:red;text-align:center;font-size:36px"></div>';
			  $('.div3').append(div)
			  $('.layui').html(str);
			  $('.layui').show();
			  setTimeout(function() {
			    $('.layui').hide();
			    $('.layui').remove();
			  }, 3000)
		}
		
		function myalert4(str,div) {
			  var div = '<div class="layui" style="color:red;text-align:center;font-size:36px"></div>';
			  $('.div4').append(div)
			  $('.layui').html(str);
			  $('.layui').show();
			  setTimeout(function() {
			    $('.layui').hide();
			    $('.layui').remove();
			  }, 3000)
		}
		
		function myalert5(str,div) {
			  var div = '<div class="layui" style="color:red;text-align:center;font-size:36px"></div>';
			  $('.div5').append(div)
			  $('.layui').html(str);
			  $('.layui').show();
			  setTimeout(function() {
			    $('.layui').hide();
			    $('.layui').remove();
			  }, 3000)
		}
		
		function myalert6(str,div) {
			  var div = '<div class="layui" style="color:red;text-align:center;font-size:36px"></div>';
			  $('.div1').append(div)
			  $('.layui').html(str);
			  $('.layui').show();
			  setTimeout(function() {
			    $('.layui').hide();
			    $('.layui').remove();
			  }, 3000)
		}
	
		$(".reloadverify").click(function(){
			document.getElementById("imgVerify").src="AuthImage?"+Math.random();
		})
		
		var InterValObj; //timer变量，控制时间
	    var count = 120; //间隔函数，1秒执行
	    var curCount;//当前剩余秒数
		
		//获取手机验证码
		$(".huoquphone").click(function(){
			var phone = $.trim($(".phone").val());
			if (phone == "") {
				myalert6("手机号不能为空!");
				return;
			}

			$.ajax({
				url:"${APP_PATH}/huoquphone",
				type:"POST",
				data: "phone="+phone,
				success:function(result){
					var code = result.code;
        	    	if (code == 100) {
        	    		
        	    		$(".verification_phone").attr("name",result.extent.yzh);
        	    		
        	    		curCount = count;
                        //设置button效果，开始计时
                        $(".huoquphone").css("background-color", "LightSkyBlue");
                        $(".huoquphone").attr("disabled", "true");
                        setTimeout(SetRemainTime, 1000); //启动计时器，1秒执行一次
                        
                        function SetRemainTime() {
                	        if (curCount == 0) {
                	            window.clearInterval(InterValObj);//停止计时器
                	            $(".huoquphone").removeAttr("disabled");//启用按钮
                	            $(".huoquphone").css("background-color", "");
                	            $(".huoquphone").attr("value","获取");
                	        }else {
                	        	$(".huoquphone").attr("value",curCount+"s");
                	        	curCount--;
                	        	setTimeout(SetRemainTime, 1000);
                	        }
                	    }
					}
        	    	
        	    	if (code == 200) {
        	    		myalert6(result.extent.fphone);
					}
				}
			})
		})
		
		
		
		//判断两次密码是否一样
		$(".inputPassword2").change(function(){
			input_Password2();
		})
		
		function input_Password2(){
			var password = $.trim($(".inputPassword").val());
			var regpassword = $.trim($(".inputPassword2").val());
			if (password != regpassword) {
				myalert3("请检查密码,两次输入不一样!");
				return false;
			} else {
			}
		}
		
		//点击提交
		$(".btn_submit").click(function(){
			
			var phone = $.trim($(".phone").val());
			if (phone == "") {
				myalert6("手机号不能为空!");
				return;
			}
			
			if (input_Password2() == false) {
				return;
			}
			
			var password = $.trim($(".inputPassword").val());
			if (password == "") {
				myalert2("密码不能为空!");
				return;
			}
			
			var password2 = $.trim($(".inputPassword2").val());
			if (password2 == "") {
				myalert3("密码不能为空!");
				return;
			}
			
			var verification1 = $.trim($(".verification_code").val());
			if (verification1 == "") {
				myalert4("验证码不能为空!");
				return;
			}
			
			var verification2 = $.trim($(".verification_phone").val());
			if (verification2 == "") {
				myalert5("手机验证码不能为空!");
				return;
			}
			
			$.ajax({
				url:"${APP_PATH}/forgetpass",
				type:"POST",
				data: "verification1="+verification1+"&password="+password+"&phone="+phone+"&verification2="+verification2,
				success:function(result){
					var code = result.code;
        	    	if (code == 100) {
        	    		myalert1("修改完成!");
        	    		window.location.href="${APP_PATH }/index.jsp";
					}
        	    	if (code == 200) {
        	    		if (result.extent.fphone == null && result.extent.attribute != null && result.extent.verification == null) {
        	    			//验证码
        	    			myalert4(result.extent.attribute);
						}else if (result.extent.fphone != null && result.extent.attribute == null && result.extent.verification == null) {
							//手机号
							myalert6(result.extent.fphone);
						}else if (result.extent.fphone == null && result.extent.attribute == null && result.extent.verification != null) {
							//手机验证码
							myalert5(result.extent.verification);
						}else if (result.extent.fphone != null && result.extent.attribute != null && result.extent.verification == null) {
							//验证码  手机号
							myalert6(result.extent.fphone);
							myalert4(result.extent.attribute);
						}else if (result.extent.fphone != null && result.extent.attribute == null && result.extent.verification != null) {
							//手机号  手机验证码
							myalert6(result.extent.fphone);
							myalert5(result.extent.verification);
						}else if (result.extent.fphone == null && result.extent.attribute != null && result.extent.verification != null) {
							//验证码  手机验证码
							myalert4(result.extent.attribute);
							myalert5(result.extent.verification);
						}else if (result.extent.fphone != null && result.extent.attribute != null && result.extent.verification != null) {
							myalert6(result.extent.fphone);
							myalert4(result.extent.attribute);
							myalert5(result.extent.verification);
						}
					}
				}
			})
			
		})
			
		
		$('.fanhui').click(function(){
        	window.location.href="${APP_PATH }/index.jsp";
    	})
	
</script>
    
	
</body>
</html>