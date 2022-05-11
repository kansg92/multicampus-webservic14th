package test;

import dao.ItemDao;
import frame.Dao;
import vo.ItemVo;

public class SelectItem {

	public static void main(String[] args) {
		Dao<Integer, ItemVo> dao = new ItemDao();
		ItemVo item = null;
		
		try {
			item = dao.select(111);
			System.out.println(item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		

	}

}
