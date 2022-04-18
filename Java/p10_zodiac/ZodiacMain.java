package p10_zodiac;

import java.util.Scanner;

import p09_member.DBConn;

public class ZodiacMain {

	public static void main(String[] args) {
		//메뉴
		//1.회원가입
		//2.로그인
		//3.개인운세
		//4.전체회원의 운세
		//5.종료
		Scanner sc = new Scanner(System.in);
		ZodiacService zs = new ZodiacService();
		while (true) {
			System.out.println("--------------------");
			System.out.println("--2021년 띠별 운세--");
			System.out.println("--------------------");
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.개인운세");
			System.out.println("4.전체회원의 운세");
			System.out.println("5.종료");
			System.out.println("--------------------");
			System.out.print("번호는?");
			int no = sc.nextInt();
			switch(no) {
			case 1:
				zs.memberInsert(); break;
			case 2:
				zs.loginCheck(); break;
			case 3:
				zs.personalLuck(); break;
			case 4:
				zs.LuckAll(); break;
			case 5:
				DBConn.dbClose(); //db접속 종료
				System.out.println("프로그램 종료");
				System.exit(0);
			default:
				System.out.println("잘못된 번호");
			}
			
		}
		
		
		
		
		
		
		

	}

}
