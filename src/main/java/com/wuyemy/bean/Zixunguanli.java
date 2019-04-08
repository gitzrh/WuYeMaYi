package com.wuyemy.bean;

public class Zixunguanli {
    private Integer id;

    private String head;

    private String text;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head == null ? null : head.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

	public Zixunguanli(Integer id, String head, String text) {
		super();
		this.id = id;
		this.head = head;
		this.text = text;
	}

	public Zixunguanli() {
		super();
	}
    
    
}