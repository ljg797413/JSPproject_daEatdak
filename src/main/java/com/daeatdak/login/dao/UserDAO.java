package com.daeatdak.login.dao;

import org.apache.ibatis.session.SqlSession;

import com.daeatdak.login.dto.UserDTO;
import com.mybatis.config.MyBatisConfig;

public class UserDAO {

	public SqlSession sqlSession;
	
	public UserDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public UserDTO login(UserDTO userDTO) {
		System.out.println("왔는지 보자");
		
		UserDTO user = sqlSession.selectOne("user.login", userDTO);
//		if(userDTO.getUserName().equals(user.getUserName())) {
//			System.out.println("111111111111111111111111");
//		} else if(userDTO.getUserPassword().equals(user.getUserPassword())) {
//			System.out.println("888888888888888888888888");
//		}
		
		return user;
	}
}