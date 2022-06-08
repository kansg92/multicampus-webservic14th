package com.multi.cust;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class SelectAllTest {
	
	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		
		
		List<CustVO> cust = null;
		
		try {
			cust = biz.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (CustVO custVO : cust) {
			System.out.println(custVO);
		}
		
	}

}
