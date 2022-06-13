package com.multi.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.MainBiz;
import com.multi.vo.AdminVO;

@SpringBootTest
class AdminSelectTest {

	@Autowired
	MainBiz biz;
	
	@Test
	void contextLoads() {
		AdminVO admin = null;
		try {
			admin = biz.getadmin("admin");
			System.out.println(admin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
