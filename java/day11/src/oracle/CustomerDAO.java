package oracle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;


public class CustomerDAO implements DAO {

	HashMap<String, CustomerVO> map;
	
	public CustomerDAO() {
		map = new HashMap<String, CustomerVO>();
	}
	
	@Override
	public void insert(CustomerVO c) throws DuplicatedIDException {
		String id = c.getId();
		if (map.containsKey(id)) {
			throw new DuplicatedIDException("ID 중복");
		}
		map.put(c.getId(), c);
	}

	@Override
	public void delete(String id) throws NotFoundException {
		
		if (!(map.containsKey(id))) {
			throw new NotFoundException("해당 ID를 찾을 수 없습니다.");
		}
		map.remove(id);
	}
	@Override
	public void update(CustomerVO c) throws NotFoundException {
		String key = c.getId();
		map.put(key, c);
		if (map.containsKey(key)) {
			throw new NotFoundException("해당 ID를 찾을 수 없습니다.");
		}		
	}
	@Override
	public CustomerVO select(String id) throws NotFoundException {
		CustomerVO c = null;                                                                                                                                                       
		c = map.get(id);
		if (! map.containsKey(id) ) {
			throw new NotFoundException("해당 ID를 찾을 수 없습니다.");
		}
		return c;
	}
	@Override
	public ArrayList<CustomerVO> select() throws NotFoundException {
		ArrayList<CustomerVO> list = new ArrayList<>();	
		
		if (map.size()==0) {
			throw new NotFoundException("데이터가 존재하지 않습니다.");
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
