package p12_procedure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class J201230_03_pointSelect {

	public static void main(String[] args) {
		//회원정보+포인트 조회
			String sql = "select m.userid, m.year, nvl(mp.point,0) point, m.regdate\r\n" + 
					"from member m left join mpoint mp on(m.userid=mp.userid)";
			Connection conn = DBConn.getConnection();
			ResultSet rs = null;
			PreparedStatement pstmt=null;
			try {
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					System.out.println("-------------------");
					System.out.println(rs.getString("userid"));
					System.out.println(rs.getString("year"));
					System.out.println(rs.getString("point"));
					System.out.println(rs.getString("regdate"));
				}	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (rs != null)
					try {
						if(rs!=null) rs.close();
						if(pstmt!=null) pstmt.close();
						if(conn!=null) DBConn.dbClose();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			
			
		
	}

}
