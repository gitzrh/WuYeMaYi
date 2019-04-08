package com.wuyemy.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.wuyemy.service.FileService;
import com.wuyemy.service.Thumbnail;
import com.wuyemy.service.Upload;

@Controller
public class FileController {
	
	@Autowired    
    private Upload upload;	
	@Autowired
    private Thumbnail thumbnail;
	@Autowired
	private FileService fileService;
	
	//文件上传并生成缩略图
	@RequestMapping(value="/thumb",method=RequestMethod.POST)
	@ResponseBody
	public void GenerateImage(@RequestParam("image")CommonsMultipartFile file,
			HttpServletRequest request,HttpServletResponse response) throws IOException{			
		//根据相对路径获取绝对路径，图片上传后位于元数据中
		String realUploadPath=request.getServletContext().getRealPath("/")+"Picture";		
		//获取上传后原图的相对地址
		String imageUrl=upload.uploadImage(file, realUploadPath);
		//获取生成的缩略图的相对地址
		String thumbImageUrl=thumbnail.generateThumbnail(file, realUploadPath);	
		int shunxu = 1;
		fileService.sctpdz(imageUrl,thumbImageUrl,shunxu);
		
	}
	
	@RequestMapping("/deletetp")
	@ResponseBody
	public Msg Deletetp(@RequestParam("id")Integer id){
		fileService.deletetp(id);
		return Msg.success();
	}
	
	
}
