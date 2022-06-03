package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;


@SpringBootTest
class CustUpdateTests {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		CustVO cust = new CustVO("id02","pwd01","장말숙"); 
		try {
			biz.modify(cust);
			System.out.println("done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
