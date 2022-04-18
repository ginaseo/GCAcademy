package p07_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class J201221_01_ArrayList {

	public static void main(String[] args) {
		// 자료구조: 프로그램에서 사용되는 데이터를 메모리나 저장장치에 저장하고
		//이를 사용하는 논리적인 구조
		//자료구조에 따라 프로그램의 성능이 좌우된다.
		//데이터의 저장방식 : 리스트, 스택, 큐, 트리, 해쉬
		
		//컬렉션 프레임워크: 데이터의 저장방법과 알고리즘에 대한 프레임워크
		
		//1-1.ArrayList
		String[] s = new String[3];
		s[0]="홍길동"; s[1]="이순신"; s[2]="유관순";
		
		//
//		ArrayList<String> names = new ArrayList<>();
//		names.add("홍길동");
//		names.add("이순신");
//		names.add("유관순");
//		names.add("해리포터");
//		System.out.println(names);
//		
		//사용자에게 정수를 입력받아 ArrayList에 저장하고 출력
		//0을 입력하면 반복문 종료
//		ArrayList<Integer> list = new ArrayList<>();
//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			System.out.print("정수?(0.나가기)\n");
//			int no = sc.nextInt();
//			if (no==0) break;
//			list.add(no);
//		}
//		
//		System.out.println(list);
//		//for문으로 출력
//		for(int i=0; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
//		//foreach문으로 출력
//		for(Integer a:list) {
//			System.out.println(a);
//		}
		

		
//		//add에서도
//		//Double저장 ArrayList생성
//		List<Double> list = new ArrayList<>();
//		list.add(1.1);
//		list.add(2.2);
//		System.out.println(list);
//		list.add(1,3.3);//중간에 삽입
//		list.remove(0);//삭제
//		System.out.println(list);
//		System.out.println(list.remove(2.2));
//		System.out.println(list);
//		list.add(4.4);
//		System.out.println(list);
//		System.out.println(list.indexOf(4.4)); //index값 얻기
//		//for문
//		for(int i=0; i<list.size();i++){
//			System.out.println(list.get(i));
//		}
//		for(double d:list) {
//			System.out.println(d);
//		}
		
		
		//실습)정수를 입력받아 arraylist에 저장하고 합계 평균 구하기
		//0을 입력하면 종료
		//입력받을 반복문
		
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("점수?");
			int no = sc.nextInt();
			if(no==0) break;
			list.add(no);
		}
		
		//합계구하기위한 반복문
		int sum=0;
//		for(int a:list) {
//			sum+=a;
//			
//		}
		//반복자(iterater)를 통해서 순회
		java.util.Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int r = it.next();//다음포인터로 이동
			System.out.println(r);
		}
			
		
		System.out.println("합계: "+sum);
		System.out.println("평균: "+(double)sum/list.size());
		
		

	}

}
