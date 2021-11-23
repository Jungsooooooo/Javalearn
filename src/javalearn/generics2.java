package javalearn;

import java.util.HashMap;

class Student {
	String name = "";
	int ban;
	int num;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int num, int kor, int eng, int math){
		this.name 	= name;
		this.ban	= ban;
		this.num	= num;
		this.kor	= kor;
		this.eng	= eng;
		this.math	= math;
	}
	
}

public class generics2 {

	public static void main(String[] args) {
		HashMap<String,Student> map = new HashMap<>(); 
		// JDK1.7부터 생성자에 타입지정이 생략이 가능하다고 한다. 
		// 그러나 다른 것을 입력하면 안된다!
		map.put("자바왕", new Student("자바왕", 1, 1, 100, 100, 100));
		
		Student s = map.get("자바왕"); //지네릭 덕분에 형변환 생략 가능.
		
		System.out.println(map);
	}

}
