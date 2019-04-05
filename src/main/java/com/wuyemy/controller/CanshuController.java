package com.wuyemy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.wuyemy.bean.Canshu;
import com.wuyemy.bean.Yyzxlvcanshu;
import com.wuyemy.service.CanshuService;

@Controller
public class CanshuController {
	
	@Autowired
	private CanshuService canshuService;
	
	@RequestMapping("/tocanshu")
	public String tocanshu(HttpServletRequest request, HttpServletResponse response,Model model ){
		 List<Canshu> canshu = canshuService.getCanShu();
		 PageInfo page = new PageInfo(canshu, 10);
		 
		 model.addAttribute("canshu", page);
		return "canshu";
	}
	@RequestMapping("/toyycanshu")
	public String toyycanshu(HttpServletRequest request, HttpServletResponse response,Model model ){
		List<Yyzxlvcanshu> yycanshu = canshuService.getyycanshu();
		 PageInfo page = new PageInfo(yycanshu, 10);
		 model.addAttribute("yycanshu", page);
		return "yycanshu";
	}
	
	
}
