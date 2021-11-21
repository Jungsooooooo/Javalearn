package javalearn;

import java.util.*;

public class Tree {

	public static void main(String[] args) {
		
		Set set = new TreeSet(); 
		// 범위 검색, 정렬이 자동으로 됨. 그래서 정렬을 따로 할 필요가 없음.

		
		for(int i=0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num);
		}
		// math.random은 0~1 무작위 숫자를 보여주는데
		// 45를 곱해서 0~45에 1을 더했으니 1~45. 로또 프로그램 만들 때 쓰임
		// for 반복문에 int i=0으로 선언하고 set.size() < 6; i++의 의미는
		// 처음에 시작하는 숫자가 0이고 i++로 숫자가 1씩 계속 증가
		// 그런데 size는 6보다 작은 5까지를 의미. 0~5는 (0,1,2,3,4,5) 총 6번.
		// 그리고 set.add(num)은 1~45의 무작위 숫자를 set에 더함.
		// 이 프로그램은 총 6번 실행 되며 결과 값은 오름차순으로 자동 정렬 됨
		
		System.out.println(set);
	}

}
