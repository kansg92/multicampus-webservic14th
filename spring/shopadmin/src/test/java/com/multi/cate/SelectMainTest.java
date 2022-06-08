package com.multi.cate;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVO;

@SpringBootTest
class SelectMainTest {
	
	@Autowired
	CateBiz biz;
	
	@Test
	void contextLoads() {
		
		
		List<CateVO> cust = null;
		
		try {
			cust = biz.getmain();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (CateVO custVO : cust) {
			System.out.println(custVO);
		}
		
	}

}
