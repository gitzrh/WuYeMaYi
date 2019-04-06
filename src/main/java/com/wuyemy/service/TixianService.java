package com.wuyemy.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyemy.bean.Jifen;
import com.wuyemy.bean.JifenExample;
import com.wuyemy.bean.Tixian;
import com.wuyemy.bean.TixianExample;
import com.wuyemy.dao.JifenMapper;
import com.wuyemy.dao.TixianMapper;
@Service
public class TixianService {
	
	@Autowired
	private TixianMapper tixianMapper;
	@Autowired
	private KuserService kuserService;
	@Autowired
	private JifenMapper jifenMapper;

	public List<Tixian> getTixianShenhe() {
		return tixianMapper.selectByExamplewithZhuangtai(null);		 
	}

	public List<Tixian> getTixianTongg() {
		return tixianMapper.selectByExamplewithZhuangtai6(null);
	}
	public List<Tixian> getTixianJujue() {
		return tixianMapper.selectByExamplewithZhuangtai7(null);
	}
	
//通过提现
	public void tongguo(Integer id) {
		TixianExample example = new TixianExample();
		TixianExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		Tixian tixian = new Tixian();
		tixian.setZhuangtaiid(6);
		tixianMapper.updateByExampleSelective(tixian, example);
	}
	//拒绝提现
	public void jujue(Integer id, String zhanghao, String jibileixing, BigDecimal jibbishu) {
		TixianExample example = new TixianExample();
		TixianExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		Tixian tixian = new Tixian();
		tixian.setZhuangtaiid(7);
		tixianMapper.updateByExampleSelective(tixian, example);//拒绝提现
		
		BigDecimal jb = null;
		JifenExample jExample = new JifenExample();
		JifenExample.Criteria criteria2 = jExample.createCriteria();
		criteria2.andZhanghaoEqualTo(zhanghao);
		Jifen jifen = new Jifen();
		
		if(jibileixing.equals("分享金币")){
			
			BigDecimal getfxjb = kuserService.getfxjb(zhanghao);
			
			jb = getfxjb.add(jibbishu);
			
			jifen.setFxjf(jb);
			jifenMapper.updateByExampleSelective(jifen, jExample);
		}else if(jibileixing.equals("出局金币")){
			
			BigDecimal getchjjb = kuserService.getchuj(zhanghao);
			
			jb = getchjjb.add(jibbishu);
			
			jifen.setChjf(jb);
			jifenMapper.updateByExampleSelective(jifen, jExample);
		}else if(jibileixing.equals("购车金币")){
			
			BigDecimal getgcjb = kuserService.getgcjb(zhanghao);
			
			jb = getgcjb.add(jibbishu);
			
			jifen.setGcjf(jb); 
			jifenMapper.updateByExampleSelective(jifen, jExample);
		}else{
			
			return;
			
			
		}
			
	}

	
	
	
}
