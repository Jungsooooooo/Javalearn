package javalearn;

public class fibo {

	public static void main(String[] args) {
		// 피보나치 수열
		
		int number [] = new int[100]; 
		
		number[1] = 1;
		number[2] = 1;
		
		for(int i =3 ;i<100;i++) {
			number[i] = number[i-1] +number[i-2];
		}
		
		for (int i=1;i<=10;i++) {
			System.out.print(number[i] +",");
		}
		
	}

}
