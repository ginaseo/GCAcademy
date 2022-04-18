package p07_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//학생클래스
//필드:이름(name), 전화번호(phone), 나이(age)
//기본생성자,전체필드 생성자
class Student{
	private String name;
	private String phone;
	private int age;
	public Student() {}
	public Student(String name, String phone, int age) {
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}
}
public class J201222_06_Student {
	public static void main(String[] args) {
		//Student를 저장할수 있는 맵
//		key : Integer, value : Student
		Map<Integer, Student> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		//실습:반복문으로
		while(true) {
			System.out.print("번호?");
			int key = sc.nextInt();
			if (key==0) break;
			sc.nextLine(); //엔터값 처리
			System.out.print("이름?");
			String name = sc.nextLine();
			System.out.print("전화번호?");
			String phone = sc.next();
			System.out.print("나이?");
			int age = sc.nextInt();
			//학생객체 생성
			Student std = new Student(name, phone, age);
			map.put(key, std);
		}
		System.out.println(map);
		for(int key : map.keySet()) {
			Student std = map.get(key);
			System.out.print(key+" ");
			System.out.print(std.getName()+" ");
			System.out.print(std.getPhone()+" ");
			System.out.print(std.getAge());
			System.out.println();
		}
	}

}
