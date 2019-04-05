package com.wuyemy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyemy.bean.Tixian;
import com.wuyemy.bean.TixianExample;
import com.wuyemy.dao.TixianMapper;
@Service
public class TixianService {
	
	@Autowired
	private TixianMapper tixianMapper;

	public List<Tixian> getTixianShenhe() {
		return tixianMapper.selectByExamplewithZhuangtai(null);		 
	}

	public List<Tixian> getTixianTongg() {
		return tixianMapper.selectByExamplewithZhuangtai6(null);
	}
	public List<Tixian> getTixianJujue() {
		return tixianMapper.selectByExamplewithZhuangtai7(null);
	}

	public void tongguo(Integer id) {
		TixianExample example = new TixianExample();
		TixianExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		Tixian tixian = new Tixian();
		tixian.setZhuangtaiid(6);
		tixianMapper.updateByExampleSelective(tixian, example);
	}

	
	
}
