package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.CartVO;

@Mapper
@Repository
public interface CartMapper {
	public void insert(CartVO cust) throws Exception;
	public void delete(int id) throws Exception;
	public void update(CartVO cust) throws Exception;
	
	public CartVO select(int id) throws Exception;
	public List<CartVO> selectAll() throws Exception;
	public int selectucnt(String id) throws Exception;
}
