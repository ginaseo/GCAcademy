package p08_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class J201223_08_selectAll_item {

	public static void main(String[] args) {
		//상품을 담는 리스트
		List<Item> itemList = new ArrayList<>();
		
		//상품의 모든 데이터 조회
		Connection conn = DBConn.getConnection();
		String sql = "select * from item";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String itemcode = rs.getString(1);
				String itemname = rs.getString(2);
				int price = rs.getInt(3);
				String regdate = rs.getString(4);
				Item item = new Item();
				item.setItemcode(itemcode);
				item.setItemname(itemname);
				item.setPrice(price);
				item.setRegdate(regdate);
				itemList.add(item);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally { //예외가 발행하든지 안하든지 무조건 실행
			try {
				if (rs != null) rs.close();
				if (pstmt!= null) pstmt.close();
				if (conn != null) conn.close();				
			} catch (SQLException e) {
				System.out.println("close 예외");
				e.printStackTrace();
			}

		}
		
		//오름차순 정렬(익명클래스를 활용한 정렬)
		itemList.sort(new Comparator<Item>() {
			@Override
			public int compare(Item item1, Item item2) {
				String itemcode1 = item1.getItemcode();
				String itemcode2 = item2.getItemcode();
				return itemcode1.compareTo(itemcode2);
			}
		});
		
		
		//출력
		for(int i=0; i<itemList.size(); i++) {
			Item item = itemList.get(i);
			System.out.println("상품코드:"+item.getItemcode());
			System.out.println("상품명"+item.getItemname());
			System.out.println("단가"+item.getPrice());
			System.out.println("등록일자"+item.getRegdate());
		}
		
		
		
		
		
	}

}
