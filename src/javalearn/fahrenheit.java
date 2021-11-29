package javalearn;

public class fahrenheit {

	public static void main(String[] args) {
		// 섭씨로 변환 C = 5/9 * (f-32). 결과값은 소수점 셋째자리에서 반올림해야한다.
		// Math.round()를 사용하지 않고 처리할 것.
		int fahrenheit = 100;
		
		
		float celcius = (float)5/9 * (fahrenheit-32);
		
		System.out.println(fahrenheit);
		System.out.println((int)((celcius+0.0003)*1000)/(float)1000);
		//반올림 하기 위해 0.0003을 더했다.

	}

}
