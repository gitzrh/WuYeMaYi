package com.wuyemy.bean;

import java.math.BigDecimal;

public class Jifen {
    private Integer jifenid;

    private String zhanghao;

    private BigDecimal fxjf;

    private BigDecimal gcjf;

    private BigDecimal ztjf;

    private BigDecimal chjf;
    
    

    public Jifen() {
		super();
	}
    

	public Jifen(String zhanghao, BigDecimal fxjf, BigDecimal gcjf, BigDecimal ztjf, BigDecimal chjf) {
		super();
		this.zhanghao = zhanghao;
		this.fxjf = fxjf;
		this.gcjf = gcjf;
		this.ztjf = ztjf;
		this.chjf = chjf;
	}


	public Jifen(Integer jifenid, String zhanghao, BigDecimal fxjf, BigDecimal gcjf, BigDecimal ztjf, BigDecimal chjf) {
		super();
		this.jifenid = jifenid;
		this.zhanghao = zhanghao;
		this.fxjf = fxjf;
		this.gcjf = gcjf;
		this.ztjf = ztjf;
		this.chjf = chjf;
	}


	public Integer getJifenid() {
        return jifenid;
    }

    public void setJifenid(Integer jifenid) {
        this.jifenid = jifenid;
    }

    public String getZhanghao() {
        return zhanghao;
    }

    public void setZhanghao(String zhanghao) {
        this.zhanghao = zhanghao == null ? null : zhanghao.trim();
    }

    public BigDecimal getFxjf() {
        return fxjf;
    }

    public void setFxjf(BigDecimal fxjf) {
        this.fxjf = fxjf;
    }

    public BigDecimal getGcjf() {
        return gcjf;
    }

    public void setGcjf(BigDecimal gcjf) {
        this.gcjf = gcjf;
    }

    public BigDecimal getZtjf() {
        return ztjf;
    }

    public void setZtjf(BigDecimal ztjf) {
        this.ztjf = ztjf;
    }

    public BigDecimal getChjf() {
        return chjf;
    }

    public void setChjf(BigDecimal chjf) {
        this.chjf = chjf;
    }
}