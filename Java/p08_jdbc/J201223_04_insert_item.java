package p08_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class J201223_04_insert_item {

	public static void main(String[] args) {
		Connection conn = DBConn.getConnection();
		//상품객체 생성
		Item item = new Item("A001","새우깡",1000);

		String sql ="insert into item(itemcode, itemname, price) values(?,?,?)";
		PreparedStatement pstmt =null;
		try {
			//가독성, 보안 측면에서 prepareStatement 사용 추천
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, item.getItemcode());
			pstmt.setString(2, item.getItemname());
			pstmt.setInt(3, item.getPrice());
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건이 저장");
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
			}catch (SQLException e) {
					e.printStackTrace();
			}
		}
		
		
		
		

	}

}
