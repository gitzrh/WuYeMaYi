package com.wuyemy.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyemy.bean.Kuser;
import com.wuyemy.bean.KuserExample;
import com.wuyemy.bean.KuserExample.Criteria;
import com.wuyemy.bean.Lunbotu;
import com.wuyemy.bean.Sdjilu;
import com.wuyemy.bean.Xiaozu;
import com.wuyemy.bean.XiaozuExample;
import com.wuyemy.bean.Yyzx;
import com.wuyemy.bean.YyzxExample;
import com.wuyemy.bean.Yyzxsq;
import com.wuyemy.bean.YyzxsqExample;
import com.wuyemy.bean.Zixunguanli;
import com.wuyemy.dao.KuserMapper;
import com.wuyemy.dao.LunbotuMapper;
import com.wuyemy.dao.SdjiluMapper;
import com.wuyemy.dao.XiaozuMapper;
import com.wuyemy.dao.YyzxMapper;
import com.wuyemy.dao.YyzxsqMapper;
import com.wuyemy.dao.ZixunguanliMapper;
import com.wuyemy.until.DateToString;

@Service
public class TuanduiService {
	
	@Autowired
	private KuserMapper kuserMapper;
	@Autowired
	private YyzxsqMapper yyzxsqMapper;
	@Autowired
	private YyzxMapper yyzxMapper;
	@Autowired
	private XiaozuMapper xiaozuMapper;
	@Autowired
	private LunbotuMapper lunbotuMapper;
	@Autowired
	private ZixunguanliMapper zixunguanliMapper;
	@Autowired
	private SdjiluMapper sdjiluMapper;
	
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

	public void sqyyzx(String zhanghao, String name, String phone, String address, String remark) {
		Yyzxsq yyzxsq = new Yyzxsq(null, zhanghao, name, phone, address, DateToString.DateToStr(new Date()), null, remark, 2);
		yyzxsqMapper.insertSelective(yyzxsq);
	}

	public Yyzx yyzx(String zhanghao) {
		YyzxExample example = new YyzxExample();
		com.wuyemy.bean.YyzxExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andYyzhanghaoEqualTo(zhanghao);
		List<Yyzx> selectByExample = yyzxMapper.selectByExample(example);
		
		for (Yyzx yyzx : selectByExample) {
			return yyzx;
		}
		
		return null;
	}

	public void deletesq(String zhanghao) {
		YyzxsqExample example = new YyzxsqExample();
		com.wuyemy.bean.YyzxsqExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andSqzhanghaoEqualTo(zhanghao);
		yyzxsqMapper.deleteByExample(example);
	}

	public List<Xiaozu> jggl(String zhanghao) {
		XiaozuExample example = new XiaozuExample();
		com.wuyemy.bean.XiaozuExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andZhanghaoEqualTo(zhanghao);
		List<Xiaozu> selectByExample = xiaozuMapper.selectByExample(example);
		
		for (Xiaozu xiaozu : selectByExample) {
			int i = xiaozu.getZid();
			XiaozuExample example2 = new XiaozuExample();
			com.wuyemy.bean.XiaozuExample.Criteria createCriteria2 = example2.createCriteria();
			createCriteria2.andZidEqualTo(i);
			List<Xiaozu> selectByExample2 = xiaozuMapper.selectByExample(example2);
			return selectByExample2;
		}
		
		return null;
	}

	public Kuser kuser(String zhanghao) {
		KuserExample example = new KuserExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andZhanghaoEqualTo(zhanghao);
		List<Kuser> selectByExample = kuserMapper.selectByExample(example);
		
		for (Kuser kuser : selectByExample) {
			return kuser;
		}
		
		return null;
	}

	public String tname(String tzhanghao) {
		KuserExample example = new KuserExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andZhanghaoEqualTo(tzhanghao);
		List<Kuser> selectByExample = kuserMapper.selectByExample(example);
		
		for (Kuser kuser : selectByExample) {
			return kuser.getZhenshiname();
		}
		
		return null;
	}

	public List<Lunbotu> sylbt() {
		List<Lunbotu> selectByExample = lunbotuMapper.selectByExample(null);
		return selectByExample;
	}

	public List<Zixunguanli> zixungl() {
		List<Zixunguanli> selectByExample = zixunguanliMapper.selectByExample(null);
		return selectByExample;
	}

	public Zixunguanli seletezx(Integer id) {
		Zixunguanli selectByPrimaryKey = zixunguanliMapper.selectByPrimaryKey(id);
		return selectByPrimaryKey;
	}

	public void indexzx(String head, String text) {
		Zixunguanli zixunguanli = new Zixunguanli(null, head, text);
		zixunguanliMapper.insertSelective(zixunguanli);
	}

	public void deletezu(Integer id) {
		zixunguanliMapper.deleteByPrimaryKey(id);
	}

	public Zixunguanli zxxq(Integer id) {
		Zixunguanli selectByPrimaryKey = zixunguanliMapper.selectByPrimaryKey(id);
		return selectByPrimaryKey;
	}

	public void logip(String ips) {
		Sdjilu sdjilu = new Sdjilu(null, ips, DateToString.DateToStr(new Date()), null, null, null, null, null);
		sdjiluMapper.insertSelective(sdjilu);
		
	}

}
