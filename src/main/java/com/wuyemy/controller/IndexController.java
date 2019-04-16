package com.wuyemy.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Collections;
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

import com.wuyemy.bean.Canshu;
import com.wuyemy.bean.Jifen;
import com.wuyemy.bean.Kuser;
import com.wuyemy.bean.Lunbotu;
import com.wuyemy.bean.Tixian;
import com.wuyemy.bean.Zixunguanli;
import com.wuyemy.service.IndexService;
import com.wuyemy.until.QRCodeUtil;

@Controller
public class IndexController {
	
	@Autowired
	private IndexService indexService;
	
	/**
	 * 获取各种金币数
	 * 运营中心状态
	 * 图片
	 * 资讯
	 * 转向页面
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/toUserShou")
	public String toindex(HttpServletRequest request, HttpServletResponse response,Map<String, Object> map) throws IOException{
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		
		if (zhanghao != null) {
			Jifen jifen = indexService.jinbi(zhanghao);
			long l = indexService.yyzt(zhanghao);
			int i = indexService.yyztid(zhanghao);
			
			//运营中心状态
			if (l == 1 && i == 1) {
				map.put("yyztid", 1);
			}else if (l == 1 && i == 2) {
				map.put("yyztid", 2);
			}else if (l == 1 && i == 3) {
				map.put("yyztid", 3);
			}else if (l == 0) {
				map.put("yyztid", 0);
			}
			
			//图片
			List<Lunbotu> lunbotus = indexService.hqtp();
			map.put("lunbotus", lunbotus);
			
			//资讯
			List<Zixunguanli> zixunguanlis = indexService.syzy();
			map.put("zixunguanlis", zixunguanlis);
			
			map.put("jifen", jifen);
			return "userindex";
		}else {
			response.sendRedirect("index.jsp");
		}
		
		return null;
	}
	
	
	/**
	 * 获取个人信息
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/user")
	public String User(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) throws IOException{
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");

		if (zhanghao != null) {
			Kuser kuser = indexService.user(zhanghao);
			map.put("kuser", kuser);
			return "user";
		}else {
			response.sendRedirect("index.jsp");
		}
		return null;
		
	}
	
	/**
	 * 修改基本信息
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/updatePhCa")
	@ResponseBody
	public Msg OneUser(@RequestParam("phone")String phone,@RequestParam("card")String card,
			              HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		
		if (zhanghao != null) {
			if (!phone.equals("") && !card.equals("")) {
				indexService.oneUser(zhanghao,phone,card);
				return Msg.success().add("ok", "保存完成!");
			}else if (!phone.equals("") && card.equals("")) {
				indexService.TwoUser(zhanghao,phone);
				return Msg.success().add("ok", "保存完成!");
			}else if (phone.equals("") && !card.equals("")) {
				indexService.ThreeUser(zhanghao,card);
				return Msg.success().add("ok", "保存完成!");
			}
			
		}else {
			response.sendRedirect("index.jsp");
		}
			
		return null;
	}
	
	/**
	 * 修改银行信息
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/updateyh")
	@ResponseBody
	public Msg Updateyh(@RequestParam("realname")String realname,@RequestParam("bankname")String bankname,
			@RequestParam("bankcard")String bankcard,@RequestParam("kaihuaddress")String kaihuaddress,
			@RequestParam("alipay")String alipay, HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		
		if (zhanghao != null) {
			indexService.OneYh(realname, bankname, bankcard, kaihuaddress, alipay, zhanghao);
			return Msg.success().add("yhok", "保存完成!");
		}else {
			response.sendRedirect("index.jsp");
		}
		
		
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
		
		if (zhanhao != null) {
			//获取运营id
			String yyid = indexService.selectyyid(zhanhao);
			
			QRCodeUtil codeUtil = new QRCodeUtil();
			codeUtil.QRCode(zhanhao,yyid,request,response);
			//codeUtil.main(null);
			map.put("erzhang", zhanhao);
			
			return "tuiguang";
		}else {
			response.sendRedirect("index.jsp");
		}
		return null;
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
	 * @throws IOException 
	 */
	@RequestMapping("/zijintixian")
	public String Zijintixian(HttpServletRequest request, HttpServletResponse response,Map<String, Object> map) throws IOException{
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
			
			return "tixian";
		}else {
			response.sendRedirect("index.jsp");
		}
		
