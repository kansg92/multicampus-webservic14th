package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.AdminVO;

@Repository
@Mapper
public interface MainMapper {
	
	public int getcustcnt() throws Exception;
	
	public int getproductcnt() throws Exception;
	public int getcatecnt() throws Exception;
	public int getcartcnt() throws Exception;
	public AdminVO getadmin(String id) throws Exception;
	
}
