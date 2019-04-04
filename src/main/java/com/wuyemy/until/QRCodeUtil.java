package com.wuyemy.until;

import java.io.File;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public class QRCodeUtil  {
	
	public void QRCode(String i,HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		MultiFormatWriter writer = new MultiFormatWriter();
		String contents = "http://wuye.krylai.com/?zhanghao="+i;
		int width = 300;
		int height = 300;
		HashMap<EncodeHintType, Object> hints = new HashMap<>();
		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
		BitMatrix bitMatrix = writer.encode(contents, BarcodeFormat.QR_CODE, width, height, hints);
		
        String realPath = request.getSession().getServletContext().getRealPath("/");
        
		MatrixToImageWriter.writeToPath(bitMatrix, "png", new File(realPath+"add/"+i+".png").toPath());
	}

}
