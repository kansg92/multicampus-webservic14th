package frame;

import java.util.List;

public interface DAO<K, V> {
	public void insert(V v)  throws Exception;
	public void delete() throws Exception;
	public V update(K k)throws Exception;
	public V select(K k)throws Exception;
	public List<V> select()throws Exception;
	public List<V> search(K k) throws Exception;
	
}
