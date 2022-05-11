package p346;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;


public class OracleDAO implements DAO, Search {

	HashMap<String, CustomerVO> map;
	
	public OracleDAO() {
		map = new HashMap<String, CustomerVO>();
	}
	
	@Override
	public void insert(CustomerVO c) {
		String key = c.getId();
		map.put(key, c);
	}

	@Override
	public void delete(String id) {
		map.remove(id);
	}

	@Override
	public CustomerVO select(String id) {
		CustomerVO c = null;
		c = map.get(id);

		return c;
	}

	@Override
	public ArrayList<CustomerVO> select() {
		Collection<CustomerVO> col = map.values();
		Iterator<CustomerVO> it = col.iterator();
		
		ArrayList<CustomerVO> list = new ArrayList<>();	
		while(it.hasNext()) {
			CustomerVO cust = it.next();
			list.add(cust);
		}
		return list;
	}

	@Override
	public void update(CustomerVO c) {

		String key = c.getId();
		map.put(key, c);

	}

	@Override
	public ArrayList<CustomerVO> search(String name) {
		  ArrayList<CustomerVO> list = new ArrayList<CustomerVO>();	        
	        Collection<CustomerVO> col = map.values();
	        Iterator<CustomerVO> it = col.iterator();

	        while(it.hasNext()) {
	            CustomerVO cust = it.next();
	            if(cust.getName().equals(name)) {
	                list.add(cust);
	            }
	        }	        
	        return list;
	}

	@Override
	public ArrayList<CustomerVO> search() {
		// TODO Auto-generated method stub
		return null;
	}





	
	
	
	
	
}	