		return null;
	}
	
	/**
	 * 提现购车金币
	 * @param gcjf
	 * @param realname1
	 * @param bankaddress1
	 * @param bankname1
	 * @param bankcard1
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/txgcjb")
	@ResponseBody
	public Msg Txgcjb(@RequestParam("gcjf")BigDecimal gcjf,@RequestParam("realname1")String realname1,
			@RequestParam("bankaddress1")String bankaddress1,@RequestParam("bankname1")String bankname1,
			@RequestParam("bankcard1")String bankcard1,HttpServletRequest request, HttpServletResponse response){
		
		HttpSession session = request.getSession();
		String zhanhao = (String) session.getAttribute("zhanghao");
		
		BigDecimal value = new BigDecimal("6000");
		BigDecimal values = new BigDecimal("0");
			
		 if (!gcjf.equals("") && !realname1.equals("") && !bankaddress1.equals("") && !bankname1.equals("") && !bankcard1.equals("")) {
			
			if (zhanhao != null && gcjf.compareTo(values) == 1) {
				//拥有总金币
				BigDecimal decimal = indexService.hqgcjb(zhanhao);
				//拥有金币大于6000,可提现
				if (decimal.compareTo(value) == 1) {
					//可提现金币
					BigDecimal shiji = decimal.subtract(value);
					//提现金币 小于等于 可提现金币
					if (gcjf.compareTo(shiji) < 1) {
						//剩余金币
						BigDecimal sygcjb = decimal.subtract(gcjf);
						indexService.sygc(zhanhao,sygcjb,gcjf,realname1,bankaddress1,bankname1,bankcard1);
						return Msg.success().add("gcjb", "提现成功!");
					}else {
						return Msg.fail().add("gcjb", "余额不足!");
					}
				}else {
					return Msg.fail().add("gcjb", "余额不足!");
				}
				
			}
			
		 }
		return Msg.fail().add("gcjb", "请填写完整信息!");
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
		
		HttpSession session = request.getSession();
		String zhanhao = (String) session.getAttribute("zhanghao");
		
		BigDecimal value = new BigDecimal("0");
		
		if (!cjjf.equals("") && !realname2.equals("") && !bankaddress2.equals("") && !bankname2.equals("") && !bankcard2.equals("")) {
		
			if (zhanhao != null && cjjf.compareTo(value) == 1) {
				//拥有总金币
				BigDecimal decimal = indexService.hqcjjb(zhanhao);
				//提现金币 小于等于 可提现金币
				if (cjjf.compareTo(decimal) < 1 ) {
					//剩余金币
					BigDecimal sycjjb = decimal.subtract(cjjf);
					indexService.sycj(zhanhao,sycjjb,cjjf,realname2,bankaddress2,bankname2,bankcard2);
					return Msg.success().add("cjjb", "提现成功!");
				}else {
					return Msg.fail().add("cjjb", "余额不足!");
				}
			}
		}
		return Msg.fail().add("cjjb", "请填写完整信息!");
	}
	
	/**
	 * 提现分享金币
	 * @param fxjf
	 * @param realname3
	 * @param bankaddress3
	 * @param bankname3
	 * @param bankcard3
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/txfxjf")
	@ResponseBody
	public Msg Txfxjf(@RequestParam("fxjf")BigDecimal fxjf,@RequestParam("realname3")String realname3,
			@RequestParam("bankaddress3")String bankaddress3,@RequestParam("bankname3")String bankname3,
			@RequestParam("bankcard3")String bankcard3,HttpServletRequest request, HttpServletResponse response){
		
		HttpSession session = request.getSession();
		String zhanhao = (String) session.getAttribute("zhanghao");
		
		BigDecimal value = new BigDecimal("0");
		
		if (!fxjf.equals("") && !realname3.equals("") && !bankaddress3.equals("") && !bankname3.equals("") && !bankcard3.equals("")) {
			if (zhanhao != null && fxjf.compareTo(value) == 1) {
				//拥有总金币
				BigDecimal decimal = indexService.hqfxjb(zhanhao);
				//提现金币 小于等于 可提现金币
				if (fxjf.compareTo(decimal) < 1 ) {
					//剩余金币
					BigDecimal syfxjb = decimal.subtract(fxjf);
					indexService.syfx(zhanhao,syfxjb,fxjf,realname3,bankaddress3,bankname3,bankcard3);
					return Msg.success().add("fxjf", "提现成功!");
				}else {
					return Msg.fail().add("fxjf", "余额不足!");
				}
			}
		}
		return Msg.fail().add("fxjf", "请填写完整信息不足!");
	}

	/**
	 * 查询资金明细
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/zijinmingxi")
	public String Zijinmingxi(HttpServletRequest request, HttpServletResponse response,Map<String, Object> map) throws IOException{
		HttpSession session = request.getSession();
		String zhanhao = (String) session.getAttribute("zhanghao");
		
		if (zhanhao != null) {
			//查询所有分享金币
			List<com.wuyemy.bean.Zijinmingxi> zijinfxs = indexService.syfxjb(zhanhao);
			map.put("zijinfxs", zijinfxs);
			//查询所有出局金币
			List<com.wuyemy.bean.Zijinmingxi> zijincjs = indexService.sycjjb(zhanhao);
			map.put("zijincjs", zijincjs);
			//查询所有购车金币
			List<com.wuyemy.bean.Zijinmingxi> zijingcs = indexService.sygcjb(zhanhao);
			map.put("zijingcs", zijingcs);
			//查询所有在途金币
			List<com.wuyemy.bean.Zijinmingxi> zijinzts = indexService.syztjb(zhanhao);
			map.put("zijinzts", zijinzts);
			return "zijinmingxi";
		}else {
			response.sendRedirect("index.jsp");
		}
		return null;
	}
	
	/**
	 * 查询提现记录
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/tixianjilu")
	public String tixianjilu(HttpServletRequest request, HttpServletResponse response,Map<String, Object> map) throws IOException{
		HttpSession session = request.getSession();
		String zhanhao = (String) session.getAttribute("zhanghao");
		
		if (zhanhao != null) {
			List<Tixian> tixians = indexService.txjl(zhanhao);
			map.put("tixians", tixians);
			return "txjl";
		}else {
			response.sendRedirect("index.jsp");
		}
		return null;
	}
	
	/**
	 * 查询被推荐人
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/tjlb")
	public String Tjlb(HttpServletRequest request, HttpServletResponse response,Map<String, Object> map) throws IOException{
		
		HttpSession session = request.getSession();
		String zhanhao = (String) session.getAttribute("zhanghao");
		
		if (zhanhao != null) {
			//详细信息
			List<Kuser> kusers = indexService.tjlb(zhanhao);
			Collections.reverse(kusers);
			map.put("tjkusers", kusers);
			return "tjlb";
		}else {
			response.sendRedirect("index.jsp");
		}
		return null;
	}
	
}
