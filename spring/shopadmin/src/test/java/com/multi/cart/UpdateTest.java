package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartBiz;
import com.multi.vo.CartVO;

@SpringBootTest
class UpdateTest {
	
	@Autowired
	CartBiz biz;
	
	@Test
	void contextLoads() {
		
		
		CartVO cust = new CartVO(1003, "id01", 1010, null, 0, null, null, 5);
		
		try {
			biz.modify(cust);
			System.out.println("완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
