package workshop;

import java.util.ArrayList;


public interface Search {
	public ArrayList<ToDoVO> search(String name) throws NotFoundException;
}
