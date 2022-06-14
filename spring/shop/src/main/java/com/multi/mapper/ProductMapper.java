package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.ProductAVGVO;
import com.multi.vo.ProductVO;

@Mapper
@Repository
public interface ProductMapper {
	public void insert(ProductVO p) throws Exception;
	public void delete(int id) throws Exception;
	public void update(ProductVO p) throws Exception;
	
	public ProductVO select(int id) throws Exception;
	public List<ProductVO> selectAll() throws Exception;	
	public List<ProductVO> selectAll2() throws Exception;
	public List<ProductVO> selectproduct(int id) throws Exception;
	
	public List<ProductAVGVO> cateavg() throws Exception;
	public int selectcnt() throws Exception;
}
