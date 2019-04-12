package com.wuyemy.service;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wuyemy.bean.Canshu;
import com.wuyemy.bean.Jifen;
import com.wuyemy.bean.JifenExample;
import com.wuyemy.bean.JifenZonghe;
import com.wuyemy.bean.Kuser;
import com.wuyemy.bean.KuserExample;
import com.wuyemy.bean.Xiaozu;
import com.wuyemy.bean.XiaozuExample;
import com.wuyemy.bean.Yyzx;
import com.wuyemy.bean.YyzxExample;
import com.wuyemy.bean.Zijinmingxi;
import com.wuyemy.controller.Msg;
import com.wuyemy.dao.CanshuMapper;
import com.wuyemy.dao.JifenMapper;
import com.wuyemy.dao.KuserMapper;
import com.wuyemy.dao.XiaozuMapper;
import com.wuyemy.dao.YyzxMapper;
import com.wuyemy.dao.ZijinmingxiMapper;
import com.wuyemy.until.DateToString;

@Service
public class KuserService {

	
	@Autowired
	private KuserMapper kuserMapper;
	private DateToString dateToStr;
	@Autowired
	private JifenMapper jifenMapper;
	@Autowired
	private XiaozuMapper xiaozuMapper;
	@Autowired
	private KuserService kuserService;
	
	@Autowired
	private CanshuMapper canshuMapper;
	@Autowired
	private ZijinmingxiMapper zijinmingxiMapper;
	
	@Autowired
	private YyzxMapper yyzxMapper;
	
	public void insertKuser(String zhanghao, String khname, String tzhanghao,String zhucetime, String yyzxid, String kpassword, int zhuangtaiid) {
		Kuser kuser = new Kuser(zhanghao, khname, tzhanghao, yyzxid,kpassword, zhucetime, zhuangtaiid);
		kuserMapper.insert(kuser);
	}


	public List<Kuser> getallweijihuo() {
		
		
		
		return kuserMapper.selectByExampleWithZhuangTai(null);
	}


	public void qidong(String zhanghao) {
		KuserExample emple = new KuserExample();
		KuserExample.Criteria criteria = emple.createCriteria();
		criteria.andZhanghaoEqualTo(zhanghao);
		Kuser kuser = new Kuser();
		kuser.setZhuangtaiid(2);
		kuser.setJihuotime( dateToStr.DateToStr(new Date()));
		kuserMapper.updateByExampleSelective(kuser, emple);
		
	}


	public List<Kuser> getyijihuouser() {
		// TODO Auto-generated method stub
		return kuserMapper.selectByExampleWithZhuangTaiAndJf(null);
	}

	public List<Kuser> loginusers(String zhanghao){
		KuserExample example = new KuserExample();
		KuserExample.Criteria criteria = example.createCriteria();
		criteria.andZhanghaoEqualTo(zhanghao);
		
		return  kuserMapper.selectByExample(example);
	}
	
	public long loginuser(String zhanghao, String kpassword) {
		KuserExample examp = new KuserExample();
		KuserExample.Criteria criteria = examp.createCriteria();
		criteria.andZhanghaoEqualTo(zhanghao);
		criteria.andKpasswordEqualTo(kpassword);
		
		return kuserMapper.countByExample(examp);
	}


	public long getcounttzhanghao(String zhanghao) {
		KuserExample example = new KuserExample();
		KuserExample.Criteria criteria = example.createCriteria();
		criteria.andZhanghaoEqualTo(zhanghao);
		 
		return kuserMapper.countByExample(example);
	}


	public void insertjifen(String zhanghao, BigDecimal fxjf, BigDecimal gcjf, BigDecimal ztjf, BigDecimal chjf ) {
		Jifen jifen = new Jifen( zhanghao, fxjf, gcjf, ztjf, chjf);
		jifenMapper.insert(jifen);
		
	}


	public void inserxiaozutable(int zid, int zidd, String zhanghao) {
		Xiaozu xiazu = new Xiaozu(zid, zidd, zhanghao,0);
		
		xiaozuMapper.insert(xiazu);
		
	}


	public List<Xiaozu> getxiaozid(String zhanghao) {
		XiaozuExample xiaozuExample = new XiaozuExample();
		XiaozuExample.Criteria criteria = xiaozuExample.createCriteria();
		criteria.andZhanghaoEqualTo(zhanghao);
		return xiaozuMapper.selectByExample(xiaozuExample);
		
	}


	public long getcountxzid(int i) {
		XiaozuExample example = new XiaozuExample();
		XiaozuExample.Criteria criteria = example.createCriteria();
		criteria.andZidEqualTo(i);
		return xiaozuMapper.countByExample(example);
	}


	public int getmaxzid() {
		
		 return xiaozuMapper.selectMaxZid();
	
	}


	public void updateZzidd( int bzidd ,int zid,int zidd) {
		Xiaozu xiaozu = new Xiaozu();
		XiaozuExample example = new XiaozuExample();
		XiaozuExample.Criteria criteria = example.createCriteria();
		criteria.andZiddEqualTo(zidd);
		criteria.andZidEqualTo(zid);
		xiaozu.setZidd(bzidd);
		xiaozuMapper.updateByExampleSelective(xiaozu, example);
	}
	

