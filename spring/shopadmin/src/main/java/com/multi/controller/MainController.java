package com.multi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CateBiz;
import com.multi.biz.MainBiz;
import com.multi.biz.ProductBiz;
import com.multi.vo.AdminVO;
import com.multi.vo.ProductVO;

@Controller
public class MainController {
	
	@Autowired
	MainBiz biz;
	
	@Autowired
	ProductBiz pbiz;
	
	@Autowired
	CateBiz cbiz;
	
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
	
	@RequestMapping("search")
	public String search(Model m, String txt) {
	
		List<ProductVO> list = null;
	
		
		try {
			list = pbiz.searchName(txt);
			
			m.addAttribute("plist",list);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		m.addAttribute("center","search");
		return "/index";
	}
	
	@RequestMapping("/login")
	public String login(Model m) {
		
		m.addAttribute("center","login");
		return "/index";
	}
	
	@RequestMapping("/loginimpl")
	public String loginimpl(Model m,String id, String pwd, HttpSession session) {
		String next="";
		AdminVO admin = null;
		
		try {
			admin = biz.getadmin(id);
			if(admin != null) {
				if(admin.getPwd().equals(pwd)) {
					session.setAttribute("loginadmin", admin);
					m.addAttribute("loginadmin",admin);
					next = "center";
				}else {
					throw new Exception();
				}
			}else {
				throw new Exception();
			}
		} catch (Exception e) {
			next = "loginfail";
		}
		
		m.addAttribute("center",next);
		return "/index";
	}
	
	@RequestMapping("/logout")
	public String logout(Model m, HttpSession session ) {
		if(session != null) {
			session.invalidate();
		}
		return "/index";
	}
}
