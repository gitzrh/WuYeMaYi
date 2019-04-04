package com.wuyemy.bean;

public class Xiaozu {
    private Integer zid;

    private Integer zidd;

    private String zhanghao;

    private Integer suozailunshu;
    
    
    public Xiaozu() {
		super();
	}

	public Xiaozu(Integer zid, Integer zidd, String zhanghao,Integer suozailunshu) {
		super();
		this.zid = zid;
		this.zidd = zidd;
		this.zhanghao = zhanghao;
		this.suozailunshu = suozailunshu;
	}

	
	
	public Integer getSuozailunshu() {
		return suozailunshu;
	}

	public void setSuozailunshu(Integer suozailunshu) {
		this.suozailunshu = suozailunshu;
	}

	public Integer getZid() {
        return zid;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public Integer getZidd() {
        return zidd;
    }

    public void setZidd(Integer zidd) {
        this.zidd = zidd;
    }

    public String getZhanghao() {
        return zhanghao;
    }

    public void setZhanghao(String zhanghao) {
        this.zhanghao = zhanghao == null ? null : zhanghao.trim();
    }
}