	public List<Xiaozu> selectzidd(int g) {
		XiaozuExample xiaozuExample = new XiaozuExample();
		XiaozuExample.Criteria criteria = xiaozuExample.createCriteria();
		criteria.andZidEqualTo(g);
		
		return xiaozuMapper.selectByExample(xiaozuExample);
		
	}


	


	public List<Xiaozu> getxzzhanghao(int i, int mm) {
		XiaozuExample xiaozuExample = new XiaozuExample();
		XiaozuExample.Criteria criteria = xiaozuExample.createCriteria();
		criteria.andZidEqualTo(i);
		criteria.andZiddEqualTo(mm);
		return xiaozuMapper.selectByExample(xiaozuExample);
	}


	public List<Kuser> getTzhanghao(String zhanghaos) {
		KuserExample example = new KuserExample();
		KuserExample.Criteria criteria = example.createCriteria();
		criteria.andZhanghaoEqualTo(zhanghaos);
		return kuserMapper.selectByExample(example);
		
	}


	public int getmaxziddwithzid(int l) {
		XiaozuExample exmp = new XiaozuExample();
		XiaozuExample.Criteria criteria = exmp.createCriteria();
		criteria.andZidEqualTo(l);
		
		return xiaozuMapper.selectMaxZidd(exmp);
	}


	public void update1zid(int zid ,int zidd,  String zhanghaos) {
		XiaozuExample example = new XiaozuExample();
		XiaozuExample.Criteria criteria = example.createCriteria();
		criteria.andZhanghaoEqualTo(zhanghaos);
		Xiaozu xiaozu = new Xiaozu();
		xiaozu.setZid(zid);
		xiaozu.setZidd(zidd);
		xiaozuMapper.updateByExampleSelective(xiaozu, example);
	}


	public long getcountxZzid() {
		return xiaozuMapper.countByExample(null);
	}
	
	
	
