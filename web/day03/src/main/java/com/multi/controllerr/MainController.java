package com.multi.controllerr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping("/")
	public ModelAndView main(ModelAndView mv) {
		mv.addObject("w", "Welcome!!");
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/p105")
	public ModelAndView p105(ModelAndView mv) {
		mv.addObject("w", "Welcome!!");
		mv.setViewName("p105");
		return mv;
	}
	
	@RequestMapping("/p135")
	public ModelAndView p135(ModelAndView mv) {
		mv.addObject("w", "Welcome!!");
		mv.setViewName("p135");
		return mv;
	}
	
	
	@RequestMapping("/p139")
	public ModelAndView p139(ModelAndView mv) {
		mv.addObject("w", "Welcome!!");
		mv.setViewName("p139");
		return mv;
	}
	
	@RequestMapping("/p159")
	public ModelAndView p159(ModelAndView mv) {
		mv.addObject("w", "Welcome!!");
		mv.setViewName("p159");
		return mv;
	}
	
	@RequestMapping("/p189")
	public ModelAndView p189(ModelAndView mv) {
		mv.addObject("w", "Welcome!!");
		mv.setViewName("p189");
		return mv;
	}
	
	@RequestMapping("/p192")
	public ModelAndView p192(ModelAndView mv) {
		mv.addObject("w", "Welcome!!");
		mv.setViewName("p192");
		return mv;
	}
	
}
