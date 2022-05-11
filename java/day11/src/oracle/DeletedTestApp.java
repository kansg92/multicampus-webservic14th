package oracle;

public class DeletedTestApp {

	public static void main(String[] args) {
		DAO dao = new CustomerDAO();
		
		CustomerVO c1 = new CustomerVO("id01", "pwd01", "lee");
	
		try {
			dao.insert(c1);
			System.out.println("completed");
			dao.delete("id01");
			System.out.println("completed");
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		} catch (DuplicatedIDException e) {
			System.out.println(e.getMessage());
		}

	}

}
