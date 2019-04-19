package com.wuyemy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wuyemy.service.ManageService;

@Controller
public class ManageController {

	@Autowired
	private ManageService mangageService;

	@RequestMapping(value="/adminLogin",method=RequestMethod.POST)
	@ResponseBody
	public  Msg loginadmin(@RequestParam("username")String username,@RequestParam("password")String password,
				@RequestParam("yanzhengma")String yanzhengma,HttpServletRequest request, HttpServletResponse response){
		
		//2. 获取 session 中的 CHECK_CODE_KEY 属性值
		String sessionCode = (String)request.getSession().getAttribute("CHECK_CODE_KEY");
		long i = mangageService.countadmin(username,password);
				
		 if(i==0||yanzhengma==""||!(yanzhengma.equalsIgnoreCase(sessionCode))){			 
			 return Msg.fail().add("login", "错误，请重新输入");
		 }else{
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			session.setMaxInactiveInterval(60*60*6);
			
			return Msg.success();
		 }
	} 
	
	@RequestMapping("/toadminqpwoamznjhh" )
	public String toadmin( HttpServletRequest request, 
			HttpServletResponse response) throws Exception{
		String session  = (String) request.getSession().getAttribute("username");
		
		if(session==null){
			response.sendRedirect("index.jsp");
		}
		return "admin";
	}
	
	@RequestMapping("/tushouye")
	public String toshouye(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String session  = (String) request.getSession().getAttribute("username");
		if(session==null){
			response.sendRedirect("index.jsp");
		}
		return "welcome";
	}
	
	@RequestMapping("/tuichu")
	public void tuichu(HttpServletRequest request, HttpServletResponse response) throws Exception{
		request.getSession().removeAttribute("username");
		response.sendRedirect("index.jsp");
	}
}
