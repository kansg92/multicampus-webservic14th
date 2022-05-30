package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ProductVO;

public class ProductSelectTest {

	public static void main(String[] args) {
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");
		
		Service<Integer, ProductVO> service = 
				(Service<Integer, ProductVO>) factory.getBean("pservice");
		
		
		int k = 5;
		System.out.println(service.get(k));

	}

}
