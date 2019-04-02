package com.wuyemy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyemy.bean.ManageExample;
import com.wuyemy.dao.ManageMapper;

@Service
public class ManageService {
	@Autowired
	private ManageMapper manageMapper;

	public long countadmin(String username, String password) {
		ManageExample manageExample = new ManageExample();
		
		ManageExample.Criteria  criteria = manageExample.createCriteria();
		criteria.andMpasswordEqualTo(password);
		criteria.andMuserEqualTo(username);
		
		return  manageMapper.countByExample(manageExample);
		
	}
	
	
}
