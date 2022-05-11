package ws;

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
	public void insert(ToDoVO c) {
		String key = c.getId();
		map.put(key, c);
	}

	@Override
	// true�� �Ȱ��� ����.
	public void delete(String id) {	
		
		// 1. false��ã�´�.
		// 2. key�� �̾Ƴ���.
		// 3. �����.
		map.remove(id);
	}

	@Override
	public ToDoVO select(String id) {
		ToDoVO c = null;
		c = map.get(id);
		return c;
	}

	@Override
	public ArrayList<ToDoVO> select() {
		Collection<ToDoVO> col = map.values();
		Iterator<ToDoVO> it = col.iterator();		
		ArrayList<ToDoVO> list = new ArrayList<>();	
		while(it.hasNext()) {
			ToDoVO cust = it.next();
			list.add(cust);
		}
		return list;
	}

	@Override
	public ToDoVO update(String id) {
		// �ش� ID�� �Ϸ�ó���ؼ� true������ �ٲپ���.
		ToDoVO c = null;
		c = map.get(id);	
		c.setDone(true);
		return c;
	}

	@Override
	public ArrayList<ToDoVO> search(String when) {
		ArrayList<ToDoVO> list = new ArrayList<>();	
		Collection<ToDoVO> col = map.values();
		Iterator<ToDoVO> it = col.iterator();
		while(it.hasNext()) {
            ToDoVO cust = it.next();
            if(cust.getWhen().equals(when)) {
                list.add(cust);
            }
		}
		return list;

	}

}
