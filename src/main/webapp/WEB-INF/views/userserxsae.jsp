<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查找一个客户</title>
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
			 window.location.href="${APP_PATH }/yijihuoAllK";
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
		$("#shanchu").click(function(){
			
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
		$("#kouchujifen").click(function(){
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
		$("#addjifen").click(function(){
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
		$("#updatexinxi").click(function(){
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
		
		//查看该账号信息
		$("#chakan1").click(function(){
			var zhanghao = $.trim($("#chakan2").val());
			
			$.ajax({
					url:"${APP_PATH }/chazhaoone2",
					type:"POST",
					data:"zhanghao="+zhanghao,
					success:function(result){
					var code = result.code;
						
						if (code == 100) {
							var kid =result.extent.bbgqs.kid;
							var kname =result.extent.bbgqs.khname;
							var zhanghao=result.extent.bbgqs.zhanghao;
							var tzhanghao =result.extent.bbgqs.tzhanghao;
							var fxjf =result.extent.bbgqs.jifen.fxjf;
							var gcjf =result.extent.bbgqs.jifen.gcjf;
							var ztjf =result.extent.bbgqs.jifen.ztjf;
							var chjf =result.extent.bbgqs.jifen.chjf;
							var jihuotime =result.extent.bbgqs.jihuotime;
							var yyzxid =result.extent.bbgqs.yyzxid;
							var zhuangtai =result.extent.bbgqs.zhuangtai.zhuangtai;
						
							$("#b1").text(kid);
							$("#b2").text(kname);
							$("#b3").text(zhanghao);
							$("#b4").text(tzhanghao);
							$("#b5").text(fxjf);
							$("#b6").text(gcjf);
							$("#b7").text(ztjf);
							$("#b8").text(chjf);
							$("#b9").text(jihuotime);
							$("#b10").text(yyzxid);
							$("#b11").text(zhuangtai);
							
							
						}
					}
					
				})
				
			
		})	
	})
	</script>
</head>
<body>
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
        <button type="button" id="tijiaoss" class="btn btn-primary " >提交</button>
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
        <button type="button" id="tijiaos" class="btn btn-primary " >提交</button>
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
        <button type="button" id="tijiao" class="btn btn-primary " >提交</button>
      </div>
    </div>
  </div>
</div>

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
		        <button class="btn btn-default"  id="chakan1" type="button">查找</button>
		        <button class="btn btn-default"  id="fabhui" type="button">返回</button>
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
						<th>状态</th>
						<th>操作</th>
						
						
					</tr>
						<tr class="tabllll">
							<th id="b1"></th>
							<th id="b2"></th>
							<th id="b3"></th>
							<th id="b4"></th>
							<th id="b5"></th>
							<th id="b6"></th>
							<th id="b7"></th>
							<th id="b8"></th>
							<th id="b9"></th>
							<th id="b10"></th>
							<th id="b11"></th>
							<th id="caozuo"><button  id="updatexinxi" class="btn btn-primary   get_model_btn btn-sm">
								<span class="glyphicon glyphicon-list" aria-hidden="true"></span>
								编辑
								</button>
								<button   class="btn btn-info  xiugaiyyzxid get_model_btn btn-sm">
								<span class="glyphicon glyphicon-list" aria-hidden="true"></span>
								修改运营中心编号
								</button>
								<button id="addjifen"  class="btn btn-success  record_get_model_btn btn-sm">
								<span class="glyphicon glyphicon-list" aria-hidden="true"></span>
								增加积分
								</button>
								<button  id="kouchujifen" class="btn btn-warning      record_get_model_btn btn-sm">
								<span class="glyphicon glyphicon-list" aria-hidden="true"></span>
								扣除积分
								</button>
								<button id="shanchu"  class="btn btn-danger   record_get_model_btn btn-sm">
								<span class="glyphicon glyphicon-list" aria-hidden="true"></span>
								删除
								</button>
							</th>
						</tr>
				</table>
			</div>
		</div>
	</div>
</body>
</html>