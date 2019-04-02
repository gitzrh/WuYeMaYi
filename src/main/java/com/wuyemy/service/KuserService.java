package com.wuyemy.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyemy.bean.Jifen;
import com.wuyemy.bean.Kuser;
import com.wuyemy.bean.KuserExample;
import com.wuyemy.bean.Xiaozu;
import com.wuyemy.bean.XiaozuExample;
import com.wuyemy.dao.JifenMapper;
import com.wuyemy.dao.KuserMapper;
import com.wuyemy.dao.XiaozuMapper;
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
		Xiaozu xiazu = new Xiaozu(zid, zidd, zhanghao);
		
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


	public long getmaxzid() {
		
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
	}


