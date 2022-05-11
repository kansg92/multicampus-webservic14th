package p346;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		// map - <key, value>
		HashMap<String, CustomerVO> map = new HashMap<String, CustomerVO>();
		
		// insert
		CustomerVO c1 = new CustomerVO("id01","pwd01","james1");
		CustomerVO c2 = new CustomerVO("id02","pwd02","james2");
		CustomerVO c3 = new CustomerVO("id03","pwd03","james3");
		CustomerVO c4 = new CustomerVO("id04","pwd04","james4");
		CustomerVO c5 = new CustomerVO("id05","pwd05","james5");
		
		map.put("id01", c1);
		map.put("id02", c2);
		map.put("id03", c3);
		map.put("id04", c4);
		map.put("id05", c5);
		
		// select
		String id = "id03";
		CustomerVO c = map.get(id);
		System.out.println(c);
		
		// delete
		map.remove("id02");
		
		// update
		CustomerVO cc = new CustomerVO("id03", "ppp03", "tom");
		map.put("id03", cc);
		
		// select all
		Collection<CustomerVO> col = map.values();
		Iterator<CustomerVO> it = col.iterator();
		
		ArrayList<CustomerVO> list = new ArrayList<>();	
		while(it.hasNext()) {
			CustomerVO cust = it.next();
			list.add(cust);
		}
		
		for (CustomerVO customerVO : list) {
			System.out.println(customerVO);
		}
	}

}
