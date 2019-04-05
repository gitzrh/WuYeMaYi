package com.wuyemy.service;

import java.io.File;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyemy.bean.Canshu;
import com.wuyemy.bean.Jifen;
import com.wuyemy.bean.JifenExample;
import com.wuyemy.bean.Kuser;
import com.wuyemy.bean.KuserExample;
import com.wuyemy.bean.Tixian;
import com.wuyemy.bean.JifenExample.Criteria;
import com.wuyemy.dao.CanshuMapper;
import com.wuyemy.dao.JifenMapper;
import com.wuyemy.dao.KuserMapper;
import com.wuyemy.dao.TixianMapper;
import com.wuyemy.until.DateToString;
import com.wuyemy.until.EncodingTool;

@Service
public class IndexService {
	
	@Autowired
	private JifenMapper jifenMapper;
	@Autowired
	private KuserMapper kuserMapper;
	@Autowired
	private CanshuMapper canshuMapper;
	@Autowired
	private TixianMapper tixianMapper;
	
	private DateToString dateToStr;
	/**
	 * 获取金币信息
	 * @param zhanghao
	 * @return
	 */
	public Jifen jinbi(String zhanghao) {
		JifenExample example = new JifenExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andZhanghaoEqualTo(zhanghao);
		
		List<Jifen> selectByExample = jifenMapper.selectByExample(example);
		
		for (Jifen jifen : selectByExample) {
			return jifen;
		}
		
		return null;
	}
	
	/**
	 * 获取个人信息
	 * @param zhanghao
	 * @return
	 */
	public Kuser user(String zhanghao) {
		
		KuserExample example = new KuserExample();
		com.wuyemy.bean.KuserExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andZhanghaoEqualTo(zhanghao);
		
		List<Kuser> selectByExample = kuserMapper.selectByExample(example);
		
		for (Kuser kuser : selectByExample) {
			return kuser;
		}
		
		return null;
	}

	/**
	 * 修改客户基本信息
	 * @param phone
	 * @param card
	 * @param zhanghao 
	 * @return
	 */
	public void oneUser(String zhanghao, String phone, String card) {
		
		KuserExample example = new KuserExample();
		com.wuyemy.bean.KuserExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andZhanghaoEqualTo(zhanghao);
		Kuser kuser = new Kuser();
		kuser.setShenfenid(card);
		kuser.setZhenshishoujihao(phone);
		
		kuserMapper.updateByExampleSelective(kuser, example);
		
	}

	public void TwoUser(String zhanghao, String phone) {
		KuserExample example = new KuserExample();
		com.wuyemy.bean.KuserExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andZhanghaoEqualTo(zhanghao);
		Kuser kuser = new Kuser();
		kuser.setZhenshishoujihao(phone);
		
		kuserMapper.updateByExampleSelective(kuser, example);
		
	}

	public void ThreeUser(String zhanghao, String card) {
		KuserExample example = new KuserExample();
		com.wuyemy.bean.KuserExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andZhanghaoEqualTo(zhanghao);
		Kuser kuser = new Kuser();
		kuser.setShenfenid(card);
		
		kuserMapper.updateByExampleSelective(kuser, example);
	}

	public void OneYh(String realname, String bankname, String bankcard, String kaihuaddress, String alipay,
			String zhanghao) {
		KuserExample example = new KuserExample();
		com.wuyemy.bean.KuserExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andZhanghaoEqualTo(zhanghao);
		Kuser kuser = new Kuser();
		kuser.setZhenshiname(realname);
		kuser.setYinhangname(bankname);
		kuser.setYinhangkajao(bankcard);
		kuser.setKaihudizhi(kaihuaddress);
		kuser.setZhifubaoid(alipay);
		
		kuserMapper.updateByExampleSelective(kuser, example);
	}

	public void Shanchue(String zhanhao, String realPath) {
		File file = new File(realPath+"add/"+zhanhao+".png");
		file.delete();
	}

	public Kuser zijintixian(String zhanhao) {
		
		KuserExample example = new KuserExample();
		com.wuyemy.bean.KuserExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andZhanghaoEqualTo(zhanhao);
		
		List<Kuser> selectByExample = kuserMapper.selectByExample(example);
		
		for (Kuser kuser : selectByExample) {
			return kuser;
		}
		
		return null;
	}

	public Canshu canshu1(Integer i) {
		Canshu canshu = canshuMapper.selectByPrimaryKey(i);
		return canshu;
	}

