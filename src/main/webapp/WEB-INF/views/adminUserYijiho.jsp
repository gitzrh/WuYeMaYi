<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户中心-已通过</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="shortcut  icon" type="image/x-icon" href="${APP_PATH }/Home/img/bitbug_favicon.ico" media="screen"/>
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

<script type="text/javascript">

	$(function(){
		
		
		 $("#fabhui").click(function(){
			 location.reload();
		 })
		 //修改运营中心编号
		 $(".xiugaiyyzxid").click(function(){
				$("#zhangdaoo_input").hide();
			 var zhhh = $(this).parent().parent().find("th:eq(2)").text();
			 var yyid = $(this).parent().parent().find("th:eq(9)").text();
			 
				$("#updateyybiaohao").modal({
					backdrop:"static"
				});
			 
			 $("#zhangdaoo_input").val(zhhh);
			 $("#oldbianhao_upd_input").val(yyid);
				
			 
		 })
			 $("#qdyybian").click(function(){
				 var zhanghaos = $("#zhangdaoo_input").val();
				var bianhao = $("#newbianhao_upd_input").val();
				 $.ajax({
						url:"${APP_PATH }/updatebinhao",
						type:"PUT",
						data:"zhanghaos="+zhanghaos+"&bianhao="+bianhao,
						success:function(result){
								location.reload();
						}
					
				});
			 })
		 
		 
		//删除按钮
		$(".shanchu").click(function(){
			
			var ddhh = $(this).parent().parent().find("th:eq(2)").text();
			var textt = $(this).parent().parent().find("th:eq(1)").text();
			
			if(confirm("确定要删除【"+ textt +"】吗？")){
			$.ajax({
				url:"${APP_PATH }/shanchu",
				type:"PUT",
				data:"zhanghao="+ddhh,
				success:function(result){
						
						location.reload();
					
				}
				
				});
			}
		}); 
	
		 
		//扣除积分
	

		$(".kouchujifen").click(function(){
			$("#zhanghao_input").hide();
			
			var zhanghao = $(this).parent().parent().find("th:eq(2)").text();
			$("#zhanghao_input").val(zhanghao);
			$("#kouchukuang").modal({
				backdrop:"static"
			});
			
			
			
			
		});
			$("#tijiao").click(function(){
				var leix = $('#danxuank input:radio:checked').val();
				var zhanghao = $("#zhanghao_input").val();
				var num = $("#shuliang_upd_input").val();
				
				$.ajax({
					url:"${APP_PATH }/kouchujifen",
					type:"PUT",
					data:"zhanghao="+zhanghao+"&leix="+leix+"&num="+num,
					success:function(result){
						location.reload();
					}
				})
			})
			
		//增加积分
		$(".addjifen").click(function(){
			$("#zhanghaos_input").hide();
			
			var zhanghao = $(this).parent().parent().find("th:eq(2)").text();
			$("#zhanghaos_input").val(zhanghao);
			
			$("#addjifenkuang").modal({
				backdrop:"static"
			});
			
			
		})
			$("#tijiaos").click(function(){
				var leix = $('#danxuanks input:radio:checked').val();
				var zhanghao = $("#zhanghaos_input").val();
				var num = $("#addnum_upd_input").val();
				$.ajax({
					url:"${APP_PATH }/addjifen",
					type:"PUT",
					data:"zhanghao="+zhanghao+"&leix="+leix+"&num="+num,
					success:function(result){
						location.reload();
					}
				})
			})
		
		//更改用户信息
		$(".updatexinxi").click(function(){
			$("#zhanghaoss_input").hide();
			var zhanghao = $(this).parent().parent().find("th:eq(2)").text();
			var name = $(this).parent().parent().find("th:eq(1)").text();
			$("#zhanghaoss_input").val(zhanghao);
			$("#name_upd_input").val(name);
			
			$("#updatexixi").modal({
				backdrop:"static"
			});
			
		})
			$("#tijiaoss").click(function(){
				var zhanghao = $("#zhanghaoss_input").val();
				var name = $("#name_upd_input").val();
				var password = $("#password_upd_input").val()
				
				$.ajax({
					url:"${APP_PATH }/updateuser",
					type:"PUT",
					data:"zhanghao="+zhanghao+"&name="+name+"&password="+password,
					success:function(result){
						location.reload();
					}
				})
			 })
		
		//查找一个账号的信息
		$("#chazhao1").click(function(){
			window.location.href="${APP_PATH }/czoneeShou";
		})
		
		//查看该账号信息
		$("#chakan1").click(function(){
			var zhanghao = $.trim($("#chakan2").val());
			$("#selectxixi").modal({
				backdrop:"static"
			});
				
			$.ajax({
					url:"${APP_PATH }/chazhaoone",
					type:"POST",
					data:"zhanghao="+zhanghao,
					success:function(result){
						var code = result.code;
						
						if (code == 100) {
							var kid =result.extent.pageInfo.kid;
							var kname =result.extent.pageInfo.khname;
							var zhanghao=result.extent.pageInfo.zhanghao;
							var tzhanghao =result.extent.pageInfo.tzhanghao;
							var fxjf =result.extent.pageInfo.jifen.fxjf;
							var gcjf =result.extent.pageInfo.jifen.gcjf;
							var ztjf =result.extent.pageInfo.jifen.ztjf;
							var chjf =result.extent.pageInfo.jifen.chjf;
							var jihuotime =result.extent.pageInfo.jihuotime;
							var yyzxid =result.extent.pageInfo.yyzxid;
							var zhuangtai =result.extent.pageInfo.zhuangtai.zhuangtai;
							
							
							$("#a1").val(kid);
							$("#a2").val(kname);
							$("#a3").val(zhanghao);
							$("#a4").val(tzhanghao);
							$("#a5").val(fxjf);
							$("#a6").val(gcjf);
							$("#a7").val(ztjf);
							$("#a8").val(chjf);
							$("#a9").val(jihuotime);
							$("#a10").val(yyzxid);
							$("#a11").val(zhuangtai);
						}
					}
				})
		})	
		
	$(".dngjiee").click(function(){
			
			var ddhh = $(this).parent().parent().find("th:eq(2)").text();
			var textt = $(this).parent().parent().find("th:eq(1)").text();
			
			if(confirm("确定要冻结【"+ textt +"】吗？")){
				
				
			
			$.ajax({
				url:"${APP_PATH }/dngjiee",
				type:"PUT",
				data:"zhanghao="+ddhh,
				success:function(result){
					
						
						location.reload();
					

				}
				
				})
			}
		})
	$(".jiedongs").click(function(){
			
			var ddhh = $(this).parent().parent().find("th:eq(2)").text();
			var textt = $(this).parent().parent().find("th:eq(1)").text();
			
			if(confirm("确定要激活【"+ textt +"】吗？")){
				
				
			
			$.ajax({
				url:"${APP_PATH }/jiedongs",
				type:"PUT",
				data:"zhanghao="+ddhh,
				success:function(result){
					
						
						location.reload();
					

				}
				
				})
			}
		})
			
		
	})
