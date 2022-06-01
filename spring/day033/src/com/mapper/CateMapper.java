package com.mapper;

import java.util.List;

import com.vo.CateVO;

public interface CateMapper {
	public void insert(CateVO v) throws Exception;
	public void delete(int id) throws Exception;
	public void update(CateVO v) throws Exception;
	
	public CateVO select(int id) throws Exception;
	public List<CateVO> selectAll() throws Exception;
}
