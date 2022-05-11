package test;

import dao.CustDao;
import frame.Dao;
import vo.CustVo;

public class SelectCustTest {

	public static void main(String[] args) {
		Dao<String,CustVo> dao = new CustDao();
		CustVo cust = null;	
		
		try {
			cust = dao.select("id77");
			System.out.println(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
