package frame;

public class Sql {
	public static String insertCust = "INSERT INTO CUST VALUES (?,?,?)";
	public static String deleteCust = "DELETE FROM CUST WHERE id=?";
	public static String updateCust = "UPDATE CUST SET pwd=?, name=? WHERE id=?";
	public static String selectCust = "SELECT * FROM CUST WHERE id = ?";
	public static String selectAllCust = "SELECT * FROM CUST";
	
	public static String insertItem = "INSERT INTO ITEM VALUES (?,?,?)";
	public static String deletetItem = "DELETE FROM ITEM WHERE id=?";
	public static String updateItem = "UPDATE ITEM SET name=?, price=? WHERE id=?";
	public static String selectItem = "SELECT * FROM ITEM WHERE id = ?";
	public static String selectallItem = "SELECT * FROM ITEM";
	
	public static String insertProduct = "INSERT INTO PRODUCT VALUES (NULL, ?, ?, SYSDATE(), ?)";
	public static String deleteProduct = "DELETE FROM PRODUCT WHERE id=?\"";
	public static String updateProduct = "UPDATE PRODUCT SET name=?, price=?, rate=? WHERE id=?";
	public static String selectProduct = "SELECT * FROM PRODUCT WHERE id = ?";
	public static String selectAllProduct = "SELECT * FROM PRODUCT";
}
