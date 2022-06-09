package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.MainBiz;

@Controller
public class MainController {
	
	@Autowired
	MainBiz biz;
	
	@RequestMapping("/")
	public String main(Model m){
		int custCnt = 0;
		int productCnt = 0;
		int cartCnt = 0;
		int cateCnt = 0;
		try {
			custCnt = biz.getCustCnt();
			productCnt = biz.getProductCnt();
			cartCnt = biz.getCartCnt();
			cateCnt = biz.getCateCnt();
			m.addAttribute("custCnt",custCnt);
			m.addAttribute("productCnt",productCnt);
			m.addAttribute("cartCnt",cartCnt);
			m.addAttribute("cateCnt",cateCnt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "index";
	}
	
	
	
}
