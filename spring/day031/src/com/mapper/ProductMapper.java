package com.mapper;

import java.util.List;

import com.vo.ProductVO;

public interface ProductMapper {
	
	public void insert(ProductVO obj) throws Exception;
	public void update(ProductVO obj) throws Exception;
	public void delete(Integer obj) throws Exception;
	public ProductVO select(Integer obj) throws Exception;
	public List<ProductVO> selectAll() throws Exception;
	public List<ProductVO> searchName(String name) throws Exception;
	public List<ProductVO> getRate(double rate) throws Exception;
	
}
