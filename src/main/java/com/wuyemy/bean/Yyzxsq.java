package com.wuyemy.bean;


public class Yyzxsq {
    private Integer id;

    private String sqzhanghao;

    private String sqname;

    private String sqdianhua;

    private String dizhi;

    private String sqtime;

    private String tgtime;

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

    public String getSqtime() {
        return sqtime;
    }

    public void setSqtime(String sqtime) {
        this.sqtime = sqtime;
    }

    public String getTgtime() {
        return tgtime;
    }

    public void setTgtime(String tgtime) {
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

	public Yyzxsq(Integer id, String sqzhanghao, String sqname, String sqdianhua, String dizhi, String sqtime,
			String tgtime, String beizhu, Integer zhaungtaiid) {
		super();
		this.id = id;
		this.sqzhanghao = sqzhanghao;
		this.sqname = sqname;
		this.sqdianhua = sqdianhua;
		this.dizhi = dizhi;
		this.sqtime = sqtime;
		this.tgtime = tgtime;
		this.beizhu = beizhu;
		this.zhaungtaiid = zhaungtaiid;
	}

	public Yyzxsq() {
		super();
	}

	
	
    
    
}