package p11_soccer;

import java.util.Scanner;

import p09_member.DBConn;

public class SoccerMain {

	public static void main(String[] args) {
		// 메이저 축구팀 프로젝트

		Scanner sc = new Scanner(System.in);
		SoccerService sservice = new SoccerService();
		while (true) {
			System.out.println("----------------------");
			System.out.println("--메이저 축구팀 v1.0--");
			System.out.println("----------------------");
			System.out.println("1.마스터");
			System.out.println("2.조회");
			System.out.println("3.관리자인증");
			System.out.println("4.종료");
			System.out.println("--------------------");
			System.out.print("번호는?");
			int no = sc.nextInt();
			switch(no) {
			case 1:sservice.masterSubMenu(); break;
			case 2:sservice.SelectSubMenu(); break;
			case 3:sservice.masterCheck(); break;
			case 4:
				DBConn.dbClose(); //db접속 종료
				System.out.println("프로그램 종료");
				System.exit(0);
			default:
				System.out.println("잘못된 번호");
			}
			
		}
		
		
		
		
		
		
		

	
	
	
	}

}
