package com.wuyemy.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wuyemy.service.JifenServive;
import com.wuyemy.service.KuserService;

@Controller
public class JifenController {
	@Autowired
	private JifenServive jifenService;
	@Autowired
	private KuserService kuserService;
	
	
	@RequestMapping("/kouchujifen")
	@ResponseBody
	public Msg kouchujifen(@RequestParam("zhanghao")String zhanghao,
			@RequestParam("leix")Integer jibid,@RequestParam("num")BigDecimal jbshu){
		int i = jifenService.kouchujifen(zhanghao,jibid,jbshu);
		
	if(i==1){
		return Msg.success();
	}
		return Msg.fail();
	}
	@RequestMapping("/addjifen")
	@ResponseBody
	public Msg addjifen(@RequestParam("zhanghao")String zhanghao,
			@RequestParam("leix")Integer jibid,@RequestParam("num")BigDecimal jbshu){
		int i = jifenService.addjifen(zhanghao,jibid,jbshu);
		
		if(i==1){
			return Msg.success();
		}
		return Msg.fail();
	}
	
	
	@RequestMapping("/updateuser")
	@ResponseBody
	public Msg updateuserxx(@RequestParam("zhanghao")String zhanghao,@RequestParam("name") String name, @RequestParam("password")String password){
		
		kuserService.updateUserXinxi(zhanghao,name,password);
		
		
		return Msg.success();
	}
	
	@RequestMapping("/shanchu")
	@ResponseBody
	public Msg shanchuone(@RequestParam("zhanghao")String zhanghao){
		
		kuserService.updateTzhanghao(zhanghao);
		
		return Msg.success();
	}
	
}
