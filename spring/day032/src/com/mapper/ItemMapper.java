package com.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.vo.ItemVO;

public interface ItemMapper {
	public void insert(ItemVO obj) throws Exception;
	public void update(ItemVO obj) throws Exception;
	public void delete(int obj) throws Exception;
	public ItemVO select(int obj) throws Exception;
	public List<ItemVO> selectAll() throws Exception;
	public List<ItemVO> searchName(String name) throws Exception;
	public List<ItemVO> searchPrice(@Param("price1")int price1, @Param("price2")int price2) throws Exception;
	public List<ItemVO> searchDate(Date date);
}
