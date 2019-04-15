package com.wuyemy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.wuyemy.bean.Zijinmingxi;
import com.wuyemy.service.ZijinmingxiService;

@Controller
public class ZijinmxController {
	@Autowired
	private ZijinmingxiService zijinmxService;
	
	@RequestMapping("/tokoujil")
	public String tokoujil(HttpServletRequest request, HttpServletResponse response,Model model ) throws Exception{
		String session  = (String) request.getSession().getAttribute("username");
		
		if(session==null){
			
			response.sendRedirect("index.jsp");
		}
		 List<Zijinmingxi> zijinmingxs = zijinmxService.getallZJMx();
		 PageInfo page = new PageInfo(zijinmingxs, 50);
		 
		 model.addAttribute("pageInfo", page);
		return "subtract";
		
	}
	
}
