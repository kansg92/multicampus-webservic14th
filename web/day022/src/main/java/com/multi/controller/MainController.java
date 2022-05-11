package com.multi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView main(ModelAndView mv) {
		mv.addObject("w","welcome Neverland!!");
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/register_view")
	public ModelAndView register_view(ModelAndView mv) {
		mv.setViewName("register");
		return mv;
	}
	
	@RequestMapping("/login_view")
	public ModelAndView login_view(ModelAndView mv) {
		mv.setViewName("login");
		return mv;
	}
	
	@RequestMapping("/table_view")
	public ModelAndView table_view(ModelAndView mv) {
		mv.setViewName("table");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(ModelAndView mv,
			String id, String pwd) {	
		if(id.equals("qqq") && pwd.equals("111")) {
			mv.addObject("ii",id);
			mv.setViewName("loginok");
		}else {
			mv.setViewName("loginfail");
		}
		return mv;
	}

	
	@RequestMapping("/register")
	public ModelAndView register(ModelAndView mv,
						String id, String pwd, String pwdcheck, String name,
						String birth, String gender, String email, String phone,
						String hobby) {
		System.out.println(id+" "+pwd+" "+pwdcheck+" "+ name+" "+ birth + " "+
							gender+ " " + email + " " + phone + " "+ hobby);
		mv.addObject("ii",id);
		mv.setViewName("registerok");
		return mv;
	}
	

}
