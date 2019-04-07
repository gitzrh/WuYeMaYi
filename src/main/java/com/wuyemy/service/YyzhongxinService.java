package com.wuyemy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyemy.bean.Yyzxsq;
import com.wuyemy.bean.YyzxsqExample;
import com.wuyemy.dao.YyzxsqMapper;

@Service
public class YyzhongxinService {

	@Autowired
	private YyzxsqMapper yyzxsqMapper;
	
	public List<Yyzxsq> getallyysq() {
		return yyzxsqMapper.selectByExample(null);
		
	}

	public void tongguoyysq(int id) {
		YyzxsqExample example = new YyzxsqExample();
		YyzxsqExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		Yyzxsq yyzxsq = new Yyzxsq();
		yyzxsq.setZhaungtaiid(1);
		yyzxsqMapper.updateByExampleSelective(yyzxsq, example);
		
	}

	
	
}