	public Canshu canshu2(Integer i) {
		Canshu canshu = canshuMapper.selectByPrimaryKey(i);
		return canshu;
	}

	public Canshu canshu3(Integer i) {
		Canshu canshu = canshuMapper.selectByPrimaryKey(i);
		return canshu;
	}

	public BigDecimal hqgcjb(String zhanhao) {
		JifenExample example = new JifenExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andZhanghaoEqualTo(zhanhao);
		List<Jifen> selectByExample = jifenMapper.selectByExample(example);
		for (Jifen jifen : selectByExample) {
			return jifen.getGcjf();
		}
		return null;
	}

	public void sygc(String zhanhao, BigDecimal sygcjb, BigDecimal gcjf, String realname1, String bankaddress1, String bankname1, String bankcard1) {
		//修改金币
		JifenExample example = new JifenExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andZhanghaoEqualTo(zhanhao);
		Jifen jifen = new Jifen();
		jifen.setGcjf(sygcjb);
		jifenMapper.updateByExampleSelective(jifen, example);
		
		//获得手续费
		Canshu canshu = canshuMapper.selectByPrimaryKey(6);
		BigDecimal value = canshu.getValue();
		
		//添加提现记录
		BigDecimal shouxufei = gcjf.multiply(value);
		BigDecimal shijidaozhang = gcjf.subtract(shouxufei);
		
		Tixian tixian = new Tixian(null, zhanhao, "购车金币", gcjf, shouxufei, shijidaozhang, dateToStr.DateToStr(new Date()), null, null, realname1, bankname1, bankaddress1, bankcard1, 5);
		tixianMapper.insertSelective(tixian);
	}

	public BigDecimal hqcjjb(String zhanhao) {
		JifenExample example = new JifenExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andZhanghaoEqualTo(zhanhao);
		List<Jifen> selectByExample = jifenMapper.selectByExample(example);
		
		for (Jifen jifen : selectByExample) {
			return jifen.getChjf();
		}
		
		return null;
	}

	public void sycj(String zhanhao, BigDecimal sycjjb, BigDecimal cjjf, String realname2, String bankaddress2,
			String bankname2, String bankcard2) {
		//修改金币
		JifenExample example = new JifenExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andZhanghaoEqualTo(zhanhao);
		Jifen jifen = new Jifen();
		jifen.setChjf(sycjjb);
		jifenMapper.updateByExampleSelective(jifen, example);
		
		//获得手续费
		Canshu canshu = canshuMapper.selectByPrimaryKey(5);
		BigDecimal value = canshu.getValue();
		
		//添加提现记录
		BigDecimal shouxufei = cjjf.multiply(value);
		BigDecimal shijidaozhang = cjjf.subtract(shouxufei);
		
		Tixian tixian = new Tixian(null, zhanhao, "出局金币", cjjf, shouxufei, shijidaozhang, dateToStr.DateToStr(new Date()), null, null, realname2, bankname2, bankaddress2, bankcard2, 5);
		tixianMapper.insertSelective(tixian);
	}

	public BigDecimal hqfxjb(String zhanhao) {
		JifenExample example = new JifenExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andZhanghaoEqualTo(zhanhao);
		List<Jifen> selectByExample = jifenMapper.selectByExample(example);
		
		for (Jifen jifen : selectByExample) {
			return jifen.getFxjf();
		}
		
		return null;
	}

	public void syfx(String zhanhao, BigDecimal syfxjb, BigDecimal fxjf, String realname3, String bankaddress3,
			String bankname3, String bankcard3) {
		//修改金币
		JifenExample example = new JifenExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andZhanghaoEqualTo(zhanhao);
		Jifen jifen = new Jifen();
		jifen.setFxjf(syfxjb);
		jifenMapper.updateByExampleSelective(jifen, example);
		
		//获得手续费
		Canshu canshu = canshuMapper.selectByPrimaryKey(7);
		BigDecimal value = canshu.getValue();
		
		//添加提现记录
		BigDecimal shouxufei = fxjf.multiply(value);
		BigDecimal shijidaozhang = fxjf.subtract(shouxufei);
		
		Tixian tixian = new Tixian(null, zhanhao, "分享金币", fxjf, shouxufei, shijidaozhang, dateToStr.DateToStr(new Date()), null, null, realname3, bankname3, bankaddress3, bankcard3, 5);
		tixianMapper.insertSelective(tixian);
	}


}
