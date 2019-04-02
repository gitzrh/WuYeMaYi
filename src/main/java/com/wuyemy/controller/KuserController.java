package com.wuyemy.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
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
		kuserService.qidong(zhanghao);
		kuserService.insertjifen(zhanghao, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO,BigDecimal.ZERO  );
		
		
	
		if(tzhanghao==""){
		long g = kuserService.getmaxzid();
		
		
		int zid = (int) g + 1;
			 kuserService.inserxiaozutable(zid,1,zhanghao);
			 return Msg.success();
		}
		else if(tzhanghao!=""){
		 List<Xiaozu> lists =	kuserService.getxiaozid(tzhanghao);
		  int i = lists.get(0).getZid();
		  long j = kuserService.getcountxzid(i);
		  if( j == 1){			  
			  kuserService.inserxiaozutable(i,2,zhanghao);
			  return Msg.success();
		  }else if(j==2){
			 			 
			 kuserService.inserxiaozutable(i,3,zhanghao);
			 return Msg.success();
		  }else if(j==3){
			  kuserService.inserxiaozutable(i,4,zhanghao);
				 return Msg.success();
		  }else if(j==4){
			  kuserService.inserxiaozutable(i,5,zhanghao);
				 return Msg.success();
		  }else if(j==5){
			  kuserService.inserxiaozutable(i,6,zhanghao);
				 return Msg.success();
		  }else if(j==6){
				
			  long z5 = kuserService.getmaxzid();
				 int m5 = (int) (z5+1);
			  //根据zid获取该zid下所有的zidd
			  List<Xiaozu> xiaozus = kuserService.selectzidd(i);
			  for (Xiaozu xiaozu : xiaozus) {
				   //mm：zidd的值
				  int mm = xiaozu.getZidd();
			   
				   if(mm==1){
					 List<Xiaozu> list =  kuserService.getxzzhanghao(i,1);
					 //zhanghaos 获取zidd为1的账号
					String zhanghaos =  list.get(0).getZhanghao();
				List<Kuser> kuser =	kuserService.getTzhanghao(zhanghaos);
				//tzhanghaoo 获取zidd为1的推荐人账号
				String tzhanghaoo = kuser.get(0).getTzhanghao();
				if(tzhanghaoo == ""){
					kuserService.updateZzidd(4, i, 1);
				}else{
					List<Xiaozu> ls = kuserService.getxiaozid(tzhanghaoo);
					//推荐人账号的zid
					int l = ls.get(0).getZid();
					//zid的个数
					long p = kuserService.getcountxzid(l);
					if(p<6){
						//最大是zidd
						 int s = kuserService.getmaxziddwithzid(l);
						 int f = (int) (s+1);
						kuserService.update1zid(l,f , zhanghaos);
						
					}else if(p==6){
						 long z4 = kuserService.getmaxzid();
						 int m4 = (int) (z4+1);
						 for(Xiaozu xiaosu : ls){
							int ziddd =  xiaosu.getZidd();
							if(ziddd ==1){
								List<Xiaozu> lists1 =  kuserService.getxzzhanghao(l,1);
							 String zh =lists1.get(0).getZhanghao();
							 List<Kuser> kusers =	kuserService.getTzhanghao(zh);
							 String ttzhangha = kusers.get(0).getTzhanghao();
							 if(ttzhangha==""){
								 kuserService.updateZzidd(4, l, 1);
							 }else{
								 List<Xiaozu> lss = kuserService.getxiaozid(ttzhangha);
								 int a = lss.get(0).getZid();
								 long con = kuserService.getcountxzid(a);
								 if(con<6){
									 int s1 = kuserService.getmaxziddwithzid(a);
									 int f1 = (int) (s1+1);
									 kuserService.update1zid(a,f1 , zh);
								 }else if(con==6){
									 long z3 = kuserService.getmaxzid();
									 int m3 = (int) (z3+1);
									 for(Xiaozu xiaos :lss){
										 int zidd3= xiaos.getZidd();
										 if(zidd3==1){
											 List<Xiaozu> lists2 =  kuserService.getxzzhanghao(a,1);
											 String zh1 = lists2.get(0).getZhanghao();
											 List<Kuser> kusers1 =	kuserService.getTzhanghao(zh1);
											 String ttzhangha1 = kusers1.get(0).getTzhanghao();
											 if(ttzhangha1==""){
												 kuserService.updateZzidd(4, a, 1);
												 
											 }else{
												 List<Xiaozu> lss1 = kuserService.getxiaozid(ttzhangha1);
												 int a1 = lss1.get(0).getZid();
												 long con1 = kuserService.getcountxzid(a1);
												 if(con1<6){
													 int s2 = kuserService.getmaxziddwithzid(a1);
													 int f2 = (int) (s2+1);
													 kuserService.update1zid(a1,f2 , zh1);
													 
												 }else if(con1==6){
													 long z2 = kuserService.getmaxzid();
													 int m2 = (int) (z2+1);
													 for(Xiaozu xiaos1 :lss1){
														 int zidd4= xiaos1.getZidd();
														 if(zidd4==1){
															 List<Xiaozu> lists3 =  kuserService.getxzzhanghao(a1,1);
															 String zh2 = lists3.get(0).getZhanghao();
															 List<Kuser> kusers2 =	kuserService.getTzhanghao(zh2);
															 String ttzhangha2 = kusers2.get(0).getTzhanghao();
															 if(ttzhangha2==""){
																 kuserService.updateZzidd(4,a1,1);
																 
															 }else{
																 List<Xiaozu> lss2 = kuserService.getxiaozid(ttzhangha2);
																 int a2 = lss2.get(0).getZid();
																 long con2 = kuserService.getcountxzid(a2);
																 if(con2<6){
																	 int s3 = kuserService.getmaxziddwithzid(a2);
																	 int f3 = (int) (s3+1);
																	 kuserService.update1zid(a2,f3 , zh2);
																 }else if(con2==6){
																	 long z1 = kuserService.getmaxzid();
																	 int m1 = (int) (z1+1);
																	 for(Xiaozu xiaos2 :lss2){
																		 int zidd5= xiaos2.getZidd();
																		 if(zidd5==1){
																			 List<Xiaozu> lists4 =  kuserService.getxzzhanghao(a2,1);
																			 String zh3 = lists4.get(0).getZhanghao();
																			 List<Kuser> kusers3 =	kuserService.getTzhanghao(zh3);
																			 String ttzhangha3 = kusers3.get(0).getTzhanghao();
																			 
																			 if(ttzhangha3==""){
																				 kuserService.updateZzidd(4,a2,1);
																				 
																			 }else{
																				 List<Xiaozu> lss3 = kuserService.getxiaozid(ttzhangha3);
																				 int a3 = lss3.get(0).getZid();
																				 long con3 = kuserService.getcountxzid(a3);
																				 if(con3<6){
																					 int s4 = kuserService.getmaxziddwithzid(a3);
																					 int f4 = (int) (s4+1);
																					 kuserService.update1zid(a3,f4 , zh3);
																				 }else if(con3==6){
																					 long z = kuserService.getmaxzid();
																					 int m = (int) (z+1);
																					 for(Xiaozu xiaos3 :lss3){
																						 int zidd6= xiaos3.getZidd();
																						 if(zidd6==1){
																							 List<Xiaozu> lists5 =  kuserService.getxzzhanghao(a3,1);
																							 String zh4 = lists5.get(0).getZhanghao();
																							 List<Kuser> kusers4 =	kuserService.getTzhanghao(zh4);
																							 String ttzhangha4 = kusers4.get(0).getTzhanghao();
																							 if(ttzhangha4==""){
																								 kuserService.updateZzidd(4,a3,1);
																								 
																							 }else{
																								 List<Xiaozu> lss4 = kuserService.getxiaozid(ttzhangha4);
																								 int a4 = lss4.get(0).getZid();
																								 long con4 = kuserService.getcountxzid(a4);
																								 if(con4<6){
																									 int s5 = kuserService.getmaxziddwithzid(a4);
																									 int f5 = (int) (s5+1);
																									 kuserService.update1zid(a4,f5 , zh4);
																								 }
																							 }
																							 
																						 }else if(zidd6==2){
																							 
																							 kuserService.updateZzidd(1,a3, 2);
																						 }else if(zidd6==3){
																							 List<Xiaozu> lists5 =  kuserService.getxzzhanghao(a3,3);
																							 String zh4 = lists5.get(0).getZhanghao();
																							 kuserService.update1zid(m,1, zh4);
																						 }else if(zidd6==4){
																							
																							 kuserService.updateZzidd(2,a3,4);
																						 }else if(zidd6==5){
																							
																							 kuserService.updateZzidd(3,a3,5);
																						 }else if(zidd6==6){
																							 List<Xiaozu> lists5 =  kuserService.getxzzhanghao(a3,6);
																							 String zh4 = lists5.get(0).getZhanghao();
																							 kuserService.update1zid(m, 2, zh4);
																						 }
																						 
																					 }
																					 
																					 kuserService.update1zid(m, 3, zh3);
																				 }
																			 }
																		 }else if(zidd5==2){
																			 kuserService.updateZzidd(1,a2, 2);
																		 }else if(zidd5==3){
																			 List<Xiaozu> lists5 =  kuserService.getxzzhanghao(a2,3);
																			 String zh4 = lists5.get(0).getZhanghao();
																			 kuserService.update1zid(m1,1, zh4);
																		 }else if(zidd5==4){
																				
																			 kuserService.updateZzidd(2,a2, 4);
																		 }else if(zidd5==5){
																				
																			 kuserService.updateZzidd(3,a2,5);
																		 }else if(zidd5==6){
																			 List<Xiaozu> lists5 =  kuserService.getxzzhanghao(a2,6);
																			 String zh4 = lists5.get(0).getZhanghao();
																			 kuserService.update1zid(m1, 2, zh4);
																		 }
																		 
																	 }
																	 kuserService.update1zid(m1, 3, zh2);
																 }
															 }
														 }else if(zidd4==2){
															 kuserService.updateZzidd(1,a1, 2);
														 }else if(zidd4==3){
															 List<Xiaozu> lists5 =  kuserService.getxzzhanghao(a1,3);
															 String zh4 = lists5.get(0).getZhanghao();
															 kuserService.update1zid(m2,1, zh4);
														 }else if(zidd4==4){
																
															 kuserService.updateZzidd(2,a1, 4);
														 }else if(zidd4==5){
																
															 kuserService.updateZzidd(3,a1, 5);
														 }else if(zidd4==6){
															 List<Xiaozu> lists5 =  kuserService.getxzzhanghao(a1,6);
															 String zh4 = lists5.get(0).getZhanghao();
															 kuserService.update1zid(m2, 2, zh4);
														 }
													 }
													 
													 kuserService.update1zid(m2, 3, zh1);
												 }
											 }
										 }else if(zidd3==2){
											 kuserService.updateZzidd(1,a, 2);
										 }else if(zidd3==3){
											 List<Xiaozu> lists5 =  kuserService.getxzzhanghao(a,3);
											 String zh4 = lists5.get(0).getZhanghao();
											 kuserService.update1zid(m3,1, zh4);
										 }else if(zidd3==4){
												
											 kuserService.updateZzidd(2,a, 4);
										 }else if(zidd3==5){
												
											 kuserService.updateZzidd(3,a, 5);
										 }else if(zidd3==6){
											 List<Xiaozu> lists5 =  kuserService.getxzzhanghao(a,6);
											 String zh4 = lists5.get(0).getZhanghao();
											 kuserService.update1zid(m3, 2, zh4);
										 }
									 }
									 kuserService.update1zid(m3, 3, zh);
								 }
							 }
							}else if(ziddd ==2){
								kuserService.updateZzidd(1,l, 2);
							}else if(ziddd==3){
								 List<Xiaozu> lists5 =  kuserService.getxzzhanghao(l,3);
								 String zh4 = lists5.get(0).getZhanghao();
								 kuserService.update1zid(m4,1, zh4);
							 }else if(ziddd==4){
									
								 kuserService.updateZzidd(2,l, 4);
							 }else if(ziddd==5){
									
								 kuserService.updateZzidd(3,l, 5);
							 }else if(ziddd==6){
								 List<Xiaozu> lists5 =  kuserService.getxzzhanghao(l,6);
								 String zh4 = lists5.get(0).getZhanghao();
								 kuserService.update1zid(m4, 2, zh4);
							 }
						 }
						 kuserService.update1zid(m4, 3, zhanghaos);            
					}
					
					
				}
					   
				   }else if(mm==2){
					   kuserService.updateZzidd(1,i, 2);
					   
				   }else if(mm==3){
						 List<Xiaozu> lists5 =  kuserService.getxzzhanghao(i,3);
						 String zh4 = lists5.get(0).getZhanghao();
						 kuserService.update1zid(m5,1, zh4);
					 }else if(mm==4){
							
						 kuserService.updateZzidd(2,i, 4);
					 }else if(mm==5){
							
						 kuserService.updateZzidd(3,i, 5);
					 }else if(mm==6){
						 List<Xiaozu> lists5 =  kuserService.getxzzhanghao(i,6);
						 String zh4 = lists5.get(0).getZhanghao();
						 kuserService.update1zid(m5, 2, zh4);
					 }
			  }
			  
			  kuserService.inserxiaozutable(m5,3,zhanghao);
			
		  }
		}
		
		return Msg.success();
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
			 
			
			 return Msg.success();
		
		 }
		}
	}
		     }	
	}
	
	@RequestMapping("/toUserShou")
	public String toUserShou(){
		
		return "userindex";
	}
}
