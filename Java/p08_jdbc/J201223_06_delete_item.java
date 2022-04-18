package p08_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J201223_06_delete_item {

	public static void main(String[] args) {
		Connection conn=DBConn.getConnection();
		String sql="delete from item "+
					"where itemcode=? ";
		String itemcode="A001";
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, itemcode);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건이 삭제");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
