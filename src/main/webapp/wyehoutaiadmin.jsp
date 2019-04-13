<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en"  style="background-image: url(Admin/images/loginbg.jpg); height: 100%; -webkit-background-size:  100% 100%;background-size: 100% 100%;">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	%>
	<title>五叶蚂蚁好车</title>
        <link rel="stylesheet" type="text/css" href="${APP_PATH }/Admin/css/login.css" media="all">
	<!--[if lt IE 9]>
    <script type="text/javascript" src="/Public/static/jquery-1.10.2.min.js"></script>
    <![endif]-->
    <!--[if gte IE 9]><!-->
    <script type="text/javascript" src="${APP_PATH }/static/jquery-2.0.3.min.js"></script>
   		
    <script type="text/javascript">
   		$(function(){
   			$(".check-tips").hide();
   			
   			
   			
   			
   			//更换验证码
   			$(".verifyimg").click(function(){			
   			
   				
   				document.getElementById("imgVerify").src="ValidateColorServlet?"+Math.random();
   			})
   			
   			
   			
   			//登录表单验证
   			
   			$("#denglu").click(function(){
   				var yzm = $.trim($("#yzm").val());
   				var username = $.trim($("#username").val());
   				var password = $.trim($("#password").val());
   				
   		
   				$.ajax({
   					url:"${APP_PATH }/adminLogin",
   					type:"POST",
   					data:"username="+username+"&password="+password+"&yanzhengma="+yzm,
   					
   					success:function(result){
   						var code = result.code;
   						if (code == 100) {
   							
   							window.location.href="${APP_PATH }/toadmin";
   						}else{
   							$(".check-tips").show();
   		   					setTimeout(function(){
   		   					    $(".check-tips").hide();
   		   					},3000)
   						}
   					}
   				})
   				
   			});
   			
   			
   			
   			return false;
   		})
    	
   		
   		
    </script>

</head>
 <body id="login-page" style="background: none">
        <div id="main-content">

            <!-- 主体 -->
            <div class="login-body">
                <div class="login-main pr">
                    <form  method="post" class="login-form" style="border-top: none;">
                        <h3 class="welcome">五叶蚂蚁好车管理平台</h3>
                        <div id="itemBox" class="item-box">
                            <div class="item">
                                <i class="icon-login-user"></i>
                                <input class="inputxinxi" type="text" name="username" id="username" placeholder="请填写用户名" autocomplete="off" />
                            </div>
                            <div class="item b0">
                                <i class="icon-login-pwd"></i>
                                <input class="inputxinxi" type="password" name="password" id="password" placeholder="请填写密码" autocomplete="off" />
                            </div>
                            <div class="item verifycode">
                                <i class="icon-login-verifycode"></i>
                                <input type="text" id="yzm" name="verify" placeholder="请填写验证码" autocomplete="off">
                                <a class="verifyimg"  title="换一张"  href="javascript:void(0)"> 换一张？</a>
                            </div>
                            <div>
                                <img class="verifyimg reloadverify" id="imgVerify"  src="${APP_PATH }/ValidateColorServlet" alt="点击更换验证码"></div>
                        </div>
                        <div class="login_btn_panel" >
                            <div class="login-btn"  id="denglu" >
                                <span class="on">登 录</span>
                            </div>
                           <div class="check-tips" style="">警告，请重新输入</div>
                            
                        </div>
                    </form>
                </div>
            </div>
        </div>

</body>

</html>