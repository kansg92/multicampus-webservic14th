package com.item;

import java.util.ArrayList;
import java.util.List;

import com.frame.Dao;
import com.vo.ItemVO;

public class ItemDao implements Dao<String, ItemVO> {

	@Override
	public void insert(ItemVO v) {
		System.out.println("Inserted: " +v);
		
	}

	@Override
	public void delete(String k) {
		System.out.println("Deleted: " +k);
		
	}

	@Override
	public void update(ItemVO v) {
		System.out.println("updated: " +v);
		
	}

	@Override
	public ItemVO select(String k) {
		ItemVO item = new ItemVO(k, "pants", 25000);
		return item;
	}

	@Override
	public List<ItemVO> select() {
		ArrayList<ItemVO> list = new ArrayList<ItemVO>();
		list.add(new ItemVO("1","shirts", 20000));
		list.add(new ItemVO("2","pants", 25000));
		list.add(new ItemVO("3","jacket", 215000));
		list.add(new ItemVO("4","jumper", 150000));
		list.add(new ItemVO("5","coat", 300000));
		return list;
	}

}
