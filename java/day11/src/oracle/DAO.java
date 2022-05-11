package oracle;

import java.util.ArrayList;

public interface DAO {
	
	// 인터페이스는 기능만 정의하는곳에 일반함수를 넣기위해 default를 따로 정의함.
	public default void connect() {	
		System.out.println("Connect .....");
	}
	
	public default void close() {
		System.out.println("close .....");
	}
	
	// CRUD
	public void insert(CustomerVO c) throws DuplicatedIDException ;    // DuplicatedIDException
	public void delete(String id) throws NotFoundException;		// NotFoundException
	public void update(CustomerVO c) throws NotFoundException; 	// NotFoundException
	public CustomerVO select(String id) throws NotFoundException;		// NotFoundException
	public ArrayList<CustomerVO> select() throws NotFoundException;		// NotFoundException


}
