package p11_soccer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import p10_zodiac.DBConn;

public class ScheduleDAO {
	Connection conn = DBConn.getConnection();
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	//한국축구팀의 축구선수 리스트
	List<Schedule> selectAll(String hometeam_id) {
		System.out.println("hometeam_id:"+hometeam_id);
		
		List<Schedule> plist = new ArrayList<Schedule>();
		
		conn = DBConn.getConnection();
		sql = "select * from Schedule where hometeam_id = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, hometeam_id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String stadium_id = rs.getString("stadium_id");
				String sche_date = rs.getString("sche_date");
				String gubun = rs.getString("gubun");
				String awayteam_id = rs.getString("awayteam_id");
				int home_score = rs.getInt("home_score");
				int away_score = rs.getInt("away_score");
				
				
				
				Schedule Schedule = new Schedule();
				Schedule.setStadium_id(stadium_id);
				Schedule.setSche_date(sche_date);
				Schedule.setGubun(gubun);
				Schedule.setHometeam_id(hometeam_id);
				Schedule.setAwayteam_id(awayteam_id);
				Schedule.setHome_score(home_score);
				Schedule.setAway_score(away_score);
				
				
				plist.add(Schedule);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(plist);
		return plist;
	
	}

}

