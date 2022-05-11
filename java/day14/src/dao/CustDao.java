package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import frame.Dao;
import frame.Sql;
import vo.CustVo;

public class CustDao extends Dao<String, CustVo> {


	@Override
	public void insert(CustVo v) throws Exception {
		// Connection
		// 해당 변수는 각 함수마다 선언해주어야함. 외부에 만들시 동시다발적으로 이뤄질 경우 충돌이 날 수 있음.
		Connection con = null;
		PreparedStatement ps = null;		
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.insertCust);
			ps.setString(1, v.getId());
			ps.setString(2, v.getPwd());
			ps.setString(3, v.getName());
			ps.executeUpdate();		
		} catch(Exception e) {
			throw e;
		}finally {
			close(ps);
			close(con);
		}
	}
	
	@Override
	public void delete(String k) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.deleteCust);
			ps.setString(1, k);
			ps.executeUpdate();	
		} catch (Exception e) {
			throw e;
		} finally {
			close(ps);
			close(con);
		}

		
	}

	@Override
	public void update(CustVo v) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.updateCust);
			ps.setString(1, v.getPwd());
			ps.setString(2, v.getName());
			ps.setString(3, v.getId());
			ps.executeUpdate();	
		}catch(Exception e){
			throw e;
		}finally {
			close(ps);
			close(con);
		}
	}

	@Override
	public CustVo select(String k) throws Exception {
		CustVo cust = null;
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectCust);
			ps.setString(1, k);
			rs = ps.executeQuery();	
			rs.next();
			String id = rs.getString("id");
			String pwd = rs.getString("pwd");
			String name = rs.getString("name");
			cust = new CustVo(id,pwd,name);			
			
		}catch(Exception e){
			throw e;
		}finally {
			close(ps);
			close(con);
			close(rs);
		}		
	
		return cust;
	}

	@Override
	public List<CustVo> selectAll() throws Exception {
		List<CustVo> list = new ArrayList<CustVo>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectAllCust);
			rs = ps.executeQuery();	
			while(rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				CustVo cust = new CustVo(id,pwd,name);	
				list.add(cust);
			}	
			
		}catch(Exception e){
			throw e;
		}finally {
			close(ps);
			close(con);
			close(rs);
		}		
	
		return list;
	}

}
