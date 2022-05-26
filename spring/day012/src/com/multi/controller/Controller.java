package com.multi.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.multi.frame.Service;
import com.multi.user.UserService;
import com.multi.vo.UserVO;

public class Controller {

	public static void main(String[] args) {

		
		// Spring ���� ����.
		System.out.println("Spring Start ..");
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");
		
		
		//  Ioc ( Injection Of Control) ���� ���� loosely coupled -----> �Ųٷ� ���������� �������.
		// Service service = new UsesrService(); -----> ������ ����(tightly coupled) 
		Service service = (Service) factory.getBean("uDao");
		
		
		UserVO user = new UserVO("id01","pwd01","lee");
		service.register(user);
	}

}
