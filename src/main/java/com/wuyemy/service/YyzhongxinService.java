package com.wuyemy.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyemy.bean.Kuser;
import com.wuyemy.bean.KuserExample;
import com.wuyemy.bean.Yyzx;
import com.wuyemy.bean.YyzxExample;
import com.wuyemy.bean.Yyzxsq;
import com.wuyemy.bean.YyzxsqExample;
import com.wuyemy.dao.KuserMapper;
import com.wuyemy.dao.YyzxMapper;
import com.wuyemy.dao.YyzxlvcanshuMapper;
import com.wuyemy.dao.YyzxsqMapper;
import com.wuyemy.until.DateToString;

@Service
public class YyzhongxinService {

	@Autowired
	private YyzxlvcanshuMapper yycansMaooer;
	@Autowired
	private YyzxMapper yyzxMapper;
	@Autowired
	private YyzxsqMapper yyzxsqMapper;
	@Autowired
	private KuserMapper kuserMapper;
	@Autowired
	private YyzhongxinService yyzhongxinService;
	
	//查询所有申请
	public List<Yyzxsq> getallyysq() {
		return yyzxsqMapper.selectByExample(null);
		
	}
	
	//通过运营中心申请
	public void tongguoyysq(int id,String zhanghao, String name, String bianhao) {  
		YyzxsqExample example = new YyzxsqExample();
		YyzxsqExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		Yyzxsq yyzxsq = new Yyzxsq();
		yyzxsq.setZhaungtaiid(1);
		yyzxsq.setTgtime(DateToString.DateToStr(new Date()));
		yyzxsqMapper.updateByExampleSelective(yyzxsq, example);
		yyzhongxinService.insertyyzxtab(zhanghao, name, bianhao);
	}
	
	//通过就插入运营中心表
	public void insertyyzxtab(String zhanghao, String name, String bianhao){
		KuserExample example = new KuserExample();
		KuserExample.Criteria criteria = example.createCriteria();
		criteria.andTzhanghaoEqualTo(zhanghao);
		criteria.andZhuangtaiidEqualTo(2);
		int ztnum = (int) kuserMapper.countByExample(example);
		
		Yyzx yyzx = new Yyzx(null, zhanghao, name, bianhao, 1, BigDecimal.ZERO, 0, ztnum,null);
		yyzxMapper.insertSelective(yyzx);
	}
	
	public void jujuesqyy(int id) {
		YyzxsqExample example = new YyzxsqExample();
		YyzxsqExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		Yyzxsq yyzxsq = new Yyzxsq();
		yyzxsq.setZhaungtaiid(3);
		yyzxsqMapper.updateByExampleSelective(yyzxsq, example);
		
	}
	
	public List<Yyzx> getallyyzx() {
		return	yyzxMapper.selectByExampleWithLv(null);
	}
	
	public void shengji(String bianhao) {
		long i = yycansMaooer.countByExample(null);
		
		YyzxExample example = new YyzxExample();
		YyzxExample.Criteria criteria = example.createCriteria();
		criteria.andYybianhaoEqualTo(bianhao);
		
		List<Yyzx> list = yyzxMapper.selectByExample(example);
		Integer yyzxlvid = list.get(0).getYyzxlvid();
		
		if(yyzxlvid<i ){
			Yyzx yyzx = new Yyzx();
			yyzx.setYyzxlvid(yyzxlvid+1);
			yyzxMapper.updateByExampleSelective(yyzx, example);
			
		}else{
			return;
		}
	}
	
	public void jiangji(String bianhao) {
		YyzxExample example = new YyzxExample();
		YyzxExample.Criteria criteria = example.createCriteria();
		criteria.andYybianhaoEqualTo(bianhao);
		
		List<Yyzx> list = yyzxMapper.selectByExample(example);
		Integer yyzxlvid = list.get(0).getYyzxlvid();
		if(yyzxlvid>1 ){
			Yyzx yyzx = new Yyzx();
			yyzx.setYyzxlvid(yyzxlvid-1);
			yyzxMapper.updateByExampleSelective(yyzx, example);
			
		}else{
			return;
		}
	}
	
	public void quxiao(String bianhao) {
		YyzxExample example = new YyzxExample();
		YyzxExample.Criteria criteria = example.createCriteria();
		criteria.andYybianhaoEqualTo(bianhao);		
		yyzxMapper.deleteByExample(example);
		
		KuserExample kexample = new KuserExample();
		KuserExample.Criteria criteria2 = kexample.createCriteria();
		criteria2.andYyzxidEqualTo(bianhao);
		Kuser kuser = new Kuser();
		kuser.setYyzxid("");
		kuserMapper.updateByExampleSelective(kuser, kexample);
		
	}
	
	public void xiaugaoybh(String zhanghao, String bianhao) {
		YyzxExample yeExample = new YyzxExample();
		YyzxExample.Criteria criteria1 = yeExample.createCriteria();
		criteria1.andYybianhaoEqualTo(bianhao);
		long countByExample = yyzxMapper.countByExample(yeExample);
		 if(countByExample==1){
			 KuserExample example = new KuserExample();
			 KuserExample.Criteria criteria = example.createCriteria();
			 criteria.andZhanghaoEqualTo(zhanghao);
			 Kuser kuser = new Kuser();
			 kuser.setYyzxid(bianhao);
			 kuserMapper.updateByExampleSelective(kuser, example);
			 
		 }else{
			 return;
		 }
	}
	
	public void xiugaijinbibh(BigDecimal jinbi, String bianhao) {
		YyzxExample yeExample = new YyzxExample();
		YyzxExample.Criteria criteria1 = yeExample.createCriteria();
		criteria1.andYybianhaoEqualTo(bianhao);
		Yyzx yyzx = new Yyzx();
		yyzx.setYyjinbi(jinbi);
		yyzxMapper.updateByExampleSelective(yyzx, yeExample);
	}

	
	
}
