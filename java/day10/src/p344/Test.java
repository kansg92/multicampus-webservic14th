package p344;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// Collection API
		
//		CustomerVO cs[] = new CustomerVO[5];
		
		ArrayList<CustomerVO> list = new ArrayList<>();
		list.add(new CustomerVO("id01", "pw01", "james"));
		list.add(new CustomerVO("id02", "pw02", "tom"));
		list.add(new CustomerVO("id03", "pw03", "john"));
		
		for (CustomerVO c : list) {
			System.out.println(c);
		}
	}

}
