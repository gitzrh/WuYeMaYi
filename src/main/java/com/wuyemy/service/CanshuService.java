package com.wuyemy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyemy.bean.Canshu;
import com.wuyemy.bean.Yyzxlvcanshu;
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

}
