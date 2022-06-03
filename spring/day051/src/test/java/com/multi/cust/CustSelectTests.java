package com.multi.cust;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;


@SpringBootTest
class CustSelectTests {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		try {
			
			 System.out.println( biz.get("id02"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
