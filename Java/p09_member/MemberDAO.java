package p09_member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//데이터베이스 access
//dao
public class MemberDAO {
	Connection conn = DBConn.getConnection();
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	//autocommit default
	//추가
	void insert(Member m) {
		sql = "insert into member(userid, passwd, email, name, phone) \r\n" + 
				"values(?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getUserid());
			pstmt.setString(2, m.getPasswd());
			pstmt.setString(3, m.getEmail());
			pstmt.setString(4, m.getName());
			pstmt.setString(5, m.getPhone());
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건이 추가");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstmt!=null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//수정
	void update(Member m) {
		sql = "update member " + 
				"set passwd =?, " + 
				"    email = ?, " + 
				"    name = ?, " + 
				"    phone=? " + 
				"where userid=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getPasswd());
			pstmt.setString(2, m.getEmail());
			pstmt.setString(3, m.getName());
			pstmt.setString(4, m.getPhone());
			pstmt.setString(5, m.getUserid());
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건이 수정");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//삭제
	void delete(String userid) {
		sql = "delete from member \r\n" + 
				"where userid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건이 삭제");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	//한건조회
	Member selectOne(String userid) {
		Member member=null;
		sql = "select * from member where userid=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				String passwd = rs.getString("passwd");
				String email = rs.getString("email");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				//java.util.Date : 날짜+시간
				//getDate : 날짜
//				Date regdate = rs.getDate("regdate"); //날짜
				Date regdate = rs.getTimestamp("regdate"); //날짜+시간
				
				member = new Member(userid, passwd, email, name, phone, regdate);
				System.out.println(member);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}
	
	//전체 조회
	List<Member> selectAll() {
		 List<Member> mList = new ArrayList<>();
		 sql = "select * from member";
		 try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String userid = rs.getString("userid");
				String passwd = rs.getString("passwd");
				String email = rs.getString("email");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				Date regdate = rs.getTimestamp("regdate"); //날짜+시간
				Member member = new Member(userid, passwd, email, name, phone, regdate);
				mList.add(member);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		 System.out.println(mList);
		 return mList;
	}
	
	//로그인 체크
	int loginCheck(String userid, String passwd) {
		sql = "select count(*) cnt from member\r\n" + 
				"where userid = ?\r\n" + 
				"and passwd = ?";
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, passwd);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				cnt = rs.getInt("cnt");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnt;
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
