package com.multi.cart;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartBiz;
import com.multi.vo.CartVO;

@SpringBootTest
class SelectUCntTest2 {
	
	@Autowired
	CartBiz biz;
	
	@Test
	void contextLoads() {
		
		
		int cust = 0;
		
		try {
			cust = biz.selectucnt("id01");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cust);
		
	}

}
