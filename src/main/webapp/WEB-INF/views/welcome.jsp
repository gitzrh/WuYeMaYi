<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理首页</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="Admin/css/font.css">
<link rel="stylesheet" href="Admin/css/xadmin.css">
<link rel="shortcut  icon" type="image/x-icon" href="${APP_PATH }/Home/img/bitbug_favicon.ico" media="screen"/>
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>

<script type="text/javascript">
    
    window.onload=a;
     function a(){
	   $.ajax({
		   url:"${APP_PATH }/shouyeyeye",
			type:"POST",
			success:function(result){
			    if (result.code == 100) {
					$(".num").text(result.extent.numm.num);
					$(".zjzs").text(result.extent.numm.zjzs);
					$(".gcnum").text(result.extent.numm.gcnum);
					$(".fxnum").text(result.extent.numm.fxnum);
					$(".zainum").text(result.extent.numm.zainum);
					$(".cjnum").text(result.extent.numm.cjnum);
				}					
			}
	   })   
   }
     
</script>
</head>

<body >
<div class="x-body layui-anim layui-anim-up">
    <blockquote class="layui-elem-quote">五叶蚂蚁好车
        <span class="x-red">欢迎您!</span>
    </blockquote>
    
    <fieldset class="layui-elem-field">
        <legend>数据统计</legend>
        <div class="layui-field-box">
            <div class="layui-col-md12">
                <div class="layui-card">
                    <div class="layui-card-body">
                        <div class="layui-carousel x-admin-carousel x-admin-backlog" lay-anim="" lay-indicator="inside" lay-arrow="none" style="width: 100%; height: 90px;">
                         <div carousel-item="">
                             <ul class="layui-row layui-col-space10 layui-this">
                                 
                                 <li class="layui-col-xs2">
                                     <a href="javascript:;" class="x-admin-backlog-body">
                                         <h3>会员数</h3>
                                         <p>
                                             <cite class="num"></cite>
                                         </p>
                                     </a>
                                 </li>
                                 
                                 <li class="layui-col-xs2">
                                     <a href="javascript:;" class="x-admin-backlog-body">
                                         <h3>缴纳资金总数</h3>
                                         <p>
                                             <cite class="zjzs"></cite>
                                          </p>
                                     </a>
                                 </li>
                                 
                                 <li class="layui-col-xs2">
                                     <a href="javascript:;" class="x-admin-backlog-body">
                                         <h3>购车积分待使用</h3>
                                         <p>
                                             <cite class="gcnum"></cite>
                                         </p>
                                     </a>
                                 </li>
                                 
                                 <li class="layui-col-xs2">
                                     <a href="javascript:;" class="x-admin-backlog-body">
                                         <h3>分享积分待使用</h3>
                                         <p>
                                             <cite class="fxnum"></cite>
                                         </p>
                                     </a>
                                 </li>
                                 
                                 <li class="layui-col-xs2">
                                     <a href="javascript:;" class="x-admin-backlog-body">
                                         <h3>在途积分待使用</h3>
                                         <p>
                                             <cite class="zainum"></cite>
                                         </p>
                                     </a>
                                 </li>
                               
                                 <li class="layui-col-xs2">
                                     <a href="javascript:;" class="x-admin-backlog-body">
                                         <h3>出局积分待使用</h3>
                                         <p>
                                             <cite class="cjnum"></cite>
                                         </p>
                                     </a>
                                 </li>
                             </ul>
                         </div>
                    	</div>
                	</div>
            	</div>
        	</div>
    	</div>
	</fieldset>
</div>
 <script>
</script>
</body>
</html>