package test;

import java.util.List;

import dao.BookDao;
import frame.Dao;
import vo.BookVo;

public class SelectAlltest {

	public static void main(String[] args) {
		Dao<String, BookVo> dao = new BookDao();
		List<BookVo> list = null;
		
		try {
			list = dao.selectAll();
			for (BookVo b : list) {
				System.out.println(b);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
