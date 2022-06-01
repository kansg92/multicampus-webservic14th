package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.CateVO;


public class CateInsertTest {

	public static void main(String[] args) {
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");
		
		Service<Integer, CateVO> service = 
				(Service<Integer, CateVO>) factory.getBean("cateService");
		
		CateVO product = new CateVO(12, "widepants", 10);
		
		try {
			service.register(product);
			System.out.println(product);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("입력오류");
		}
		

	}

}
