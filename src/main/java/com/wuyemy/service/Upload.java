package com.wuyemy.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Service
public class Upload {
	
	/*
	 * 上传图片并返回图片的相对地址
	 */	
	public String uploadImage(CommonsMultipartFile file,String realUploadPath) throws IOException{	
		
		//创建输入流
		InputStream inputStream=file.getInputStream();
		//生成输出地址URL
		String outputPath = realUploadPath+"/"+file.getOriginalFilename();
		//创建输出流
		OutputStream outputStream=new FileOutputStream(outputPath);		
		//设置缓冲区
		byte[] buffer=new byte[1024];
		
		//输入流读入缓冲区，输出流从缓冲区写出
		while((inputStream.read(buffer))>0)
		{
		  outputStream.write(buffer);
		}
		outputStream.close();
		
		//返回原图上传后的相对地址
		return "Picture/"+file.getOriginalFilename();
	}

}
