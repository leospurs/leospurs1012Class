package guestbook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import guestbook.domain.WriteRequest;
import jdbc.util.JdbcUtil;

// 방명록 데이터 베이스 처리를 위한 Dao 클래스(CRUD)
public class GuestBookDao {
	
	// 싱글톤 패턴
	private GuestBookDao() {}
	
	private static GuestBookDao dao = new GuestBookDao();
	
	public static GuestBookDao getInstance() {
		return dao;
	}
	
	// 
	public int insertArticle(Connection conn, WriteRequest writeRequest) throws SQLException {
		
		int resultCnt = 0;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO guestbook (subject, content, memberidx) VALUES (?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, writeRequest.getSubject());
			pstmt.setString(2, writeRequest.getContent());
			pstmt.setInt(3, writeRequest.getMemberIdx());
			
			// sql문 실행 후 실행 횟수(작업한 행의 개수) 반환
			resultCnt = pstmt.executeUpdate();
			
		} finally {
			JdbcUtil.close(pstmt);
		} 
		return resultCnt;
	}
}
