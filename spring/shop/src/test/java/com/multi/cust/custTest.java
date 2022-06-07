package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class custTest {

	@Test
	void contextLoads() {
		CustBiz biz;
		
		CustVO cust = new CustVO(null, null, null, null, null);
	}

}
