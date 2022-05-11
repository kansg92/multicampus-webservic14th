package oracle;

public class UpdatedTestApp {

	public static void main(String[] args) {
		DAO dao = new CustomerDAO();
		
		CustomerVO c1 = new CustomerVO("id01", "pwd01", "lee");
	
		try {
			dao.update(c1);
			System.out.println("completed....");
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
