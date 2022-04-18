package p12_procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class J201230_02_point {

	public static void main(String[] args) {
		// 회원가입 후 포인터 테이블에 insert 또는 update
		Connection conn = DBConn.getConnection();
		String sql = "{call mpointInsertUpdate(?,?)}";
		
		try {
			CallableStatement cstmt = conn.prepareCall(sql);
			cstmt.setString(1, "lee");
			cstmt.setInt(2, 10000);
			cstmt.executeQuery();
			System.out.println("적립되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
	
	}

	
		
	}


