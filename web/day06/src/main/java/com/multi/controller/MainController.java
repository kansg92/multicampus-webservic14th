package com.multi.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
	
	@RequestMapping("/main")
	public String main(Model m) {	
		return "main";
	}
	
	
	@RequestMapping("/registerok")
	public String registerok(Model m, String id, String email, String pwd, String vpwd) {			
		System.out.println(id+" "+email+" "+pwd+" "+vpwd);
		m.addAttribute("rname", id);
		return "registerok";
	}
	

	
	@RequestMapping("/")
	public String index(Model m) {

		return "index";
	}
	
	@RequestMapping("/dailyReport")
	public String js(Model m) {
		m.addAttribute("center", "dailyReport");
		m.addAttribute("left", "left");
		return "main";
	}
	

	
	
	@RequestMapping("/testtable")
	public String testtable(Model m) {
		m.addAttribute("center", "testtable");
		m.addAttribute("left", "left");
		return "main";
	}
	
	




}
