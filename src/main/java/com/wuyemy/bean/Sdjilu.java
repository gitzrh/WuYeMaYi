package com.wuyemy.bean;

import java.util.Date;

public class Sdjilu {
    private Integer id;

    private String zhanghao;

    private String name;

    private String lianhua;

    private Integer jinbileixing;

    private Integer biandonglx;

    private Date biandongtime;

    private String beizhu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZhanghao() {
        return zhanghao;
    }

    public void setZhanghao(String zhanghao) {
        this.zhanghao = zhanghao == null ? null : zhanghao.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLianhua() {
        return lianhua;
    }

    public void setLianhua(String lianhua) {
        this.lianhua = lianhua == null ? null : lianhua.trim();
    }

    public Integer getJinbileixing() {
        return jinbileixing;
    }

    public void setJinbileixing(Integer jinbileixing) {
        this.jinbileixing = jinbileixing;
    }

    public Integer getBiandonglx() {
        return biandonglx;
    }

    public void setBiandonglx(Integer biandonglx) {
        this.biandonglx = biandonglx;
    }

    public Date getBiandongtime() {
        return biandongtime;
    }

    public void setBiandongtime(Date biandongtime) {
        this.biandongtime = biandongtime;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

	public Sdjilu(Integer id, String zhanghao, String name, String lianhua, Integer jinbileixing, Integer biandonglx,
			Date biandongtime, String beizhu) {
		super();
		this.id = id;
		this.zhanghao = zhanghao;
		this.name = name;
		this.lianhua = lianhua;
		this.jinbileixing = jinbileixing;
		this.biandonglx = biandonglx;
		this.biandongtime = biandongtime;
		this.beizhu = beizhu;
	}

	public Sdjilu() {
		super();
	}
    
    
}