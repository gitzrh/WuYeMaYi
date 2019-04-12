package com.wuyemy.controller;

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

import com.github.pagehelper.PageInfo;
import com.wuyemy.bean.Canshu;
import com.wuyemy.bean.Yyzxlvcanshu;
import com.wuyemy.service.CanshuService;

@Controller
public class CanshuController {
	
	@Autowired
	private CanshuService canshuService;
	
	@RequestMapping("/tocanshu")
	public String tocanshu(HttpServletRequest request, HttpServletResponse response,Model model ) throws Exception{
		String session  = (String) request.getSession().getAttribute("username");
		
		if(session==null){
			response.sendRedirect("wyehoutaiadmin.jsp");
		}
		 List<Canshu> canshu = canshuService.getCanShu();
		 PageInfo page = new PageInfo(canshu, 10);
		 
		 model.addAttribute("canshu", page);
		return "canshu";
	}
	@RequestMapping("/toyycanshu")
	public String toyycanshu(HttpServletRequest request, HttpServletResponse response,Model model ) throws Exception{
		String session  = (String) request.getSession().getAttribute("username");
		
		if(session==null){
			
			response.sendRedirect("wyehoutaiadmin.jsp");
		}
		List<Yyzxlvcanshu> yycanshu = canshuService.getyycanshu();
		 PageInfo page = new PageInfo(yycanshu, 10);
		 model.addAttribute("yycanshu", page);
		 
		return "yycanshu";
	}
	
	@RequestMapping("/xiugaicanshu1")
	@ResponseBody
	public Msg updatecanshu1(@RequestParam("id")Integer id,@RequestParam("canshu")BigDecimal canshu){
		canshuService.updatecanshu1(id,canshu);
		return Msg.success();
	}
	@RequestMapping("/xiugaicanshu2")
	@ResponseBody
	public Msg updatecanshu2(@RequestParam("id")Integer id,@RequestParam("lvname")String lvname,
			@RequestParam("fulijin")Integer fulijin,@RequestParam("zongrenshu")Integer zongnum,
			@RequestParam("zhituishu")Integer zhituinum,@RequestParam("zhekoubi")BigDecimal zhekoubili){
		
		canshuService.updatecanshu2(id,lvname,fulijin,zongnum,zhituinum,zhekoubili);
		return Msg.success();
	}
	@RequestMapping("/addcanshu")
	@ResponseBody
	public Msg addcanshu(@RequestParam("lvname")String lvname,
			@RequestParam("fulijin")Integer fulijin,@RequestParam("zongrenshu")Integer zongnum,
			@RequestParam("zhituishu")Integer zhituinum,@RequestParam("zhekoubi")BigDecimal zhekoubili){
		
		canshuService.addcanshu(lvname,fulijin,zongnum,zhituinum,zhekoubili);
		return Msg.success();
	}
	
	
	
}
