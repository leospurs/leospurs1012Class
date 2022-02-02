package com.bitcamp.op.member.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.op.member.domain.LoginParams;
import com.bitcamp.op.member.domain.Member;

@Repository
public class MybatisMemberDao {
	
	@Autowired
	private SqlSessionTemplate session;
	
	
	private final String NAME_SPACE = "com.bitcamp.op.member.dao.mapper.MemberMapper";
	
	
	public Member selectByIdPw(LoginParams params) {
		return session.selectOne(NAME_SPACE + ".selectByIdPw", params);
	}
	
	public int selectTotalCount() {
		return session.selectOne(NAME_SPACE+".selectTotalCount");
	}
	
}
