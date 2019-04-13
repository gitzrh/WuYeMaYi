<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!-- web路径：
不以/开始的相对路径，找资源，以当前资源的路径为基准，经常容易出问题。
以/开始的相对路径，找资源，以服务器的路径为标准(http://localhost:3306)；需要加上项目名
		http://localhost:3306/crud
 -->
    <title>注册会员</title>
    <link rel="stylesheet" href="${APP_PATH }/Home/css/stylesheet.css">
    <link rel="stylesheet" href="${APP_PATH }/Home/css/stylesheet_PC.css" media="screen and (min-width:1000px)">
   <script src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
 	<script src="${APP_PATH }/Home/js/comment.js"></script>
		
		
		
	<script type="text/javascript">
    $(function(){
     	
    	  function myalert(str) {
    		  var div = '<div class="layui" style="color:red;text-align:center;font-size:36px"></div>';
    		  $('body').append(div)
    		  $('.layui').html(str);
    		  $('.layui').show();
    		  setTimeout(function() {
    		    $('.layui').hide();
    		    $('.layui').remove();
    		  }, 2000)
    		}
    	  function myalerts(str) {
    		  var div = '<div class="layuis" style="color:green;text-align:center;font-size:36px"></div>';
    		  $('body').append(div)
    		  $('.layuis').html(str);
    		  $('.layuis').show();
    		  setTimeout(function() {
    		    $('.layuis').hide();
    		    $('.layuis').remove();
    		  }, 2000)
    		}
    	
    	$("#imgVerify").click(function(){
			document.getElementById("imgVerify").src="AuthImage?"+Math.random();
		})
    		
    		$("#zhuce").click(function(){
   				//1、拿到要校验的数据，使用正则表达式
   				var zhanghao = $.trim($("#zhanghao").val());
   				var khname = $.trim($("#khname").val());
   				var regzhanghao = /^[1][0-9][0-9]{9}$/;
   				var regName = /(^[\u2E80-\u9FFF]{2,5})/;
   				var kpassword = $.trim($("#kpassword").val());
   				var repassword =$.trim($("#repassword").val());
   				var tzhanghao = $.trim($("#tzhanghao").val());
   				var yyzxid = $.trim($("#yyzxid").val());
   				var kpassword = $.trim($("#kpassword").val());
   				var tzhanghao = $.trim($("#tzhanghao").val());
   				var yanzheng = $("#code_input_yanzh").val();
   				
   				if(!regzhanghao.test(zhanghao)){
   					myalert("电话格式错误");		
   					
   				}else{
   					if(!regName.test(khname)){
       					myalert("名字格式错误");   					
       					
       				}else{
       					
       						if(repassword!=kpassword){
       							myalert("密码不一样");
       					}else{
       						
       						$.ajax({
       			    			url:"${APP_PATH }/zhuce",
       			    			type:"POST",
       			    			data:"zhanghao="+zhanghao+"&kname="+khname+"&tzhanghao="+tzhanghao+"&yyzxid="+yyzxid+"&kpassword="+kpassword+"&yanzheng="+yanzheng,
       			    			success:function(result){
       			    				var code = result.code;
       								if (code == 100) {
       			    				myalerts("注册成功");
       								}else{
       									myalert(result.extent.loog);
       								}
       			    			}
       			    			
       			    		});
       						
       					}
       					
        					
        					
        				};
    				};

    }) ; 
    		return false;
    }) 
    </script>
</head>
<body class="bodyHeight" style="height: 816px;">
    <!--topTitle -->
    <div class="pageTitleDiv">
        <span class="pageTitleText">
           	 注册会员
        </span>
    </div>
    <form action="" method="post" id="myform">
        <!---->
        <div class="messageDidsplayDiv">
            <div class="leftMessage" style="width: 290px;">会员帐号:</div>
            <input type="text" placeholder="请输入帐号" name="zhanghao" id="zhanghao" class="rightMessage">

        </div>
        <div class="messageDidsplayDiv">
            <div class="leftMessage">会员姓名:</div>
            <input type="text" placeholder="请输入真实姓名" name="khname" id="khname" class="rightMessage">

        </div>
        <div class="messageDidsplayDiv">
            <div class="leftMessage" style="width: 290px;">推荐会员:</div>
            <input type="text" value="${param.tzhanghao }" name="tzhanghao" id="tzhanghao" class="rightMessage">
        </div>
      
      	<div class="messageDidsplayDiv">
            <div class="leftMessage" style="width: 290px;">运营中心编号:</div>
            <input type="text" readonly value="${param.yyzxid }" name="tzhanghao" id="tzhanghao" class="rightMessage">
        </div>
        <!---->
        <div class="messageDidsplayDiv">
            <div class="leftMessage" style="width: 290px;">登陆密码:</div>
            <input type="text" placeholder="请输登陆密码" name="kpassword" class="rightMessage" id="kpassword">
        </div>
        <!---->
        <div class="messageDidsplayDiv">
            <div class="leftMessage" style="width: 290px;">确认登陆密码:</div>
            <input type="text" placeholder="请输登陆密码" name="repassword" class="rightMessage" id="repassword">
        </div>
        
        <div class="messageDidsplayDiv">
            <div class="leftMessage" style='color:#fff;width:180px;'>验证码:</div>
            <input type="text" placeholder="请输入验证码" name="password" id="code_input_yanzh" class="rightMessage" style='border: solid 2px #fff;color:#fff;margin-top:5%;width:315px'>
			<div id="v_container" style="width: 200px;height: 79px; display: inline-block;position:relative;top:26px;left:30px;">
			<img class="verifyimg reloadverify" id="imgVerify"  src="${APP_PATH }/AuthImage" alt="点击更换验证码">
			</div>
        </div>


        <!--确认按钮-->
        <div class="etermineButton"  id="zhuce">确认注册</div>
        
        
    </form>
    
    
    
	
</body>
</html>