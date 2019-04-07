package com.wuyemy.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wuyemy.bean.Kuser;
import com.wuyemy.bean.Xiaozu;
import com.wuyemy.bean.Yyzx;
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
	
	//验证码
	private String str;
	
	/**
	 * 获取手机验证码
	 * @return
	 */
	@RequestMapping("/huoquphone")
	@ResponseBody
	public Msg Huoquphone(@RequestParam("phone")String phone){
		
		str = liuweishu.yanzhnegma();
		System.out.println(str);
		String sid = "71d51808f02cc0094354fbd71f05d5c5";
		String token = "f6e6e0f7d6a73d9329613077970df402";
		String appid = "3fc3212aaf7b4203afe938ee6682c15b";
		String templateid = "451839";
		String param = str;
		String mobile = "15703997033";
		String uid = "2d92c6132139467b989d087c84a365d7";
		//RestTest.testSendSms(sid, token, appid, templateid, param, mobile, uid);
		return Msg.success().add("yzh", str);
		
	}
	
	/**
	 * 修改密码
	 * @param verification1
	 * @param password
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/updatepass")
	@ResponseBody
	public Msg Updatepass(@RequestParam("verification1")String verification1, @RequestParam("password")String password,
			@RequestParam("verification2")String verification2, HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		String attribute = (String) session.getAttribute("verCode");
		
		if (verification2.equals(str)) {
			if (verification1.equals(attribute)) {
				tuanduiService.updatepass(zhanghao,password);
				return Msg.success();
			}else {
				return Msg.fail().add("attribute", "验证码错误!");
			}
		}else {
			return Msg.fail().add("verification", "手机验证码错误!");
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
			@RequestParam("phone")String phone,@RequestParam("verification2")String verification2,
			HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession();
		String attribute = (String) session.getAttribute("verCode");
		
		if (verification2.equals(str)) {
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
		}else {
			return Msg.fail().add("verification", "手机验证码错误!");
		}
		
		
	}
	
	/**
	 * 运营中心申请跳转页面
	 * @return
	 */
	@RequestMapping("/hhrsq")
	public String hhrsq(HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		
		if (zhanghao != null) {
			return "yysq";
		}
		return null;
	}
	
	/**
	 * 申请运营中心
	 * @return
	 */
	@RequestMapping("/sqyyzx")
	@ResponseBody
	public Msg Sqyyzx(@RequestParam("phone")String phone, @RequestParam("name")String name,
			@RequestParam("address")String address, @RequestParam("remark")String remark,
			HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		
		tuanduiService.sqyyzx(zhanghao,name,phone,address,remark);
		return Msg.success();
		
	}
	
	/**
	 * 获取运营中心信息并跳转
	 */
	@RequestMapping("/yyzx")
	private String Yyzx(HttpServletRequest request, HttpServletResponse response,Map<String, Object> map){
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		
		if (zhanghao != null) {
			Yyzx yyzx = tuanduiService.yyzx(zhanghao);
			map.put("yyzx", yyzx);
			return "yyzx";
		}
		return null;
	}

	/**
	 * 跳转申请待审核页面
	 * @return
	 */
	@RequestMapping("/hhds")
	public String hhds(HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		
		if (zhanghao != null) {
			return "hhds";
		}
		return null;
	}
	
	/**
	 * 跳转申请拒绝页面
	 * @return
	 */
	@RequestMapping("/hhjj")
	public String hhjj(HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		
		if (zhanghao != null) {
			return "hhjj";
		}
		return null;
	}

	/**
	 * 重新申请合伙人
	 * @return
	 */
	@RequestMapping("/cxsq")
	public String cxsq(HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		
		tuanduiService.deletesq(zhanghao);
		
		return "yysq";
	}

	/**
	 * 获取结构管理
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 */
	@RequestMapping("/jggl")
	public String Jggl(HttpServletRequest request, HttpServletResponse response,Map<String, Object> map){
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		
		if (zhanghao != null) {
			List<Xiaozu> xiaozus = tuanduiService.jggl(zhanghao);
			
			for (Xiaozu xiaozu : xiaozus) {
				if (xiaozu.getZidd() == 1) {
					Kuser kuser = tuanduiService.kuser(xiaozu.getZhanghao());
					String tname = tuanduiService.tname(kuser.getTzhanghao());
					kuser.setTname(tname);
					map.put("kuser1", kuser);
				}else if (xiaozu.getZidd() == 2) {
					Kuser kuser = tuanduiService.kuser(xiaozu.getZhanghao());
					String tname = tuanduiService.tname(kuser.getTzhanghao());
					kuser.setTname(tname);
					map.put("kuser2", kuser);
				}else if (xiaozu.getZidd() == 3) {
					Kuser kuser = tuanduiService.kuser(xiaozu.getZhanghao());
					String tname = tuanduiService.tname(kuser.getTzhanghao());
					kuser.setTname(tname);
					map.put("kuser3", kuser);
				}else if (xiaozu.getZidd() == 4) {
					Kuser kuser = tuanduiService.kuser(xiaozu.getZhanghao());
					String tname = tuanduiService.tname(kuser.getTzhanghao());
					kuser.setTname(tname);
					map.put("kuser4", kuser);
				}else if (xiaozu.getZidd() == 5) {
					Kuser kuser = tuanduiService.kuser(xiaozu.getZhanghao());
					String tname = tuanduiService.tname(kuser.getTzhanghao());
					kuser.setTname(tname);
					map.put("kuser5", kuser);
				}else if (xiaozu.getZidd() == 6) {
					Kuser kuser = tuanduiService.kuser(xiaozu.getZhanghao());
					String tname = tuanduiService.tname(kuser.getTzhanghao());
					kuser.setTname(tname);
					map.put("kuser6", kuser);
				}else if (xiaozu.getZidd() == 7) {
					Kuser kuser = tuanduiService.kuser(xiaozu.getZhanghao());
					String tname = tuanduiService.tname(kuser.getTzhanghao());
					kuser.setTname(tname);
					map.put("kuser7", kuser);
				}
			}
			
			return "jggl";
		}
		
		return null;
	}




}
