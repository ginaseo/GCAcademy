package p07_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J201222_05_Map {

	public static void main(String[] args) {
		//Map<K,V>
		//맵계열은 순서가 없다.
		//key와 value의 한쌍
		//key중복이 안되고 value는 중복 가능
		//HashMap : null값 허용, HashTable : null값 허용 안됨
		//TreeMap : 정렬기능을 제공
		
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 20);
		map.put("이순신", 40);
		System.out.println(map.get("홍길동"));
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		
		//실습)사용자에게 0~3까지의 영어단어를 입력받아 맵에저장하고
//		0: zero, 1: one, 2: two...출력
		
		Map<Integer,String> map1 = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.println(i +"의 영단어?");
			String word = sc.next();
			map1.put(i,word);
		
		}
		System.out.println(map1);
		System.out.println("----------");
//		System.out.println(map.size());
//		for(int i=0; i<map.size();i++) {
//			System.out.println(map.get(i));

//		}
		//map.keySet()
		for(int key:map1.keySet()) {
			System.out.println(key+":"+map.get(key));
		}

		
		
		
		
	}

}
