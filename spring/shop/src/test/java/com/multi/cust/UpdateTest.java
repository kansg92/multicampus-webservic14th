package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class UpdateTest {
	
	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		
		
		CustVO cust = new CustVO("id02", "kim", "Incheon",null,"pwd02");
		
		try {
			biz.modify(cust);
			System.out.println("완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
