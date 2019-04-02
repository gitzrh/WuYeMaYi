package com.wuyemy.bean;

public class Xiaozu {
    private Integer zid;

    private Integer zidd;

    private String zhanghao;

    
    
    public Xiaozu() {
		super();
	}

	public Xiaozu(Integer zid, Integer zidd, String zhanghao) {
		super();
		this.zid = zid;
		this.zidd = zidd;
		this.zhanghao = zhanghao;
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