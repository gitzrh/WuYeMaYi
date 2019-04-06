package com.wuyemy.service;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyemy.bean.Jifen;
import com.wuyemy.bean.JifenExample;
import com.wuyemy.bean.Zijinmingxi;
import com.wuyemy.dao.JifenMapper;
import com.wuyemy.dao.ZijinmingxiMapper;
import com.wuyemy.until.DateToString;

@Service
public class JifenServive {
	@Autowired
	private JifenMapper jifenMapper;
	@Autowired
	private KuserService kuserService;
	@Autowired
	private ZijinmingxiMapper zijinmingxiMapper;
	private DateToString dateToStr;
	@Autowired
	private JifenServive jifenServive;
	//扣除积分
	public int kouchujifen(String zhanghao, Integer jibid, BigDecimal jbshu) {
		
		//该账户分享金币数
		BigDecimal getfxjb = kuserService.getfxjb(zhanghao);
		//该账户出局金币数
		BigDecimal getchuj = kuserService.getchuj(zhanghao);
		//该账户购车金币数
		BigDecimal getgcjb = kuserService.getgcjb(zhanghao);
		
		BigDecimal jinbi = null;
		
		JifenExample jifenExample = new JifenExample();
		JifenExample.Criteria criteria = jifenExample.createCriteria();
		criteria.andZhanghaoEqualTo(zhanghao);
		Jifen jifen = new Jifen();
		
		
		if(jibid==1){
			jinbi = getfxjb.subtract(jbshu);
			jifen.setFxjf(jinbi);
			jifenMapper.updateByExampleSelective(jifen, jifenExample);
			jifenServive.subtractFxJinbiWitnZjmxTal(zhanghao, jbshu);
			return 1;
		}else if(jibid==2){
			jinbi = getgcjb.subtract(jbshu);
			jifen.setGcjf(jinbi);
			jifenMapper.updateByExampleSelective(jifen, jifenExample);	
			jifenServive.subtractGCJinbiWitnZjmxTal(zhanghao, jbshu);
			return 1;
		}else{
			
			jinbi = getchuj.subtract(jbshu);
			jifen.setChjf(jinbi);
			jifenMapper.updateByExampleSelective(jifen, jifenExample);
			jifenServive.subtractChujuJinbiWitnZjmxTal(zhanghao, jbshu);
			return 1;
		}
		 
		
		
	}
	
	
	
	
	//插入资金明细表扣除出局金币记录
		public void subtractChujuJinbiWitnZjmxTal(String zhanghao,BigDecimal jibishu){
			
			
			Zijinmingxi zijinmingxi= new Zijinmingxi(null, zhanghao, jibishu, "出局金币","扣除", dateToStr.DateToStr(new Date()));
			 zijinmingxiMapper.insertSelective(zijinmingxi);
		}
		//插入资金明细表扣除分享金币记录
		public void subtractFxJinbiWitnZjmxTal(String zhanghao,BigDecimal jibishu){
			
			
			Zijinmingxi zijinmingxi= new Zijinmingxi(null, zhanghao, jibishu, "分享金币","扣除", dateToStr.DateToStr(new Date()));
			zijinmingxiMapper.insertSelective(zijinmingxi);
		}
		//插入资金明细表扣除购车金币记录
		public void subtractGCJinbiWitnZjmxTal(String zhanghao,BigDecimal jibishu){
			
			
			Zijinmingxi zijinmingxi= new Zijinmingxi(null, zhanghao, jibishu, "购车金币","扣除", dateToStr.DateToStr(new Date()));
			zijinmingxiMapper.insertSelective(zijinmingxi);
		}
		//插入资金明细表增加出局金币记录
		public void addChujuJinbiWitnZjmxTal(String zhanghao,BigDecimal jibishu){
			
			
			Zijinmingxi zijinmingxi= new Zijinmingxi(null, zhanghao, jibishu, "出局金币","增加", dateToStr.DateToStr(new Date()));
			zijinmingxiMapper.insertSelective(zijinmingxi);
		}
		//插入资金明细表增加分享金币记录
		public void addFxJinbiWitnZjmxTal(String zhanghao,BigDecimal jibishu){
			
			
			Zijinmingxi zijinmingxi= new Zijinmingxi(null, zhanghao, jibishu, "分享金币","增加", dateToStr.DateToStr(new Date()));
			zijinmingxiMapper.insertSelective(zijinmingxi);
		}
		//插入资金明细表增加购车金币记录
		public void addGCJinbiWitnZjmxTal(String zhanghao,BigDecimal jibishu){
			
			
			Zijinmingxi zijinmingxi= new Zijinmingxi(null, zhanghao, jibishu, "购车金币","增加", dateToStr.DateToStr(new Date()));
			zijinmingxiMapper.insertSelective(zijinmingxi);
		}



		//增加积分
		public int addjifen(String zhanghao, Integer jibid, BigDecimal jbshu) {
			
			//该账户分享金币数
			BigDecimal getfxjb = kuserService.getfxjb(zhanghao);
			//该账户出局金币数
			BigDecimal getchuj = kuserService.getchuj(zhanghao);
			//该账户购车金币数
			BigDecimal getgcjb = kuserService.getgcjb(zhanghao);
			
			BigDecimal jinbi = null;
			
			JifenExample jifenExample = new JifenExample();
			JifenExample.Criteria criteria = jifenExample.createCriteria();
			criteria.andZhanghaoEqualTo(zhanghao);
			Jifen jifen = new Jifen();
			
			
			if(jibid==4){
				jinbi = getfxjb.add(jbshu);
				jifen.setFxjf(jinbi);
				jifenMapper.updateByExampleSelective(jifen, jifenExample);
				jifenServive.addFxJinbiWitnZjmxTal(zhanghao, jbshu);
				return 1;
			}else if(jibid==5){
				jinbi = getgcjb.add(jbshu);
				jifen.setGcjf(jinbi);
				jifenMapper.updateByExampleSelective(jifen, jifenExample);	
				jifenServive.addGCJinbiWitnZjmxTal(zhanghao, jbshu);
				return 1;
			}else{
				
				jinbi = getchuj.add(jbshu);
				jifen.setChjf(jinbi);
				jifenMapper.updateByExampleSelective(jifen, jifenExample);
				jifenServive.addChujuJinbiWitnZjmxTal(zhanghao, jbshu);
				return 1;
			}
			 
			
			
		}
	
	

}
