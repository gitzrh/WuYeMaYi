package com.wuyemy.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Tixian {
    private Integer id;

    private String zhanghao;

    private String jinbileixing;

    private BigDecimal txjibi;

    private BigDecimal shouxufei;

    private BigDecimal shijidaozhang;

    private String tixiantime;

    private String jujuetime;

    private String tguotime;

    private String username;

    private String yinhangname;

    private String kaihudizhi;

    private String yinhangkaid;

    private Integer zhuangtaiid;
    

    @Override
	public String toString() {
		return "Tixian [id=" + id + ", zhanghao=" + zhanghao + ", jinbileixing=" + jinbileixing + ", txjibi=" + txjibi
				+ ", shouxufei=" + shouxufei + ", shijidaozhang=" + shijidaozhang + ", tixiantime=" + tixiantime
				+ ", jujuetime=" + jujuetime + ", tguotime=" + tguotime + ", username=" + username + ", yinhangname="
				+ yinhangname + ", kaihudizhi=" + kaihudizhi + ", yinhangkaid=" + yinhangkaid + ", zhuangtaiid="
				+ zhuangtaiid + "]";
	}

	public Tixian() {
		super();
	}

	public Tixian(Integer id, String zhanghao, String jinbileixing, BigDecimal txjibi, BigDecimal shouxufei,
			BigDecimal shijidaozhang, String tixiantime, String jujuetime, String tguotime, String username,
			String yinhangname, String kaihudizhi, String yinhangkaid, Integer zhuangtaiid) {
		super();
		this.id = id;
		this.zhanghao = zhanghao;
		this.jinbileixing = jinbileixing;
		this.txjibi = txjibi;
		this.shouxufei = shouxufei;
		this.shijidaozhang = shijidaozhang;
		this.tixiantime = tixiantime;
		this.jujuetime = jujuetime;
		this.tguotime = tguotime;
		this.username = username;
		this.yinhangname = yinhangname;
		this.kaihudizhi = kaihudizhi;
		this.yinhangkaid = yinhangkaid;
		this.zhuangtaiid = zhuangtaiid;
	}

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

    public String getJinbileixing() {
        return jinbileixing;
    }

    public void setJinbileixing(String jinbileixing) {
        this.jinbileixing = jinbileixing == null ? null : jinbileixing.trim();
    }

    public BigDecimal getTxjibi() {
        return txjibi;
    }

    public void setTxjibi(BigDecimal txjibi) {
        this.txjibi = txjibi;
    }

    public BigDecimal getShouxufei() {
        return shouxufei;
    }

    public void setShouxufei(BigDecimal shouxufei) {
        this.shouxufei = shouxufei;
    }

    public BigDecimal getShijidaozhang() {
        return shijidaozhang;
    }

    public void setShijidaozhang(BigDecimal shijidaozhang) {
        this.shijidaozhang = shijidaozhang;
    }

    public String getTixiantime() {
        return tixiantime;
    }

    public void setTixiantime(String tixiantime) {
        this.tixiantime = tixiantime;
    }

    public String getJujuetime() {
        return jujuetime;
    }

    public void setJujuetime(String jujuetime) {
        this.jujuetime = jujuetime;
    }

    public String getTguotime() {
        return tguotime;
    }

    public void setTguotime(String tguotime) {
        this.tguotime = tguotime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getYinhangname() {
        return yinhangname;
    }

    public void setYinhangname(String yinhangname) {
        this.yinhangname = yinhangname == null ? null : yinhangname.trim();
    }

    public String getKaihudizhi() {
        return kaihudizhi;
    }

    public void setKaihudizhi(String kaihudizhi) {
        this.kaihudizhi = kaihudizhi == null ? null : kaihudizhi.trim();
    }

    public String getYinhangkaid() {
        return yinhangkaid;
    }

    public void setYinhangkaid(String yinhangkaid) {
        this.yinhangkaid = yinhangkaid == null ? null : yinhangkaid.trim();
    }

    public Integer getZhuangtaiid() {
        return zhuangtaiid;
    }

    public void setZhuangtaiid(Integer zhuangtaiid) {
        this.zhuangtaiid = zhuangtaiid;
    }
}