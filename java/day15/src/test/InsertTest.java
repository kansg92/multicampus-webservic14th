package test;

import dao.BookDao;
import frame.Dao;
import vo.BookVo;

public class InsertTest {

	public static void main(String[] args) {
		Dao<String, BookVo> dao = new BookDao();
		
		BookVo b = new BookVo("어린 왕자","생텍쥐페리", "9788932917245");
	
		try {
			dao.insert(b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
