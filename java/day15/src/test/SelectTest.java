package test;

import dao.BookDao;
import frame.Dao;
import vo.BookVo;

public class SelectTest {

	public static void main(String[] args) {
		Dao<String, BookVo> dao = new BookDao();
		
		BookVo book = null;
		
		try {
			book = dao.select("»¡°­¸Ó¸® ¾ØÀÌ ÇÏ´Â ¸»");
			System.out.println(book);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
