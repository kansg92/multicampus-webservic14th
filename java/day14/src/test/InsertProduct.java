package test;

import dao.ProductDao;
import frame.Dao;
import vo.ProductVo;

public class InsertProduct {

	public static void main(String[] args) {
		Dao<Integer,ProductVo> dao = new ProductDao();
		ProductVo p = new ProductVo("shirts", 20000, 3.5);
		try {
			dao.insert(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
