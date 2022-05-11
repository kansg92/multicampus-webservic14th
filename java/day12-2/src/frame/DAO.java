package frame;

import java.util.List;

public interface DAO<K,V> {
	
	// Object Ŭ������ ����, � �����͸� ����־ �Ǵ� ǥ�� ������ ��.
	public void insert(V v) throws Exception ;    // DuplicatedIDException
	public void delete(K k) throws Exception;		// NotFoundException
	public void update(V v) throws Exception; 	// NotFoundException
	public V select(K k) throws Exception;		// NotFoundException
	public List<V> select() throws  Exception;		// NotFoundException


}
