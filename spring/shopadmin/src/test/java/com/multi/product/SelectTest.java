package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
class SelectTest {
	
	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		
		
		ProductVO cust = null;
		
		try {
			cust = biz.get(1010);
			System.out.println(cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
