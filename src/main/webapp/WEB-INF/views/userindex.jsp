<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
<meta name="description" content="">
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link rel="shortcut  icon" type="image/x-icon" href="${APP_PATH }/Home/img/bitbug_favicon.ico" media="screen"/>
<link rel="stylesheet" type="text/css" href="${APP_PATH }/Home/css/slick.css" />
<link rel="stylesheet" type="text/css" href="${APP_PATH }/Home/css/base.css" />
<link rel="stylesheet" type="text/css" href="${APP_PATH }/Home/css/style.css" />
<link rel="stylesheet" type="text/css" href="${APP_PATH }/Home/css/all.css" />
<link rel="stylesheet" type="text/css" href="${APP_PATH }/Home/css/swiper.min.css" />
<link rel="stylesheet" type="text/css" href="${APP_PATH }/Home/css/iconfont/iconfont.css" />
<link rel="stylesheet" type="text/css" href="${APP_PATH }/Home/css/font/iconfont.css" />
<title>首页</title>
<style>
			          *{
					margin: 0;
					padding: 0;
				}
				.jf{
					width: 46%;
					height: 1.5rem; 
					margin: 2%; 
					float:left;
					padding-bottom: 0.2rem;
					position: relative; 
					background-color: #FFFFFF;
				}
				.jftp{
					width: 1rem; 
					margin-top: 0.35rem;
					margin-left: 0.3rem;
				}
				.jfwz1{
					font-size: 0.5rem;
					margin-left: 0.5rem;
					color: #2e2e40;
					/*font-family: "黑体";*/
				}
				.jfwz2{
					font-size: 0.4rem;
					position: absolute;
					top: 1rem;
					left: 2.2rem;
					color：#656565;
				}
				.xgzxy{
					margin-left: 0.3rem;
					/*background-color: red;*/
					width: 77%;
					height:1.5rem;
					display:inline-block;
					border-left: 0.05rem solid #CCCCCC;
					margin-top: 0.25rem;
					overflow: hidden;
				}
				.xgzxy span{
					font-size: 0.32rem;
					margin-left: 0.3rem;
					color: #A9A9A9;
				}
				.xgzxy img{
					width: 1.2rem;
					margin-left: 0.1rem;
				}
				.tzym{
					width: 22.5%;
					margin-left: 2%;
					margin-top:0.5rem;
					float:left;
					border-right: 0.02rem solid #CCCCCC;
					text-align: center;
				}
				.tzym span{
					font-size: 0.4rem; 
					/*margin-left: 0.35rem;*/
					color:#2e2e40;
				}
				a{
					display: inline-block;
				}
				.iconfont{
					font-size: 30px;
					color: #2e2e40;
				}
