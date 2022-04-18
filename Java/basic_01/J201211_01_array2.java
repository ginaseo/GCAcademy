package basic_01;

import java.lang.reflect.Array;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

import javax.rmi.CORBA.Stub;

public class J201211_01_array2 {

	public static void main(String[] args) {
		// 2차 배열
//		int[][] arr = new int[2][3];
//		arr[0][0] = 1; arr[0][1] = 2; arr[0][2] = 3;
//		arr[1][0] = 4; arr[1][1] = 5; arr[1][2] = 4;
		
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j = 0; j<arr[i].length; j++) {
//				arr[i][j] = i*3 + j + 1;
//				System.out.println(arr[i][j]);
//			}
//		}
		
		
		//2차배열 선언(행의 열의 갯수 다르게)
//		int[][] arr=new int[2][];
//		arr[0] = new int[10];
//		arr[1] = new int[5];
//		for(int i=0; i<arr.length; i++) {
//			for(int j = 0; j<arr[i].length; j++) {
//				arr[i][j] = i*3 + j + 1;
//				System.out.println(i+","+ j+ "=>" + arr[i][j]);
//			}
//		}
		
//		//2차배열의 선언과 동시에 초기화
//		int[][] arr = new int[][] {{1,2,3},{4,5,6,7,8}};
//		int[][] arr = {{1,2,3},{4,5,6,7,8}};
//		
//		//foreach문으로 출력
//		for(int[] a : arr) {
//			System.out.println(Arrays.toString(a));
//			for(int b:a) {
//				System.out.println(b);
//			}
//		}
//		
		
		
//		//실습)2명학생의 국/영/수 점수를 입력받아 저장
//		//총점과 평균
//		Scanner sc = new Scanner(System.in);
//		int[][] score=new int[2][3];
//		for (int i=0; i<score.length;i++) {
//			System.out.printf("[학생%d] 국영수 점수?",i+1);
//			for (int j=0; j<score[i].length;j++) {
//				score[i][j]=sc.nextInt();
//				
//			}
//		}
//		System.out.println("-----------------------");
//		int sum=0;
//		int totSum=0;
//		for(int i=0; i<score.length;i++) {
//			sum=0;
//			for(int j =0; j<score[i].length;j++) {
//				sum+=score[i][j];	
//			}
//			System.out.printf("[학생%d] 총점: %d ",i+1,sum);
//			System.out.printf("평균: %.2f\n",(double)sum/score.length);
//			totSum+=sum;
//		}
//		//전체합계 평균
//		System.out.println("전체 합계: "+totSum);
//		System.out.println("전체 평균: "+totSum/score.length*score[0].length);

//		//실습)2명학생의 수강신청과목수를 입력 받아서 수강료를 입력하는 프로그램
//		//만약 두과목을 수강하면 두번 수강료를 입력
//		
//		Scanner sc = new Scanner(System.in);
//		int[][] fee= new int[2][];
//		int subCnt;//수강과목수
//		for(int i=0; i<fee.length;i++) {
//			System.out.println("수강 과목수는?");
//			subCnt = sc.nextInt();//과목수만큼 열생성
//			fee[i]=new int[subCnt];
//			for(int j=0;j<subCnt;j++) {	
//				System.out.printf("%d)수강료?",j+1);
//				fee[i][j]=sc.nextInt();
//			}
//		}
//		
//		for(int[] f:fee) {
//			System.out.println(Arrays.toString(f));
//		}
//		
//		
		
//		//배열의 복사
//		//얕은 복사
//		int[] src = {10,20,30};
//		int[] desc= src;
//		
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(desc));
//		
//		src[0]=100;
//		
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(desc));
		
//		//깊은복사
//		int[] src= {10,20,30};
//		int[] desc=new int[3];
//		
//		for(int i=0; i<src.length; i++) {
//			desc[i]=src[i];
//		}
//		
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(desc));
//		
//		src[0]=100;
//		
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(desc));
		
//		//배열의 깊은 복사 메소드
//		int[] src = {10,20,30};
//		int [] dest = new int[3];
//		System.arraycopy( src, 0, dest, 0, 3);
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
//
//		src[0]=100;
//		
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
//		
		
//		//확인문제)183page
//		boolean run= true;
//		int selectNo; //선택번호
//		int stdNum = 0; //학생수
//		int[] scores = null; //참조변수
//		
//		
//		Scanner sc = new Scanner(System.in);
//		while (run) {
//			System.out.println("------------------------------------------------");
//			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
//			System.out.println("------------------------------------------------");
//			System.out.print("선택>");
//			selectNo = sc.nextInt();
//			if (selectNo==1) {
//				System.out.print("학생수는?");
//				stdNum = sc.nextInt();
//				scores = new int[stdNum];
//			}else if (selectNo==2) {
//				for(int i=0; i<stdNum; i++) {
//					System.out.print(i+1+"번 점수는?");
//					scores[i] = sc.nextInt();
//				}
//			}else if (selectNo==3) {
//				if (scores==null) continue;
//				for(int i=0; i<stdNum; i++) {
//					System.out.println(i+1 + "번 " + scores[i]+"점");
//				}
//			}else if (selectNo==4) {
//				//최고점수/합계
//				int max = 0, sum=0;
//				for(int score:scores) {
//					if (score>max)max = score;
//					sum += score;
//				}
//				System.out.println("최고점수:" + max);
//				System.out.printf("평균:%.2f\n",(double)sum/stdNum);
//			}else if (selectNo==5) {
//				break;
//			}else {
//				System.out.println("잘못된 번호");
//			}
//		}
//		
//		System.out.println("프로그램 종료");

		

		
		
		
		
		
		
		
		
		
		
		
	}

}
