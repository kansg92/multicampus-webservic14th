package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class InsertTest {
	
	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		
		
		CustVO cust = new CustVO("id03", "park", "Busan",null,"pwd01");
		
		try {
			biz.register(cust);
			System.out.println("완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
