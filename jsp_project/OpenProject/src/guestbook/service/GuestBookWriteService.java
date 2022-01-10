package guestbook.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guestbook.dao.GuestBookDao;
import guestbook.domain.WriteRequest;
import jdbc.ConnectionProvider;

// 방명록 쓰기에 대한 데이터 가공 클래스
public class GuestBookWriteService {
	
	// 싱글톤 패턴
	private GuestBookWriteService() {}
	
	private static GuestBookWriteService service = new GuestBookWriteService();

	public static GuestBookWriteService getInstance() {
		return service;
	}
	
	
	
	public int writeArticle(HttpServletRequest request, HttpServletResponse response) {
		
		int resultCnt = 0;
		
		// 데이터 베이스 연결을 위한 변수
		Connection conn;
		
		try {
			// 데이터베이스 연결
			conn = ConnectionProvider.getConnection();
			
			String memberIdx = request.getParameter("memberIdx");
			String subject = request.getParameter("subject");
			String content = request.getParameter("content");
			
			WriteRequest writeRequest = new WriteRequest(Integer.parseInt(memberIdx), subject, content);
			
			resultCnt = GuestBookDao.getInstance().insertArticle(conn, writeRequest);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resultCnt;
	}
}
