package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ItemVO;

public class ItemSelectAllTest {

	public static void main(String[] args) {
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");
		
		Service<String, ItemVO> service = 
				(Service<String, ItemVO>) factory.getBean("itemservice");
		
		
		List<ItemVO> list = null;
		list = service.get();
		System.out.println(list);
		for (ItemVO itemVO : list) {
			System.out.println(itemVO);
		}
		
	}

}
