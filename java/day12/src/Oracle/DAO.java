package Oracle;

import java.util.ArrayList;

public interface DAO {
	
	// �������̽��� ��ɸ� �����ϴ°��� �Ϲ��Լ��� �ֱ����� default�� ���� ������.
	public default void connect() {	
		System.out.println("Connect .....");
	}
	
	public default void close() {
		System.out.println("close .....");
	}
	
	// Object Ŭ������ ����, � �����͸� ����־ �Ǵ� ǥ�� ������ ��.
	public void insert(Object obj) throws Exception ;    // DuplicatedIDException
	public void delete(Object obj) throws Exception;		// NotFoundException
	public void update(Object obj) throws Exception; 	// NotFoundException
	public Object select(Object obj) throws Exception;		// NotFoundException
	public ArrayList<Object> select() throws  Exception;		// NotFoundException


}
