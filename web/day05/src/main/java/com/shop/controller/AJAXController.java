package com.shop.controller;

import java.util.Date;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AJAXController {
	
	@RequestMapping("/gettime")
	public Object gettime() {
		Date d = new Date();
		return "서버시간:" + d.toString();
	}
	
	
	@RequestMapping("/checkid")
	public Object checkid(String id) {
		String result = "";
		if(id.equals("aaaa") ||id.equals("bbbb") || id.equals("cccc") ) {
			result = "0";
		}else {
			result = "1";
		}
		return result;
	}
	
	@RequestMapping("/checkid2")
	public Object checkid2(String id) {
		String result = "";
		if(id.matches(".*[ㄱ-ㅎㅏ-ㅣ가-힣]+.*") ) {
			result = "0";
		}else {
			result = "1";
		}
		return result;
	}
	
	
	
	@RequestMapping("/search")
	public Object search(String s) {
		String data = "";
		if(s.equals("a")) {
			data = "주식에 관심";
		}else if(s.equals("b")){
			data = "햄버거에 관심";
		}else {
			data = "밥에 관심";
		}
		return data;
	}

	@RequestMapping("/getdata")	
	public Object getdata() {
		JSONArray ja = new JSONArray();
		for(int i=0; i < 6; i++) {
			JSONObject jo = new JSONObject();
			jo.put("id", "id0"+i);
			jo.put("name", "james"+i);
			Random r = new Random();
			int a = r.nextInt(50)+1;
			jo.put("age", a);
			ja.add(jo);
		}
		return ja;
	}
	
	@RequestMapping("/getchart")	
	public Object getchart() {
		JSONArray ja = new JSONArray();
		for(int i = 0; i < 15; i++) {
			Random r = new Random();
			int data = r.nextInt(50)+1;
			ja.add(data);
		}
		return ja;
	}
	
	
}

































