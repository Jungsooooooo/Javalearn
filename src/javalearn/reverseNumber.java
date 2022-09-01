package javalearn;

public class reverseNumber {

	public static void main(String[] args) {
		// 숫자 734 와 871을 거꾸로 읽어라

		int number1 = 734;
		int number2 = 871;
		int number =100;
		int newNumber1 = 0;
		int newNumber2 = 0;
		int realNumber1 = 0;
		int realNumber2 = 0;
		while(number1!=0 && number!=0) {
			newNumber1= (number1%10) *number;
			newNumber2= (number2%10) *number;
		
			
	 		number/=10;
			number1/=10;
			number2/=10;
			
			realNumber1 += newNumber1;
			realNumber2 += newNumber2;
		}
			System.out.println(realNumber1);
			System.out.println(realNumber2);
		
		
		
	}

}
