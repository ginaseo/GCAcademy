package p08_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class J201223_01_Conn {

	public static void main(String[] args) {
		// 오라클 접속 테스트
		//오라클 접속 참조변수(인스턴스선언)
		Connection con = null; 
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="hr";
		String password="hr";
		try {
			//오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("로딩 완료");
			//컨넥션 객체 생성
			con = DriverManager.getConnection(url, user, password);
			System.out.println("컨넥션 완료");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("컨넥션 실패");
			e.printStackTrace();
		}
		System.out.println(con);
		
		//데이터 가져오기 
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select job_id, job_title from jobs";
		try {
			stmt =con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String job_id = rs.getString("job_id");
				String job_title = rs.getString("job_title");
				System.out.println(job_id + " " + job_title);
			}
			
		} catch (SQLException e) {
			System.out.println("sql문 예외");
			e.printStackTrace();
		}finally { //예외가 발행하든지 안하든지 무조건 실행
			try {
				if (rs != null) rs.close();
				if (stmt!= null) stmt.close();
				if (con != null) con.close();				
			} catch (SQLException e) {
				System.out.println("close 예외");
				e.printStackTrace();
			}

		}
		
	}

}
