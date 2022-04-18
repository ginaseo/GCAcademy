package p04_lang;

public class J201221_02_StringBuffer {

	public static void main(String[] args) {
		// 문자열 저장 클래스
		//String은 변결불가능, 추가시 새로운 객체 생성=>속도가 느리다
		//StringBuffer:길이+16자리의 공간 더 확보
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		System.out.println("길이:"+sb.length());
		System.out.println("용량:"+sb.capacity());
		
		//
		sb.append("\njava!");
		sb.insert(5, " welcome! ");
		sb.append("\njava is easy!!");
		System.out.println(sb);
		System.out.println("--------------------");
		String str = sb.toString();
		System.out.println(str);
		

		
		
		
		
		
		
		
		
		
		
		
		

	}

}
