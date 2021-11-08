package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class jdbcPreparedStatementDMLTest {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// 1. 드라이버 로드 : 프로그램에서 한번만 실행하면 된다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 연결 : Connection
			//String jdbcUrl = "jdbc:oracle:thin:@[주소]:[포트]:[데이터 베이스]";
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pw = "tiger";
			
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			
			System.out.println("데이터베이스 연결 성공!");
			
			// 3. 작업 : CRUD -> PreparedStatement객체 생성
			String sql = "insert into dept values (?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 70);
			pstmt.setString(2, "DEV");
			pstmt.setString(3,"PUSAN");
			
			// DML 실행
			int resultCnt = pstmt.executeUpdate();
			
			if(resultCnt > 0) {
				System.out.println("입력되었습니다.");
			} else {
				System.out.println("입력 실패");
			}
			
		
			// 4. 종료 : close()
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 클래스를 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("데이터베이스에 연결할 수 없습니다. 연결 실패!");
			e.printStackTrace();
		} finally {
			
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	

	}
}
