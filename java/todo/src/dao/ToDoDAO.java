package dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import frame.DAO;
import vo.ToDoVO;


public class ToDoDAO implements DAO<String, ToDoVO> {

	HashMap<String, ToDoVO> map ;
	
	public ToDoDAO() {
		map = new HashMap<String, ToDoVO>();
	}
	
	
	@Override
	public void insert(ToDoVO v) throws Exception {
		String key = v.getOrder();
		if(map.containsKey(key)) {
			throw new Exception("중복된 번호입니다.");
		}
		map.put(key, v);		
	}

	@Override
	public void delete() throws Exception {
		Collection<ToDoVO> col = map.values();
		Iterator<ToDoVO> it = col.iterator();
		while(it.hasNext()) { 
			 ToDoVO key = it.next();
        	if(key.isDone() == true) {
        		map.remove(key.getOrder());
        		System.out.println(key.getOrder()+"삭제완료.");
            }            
		}
	}

	@Override
	public ToDoVO update(String k) throws Exception {
		ToDoVO key = null;
		if(! map.containsKey(k)) {
			throw new Exception("해당 번호를 찾을수 업습니다.");
		}		
		key = map.get(k);
		if( key.isDone() == true)  {
			throw new Exception("해당 order는 이미 완료한 항목입니다.");
		}
		key.setDone(true);
		return key;
	}

	@Override
	public ToDoVO select(String k) throws Exception {
		ToDoVO c = null;
		if(! map.containsKey(k)) {
			throw new Exception("해당 번호를 찾을 수 업습니다.");
		}
		c = map.get(k);
		return c;
	}

	@Override
	public List<ToDoVO> select() throws Exception {
		ArrayList<ToDoVO> list = new ArrayList<>();	
		if(map.size()==0) {
			throw new Exception("현재 목록이 없습니다.");
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
	public List<ToDoVO> search(String k) throws Exception {
		if(! map.containsKey(k)) {
			throw new Exception("해당 번호를 찾을수 업습니다.");
		}	
		ArrayList<ToDoVO> list = new ArrayList<>();		
		Collection<ToDoVO> col = map.values();
		Iterator<ToDoVO> it = col.iterator();	
		while(it.hasNext()) { 
        	ToDoVO cust = it.next();
            if(cust.getWhen().equals(k)) {
            	cust = it.next();
            	list.add(cust);
            }           
		}
		return list;
	}

}
