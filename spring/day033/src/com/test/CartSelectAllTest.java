package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CartService;
import com.vo.CartVO;


public class CartSelectAllTest {

	public static void main(String[] args) {
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");
		
		CartService service = 
				(CartService) factory.getBean("cartService");
		
		
		List<CartVO> list = null;
		
		try {
			list = service.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   
		for (CartVO productVO : list) {

			System.out.println(productVO);
		}

	}

}
