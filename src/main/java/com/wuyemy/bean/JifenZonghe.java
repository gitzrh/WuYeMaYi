package com.wuyemy.bean;

import java.math.BigDecimal;

public class JifenZonghe {
	
private long num;
private BigDecimal fxnum;
private BigDecimal gcnum;
private BigDecimal zainum;
private BigDecimal cjnum;
public long getNum() {
	return num;
}
public void setNum(long num) {
	this.num = num;
}

public JifenZonghe() {
	super();
}
public JifenZonghe(BigDecimal fxnum, BigDecimal gcnum, BigDecimal zainum, BigDecimal cjnum) {
	super();
	this.fxnum = fxnum;
	this.gcnum = gcnum;
	this.zainum = zainum;
	this.cjnum = cjnum;
}
public BigDecimal getFxnum() {
	return fxnum;
}
public void setFxnum(BigDecimal fxnum) {
	this.fxnum = fxnum;
}
public BigDecimal getGcnum() {
	return gcnum;
}
public void setGcnum(BigDecimal gcnum) {
	this.gcnum = gcnum;
}
public BigDecimal getZainum() {
	return zainum;
}
public void setZainum(BigDecimal zainum) {
	this.zainum = zainum;
}
public BigDecimal getCjnum() {
	return cjnum;
}
public void setCjnum(BigDecimal cjnum) {
	this.cjnum = cjnum;
}
	

}
