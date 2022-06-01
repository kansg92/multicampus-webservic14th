package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ProductService;
import com.vo.ProductVO;


public class ProductSelectAllTest {

	public static void main(String[] args) {
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");
		
		ProductService service = 
				(ProductService) factory.getBean("pservice");
		
		List<ProductVO> list = null;
		
		try {
			list = service.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (ProductVO productVO : list) {
			System.out.println(productVO);
		}

	}

}
