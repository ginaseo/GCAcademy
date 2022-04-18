package p02_inheritance;

import p02_inheritance.sub.Cal;

//계산기 클래스
//자식: 결과필드, 추가기능: 나머지,제곱

class NewCal extends Cal{
	void remine(double a) {
		result %= a;
	
	}
	void square() {
		result=Math.pow(result, 2);
	}
}


public class J201216_01_Cal {

	public static void main(String[] args) {
		NewCal ncal = new NewCal();
		ncal.add(10.5);
		System.out.println(ncal.getResult());
		ncal.remine(2);
		System.out.println(ncal.getResult());
//		ncal.result=100;
	}
	

}