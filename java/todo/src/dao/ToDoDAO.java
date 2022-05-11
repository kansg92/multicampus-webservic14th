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
			throw new Exception("�ߺ��� ��ȣ�Դϴ�.");
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
        		System.out.println(key.getOrder()+"�����Ϸ�.");
            }            
		}
	}

	@Override
	public ToDoVO update(String k) throws Exception {
		ToDoVO key = null;
		if(! map.containsKey(k)) {
			throw new Exception("�ش� ��ȣ�� ã���� �����ϴ�.");
		}		
		key = map.get(k);
		if( key.isDone() == true)  {
			throw new Exception("�ش� order�� �̹� �Ϸ��� �׸��Դϴ�.");
		}
		key.setDone(true);
		return key;
	}

	@Override
	public ToDoVO select(String k) throws Exception {
		ToDoVO c = null;
		if(! map.containsKey(k)) {
			throw new Exception("�ش� ��ȣ�� ã�� �� �����ϴ�.");
		}
		c = map.get(k);
		return c;
	}

	@Override
	public List<ToDoVO> select() throws Exception {
		ArrayList<ToDoVO> list = new ArrayList<>();	
		if(map.size()==0) {
			throw new Exception("���� ����� �����ϴ�.");
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
			throw new Exception("�ش� ��ȣ�� ã���� �����ϴ�.");
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
