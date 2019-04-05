package com.wuyemy.bean;

import java.util.Date;

public class Yyzxsq {
    private Integer id;

    private String sqzhanghao;

    private String sqname;

    private String sqdianhua;

    private String dizhi;

    private Date sqtime;

    private Date tgtime;

    private String beizhu;

    private Integer zhaungtaiid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSqzhanghao() {
        return sqzhanghao;
    }

    public void setSqzhanghao(String sqzhanghao) {
        this.sqzhanghao = sqzhanghao == null ? null : sqzhanghao.trim();
    }

    public String getSqname() {
        return sqname;
    }

    public void setSqname(String sqname) {
        this.sqname = sqname == null ? null : sqname.trim();
    }

    public String getSqdianhua() {
        return sqdianhua;
    }

    public void setSqdianhua(String sqdianhua) {
        this.sqdianhua = sqdianhua == null ? null : sqdianhua.trim();
    }

    public String getDizhi() {
        return dizhi;
    }

    public void setDizhi(String dizhi) {
        this.dizhi = dizhi == null ? null : dizhi.trim();
    }

    public Date getSqtime() {
        return sqtime;
    }

    public void setSqtime(Date sqtime) {
        this.sqtime = sqtime;
    }

    public Date getTgtime() {
        return tgtime;
    }

    public void setTgtime(Date tgtime) {
        this.tgtime = tgtime;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public Integer getZhaungtaiid() {
        return zhaungtaiid;
    }

    public void setZhaungtaiid(Integer zhaungtaiid) {
        this.zhaungtaiid = zhaungtaiid;
    }
}