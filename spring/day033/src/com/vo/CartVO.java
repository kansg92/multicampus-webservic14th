package com.vo;

import java.util.Date;

public class CartVO {
	private int id;
	private String uid;
	private int pid;
	private Date regdate;
	private String userName;
	private String productName;
	private String cateName;
	public CartVO() {
	}
	public CartVO(int id, String uid, int pid, Date regdate, String userName, String productName, String cateName) {
		this.id = id;
		this.uid = uid;
		this.pid = pid;
		this.regdate = regdate;
		this.userName = userName;
		this.productName = productName;
		this.cateName = cateName;
	}
	public CartVO(String uid, int pid) {
		this.uid = uid;
		this.pid = pid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getproductName() {
		return productName;
	}
	public void setproductName(String productName) {
		this.productName = productName;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	@Override
	public String toString() {
		return "CartVO [id=" + id + ", uid=" + uid + ", pid=" + pid + ", regdate=" + regdate + ", userName=" + userName
				+ ", productName=" + productName + ", cateName=" + cateName + "]";
	}
	
	
}
