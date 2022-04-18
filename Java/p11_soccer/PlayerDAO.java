package p11_soccer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import p10_zodiac.DBConn;

public class PlayerDAO {
	Connection conn = DBConn.getConnection();
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	//한국축구팀의 축구선수 리스트
	List<Player> selectAll(String team_id) {
		System.out.println("team_id:"+team_id);
		
		List<Player> plist = new ArrayList<Player>();
		
		conn = DBConn.getConnection();
		sql = "select * from player where team_id = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, team_id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String player_id = rs.getString("player_id");
				String player_name = rs.getString("player_name");
				String e_player_name = rs.getString("e_player_name");
				String nickname = rs.getString("nickname");
				String join_yyyy = rs.getString("join_yyyy");
				String position = rs.getString("position");
				int back_no = rs.getInt("back_no");
				String nation = rs.getString("nation");
				Date birth_date = rs.getDate("birth_date");
				String solar = rs.getString("solar");
				int height = rs.getInt("height");
				int weight = rs.getInt("weight");
				
				Player player = new Player();
				player.setPlayer_id(player_id);
				player.setPlayer_name(player_name);
				player.setTeam_id(team_id);
				player.setE_player_name(e_player_name);
				player.setNickname(nickname);
				player.setJoin_yyyy(join_yyyy);
				player.setPosition(position);
				player.setBack_no(back_no);
				player.setNation(nation);
				player.setBirth_date(birth_date);
				player.setSolar(solar);
				player.setHeight(height);
				player.setWeight(weight);
				
				plist.add(player);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(plist);
		return plist;
	
	}

}
