package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@RestController
public class AjaxController {

	@Autowired
	CustBiz custbiz;
	
	@RequestMapping("checkid")
	public String checkid(String id) {
		CustVO cust = null;
		String result = "";
		
		if(id.equals("") || id ==null) {
			return "1";
		}
		
		try {
			cust = custbiz.get(id);
			if(cust == null) {
				result = "0";
			}else {
				result = "1";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return result;
	}
}
