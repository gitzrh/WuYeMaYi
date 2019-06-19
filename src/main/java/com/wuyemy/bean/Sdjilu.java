package com.wuyemy.bean;


public class Sdjilu
{
  private Integer id;
  private String zhanghao;
  private String name;
  private String lianhua;
  private Integer jinbileixing;
  private Integer biandonglx;
  private String biandongtime;
  private String beizhu;
  
  public Sdjilu(Integer id, String zhanghao, String biandongtime) {
    this.id = id;
    this.zhanghao = zhanghao;
    this.biandongtime = biandongtime;
  }

  
  public Integer getId() { return this.id; }


  
  public void setId(Integer id) { this.id = id; }


  
  public String getZhanghao() { return this.zhanghao; }


  
  public void setZhanghao(String zhanghao) { this.zhanghao = (zhanghao == null) ? null : zhanghao.trim(); }


  
  public String getName() { return this.name; }


  
  public void setName(String name) { this.name = (name == null) ? null : name.trim(); }


  
  public String getLianhua() { return this.lianhua; }


  
  public void setLianhua(String lianhua) { this.lianhua = (lianhua == null) ? null : lianhua.trim(); }


  
  public Integer getJinbileixing() { return this.jinbileixing; }


  
  public void setJinbileixing(Integer jinbileixing) { this.jinbileixing = jinbileixing; }


  
  public Integer getBiandonglx() { return this.biandonglx; }


  
  public void setBiandonglx(Integer biandonglx) { this.biandonglx = biandonglx; }


  
  public String getBiandongtime() { return this.biandongtime; }


  
  public void setBiandongtime(String biandongtime) { this.biandongtime = biandongtime; }


  
  public String getBeizhu() { return this.beizhu; }


  
  public void setBeizhu(String beizhu) { this.beizhu = (beizhu == null) ? null : beizhu.trim(); }



  
  public Sdjilu(Integer id, String zhanghao, String name, String lianhua, Integer jinbileixing, Integer biandonglx, String biandongtime, String beizhu) {
    this.id = id;
    this.zhanghao = zhanghao;
    this.name = name;
    this.lianhua = lianhua;
    this.jinbileixing = jinbileixing;
    this.biandonglx = biandonglx;
    this.biandongtime = biandongtime;
    this.beizhu = beizhu;
  }
  
  public Sdjilu() {}
}
