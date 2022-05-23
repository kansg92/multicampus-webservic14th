package com.multi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AJAXController {
	
	@RequestMapping("/dailyReportviews")
	public String dailyReportviews( String data) {		
		
		System.out.println("aa"+data);
			
		
		return "success";
	}
	
}
