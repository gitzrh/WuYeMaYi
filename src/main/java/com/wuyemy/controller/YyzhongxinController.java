package com.wuyemy.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuyemy.bean.JifenZonghe;
import com.wuyemy.bean.Kuser;
import com.wuyemy.bean.Yyzx;
import com.wuyemy.bean.Yyzxsq;
import com.wuyemy.dao.KuserMapper;
import com.wuyemy.service.KuserService;
import com.wuyemy.service.YyzhongxinService;

@Controller
public class YyzhongxinController {

	@Autowired
	private YyzhongxinService yyzxService;
	@Autowired 
	private KuserService kuserService;
	@RequestMapping("/yysqyem")
	public String tosqzx(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			HttpServletRequest request, HttpServletResponse response,Model model) throws Exception{
		String session  = (String) request.getSession().getAttribute("username");
		
		if(session==null){
			
			response.sendRedirect("wyehoutaiadmin.jsp");
		}
		// 这不是一个分页查询；
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 50);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Yyzxsq> list = yyzxService.getallyysq();	
		PageInfo page = new PageInfo(list, 5);
		model.addAttribute("pageInfo", page);
	
		return "yyzxshq";
	}
	
	
	@RequestMapping("/tongguoyysq")
	@ResponseBody
	public Msg tonggyysq(@RequestParam("id")int id,@RequestParam("zhanghao")String zhanghao,
			@RequestParam("name")String name,@RequestParam("bianhao")String bianhao){
		yyzxService.tongguoyysq(id,zhanghao,name,bianhao);
		
		return Msg.success();
	}
	@RequestMapping("/jujueyysq")
	@ResponseBody
	public Msg jujueyysq(@RequestParam("id")int id){
		yyzxService.jujuesqyy(id);
		
		return Msg.success();
	}
	@RequestMapping("/yyzhongxinhoutai")
	public String toYunyinhzongxinadmin(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			HttpServletRequest request, HttpServletResponse response,Model model) throws Exception{
String session  = (String) request.getSession().getAttribute("username");
		
		if(session==null){
			
			response.sendRedirect("wyehoutaiadmin.jsp");
		}
		// 这不是一个分页查询；
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 50);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Yyzx> list = yyzxService.getallyyzx();
		PageInfo page = new PageInfo(list, 5);
		model.addAttribute("pageInfo", page);
		
		return "yyzxadmin";
	}
	
	@RequestMapping("/tuandui")
	public String totuandui(@RequestParam("yyzhanghao")String zhanghao,
			Map<String,Object>map,
			HttpServletRequest request, HttpServletResponse response) throws Exception{
String session  = (String) request.getSession().getAttribute("username");
		
		if(session==null){
			
			response.sendRedirect("wyehoutaiadmin.jsp");
		}
		
		List<Kuser> list = kuserService.getAllzhanghao(zhanghao);
		
		map.put("list", list);
		return "tuanduiliebiao";
	}
	@RequestMapping("/zhitui")
	public String tozhitui(@RequestParam("yybianhao")String yybianhao,
			Map<String,Object>map,
			HttpServletRequest request, HttpServletResponse response) throws Exception{
		String session  = (String) request.getSession().getAttribute("username");
		
		if(session==null){
			
			response.sendRedirect("wyehoutaiadmin.jsp");
		}
		
		List<Kuser> list = kuserService.gettuanzhanghao(yybianhao);
		
		map.put("list", list);
		return "zhituiiebiao";
	}
	
	@RequestMapping("/shuaxinzhitui")
	@ResponseBody
	public Msg shuaxinzhitui(@RequestParam("ddhh")String zhanghao,@RequestParam("yybianhao")String yybianhao){
		kuserService.eitZhituiiinum(zhanghao);
		kuserService.eittuanduinum(yybianhao);
		return Msg.success();
	}
	@RequestMapping("/shengjiyyzx")
	@ResponseBody
	public Msg shengjiyyzx(@RequestParam("bianhao")String bianhao){
		
		yyzxService.shengji(bianhao);
		return Msg.success();
	}
	
	@RequestMapping("/jiangji")
	@ResponseBody
	public Msg jiangjiyyzx(@RequestParam("bianhao")String bianhao){
		
		yyzxService.jiangji(bianhao);
		return Msg.success();
	}
	@RequestMapping("/quxiao")
	@ResponseBody
	public Msg quxiaoyyzx(@RequestParam("bianhao")String bianhao){
		
		yyzxService.quxiao(bianhao);
		return Msg.success();
	}
	@RequestMapping("/updatebinhao")
	@ResponseBody
	public Msg xiugaiybianha(@RequestParam("zhanghaos")String zhanghao,@RequestParam("bianhao")String bianhao){
		
		yyzxService.xiaugaoybh( zhanghao,bianhao);
		return Msg.success();
	}
	@RequestMapping("/jinbishezhi")
	@ResponseBody
	public Msg jinbixiugai(@RequestParam("jinbi")BigDecimal jinbi,@RequestParam("bianhaos")String bianhao){
		
		yyzxService.xiugaijinbibh( jinbi,bianhao);
		return Msg.success();
	}
	
	@RequestMapping("/shouyeyeye")
	@ResponseBody
	public Msg toshouyewe(){
		 kuserService.getwelome();
		
		return Msg.success().add("numm","");
	}
	
	
	
	
}
