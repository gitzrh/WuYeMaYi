package com.wuyemy.controller;

import java.io.IOException;
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

import com.RestTest;
import com.wuyemy.bean.Kuser;
import com.wuyemy.bean.Lunbotu;
import com.wuyemy.bean.Xiaozu;
import com.wuyemy.bean.Yyzx;
import com.wuyemy.bean.Zixunguanli;
import com.wuyemy.service.IndexService;
import com.wuyemy.service.TuanduiService;
import com.wuyemy.until.liuweishu;

@Controller
public class TuanduiController {

	@Autowired
	private TuanduiService tuanduiService;
	
	  @Autowired
	  private IndexService indexService;
	/**
	 * 转向修改密码页面
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/updatepassword")
	public String Password(HttpServletRequest request, HttpServletResponse response,Map<String, Object> map) throws IOException{
		
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		
		if (zhanghao != null) {
			map.put("phone", zhanghao);
			return "updatepassword";
		}else {
			response.sendRedirect("index.jsp");
		}
		
		return null;
	}
	
	//验证码
	private String str;
	
	/**
	 * 忘记密码获取手机验证码
	 * @return
	 */
	@RequestMapping("/huoquphone")
	@ResponseBody
	public Msg Huoquphone(@RequestParam("phone")String zhanghao){
		
		 Kuser kuser = this.indexService.user(zhanghao);
		    String phone = kuser.getZhenshishoujihao();
		    
		    if (!phone.equals("")) {
		      this.str = liuweishu.yanzhnegma();
		      String sid = "71d51808f02cc0094354fbd71f05d5c5";
		      String token = "f6e6e0f7d6a73d9329613077970df402";
		      String appid = "3fc3212aaf7b4203afe938ee6682c15b";
		      String templateid = "451911";
		      String param = this.str;
		      String mobile = phone;
		      String uid = "2d92c6132139467b989d087c84a365d7";
		      RestTest.testSendSms(sid, token, appid, templateid, param, mobile, uid);
		      return Msg.success().add("yzh", this.str);
		    } 
		    return Msg.fail().add("fphone", "请检查你的手机号!");
		  }
	
	
	/**
	 * 修改密码获取手机验证码
	 * @return
	 */

	  @RequestMapping({"/updatephone"})
	  @ResponseBody
	  public Msg Updatephone(@RequestParam("phone") String zhanghao) {
	    Kuser kuser = this.indexService.user(zhanghao);
	    String phone = kuser.getZhenshishoujihao();
	    
	    if (!phone.equals("")) {
	      this.str = liuweishu.yanzhnegma();
	      String sid = "71d51808f02cc0094354fbd71f05d5c5";
	      String token = "f6e6e0f7d6a73d9329613077970df402";
	      String appid = "3fc3212aaf7b4203afe938ee6682c15b";
	      String templateid = "451839";
	      String param = this.str;
	      String mobile = phone;
	      String uid = "2d92c6132139467b989d087c84a365d7";
	      RestTest.testSendSms(sid, token, appid, templateid, param, mobile, uid);
	      return Msg.success().add("yzh", this.str);
	    } 
	    return Msg.fail().add("fphone", "请检查你的手机号!");
	  }

	
	/**
	 * 修改密码
	 * @param verification1
	 * @param password
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/updatepass")
	@ResponseBody
	public Msg Updatepass(@RequestParam("verification1")String verification1, @RequestParam("password")String password,
			@RequestParam("verification2")String verification2, HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		String attribute = (String) session.getAttribute("verCode");
		
		if (zhanghao != null) {
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
		}else {
			response.sendRedirect("index.jsp");
		}
		return null;
	}
	
	@RequestMapping("/forgetpassword")
	public String forgetpassword(){
		return "forgetpassword";
	}
	
	/**
	 * 忘记密码
	 * @return
	 */

