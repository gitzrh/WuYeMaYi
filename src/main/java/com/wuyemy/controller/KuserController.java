package com.wuyemy.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuyemy.bean.Kuser;
import com.wuyemy.bean.Xiaozu;
import com.wuyemy.service.KuserService;
import com.wuyemy.until.DateToString;

@Controller
public class KuserController {
	
	@Autowired
	private KuserService kuserService;
	
	private DateToString dateToStr;
	
	@RequestMapping("/zhuce")
	@ResponseBody
	private Msg zhuce(@RequestParam("zhanghao") String zhanghao,@RequestParam("kname")String kname,
			@RequestParam(value="tzhanghao")String tzhanghao,
			@RequestParam(value="yyzxid")String yyzxid,
			@RequestParam(value="kpassword")String kpassword,
			HttpServletRequest request, HttpServletResponse response){
		if(tzhanghao!=""){
			
			long i = kuserService.getcounttzhanghao(tzhanghao);
			if(i==1){
				
				kuserService.insertKuser(zhanghao,kname,tzhanghao,dateToStr.DateToStr(new Date()),yyzxid,kpassword,1);
				
				return Msg.success();
			}else{
				return Msg.fail().add("loog", "推荐人不存在");
			}
		}
		kuserService.insertKuser(zhanghao,kname,tzhanghao,dateToStr.DateToStr(new Date()),yyzxid,kpassword,1);
			return Msg.success();
		
		
	}
	
	@RequestMapping("/getallwei")
	public String getAllweijihuo(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			HttpServletRequest request, HttpServletResponse response,Model model){
		
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
	@RequestMapping("/yijihuouser")
	public String getyijihuoUser(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			HttpServletRequest request, HttpServletResponse response,Model model){
		// 这不是一个分页查询；
				// 引入PageHelper分页插件
				// 在查询之前只需要调用，传入页码，以及每页的大小
				PageHelper.startPage(pn, 50);
				// startPage后面紧跟的这个查询就是一个分页查询
				List<Kuser> userss = kuserService.getyijihuouser();
				PageInfo page = new PageInfo(userss, 5);
				model.addAttribute("pageInfo", page);
		return "adminUserYijiho";
	}
	
	@RequestMapping("/loginUser")
	@ResponseBody
	public Msg loginUser(@RequestParam("zhanghao")String zhanghao,
			@RequestParam("kpassword")String kpassword,
			@RequestParam("yanzhma")String yanzhma,
			HttpServletRequest request, HttpServletResponse response){
		
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


			 return Msg.success();
		
		 }
		}
	}
		     }}	
	}
	
}
