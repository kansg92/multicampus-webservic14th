package p345;

import java.util.ArrayList;


public class OracleDAO implements DAO {

	@Override
	public void insert(CustomerVO c) {
		connect();
		System.out.println("Oracle Inserted:" + c);
		close();
	}

	@Override
	public void delete(String id) {
		connect();
		System.out.println("Oracle Deleted:" + id);
		close();
	}

	@Override
	public CustomerVO select(String id) {
		connect();
		System.out.println("Oracle selected:" + id);
		CustomerVO c = new CustomerVO("id01","pw01","james");
		close();
		return c;
	}

	@Override
	public ArrayList<CustomerVO> select() {
		connect();
		System.out.println("Oracle selected ALL:");
		ArrayList<CustomerVO> list = new ArrayList<>();
		list.add(new CustomerVO("id01", "pw01", "james"));
		list.add(new CustomerVO("id02", "pw02", "tom"));
		list.add(new CustomerVO("id03", "pw03", "john"));
		close();
		return list;
	}

	@Override
	public void update(CustomerVO c) {
		// TODO Auto-generated method stub
		
	}

}