	//启动激活
	public int jihuo( String zhanghao,String tzhanghao){
		
		kuserService.qidong(zhanghao);
		kuserService.insertjifen(zhanghao, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO,BigDecimal.ZERO  );
		
			long longs = kuserService.getcountxZzid();
		
		if("".equals(tzhanghao)){
			int zid;
			if(longs==0){
				zid = 1;
			}else{
				int g = kuserService.getmaxzid();
				zid =  g + 1;
			}	
			kuserService.inserxiaozutable(zid,1,zhanghao);
			return 1;
		}
		else if(!"".equals(tzhanghao)){
		 List<Xiaozu> lists =	kuserService.getxiaozid(tzhanghao);
		  int i = lists.get(0).getZid();
		  long j = kuserService.getcountxzid(i);
		  if( j == 1){			  
			  kuserService.inserxiaozutable(i,2,zhanghao);
			  kuserService.zengjiaFxAndGc(zhanghao);
			  
		  }else if(j==2){
			 			 
			 kuserService.inserxiaozutable(i,3,zhanghao);
			 kuserService.zengjiaFxAndGc(zhanghao);
		  }else if(j==3){
			  kuserService.inserxiaozutable(i,4,zhanghao);
			  kuserService.zengjiaFxAndGc(zhanghao);
		  }else if(j==4){
			  kuserService.inserxiaozutable(i,5,zhanghao);
			  kuserService.zengjiaFxAndGc(zhanghao);
		  }else if(j==5){
			  kuserService.inserxiaozutable(i,6,zhanghao);
			  kuserService.zengjiaFxAndGc(zhanghao);
		  }else if(j==6){
				
			  int z5 = kuserService.getmaxzid();
				 int m5 = z5+1;
				 kuserService.inserxiaozutable(i,7,zhanghao);
				 List<Xiaozu> users =  kuserService.getxzzhanghao(i,1);
				 String user1 = users.get(0).getZhanghao();
				 
				 	List<Kuser> kuser =	kuserService.getTzhanghao(user1);
					String tuser = kuser.get(0).getTzhanghao();
				 
				 List<Xiaozu> users1 =  kuserService.getxzzhanghao(i,2);
				 String user2 = users1.get(0).getZhanghao();
				 
				 List<Xiaozu> users2 =  kuserService.getxzzhanghao(i,3);
				 String user3 = users2.get(0).getZhanghao();
				 
				 List<Xiaozu> users3 =  kuserService.getxzzhanghao(i,4);
				 String user4 = users3.get(0).getZhanghao();
				 
				 List<Xiaozu> users4 =  kuserService.getxzzhanghao(i,5);
				 String user5 = users4.get(0).getZhanghao();
				 
				 List<Xiaozu> users5 =  kuserService.getxzzhanghao(i,6);
				 String user6 = users5.get(0).getZhanghao();
				 
				 kuserService.update1zid(i, 1, user2);
				 kuserService.update1zid(i, 2, user4);
				 kuserService.update1zid(i, 3, user5);
				 kuserService.update1zid(m5, 1, user3);
				 kuserService.update1zid(m5, 2, user6);
				 kuserService.update1zid(m5, 3, zhanghao);
				 kuserService.zengjiaFxAndGc(zhanghao);
				 	
				 
				 if("".equals(tuser)){
					 kuserService.update1zid(i, 4, user1);
					 kuserService.zengjiaChuJu(user1);
					 kuserService.jijijiji(user1);
				 }else{
					 List<Xiaozu> kuser1 = kuserService.getxiaozid(tuser);
					 int tzid = kuser1.get(0).getZid();
					 int tmaxzidd = kuserService.getmaxziddwithzid(tzid);
					 
					 if(tmaxzidd<6){
						 kuserService.update1zid(tzid, tmaxzidd+1, user1);
						 kuserService.zengjiaChuJu(user1);
						 kuserService.addTUserZtOrGcAndFx(user1);
						 kuserService.jijijiji(user1);
					 }else if(tmaxzidd==6){
						 
						
						 int z1 = kuserService.getmaxzid();
						 int m1 = z1+1;
						
						 kuserService.update1zid(tzid, 7, user1);
						 
						 List<Xiaozu> usersa =  kuserService.getxzzhanghao(tzid,1);
						 String user1a = usersa.get(0).getZhanghao();
						 
						 	List<Kuser> kusera =	kuserService.getTzhanghao(user1a);
							String tusera = kusera.get(0).getTzhanghao();
						 
						 List<Xiaozu> users1a =  kuserService.getxzzhanghao(tzid,2);
						 String user2a = users1a.get(0).getZhanghao();
						 
						 List<Xiaozu> users2a =  kuserService.getxzzhanghao(tzid,3);
						 String user3a = users2a.get(0).getZhanghao();
						 
						 List<Xiaozu> users3a =  kuserService.getxzzhanghao(tzid,4);
						 String user4a = users3a.get(0).getZhanghao();
						 
						 List<Xiaozu> users4a=  kuserService.getxzzhanghao(tzid,5);
						 String user5a = users4a.get(0).getZhanghao();
						 
						 List<Xiaozu> users5a =  kuserService.getxzzhanghao(tzid,6);
						 String user6a = users5a.get(0).getZhanghao();
						 
						 kuserService.update1zid(tzid, 1, user2a);
						 kuserService.update1zid(tzid, 2, user4a);
						 kuserService.update1zid(tzid, 3, user5a);
						 kuserService.update1zid(m1, 1, user3a);
						 kuserService.update1zid(m1, 2, user6a);
						 kuserService.update1zid(m1, 3, user1);
						 kuserService.zengjiaChuJu(user1);
						 kuserService.addTUserZtOrGcAndFx(user1);
						 kuserService.jijijiji(user1);
						 if("".equals(tusera)){
							 kuserService.update1zid(tzid, 4, user1a);
							 kuserService.zengjiaChuJu(user1a);
							 kuserService.jijijiji(user1a);
						 }else{
							 List<Xiaozu> kuser2 = kuserService.getxiaozid(tusera);
							 int tzid1 = kuser2.get(0).getZid();
							 int tmaxzidd1 = kuserService.getmaxziddwithzid(tzid1);
							 if(tmaxzidd1<6){
								 kuserService.update1zid(tzid1, tmaxzidd1+1, user1a);
								 kuserService.zengjiaChuJu(user1a);
								 kuserService.addTUserZtOrGcAndFx(user1a);
								 kuserService.jijijiji(user1a);
							 }else if(tmaxzidd1==6){
								 int a1 = kuserService.getmaxzid();
								 int b1 = a1+1;
								
								 kuserService.update1zid(tzid1, 7, user1a);
								 List<Xiaozu> usersb =  kuserService.getxzzhanghao(tzid1,1);
								 String user1b = usersb.get(0).getZhanghao();
								 
								 	List<Kuser> kuserb =	kuserService.getTzhanghao(user1b);
									String tuserb = kuserb.get(0).getTzhanghao();
								 
								 List<Xiaozu> users1b =  kuserService.getxzzhanghao(tzid1,2);
								 String user2b = users1b.get(0).getZhanghao();
								 
								 List<Xiaozu> users2b =  kuserService.getxzzhanghao(tzid1,3);
								 String user3b = users2b.get(0).getZhanghao();
								 
								 List<Xiaozu> users3b =  kuserService.getxzzhanghao(tzid1,4);
								 String user4b = users3b.get(0).getZhanghao();
								 
								 List<Xiaozu> users4b=  kuserService.getxzzhanghao(tzid1,5);
								 String user5b = users4b.get(0).getZhanghao();
								 
								 List<Xiaozu> users5b =  kuserService.getxzzhanghao(tzid1,6);
								 String user6b = users5b.get(0).getZhanghao();
								 
								 kuserService.update1zid(tzid1, 1, user2b);
								 kuserService.update1zid(tzid1, 2, user4b);
								 kuserService.update1zid(tzid1, 3, user5b);
								 kuserService.update1zid(b1, 1, user3b);
								 kuserService.update1zid(b1, 2, user6b);
								 kuserService.update1zid(b1, 3, user1a);
								 kuserService.zengjiaChuJu(user1a);
								 kuserService.addTUserZtOrGcAndFx(user1a);
								 kuserService.jijijiji(user1a);
								 if("".equals(tuserb)){
									 kuserService.update1zid(tzid1, 4, user1b);
									 kuserService.zengjiaChuJu(user1b);
									 kuserService.jijijiji(user1b);
								 }else {
									 List<Xiaozu> kuser3 = kuserService.getxiaozid(tuserb);
									 int tzid2 = kuser3.get(0).getZid();
									 int tmaxzidd2 = kuserService.getmaxziddwithzid(tzid2);
									 if(tmaxzidd2<6){
										 kuserService.update1zid(tzid2, tmaxzidd2+1, user1b);
										 kuserService.zengjiaChuJu(user1b);
										 kuserService.addTUserZtOrGcAndFx(user1b);
										 kuserService.jijijiji(user1b);
									 }else if(tmaxzidd2==6){
										 int a2 = kuserService.getmaxzid();
										 int b2 = a2+1;
										 kuserService.update1zid(tzid2, 7, user1b);
										 List<Xiaozu> usersc =  kuserService.getxzzhanghao(tzid2,1);
										 String user1c= usersc.get(0).getZhanghao();
										 
										 	List<Kuser> kuserc =	kuserService.getTzhanghao(user1c);
											String tuserc = kuserc.get(0).getTzhanghao();
										 
										 List<Xiaozu> users1c =  kuserService.getxzzhanghao(tzid2,2);
										 String user2c= users1c.get(0).getZhanghao();
										 
										 List<Xiaozu> users2c =  kuserService.getxzzhanghao(tzid2,3);
										 String user3c = users2c.get(0).getZhanghao();
										 
										 List<Xiaozu> users3c =  kuserService.getxzzhanghao(tzid2,4);
										 String user4c = users3c.get(0).getZhanghao();
										 
										 List<Xiaozu> users4c=  kuserService.getxzzhanghao(tzid2,5);
										 String user5c = users4c.get(0).getZhanghao();
										 
										 List<Xiaozu> users5c =  kuserService.getxzzhanghao(tzid2,6);
										 String user6c = users5c.get(0).getZhanghao();
										 
										 kuserService.update1zid(tzid2, 1, user2c);
										 kuserService.update1zid(tzid2, 2, user4c);
										 kuserService.update1zid(tzid2, 3, user5c);
										 kuserService.update1zid(b2, 1, user3c);
										 kuserService.update1zid(b2, 2, user6c);
										 kuserService.update1zid(b2, 3, user1b);
										 kuserService.zengjiaChuJu(user1b);
										 kuserService.addTUserZtOrGcAndFx(user1b);
										 kuserService.jijijiji(user1b);
										 if("".equals(tuserc)){
											 kuserService.update1zid(tzid2, 4, user1c);
											 kuserService.zengjiaChuJu(user1c);
											 kuserService.jijijiji(user1c);
										 }else {
											 List<Xiaozu> kuser4 = kuserService.getxiaozid(tuserc);
											 int tzid3 = kuser4.get(0).getZid();
											 int tmaxzidd3= kuserService.getmaxziddwithzid(tzid3);
											 if(tmaxzidd3<6){
												 kuserService.update1zid(tzid3, tmaxzidd3+1, user1c);
												 kuserService.zengjiaChuJu(user1c);
												 kuserService.addTUserZtOrGcAndFx(user1c);
												 kuserService.jijijiji(user1c);
											 }else if(tmaxzidd3==6){
												 int a3= kuserService.getmaxzid();
												 int b3 = a3+1;
												 kuserService.update1zid(tzid3, 7, user1c);
												 List<Xiaozu> usersd =  kuserService.getxzzhanghao(tzid3,1);
												 String user1d= usersd.get(0).getZhanghao();
												 
												 	List<Kuser> kuserd =	kuserService.getTzhanghao(user1d);
													String tuserd = kuserd.get(0).getTzhanghao();
												 
												 List<Xiaozu> users1d =  kuserService.getxzzhanghao(tzid3,2);
												 String user2d= users1d.get(0).getZhanghao();
												 
												 List<Xiaozu> users2d =  kuserService.getxzzhanghao(tzid3,3);
												 String user3d = users2d.get(0).getZhanghao();
												 
												 List<Xiaozu> users3d =  kuserService.getxzzhanghao(tzid3,4);
												 String user4d = users3d.get(0).getZhanghao();
												 
												 List<Xiaozu> users4d=  kuserService.getxzzhanghao(tzid3,5);
												 String user5d = users4d.get(0).getZhanghao();
												 
												 List<Xiaozu> users5d =  kuserService.getxzzhanghao(tzid3,6);
												 String user6d = users5d.get(0).getZhanghao();
												 
												 kuserService.update1zid(tzid3, 1, user2d);
												 kuserService.update1zid(tzid3, 2, user4d);
												 kuserService.update1zid(tzid3, 3, user5d);
												 kuserService.update1zid(b3, 1, user3d);
												 kuserService.update1zid(b3, 2, user6d);
												 kuserService.update1zid(b3, 3, user1c);
												 kuserService.zengjiaChuJu(user1c);
												 kuserService.addTUserZtOrGcAndFx(user1c);
												 kuserService.jijijiji(user1c);
												 if("".equals(tuserd)){
													 kuserService.update1zid(tzid3, 4, user1d);
													 kuserService.zengjiaChuJu(user1d);
													 kuserService.jijijiji(user1d);
												 }else {
													 List<Xiaozu> kuser5 = kuserService.getxiaozid(tuserd);
													 int tzid4 = kuser5.get(0).getZid();
													 int tmaxzidd4= kuserService.getmaxziddwithzid(tzid3);
													 if(tmaxzidd4<6){
														 kuserService.update1zid(tzid4, tmaxzidd4+1, user1d);
														 kuserService.zengjiaChuJu(user1d);
														 kuserService.addTUserZtOrGcAndFx(user1d);
														 kuserService.jijijiji(user1d);
													 }else if(tmaxzidd4==6){
														 int a4= kuserService.getmaxzid();
														 int b4 = a4+1;
														 kuserService.update1zid(tzid4, 7, user1d);
														 List<Xiaozu> userse =  kuserService.getxzzhanghao(tzid4,1);
														 String user1e= userse.get(0).getZhanghao();
														 
														 	List<Kuser> kusere =	kuserService.getTzhanghao(user1e);
															String tusere = kusere.get(0).getTzhanghao();
														 
														 List<Xiaozu> users1e =  kuserService.getxzzhanghao(tzid4,2);
														 String user2e= users1e.get(0).getZhanghao();
														 
														 List<Xiaozu> users2e =  kuserService.getxzzhanghao(tzid4,3);
														 String user3e = users2e.get(0).getZhanghao();
														 
														 List<Xiaozu> users3e =  kuserService.getxzzhanghao(tzid4,4);
														 String user4e = users3e.get(0).getZhanghao();
														 
														 List<Xiaozu> users4e=  kuserService.getxzzhanghao(tzid4,5);
														 String user5e = users4e.get(0).getZhanghao();
														 
														 List<Xiaozu> users5e =  kuserService.getxzzhanghao(tzid4,6);
														 String user6e = users5e.get(0).getZhanghao();
														 
														 kuserService.update1zid(tzid4, 1, user2e);
														 kuserService.update1zid(tzid4, 2, user4e);
														 kuserService.update1zid(tzid4, 3, user5e);
														 kuserService.update1zid(b4, 1, user3e);
														 kuserService.update1zid(b4, 2, user6e);
														 kuserService.update1zid(b4, 3, user1d);
														 kuserService.zengjiaChuJu(user1d);
														 kuserService.addTUserZtOrGcAndFx(user1d);
														 kuserService.jijijiji(user1d);
														 if("".equals(tusere)){
															 kuserService.update1zid(tzid4, 4, user1e);
															 kuserService.zengjiaChuJu(user1e);
															 kuserService.jijijiji(user1e);
														 }
													 }
													 
													 
													 
													 
													 }
											 }
											 
											 
											 
											 
											 }
										 
										 }
											 
								 }
								 
							 }
						 }
					 }
				 }
		  }
		  return 2;
		}
		return 3;
	}
	////根据账号增加出局金币金币
	public void zengjiaChuJu(String zhanghao){
		 BigDecimal Chuji = kuserService.getCHjucanshu();
		 BigDecimal chuju = null;
		 BigDecimal getchuj = kuserService.getchuj(zhanghao);
		chuju = getchuj.add(Chuji);
		JifenExample example = new JifenExample();
		JifenExample.Criteria criteria = example.createCriteria();
		criteria.andZhanghaoEqualTo(zhanghao);
		Jifen jife = new Jifen();
		jife.setChjf(chuju);
		jifenMapper.updateByExampleSelective(jife, example);
		
		kuserService.addChujuJinbiWitnZjmxTal(zhanghao);
		kuserService.chujuzengjiacishu(zhanghao);
		
	
	}
	//根据账号增加推荐人的分享和购车金币
	public  void zengjiaFxAndGc(String zhanghao) {
		
		 List<Kuser> tzhanghaos = kuserService.getTzhanghao(zhanghao);
		 String tzhanghao = tzhanghaos.get(0).getTzhanghao();
		 	BigDecimal fXcanshu = kuserService.getFXcanshu();
		 	BigDecimal gCcanshu = kuserService.getGCcanshu();
		    BigDecimal fxjb = kuserService.getfxjb(tzhanghao);
		    
		    BigDecimal fxjf = null;
		    fxjf = fxjb.add(fXcanshu);
		    BigDecimal gcjf = kuserService.getgcjb(tzhanghao);
		    BigDecimal gcjb = null;
		    gcjb = gcjf.add(gCcanshu);
		    
		 JifenExample example = new JifenExample();
		 JifenExample.Criteria criteria = example.createCriteria();
		 
		 criteria.andZhanghaoEqualTo(tzhanghao);
		 Jifen jifen = new Jifen();
		 jifen.setFxjf(fxjf);
		 jifen.setGcjf(gcjb);
		 jifenMapper.updateByExampleSelective(jifen, example);
		 kuserService.addFxJinbiWitnZjmxTal(tzhanghao);
		 kuserService.addGCJinbiWitnZjmxTal(tzhanghao);
		}
	//根据账号获取分享金币数
	public BigDecimal getfxjb(String zhanghao){
		JifenExample example = new JifenExample();
		 JifenExample.Criteria criteria = example.createCriteria();
		 criteria.andZhanghaoEqualTo(zhanghao);
		 List<Jifen> list = jifenMapper.selectByExample(example);
		 BigDecimal fxjf = list.get(0).getFxjf();
		 return fxjf ;
	}
	//根据账号获取购车金币数
	public BigDecimal getgcjb(String zhanghao){
		JifenExample example = new JifenExample();
		JifenExample.Criteria criteria = example.createCriteria();
		criteria.andZhanghaoEqualTo(zhanghao);
		
		List<Jifen> list = jifenMapper.selectByExample(example);
		BigDecimal gcjf = list.get(0).getGcjf();
		return gcjf ;
	}
	