</style>
</head>
    <body style="background-color: #f2f2f2;">
        <!--头部图片-->
        <!--<img style="width: 100%" src="img/tou.jpg"/>-->
        <!--轮播图-->
        <div class="banner swiper-container">
            <div class="swiper-wrapper">
            	<c:forEach items="${lunbotus }" var="reca">
	                <div class="swiper-slide">
	                   <a href="javascript:void(0)"><img class="swiper-lazy" data-src="${reca.image }" alt="" style="height:203px;"></a>
	                </div>
                </c:forEach>           
            </div>
            <div class="swiper-pagination"></div>
        </div>
        <div style="clear:both"></div>
        <!--积分-->
        <div style="height: 4.15rem;">
            <div style="padding-left: 0.2rem;"class="jf">
              <a href="javascript:;">
                <img class="jftp" src="${APP_PATH }/Home/img/fx.png"/>
                <span class="jfwz1">分享金币</span>
                <span class="jfwz2">${jifen.fxjf }</span>
              </a>
            </div>
            <div style="margin-left: 0; "class="jf">
              <a href="javascript:;">
                <img class="jftp" src="${APP_PATH }/Home/img/bd.png"/>
                <span class="jfwz1">在途金币</span>
                <span class="jfwz2">${jifen.ztjf }</span>
              </a>
            </div>
            <div class="jf" style="margin-top: 0;padding-left: 0.2rem; ">
              <a href="javascript:;">
                <img class="jftp" src="${APP_PATH }/Home/img/gc.png"/>
                <span class="jfwz1">购车金币</span>
                <span class="jfwz2">${jifen.gcjf }</span>
              </a>
            </div>
            <div  class="jf" style="margin-top: 0;margin-left: 0; ">
               <a href="javascript:;">
                  <img class="jftp" src="${APP_PATH }/Home/img/cj.png"/>
                  <span class="jfwz1">出局金币</span>
                  <span class="jfwz2">${jifen.chjf }</span>
              </a>
            </div>  
        </div>
        <div style="clear:both"></div>
        
        <!--相关资讯-->
        <div style="width: 100%;height: 2rem; background: #FFFFFF;">
            <img src="${APP_PATH }/Home/img/xgzx.png" style="margin-top: -1rem;width: 1.3rem;margin-left:0.35rem;display:inline-block;" />
	            <div class="xgzxy" >
	                <div>
		                <c:forEach items="${zixunguanlis }" var="reca">
		                    <p style="margin-left: 0.2rem;">
			                    <a href="${APP_PATH }/zxxq?id=${reca.id }" style="margin-top: -3px">
			                    	<img src="${APP_PATH }/Home/img/zx.png"/>
			                    	<span>${reca.head }</span>
			                    </a>
		                    </p>
		                </c:forEach>
	                </div>
	            </div>
        </div>
        <div style="clear:both"></div>
        
        <!--跳转页面-->
        <div style="background-color: #FFFFFF;height: 7.2rem; margin-top: 0.3rem; padding-bottom: 2.2rem;">
            <a class="tzym" href="${APP_PATH }/tjlb">
                <i class="iconfont icon-liebiao" style="color:red"></i><br>
                <span>推荐列表</span>
            </a>
            
            <a class="tzym" href="${APP_PATH }/jggl">
                <i class="iconfont icon-tuandui" style="color:#cc0bc6"></i><br>
                <span>结构管理</span>
            </a>
            <a class="tzym" href="${APP_PATH }/register.jsp">
                <i class="iconfont icon-huiyuan-" style="color:green"></i><br>
                <span>注册会员</span>
            </a>
            
            <c:if test="${yyztid == 0 }">
				<a class="tzym" href="${APP_PATH }/hhrsq" style="border-right: none;">
                	<i class="iconfont icon-hehuoren" style="color:blue"></i><br>
                	<span style='margin-left: 0.15rem'>合伙人申请</span>
            	</a> 
			</c:if>
			<c:if test="${yyztid == 1 }">
				<a class="tzym" href="${APP_PATH }/yyzx" style="border-right: none;">
                	<i class="iconfont icon-hehuoren" style="color:blue"></i><br>
                	<span style='margin-left: 0.15rem'>运营中心</span>
                </a> 
			</c:if>
			<c:if test="${yyztid == 2 }">
				<a class="tzym" href="${APP_PATH }/hhds" style="border-right: none;">
                	<i class="iconfont icon-hehuoren" style="color:blue"></i><br>
                	<span style='margin-left: 0.15rem'>合伙人申请</span>
                </a> 
			</c:if>
			<c:if test="${yyztid == 3 }">
				<a class="tzym" href="${APP_PATH }/hhjj" style="border-right: none;">
                	<i class="iconfont icon-hehuoren" style="color:blue"></i><br>
                	<span style='margin-left: 0.15rem'>合伙人申请</span>
                </a> 
			</c:if>
         	           
            <a class="tzym" href="${APP_PATH }/zijinmingxi">
                <i class="iconfont icon-zijinzouxiang" style="color:blue"></i><br>
                <span>资金明细</span>
            </a>
            <a class="tzym" href="${APP_PATH }/zijintixian">
                <i class="iconfont icon-tixian" style="color:#e6b605"></i><br>
                <span>资金提现</span>
            </a>
            <a class="tzym" href="${APP_PATH }/tuiguang">
                <i class="iconfont icon-erweima" style="color:red"></i><br>
                <span>推广二维码</span>
            </a>
            <a class="tzym" href="${APP_PATH }/tixianjilu" style="border-right: none;">
                <i class="iconfont icon-jilu1" style="color:green"></i><br>
                <span>提现记录</span>
            </a>
            <a class="tzym" href="${APP_PATH }/user">
                <i class="iconfont icon-gerenxinxi" style="color:red"></i><br>
                <span>个人信息</span>
            </a>
            <a class="tzym" href="${APP_PATH }/updatepassword" style="border-right: none;">
                <i class="iconfont icon-xiugai" style="color:blue"></i><br>
                <span >修改密码</span>
            </a>
            
        </div>
        
        <!--底部导航-->
        <div class="footer" style="background-image: url('${APP_PATH }/Home/img/bak.png');background-position: center;background-repeat: no-repeat;">
            <ul class="footer-page clearfix">
                <li class="page-item active">
                    <a href="" class="active">
                        <i class="iconfont icon-index" style='color:#fff'></i>
                        <p style='color:#fff'>首页</p>
                    </a>
                </li>
                <li class="page-item ">
                    <a href="${APP_PATH }/jggl">
                        <i class="iconfont icon-computer" style='color:#fff'></i>
                        <p style='color:#fff'>团队</p>
                    </a>
                </li>
        
                <li class="page-item">
                    <a href="${APP_PATH }/tuichus">
                        <i class="iconfont icon-person1" style='color:#fff'></i>
                        <p style='color:#fff'>退出</p>
                    </a>
                </li>
            </ul>
        </div>
        
        
        <script src="${APP_PATH }/Home/js/jquery.min.js"></script>
        <script src="${APP_PATH }/Home/js/slick.min.js"></script>
        <script src="${APP_PATH }/Home/js/rem.js"></script>
        <script src="${APP_PATH }/Home/js/swiper.jquery.min.js"></script>
        <script>
            $(function() {
                $('.autoplay').slick({
                  slidesToScroll: 1,
                  autoplay: true,
                  autoplaySpeed: 2000,
                   dots:true,
                });
            });
        </script>
        <script type="text/javascript">
            $(function () {
                var banner = new Swiper(".banner",{
                    autoplay: 5000,
                    pagination : ".swiper-pagination",
                    paginationClickable: true,
                    lazyLoading : true,
                    loop:true
                }); 
              })

                
        </script>
        <script type="text/javascript">
            $(function() {
                var timer = null;
        
                function wfscroll() {
                    $(".xgzxy div").animate({
                        marginTop: "-0.75rem"
                    }, 1000, "linear", function() {
                        var a = $(".xgzxy p:first").clone(true);
                        $(".xgzxy p:first").remove();
                        a.appendTo(".xgzxy");
                        $(".xgzxy div").css("marginTop","0")

                    })
                }
                timer = setInterval(wfscroll, 2000);
            })
        </script>
    </body>
</html>