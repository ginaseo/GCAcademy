package basic_01;

public class J201208_04_if {
	//throws :예외처리
	public static void main(String[] args) throws InterruptedException {
		

//		//실습)학점매기기
//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수는?");
//		int score = sc.nextInt();
//		if (score>=90)
//			System.out.println("A등급");
//		else if (score>=80)
//			System.out.println("B등급");
//		else if (score>=70)
//			System.out.println("C등급");	
//		else if (score>=60)
//			System.out.println("D등급");	
//		else
//			System.out.println("F등급");
//		
		
//		//실습)학점매기기(상대평가)
//		//전체학생수와 나의 등수를 입력받아
//		//~15%: A등급, 16~30~: B등급 31%~ :C등급
//		Scanner sc = new Scanner(System.in);
//		System.out.println("전체 학생수는?");
//		int totCnt=sc.nextInt();
//		System.out.println("등수는?");
//		int grade=sc.nextInt();
//		if (grade<=totCnt *0.15) 
//			System.out.println("A등급");
//		else if (grade <=totCnt *0.3)
//			System.out.println("B등급");
//		else
//			System.out.println("C등급");
		
//		//과제)화씨(F)=>섭씨(C)로
//		//섭씨는 화씨로 바꾸기
//		//공식 : 화씨온도를 섭씨온도로 (화씨온도 -32) *5/9=0C
//		//		 섭씨온도를 화씨온도로 (섭씨온도 *9/5+32)
//		//온도랑 10C
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("온도?");
//		int t = sc.nextInt();
//		String s = sc.next().toUpperCase();
//		
//		System.out.println(t);
//		System.out.println(s.toUpperCase());
//		
//		if(s.equals("C"))
//			System.out.printf("화씨온도: %.fF\n",(t*(double)9/5+32));
//		else if (s.equals("F"))
//			System.out.printf("섭씨온도: %.2fC\n",(t-(double)32)*5/9);
//		else 
//			System.out.println("잘못된 온도");
//		
		
//		//실습)계산기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("계산식?");
//		int a = sc.nextInt();
//		String sign = sc.next();
//		int b = sc.nextInt();
//		
//				
//		if(sign.equals("+"))
//			System.out.printf("%d + %d = %d\n",a,b,a+b);
//		else if(sign.equals("-"))
//			System.out.printf("%d - %d = %d\n",a,b,a-b);
//		else if(sign.equals("/"))
//			System.out.printf("%d / %d = %d\n",a,b,a/b);
//		else if(sign.equals("*"))
//			System.out.printf("%d * %d = %2.f\n",a,b,a*b);	
//		else 
//			System.out.println("잘못된 기호");
		
//		//실습) 적정 체중 구하기
//		Scanner sc = new Scanner(System .in);
//		System.out.print("이름은?");
//		String name = sc.nextLine();
//		System.out.print("키?");
//		Float height = sc.nextFloat();
//		System.out.print("몸무게?");
//		Float weight = sc.nextFloat();
//		
//		double normal= (height-100) *0.9; 
//		System.out.println("---------------");
//		if(weight<normal*0.9)
//			System.out.println(name+": 미달");
//		else if(weight <= normal*1.1)
//			System.out.println(name+": 정상체중");
//		else
//			System.out.println(name+": 과체중");
//		
//		//실습)전기 사용요금
//		
//		//기본요금
//	
//	    int base;
//	    int use = 10;
//	    if (use <= 200)
//	    	base =910;
//	    else if(use <= 400)
//	         base= 1600;
//	    else 
//	         base = 7300;
//	      
//	    double eleCost;
//	    double eleUse1 = 93.3 , eleUse2 = 187.9 , eleUse3 = 280.6;
//	         
//	    if (use <= 200)
//	       eleCost = eleUse1 * use;
//	    else if (use <= 400)
//	       eleCost = (200*eleUse1) + (use - 200) * eleUse2;
//	    else 
//	       eleCost = (200 * eleUse1)+ (200)*eleUse2 + (use-400)*eleUse3;
//	      
//	    System.out.println("--------------------");
//	    System.out.println("기본요금"+base);
//	    System.out.println("사용요금"+eleCost);
//	    System.out.println("--------------------");
//	    System.out.println("전기요금"+Math.floor(base + eleCost));
//
//			
//		Scanner sc=new Scanner(System.in);
//		System.out.print("사용량을 입력하시오(kWh):");
//		double u=sc.nextDouble();
//		int tot_p;
//      
//		if (u<=200) {
//			tot_p=(int)Math.floor(910+(u*93.3));
//			System.out.println("사용량:"+u+" 사용요금:"+tot_p+"원");
//		}
//		else if (u>400) {
//			tot_p=(int)Math.floor(7300+(200*93.3)+(200*187.9)+((u-400)*280.6));
//			System.out.println("사용량:"+u+" 사용요금:"+tot_p+"원");
//		}
//		else {
//			tot_p=(int)Math.floor(1600+(200*93.3)+((u-200)*187.9));
//			System.out.println("사용량:"+u+" 사용요금:"+tot_p+"원");
//		}
//	
		
	    //실습)로그인
//      String myid ="java", mypw= "1234";
//      Scanner sc = new Scanner(System.in);
//      System.out.print("아이디는?");
//      String id = sc.next();
//      if (id.equals(myid)) {
//         System.out.println("아이디가 일치합니다.");
//         System.out.print("패스워드는?");
//         String pw = sc.next();
//         if (pw.equals(mypw)) {
//            System.out.println("패스워드 일치");
//            System.out.println("로그인 성공");
//         }else
//            System.out.println("패스워드 불일치");
//      }else 
//         System.out.println("아이디 불일치");
//      
		
//		//실습)윤년 체크하기 -1
//		//윤년의 조건
//		//1)4의 배수이면 윤년
//		//2)그러나 100의 배수이면 윤년이 아니다
//		//3)그러나 400의 배수이면 윤년
//	    System.out.println("년도는?");
//	    Scanner sc = new Scanner(System.in);
//	    int year=sc.nextInt();
//	    if (year%4==0)
//	    	if (year%100==0)
//	            System.out.println("윤년이 아니다");
//	        else if(year%400==0)
//	       		System.out.println("윤년이다");
//			else
//	            System.out.println("윤년이다");
//	  	else 
//			System.out.println("윤년이 아니다");
//	    //실습)윤년 체크하기 -2
//	    System.out.println("년도는?");
//	    Scanner sc = new Scanner(System.in);
//	    if (year%4==0 && year%100!=0 || year%400==0)
//	    	System.out.println("윤년입니다");
//	    else
//	    	System.out.println("윤년이 아닙니다");
		
//		//숫자인지 아닌지 체크
//      Scanner sc=new Scanner(System.in);
//      System.out.print("나이는?");
//      if (sc.hasNextInt()) {
//      int age=sc.nextInt();
//         System.out.printf("당신은 %d살 입니다.",age);
		
		//실습) 주사위 게임(1~6)
		//랜덤: 무작위의 값
		//Math.random() : 0<= x <1
		
		int a = (int)(Math.random()*6+1);
		int b = (int)(Math.random()*6+1);
		System.out.println("주사위 던지는 중");
		Thread.sleep(3000); //1/1000초
		System.out.println("A: " +a);
		System.out.println("B: " +b);
		if (a>b)
			System.out.println("A승");
		else if (b>a)
			System.out.println("B승");
		else  
			System.out.println("무승부");
		
		
		
		
		
		
	}
	
	
}
