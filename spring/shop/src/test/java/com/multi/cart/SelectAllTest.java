package com.multi.cart;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartBiz;
import com.multi.vo.CartVO;

@SpringBootTest
class SelectAllTest {
	
	@Autowired
	CartBiz biz;
	
	@Test
	void contextLoads() {
		
		
		List<CartVO> cust = null;
		
		try {
			cust = biz.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (CartVO custVO : cust) {
			System.out.println(custVO);
		}
		
	}

}
