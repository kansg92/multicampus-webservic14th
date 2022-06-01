package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CateService;
import com.vo.CateVO;


public class CateSelectAllTest {

	public static void main(String[] args) {
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");
		
		CateService service = 
				(CateService) factory.getBean("cateService");
		
		List<CateVO> list = null;
		
		try {
			list = service.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (CateVO productVO : list) {
			System.out.println(productVO);
		}

	}

}
