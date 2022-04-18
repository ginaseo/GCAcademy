package basic_01;
//반드시 public클래스 이름과 파일이름 동일(public class 한개이상 불가)
public class J201207_01_print {
	//주석 단축키 ctrl+/	
	public static void main(String[] args) {
//		//출력 : println
//		//문자열
//		System.out.println("NICE MEET YOU, JAVA!");
//		//출력-정수
//		System.out.println(100+200);
//		//출력-실수
//		System.out.println(3.14-2.25);
//		
//		//print
//		System.out.print("이름: ");
//		System.out.println("홍길동");
//		//printf
//		System.out.printf("원주율:%.2f\n",3.14);
//		System.out.printf("실수계산:%.2f\n",3.14-2.25);
//		
//		//데이터 더하기 
//		System.out.println("이름은 "+"홍길동");
//		//연산자 우선 순위 주위
//		System.out.println("덧셈:"+(10+20));
		
		//문자형--한글자만 취급
		System.out.println('가'); //한글도 문자형
		System.out.println('A');
		//유니코드 값을 알아낼 수 있다. 
		System.out.println('가'+0);
		System.out.printf("%c",44032);
		
		//논리형
		System.out.println(false); //0
		System.out.println(true); //1
		
		
		
		
		
		
	}

}
