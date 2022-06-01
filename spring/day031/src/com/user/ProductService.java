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
	public void register(ProductVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public void modify(ProductVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public ProductVO get(Integer k) throws Exception {
		
		return dao.select(k);
	}

	@Override
	public List<ProductVO> get() throws Exception {
		
		return dao.selectAll();
	}
	
	public List<ProductVO> searchName(String name) throws Exception {
		return dao.searchName(name);
	}
	
	public List<ProductVO> getRate(double rate) throws Exception{
		return dao.getRate(rate);
	}
}
