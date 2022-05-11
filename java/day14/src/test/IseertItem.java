package test;

import dao.ItemDao;
import frame.Dao;
import vo.ItemVo;

public class IseertItem {

	public static void main(String[] args) {
		Dao<Integer, ItemVo> dao = new ItemDao();
		
		ItemVo item = new ItemVo(1111,"TV",1999000);
		
		try {
			dao.insert(item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
