package com.wuyemy.controller;

import java.io.IOException;
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
import com.wuyemy.bean.Yyzxsq;
import com.wuyemy.service.YyzhongxinService;

@Controller
public class YyzhongxinController {

	@Autowired
	private YyzhongxinService yyzxService;
	
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
	public Msg tonggyysq(@RequestParam("id")int id){
		yyzxService.tongguoyysq(id);
		
		return Msg.success();
	}
}
