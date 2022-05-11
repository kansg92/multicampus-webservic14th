package p346;

import java.util.ArrayList;

public interface DAO {
	
	// 인터페이스는 기능만 정의하는곳에 일반함수를 넣기위해 default를 따로 정의함.
	public default void connect() {	
	}
	
	public default void close() {
	}
	
	public void insert(CustomerVO c);
	public void delete(String id);
	public void update(CustomerVO c);
	public CustomerVO select(String id);
	public ArrayList<CustomerVO> select();
	public ArrayList<CustomerVO> search();


}
