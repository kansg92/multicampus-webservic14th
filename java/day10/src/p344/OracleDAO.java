package p344;

import java.util.ArrayList;

public class OracleDAO {
	
	public void connect() {
		System.out.println("Oracle server Connected ......");
	}
	
	public void close() {
		System.out.println("Oracle server Closed ......");
	}
	
	public void insert(CustomerVO c) {
		connect();
		System.out.println(c);
		System.out.println("Inserted ....");
		close();
	}
	public void delete(String id) {
		connect();
		System.out.println(id);
		System.out.println("Deleteed ....");
		close();
	}
	
	public CustomerVO select(String id) {
		connect();
		String pwd = "pwd01";
		String name = "james";
		CustomerVO c = new CustomerVO(id, pwd, name);
		close();
		System.out.println("Seleteed ....");
		return c;
	}
	public ArrayList<CustomerVO> select(){
		connect();
		ArrayList<CustomerVO> list = new ArrayList<>();
		list.add(new CustomerVO("id01", "pw01", "james"));
		list.add(new CustomerVO("id02", "pw02", "tom"));
		list.add(new CustomerVO("id03", "pw03", "john"));
		System.out.println("Seleteed All....");
		close();
		return list;
	}
}
