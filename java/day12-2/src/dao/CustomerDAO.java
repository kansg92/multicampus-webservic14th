package dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import frame.DAO;
import vo.CustomerVO;

public class CustomerDAO implements DAO<String, CustomerVO> {

	HashMap<String, CustomerVO> map;
	
	public CustomerDAO() {
		map = new HashMap<String, CustomerVO>();
	}
	
	@Override
	public void insert(CustomerVO v) throws Exception {
		String id = v.getId();
		if(map.containsKey(id)) {
			throw new Exception("ID 중복");			
		}
		map.put(id,v);
	}

	@Override
	public void delete(String k) throws Exception {
		if(! map.containsKey(k)) {
			throw new Exception("ID가 없습니다.");			
		}
		map.remove(k);
		
	}

	@Override
	public void update(CustomerVO v) throws Exception {
		String id = v.getId();
		if(!map.containsKey(id)) {
			throw new Exception("ID 없음.");			
		}
		map.put(id,v);
	}

	@Override
	public CustomerVO select(String k) throws Exception {
		CustomerVO c = null;
		
		if(!map.containsKey(k)) {
			throw new Exception("ID 없음.");			
		}
		c = map.get(k);
		return null;
	}

	@Override
	public List<CustomerVO> select() throws Exception {
		ArrayList<CustomerVO> list = new ArrayList<>();	
		if(map.size()==0) {
			throw new Exception("현재 목록이 없습니다.");
		}
		Collection<CustomerVO> col = map.values();
		Iterator<CustomerVO> it = col.iterator();		
		
		while(it.hasNext()) {
			CustomerVO cust = it.next();
			list.add(cust);
		}
		return list;
	}

}
