package com.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.frame.Service;
import com.mapper.UserMapper;
import com.vo.UserVO;

@org.springframework.stereotype.Service("uservice")
public class UserService implements Service<String, UserVO> {
	
	@Autowired //�ڵ����� dao�����Ѱ��� �˻��ؼ� ��������� ��.
	UserMapper dao;

	@Override
	public void register(UserVO v) throws Exception {
		
		dao.insert(v);
	}

	@Override
	public void remove(String k) throws Exception {
	
		dao.delete(k);
	}

	@Override
	public void modify(UserVO v) throws Exception {
		// TODO Auto-generated method stub
		dao.update(v);
	}

	@Override
	public UserVO get(String k) throws Exception {
		// TODO Auto-generated method stub
		return dao.select(k);
	}

	@Override
	public List<UserVO> get() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}
	
	public List<UserVO> searchName(String name) throws Exception{
		return dao.searchName(name);
	}
	
	
	
}
