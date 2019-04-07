<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>五叶蚂蚁</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${APP_PATH }/Admin/css/font.css">
	<link rel="stylesheet" href="${APP_PATH }/Admin/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="${APP_PATH }/Admin/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${APP_PATH }/Admin/js/xadmin.js"></script>
<script type="text/javascript">




</script>
</head>
<body>
    <!-- 顶部开始 -->
    <div class="container">
        <div class="logo"><a href="javascript:;">五叶蚂蚁</a></div>
        <div class="left_open">
            <i title="展开左侧栏" class="iconfont">&#xe699;</i>
        </div>
        
        <ul class="layui-nav right" lay-filter="">
          <li class="layui-nav-item">
            <a href="javascript:;">admin</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
              <dd><a href="javascript:;">修改密码</a></dd>
              <dd><a  href="${APP_PATH }/tuichu">退出</a></dd>
            </dl>
          </li>
         
        </ul>
        
    </div>
    <!-- 顶部结束 -->
    <!-- 中部开始 -->
     <!-- 左侧菜单开始 -->
    <div class="left-nav">
      <div id="side-nav">
        <ul id="nav">
            <li>
                <a href="">
                    <i class="iconfont">&#xe6b8;</i>
                    <cite>管理首页</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe723;</i>
                    <cite>用户中心</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a id="daishenhe"  _href="${APP_PATH }/getallwei">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>待审核用户</cite>
                        </a>
                    </li >
                    <li>
                        <a target="_top" _href="${APP_PATH }/yijihuouser">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>已通过用户</cite>
                        </a>
                    </li >
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe723;</i>
                    <cite>提现管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${APP_PATH }/tixianShenhe">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>待审核</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${APP_PATH }/tixianTongg">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>已通过</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${APP_PATH }/tixianJuju">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>已拒绝</cite>
                        </a>
                    </li >
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe723;</i>
                    <cite>参数配置</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${APP_PATH }/tocanshu">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>参数配置</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${APP_PATH }/toyycanshu">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>运营中心</cite>
                        </a>
                    </li >
                </ul>
            </li>
            
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6ce;</i>
                    <cite>积分记录</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    
                    <li>
                        <a _href="${APP_PATH }/tokoujil">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>手动扣除</cite>
                        </a>
                    </li >     
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6b4;</i>
                    <cite>轮播图</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="unicode.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>轮播图</cite>
                        </a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6b4;</i>
                    <cite>运营中心</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${APP_PATH }/yysqyem">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>申请管理</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="unicode.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>运营中心</cite>
                        </a>
                    </li>
                </ul>
            </li>
        </ul>
      </div>
    </div>
    <!-- <div class="x-slide_left"></div> -->
    <!-- 左侧菜单结束 -->
    <!-- 右侧主体开始 -->
    <div class="page-content">
        <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
          <ul class="layui-tab-title">
            <li class="home"><i class="layui-icon">&#xe68e;</i>我的桌面</li>
          </ul>
          <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src="${APP_PATH }/tushouye" frameborder="0" scrolling="yes" class="x-iframe"></iframe>
            </div>
          </div>
        </div>
    </div>
    <div class="page-content-bg"></div>
    <!-- 右侧主体结束 -->
    <!-- 中部结束 -->
    <!-- 底部开始 -->
    <div class="footer">
        <div class="copyright">@.wuye五叶蚂蚁实业集团</div>  
    </div>
    <!-- 底部结束 -->
    <script>
   
    </script>
</body>
</html>