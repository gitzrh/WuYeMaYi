package com.wuyemy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyemy.bean.Lunbotu;
import com.wuyemy.dao.LunbotuMapper;

@Service
public class FileService {
	
	@Autowired
	private LunbotuMapper lunbotuMapper;

	public void sctpdz(String imageUrl, String thumbImageUrl, Integer shunxu) {
		Lunbotu lunbotu = new Lunbotu(null, imageUrl, shunxu , thumbImageUrl);
		lunbotuMapper.insertSelective(lunbotu);
		
	}

	public void deletetp(Integer id) {
		lunbotuMapper.deleteByPrimaryKey(id);
	}

}
