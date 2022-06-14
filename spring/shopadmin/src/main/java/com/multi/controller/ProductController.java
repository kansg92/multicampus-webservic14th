package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CateBiz;
import com.multi.biz.ProductBiz;
import com.multi.frame.Util;
import com.multi.vo.CateVO;
import com.multi.vo.ProductVO;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Value("${admindir}")
	String admindir;
	
	@Value("${userdir}")
	String userdir;
	
	@Autowired
	ProductBiz biz;
	
	@Autowired
	CateBiz cbiz;
	
	@RequestMapping("/select")
	public String select(Model m) {
		List<ProductVO> list = null;
		try {
			list = biz.get();
			m.addAttribute("plist",list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.addAttribute("center","product/select");
		
		return "/index";
	}
	
	@RequestMapping("/add")
	public String add(Model m) {
		List<CateVO> list = null;
		try {
			list = cbiz.get();
			m.addAttribute("clist", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.addAttribute("center","product/add");
		
		return "/index";
	}
	
	@RequestMapping("/addimpl")//name,price,cid,mf(->imgname)날라옴!
	public String addimpl(Model m, ProductVO p) {
		String imgname = p.getMf().getOriginalFilename();
		p.setImgname(imgname);
		
		try {
			biz.register(p);
			Util.saveFile(p.getMf(), admindir, userdir);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect:select";
	}
	
	@RequestMapping("detail")
	public String detail(Model m, int id) {
		ProductVO p = null;
		List<CateVO> list =null;
		try {
			p=biz.get(id);
			list = cbiz.get();
			m.addAttribute("dlist",p);
			m.addAttribute("clist",list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.addAttribute("center","product/detail");
		return "/index";
	}
	
	@RequestMapping("/update")
	public String update(ProductVO p, Model m) {
		
//		String iname = p.getMf().getOriginalFilename();
//		if(iname.equals("") || iname != null) {
//			p.setImgname(iname);
//			Util.saveFile(p.getMf());	
//		}
		
		if (!(p.getMf().isEmpty())) {
			String imgname = p.getMf().getOriginalFilename();
			p.setImgname(imgname);	
			Util.saveFile(p.getMf(), admindir, userdir);
		}		
		
		try {
			biz.modify(p);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect:select";
	}
	
	@RequestMapping("/delete")
	public String delete(Model m, int id) {
		
		return "select";
	}
}
