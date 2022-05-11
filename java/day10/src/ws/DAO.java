package ws;

import java.util.ArrayList;


public interface DAO {
	

	public void insert(ToDoVO c);
	public void delete(String id);
	public ToDoVO update(String id);
	public ToDoVO select(String id);
	public ArrayList<ToDoVO> select();
	
	
}
