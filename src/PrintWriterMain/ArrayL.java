package PrintWriterMain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ArrayL {

	public static void main(String[] args) {
		try {
		BufferedReader br = new BufferedReader( new FileReader("C:\\javaexercise\\javalearn\\src\\PrintWriterMain/phonebook.txt"));
		PrintWriter pw = new PrintWriter("C:\\javaexercise\\javalearn\\src\\PrintWriterMain/phonebook.txt");
		 
		
		String line = "";
		ArrayList<String> arraylist = new ArrayList<>();
		for(int i = 1;(line = br.readLine())!=null;i++){ // 데이터가 끝날 때 까지 라인 단위로 읽어라.
		 if(line.indexOf("")!=-1) //문자열을 포함하고 있는 정보 모두를 의미한다.
		//	 	System.out.println(line);
		
		 arraylist.add(line);
		}
		
		arraylist.add(9,"10"+", " + "스티브리"+"10"+", "+"010123412310");
		arraylist.remove(8); //배열 8번째 값 제거
		arraylist.clear(); //초기화
		// 이미 arraylist 배열 0~8은 값이 차있으니, 9번째 값으로 하여 새롭게 더해준다.
		System.out.println(arraylist); // Arraylist 객체에 값이 담겨졌다.
		System.out.println(arraylist.get(0));// 객체값 하나하나 읽을 수 있게 해준다.
		
		
		
	}catch(IOException e) {
		e.printStackTrace();
	}

}
}
