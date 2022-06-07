package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@RequestMapping("product")
@Controller
public class ProductController {
	
	@Autowired
	ProductBiz biz;
	
	@RequestMapping("")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left","product/left");
		mv.addObject("center","product/center");
		return mv;
	}
	
	@RequestMapping("/register")
	public ModelAndView register(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left","product/left");
		mv.addObject("center","product/register");
		return mv;
	}
	
	@RequestMapping("/registerimpl")
	public ModelAndView registerimpl(ModelAndView mv,ProductVO obj) {
		mv.setViewName("main");
		mv.addObject("left","product/left");
		try {
			biz.register(obj);
			int cnt = biz.getcnt();
			mv.addObject("cnt",cnt);
			mv.addObject("center","product/registerok");
			mv.addObject("rprod", obj);
		} catch (Exception e) {
			mv.addObject("center","product/registerfail");

		}

		return mv;
	}
	
	@RequestMapping("/get")
	public ModelAndView get(ModelAndView mv) {
		List<ProductVO> list =null;
		mv.setViewName("main");
		try {
			list = biz.get();
			mv.addObject("left","product/left");
			mv.addObject("center","product/get");
			mv.addObject("allprod",list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mv;
	}
	
	@RequestMapping("/detail")
	public ModelAndView detail(ModelAndView mv, int id) {
		ProductVO prod = null;
		mv.setViewName("main");
		try {
			prod = biz.get(id);
			mv.addObject("left","product/left");
			mv.addObject("center","product/detail");
			mv.addObject("dprod", prod);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return mv;
	}
	@RequestMapping("/update")
	public ModelAndView update(ModelAndView mv, int id) {
		ProductVO prod = null;
		mv.setViewName("main");
		try {
			prod = biz.get(id);
			mv.addObject("left","product/left");
			mv.addObject("center","product/update");
			mv.addObject("uprod",prod);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return mv;
	}
	
	@RequestMapping("/updateimpl")
	public String updateimpl(ProductVO prod) {
		try {
			biz.modify(prod);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect:detail?id="+prod.getId();
	}
	
	@RequestMapping("/delete")
	public String delete(int id) {
		try {
			biz.remove(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect:get";
	}
	
}