	//根据账号获取出局金币数
	public BigDecimal getchuj(String zhanghao){
		JifenExample example = new JifenExample();
		JifenExample.Criteria criteria = example.createCriteria();
		criteria.andZhanghaoEqualTo(zhanghao);
		
		List<Jifen> list = jifenMapper.selectByExample(example);
		BigDecimal chjf = list.get(0).getChjf();
		return chjf ;
	}
	//获取分享积分参数 6000
	public BigDecimal getFXcanshu(){
		Canshu canshu = canshuMapper.selectByPrimaryKey(4);
		
		return canshu.getValue();	

	}
	//获取购车积分参数 6000
	public BigDecimal getGCcanshu(){
		Canshu canshu = canshuMapper.selectByPrimaryKey(3);
		
		return canshu.getValue();	
		
	}
	//获取出局积分参数 2000
	public BigDecimal getCHjucanshu(){
		Canshu canshu = canshuMapper.selectByPrimaryKey(2);
		
		return canshu.getValue();	
		
	}
	//获取在途积分参数 2000
	public BigDecimal getZTcanshu(){
		Canshu canshu = canshuMapper.selectByPrimaryKey(1);
		
		return canshu.getValue();	
		
	}
	
	//出局加1
	public void chujuzengjiacishu(String zhanghao){
		
		//获取出局次数
		XiaozuExample exampl = new XiaozuExample();
		XiaozuExample.Criteria crite = exampl.createCriteria();
		crite.andZhanghaoEqualTo(zhanghao);
		List<Xiaozu> lis = xiaozuMapper.selectByExample(exampl);
		
		   Integer cjcs = lis.get(0).getSuozailunshu(); 
		//出局次数+1
		   int chujucs = cjcs + 1;
		   Xiaozu xiaozu = new Xiaozu();
		   xiaozu.setSuozailunshu(chujucs);
		 xiaozuMapper.updateByExampleSelective(xiaozu, exampl);
		 
		 
		}
	
	
	public void jijijiji(String zhanghao){
		
		//获取出局次数
				XiaozuExample exampl = new XiaozuExample();
				XiaozuExample.Criteria crite = exampl.createCriteria();
				crite.andZhanghaoEqualTo(zhanghao);
				List<Xiaozu> lis = xiaozuMapper.selectByExample(exampl);
				
				   Integer cjcs = lis.get(0).getSuozailunshu(); 
		KuserExample example = new KuserExample();
		KuserExample.Criteria criteria = example.createCriteria();
		criteria.andTzhanghaoEqualTo(zhanghao);
		long countByExample = kuserMapper.countByExample(example);
	 if(cjcs==5&&countByExample==0){
		 kuserService.deleteUser(zhanghao);
		 kuserService.deleteUserXiaozuTab(zhanghao);
		 
	 }		 		
	}
	
	
	//出局的人推荐人不为空就给推荐人增加积分	  	 
	public void addTUserZtOrGcAndFx(String zhanghao){
		
		
		BigDecimal fXcanshu = kuserService.getFXcanshu();
		BigDecimal gCcanshu = kuserService.getGCcanshu();
		BigDecimal zTcanshu = kuserService.getZTcanshu();
		
		 //获取推荐人账号
		List<Kuser> tzhanghaos = kuserService.getTzhanghao(zhanghao);
		 String tzhanghao = tzhanghaos.get(0).getTzhanghao();
		 
		
		 XiaozuExample exampl = new XiaozuExample();
			XiaozuExample.Criteria crite = exampl.createCriteria();
			crite.andZhanghaoEqualTo(zhanghao);
			List<Xiaozu> lis = xiaozuMapper.selectByExample(exampl);
			
			   Integer cjcs = lis.get(0).getSuozailunshu(); 
			
		 //获取推荐人的在途余额和购车分享余额
		 JifenExample example = new JifenExample();
		 JifenExample.Criteria criteria = example.createCriteria();
		 criteria.andZhanghaoEqualTo(tzhanghao);
		 
		 List<Jifen> list = jifenMapper.selectByExample(example);
		 
		 BigDecimal ztjf = list.get(0).getZtjf();
		 
		 BigDecimal gcjf = list.get(0).getGcjf();
		 
		 BigDecimal fxjf = list.get(0).getFxjf();
		 
		 
		
		 
		 
		 if(cjcs<2){
			 BigDecimal fxjb = null;
			 fxjb = fxjf.add(fXcanshu);
			 BigDecimal ztjb = null;
			 ztjb = ztjf.add(zTcanshu);
			 Jifen jife = new Jifen();
			 jife.setFxjf(fxjb);
			 jife.setZtjf(ztjb);
			 jifenMapper.updateByExampleSelective(jife, example);
			 kuserService.addFxJinbiWitnZjmxTal(tzhanghao);
			 kuserService.addZaituJinbiWitnZjmxTal(tzhanghao);
		 }else{
			 BigDecimal fxjb = null;
			 fxjb = fxjf.add(fXcanshu);
			 BigDecimal gcjb = null;
			 gcjb = gcjf.add(gCcanshu);
			 Jifen jife = new Jifen();
			 jife.setFxjf(fxjb);
			 jife.setGcjf(gcjb);
			 jifenMapper.updateByExampleSelective(jife, example);
			 kuserService.addFxJinbiWitnZjmxTal(tzhanghao);
			 kuserService.addGCJinbiWitnZjmxTal(tzhanghao);
		 }
	}
	
	
	//插入资金明细表增加出局金币记录
	public void addChujuJinbiWitnZjmxTal(String zhanghao){
		
		
		Zijinmingxi zijinmingxi= new Zijinmingxi(null, zhanghao, getCHjucanshu(), "出局金币","增加", dateToStr.DateToStr(new Date()));
		 zijinmingxiMapper.insertSelective(zijinmingxi);
	}
	//插入资金明细表增加分享金币记录
	public void addFxJinbiWitnZjmxTal(String zhanghao){
		
		
		Zijinmingxi zijinmingxi= new Zijinmingxi(null, zhanghao, getFXcanshu(), "分享金币","增加", dateToStr.DateToStr(new Date()));
		zijinmingxiMapper.insertSelective(zijinmingxi);
	}
	//插入资金明细表增加购车金币记录
	public void addGCJinbiWitnZjmxTal(String zhanghao){
		
		
		Zijinmingxi zijinmingxi= new Zijinmingxi(null, zhanghao, getGCcanshu(), "购车金币","增加", dateToStr.DateToStr(new Date()));
		zijinmingxiMapper.insertSelective(zijinmingxi);
	}
	//插入资金明细表增加在途金币记录
	public void addZaituJinbiWitnZjmxTal(String zhanghao){
		
		
		Zijinmingxi zijinmingxi= new Zijinmingxi(null, zhanghao, getZTcanshu(), "在途金币","增加", dateToStr.DateToStr(new Date()));
		zijinmingxiMapper.insertSelective(zijinmingxi);
	}

