package com.bitcamp.op.member.service;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.bitcamp.op.member.dao.MemberDao;
import com.bitcamp.op.member.domain.MemberRegRequest;

@Service
public class MemberRegService {

	//@Autowired
	//private MemberDao dao;
	
	// @Autowired
	// private JdbcTemplateMemberDao dao;
	
	private MemberDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	// 회원 가입 정보 입력 메소드
	public int insertMember(MemberRegRequest regRequest, HttpServletRequest request)
			throws IllegalStateException, IOException, SQLException {
		
		// 회원가입 결과 view 페이지에서 회원가입 여부를 판단할 때 사용하기 위한 변수
		int resultCnt = 0;

		// 기본 이미지 설정
		regRequest.setFileName("starwars.png");
		
		// DB 관련 예외 발생 시 삭제 처리를 위한 File 객체 변수 선언
		File newFile = null;

		// 파일이 있다면 -> 파일 저장
		if (!regRequest.getPhoto().isEmpty() && regRequest.getPhoto().getSize() > 0) {
			// 시스템의 경로
			String savePath = request.getSession().getServletContext().getRealPath(CommonsData.SAVE_URI);
			String[] files = regRequest.getPhoto().getOriginalFilename().split("\\.");
			String exet = files[files.length - 1];
			String newFileName = System.nanoTime() + "." + exet;
			newFile = new File(savePath, newFileName);
			regRequest.getPhoto().transferTo(newFile);
			regRequest.setFileName(newFileName);
		}

		// DAO 를 이용해서 데이터 베이스 처리
		//Connection conn = null;

		try {
			//conn = ConnectionProvider.getConnection();
			//resultCnt = dao.insertMember(conn, regRequest);
			
			System.out.println("idx => " + regRequest.getIdx());
			
			dao = template.getMapper(MemberDao.class);

			// resultCnt = dao.insertMember(regRequest);			
			// resultCnt = dao.insert(regRequest);
			resultCnt = dao.insertMember(regRequest);
			
			System.out.println("idx => " + regRequest.getIdx());
			// 하위 테이블의 외래키로 사용해서 insert 가능
			
		} catch (Exception e) {
			// 파일이 저장된 후 DB관련 예외가 발생했을 때 : 저장했던 파일을 삭제 
			if(newFile != null && newFile.exists()) {
				newFile.delete();
			}
			e.printStackTrace();
			throw e;
		}

		return resultCnt;

	}

}
