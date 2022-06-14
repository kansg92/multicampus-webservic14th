package com.multi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CateBiz;
import com.multi.biz.CustBiz;
import com.multi.vo.CateVO;
import com.multi.vo.CustVO;

@Controller
public class MainController {
	
	@Autowired
	CustBiz custbiz;
	
	@Autowired
	CateBiz catebiz;
	
	@ModelAttribute("catelist")
	public List<CateVO> makemenu(){
		List<CateVO> catelist = null;
		try {
			catelist = catebiz.getmain();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return catelist;
	}
	
	@RequestMapping("/")
	public String main(Model m){
		List<CateVO> catelist = null;
		try {
			catelist = catebiz.getmain();
			m.addAttribute("catelist",catelist);
			m.addAttribute("leftcatelist",catelist);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "main";
	}
	
	@RequestMapping("getcate")
	public String getcate(Model m, int id) {
		List<CateVO> catelist = null;

		try {
			catelist = catebiz.getsub(id);

			m.addAttribute("leftcatelist",catelist);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "main";
	}
	

	
	@RequestMapping("/login")
	public String login(Model m) {
		
		m.addAttribute("center","login");
		
		return "main";
	}
	
	@RequestMapping("/loginimpl")
	public String loginimpl(Model m, HttpSession session, String id, String pwd ) {
		String next = "";
		CustVO cust =null;
		
		try {
			cust = custbiz.get(id);
			if(cust != null) {
				if(cust.getPwd().equals(pwd)) {
					session.setAttribute("logincust", cust);
					m.addAttribute("logincust",cust);
					next="loginok";
				}else {
					throw new Exception();
				}
			}else {
				throw new Exception();
			}
			
		} catch (Exception e) {
			next="loginfail";
		}
		
		m.addAttribute("center",next);
		
		return "main";
	}
	
	@RequestMapping("/logout")
	public String logout(Model m, HttpSession session) {
		if(session != null) {
			session.invalidate();
		}
	
		return "main";
	}
	
	@RequestMapping("/register")
	public String register(Model m) {
		
		m.addAttribute("center","register");
		
		return "/main";
	}
	
	@RequestMapping("/addimpl")
	public String addimpl(Model m,CustVO cust,HttpSession session) {

		try {
			custbiz.register(cust);
			session.setAttribute("logincust", cust);
			m.addAttribute("logincust",cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		m.addAttribute("center","loginok");
		return "/main";
	}
	
}
