package frame;

	public class Sql {
		
		public static String insert = "INSERT INTO BOOK VALUES (NULL,?,?,?,1)";
		public static String delete = "DELETE FROM BOOK WHERE id=?";
		public static String update = "UPDATE BOOK SET status=? WHERE title=?";
		public static String select = "SELECT * FROM BOOK WHERE title=?";
		public static String selectAll = "SELECT * FROM BOOK";
		
	}
	
	

