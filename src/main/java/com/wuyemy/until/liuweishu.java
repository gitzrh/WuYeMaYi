package com.wuyemy.until;

import java.util.Random;

public class liuweishu {
	
	public static String yanzhnegma() {
		String code = "";
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
 
			int r = random.nextInt(10); //每次随机出一个数字（0-9）
 
			code = code + r;  //把每次随机出的数字拼在一起
 
		}
		return code;
	}

}
