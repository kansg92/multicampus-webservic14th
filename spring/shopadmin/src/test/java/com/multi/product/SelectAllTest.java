package com.multi.product;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.CustVO;
import com.multi.vo.ProductVO;

@SpringBootTest
class SelectAllTest {
	
	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		
		
		List<ProductVO> cust = null;
		
		try {
			cust = biz.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (ProductVO custVO : cust) {
			System.out.println(custVO);
		}
		
	}

}
