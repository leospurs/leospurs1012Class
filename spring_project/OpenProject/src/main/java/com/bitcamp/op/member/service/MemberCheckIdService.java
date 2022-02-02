package com.bitcamp.op.member.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.op.member.dao.MemberDao;

@Service
public class MemberCheckIdService {

	private MemberDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	// userid를 파라미터로 받아 
	public int checkId(String userid) {
		
		dao = template.getMapper(MemberDao.class);
		return dao.selectCountByUserId(userid);
	}
}