</script>		
</head>
<body>



<!-- 查看 -->
<div class="modal fade" id="selectxixi" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">查看用户信息</h4>
      </div>
      <div class="modal-body">
       	<form class="form-horizontal">
		 
		  <div class="form-group">
		    <label class="col-sm-2 control-label">UID</label>
		    <div class="col-sm-6">
		     
		      <input type="text" readonly  unselectable="on" value="" name="cTypeB" class="form-control" id="a1" >
		    </div>
		  </div>	
		  <div class="form-group">
		    <label class="col-sm-2 control-label">名字</label>
		    <div class="col-sm-6">
		     
		      <input type="text" readonly  unselectable="on" value="" name="cTypeB" class="form-control" id="a2" >
		    </div>
		  </div>	
		  <div class="form-group">
		    <label class="col-sm-2 control-label">账号</label>
		    <div class="col-sm-6">
		     
		      <input type="text" readonly  unselectable="on" value="" name="cTypeB" class="form-control" id="a3" >
		    </div>
		  </div>	
		  <div class="form-group">
		    <label class="col-sm-2 control-label">推荐人账号</label>
		    <div class="col-sm-6">
		     
		      <input type="text" readonly  unselectable="on" value="" name="cTypeB" class="form-control" id="a4" >
		    </div>
		  </div>	
		  <div class="form-group">
		    <label class="col-sm-2 control-label">分享积分</label>
		    <div class="col-sm-6">
		     
		      <input type="text" readonly  unselectable="on" value="" name="cTypeB" class="form-control" id="a5" >
		    </div>
		  </div>	
		  <div class="form-group">
		    <label class="col-sm-2 control-label">购车积分</label>
		    <div class="col-sm-6">
		     
		      <input type="text" readonly  unselectable="on" value="" name="cTypeB" class="form-control" id="a6" >
		    </div>
		  </div>	
		  <div class="form-group">
		    <label class="col-sm-2 control-label">在途积分</label>
		    <div class="col-sm-6">
		     
		      <input type="text" readonly  unselectable="on" value="" name="cTypeB" class="form-control" id="a7" >
		    </div>
		  </div>	
		  <div class="form-group">
		    <label class="col-sm-2 control-label">出局积分</label>
		    <div class="col-sm-6">
		     
		      <input type="text" readonly  unselectable="on" value="" name="cTypeB" class="form-control" id="a8" >
		    </div>
		  </div>	
		  <div class="form-group">
		    <label class="col-sm-2 control-label">激活时间</label>
		    <div class="col-sm-6">
		     
		      <input type="text" readonly  unselectable="on" value="" name="cTypeB" class="form-control" id="a9" >
		    </div>
		  </div>	
		  <div class="form-group">
		    <label class="col-sm-2 control-label">运营中心</label>
		    <div class="col-sm-6">
		     
		      <input type="text" readonly  unselectable="on" value="" name="cTypeB" class="form-control" id="a10" >
		    </div>
		  </div>	
		  <div class="form-group">
		    <label class="col-sm-2 control-label">状态</label>
		    <div class="col-sm-6">
		     
		      <input type="text" readonly  unselectable="on" value="" name="cTypeB" class="form-control" id="a11" >
		    </div>
		  </div>	
		 
		 </form>
       		   
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
      </div>
    </div>
  </div>
