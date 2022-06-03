package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@Controller
public class ProductContoller {
	
	@Autowired
	ProductBiz biz;
	
	@RequestMapping("/productadd")
	public String productadd() {
		return "productadd";
	}
	
	@RequestMapping("/productaddimpl")
	public ModelAndView productaddimpl(ModelAndView mv, ProductVO p) {
		String next = "productok";
		try {
			biz.register(p);
			mv.addObject("rproduct",p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mv.setViewName(next);
		return mv;
	}
	
	
	@RequestMapping("/productselect")
	public ModelAndView productselect(ModelAndView mv) {
		
		List<ProductVO> list = null;
		try {
			list = biz.get();
			mv.addObject("allproduct",list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("productselect");
		return mv;
	}
	
	@RequestMapping("/productdetail")
	public ModelAndView productdetail(ModelAndView mv, int id) {
		ProductVO cust = null;
		try {
			cust = biz.get(id);
			mv.addObject("dprod",cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("productdetail");
		return mv;
	}
	
	@RequestMapping("/productdelete")
	public String custdelete( int id) {

		try {
			biz.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:productselect";
	}
	
	@RequestMapping("/productupdate")
	public ModelAndView custupdate(ModelAndView mv, int id) {
		ProductVO cust = null;
		try {
			cust = biz.get(id);
			mv.addObject("uprod",cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("productupdate");
		return mv;
	}
	
	@RequestMapping("/productupdateimpl")
	public String productupdateimpl(ProductVO prod) {
		try {
			biz.modify(prod);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:productdetail?id="+prod.getId();
	}
}
