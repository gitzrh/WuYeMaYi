package com.wuyemy.service;


import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyemy.bean.Canshu;
import com.wuyemy.bean.CanshuExample;
import com.wuyemy.bean.Yyzxlvcanshu;
import com.wuyemy.bean.YyzxlvcanshuExample;
import com.wuyemy.dao.CanshuMapper;
import com.wuyemy.dao.YyzxlvcanshuMapper;

@Service
public class CanshuService {

	@Autowired
	private CanshuMapper canshuMapper;
	@Autowired
	private YyzxlvcanshuMapper yyzxlvcanshuMapper;
	
	public List<Canshu> getCanShu() {
		return canshuMapper.selectByExample(null);
		
	}

	public List<Yyzxlvcanshu> getyycanshu() {
		
		return yyzxlvcanshuMapper.selectByExample(null);
		
	}

	public void updatecanshu1(Integer id,BigDecimal canshu) {
		CanshuExample canshuExample =  new CanshuExample();
		CanshuExample.Criteria caCriteria = canshuExample.createCriteria();
		caCriteria.andIdEqualTo(id);
		Canshu canshus = new Canshu();
		canshus.setValue(canshu);
		canshuMapper.updateByExampleSelective(canshus, canshuExample);
	}

	public void updatecanshu2(Integer id, String lvname, Integer fulijin, Integer zongnum, Integer zhituinum,
			BigDecimal zhekoubili) {
		YyzxlvcanshuExample example  = new YyzxlvcanshuExample();
		YyzxlvcanshuExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		Yyzxlvcanshu canshu = new Yyzxlvcanshu();
		canshu.setLvname(lvname);
		canshu.setFulijin(fulijin);
		 canshu.setZongnum(zongnum);
		 canshu.setZhituinum(zhituinum);
		 canshu.setZhekoubili(zhekoubili);
		
		yyzxlvcanshuMapper.updateByExampleSelective(canshu, example);	
		
	}

	public void addcanshu(String lvname, Integer fulijin, Integer zongnum, Integer zhituinum, BigDecimal zhekoubili) {
		
		Yyzxlvcanshu canshu = new Yyzxlvcanshu(lvname, fulijin, zongnum, zhituinum, zhekoubili);
		
		yyzxlvcanshuMapper.insertSelective(canshu);
		
		
	}

}
