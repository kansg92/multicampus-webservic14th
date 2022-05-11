package cust;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectItem2 {

	public static void main(String[] args) {
		// JDBC(Java Database Connectivity) Program
		// java projcet�� mysql connector apply�ϱ�.
		
		// ���� ����
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM ITEM";
		
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
	
			// ��û ����� Ȯ��.
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String price = rs.getString("price");
				System.out.println(id+" "+name+" "+price);
			}
			

			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			// ���� ��Ȳ�� �߻��Ͽ��� close�� ���־����.
			// MySQL Close -> !!! close�� �����ָ� MYSQL�� �����Ⱑ ���� DB�� ���� �� �ִ�.!!!
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
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
