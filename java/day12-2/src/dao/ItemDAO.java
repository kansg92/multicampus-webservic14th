package dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import frame.DAO;
import vo.CustomerVO;
import vo.ItemVO;

public class ItemDAO implements DAO<Integer, ItemVO> {
	
	HashMap<Integer, ItemVO> map;
	
	
	
	public ItemDAO() {
		map = new HashMap<Integer, ItemVO>();
	}

	@Override
	public void insert(ItemVO v) throws Exception {
		int id = v.getId();
		if(map.containsKey(v)) {
			throw new Exception("해당 id 있음.");
		}
		map.put(id, v);
	}

	@Override
	public void delete(Integer k) throws Exception {
		if(! map.containsKey(k)) {
			throw new Exception("해당 번호 없음");
		}
		map.remove(k);
	}

	@Override
	public void update(ItemVO v) throws Exception {
		int id = v.getId();
		if(! map.containsKey(v)) {
			throw new Exception("해당 번호 없음");
		}
		map.put(id,v);
	}

	@Override
	public ItemVO select(Integer k) throws Exception {
		ItemVO c = null;
		
		if(! map.containsKey(k)) {
			throw new Exception("해당 번호 없음");
		}
		c = map.get(k);
		return c;
	}

	@Override
	public List<ItemVO> select() throws Exception {
		ArrayList<ItemVO> list = new ArrayList<ItemVO>();
		if(map.size()==0) {
			throw new Exception("데이터가 없습니다.");
		}
		Collection<ItemVO> col = map.values();
		Iterator<ItemVO> it = col.iterator();		
		
		while(it.hasNext()) {
			ItemVO cust = it.next();
			list.add(cust);
		}
		return list;
	}

}
