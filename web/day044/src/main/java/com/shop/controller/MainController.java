package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main(Model m) {
		m.addAttribute("center", "center");
		return "main";
	}
	
	@RequestMapping("/media")
	public ModelAndView media(ModelAndView mv) {

		mv.setViewName("media");
		return mv;
	}
	
	@RequestMapping("/html5")
	public String html5(Model m) {
		m.addAttribute("center", "html5");
		return "main";
	}
	
	@RequestMapping("/css3")
	public ModelAndView css3(ModelAndView mv) {
		mv.addObject("center", "css3");
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/js")
	public ModelAndView js(ModelAndView mv) {
		mv.addObject("center", "js");
		mv.setViewName("main");
		return mv;
	}
}
