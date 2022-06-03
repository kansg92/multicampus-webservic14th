package com.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ItemService;
import com.vo.ItemVO;

public class ItemSearchPriceTest {

	public static void main(String[] args) {
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");
		
		ItemService service = 
				(ItemService) factory.getBean("itemService");
		
		List<ItemVO> list = null;
		
		try {
			Map<String,Integer> map = new HashMap<String,Integer>();
			map.put("low", 10000);
			map.put("high", 30000);
			list = service.searchPrice(map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (ItemVO itemVO : list) {
			System.out.println(itemVO);
		}
		

	}

}
