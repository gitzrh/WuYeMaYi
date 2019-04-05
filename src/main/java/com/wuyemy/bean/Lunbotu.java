package com.wuyemy.bean;

public class Lunbotu {
    private Integer id;

    private String image;

    private Integer shunxu;

    private Integer zhuangtaiid;

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

    public Integer getZhuangtaiid() {
        return zhuangtaiid;
    }

    public void setZhuangtaiid(Integer zhuangtaiid) {
        this.zhuangtaiid = zhuangtaiid;
    }
}