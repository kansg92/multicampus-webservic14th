package com.vo;

import java.util.Date;

public class ItemVO {
	private int id;
	private String name;
	private int price;
	private String imgname;
	private Date regdate;
	public ItemVO() {
	}
	public ItemVO(String name, int price, String imgname) {
		this.name = name;
		this.price = price;
		this.imgname = imgname;
	}
	
	
	public ItemVO(int id, String name, int price, String imgname) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.imgname = imgname;
	}
	public ItemVO(int id, String name, int price, String imgname, Date regdate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.imgname = imgname;
		this.regdate = regdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getimgname() {
		return imgname;
	}
	public void setimgname(String imgname) {
		this.imgname = imgname;
	}
	public Date getDate() {
		return regdate;
	}
	public void setDate(Date date) {
		this.regdate = date;
	}
	@Override
	public String toString() {
		return "ItemVO [id=" + id + ", name=" + name + ", price=" + price + ", imgname=" + imgname + ", date=" + regdate + "]";
	}
	
	
	
}
