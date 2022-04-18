package p12_procedure;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	//오라클 접속 인스턴스
	//싱글톤패턴 : 인스턴스를 하나만 만들고 재사용
	private static Connection conn = null; 
	//컨넥션 인스턴스를 반환하는 메소드
	public static Connection getConnection() {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // xe-->db명
		String user = "hr";
		String password = "hr";
		
		try {
			//드라이버가 로딩되어 있지 않거나 컨넥션이 끊여졌다면
			if (conn == null || conn.isClosed()) {
				//드라이버 로딩
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//컨넥션인스턴스 생성
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("성공");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실퍠");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("컨넥션 실패");
			e.printStackTrace();
		}
		
		return conn;
	}
	
	//접속 해제 메소드
	public static void dbClose() {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
				System.out.println("연결해제");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
