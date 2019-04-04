package com.wuyemy.test;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wuyemy.bean.Kuser;
import com.wuyemy.dao.KuserMapper;
import com.wuyemy.until.DateToString;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class KuserMapperTest {
	@Autowired
	private KuserMapper kuserMapper;
	
	private DateToString dateToStr;
	
	@Test
	public void insertTest(){
		kuserMapper.insertSelective(new Kuser("15800012111","张三",null,null,null,dateToStr.DateToStr(new Date()),1));
		
	}
	@Test
	public void deleteTest(){
		kuserMapper.deleteByPrimaryKey(7);
		
		
	}
	@Test	
	public void getKuserWithzTest(){
		List<Kuser> exmp = kuserMapper.selectByExampleWithZhuangTai(null);
		for(Kuser kuser : exmp){
			System.err.println(kuser);
		}
	}	
	
	
	@Test
	public void test01(){
		
		long i = kuserMapper.countByExample(null);
		if(i<11){
			kuserMapper.insertSelective(new Kuser("15800012111","张三",null,null,null,dateToStr.DateToStr(new Date()),1));
		}else if(i==11){
			
			System.out.println(i);
		}
		
	}
}
