package javalearn;

import java.util.TreeSet;

public class Tree1 {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		int[] score = {40, 35, 77, 42, 16, 23, 55, 100};
		
		for(int i=0; i<score.length; i++) {
			set.add(score[i]);
		}
		// set 객체에다가 score에 있는 값들을 차례대로 대입한다.
			
			System.out.println("40보다 작은 값" + set.headSet(40));
			System.out.println("40보다 큰 값" + set.tailSet(40));
			System.out.println("30과 70사이의 값" + set.subSet(30, 70));
		// 정렬 및 검색에 용이하다.

	}

}
