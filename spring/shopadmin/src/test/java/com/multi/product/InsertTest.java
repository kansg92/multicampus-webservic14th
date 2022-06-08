package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
class InsertTest {
	
	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		
		
		ProductVO prod = new ProductVO(0, "Tommy-shirts", 189900, null, 110, "shirts1.jpeg",null,null);
		
		try {
			biz.register(prod);
			System.out.println("완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
