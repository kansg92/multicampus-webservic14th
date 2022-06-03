package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;


@SpringBootTest
class CustInsertTests {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		CustVO cust = new CustVO("id11","pwd01","lee"); 
		try {
			biz.register(cust);
			System.out.println("done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
