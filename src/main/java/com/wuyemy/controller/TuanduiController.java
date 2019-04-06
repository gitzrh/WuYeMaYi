package com.wuyemy.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wuyemy.service.TuanduiService;
import com.wuyemy.until.liuweishu;

@Controller
public class TuanduiController {

	@Autowired
	private TuanduiService tuanduiService;
	
	/**
	 * 转向修改密码页面
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 */
	@RequestMapping("/updatepassword")
	public String Password(HttpServletRequest request, HttpServletResponse response,Map<String, Object> map){
		
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		
		if (zhanghao != null) {
			String phone = tuanduiService.phone(zhanghao);
			map.put("phone", phone);
			return "updatepassword";
		}
		
		return null;
	}
	
	
	/**
	 * 获取手机验证码
	 * @return
	 */
	@RequestMapping("/huoquphone")
	@ResponseBody
	public Msg Huoquphone(@RequestParam("phone")String phone){
		
		String str = liuweishu.yanzhnegma();
		
		String sid = "71d51808f02cc0094354fbd71f05d5c5";
		String token = "f6e6e0f7d6a73d9329613077970df402";
		String appid = "3fc3212aaf7b4203afe938ee6682c15b";
		String templateid = "451839";
		String param = str;
		String mobile = "15703997033";
		String uid = "2d92c6132139467b989d087c84a365d7";
		//RestTest.testSendSms(sid, token, appid, templateid, param, mobile, uid);
		return Msg.success().add("yzh", "123456");
		
	}
	
	@RequestMapping("/updatepass")
	@ResponseBody
	public Msg Updatepass(@RequestParam("verification1")String verification1, @RequestParam("password")String password,
			HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		String attribute = (String) session.getAttribute("verCode");
		
		if (verification1.equals(attribute)) {
			tuanduiService.updatepass(zhanghao,password);
			return Msg.success();
		}else {
			return Msg.fail();
		}
	}
	
	@RequestMapping("/forgetpassword")
	public String forgetpassword(){
		return "forgetpassword";
	}
	
	/**
	 * 忘记密码
	 * @return
	 */
	@RequestMapping("/forgetpass")
	@ResponseBody
	public Msg forgetpass(@RequestParam("verification1")String verification1, @RequestParam("password")String password,
			@RequestParam("phone")String phone,HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession();
		String attribute = (String) session.getAttribute("verCode");
		
		if (verification1.equals(attribute)) {
			long l = tuanduiService.kphon(phone);
			if (l == 1) {
				tuanduiService.forgetpass(phone,password);
				return Msg.success();
			}else {
				return Msg.fail().add("fphone", "请检查您的手机号!");
			}
		}else {
			return Msg.fail().add("attribute", "验证码错误!");
		}
		
	}
	
}
