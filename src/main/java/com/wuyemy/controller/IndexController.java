package com.wuyemy.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wuyemy.bean.Canshu;
import com.wuyemy.bean.Jifen;
import com.wuyemy.bean.Kuser;
import com.wuyemy.service.IndexService;
import com.wuyemy.until.QRCodeUtil;

@Controller
public class IndexController {
	
	@Autowired
	private IndexService indexService;
	
	/**
	 * 获取各种金币数并转向页面
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 */
	@RequestMapping("/toUserShou")
	public String toindex(HttpServletRequest request, HttpServletResponse response,Map<String, Object> map){
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		
		if (zhanghao != null) {
			
			session.removeAttribute("ok");
			session.removeAttribute("yhok");
			
			Jifen jifen = indexService.jinbi(zhanghao);
			map.put("jifen", jifen);
			return "userindex";
		}
		
		return null;
	}
	
	/**
	 * 获取个人信息
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 */
	@RequestMapping("/user")
	public String User(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map){
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");

		if (zhanghao != null) {
			Kuser kuser = indexService.user(zhanghao);
			System.out.println(kuser.getZhenshiname());
			map.put("kuser", kuser);
			return "user";
		}else {
			return "index";
		}
		
	}
	
	/**
	 * 修改基本信息
	 * @return
	 */
	@RequestMapping("updatePhCa")
	public String OneUser(@RequestParam("phone")String phone,@RequestParam("card")String card,
			              HttpServletRequest request, HttpServletResponse response){
		
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		session.removeAttribute("yhok");
		
		if (zhanghao != null) {
			if (!phone.equals("") && !card.equals("")) {
				indexService.oneUser(zhanghao,phone,card);
				session.setAttribute("ok", "保存完成!");
			}else if (!phone.equals("") && card.equals("")) {
				indexService.TwoUser(zhanghao,phone);
				session.setAttribute("ok", "保存完成!");
			}else if (phone.equals("") && !card.equals("")) {
				indexService.ThreeUser(zhanghao,card);
				session.setAttribute("ok", "保存完成!");
			}
			
		}
			
		return null;
	}
	
	/**
	 * 修改银行信息
	 * @return
	 */
	@RequestMapping("/updateyh")
	public String Updateyh(@RequestParam("realname")String realname,@RequestParam("bankname")String bankname,
			@RequestParam("bankcard")String bankcard,@RequestParam("kaihuaddress")String kaihuaddress,
			@RequestParam("alipay")String alipay, HttpServletRequest request, HttpServletResponse response){
		
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		session.removeAttribute("ok");
		
		indexService.OneYh(realname, bankname, bankcard, kaihuaddress, alipay, zhanghao);
		session.setAttribute("yhok", "保存完成!");
		
		return null;
	}
	
	/**
	 * 退出
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("tuichus")
	public void Tuichu(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		HttpSession session = request.getSession();
		session.removeAttribute("zhanghao");
		
		response.sendRedirect("index.jsp");
	}
	
	/**
	 * 推广二维码
	 * @throws Exception 
	 */
	@RequestMapping("/tuiguang")
	public String Tuiguang(HttpServletRequest request, HttpServletResponse response,Map<String, Object> map) throws Exception{
		HttpSession session = request.getSession();
		String zhanhao = (String) session.getAttribute("zhanghao");
		
		QRCodeUtil codeUtil = new QRCodeUtil();
		codeUtil.QRCode(zhanhao,request,response);
		//codeUtil.main(null);
		map.put("erzhang", zhanhao);
		
		return "tuiguang";
	}
	
	/**
	 * 删除二维码
	 */
	@RequestMapping("/shanchut")
	public void Shanchut(HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession();
		String zhanhao = (String) session.getAttribute("zhanghao");
		
		String realPath = request.getSession().getServletContext().getRealPath("/");
		
		indexService.Shanchue(zhanhao,realPath);
	}
	
	/**
	 * 资金提现
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/zijintixian")
	public String Zijintixian(HttpServletRequest request, HttpServletResponse response,Map<String, Object> map){
		HttpSession session = request.getSession();
		String zhanhao = (String) session.getAttribute("zhanghao");
		
		if (zhanhao != null) {
			Kuser kuser = indexService.zijintixian(zhanhao);
			
			BigDecimal value = new BigDecimal("100");
			
			//购车
			Canshu canshu1 = indexService.canshu1(6);
			BigDecimal value1 = canshu1.getValue();
			value1 = value1.multiply(value);
			//出局
			Canshu canshu2 = indexService.canshu2(5);
			BigDecimal value2 = canshu2.getValue();
			value2 = value2.multiply(value);
			//分享
			Canshu canshu3 = indexService.canshu3(7);
			BigDecimal value3 = canshu3.getValue();
			value3 = value3.multiply(value);
			
			map.put("zkuser", kuser);
			map.put("gouche", value1+"%");
			map.put("chuju", value2+"%");
			map.put("fenxiang", value3+"%");
		}
		
		return "tixian";
	}
	
	@RequestMapping("/txgcjb")
	@ResponseBody
	public Msg Txgcjb(@RequestParam("gcjf")BigDecimal gcjf,@RequestParam("realname1")String realname1,
			@RequestParam("bankaddress1")String bankaddress1,@RequestParam("bankname1")String bankname1,
			@RequestParam("bankcard1")String bankcard1,HttpServletRequest request, HttpServletResponse response){
		
		HttpSession session = request.getSession();
		String zhanhao = (String) session.getAttribute("zhanghao");
		
		BigDecimal value = new BigDecimal("6000");
		
			if (zhanhao != null) {
				//拥有总金币
				BigDecimal decimal = indexService.hqgcjb(zhanhao);
				//拥有金币大于6000,可提现
				if (decimal.compareTo(value) == 1) {
					//可提现金币
					BigDecimal shiji = decimal.subtract(value);
					//提现金币 大于等于 可提现金币
					if (gcjf.compareTo(shiji) < 1) {
						BigDecimal sygcjb = decimal.subtract(gcjf);
						indexService.sygc(zhanhao,sygcjb,gcjf,realname1,bankaddress1,bankname1,bankcard1);
						return Msg.success().add("gcjb", "提现成功!");
					}else {
						return Msg.fail().add("gcjb", "余额不足!");
					}
				}else {
					System.out.println("hhghhh");
					return Msg.fail().add("gcjb", "余额不足!");
				}
				
			}
		return Msg.success();
	}
	
	/**
	 * 提现出局金币
	 * @return
	 */
	@RequestMapping("/txcjjf")
	@ResponseBody
	public Msg Txcjjf(@RequestParam("cjjf")BigDecimal cjjf,@RequestParam("realname2")String realname2,
			@RequestParam("bankaddress2")String bankaddress2,@RequestParam("bankname2")String bankname2,
			@RequestParam("bankcard2")String bankcard2,HttpServletRequest request, HttpServletResponse response){
		return null;
		
	}

}
