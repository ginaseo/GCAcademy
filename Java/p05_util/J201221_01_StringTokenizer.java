package p05_util;

//import java.lang.reflect.Array;
import java.util.StringTokenizer;

public class J201221_01_StringTokenizer {

	public static void main(String[] args) {
		// StringTokenizer 클래스
		//토큰 : 잘게 잘린 문자열
		
//		//String클래스 split메소드 이용
//		String s = "a,b,c";
//		String[] arr=s.split(",");
//		System.out.println(Array.toString(arr));
		
//		//StringTokenizer로 구분
//		String s = "a,b,c";
//		StringTokenizer st = new StringTokenizer(s,",");
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
		
		//구분자가 여러 개인 경우
		//구분자:""+-*/"
		String s = "1+2/5*6-10";
		StringTokenizer st = new StringTokenizer(s,"+-*/");
		while (st.hasMoreTokens() ) {
			System.out.println(st.nextToken());
		}
		
		
		
	}

}
