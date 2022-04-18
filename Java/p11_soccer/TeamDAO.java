package p11_soccer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import p10_zodiac.DBConn;

public class TeamDAO {
	Connection conn = DBConn.getConnection();
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	//한국축구팀의 축구선수 리스트
	List<Team> selectAll(String team_id) {
		System.out.println("team_id:"+team_id);
		
		List<Team> plist = new ArrayList<Team>();
		
		conn = DBConn.getConnection();
		sql = "select * from team where team_id = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, team_id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String region_name = rs.getString("region_name");
				String team_name = rs.getString("team_name");
				String e_team_name = rs.getString("e_team_name");
				String orig_yyyy = rs.getString("orig_yyyy");
				String stadium_id = rs.getString("stadium_id");
				String zip_code1 = rs.getString("zip_code1");
				String zip_code2 = rs.getString("zip_code2");
				String address = rs.getString("address");
				String ddd = rs.getString("ddd");
				String tel = rs.getString("tel");
				String fax = rs.getString("fax");
				String homepage = rs.getString("homepage");
				String owner = rs.getString("owner");
				
				
				Team team = new Team();
				team.setTeam_id(team_id);
				team.setRegion_name(region_name);
				team.setTeam_name(team_name);
				team.setE_team_name(e_team_name);
				team.setOrig_yyyy(orig_yyyy);
				team.setStadium_id(stadium_id);
				team.setZip_code1(zip_code1);
				team.setZip_code2(zip_code2);
				team.setAddress(address);
				team.setDdd(ddd);
				team.setTel(tel);
				team.setFax(fax);
				team.setHomepage(homepage);
				team.setOwner(owner);
				
				plist.add(team);
								
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(plist);
		return plist;
	
	}

}
