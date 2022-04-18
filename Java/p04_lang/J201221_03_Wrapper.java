package p04_lang;

import org.omg.CORBA.INTERNAL;

public class J201221_03_Wrapper {

	public static void main(String[] args) {
		// 래퍼클래스(Wrapper class)
		
//		//Integer
//		String num="10";
//		String num2="20";
//		int a = Integer.parseInt(num);
//		int b = Integer.parseInt(num2);
//		System.out.println(a+b);
//		Integer c = Integer.valueOf(num); //객체형 반환
//		System.out.println(c);
		
		//2진수로 변환
		//실습) 0~20까지 2/8/16진수로 변환 출력
		String value;
		for(int i=0; i<21; i++) {
			System.out.println("decimal:" + i);
			value = Integer.toBinaryString(i);
			System.out.println("binary:" + value);
			value = Integer.toOctalString(i);
			System.out.println("octal:"+value);
			value = Integer.toHexString(i);
			System.out.println("hex:"+value);
			System.out.println("------------------");
			
		}
		
		//Float
//		String pi = "3.14";
//		float f = Float.parseFloat(pi);
//		System.out.println(f);
//		Double d = Double.parseDouble(pi);
//		System.out.println(d);
		
		//Boolean
//		String b= "true"; //대소문자 구별 안함
//		Boolean bool =  Boolean.parseBoolean(b);
//		System.out.println(bool);
		
		//기본형을 문자열로 변환
//		int a= 100 ,b = 200;
//		String str = String.valueOf(a);
//		String str2 = String.valueOf(a);
//		System.out.println(str+str2);

//		Integer a = 10;
//		System.out.println(a.toString());
		
//		int a = 10, b=20;
//		int max = Math.max(a, b);
//		System.out.println("큰값은 "+max);
		
		//실습)
		//5의 3승 구하기: Math클래스 pow메소드 활용
		
		
		
		
		
	}

}