	//修改用户名字和密码
	public void updateUserXinxi(String zhanghao, String name, String password) {
		KuserExample example = new KuserExample();
		KuserExample.Criteria criteria = example.createCriteria();
		criteria.andZhanghaoEqualTo(zhanghao);
		Kuser kuser = new Kuser();
		kuser.setKhname(name);
		if(password.equals("")){
			
			kuserMapper.updateByExampleSelective(kuser, example);
		}else{
			kuser.setKpassword(password);
			kuserMapper.updateByExampleSelective(kuser, example);
		
		}
	}

	//推荐人删除后推荐人为空
	public void updateTzhanghao(String zhanghao) {
	
		kuserService.deleteUserXiaozuTab(zhanghao);
		kuserService.deleteUser(zhanghao);
		KuserExample example = new KuserExample();
		KuserExample.Criteria criteria = example.createCriteria();
		criteria.andTzhanghaoEqualTo(zhanghao);
		Kuser kuser = new Kuser();
		kuser.setTzhanghao("");
		
		kuserMapper.updateByExampleSelective(kuser, example);
	}
	 //从kuser表删除改用户
	public void deleteUser(String zhanghao){
		KuserExample example = new KuserExample();
		KuserExample.Criteria criteria = example.createCriteria();
		criteria.andZhanghaoEqualTo(zhanghao);
		
		kuserMapper.deleteByExample(example);
	}
	//从xiaozu表删除此账号且后边的前进一位
	public void deleteUserXiaozuTab(String zhanghao){
		
		
		
		//获取账号的zid
		List<Xiaozu> xiaozid = kuserService.getxiaozid(zhanghao);
		int zid = xiaozid.get(0).getZid();
		int zidd = xiaozid.get(0).getZidd();
		
		int countxzid = (int) kuserService.getcountxzid(zid);
		
		
		XiaozuExample example = new XiaozuExample();
		XiaozuExample.Criteria criteria = example.createCriteria();
		criteria.andZhanghaoEqualTo(zhanghao); 
		
		if(countxzid==zidd){
			xiaozuMapper.deleteByExample(example);
			
		}else{
			int i = countxzid-zidd;
			if(i==1){
				List<Xiaozu> zhanghaos1 = kuserService.getxzzhanghao(zid, zidd+1);
				String zhanghao1 = zhanghaos1.get(0).getZhanghao();
				xiaozuMapper.deleteByExample(example);
				kuserService.update1zid(zid, zidd+1-1, zhanghao1);
								
			}else if(i==2){
				List<Xiaozu> zhanghaos1 = kuserService.getxzzhanghao(zid, zidd+1);
				String zhanghao1 = zhanghaos1.get(0).getZhanghao();
				List<Xiaozu> zhanghaos2 = kuserService.getxzzhanghao(zid, zidd+2);
				String zhanghao2 = zhanghaos2.get(0).getZhanghao();
				
				xiaozuMapper.deleteByExample(example);
				kuserService.update1zid(zid, zidd+1-1, zhanghao1);
				kuserService.update1zid(zid, zidd+2-1, zhanghao2);
				
			}else if(i==3){
				List<Xiaozu> zhanghaos1 = kuserService.getxzzhanghao(zid, zidd+1);
				String zhanghao1 = zhanghaos1.get(0).getZhanghao();
				List<Xiaozu> zhanghaos2 = kuserService.getxzzhanghao(zid, zidd+2);
				String zhanghao2 = zhanghaos2.get(0).getZhanghao();
				List<Xiaozu> zhanghaos3 = kuserService.getxzzhanghao(zid, zidd+3);
				String zhanghao3 = zhanghaos3.get(0).getZhanghao();
				xiaozuMapper.deleteByExample(example);
				kuserService.update1zid(zid, zidd+1-1, zhanghao1);
				kuserService.update1zid(zid, zidd+2-1, zhanghao2);
				kuserService.update1zid(zid, zidd+3-1, zhanghao3);
				
			}else if(i==4){
				List<Xiaozu> zhanghaos1 = kuserService.getxzzhanghao(zid, zidd+1);
				String zhanghao1 = zhanghaos1.get(0).getZhanghao();
				List<Xiaozu> zhanghaos2 = kuserService.getxzzhanghao(zid, zidd+2);
				String zhanghao2 = zhanghaos2.get(0).getZhanghao();
				List<Xiaozu> zhanghaos3 = kuserService.getxzzhanghao(zid, zidd+3);
				String zhanghao3 = zhanghaos3.get(0).getZhanghao();
				List<Xiaozu> zhanghaos4 = kuserService.getxzzhanghao(zid, zidd+4);
				String zhanghao4 = zhanghaos4.get(0).getZhanghao();
				xiaozuMapper.deleteByExample(example);
				kuserService.update1zid(zid, zidd+1-1, zhanghao1);
				kuserService.update1zid(zid, zidd+2-1, zhanghao2);
				kuserService.update1zid(zid, zidd+3-1, zhanghao3);
				kuserService.update1zid(zid, zidd+4-1, zhanghao4);
				
			}else if(i==5){
				List<Xiaozu> zhanghaos1 = kuserService.getxzzhanghao(zid, zidd+1);
				String zhanghao1 = zhanghaos1.get(0).getZhanghao();
				List<Xiaozu> zhanghaos2 = kuserService.getxzzhanghao(zid, zidd+2);
				String zhanghao2 = zhanghaos2.get(0).getZhanghao();
				List<Xiaozu> zhanghaos3 = kuserService.getxzzhanghao(zid, zidd+3);
				String zhanghao3 = zhanghaos3.get(0).getZhanghao();
				List<Xiaozu> zhanghaos4 = kuserService.getxzzhanghao(zid, zidd+4);
				String zhanghao4 = zhanghaos4.get(0).getZhanghao();
				List<Xiaozu> zhanghaos5 = kuserService.getxzzhanghao(zid, zidd+5);
				String zhanghao5 = zhanghaos5.get(0).getZhanghao();
				xiaozuMapper.deleteByExample(example);
				kuserService.update1zid(zid, zidd+1-1, zhanghao1);
				kuserService.update1zid(zid, zidd+2-1, zhanghao2);
				kuserService.update1zid(zid, zidd+3-1, zhanghao3);
				kuserService.update1zid(zid, zidd+4-1, zhanghao4);
				kuserService.update1zid(zid, zidd+5-1, zhanghao5);
				
			}
			
			
		}
		
		
			
	}


