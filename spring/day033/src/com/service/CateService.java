package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.frame.Service;
import com.mapper.CateMapper;
import com.vo.CateVO;

@org.springframework.stereotype.Service("cateService")
public class CateService implements Service<Integer, CateVO> {
	
	@Autowired
	CateMapper dao;
	
	@Override
	public void register(CateVO v) throws Exception {
		// TODO Auto-generated method stub
		dao.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(k);
	}

	@Override
	public void modify(CateVO v) throws Exception {
		// TODO Auto-generated method stub
		dao.update(v);
	}

	@Override
	public CateVO get(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return dao.select(k);
	}

	@Override
	public List<CateVO> get() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

}
