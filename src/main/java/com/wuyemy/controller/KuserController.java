package com.wuyemy.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuyemy.bean.Kuser;
import com.wuyemy.service.KuserService;
import com.wuyemy.until.DateToString;

@Controller
public class KuserController {
	
	@Autowired
	private KuserService kuserService;
	
	private DateToString dateToStr;
	
	@RequestMapping(value="/zhuce",method=RequestMethod.POST)
	@ResponseBody
	private Msg zhuce(@RequestParam("zhanghao") String zhanghao,@RequestParam("kname")String kname,
			@RequestParam(value="tzhanghao")String tzhanghao,
			@RequestParam(value="yyzxid")String yyzxid,
			@RequestParam(value="kpassword")String kpassword,
			@RequestParam(value="yanzheng")String yanzheng,
			HttpServletRequest request, HttpServletResponse response){
		
		long l = kuserService.getcounttzhanghao(zhanghao);
		
		String sessionCode = (String)request.getSession().getAttribute("verCode");
		
		if (yanzheng.equalsIgnoreCase(sessionCode) ) {
			if(tzhanghao != ""){
				long i = kuserService.getcounttzhanghao(tzhanghao);
				
				if(i==1 && l == 0){
					kuserService.insertKuser(zhanghao,kname,tzhanghao,dateToStr.DateToStr(new Date()),yyzxid,kpassword,1);
					return Msg.success();
				}else{
					return Msg.fail().add("loog", "推荐人不存在或此账号已注册!");
				}
			}else if (l == 0) {
				kuserService.insertKuser(zhanghao,kname,tzhanghao,dateToStr.DateToStr(new Date()),yyzxid,kpassword,1);
				return Msg.success();
			}
		}else {
			return Msg.fail().add("loog", "验证码错误!");
		}
		return Msg.fail().add("loog", "此账号已注册!");
		
	}
	
	@RequestMapping("/getallwei")
	public String getAllweijihuo(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			HttpServletRequest request, HttpServletResponse response,Model model) throws Exception{
		String session  = (String) request.getSession().getAttribute("username");
		
		if(session==null){
			
			response.sendRedirect("index.jsp");
		}
		// 这不是一个分页查询；
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 50);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Kuser> users = kuserService.getallweijihuo();
		PageInfo page = new PageInfo(users, 5);
		model.addAttribute("pageInfo", page);
		
		return "admin_user_weijihuo";
	}
	@RequestMapping("/qidong")
	@ResponseBody
	public Msg qidong(@RequestParam("zhanghao") String zhanghao,@RequestParam("tzhanghao")String tzhanghao ){
		
		int jihuo = kuserService.jihuo(zhanghao, tzhanghao);
		
		if (jihuo == 1||jihuo == 2){
			
			return Msg.success();
		}
		
		return null;
		
	}
	@RequestMapping("/yijihuoAllK")
	public String getyijihuoUser(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			HttpServletRequest request, HttpServletResponse response,Model model) throws Exception{
		
		String session  = (String) request.getSession().getAttribute("username");
		
		if(session==null){
			
			response.sendRedirect("index.jsp");
		}// 这不是一个分页查询；
				// 引入PageHelper分页插件
				// 在查询之前只需要调用，传入页码，以及每页的大小
				PageHelper.startPage(pn, 50);
				// startPage后面紧跟的这个查询就是一个分页查询
				List<Kuser> userss = kuserService.getyijihuouser();
				PageInfo page = new PageInfo(userss, 5);
				model.addAttribute("pageInfo", page);
		return "adminUserYijiho";
	}
	@RequestMapping(value="/loginUser",method=RequestMethod.POST)
	@ResponseBody
	public Msg loginUser(@RequestParam("zhanghao")String zhanghao,@RequestParam("kpassword")String kpassword,
			@RequestParam("yanzhma")String yanzhma,HttpServletRequest request, HttpServletResponse response){
		
			//2. 获取 session 中的 CHECK_CODE_KEY 属性值
		     List<Kuser> kuseer =  kuserService.loginusers(zhanghao);
		    
		     if(zhanghao==""){
		    	 return Msg.fail().add("login", "请输入账号");
		    	 
		     }else{
		    	 if(kuseer.size()==0){
		    		 return Msg.fail().add("login", "该账号不存在") ;
		    	 }else{
				    	 long j = kuseer.get(0).getZhuangtaiid();
					     if(j==1){
					    	return Msg.fail().add("login", "账号未激活") ;
					     }else{
		     
							String sessionCode = (String)request.getSession().getAttribute("verCode");
							long i =	kuserService.loginuser(zhanghao,kpassword);
							
							if(i==0){
								return Msg.fail().add("login", "账号或密码有误");
								
							}else{
							
							if(yanzhma==""||!(yanzhma.equalsIgnoreCase(sessionCode))){			 
								 return Msg.fail().add("login","验证码错误");
							 }else{
								 
								 HttpSession session = request.getSession();
								 session.setAttribute("zhanghao", zhanghao);
								 session.setMaxInactiveInterval(60*60*6);
					
								 return Msg.success();
							
							 }
							}
						}
			     }}	
	}
	
	@RequestMapping("/shanchuwei")
	@ResponseBody
	public Msg shanchuUser(@RequestParam("zhanghao")String zhanghao){
		
		kuserService.deleteUser(zhanghao); 
		return Msg.success();
	}
	@RequestMapping("/chazhaoone")
	@ResponseBody
	public Msg chazhaoone(@RequestParam("zhanghao")String zhanghao,
			HttpServletRequest request, HttpServletResponse response) throws Exception{
		String session  = (String) request.getSession().getAttribute("username");
		
		if(session==null){
			
			response.sendRedirect("index.jsp");
		}
		Kuser kuser = kuserService.getoneuser(zhanghao);
		
		return Msg.success().add("pageInfo",kuser );
	}
	
	@RequestMapping(value="/logindenglu",method=RequestMethod.POST)
	@ResponseBody
	public Msg Logindenglu(HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession();
		Object attribute = session.getAttribute("zhanghao");
		if (attribute == null) {
			return Msg.fail();
		}else if (attribute != null) {
			return Msg.success();
		}
		return null;
	}
	@RequestMapping(value="/chazhaoone2",method=RequestMethod.POST)
	@ResponseBody
	public Msg cchazhaoone2( @RequestParam("zhanghao")String zhanghao,HttpServletRequest request, HttpServletResponse response) throws Exception{
		String session  = (String) request.getSession().getAttribute("username");
		
		if(session==null){
			
			response.sendRedirect("index.jsp");
		}
		Kuser kuser = kuserService.getoneuser(zhanghao);
		return Msg.success().add("bbgqs", kuser);
	}
	
	
	
}
