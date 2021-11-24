package javalearn;

import java.util.ArrayList;

class Subject{}
class English extends Subject{}
class Math2 extends Subject{}
class PE{}

public class generics1 {

	public static void main(String[] args) {
		
		ArrayList<Subject>	SubjectList = new ArrayList<Subject>();
		ArrayList<English>	E = new ArrayList<English>();
		//        이부분과						이부분이 일치해야 에러가 나지 않고 제대로 기능을 구현한다.
		
		SubjectList.add(new English());
		SubjectList.add(new Math2());   // English와 Math가 Subject의 자손이기 때문에 대입이 가능하다.
		//SubjectList.add(new PE()); 	-> 에러
	}

}
