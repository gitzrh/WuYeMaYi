package com.wuyemy.bean;

import java.math.BigDecimal;

public class Yyzxlvcanshu {
    private Integer id;

    private String lvname;

    private Integer fulijin;

    private Integer zongnum;

    private Integer zhituinum;

    private BigDecimal zhekoubili;
    
    

    public Yyzxlvcanshu( String lvname, Integer fulijin, Integer zongnum, Integer zhituinum,
			BigDecimal zhekoubili) {
		super();
	
		this.lvname = lvname;
		this.fulijin = fulijin;
		this.zongnum = zongnum;
		this.zhituinum = zhituinum;
		this.zhekoubili = zhekoubili;
	}

	public Yyzxlvcanshu() {
		super();
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLvname() {
        return lvname;
    }

    public void setLvname(String lvname) {
        this.lvname = lvname == null ? null : lvname.trim();
    }

    public Integer getFulijin() {
        return fulijin;
    }

    public void setFulijin(Integer fulijin) {
        this.fulijin = fulijin;
    }

    public Integer getZongnum() {
        return zongnum;
    }

    public void setZongnum(Integer zongnum) {
        this.zongnum = zongnum;
    }

    public Integer getZhituinum() {
        return zhituinum;
    }

    public void setZhituinum(Integer zhituinum) {
        this.zhituinum = zhituinum;
    }

    public BigDecimal getZhekoubili() {
        return zhekoubili;
    }

    public void setZhekoubili(BigDecimal zhekoubili) {
        this.zhekoubili = zhekoubili;
    }
}