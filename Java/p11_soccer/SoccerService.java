package p11_soccer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import p10_zodiac.DBConn;
import p10_zodiac.Member;

public class SoccerService {
	SoccerMain sm = new SoccerMain();
	PlayerDAO plyDAO = new PlayerDAO();
	Scanner sc = new Scanner(System.in);
	Connection conn = DBConn.getConnection();
	PreparedStatement pstmt;
	String sql;	
	
	// 마스터 서브 메뉴
	void masterSubMenu() {
		while (true) {
			System.out.println("----------------------");
			System.out.println("--마스터(관리자모드)--");
			System.out.println("----------------------");
			System.out.println("1.경기장");
			System.out.println("2.축구팀");
			System.out.println("3.축구선수");
			System.out.println("4.전 단계로");
			System.out.println("--------------------");
			System.out.print("번호는?");
			int no = sc.nextInt();
			switch(no) {
			case 1: StadiumMenu(); break;
			case 2:
			case 3:
			case 4: String[] args = null;
			SoccerMain.main(args); break;
			default:
				System.out.println("잘못된 번호");

			}
		}
	}
	
	
			
	
	
	
	// 마스터 서브 메뉴
	void SelectSubMenu() {
		while (true) {
			System.out.println("----------------------");
			System.out.println("---조회(사용자모드)---");
			System.out.println("----------------------");
			System.out.println("1.축구팀조회");
			System.out.println("2.축구선수조회");
			System.out.println("3.경기장조회");
			System.out.println("4.일정및스코어조회");
			System.out.println("5.전 단계로");
			System.out.println("--------------------");
			System.out.print("번호는?");
			int no = sc.nextInt();
			switch(no) {
			case 1: selectTeam(); break;
			case 2: selectPlayer(); break;
			case 3: selectStadium(); break;
			case 4: selectSchedule(); break;
			case 5: String[] args = null;
				SoccerMain.main(args); break;
			default:
				System.out.println("잘못된 번호");

			}
		}		
							
}

	//관리자인증
	void masterCheck() {
		System.out.println("아아디: ");
		String userid = sc.next();
		System.out.print("비밀번호: ");
		String passwd = sc.next();
		Master master = new Master();
		if (userid==null && passwd==null) {
			System.out.println("로그인 실패");
		}else {
			System.out.println("로그인 성공");
			System.out.println(userid+"님 환영합니다.");
//			loginId = userid; //로그인id 저장
		
		
		
	}
	
	}
	
