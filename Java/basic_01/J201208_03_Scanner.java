package basic_01;

public class J201208_03_Scanner {

	public static void main(String[] args) {
		// 사용자에게 입력받기 :Scanner클래스
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수는?");
//		int a = sc.nextInt(); //정수를 입력
//		System.out.println("입력한 값:"+a);
		
		//실습)점수를 입력받아 
		//60점 이상이면 합격 아니면 불합격 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수는?");
//		int score = sc.nextInt();
//		String s = score>=60?"합격":"불합격";
//		System.out.println(s);
		
		//실습)두 정수를 입력받아 덧셈연산
//		Scanner sc = new Scanner(System.in);
////		System.out.print("첫번째수?");
////		System.out.print("두번째수?");
//		System.out.print("두정수는?");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println("덧셈:" + (a+b));
		
		//실수 입력받기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("실수는?");
//		double d = sc.nextDouble();
//		System.out.println(d);
		
		//실습)반지름(정수)과 원주율(실수)을 입력받아서 원의 넓이를 구하기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("반지름?");
//		int r = sc.nextInt();
//		System.out.print("원주율?");
//		double pi = sc.nextDouble();
//		System.out.println("원의 넓이:" + r*r*pi);
		
		//수학관련 클래스 :java.lang.Math (내장 패키지)
		//static은 객체 생성없이 바로 접근 가능
//		System.out.println(Math.PI); 
		
		//문자열 입력 받기
		//next() 공백/엔터 기준으로 입력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름은?");
//		String name = sc.next();
//		System.out.println("당신의 이름은 "+name);
		
		//라인단위로 입력을 받기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름은?");
//		String name = sc.nextLine();
//		System.out.println("당신의 이름은 "+ name);
		
		//실습)이름과 닉네임을 입력받아 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름은?");
//		String name = sc.next();
//		sc.nextLine(); //\n의 버퍼를 비우기 위해서
//		System.out.print("닉네임?");
//		String nic = sc.nextLine();
//		System.out.println("이름:"+name);
//		System.out.println("닉네임:"+nic);
		
		//실습)나이와 취미를 입력받아 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이는?");
//		int age = sc.nextInt();
//		sc.nextLine(); //버퍼를 비우기 위해서
//		System.out.print("취미는?");
//		String hobby = sc.nextLine();
//		System.out.println("나이:"+age);
//		System.out.println("취미:"+hobby);
		
		
		//실습) 이름, 국어/영어/수학 점수를 입력
		//이름 , 합계, 평균 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름는?");
//		String name = sc.nextLine();
//		System.out.print("국영수?");
//		int kor = sc.nextInt();
//		int eng = sc.nextInt();
//		int math = sc.nextInt();
//		
//		int sum=kor+eng+math;
//		System.out.println("합계:"+sum);
//		System.out.printf("평균:%.2f\n",sum/3.);
//		System.out.println("평균:"+Math.round(sum/3. * 100) / 100.);
		
		//확인문제102page) 2번
//		int x =10, y=20;
//		int z = (++x) + (y--); //x=x+1, z=x+y, y=y-1
//		System.out.println(z);
//		System.out.println(x);
//		System.out.println(y);
		
		//확인문제102page) 3번
//		int score=85;
//		String result = !(score>90)?"가":"나";
//		System.out.println(result);
		
		
		//0으로 나눌수 없다
//		int a=10, b=0;
//		System.out.println(a/b);
		
		
		//NaN
		double x = 5.0, y = 0.1;
		double z = x%y;
		System.out.println(z);
		
		System.out.println(Double.isNaN(z)?
					"0으로 나눌수 없습니다.":z + 0.1);
		
		Object obj = Double.isNaN(z)?"0으로 나눌수 없습니다.":z + 0.1;
		System.out.println(obj);
		
		System.out.println(z + 0.1);
		System.out.println(Double.isNaN(z));
		
		
		
		
		
		
		
		
		

	}

}
