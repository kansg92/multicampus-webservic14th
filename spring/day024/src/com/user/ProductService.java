package com.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.frame.Service;
import com.mapper.ProductMapper;
import com.vo.ProductVO;

@org.springframework.stereotype.Service("pservice")
public class ProductService implements Service<Integer, ProductVO> {
	
	@Autowired //자동으로 dao에대한것을 검색해서 가져오라는 뜻.
	ProductMapper dao;
	

	@Override
	public void register(ProductVO v) {
		dao.insert(v);
	}

	@Override
	public void remove(Integer k) {
		dao.delete(k);
	}

	@Override
	public void modify(ProductVO v) {
		dao.update(v);
	}

	@Override
	public ProductVO get(Integer k) {
		
		return dao.select(k);
	}

	@Override
	public List<ProductVO> get() {
		
		return dao.selectAll();
	}

}
