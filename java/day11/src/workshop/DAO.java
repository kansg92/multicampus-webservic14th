package workshop;

import java.util.ArrayList;

public interface DAO {
	public void insert(ToDoVO c)  throws DuplicatedIDException;
	public void delete(String id) throws NotFoundException;
	public ToDoVO update(String id)throws NotFoundException;
	public ToDoVO select(String id)throws NotFoundException;
	public ArrayList<ToDoVO> select()throws NotFoundException;
	
}
