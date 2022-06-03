package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.CustVO;


public class CustInsertTest {

	public static void main(String[] args) {
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");
		
		Service<Integer, CustVO> service = 
				(Service<Integer, CustVO>) factory.getBean("custservice");
		
		CustVO product = new CustVO("id06", "park");
		
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
