package basic_01;

import java.math.BigDecimal;

public class J201207_02_variable {
	public static void main(String[] args) {
		//변수
//		int a = 10, b = 20;
//		System.out.println("더하기:"+(a+b));
//		System.out.println("빼기:"+(a-b));
//		System.out.println("곱하기:"+(a*b));
//		System.out.println("나누기:"+((double)a/b));
//		System.out.println("나머지:"+(a%b));
//		//ctrl+alt+방향키 : 문장 복사 <-> ctrl+d : 문장 지우기
//	
//		double d = 3.14,d2 = 206.2;
//	    System.out.println("원주율:"+d);
//	    System.out.println("더하기:"+(d+d2));
		
		//정확한 실수값 계산(돈계산)
	    BigDecimal b1 =new BigDecimal("3.14");
	    BigDecimal b2 =new BigDecimal("206.2");
	    BigDecimal result =b1.add(b2);
	    System.out.println(result);
	    
//		//문자형
//		char c ='홍'; //2byte
//		System.out.println(c);
	    
//		//논리형
//		boolean b = true; //false
//		System.out.println(b);
	    
//		//문자열(참조형)
//		String s1 = new String("홍길동");
//		String s2 ="홍길동";
//		System.out.println(s1);
//		System.out.println(s2);
	
//		//형변환
//		//자동 형변환 :  작은데이터형이 큰 데이터형으로 변환
//		byte b = 120; //-128 ~ 127
//		System.out.println(b);
//		int a = b;
//		System.out.println(a);

		//명시적인 형변환
		//예)큰 데이터형을 작은데이터 형으로 변환
		int a = 200;
		byte b = (byte)a;
		System.out.println(b);
		
		//상수: 변경할 수 없는 값
		final double PI = 3.141592;
		//pi = 3.14; 상수 변경 불가
		System.out.println(PI);
		
		
		
		
		
	    
	}

}
