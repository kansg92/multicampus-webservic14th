package test;

import dao.CustDao;
import frame.Dao;

public class Deletecust {

	public static void main(String[] args) {
		Dao dao = new CustDao();
		
		try {
			dao.delete("id87");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
