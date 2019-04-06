package com.wuyemy.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

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
import com.wuyemy.bean.Kuser;
import com.wuyemy.bean.Tixian;
import com.wuyemy.service.TixianService;

@Controller
public class TixianController {
	@Autowired
	private TixianService tixianService;
	

	@RequestMapping("/tixianShenhe")
	public String toTixianShenhe(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			HttpServletRequest request, HttpServletResponse response,Model model) throws IOException{
		
		String session  = (String) request.getSession().getAttribute("username");
		
		if(session==null){
			
			response.sendRedirect("wyehoutaiadmin.jsp");
		}
				// 这不是一个分页查询；
				// 引入PageHelper分页插件
				// 在查询之前只需要调用，传入页码，以及每页的大小
				PageHelper.startPage(pn, 50);
				// startPage后面紧跟的这个查询就是一个分页查询
				List<Tixian> tixians = tixianService.getTixianShenhe();
				PageInfo page = new PageInfo(tixians, 5);
				model.addAttribute("pageInfo", page);
				
				return "tixianadmin1";
		
		
		
		
	}
	@RequestMapping("/tixianTongg")
	public String toTixianTongg(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
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
		List<Tixian> tixians = tixianService.getTixianTongg();
		PageInfo page = new PageInfo(tixians, 5);
		model.addAttribute("pageInfo", page);
		
		return "tixianadmin2";
		
		
		
		
	}
	@RequestMapping("/tixianJuju")
	public String toTixianJujue(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
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
		List<Tixian> tixians = tixianService.getTixianJujue();
		PageInfo page = new PageInfo(tixians, 5);
		model.addAttribute("pageInfo", page);
		
		return "tixianadmin3";
		
		
		
		
	}
	
	@RequestMapping("/tixiantguo")
	@ResponseBody
	public Msg tongguotixian(@RequestParam("id")Integer id){
		
		tixianService.tongguo(id);
		return Msg.success();
	}
	
	@RequestMapping("/jujuetixian")
	@ResponseBody
	public Msg jujuetixian(@RequestParam("id")Integer id,@RequestParam("zhanghao")String zhanghao,
			@RequestParam("jibileixing")String jibileixing,@RequestParam("jibbishu")BigDecimal jibbishu){
		
		tixianService.jujue(id,zhanghao,jibileixing,jibbishu);
		
		
		return Msg.success();
	}
	
	
}
