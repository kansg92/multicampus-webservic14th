package com.multi.cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVO;

@SpringBootTest
class InsertTest {
	
	@Autowired
	CateBiz biz;
	
	@Test
	void contextLoads() {
		
		
		CateVO cust = new CateVO(201, "Pants",200);
		
		try {
			biz.register(cust);
			System.out.println("완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
