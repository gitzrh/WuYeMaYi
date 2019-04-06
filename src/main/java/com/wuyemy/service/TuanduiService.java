package com.wuyemy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyemy.bean.Kuser;
import com.wuyemy.bean.KuserExample;
import com.wuyemy.bean.KuserExample.Criteria;
import com.wuyemy.dao.KuserMapper;

@Service
public class TuanduiService {
	
	@Autowired
	private KuserMapper kuserMapper;

	public String phone(String zhanghao) {
		KuserExample example = new KuserExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andZhanghaoEqualTo(zhanghao);
		List<Kuser> selectByExample = kuserMapper.selectByExample(example);
		
		for (Kuser kuser : selectByExample) {
			String zhenshishoujihao = kuser.getZhenshishoujihao();
			return zhenshishoujihao;
		}
		
		return null;
	}

	public void updatepass(String zhanghao, String password) {
		KuserExample example = new KuserExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andZhanghaoEqualTo(zhanghao);
		Kuser kuser = new Kuser();
		kuser.setKpassword(password);
		kuserMapper.updateByExampleSelective(kuser, example);
	}

	public long kphon(String phone) {
		KuserExample example = new KuserExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andZhenshishoujihaoEqualTo(phone);
		long countByExample = kuserMapper.countByExample(example);
		return countByExample;
	}

	public void forgetpass(String phone, String password) {
		KuserExample example = new KuserExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andZhenshishoujihaoEqualTo(phone);
		Kuser kuser = new Kuser();
		kuser.setKpassword(password);
		kuserMapper.updateByExampleSelective(kuser, example);
	}

}