</div>

<!-- 修改运营中心编号 -->
<div class="modal fade" id="updateyybiaohao" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">修改运营中心编号</h4>
      </div>
      <div class="modal-body">
       	<form class="form-horizontal">
		  <input type="text" name="zhanghao" readonly  unselectable="on" class="form-control33" id="zhangdaoo_input"  />
		  <div class="form-group">
		    <label class="col-sm-2 control-label">原运营中心编号</label>
		    <div class="col-sm-6">
		     
		      <input type="text" value="" readonly  unselectable="on" name="cTypeB" class="form-control" id="oldbianhao_upd_input" >
		    </div>
		  </div>	
		  <div class="form-group">
		    <label class="col-sm-2 control-label">新运营中心编号</label>
		    <div class="col-sm-6">
		     
		      <input type="text" placeholder="请输入新的运营中心编号" value="" name="cTypeB" class="form-control" id="newbianhao_upd_input" >
		    </div>
		  </div>	
		 </form>
      </div>
      
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary " id="qdyybian" >确定</button>
      </div>
      
    </div>
  </div>
</div>

<!-- 修改 -->
<div class="modal fade" id="updatexixi" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">修改用户信息</h4>
      </div>
      <div class="modal-body">
       	<form class="form-horizontal">
		 
		  <input type="text" name="zhanghao" readonly  unselectable="on" class="form-control33" id="zhanghaoss_input"  />
		  
		  <div class="form-group">
		    <label class="col-sm-2 control-label">账号名字</label>
		    <div class="col-sm-6">
		      <input type="text" value="" name="cTypeB" class="form-control" id="name_upd_input" >
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label class="col-sm-2 control-label">账号密码</label>
		    <div class="col-sm-6">
		      <input type="text" placeholder="请输入新密码" value="" name="cTypeB" class="form-control" id="password_upd_input" >
		    </div>
		  </div>	
		</form>
      </div>
      
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary " id="tijiaoss" >提交</button>
      </div>
      
    </div>
  </div>
