package test;

import dao.ItemDao;
import frame.Dao;
import vo.ItemVo;

public class DeleteItem {

	public static void main(String[] args) {
		Dao<Integer, ItemVo> dao = new ItemDao();
		
		try {
			dao.delete(1111);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
