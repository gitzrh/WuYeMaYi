package com.wuyemy.bean;

import java.util.Date;

public class Kuser {
    private Integer kid;

    private String zhanghao;

    private String khname;

    private String tzhanghao;

    private String zhucetime;

    private String jihuotime;

    private String dongjietime;

    private String yyzxid;

    private String shenfenid;

    private String kpassword;

    private String zhenshishoujihao;

    private String zhenshiname;

    private String yinhangname;

    private String yinhangkajao;

    private String kaihudizhi;

    private String zhifubaoid;

    private Integer zhuangtaiid;
    
    private Zhuangtai zhuangtai;
    
    private Jifen jifen;
    
    private Integer suozailunshu;

    private long tjrs;
    
    private String tname;
    
    
    public String getTname() {
		return tname;
	}


	public void setTname(String tname) {
		this.tname = tname;
	}


	public long getTjrs() {
		return tjrs;
	}


	public void setTjrs(long tjrs) {
		this.tjrs = tjrs;
	}


	public Integer getSuozailunshu() {
		return suozailunshu;
	}


	public void setSuozailunshu(Integer suozailunshu) {
		this.suozailunshu = suozailunshu;
	}


	public Jifen getJifen() {
		return jifen;
	}


	public void setJifen(Jifen jifen) {
		this.jifen = jifen;
	}


	public Kuser() {
		super();
	}


	public Kuser(Integer kid, String zhanghao, String khname, String tzhanghao, String zhucetime, String jihuotime,
			String dongjietime, String yyzxid, String shenfenid, String kpassword, String zhenshishoujihao,
			String zhenshiname, String yinhangname, String yinhangkajao, String kaihudizhi, String zhifubaoid,
			Integer zhuangtaiid, Zhuangtai zhuangtai) {
		super();
		this.kid = kid;
		this.zhanghao = zhanghao;
		this.khname = khname;
		this.tzhanghao = tzhanghao;
		this.zhucetime = zhucetime;
		this.jihuotime = jihuotime;
		this.dongjietime = dongjietime;
		this.yyzxid = yyzxid;
		this.shenfenid = shenfenid;
		this.kpassword = kpassword;
		this.zhenshishoujihao = zhenshishoujihao;
		this.zhenshiname = zhenshiname;
		this.yinhangname = yinhangname;
		this.yinhangkajao = yinhangkajao;
		this.kaihudizhi = kaihudizhi;
		this.zhifubaoid = zhifubaoid;
		this.zhuangtaiid = zhuangtaiid;
		this.zhuangtai = zhuangtai;
	}


	public Zhuangtai getZhuangtai() {
		return zhuangtai;
	}


	public void setZhuangtai(Zhuangtai zhuangtai) {
		this.zhuangtai = zhuangtai;
	}


	public Kuser(String zhanghao, String khname, String tzhanghao,String yyzxid,String kpassword,String zhenshishoujihao,String zhucetime,int zhuangtaiid) {
		super();
		this.zhanghao = zhanghao;
		this.khname = khname;
		this.tzhanghao = tzhanghao;
		this.yyzxid = yyzxid;
		this.kpassword = kpassword;
		this.zhucetime = zhucetime;
		this.zhuangtaiid = zhuangtaiid;
		this.zhenshishoujihao = zhenshishoujihao;
	}
    



	public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public String getZhanghao() {
        return zhanghao;
    }

    public void setZhanghao(String zhanghao) {
        this.zhanghao = zhanghao == null ? null : zhanghao.trim();
    }

    public String getKhname() {
        return khname;
    }

    public void setKhname(String khname) {
        this.khname = khname == null ? null : khname.trim();
    }

    public String getTzhanghao() {
        return tzhanghao;
    }

    public void setTzhanghao(String tzhanghao) {
        this.tzhanghao = tzhanghao == null ? null : tzhanghao.trim();
    }

    public String getZhucetime() {
        return zhucetime;
    }

    public void setZhucetime(String zhucetime) {
        this.zhucetime = zhucetime;
    }

    public String getJihuotime() {
        return jihuotime;
    }

    public void setJihuotime(String jihuotime) {
        this.jihuotime = jihuotime;
    }

    public String getDongjietime() {
        return dongjietime;
    }

    public void setDongjietime(String dongjietime) {
        this.dongjietime = dongjietime;
    }

    public String getYyzxid() {
        return yyzxid;
    }

    public void setYyzxid(String yyzxid) {
        this.yyzxid = yyzxid == null ? null : yyzxid.trim();
    }

    public String getShenfenid() {
        return shenfenid;
    }

    public void setShenfenid(String shenfenid) {
        this.shenfenid = shenfenid == null ? null : shenfenid.trim();
    }

    public String getKpassword() {
        return kpassword;
    }

    public void setKpassword(String kpassword) {
        this.kpassword = kpassword == null ? null : kpassword.trim();
    }

    public String getZhenshishoujihao() {
        return zhenshishoujihao;
    }

    public void setZhenshishoujihao(String zhenshishoujihao) {
        this.zhenshishoujihao = zhenshishoujihao == null ? null : zhenshishoujihao.trim();
    }

    public String getZhenshiname() {
        return zhenshiname;
    }

    public void setZhenshiname(String zhenshiname) {
        this.zhenshiname = zhenshiname == null ? null : zhenshiname.trim();
    }

    public String getYinhangname() {
        return yinhangname;
    }

    public void setYinhangname(String yinhangname) {
        this.yinhangname = yinhangname == null ? null : yinhangname.trim();
    }

    public String getYinhangkajao() {
        return yinhangkajao;
    }

    public void setYinhangkajao(String yinhangkajao) {
        this.yinhangkajao = yinhangkajao == null ? null : yinhangkajao.trim();
    }

    public String getKaihudizhi() {
        return kaihudizhi;
    }

    public void setKaihudizhi(String kaihudizhi) {
        this.kaihudizhi = kaihudizhi == null ? null : kaihudizhi.trim();
    }

    public String getZhifubaoid() {
        return zhifubaoid;
    }

    public void setZhifubaoid(String zhifubaoid) {
        this.zhifubaoid = zhifubaoid == null ? null : zhifubaoid.trim();
    }

    public Integer getZhuangtaiid() {
        return zhuangtaiid;
    }

    public void setZhuangtaiid(Integer zhuangtaiid) {
        this.zhuangtaiid = zhuangtaiid;
    }


	@Override
	public String toString() {
		return "Kuser [kid=" + kid + ", zhanghao=" + zhanghao + ", khname=" + khname + ", tzhanghao=" + tzhanghao
				+ ", zhucetime=" + zhucetime + ", jihuotime=" + jihuotime + ", dongjietime=" + dongjietime + ", yyzxid="
				+ yyzxid + ", shenfenid=" + shenfenid + ", kpassword=" + kpassword + ", zhenshishoujihao="
				+ zhenshishoujihao + ", zhenshiname=" + zhenshiname + ", yinhangname=" + yinhangname + ", yinhangkajao="
				+ yinhangkajao + ", kaihudizhi=" + kaihudizhi + ", zhifubaoid=" + zhifubaoid + ", zhuangtaiid="
				+ zhuangtaiid + ", zhuangtai=" + zhuangtai + ", jifen=" + jifen + ", suozailunshu=" + suozailunshu
				+ ", tjrs=" + tjrs + ", tname=" + tname + "]";
	}


    
}