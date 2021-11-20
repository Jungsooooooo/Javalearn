package javalearn;

public class strequals {

	public static void main(String[] args) {
		
		String Str = "yes";
		
		if(Str.equals("Yes")){
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		// equals는 대소문자를 구분한다.
		
		if(Str.equalsIgnoreCase("Yes")){
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		// equalsIgnoreCase는 대소문자를 구분하지 않는다.
		

	}

}
