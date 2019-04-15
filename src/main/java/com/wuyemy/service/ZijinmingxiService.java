package com.wuyemy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyemy.bean.Zijinmingxi;
import com.wuyemy.bean.ZijinmingxiExample;
import com.wuyemy.dao.ZijinmingxiMapper;

@Service
public class ZijinmingxiService {
	@Autowired
	private ZijinmingxiMapper zijinmingxiMapper;
	
	public List<Zijinmingxi> getallZJMx() {
		String leix = "扣除";
		ZijinmingxiExample example = new ZijinmingxiExample();
		ZijinmingxiExample.Criteria criteria = example.createCriteria();
		criteria.andBiandonleixLike(leix);
		return zijinmingxiMapper.selectByExample(example);
	}

	
}
