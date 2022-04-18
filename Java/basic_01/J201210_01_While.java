package basic_01;

import java.util.Scanner;

public class J201210_01_While {

	public static void main(String[] args) {
//		// 반복문(while)
//		//실습1)음악재생-1
//		Scanner sc = new Scanner(System.in);
//		int cnt = 0;
//		String answer;
//		while(true) {
//			System.out.println("음악을 재생?");
//			answer=sc.next();
//			if(answer.equals("y")) {
//				System.out.println(++cnt);
//			}else
//			break;
//		}
		
//		//실습)음악재생-2
//		Scanner sc = new Scanner(System .in);
//		int cnt=0;
//	  	String answer="y";
//		while(answer.equals("y")) {
//			System.out.println("음악을 재생?");
//			answer = sc.next();
//			if(answer .equals("y")) {
//				System.out.println(++cnt);
//				
//			}
//		}
		
		
		//실습)updown 게임
		//1)랜덤으로 1~100사이의 수 하나를 저장
		//2)사용자에게 정수를 입력받는다
		//3)만약 랜덤수가 사용자수보다 작은면 down 
		//	크면 up 같으면 사용자 승리
		//4)5번안에 못맞추면 컴퓨터 승리
		
		Scanner sc = new Scanner(System.in);
		int ans; //대답
		int rightCnt=0; //맞춘 횟수
		while(true) {
			boolean right = false; //정답여부
			double r = Math.random();
			int rand=(int)(r*100+1);
			System.out.println(rand);
			for (int i=0; i<5; i++) {
				System.out.print("숫자?");
				ans = sc.nextInt();
				if (ans > rand )
					System.out.println("down");
				else if (ans<rand)
					System.out.println("up");
				else {
					right = true;
					System.out.println("사용자승");
					rightCnt++;
					break;
				}
			}	
			if (!right) System.out.println("컴퓨터승");
							
			System.out.println("####계속?(y)");
			String cont = sc.next().toLowerCase();
			if(!cont.equals("y"))break;
			
			}
			System.out.println("정답횟수:" +rightCnt);		
		
	}

}
