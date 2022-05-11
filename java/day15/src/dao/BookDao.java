package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import frame.Dao;
import frame.Sql;
import vo.BookVo;

public class BookDao extends Dao<String, BookVo> {

	@Override
	public void insert(BookVo val) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.insert);
			ps.setString(1, val.getTitle());
			ps.setString(2, val.getAuthor());
			ps.setString(3, val.getIsbn());
			ps.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(ps);
			close(con);
		}
		
	}

	@Override
	public void delete(String key) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.delete);
			ps.setString(1, key);
			ps.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(ps);
			close(con);
		}
		
	}

	@Override
	public void update0(String key) throws Exception {
		// 책 대여하면 status 0으로 전환
		Connection con = null;
		PreparedStatement ps = null;		
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.update);
			ps.setInt(1, 0);
			ps.setString(2, key);
			ps.executeUpdate();	
		}catch(Exception e){
			throw e;
		}finally {
			close(ps);
			close(con);
		}		
	}

	@Override
	public void update1(String key) throws Exception {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;		
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.update);
			ps.setInt(1, 1);
			ps.setString(2, key);
			ps.executeUpdate();	
		}catch(Exception e){
			throw e;
		}finally {
			close(ps);
			close(con);
		}	
	}

	@Override
	public BookVo select(String key) throws Exception {
		BookVo book = null;
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.select);
			ps.setString(1, key);
			rs = ps.executeQuery();	
			rs.next();
			String title = rs.getString("title");
			int id = rs.getInt("id");
			String author = rs.getString("author");
			String isbn = rs.getString("isbn");
			int status = rs.getInt("status");
			book = new BookVo(id,title,author,isbn,status);			
			
		}catch(Exception e){
			throw e;
		}finally {
			close(ps);
			close(con);
			close(rs);
		}		
	
		return book;
	}

	@Override
	public List<BookVo> selectAll() throws Exception {
		List<BookVo> list = new ArrayList<BookVo>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectAll);
			rs = ps.executeQuery();	
			while(rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String isbn = rs.getString("isbn");
				int status = rs.getInt("status");
				BookVo book = new BookVo(id, title, author, isbn, status);
				list.add(book);							
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
