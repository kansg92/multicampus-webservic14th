package workshop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class OracleDAO implements DAO, Search {

	HashMap<String, ToDoVO> map;
	
	public OracleDAO() {
		map = new HashMap<String, ToDoVO>();
	}
	
	@Override
	public void insert(ToDoVO c) throws DuplicatedIDException {
		String key = c.getOrder();
		if(map.containsKey(key)) {
			throw new DuplicatedIDException("중복된 번호 입니다.");
		}		
		map.put(key, c);
	}

	@Override
	// true가 된것은 삭제.
	public void delete(String id) throws NotFoundException {		

		// 1. false를찾는다.
		// 2. key를 뽑아낸다.
		// 3. 지운다.
		if(! map.containsKey(id)) {
			throw new NotFoundException("해당 번호를 찾을 수 업습니다.");
		}
		map.remove(id);
	}

	@Override
	public ToDoVO select(String id) throws NotFoundException {
		ToDoVO c = null;
		if(! map.containsKey(id)) {
			throw new NotFoundException("해당 번호를 찾을 수 업습니다.");
		}
		c = map.get(id);
		return c;
	}

	@Override
	public ArrayList<ToDoVO> select() throws NotFoundException {
		ArrayList<ToDoVO> list = new ArrayList<>();	
		if(map.size()==0) {
			throw new NotFoundException("현재 목록이 없습니다.");
		}
		Collection<ToDoVO> col = map.values();
		Iterator<ToDoVO> it = col.iterator();		
		
		while(it.hasNext()) {
			ToDoVO cust = it.next();
			list.add(cust);
		}
		return list;
	}

	@Override
	public ToDoVO update(String id) throws NotFoundException {
		// 해당 ID는 완료처리해서 true값으로 바꾸어줌.
		ToDoVO c = null;
		if(! map.containsKey(id)) {
			throw new NotFoundException("해당 번호를 찾을 수 업습니다.");
		}
		c = map.get(id);
		if(c.isDone() == true) {
			throw new NotFoundException("이미 완료한 항목입니다.");
		}
		c.setDone(true);
		return c;
	}

	@Override
	public ArrayList<ToDoVO> search(String when) throws NotFoundException {
		ArrayList<ToDoVO> list = new ArrayList<>();	
		Collection<ToDoVO> col = map.values();
		Iterator<ToDoVO> it = col.iterator();
		while(it.hasNext()) {
            ToDoVO cust = it.next();
            if(cust.getWhen().equals(when)) {
                list.add(cust);
            }else {
            	throw new NotFoundException("해당 날짜를 찾을 수 업습니다.");
            }
            
		}
		return list;

	}

}
