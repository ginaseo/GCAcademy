package p11_soccer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import p10_zodiac.DBConn;

public class StadiumDAO {
	Connection conn = DBConn.getConnection();
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	//한국축구팀의 축구선수 리스트
	List<Stadium> selectAll(String hometeam_id) {
		System.out.println("hometeam_id:"+hometeam_id);
		
		List<Stadium> plist = new ArrayList<Stadium>();
		
		conn = DBConn.getConnection();
		sql = "select * from stadium where hometeam_id = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, hometeam_id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String stadium_id = rs.getString("stadium_id");
				String stadium_name = rs.getString("stadium_name");
				int seat_count = rs.getInt("seat_count");
				String address = rs.getString("address");
				String ddd = rs.getString("ddd");
				String tel = rs.getString("tel");
				
				
				Stadium stadium = new Stadium();
				stadium.setStadium_id(stadium_id);
				stadium.setStadium_name(stadium_name);
				stadium.setHometeam_id(hometeam_id);
				stadium.setSeat_count(seat_count);
				stadium.setAddress(address);
				stadium.setDdd(ddd);
				stadium.setTel(tel);
				
				plist.add(stadium);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(plist);
		return plist;
	
	}

}
