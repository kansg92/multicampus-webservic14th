package cust;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectItem2 {

	public static void main(String[] args) {
		// JDBC(Java Database Connectivity) Program
		// java projcet에 mysql connector apply하기.
		
		// 변수 선언
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
		// root로 접속을 보안상이유로 막아놓은다.
		String mid = "admin1";
		String mpwd = "111111";
		try {
			con = DriverManager.getConnection(url,mid,mpwd);
			System.out.println("MySQL Server Connected...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// SQL을 이용한 요청
		try {
			ps = con.prepareStatement(sql);
	
			// 요청 결과를 확인.
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
			// 예외 상황이 발생하여도 close를 해주어야함.
			// MySQL Close -> !!! close를 안해주면 MYSQL에 쓰레기가 남아 DB가 터질 수 있다.!!!
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
