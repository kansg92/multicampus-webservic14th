package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoodController {

	@RequestMapping("/food")
	public String food(Model m) {
		m.addAttribute("center", "food");
		return "main";
	}

	
	
	@RequestMapping("/meat")	
	public String meat(Model m) {
		m.addAttribute("center", "food");
		m.addAttribute("subcenter", "food/meat");
		return "main";
	}
	
	@RequestMapping("/fruit")	
	public String fruit(Model m) {
		m.addAttribute("center", "food");
		m.addAttribute("subcenter", "food/fruit");
		return "main";
	}
	
	@RequestMapping("/vegetable")	
	public String vegetable(Model m) {
		m.addAttribute("center", "food");
		m.addAttribute("subcenter", "food/vegetable");
		return "main";
	}
	
}