	// 경기장 서브 메뉴
			void StadiumMenu() {
				while (true) {
					System.out.println("----------------------");
					System.out.println("--경기장(관리자모드)--");
					System.out.println("----------------------");
					System.out.println("1.경기장등록");
					System.out.println("2.일정 및 스코어");
					System.out.println("3.전 단계로");
					System.out.println("--------------------");
					System.out.print("번호는?");
					int no = sc.nextInt();
					switch(no) {
					case 1: stadiumInsert(); break;
					case 2:
					case 3: masterSubMenu(); break;
					default:
						System.out.println("잘못된 번호");}}}

			
	//경기장등록
	Stadium stadiumInsert() {
		
		
		System.out.println("stadium_id?");
		String stadium_id = sc.next();
		System.out.println("stadium_name?");
		String stadium_name = sc.next();
		System.out.println("hometeam_id");
		String hometeam_id = sc.next();
		System.out.println("seat_count?");
		int seat_count = sc.nextInt();
		System.out.println("address?");
		String address = sc.next();
		System.out.println("ddd?");
		String ddd = sc.next();
		System.out.println("tel?");
		String tel = sc.next();
		Stadium sd = new Stadium(stadium_id,stadium_name,hometeam_id,seat_count,address,ddd,tel);
		
		
		try {
			sql = "INSERT INTO stadium VALUES (?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, stadium_id);
			pstmt.setString(2, stadium_name);
			pstmt.setString(3, hometeam_id);
			pstmt.setInt(4, seat_count);
			pstmt.setString(5, address);
			pstmt.setString(6, ddd);
			pstmt.setString(7, tel);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건이 추가");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		 return Stadium ;
	}
	
	//축구팀조회
	void selectTeam() {
		System.out.println("축구팀아이디?");
		String team_id = sc.next();
		//PlayerDAO의 객체생성
		TeamDAO pdao = new TeamDAO();
		List<Team> plist = pdao.selectAll(team_id);
		for(int i =0 ; i< plist.size(); i++) {
			System.out.println(" ");
			System.out.println("ID : "+plist.get(i).getTeam_id());
			System.out.println("Region: "+plist.get(i).getRegion_name());
			System.out.println("Name : "+plist.get(i).getTeam_name());
			System.out.println("ENG Name : "+plist.get(i).getE_team_name());
			System.out.println("ORIG year : "+plist.get(i).getOrig_yyyy());
			System.out.println("Stadium_id : "+plist.get(i).getStadium_id());
			System.out.println("Address : "+plist.get(i).getAddress());
			System.out.println("DDD : "+plist.get(i).getDdd());
			System.out.println("Tel : "+plist.get(i).getTel());
			System.out.println("Fax : "+plist.get(i).getFax());
			System.out.println("Homepage : "+plist.get(i).getHomepage());
			System.out.println(" ");
			}
		}
	
	//축구선수조회
	void selectPlayer() {
		System.out.println("축구팀아이디?");
		String team_id = sc.next();
		//PlayerDAO의 객체생성
		PlayerDAO pdao = new PlayerDAO();
		List<Player> plist = pdao.selectAll(team_id);
		for(int i =0 ; i< plist.size(); i++) {
			System.out.println("------------------------");
			System.out.println(" ");
			System.out.println("ID : "+plist.get(i).getPlayer_id());
			System.out.println("Name : "+plist.get(i).getPlayer_name());
			System.out.println("ENG Name : "+plist.get(i).getE_player_name());
			System.out.println("Back # : "+plist.get(i).getBack_no());
			System.out.println("Position : "+plist.get(i).getPosition());
			System.out.println("Height : "+plist.get(i).getHeight());
			System.out.println("Weight : "+plist.get(i).getWeight());
			System.out.println("Join year : "+plist.get(i).getJoin_yyyy());
			System.out.println(" ");
			}
		}
		
	//경기장조회
	void selectStadium() {
		System.out.println("홈팀아이디?");
		String hometeam_id = sc.next();
		//PlayerDAO의 객체생성	
		StadiumDAO pdao = new StadiumDAO();
		List<Stadium> plist = pdao.selectAll(hometeam_id);
		for(int i =0 ; i< plist.size(); i++) {
			System.out.println(" ");
			System.out.println("ID : "+plist.get(i).getStadium_id());
			System.out.println("Name : "+plist.get(i).getStadium_name());
			System.out.println("Seat Count : "+plist.get(i).getSeat_count());
			System.out.println("Address : "+plist.get(i).getAddress());
			System.out.println("Ddd : "+plist.get(i).getDdd());
			System.out.println("Tel : "+plist.get(i).getTel());
			System.out.println(" ");
		}
	}
	
	//스케줄 스코어 조회
	 void selectSchedule() {
		 System.out.println("홈팀아이디?");
			String hometeam_id = sc.next();
			//PlayerDAO의 객체생성	
			ScheduleDAO pdao = new ScheduleDAO();
			List<Schedule> plist = pdao.selectAll(hometeam_id);
			for(int i =0 ; i< plist.size(); i++) {
				System.out.println("------------------------");
				System.out.println(" ");
				System.out.println("Date : "+plist.get(i).getSche_date());
				System.out.println("Hometeam("+plist.get(i).getHometeam_id()+") : "+plist.get(i).getHome_score());
				System.out.println("Awayteam("+plist.get(i).getAwayteam_id()+") : "+plist.get(i).getAway_score());
				System.out.println("Stadium ID : "+plist.get(i).getStadium_id());
				System.out.println(" ");
	}
	 }
	
	
}
