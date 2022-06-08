package com.multi.product;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductAVGVO;

@SpringBootTest
class SelectCateAVGTest {
	
	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		
		
		List<ProductAVGVO> cust = null;
		
		try {
			cust = biz.getCateAvg();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (ProductAVGVO custVO : cust) {
			System.out.println(custVO);
		}
		
	}

}
