package Oracle;

public class ItemTestApp {

	public static void main(String[] args) {
		DAO dao = new ItemDAO();
		
		ItemVO item = new ItemVO(100,"Pants",10000);
		try {
			dao.insert(100);
			
			dao.delete(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
