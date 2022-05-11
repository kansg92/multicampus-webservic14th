package p345;

import java.util.ArrayList;

public class MariadbDAO implements DAO {

	@Override
	public void insert(CustomerVO c) {
		connect();
		System.out.println("Mairadb Inserted:"+c);
		close();
	}

	@Override
	public void delete(String id) {
		connect();
		System.out.println("Mairadb Inserted:"+id);
		close();
	}

	@Override
	public CustomerVO select(String id) {
		connect();
		System.out.println("Mairadb Selec:");
		String pwd = "pwd01";
		String name = "james";
		CustomerVO c = new CustomerVO(id, pwd, name);
		close();
		return c;
	}

	@Override
	public ArrayList<CustomerVO> select() {
		connect();
		System.out.println("Mairadb Selected All");
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
