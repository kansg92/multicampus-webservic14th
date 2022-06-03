package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.vo.CustVO;


@SpringBootTest
class CustTests {

	@Test
	void contextLoads() {
		CustVO cust = new CustVO("id11","pwd01","lee"); 
	}

}