	public Kuser getoneuser(String zhanghao) {
		
		return kuserMapper.selectByExampleAndJf(zhanghao);
		
	}


	public List<Kuser> getAllzhanghao(String zhanghao) {
		 
		return kuserMapper.selectByExampleWithzhitui(zhanghao);
			 
	}


	public List<Kuser> gettuanzhanghao(String yybianhao) {
		
		
		return kuserMapper.selectByExampleWithtuantui(yybianhao);
		
		
		
		
	}
//团队总人数
	public void eittuanduinum(String yybianhao){
		KuserExample example = new KuserExample();
		KuserExample.Criteria criteria = example.createCriteria();
		criteria.andYyzxidEqualTo(yybianhao);
		long countByExample = kuserMapper.countByExample(example);
		
		YyzxExample yeExample = new YyzxExample();
		YyzxExample.Criteria criteria2 = yeExample.createCriteria();
		criteria2.andYybianhaoEqualTo(yybianhao);
		Yyzx yyzx = new Yyzx();
		yyzx.setYynum((int) countByExample);
		yyzxMapper.updateByExampleSelective(yyzx, yeExample);
	}
	
	//直推总人数
	public void eitZhituiiinum(String zhanghao){
		KuserExample example = new KuserExample();
		KuserExample.Criteria criteria = example.createCriteria();
		criteria.andTzhanghaoEqualTo(zhanghao);
		long countByExample = kuserMapper.countByExample(example);
		
		YyzxExample yeExample = new YyzxExample();
		YyzxExample.Criteria criteria2 = yeExample.createCriteria();
		criteria2.andYyzhanghaoEqualTo(zhanghao);
		Yyzx yyzx = new Yyzx();
		yyzx.setZtnum((int) countByExample);
		yyzxMapper.updateByExampleSelective(yyzx, yeExample);
		
	}


	public JifenZonghe getwelome() {
		KuserExample example = new KuserExample();
		KuserExample.Criteria criteria = example.createCriteria();
		criteria.andZhuangtaiidEqualTo(2);
		long renshu = kuserMapper.countByExample(example);
		long l = renshu*9980;
		BigDecimal selectjifeFXzonghe = jifenMapper.selectjifeFXzonghe();
		BigDecimal selectjifeGCzonghe = jifenMapper.selectjifeGCzonghe();
		BigDecimal selectjifeZTzonghe = jifenMapper.selectjifeZTzonghe();
		BigDecimal selectjifeCJzonghe = jifenMapper.selectjifeCJzonghe();
		
		JifenZonghe jifenZonghe = new JifenZonghe();
		jifenZonghe.setNum(renshu);
		jifenZonghe.setZjzs(l);
		jifenZonghe.setFxnum(selectjifeFXzonghe);
		jifenZonghe.setGcnum(selectjifeGCzonghe);
		jifenZonghe.setCjnum(selectjifeCJzonghe);
		jifenZonghe.setZainum(selectjifeZTzonghe);
		
		return jifenZonghe;
	}
	
	
	
		 
}
	
	


