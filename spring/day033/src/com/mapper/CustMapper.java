package com.mapper;

import java.util.List;

import com.vo.CustVO;

public interface CustMapper {
	
	public void insert(CustVO p) throws Exception;
	public void delete(String id) throws Exception;
	public void update(CustVO p) throws Exception;
	
	public CustVO select(String id) throws Exception;
	public List<CustVO> selectAll() throws Exception;
}
