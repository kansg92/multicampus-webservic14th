package p346;

import java.util.ArrayList;

public interface DAO {
	
	// �������̽��� ��ɸ� �����ϴ°��� �Ϲ��Լ��� �ֱ����� default�� ���� ������.
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