</div>

<!-- 增加积分模态框 -->
<div class="modal fade" id="addjifenkuang" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">增加积分</h4>
      </div>
      <div class="modal-body">
       	<form class="form-horizontal">
		 
		  		 <input type="text" name="zhanghao" readonly  unselectable="on" class="form-control33" id="zhanghaos_input"  />
		  <div class="form-group">
		    <label class="col-sm-2 control-label">增加数量</label>
		    <div class="col-sm-6">
		     
		      <input type="text" value="" name="cTypeB" class="form-control" id="addnum_upd_input" >
		    </div>
		  </div>	
		  <div class="form-group" id="danxuanks">
		  	<label class="col-sm-2 control-label">金币类型</label>
		    <label class="radio-inline">
  				<input class="jb" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="4"> 分享积分
			</label>
			<label class="radio-inline">
			  <input class="jb" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="5"> 购车积分
			</label>
			<label  class="radio-inline">
			  <input class="jb" type="radio" name="inlineRadioOptions" id="inlineRadio3" value="6"> 出局积分
			</label>	    		  
		 </div>
		 </form>
       		   
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary " id="tijiaos" >提交</button>
      </div>
    </div>
  </div>
</div>

<!-- 扣除积分模态框 -->
<div class="modal fade" id="kouchukuang" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">扣除积分</h4>
      </div>
      <div class="modal-body">
       	<form class="form-horizontal">
		 
		<input type="text" name="zhanghao" readonly  unselectable="on" class="form-control33" id="zhanghao_input"  />
		  <div class="form-group">
		    <label class="col-sm-2 control-label">扣除数量</label>
		    <div class="col-sm-6">
		     
		      <input type="text" value="" name="cTypeB" class="form-control" id="shuliang_upd_input" >
		    </div>
		  </div>	
		  <div class="form-group" id="danxuank">
		  	<label class="col-sm-2 control-label">金币类型</label>
		    <label class="radio-inline">
  				<input class="jb" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="1"> 分享积分
			</label>
			<label class="radio-inline">
			  <input class="jb" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="2"> 购车积分
			</label>
			<label  class="radio-inline">
			  <input class="jb" type="radio" name="inlineRadioOptions" id="inlineRadio3" value="3"> 出局积分
			</label>	    		  
		 </div>
		 </form>
       		   
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary " id="tijiao" >提交</button>
      </div>
    </div>
  </div>
</div>

