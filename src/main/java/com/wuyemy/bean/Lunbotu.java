package com.wuyemy.bean;

public class Lunbotu {
    private Integer id;

    private String image;

    private Integer shunxu;

    private String zhuangtaiid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Integer getShunxu() {
        return shunxu;
    }

    public void setShunxu(Integer shunxu) {
        this.shunxu = shunxu;
    }

    public String getZhuangtaiid() {
        return zhuangtaiid;
    }

    public void setZhuangtaiid(String zhuangtaiid) {
        this.zhuangtaiid = zhuangtaiid;
    }

	public Lunbotu(Integer id, String image, Integer shunxu, String zhuangtaiid) {
		super();
		this.id = id;
		this.image = image;
		this.shunxu = shunxu;
		this.zhuangtaiid = zhuangtaiid;
	}

    public Lunbotu() {
		// TODO Auto-generated constructor stub
	}
    
}