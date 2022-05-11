package test;

import dao.BookDao;
import frame.Dao;
import vo.BookVo;

public class Update0TEST {

	public static void main(String[] args) {
		Dao<String, BookVo> dao = new BookDao();
		
		try {
			dao.update0("¾î¸° ¿ÕÀÚ");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
