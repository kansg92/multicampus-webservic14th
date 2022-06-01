package com.service;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.frame.Service;
import com.mapper.CartMapper;
import com.vo.CartVO;

@org.springframework.stereotype.Service("cartService")
public class CartService implements Service<Integer, CartVO> {

	@Autowired
	CartMapper dao;
	
	@Override
	public void register(CartVO v) throws Exception {
		// TODO Auto-generated method stub
		dao.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
		
	}

	@Override
	public void modify(CartVO v) throws Exception {
		dao.update(v);
		
	}

	@Override
	public CartVO get(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return dao.select(k);
	}

	@Override
	public List<CartVO> get() throws Exception {

		return dao.selectAll();
	}

}
