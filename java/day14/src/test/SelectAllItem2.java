package test;

import java.util.List;

import dao.ItemDao;
import frame.Dao;
import vo.ItemVo;

public class SelectAllItem2 {

	public static void main(String[] args) {
		Dao<Integer, ItemVo> dao = new ItemDao();
		List<ItemVo> list = null;
		
		try {
			list = dao.selectAll();
			for (ItemVo itemVo : list) {
				System.out.println(itemVo);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		

	}

}
