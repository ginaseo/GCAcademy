package p10_zodiac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import p08_jdbc.DBConn;

public class MemberDAO {
	Connection conn = DBConn.getConnection();
	PreparedStatement pstmt;
	String sql;
	
	//회원 insert
	void insert(Member member) {
		sql = "insert into member(userid, year) values (?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,member.getUserid() );
			pstmt.setInt(2, member.getYear());
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건이 추가");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//회원한명 조회
	Member selectOne(String userid) {
		Member member = null;
		sql = "select * from member\r\n" + 
				"where userid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				member = new Member();
				member.setUserid(rs.getString("userid"));
				member.setYear(rs.getInt("year"));
				member.setRegdate(rs.getString("regdate"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}
	
	
	
}
