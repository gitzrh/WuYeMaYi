package com.wuyemy.until;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {

	public static String DateToStr(Date date) { 
		  
		   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		   String str = format.format(date); 
		   return str; 
		} 

}
