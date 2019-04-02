package com.wuyemy.bean;

import java.util.Date;

public class Zijinmingxi {
    private Integer id;

    private String zhanghao;

    private Integer jinbileixing;

    private Integer biandonleix;

    private Date time;

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

    public Integer getJinbileixing() {
        return jinbileixing;
    }

    public void setJinbileixing(Integer jinbileixing) {
        this.jinbileixing = jinbileixing;
    }

    public Integer getBiandonleix() {
        return biandonleix;
    }

    public void setBiandonleix(Integer biandonleix) {
        this.biandonleix = biandonleix;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}