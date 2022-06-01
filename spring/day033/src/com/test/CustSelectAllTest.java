package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CustService;
import com.vo.CustVO;


public class CustSelectAllTest {

	public static void main(String[] args) {
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");
		
		CustService service = 
				(CustService) factory.getBean("custservice");
		
		List<CustVO> list = null;
		
		try {
			list = service.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (CustVO productVO : list) {
			System.out.println(productVO);
		}

	}

}
