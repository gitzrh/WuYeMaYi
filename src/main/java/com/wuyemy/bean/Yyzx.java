package com.wuyemy.bean;

import java.math.BigDecimal;

public class Yyzx {
    private Integer yyzxid;

    private String yyzhanghao;

    private String yyname;

    private String yybianhao;

    private Integer yyzxlvid;

    private BigDecimal yyjinbi;

    private Integer yynum;

    private Integer ztnum;

    private String dizhi;

    public Integer getYyzxid() {
        return yyzxid;
    }

    public void setYyzxid(Integer yyzxid) {
        this.yyzxid = yyzxid;
    }

    public String getYyzhanghao() {
        return yyzhanghao;
    }

    public void setYyzhanghao(String yyzhanghao) {
        this.yyzhanghao = yyzhanghao == null ? null : yyzhanghao.trim();
    }

    public String getYyname() {
        return yyname;
    }

    public void setYyname(String yyname) {
        this.yyname = yyname == null ? null : yyname.trim();
    }

    public String getYybianhao() {
        return yybianhao;
    }

    public void setYybianhao(String yybianhao) {
        this.yybianhao = yybianhao == null ? null : yybianhao.trim();
    }

    public Integer getYyzxlvid() {
        return yyzxlvid;
    }

    public void setYyzxlvid(Integer yyzxlvid) {
        this.yyzxlvid = yyzxlvid;
    }

    public BigDecimal getYyjinbi() {
        return yyjinbi;
    }

    public void setYyjinbi(BigDecimal yyjinbi) {
        this.yyjinbi = yyjinbi;
    }

    public Integer getYynum() {
        return yynum;
    }

    public void setYynum(Integer yynum) {
        this.yynum = yynum;
    }

    public Integer getZtnum() {
        return ztnum;
    }

    public void setZtnum(Integer ztnum) {
        this.ztnum = ztnum;
    }

    public String getDizhi() {
        return dizhi;
    }

    public void setDizhi(String dizhi) {
        this.dizhi = dizhi == null ? null : dizhi.trim();
    }

	public Yyzx(Integer yyzxid, String yyzhanghao, String yyname, String yybianhao, Integer yyzxlvid,
			BigDecimal yyjinbi, Integer yynum, Integer ztnum, String dizhi) {
		super();
		this.yyzxid = yyzxid;
		this.yyzhanghao = yyzhanghao;
		this.yyname = yyname;
		this.yybianhao = yybianhao;
		this.yyzxlvid = yyzxlvid;
		this.yyjinbi = yyjinbi;
		this.yynum = yynum;
		this.ztnum = ztnum;
		this.dizhi = dizhi;
	}

	public Yyzx() {
		super();
	}
    
    
}