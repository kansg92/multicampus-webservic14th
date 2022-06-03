package com.vo;

import java.util.Date;

public class CustVO {
	private String id;
	private String name;
	private String addr;
	private Date regdate;
	public CustVO() {
	}
	public CustVO(String id, String name, String addr, Date regdate) {
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.regdate = regdate;
	}
	
	public CustVO(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public CustVO(String id, String name, String addr) {
		this.id = id;
		this.name = name;
		this.addr = addr;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "CustVO [id=" + id + ", name=" + name + ", addr=" + addr + ", regdate=" + regdate + "]";
	}
	
	
}
