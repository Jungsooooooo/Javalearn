package javalearn;

import java.util.ArrayList;

public class generics {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); 
		list.add(20); // Integer이기 때문에 숫자는 들어 갈 수 있지만 
		//list.add("30"); // 문자열은 들어가지 못하기 때문에 에러가 뜬다 -> 지네릭스 기능
		 
		//Integer i = (Integer)list.get(2);
		Integer i = list.get(2); // 형변환 생략가능.
		
		ArrayList<Object> list1 = new ArrayList<Object>(); // -> JDK 1.5 부터는 <Object>를 써줘야 좋은 코드이다.
		list1.add(10); 
		list1.add(20); // Integer이기 때문에 숫자는 들어 갈 수 있지만 
		list1.add("30"); // 문자열은 들어가지 못하기 때문에 에러가 뜬다 -> 지네릭스 기능
		
		// runtime error -> compile error로 변경.

		//지네릭스 는 객체의 타입 안정성을 높이고 형변환의 번거로움을 줄여준다.
		
		System.out.println(list);

	}

}
