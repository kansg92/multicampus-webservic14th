package frame;

import java.util.List;

public interface DAO<K,V> {
	
	// Object 클래스를 쓰면, 어떤 데이터를 집어넣어도 되는 표준 스펙이 됨.
	public void insert(V v) throws Exception ;    // DuplicatedIDException
	public void delete(K k) throws Exception;		// NotFoundException
	public void update(V v) throws Exception; 	// NotFoundException
	public V select(K k) throws Exception;		// NotFoundException
	public List<V> select() throws  Exception;		// NotFoundException


}
