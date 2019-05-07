<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>运营中心-后台</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="shortcut  icon" type="image/x-icon" href="${APP_PATH }/Home/img/bitbug_favicon.ico" media="screen"/>
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	
<script type="text/javascript">
	$(function(){
		
		$(".shuaxin").click(function(){
			
			var ddhh = $(this).parent().parent().find("th:eq(1)").text();
			var yybianhao = $(this).parent().parent().find("th:eq(3)").text();
			$.ajax({
				url:"${APP_PATH }/shuaxinzhitui",
				type:"PUT",
				data:"ddhh="+ddhh+"&yybianhao="+yybianhao,
				success:function(result){
						location.reload();
				}
				
			})
		});
		$(".shengji").click(function(){
			var textt = $(this).parent().parent().find("th:eq(2)").text();
			var bianhao = $(this).parent().parent().find("th:eq(3)").text();
			if(confirm("确定要升级【"+ textt +"】运营中心等级吗？")){
			$.ajax({
				url:"${APP_PATH }/shengjiyyzx",
				type:"PUT",
				data:"bianhao="+bianhao,
				success:function(result){
						location.reload();
				}
				
			})}
			
			
		});
		$(".jiangji").click(function(){
			var textt = $(this).parent().parent().find("th:eq(2)").text();
			var bianhao = $(this).parent().parent().find("th:eq(3)").text();
			if(confirm("确定要降级【"+ textt +"】运营中心等级吗？")){
			$.ajax({
				url:"${APP_PATH }/jiangji",
				type:"PUT",
				data:"bianhao="+bianhao,
				success:function(result){
						location.reload();
				}
				
			})}
			
			
		});
		$(".quxiaozige").click(function(){
			
			var textt = $(this).parent().parent().find("th:eq(2)").text();
			var bianhao = $(this).parent().parent().find("th:eq(3)").text();
			
			if(confirm("确定要取消【"+ textt +"】的运营中心吗？")){
			$.ajax({
				url:"${APP_PATH }/quxiao",
				type:"PUT",
				data:"bianhao="+bianhao,
				success:function(result){
						location.reload();
				}
				
			})}
			
			
		});
		
		$(".jintie").click(function(){
			$("#bianhao_input").hide();
			var jibi = $(this).parent().parent().find("th:eq(5)").text();
			var bianhao = $(this).parent().parent().find("th:eq(3)").text();
			$("#bianhao_input").val(bianhao);
			$("#oldjinbi_upd_input").val(jibi);
			
			$("#updateyyjinbi").modal({
				backdrop:"static"
			});
			
		})
			$("#qdyyinbi").click(function(){
				var jinbis = $("#newjinbi_upd_input").val();
				var bianhaos = $("#bianhao_input").val();
				$.ajax({
					url:"${APP_PATH }/jinbishezhi",
					type:"PUT",
					data:"jinbi="+jinbis+"&bianhaos="+bianhaos,
					success:function(result){
							location.reload();
					}
					
				})
				
			})
		
		
	})
		
	</script>
</head>
<body>


<!-- 修改运营资金 -->
<div class="modal fade" id="updateyyjinbi" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">运营中心资金</h4>
      </div>
      <div class="modal-body">
       	<form class="form-horizontal">
		 
		  		 <input type="text" name="zhanghao" readonly  unselectable="on" class="form-control33" id="bianhao_input"  />
		  <div class="form-group">
		    <label class="col-sm-2 control-label">原运营津贴</label>
		    <div class="col-sm-6">
		     
		      <input type="text" value="" readonly  unselectable="on" name="cTypeB" class="form-control" id="oldjinbi_upd_input" >
		    </div>
		  </div>	
		  <div class="form-group">
		    <label class="col-sm-2 control-label">新运营津贴</label>
		    <div class="col-sm-6">
		     
		      <input type="text" placeholder="请输入运营中心津贴" value="" name="cTypeB" class="form-control" id="newjinbi_upd_input" >
		    </div>
		  </div>	
		 
		 </form>
       		   
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" id="qdyyinbi" class="btn btn-primary " >确定</button>
      </div>
    </div>
  </div>
</div>


	<!-- 搭建显示页面 -->
	<div class="container-fluid">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h3>运营中心-管理后台</h3>
			</div>
		</div>
		<br>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md10">
				<table class="table table-hover">
					<tr>
						<th>ID</th>
						<th>运营中心账号</th>
						<th>负责人姓名</th>
						<th>运营中心编号</th>
						<th>运营中心等级</th>
						<th>运营中心资金</th>
						<th>团队总人数</th>
						<th>直推总人数</th>
						<th>操作</th>
						
						
					</tr>
					<c:forEach items="${pageInfo.list }" var="reca">
						<tr>
							<th>${reca.yyzxid }</th>
							<th>${reca.yyzhanghao }</th>
							<th>${reca.yyname }</th>
							<th>${reca.yybianhao }</th>
							<th>${reca.yyzxlvcanshu.lvname }</th>
							<th>${reca.yyjinbi }</th>
							<th>${reca.yynum }</th>
							<th>${reca.ztnum }  </th>
							
						
							<th>
								<a class="shuaxin" href="javascript:;">刷新</a>
								&nbsp;||&nbsp;
								<a href="${APP_PATH }/zhitui?yybianhao=${reca.yybianhao }">团队用户列表</a>
								&nbsp;||&nbsp;
								<a href="${APP_PATH }/tuandui?yyzhanghao=${reca.yyzhanghao }">直推用户列表</a>
								&nbsp;||&nbsp;
								<a class="jintie" href="javascript:;">运营津贴</a>
								&nbsp;||&nbsp;
								<a class="shengji" href="javascript:;">升级</a>
								&nbsp;||&nbsp;
								<a class="jiangji" href="javascript:;">降级</a>
								&nbsp;||&nbsp;
								<a class="quxiaozige" href="javascript:;">取消运营中心</a>
							</th>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>

		<!-- 显示分页信息 -->
		<div class="row">
			<!--分页文字信息  -->
			<div class="col-md-6">当前 ${pageInfo.pageNum }页,总${pageInfo.pages }
				页,总 ${pageInfo.total } 条记录</div>
			<!-- 分页条信息 -->
			<div class="col-md-6">
				<nav aria-label="Page navigation">
				<ul class="pagination  kehuhu">
					<li><a href="${APP_PATH }/yyzhongxinhoutai?pn=1">首页</a></li>
					<c:if test="${pageInfo.hasPreviousPage }">
						<li><a href="${APP_PATH }/yyzhongxinhoutai?pn=${pageInfo.pageNum-1}"
							aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
						</a></li>
					</c:if>


					<c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
						<c:if test="${page_Num == pageInfo.pageNum }">
							<li class="active"><a href="#">${page_Num }</a></li>
						</c:if>
						<c:if test="${page_Num != pageInfo.pageNum }">
							<li><a href="${APP_PATH }/yyzhongxinhoutai?pn=${page_Num }">${page_Num }</a></li>
						</c:if>

					</c:forEach>
					<c:if test="${pageInfo.hasNextPage }">
						<li><a href="${APP_PATH }/yyzhongxinhoutai?pn=${pageInfo.pageNum+1 }"
							aria-label="Next"> <span aria-hidden="true">&raquo;</span>
						</a></li>
					</c:if>
					<li><a href="${APP_PATH }/yyzhongxinhoutai?pn=${pageInfo.pages}">末页</a></li>
				</ul>
				
				</nav>
			</div>
		</div>
		
	</div>
</body>
</html>