package p01_Class;

import java.util.Arrays;

public class J201215_02_method {
	int sum; //합계 필드
	
	//call-by-value:기본형을 매개변수로 받을때
	int add(int a, int b) {
		return a+b;
	}
	void add(int a) { //오버로딩
		sum += a;
	}
	
	//call-by_reference:참조변수를 매개변수로 받을때
	void namePrint(String name) {
		System.out.println("당신의 이름은 "+ name + " 입니다");
	}
	void arraySetting(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
	}

	public static void main(String[] args) {
		// 메소드
		J201215_02_method test = new J201215_02_method();
		test.add(10);test.add(5); System.out.println(test.sum);
//		System.out.println(test.add(20, 15));
//		String name="홍길동";
//		test.namePrint(name);
		
		//배열 매개변수로 넘기기
//		int[] arr = new int[3]; 
//		test.arraySetting(arr);
//		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
