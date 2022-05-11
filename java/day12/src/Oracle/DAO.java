package Oracle;

import java.util.ArrayList;

public interface DAO {
	
	// 인터페이스는 기능만 정의하는곳에 일반함수를 넣기위해 default를 따로 정의함.
	public default void connect() {	
		System.out.println("Connect .....");
	}
	
	public default void close() {
		System.out.println("close .....");
	}
	
	// Object 클래스를 쓰면, 어떤 데이터를 집어넣어도 되는 표준 스펙이 됨.
	public void insert(Object obj) throws Exception ;    // DuplicatedIDException
	public void delete(Object obj) throws Exception;		// NotFoundException
	public void update(Object obj) throws Exception; 	// NotFoundException
	public Object select(Object obj) throws Exception;		// NotFoundException
	public ArrayList<Object> select() throws  Exception;		// NotFoundException


}
