package basic_01;

import java.util.Scanner;

//import java.math.BigDecimal;


public class fun {

	public static void main(String[] args) {

		
		
		
		
		
		
		
		
		
//		//돈 세기
//		BigDecimal b1= new BigDecimal("3.14");
//		BigDecimal b2= new BigDecimal("206.2");
//		BigDecimal result = b1.add(b2);
//		System.out.println(result);
//		
		
//		//삼항연산자
//		int a=10;
//		String s = a>0?"양수":"음수";
//		System.out.println(s);
//		
//		//실습) 두수중 큰 수 출력
//		int a=10,b=20;
//		int r=a>b?a:b;
//		System.out.println("큰수:"+r);
		
//		//실습)세수중 가장 큰수 출력
//		int a=10,b=20,c=30;
//		int max=a>b?a:b;
//		max=max>c?max:c;
//		System.out.println(max);
//		
//		//실습)어떤 정수의 짝홀수 출력
//		int a=6;
//		String r=a%2==0?"짝수":"홀수";
//		System.out.println(r);
//		
//		//실습)두점수가 80이상이면 합격
//		int a1=90,a2=86;
//		String  x=a1>=80&&a2>=80?"합격":"불합격";
//		System.out.println(x);
		
		//실습)두 실수가 0보다 크면 '양수' 
//		//	아니면 '양수아님' 출력
//		double a1=3.14,a2=-0.12;
//		String r=a1>0 && a2>0?"양수":"양수아님";
//		System.out.println(r);
		
//		//실습)학점매기기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수?");
//		int score = sc.nextInt();
//		if (score>=90) 
//			System.out.println("A");
//		else if (score>=80)
//			System.out.println("B");
//		else if (score>=70)
//			System.out.println("C");
//		else if (score>=60)
//			System.out.println("D");
//		else
//			System.out.println("F");
		
//		//실습)학점매기기(상대평가)
//		//전체학생수와 나의 등수를 입력받아
//		//~15%: A등급, 16~30~: B등급 31%~ :C등급
//		Scanner sc = new Scanner(System.in);
//		System.out.print("전체학생수?");
//		int totcnt=sc.nextInt();
//		System.out.print("등수는?");
//		int grade=sc.nextInt();
//		if (grade<=totcnt*0.15)
//			System.out.println("A");
//		else if (grade<=totcnt*0.3)
//			System.out.println("B");
//		else
//			System.out.println("C");
		
//		//과제)화씨(F)=>섭씨(C)로
//		//섭씨는 화씨로 바꾸기
//		//공식 : 화씨온도를 섭씨온도로 (화씨온도 -32) *5/9=0C
//		//		 섭씨온도를 화씨온도로 (섭씨온도 *9/5+32)
//		//온도랑 10C
		
		Scanner sc = new Scanner(System.in);
		System.out.println("온도?");
		int t = sc.nextInt();
		String s =sc.next().toUpperCase();
		
		System.out.println(t);
		System.out.println(s.toUpperCase());
		
		if(s.equals("C"))
			System.out.printf("화씨온도: %.fF\n",(t*(double)9/5+32));
		else if (s.equals("F"))

			System.out.printf();
		
		
		
		
		
		
		
		
		
		
		//배열
		
//		//a[0] = 10; a[1] = 20; ...
//		//반복문을 이용하여 초기화 
//		int [] a;
//		a= new int [5];
//		for(int i=0; i<a.length; i++) {
//			a[i]=(i+1)*10;
//			System.out.println(a[i]);
//		}
		
		//선언과 동시에 초기화
//		int[]a=new int[] {10,20,30};
//		int[]a= {10,20,30}; //new연산자 생략가능
//		for (int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
//		
//		//클래스를 이용해서 값확인
//		System.out.println(Arrays.toString(a));
		
//		//실습)크기가 10인 실수형 배열을 선언하고 
//		//0.1~1.0까지 초기화
//		double[] arr= new double[10];
//		for (int i=0;i<arr.length;i++) {
//			arr[i]=(i+1)*0.1;
//			System.out.printf("%.1f\n",arr[i]);
//		}
//		System.out.println(Arrays.toString(arr));
		
		//반복문(while)
//		//실습-음악재생_1
//		Scanner sc = new Scanner(System.in);
//		int cnt =0;
//		String ans;
//		while (true) {
//			System.out.println("음악을 재생?");
//			ans=sc.next();
//			if(ans.equals("y")) {
//				System.out.println(++cnt);
//			}else
//				break;
//		}
		
//		//실습-음악재생_2
//		Scanner sc = new Scanner(System.in);
//		int cut=0;
//		String ans ="y";
//		while(ans.equals("y")) {
//			System.out.print("음악을 재생?");
//			ans=sc.next();
//			if (ans.equals("y")){
//				System.out.println(++cut);
//				
//			}
//		}
//		
//		//실습-음악재생_3
//		Scanner sc = new Scanner(System.in);
//		int cut=0;
//		String ans;
//		do {
//			System.out.println("음악을 재생?");
//			ans=sc.next();
//			if(ans.equals("y")) System.out.println(++cut);
//		}while(ans.equals("y"));
//		
//		
//		//실습)updown게임
//		//1)랜덤으로 1~100사이의 수 하나를 저장
//		//2)사용자에게 정수를 입력받는다
//		//3)만약 랜덤수가 사용자수보다 작으면 down
//		//       크면 up , 같으면 사용자 승
//		//4)5번안에 못맞히면 컴퓨터 승
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("UP&DOWN GAME START!");
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		int anw;
//		int rightCnt=0;
//		while(true) {
//			boolean right=false;
//			double r = Math.random();
//			int ran=(int)(r*100+1);
////			System.out.println(ran);
//			for (int i =0;i<4;i++) {
//				System.out.print("NUMBER?");
//				anw=sc.nextInt();
//				if(anw<ran) {
//					System.out.println("UP");
//				}
//				else if(anw>ran) {
//					System.out.println("DOWN");
//				}
//				else {
//					right=true;
//					System.out.println("YOU WIN!");
//					rightCnt++;
//					break;
//				}
//			}
//			if (!right) System.out.println("COMP WIN!");
//			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("CONTINUE?(y)");
//			String cont=sc.next().toLowerCase();
//			if(!cont.equals("y"))break;
//			}
//			System.out.println("정답횟수: " +rightCnt);
//			


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
