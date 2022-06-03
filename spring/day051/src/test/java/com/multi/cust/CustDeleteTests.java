package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;


@SpringBootTest
class CustDeleteTests {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		try {
			biz.remove("id11");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("deletedOK..");
	}

}
