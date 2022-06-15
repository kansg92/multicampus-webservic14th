package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.CartMapper;
import com.multi.vo.CartVO;

@Service
public class CartBiz implements Biz<Integer, CartVO> {

	@Autowired
	CartMapper dao;
	
	@Override
	public void register(CartVO v) throws Exception {
		// TODO Auto-generated method stub
		dao.insert(v);
	}

	@Override
	public void modify(CartVO v) throws Exception {
		// TODO Auto-generated method stub
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(k);
	}

	@Override
	public CartVO get(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return dao.select(k);
	}

	@Override
	public List<CartVO> get() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	public int selectucnt(String id) throws Exception{
		return dao.selectucnt(id);
	}
	
}
