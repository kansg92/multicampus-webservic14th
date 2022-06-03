package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@Controller
public class MainController {
	
	@Autowired
	CustBiz biz;
	
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	
	@RequestMapping("/custadd")
	public String custadd() {
		return "custadd";
	}
	
	@RequestMapping("/custaddimpl")
	public ModelAndView custaddok(ModelAndView mv, CustVO cust) {
		String next = "custaddok";
		try {
			biz.register(cust);
			mv.addObject("rcust",cust);
		} catch (Exception e) {
			next = "custaddfail";
		}
		mv.setViewName(next);
		
		return mv;
	}
	
	@RequestMapping("/custselect")
	public ModelAndView custselectimpl(ModelAndView mv) {
		
		List<CustVO> list = null;
		try {
			list = biz.get();
			mv.addObject("allcust",list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("custselect");
		return mv;
	}
	
	@RequestMapping("/custdetail")
	public ModelAndView custdetail(ModelAndView mv, String id) {
		CustVO cust = null;
		try {
			cust = biz.get(id);
			mv.addObject("dcust",cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("custdetail");
		return mv;
	}
	
	@RequestMapping("/custdelete")
	public String custdelete( String id) {

		try {
			biz.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:custselect";
	}
	
	@RequestMapping("/custupdate")
	public ModelAndView custupdate(ModelAndView mv, String id) {
		CustVO cust = null;
		try {
			cust = biz.get(id);
			mv.addObject("ucust",cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("custupdate");
		return mv;
	}
	
	@RequestMapping("/custupdateimpl")
	public String custupdateimpl( CustVO cust) {
		try {
			biz.modify(cust);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:custdetail?id="+cust.getId();
	}
}
