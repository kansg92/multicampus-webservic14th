package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ItemVO;

public class ItemDeleteTest {

	public static void main(String[] args) {
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");
		
		Service<String, ItemVO> service = 
				(Service<String, ItemVO>) factory.getBean("itemservice");
		
		
		String k = "2";
		ItemVO u = new ItemVO("2","pants", 15000);
		service.register(u);
		service.remove(k);

	}

}
