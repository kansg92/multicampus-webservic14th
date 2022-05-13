package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WearController {
		
	@RequestMapping("/wear")
	public String wear(Model m) {
		m.addAttribute("center", "wear");
		return "main";
	}
	
	@RequestMapping("/shirts")
	public String shirts(Model m) {
		m.addAttribute("center", "wear");
		m.addAttribute("subcenter", "wear/shirts");
		return "main";
	}
	
	@RequestMapping("/pants")
	public String pants(Model m) {
		m.addAttribute("center", "wear");
		m.addAttribute("subcenter", "wear/pants");
		return "main";
	}
	
}
