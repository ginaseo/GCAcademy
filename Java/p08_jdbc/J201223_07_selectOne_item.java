package p08_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J201223_07_selectOne_item {

	public static void main(String[] args) {
		//한건 조회
		Connection conn = DBConn.getConnection();
		String sql = "select*from Item\r\n" + 
					"where itemcode = ?";
		String itemcode = "A002";

		Item item = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, itemcode);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				String itemname = rs.getString("itemname");
				int price = rs.getInt("price");
				String regdate = rs.getString("regdate");
				
				item = new Item(itemcode,itemname,price,regdate);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(item);
		//출력
		System.out.println("상품코드: " + item.getItemcode());
		System.out.println("상품명: " + item.getItemname());
		System.out.println("상품가격: " + item.getPrice());
		System.out.println("등록일자: " + item.getRegdate());

	}

}
