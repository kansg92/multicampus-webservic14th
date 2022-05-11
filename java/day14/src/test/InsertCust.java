package test;

import dao.CustDao;
import frame.Dao;
import vo.CustVo;

public class InsertCust {

	public static void main(String[] args) {
		Dao dao = new CustDao();
		
		CustVo cust = new CustVo("id87", "pwd88", "ÆÈÄ¥¸»¼÷");
		try {
			dao.insert(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		


	}

}