<!-- 搭建显示页面 -->
<div class="container-fluid">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h3>用户中心  — 已激活</h3>
			</div>
		</div>
		<div class="col-md-2 col-lg-6">
		    <div class="input-group">
		      <input type="text" id="chakan2"  class="form-control so_text" placeholder="请输入要查看的账号">
		      <span class="input-group-btn">
		        <button class="btn btn-default"  id="chakan1" type="button">查看</button>
		        <button class="btn btn-default"  id="chazhao1" type="button" >查找</button>		        
		        <button class="btn btn-default"  id="fabhui" type="button">刷新</button>
		      </span>
		    </div>
		  </div>
		<br><br>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md10">
				<table class="table table-hover">
					<tr>
						<th>UID</th>
						<th>姓名</th>
						<th>账号</th>
						<th>推荐人账号</th>
						<th>分享积分</th>
						<th>购车积分</th>
						<th>在途积分</th>
						<th>出局积分</th>
						<th>激活时间</th>
						<th>运营中心编号</th>
						<th>最后登录时间</th>
						<th>状态</th>
						<th>操作</th>
					</tr>
					<c:forEach items="${pageInfo.list }" var="reca">
						<tr class="tabllll">
							<th id="kid">${reca.kid }</th>
							<th id="khname">${reca.khname }</th>
							<th id="zhanghao">${reca.zhanghao }</th>
							<th id="tzhanghao">${reca.tzhanghao }</th>
							<th id="fxjf">${reca.jifen.fxjf }</th>
							<th id="gcjf">${reca.jifen.gcjf }</th>
							<th id="ztjf">${reca.jifen.ztjf }</th>
							<th id="chjf">${reca.jifen.chjf }</th>
							<th id="jihuotime">${reca.jihuotime }</th>
							<th id="yyzxid">${reca.yyzxid }</th>
							<th id="denglutime">${reca.sdjlu.biandongtime }</th>
							
							<th id="zhuangtai">${reca.zhuangtai.zhuangtai }</th>
							<th id="caozuo"><button   class="btn btn-primary  updatexinxi get_model_btn btn-sm">
								<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
								编辑
								</button>
								<button   class="btn btn-info  xiugaiyyzxid get_model_btn btn-sm">
								<span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
								修改运营中心编号
								</button>
								<button   class="btn btn-success addjifen record_get_model_btn btn-sm">
								<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
								增加积分
								</button>
								<button   class="btn btn-warning   kouchujifen   record_get_model_btn btn-sm">
								<span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
								扣除积分
								</button>
								
							<c:if test="${reca.zhuangtai.zhuangtai == '正常' }">
								<button   class="btn btn-info  dngjiee record_get_model_btn btn-sm">
								<span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span>
								冻结
								</button>
							</c:if>
							<c:if test="${reca.zhuangtai.zhuangtai == '禁用' }">
								<button   class="btn btn-success  jiedongs record_get_model_btn btn-sm">
								<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
								激活
								</button>
							</c:if>
								<button   class="btn btn-danger  shanchu record_get_model_btn btn-sm">
								<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
								删除
								</button>
							</th>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>

		<!-- 显示分页信息 -->
		<div class="row ljljlj">
			<!--分页文字信息  -->
			<div class="col-md-6">当前 ${pageInfo.pageNum }页,总${pageInfo.pages }
				页,总 ${pageInfo.total } 条记录</div>
			<!-- 分页条信息 -->
			<div class="col-md-6">
				<nav aria-label="Page navigation">
				<ul class="pagination  kehuhu">
					<li><a href="${APP_PATH }/yijihuoAllK?pn=1">首页</a></li>
					<c:if test="${pageInfo.hasPreviousPage }">
						<li><a href="${APP_PATH }/yijihuoAllK?pn=${pageInfo.pageNum-1}"
							aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
						</a></li>
					</c:if>

					<c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
						<c:if test="${page_Num == pageInfo.pageNum }">
							<li class="active"><a href="#">${page_Num }</a></li>
						</c:if>
						<c:if test="${page_Num != pageInfo.pageNum }">
							<li><a href="${APP_PATH }/yijihuoAllK?pn=${page_Num }">${page_Num }</a></li>
						</c:if>

					</c:forEach>
					<c:if test="${pageInfo.hasNextPage }">
						<li><a href="${APP_PATH }/yijihuoAllK?pn=${pageInfo.pageNum+1 }"
							aria-label="Next"> <span aria-hidden="true">&raquo;</span>
						</a></li>
					</c:if>
					<li><a href="${APP_PATH }/yijihuoAllK?pn=${pageInfo.pages}">末页</a></li>
				</ul>
				
				</nav>
			</div>
		</div>
</div>

</body>
</html>