package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.biz.CateBiz;
import com.multi.biz.CustBiz;
import com.multi.vo.CateVO;
import com.multi.vo.CustVO;

@RestController
public class AJAXController {
	
	@Autowired
	CustBiz custbiz;
	@Autowired
	CateBiz catebiz;
	
	@RequestMapping("checkid")
	public String checkid(String id) {
		String result = "";
		CustVO c = null;
		
		try {
			c= custbiz.get(id);
			if(c == null) {
				result="0";
			}else {
				result="1";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return result;
	}
	
	@RequestMapping("checkcateid")
	public String checkcateid(String id) {
		String result = "";
		CateVO c = null;
		
		
		
		try {
			c= catebiz.get(Integer.parseInt(id));
			if(c == null) {
				result="0";
			}else {
				result="1";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return result;
	}
	
	@RequestMapping("checkcatename")
	public String checkcatename(int id) {
		String result = "";
		CateVO c = null;
		List<CateVO> li = null;
		try {
			li = catebiz.get();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			c= catebiz.get(id);
			if(c.getName().equals(null) ) {
				result="0";
			}else {
				result="1";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return result;
	}
}
