package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ItemVO;

public class ItemSelectTest {

	public static void main(String[] args) {
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");
		
		Service<String, ItemVO> service = 
				(Service<String, ItemVO>) factory.getBean("itemservice");
		
		
		String item = "2";
		
		ItemVO vo = service.get(item);
		System.out.println(vo);
		
		
		
	}

}
