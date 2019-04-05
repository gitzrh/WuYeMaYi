package com.wuyemy.bean;

public class Zhuangtai {
    private Integer zhuangtaiid;

    private String zhuangtai;

    public Integer getZhuangtaiid() {
        return zhuangtaiid;
    }

    public void setZhuangtaiid(Integer zhuangtaiid) {
        this.zhuangtaiid = zhuangtaiid;
    }

    public String getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai == null ? null : zhuangtai.trim();
    }
}