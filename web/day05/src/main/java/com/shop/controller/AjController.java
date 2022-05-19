package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AjController {
	

	
	@RequestMapping("/aj")
	public String aj(Model m) {
		m.addAttribute("center", "aj/center");	
		m.addAttribute("left", "aj/left");
		return "main";
	}
	
	@RequestMapping("/regiesterok2")
	public String aj(Model m,String id, String pwd, String vpwd,
			String name, String birth, String sex, String phone ) {
		m.addAttribute("rname", name);
		m.addAttribute("center", "aj/registerok");	
		m.addAttribute("left", "aj/left");
		return "main";
	}
	
	
	@RequestMapping("/aj01")
	public String aj01(Model m) {
		m.addAttribute("center", "aj/aj01");
		m.addAttribute("left", "aj/left");
		return "main";
	}
	
	
	
	@RequestMapping("/aj02")
	public String aj02(Model m) {
		m.addAttribute("center", "aj/aj02");
		m.addAttribute("left", "aj/left");
		return "main";
	}
	
	@RequestMapping("/aj03")
	public String aj03(Model m) {
		m.addAttribute("center", "aj/aj03");
		m.addAttribute("left", "aj/left");
		return "main";
	}
	
	@RequestMapping("/aj04")
	public String aj04(Model m) {
		m.addAttribute("center", "aj/aj04");
		m.addAttribute("left", "aj/left");
		return "main";
	}
	
	@RequestMapping("/aj05")
	public String aj05(Model m) {
		m.addAttribute("center", "aj/aj05");
		m.addAttribute("left", "aj/left");
		return "main";
	}
	
	@RequestMapping("/aj06")
	public String aj06(Model m) {
		m.addAttribute("center", "aj/aj06");
		m.addAttribute("left", "aj/left");
		return "main";
	}
	
	@RequestMapping("/aj07")
	public String aj07(Model m) {
		m.addAttribute("center", "aj/aj07");
		m.addAttribute("left", "aj/left");
		return "main";
	}
	
	@RequestMapping("/aj08")
	public String aj08(Model m) {
		m.addAttribute("center", "aj/aj08");
		m.addAttribute("left", "aj/left");
		return "main";
	}
	
	@RequestMapping("/aj09")
	public String aj09(Model m) {
		m.addAttribute("center", "aj/aj09");
		m.addAttribute("left", "aj/left");
		return "main";
	}
	
	@RequestMapping("/aj10")
	public String aj10(Model m) {
		m.addAttribute("center", "aj/aj10");
		m.addAttribute("left", "aj/left");
		return "main";
	}
	
	@RequestMapping("/aj11")
	public String aj11(Model m) {
		m.addAttribute("center", "aj/aj11");
		m.addAttribute("left", "aj/left");
		return "main";
	}
	@RequestMapping("/aj12")
	public String aj12(Model m) {
		m.addAttribute("center", "aj/aj12");
		m.addAttribute("left", "aj/left");
		return "main";
	}
	@RequestMapping("/aj13")
	public String aj13(Model m) {
		m.addAttribute("center", "aj/aj13");
		m.addAttribute("left", "aj/left");
		return "main";
	}
	@RequestMapping("/aj14")
	public String aj14(Model m) {
		m.addAttribute("center", "aj/aj14");
		m.addAttribute("left", "aj/left");
		return "main";
	}
	@RequestMapping("/aj15")
	public String aj15(Model m) {
		m.addAttribute("center", "aj/aj15");
		m.addAttribute("left", "aj/left");
		return "main";
	}
	
	

}
