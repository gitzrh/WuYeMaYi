package com.wuyemy.controller;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.wuyemy.service.ManageService;

@Controller
public class ManageController {

	@Autowired
	private ManageService mangageService;

	@RequestMapping("/adminLogin")
	@ResponseBody
	public  Msg loginadmin(@RequestParam("username")String username,
				@RequestParam("password")String password,
				@RequestParam("yanzhengma")String yanzhengma,
				HttpServletRequest request, HttpServletResponse response){
		
		//2. 获取 session 中的 CHECK_CODE_KEY 属性值
		String sessionCode = (String)request.getSession().getAttribute("CHECK_CODE_KEY");
		
		
		long i = mangageService.countadmin(username,password);
				
		 if(i==0||yanzhengma==""||!(yanzhengma.equalsIgnoreCase(sessionCode))){			 
			 return Msg.fail().add("login", "错误，请重新输入");
		 }else{
			 
			
			 return Msg.success();
		
		 }
		 
		 
	} 
	@RequestMapping("/toadmin")
	public String toadmin(){
		
		return "admin";
	}
	
	@RequestMapping("/tushouye")
	public String toshouye(){
		return "welcome";
		
	}
}
