                                        package basic_01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("unused")
public class J201210_02_array {

	public static void main(String[] args) {
		// 배열
//		int[] a; //참조변수 //stack영역에 선언
//		a = new int[10]; //배열은 연속적인 공간의 할당:heap영역에 생성
//		//a[0] = 10; a[1] = 20; ...
//		//반복문을 이용하여 초기화 
//		for(int i=0; i<a.length; i++) {
//			a[i] = (i+1) * 10;
//			System.out.println(a[i]);
//		}
		
		//선언과 동시에 초기화
		//int[] a = new int[] {10,20,30}; //반드시 배열의 크기 생략
//		int[] a = {10,20,30}; //new 연산자 생략 가능 
//		for(int i=0; i<a.length; i++) {
//			System.out.println(a[i]);
//		}
//		//클래스를 이용해서 값확인
//		System.out.println(Arrays.toString(a));
		
//		//실습)크기가 10인 실수형 배열을 선언하고 0.1~1.0까지 초기화
//		double[] arr = new double[10];
//		for(int i =0; i<arr.length;i++) {
//			arr[i] = (i+1) * 0.1;
//			System.out.printf("%.1f\n",arr[i]);
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		//실습)3명의 학생의 국어점수를 입력 받아 배열저장
//		//	합계와 평균 구하기
//		
//		int [] score = new int[3];
//		int sum=0;
//		for(int i=0;i<score.length;i++) {
//			System.out.printf("[학생%d] 점수는?",i+1);
//			Scanner sc = new Scanner(System.in);
//			score[i]=sc.nextInt();
//			sum+=score[i];
//		}
//		System.out.printf("합계: %d\n",sum);
//		System.out.printf("평균: %.2f",(double)sum/score.length);
		
		//자바의 배열의 동적할당
		//런타임시점에 크기 결정 가능
//		int[] arr;
//		int size =3;
//		arr = new int[size];
//		
//		//실습)사용자에게 배열의 크기를 입력받아 
//		//	배열의 사이즈 결정
//		//실수를 입력받아 저장
//		Scanner sc  = new Scanner(System.in);
//		double sum=0.0;
//		System.out.println("배열의 크기는?");
//		int size=sc.nextInt();
//		double[] arr = new double[size];
//		for(int i=0; i<arr.length;i++){
//			System.out.print("["+(i+1)+"]실수값은?");
//			arr[i]=sc.nextDouble();
//			sum+=arr[i];
//			}
//		System.out.println("실수의 합:"+sum);
//		//값 출력
//		System.out.println(Arrays.toString(arr));
//		for(int i=0; i<arr;length;i++) {
//			System.out.println(arr[i]);
//		}
		
//		//foreach문
//		for(double i : arr) {
//			System.out.println(i);
//		}
		
		//foreach문 연습
//		int[] arr= {10,20,30,40,50};
//		for(int i: arr) {
//			System.out.println(i);
//		}
		
//		char[] arr= {'a','b','c','d','e'};
//		for (char i :arr) {
//			System.out.println(i);
//		}
//		
		
//		float[]arr= {1.1f,2.2f,3.3f};
//		for(float f:arr) {
//			System.out.println(f);
//		}
//		

//		//문자열의 배열
//		//String[] arr = {"java","python","c","basic"};
//		String[] arr= new String[4];
//		arr[0]="java"; arr[1]="python"; arr[2]="c"; arr[3]="basic";
//		
//		//foreach문으로 출력
//		for(String s:arr) {
//			System.out.println(s);
//		}
//		
		//실습)학생3명의 이름과 나이를 입력받아 배열에 저장하고 출력
//		int su=3;
//		String[] name = new String[su];
//		int[] age = new int[su];
//		
//		Scanner sc = new Scanner(System.in);
//		for(int i=0; i<su; i++) {
//			System.out.print("이름은?");
//			name[i] = sc.nextLine();
//			System.out.print("나이는?");
//			age[i] = sc.nextInt();
//			sc.nextLine(); //엔터처리
//		}
//		System.out.println("----------------");
//		for(int i=0; i<su; i++) {
//			System.out.println(name[i]+":"+age[i]);
//		}
		
//		//실습)시험 채점 프로그램
//		//사용자에게 대답을 입력을 받아서 정답배열과 비교하여 채점
//		//총문항수 5문항, 한문항당 20점 배점 : 100점 만점
//		Scanner sc = new Scanner(System.in);
//		int[] right= {3,4,1,2,2}; //정답
//		int[] answer = new int[5]; //대답
//		int score=0; //점수
//		for(int i=0; i<answer.length; i++) {
//			System.out.print(i+1 +" 답?");
//			answer[i] = sc.nextInt();
//			if (answer[i] == right[i]) score+=20;
//		}
//		System.out.println("점수:" + score);
		
//		//실습)선택정렬
//		//오름차순
//		//1)배열에서 최솟값을 구한다
//		//2)현재선택된 index의 값과 최솟값 바꾸기
//		//3)배열의 끝까지 진행
//		
//		int[] arr= {4,6,2,7,1,8,3};
//		//최솟값 구하기
//		int minIndex=0;
//		int min=4;
//		for(int i=1; i>arr.length;i++) {
//			if (arr[i]<min) {
//				min=arr[i];
//				minIndex = i;
//			}
//		}
//		
//		System.out.println(min);
//		System.out.println(minIndex);
//		//두수를 바꾸기
//		int temp =arr[0];
//		arr[0]=arr[minIndex];
//		arr[minIndex]=temp;
//		
//		System.out.println(Arrays.toString(arr));
//		
		
//		//더해보기) 토너먼트
//		//두팀씩 묶어서 이긴팀 출력
//		//마지막 한팀이 남을때까지
//		int[] score = {4,5,3,6,7,2,4,5,8,9,3,8};
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
