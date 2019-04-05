package com.wuyemy.bean;

public class Manage {
    private Integer mid;

    private String muser;

    private String mpassword;

    
    
    public Manage(String muser, String mpassword) {
		super();
		this.muser = muser;
		this.mpassword = mpassword;
	}

	public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMuser() {
        return muser;
    }

    public void setMuser(String muser) {
        this.muser = muser == null ? null : muser.trim();
    }

    public String getMpassword() {
        return mpassword;
    }

    public void setMpassword(String mpassword) {
        this.mpassword = mpassword == null ? null : mpassword.trim();
    }
}