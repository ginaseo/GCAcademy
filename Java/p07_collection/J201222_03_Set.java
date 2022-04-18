package p07_collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class J201222_03_Set {

	public static void main(String[] args) {
		// Set
		// 중복허용이 안됨
		// 순서가 없다(index없다)
		// HashSet
//		Set<String> set = new HashSet<String>();
//		set.add("java");
//		set.add("oracle");
//		set.add("java");
//		System.out.println(set);
//		Iterator<String> it = set.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
//		System.out.println(set.size());
		
		//TreeSet
		//이진검색 트리의 형태로 데이터저장
		//정렬, 검색에 뛰어난 성능
		TreeSet<Integer> set = new TreeSet<>();
		set.add(9); set.add(3); set.add(2); set.add(5); set.add(10);
		Iterator<Integer> it =set.iterator();//오름차순		
//		Iterator<Integer> it =set.descendingIterator();//내림차순		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
