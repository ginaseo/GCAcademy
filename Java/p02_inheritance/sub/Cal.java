package p02_inheritance.sub;

//부모: 더하기,빼기,곱하기,나누기

public class Cal{
	//접근제한자(protected): 같은 패키지 / 자식 클래스 접근 가능
	protected double result;
	public void add(double a) {
		result+=a;
	}
	public void sub(double a) {
		result-=a;
		
	}
	
	public void mul(double a) {
		result *=a;
	}
	
	
	public void div(double a) {
		result /=a;
	}
	
	
	//게터
	public double getResult() {
		return result;
	}
	
}


