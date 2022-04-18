package p01_Class;
//계산기 클래스
//속성:메이커, 계산결과
//기능:더하기,빼기, 곱하기,나누기
class Cal{
	//필드
	String maker="국제자바계산기";
	double result; //계산결과
	//더하기 메소드
	double add(int a) {
		result += a;
		return result;
	}
	//빼기(sub)
	double sub(int a) {
		result -=a;
		return result;
	}
	//곱하기(mul)
	double mul(int a) {
		result *= a;
		return result;
	}
	//나누기(div)
	double div(int a) {
		result /=a;
		return result;
	}
	
}


public class J201214_02_Cal {

	public static void main(String[] args) {
		// 계산기 객체 생성
		Cal c1 = new Cal();
		c1.add(10); System.out.println("결과:" + c1.result);
		c1.add(6); System.out.println("결과:" + c1.result);
		System.out.println("결과:" + c1.add(7));
		System.out.println("결과:" +c1.div(3));
		System.out.println("결과:" +c1.mul(2));

	}

}
