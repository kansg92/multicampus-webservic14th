package com.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.frame.Dao;
import com.frame.Service;
import com.vo.ItemVO;

@org.springframework.stereotype.Service("itemservice")
public class ItemService implements Service<String, ItemVO> {
	
	@Autowired
	Dao<String, ItemVO> dao;
	
	
	

	@Override
	public void register(ItemVO v) {
		dao.insert(v);
		
	}

	@Override
	public void remove(String k) {
		dao.delete(k);
		
	}

	@Override
	public void modify(ItemVO v) {
		dao.update(v);
	}

	@Override
	public ItemVO get(String k) {
		
		return dao.select(k);
	}

	@Override
	public List<ItemVO> get() {
		// TODO Auto-generated method stub
		return dao.select();
	}

}
