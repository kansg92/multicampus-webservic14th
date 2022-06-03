package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@Controller
@RequestMapping("cust")
public class CustController {
	
	@Autowired
	CustBiz biz;
	
	@RequestMapping("")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left","cust/left");
		mv.addObject("center","cust/center");
		return mv;
	}
	@RequestMapping("/register")
	public ModelAndView register(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left","cust/left");
		mv.addObject("center","cust/register");
		return mv;
	}
	@RequestMapping("/registerimpl")
	public ModelAndView registerimpl(ModelAndView mv,CustVO obj) {
		mv.setViewName("main");
		mv.addObject("left","cust/left");
		try {
			biz.register(obj);
			mv.addObject("center","cust/registerok");
			mv.addObject("rcust", obj);
		} catch (Exception e) {
			mv.addObject("center","cust/registerfail");

		}

		return mv;
	}
	
	@RequestMapping("/get")
	public ModelAndView get(ModelAndView mv) {
		List<CustVO> list =null;
		mv.setViewName("main");
		try {
			list = biz.get();
			mv.addObject("left","cust/left");
			mv.addObject("center","cust/get");
			mv.addObject("allcust",list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mv;
	}
	
	@RequestMapping("/detail")
	public ModelAndView detail(ModelAndView mv, String id) {
		CustVO cust = null;
		mv.setViewName("main");
		try {
			cust = biz.get(id);
			mv.addObject("left","cust/left");
			mv.addObject("center","cust/detail");
			mv.addObject("dcust", cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return mv;
	}
	@RequestMapping("/update")
	public ModelAndView update(ModelAndView mv, String id) {
		CustVO cust = null;
		mv.setViewName("main");
		try {
			cust = biz.get(id);
			mv.addObject("left","cust/left");
			mv.addObject("center","cust/update");
			mv.addObject("ucust",cust);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return mv;
	}
	
	@RequestMapping("/updateimpl")
	public String updateimpl(CustVO cust) {
		try {
			biz.modify(cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect:detail?id="+cust.getId();
	}
	
	@RequestMapping("/delete")
	public String delete(String id) {
		try {
			biz.remove(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect:get";
	}
	

}
