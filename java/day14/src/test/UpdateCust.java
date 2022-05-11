package test;

import dao.CustDao;
import frame.Dao;
import vo.CustVo;

public class UpdateCust {

	public static void main(String[] args) {
		Dao dao = new CustDao();
		
		CustVo cust = new CustVo("id777", "pwd777", "Ä¥Ä¥¸»¼÷");
		
		try {
			dao.update(cust);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}
		
	}

}
