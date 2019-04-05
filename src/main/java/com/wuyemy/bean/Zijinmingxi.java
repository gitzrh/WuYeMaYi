package com.wuyemy.bean;

import java.math.BigDecimal;

public class Zijinmingxi {
    private Long id;


    private String zhanghao;

    private BigDecimal jinbishu;
    private String jinbileixing;

    private String biandonleix;

    private String time;
    

    public Zijinmingxi(Long id, String zhanghao, BigDecimal jinbishu, String jinbileixing, String biandonleix, String time) {
		super();
		this.id = id;
		this.zhanghao = zhanghao;
		this.jinbishu = jinbishu;
		this.jinbileixing = jinbileixing;
		this.biandonleix = biandonleix;
		this.time = time;
	}

	public Zijinmingxi() {
		super();
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getJinbishu() {
        return jinbishu;
    }

    public void setJinbishu(BigDecimal jinbishu) {
        this.jinbishu = jinbishu;
    }

    public String getZhanghao() {
        return zhanghao;
    }

    public void setZhanghao(String zhanghao) {
        this.zhanghao = zhanghao == null ? null : zhanghao.trim();
    }

    public String getJinbileixing() {
        return jinbileixing;
    }

    public void setJinbileixing(String jinbileixing) {
        this.jinbileixing = jinbileixing == null ? null : jinbileixing.trim();
    }

    public String getBiandonleix() {
        return biandonleix;
    }

    public void setBiandonleix(String biandonleix) {
        this.biandonleix = biandonleix == null ? null : biandonleix.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}