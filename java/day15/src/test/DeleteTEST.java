package test;

import dao.BookDao;
import frame.Dao;
import vo.BookVo;

public class DeleteTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dao<String, BookVo> dao = new BookDao();
		
		try {
			dao.delete("1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
