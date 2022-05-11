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
			throw new DuplicatedIDException("�ߺ��� ��ȣ �Դϴ�.");
		}		
		map.put(key, c);
	}

	@Override
	// true�� �Ȱ��� ����.
	public void delete(String id) throws NotFoundException {		

		// 1. false��ã�´�.
		// 2. key�� �̾Ƴ���.
		// 3. �����.
		if(! map.containsKey(id)) {
			throw new NotFoundException("�ش� ��ȣ�� ã�� �� �����ϴ�.");
		}
		map.remove(id);
	}

	@Override
	public ToDoVO select(String id) throws NotFoundException {
		ToDoVO c = null;
		if(! map.containsKey(id)) {
			throw new NotFoundException("�ش� ��ȣ�� ã�� �� �����ϴ�.");
		}
		c = map.get(id);
		return c;
	}

	@Override
	public ArrayList<ToDoVO> select() throws NotFoundException {
		ArrayList<ToDoVO> list = new ArrayList<>();	
		if(map.size()==0) {
			throw new NotFoundException("���� ����� �����ϴ�.");
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
		// �ش� ID�� �Ϸ�ó���ؼ� true������ �ٲپ���.
		ToDoVO c = null;
		if(! map.containsKey(id)) {
			throw new NotFoundException("�ش� ��ȣ�� ã�� �� �����ϴ�.");
		}
		c = map.get(id);
		if(c.isDone() == true) {
			throw new NotFoundException("�̹� �Ϸ��� �׸��Դϴ�.");
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
            	throw new NotFoundException("�ش� ��¥�� ã�� �� �����ϴ�.");
            }
            
		}
		return list;

	}

}