	  @RequestMapping({"/forgetpass"})
	  @ResponseBody
	  public Msg forgetpass(@RequestParam("verification1") String verification1, @RequestParam("password") String password, @RequestParam("phone") String zhanghao, @RequestParam("verification2") String verification2, HttpServletRequest request, HttpServletResponse response) {
	    HttpSession session = request.getSession();
	    String attribute = (String)session.getAttribute("verCode");
	    
	    if (verification2.equals(this.str)) {
	      if (verification1.equals(attribute)) {
	        if (!zhanghao.equals("")) {
	          this.tuanduiService.forgetpass(zhanghao, password);
	          return Msg.success();
	        } 
	        return Msg.fail().add("fphone", "请检查你的账号!");
	      } 
	      
	      return Msg.fail().add("attribute", "验证码错误!");
	    } 
	    
	    return Msg.fail().add("verification", "手机验证码错误!");
	  }

	
	/**
	 * 运营中心申请跳转页面
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/hhrsq")
	public String hhrsq(HttpServletRequest request, HttpServletResponse response) throws IOException{
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		
		if (zhanghao != null) {
			return "yysq";
		}else {
			response.sendRedirect("index.jsp");
		}
		return null;
	}
	
	/**
	 * 申请运营中心
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/sqyyzx")
	@ResponseBody
	public Msg Sqyyzx(@RequestParam("phone")String phone, @RequestParam("name")String name,
			@RequestParam("address")String address, @RequestParam("remark")String remark,
			HttpServletRequest request, HttpServletResponse response) throws IOException{
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		
		if (zhanghao != null) {
			tuanduiService.sqyyzx(zhanghao,name,phone,address,remark);
		return Msg.success();
		}else {
			response.sendRedirect("index.jsp");
		}
		return null;
	}
	
	/**
	 * 获取运营中心信息并跳转
	 * @throws IOException 
	 */
	@RequestMapping("/yyzx")
	private String Yyzx(HttpServletRequest request, HttpServletResponse response,Map<String, Object> map) throws IOException{
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		
		if (zhanghao != null) {
			Yyzx yyzx = tuanduiService.yyzx(zhanghao);
			map.put("yyzx", yyzx);
			return "yyzx";
		}else {
			response.sendRedirect("index.jsp");
		}
		return null;
	}

	/**
	 * 跳转申请待审核页面
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/hhds")
	public String hhds(HttpServletRequest request, HttpServletResponse response) throws IOException{
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		
		if (zhanghao != null) {
			return "hhds";
		}else {
			response.sendRedirect("index.jsp");
		}
		return null;
	}
	
	/**
	 * 跳转申请拒绝页面
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/hhjj")
	public String hhjj(HttpServletRequest request, HttpServletResponse response) throws IOException{
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		
		if (zhanghao != null) {
			return "hhjj";
		}else {
			response.sendRedirect("index.jsp");
		}
		return null;
	}

	/**
	 * 重新申请合伙人
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/cxsq")
	public String cxsq(HttpServletRequest request, HttpServletResponse response) throws IOException{
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("zhanghao");
		
		if (zhanghao != null) {
			tuanduiService.deletesq(zhanghao);
			return "yysq";
		}else {
			response.sendRedirect("index.jsp");
		}
		return null;
	}

	/**
	 * 获取结构管理
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/jggl")
	public String Jggl(HttpServletRequest request, HttpServletResponse response,Map<String, Object> map) throws IOException{
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
		}else {
			response.sendRedirect("index.jsp");
		}
		
		return null;
	}
	
	/**
	 * 轮播图管理
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/lunbotugl")
	public String lunbotugl(HttpServletRequest request, HttpServletResponse response,Map<String, Object> map) throws IOException{
		String session  = (String) request.getSession().getAttribute("username");
		
		if(session != null){
			List<Lunbotu> lunbotus = tuanduiService.sylbt();
			map.put("lunbotuls", lunbotus);
			return "lunbotu";
		}else {
			response.sendRedirect("index.jsp");
		}
		return null;
	}
	
	/**
	 * 跳转咨询管理页面
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/zixungl")
	public String Zixungl(HttpServletRequest request, HttpServletResponse response,Map<String, Object> map) throws IOException{
		String session  = (String) request.getSession().getAttribute("username");
		
		if(session != null){
			List<Zixunguanli> zixunguanlis = tuanduiService.zixungl();
			map.put("zixunguanlis", zixunguanlis);
			return "zixungl";
		}else {
			response.sendRedirect("index.jsp");
		}
		return null;
	}
	
	/**
	 * 查看咨询
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/selectzx")
	@ResponseBody
	public Msg Selectzx(HttpServletRequest request, HttpServletResponse response,@RequestParam("id")Integer id) throws IOException{
		HttpSession session = request.getSession();
		String zhanghao = (String) session.getAttribute("username");
		
		if (zhanghao != null) {
			Zixunguanli zixunguanli = tuanduiService.seletezx(id);
			return Msg.success().add("zixunguanli", zixunguanli);
		}else {
			response.sendRedirect("index.jsp");
		}
		return null;
		
	}
	
	/**
	 * 新增资讯
	 * @param head
	 * @param text
	 * @return
	 */
	@RequestMapping("/indexzx")
	@ResponseBody
	public Msg Indexzx(@RequestParam("head")String head,@RequestParam("text")String text){
		tuanduiService.indexzx(head,text);
		return Msg.success();
	}
	
	/**
	 * 删除资讯
	 * @param id
	 * @return
	 */
	@RequestMapping("/deletezx")
	@ResponseBody
	public Msg Deletezx(@RequestParam("id")Integer id){
		tuanduiService.deletezu(id);
		return Msg.success();
	}
	
	@RequestMapping("/zxxq")
	public String Zxxq(@RequestParam("id")Integer id,Map<String, Object> map){
		Zixunguanli zixunguanli = tuanduiService.zxxq(id);
		map.put("zixunguanlixq", zixunguanli);
		return "zxxq";
	}
	
}
