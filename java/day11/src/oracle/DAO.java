package oracle;

import java.util.ArrayList;

public interface DAO {
	
	// �������̽��� ��ɸ� �����ϴ°��� �Ϲ��Լ��� �ֱ����� default�� ���� ������.
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
