package com.wuyemy.until;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class FileUpUtil {
	
	/**
	 * 上传一个文件或图片
	 * 上传多个文件或图片上传在项目路径下的img文件夹在
	 * ！！！！！！重新部署项目实效,因为文件夹被删除
	 * @param file
	 * @param request
	 * @return
	 */
	public static String upfile(CommonsMultipartFile file,HttpServletRequest request){
		 // 获得项目的路径  
        ServletContext sc = request.getSession().getServletContext();  
        // 上传位置  
        String path = sc.getRealPath("/Picture") + File.separatorChar; // 设定文件保存的目录  
        File f = new File(path);  
        if (!f.exists())  
            f.mkdirs();  
            // 获得原始文件名  
            String fileName = file.getOriginalFilename();  
            System.out.println("原始文件名:" + fileName);  
            // 新文件名  
            String newFileName = UUID.randomUUID() + fileName;  
            if (!file.isEmpty()) {  
                try {  
                    FileOutputStream fos = new FileOutputStream(path  
                            + newFileName);  
                    InputStream in = file.getInputStream();  
                    int b = 0;  
                    while ((b = in.read()) != -1) {  
                        fos.write(b);  
                    }  
                    fos.close();  
                    in.close();  
                } catch (Exception e) {  
                    e.printStackTrace();  
                }  
            }  
            System.out.println("上传图片到:" + path + newFileName);  
            return "Picture/"+newFileName;
	}
	
	

}
