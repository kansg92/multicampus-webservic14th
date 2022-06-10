package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVO;

@Controller
@RequestMapping("cate")
public class CateController {

	@Autowired
	CateBiz biz;
	
	@RequestMapping("/add")
	public String add (Model m ) {
		List<CateVO> list = null;
		try {
			list=biz.get();
			m.addAttribute("alist",list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.addAttribute("center","cate/add");
		
		return "index";
	}
	
	@RequestMapping("/addimpl")
	public String addimpl(Model m,CateVO obj) {
		try {
			biz.register(obj);
			m.addAttribute("cate",obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.addAttribute("center","cate/detail");

		return "redirect:detail?id="+obj.getId();
	}
	
	@RequestMapping("/select")
	public String select(Model m) {
		List<CateVO> list = null;
		try {
			list= biz.get();
			m.addAttribute("cate",list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.addAttribute("center","cate/select");
		return "index";
	}
	@RequestMapping("/detail")
	public String detail(Model m, int id) {
		CateVO cate = null;
		List<CateVO> list = null;
		try {
			cate = biz.get(id);
			list = biz.getmain();
			m.addAttribute("slist",list);
			m.addAttribute("dObj",cate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.addAttribute("center","cate/detail");
		return "index";
	}
	
	@RequestMapping("/update")
	public String update(Model m, CateVO obj) {
		
		try {
			biz.modify(obj);
			m.addAttribute("dObj",obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.addAttribute("center","cate/detail");
		return "redirect:detail?id="+obj.getId();
	}
	
	@RequestMapping("/delete")
	public String delete (int id, Model m) {	
		try {
			biz.remove(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();


		}
		return "redirect:select";
	}
}
