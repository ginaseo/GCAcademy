package p03_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J201218_01_exception {

	public static void main(String[] args) {
		// 예외처리:다른방식으로 처리가능한 에러
		// 예외가 발생하면 JVM이 해당예외객체를 생성해서
		// 
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			try {
//				int a=10;
//				System.out.println("나눌정수?");
//				int b=sc.nextInt();
//				System.out.println(a/b);
//				break;
//			}catch(InputMismatchException e){
//				System.out.println("정수를 입력해 주세요");
//				sc.nextLine(); //버퍼 지우기
//				System.out.println(e);
//				e.printStackTrace();//소스 단계별로 추적 메시지 출력
//			}catch(ArithmeticException e){
//				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
//			}catch(Exception e) {
//				System.out.println("예외가 발생했습니다.");
//			}
//				
//		}
//		
//		
//		//int의 범위
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		//long의 범위
//		System.out.println(Long.MIN_VALUE);
//		System.out.println(Long.MAX_VALUE);
//		
//		//두 정수를 더하기
//		System.out.println("정수는?");
//		int b = sc.nextInt();
//		System.out.println(b);

//		int[] arr = {1,2};
//		try {
//			System.out.println(arr[3]);
//			}catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("잘못된 index 오류");
//				System.out.println(e);
//			}catch(Exception e) {
//				System.out.println("예외 발생");
//				e.printStackTrace();
//			}
		
		
		//예외의 종류:
		//1)체크예외: Exception의 자식이면서 RuntimeException을 상속하지 않은 클래스
		//2)언체크예외: RuntimeException을 상속한 클래스 해줘도 안해줘도 됨
		
		//체크 예외:
		try {
			Scanner sc = new Scanner(new File("file.txt"));
			while(sc.hasNextLine()) {
				String data=sc.nextLine();
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		}
		
			
		
				
		
		
		
		
	}
}
