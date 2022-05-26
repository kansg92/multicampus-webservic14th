package com.multi.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.multi.frame.Service;
import com.multi.user.UserService;
import com.multi.vo.UserVO;

public class Controller {

	public static void main(String[] args) {

		
		// Spring 시작 공간.
		System.out.println("Spring Start ..");
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");
		
		
		//  Ioc ( Injection Of Control) 제어 반전 loosely coupled -----> 거꾸로 스프링에서 만들어줌.
		// Service service = new UsesrService(); -----> 순방향 제어(tightly coupled) 
		Service service = (Service) factory.getBean("uDao");
		
		
		UserVO user = new UserVO("id01","pwd01","lee");
		service.register(user);
	}

}
