package cust;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateItem {

	public static void main(String[] args) {
		// JDBC(Java Database Connectivity) Program
		// java projcet�� mysql connector apply�ϱ�.
		
		// ���� ����
		Connection con = null;
		PreparedStatement ps = null;
		//// SQL��� ������ �־ ����.
		String sql = "UPDATE ITEM SET name=?, price=? WHERE id=?";
		
		// MySQO JDBC Driver Loading 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL JDBC Driver Loading");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// MySQL Connect
		String url = "jdbc:mysql://192.168.0.14/shopdb?serverTimezone=Asia/Seoul";
		// root�� ������ ���Ȼ������� ���Ƴ�����.
		String mid = "admin1";
		String mpwd = "111111";
		try {
			con = DriverManager.getConnection(url,mid,mpwd);
			System.out.println("MySQL Server Connected...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// SQL�� �̿��� ��û
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, "coat");
			ps.setFloat(2, 98000);
			ps.setInt(3, 100);
			// ��û ����� Ȯ��.
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			// ���� ��Ȳ�� �߻��Ͽ��� close�� ���־����.
			// MySQL Close -> !!! close�� �����ָ� MYSQL�� �����Ⱑ ���� DB�� ���� �� �ִ�.!!!
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
