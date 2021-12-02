package PrintWriterMain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ArrayL {

	public static void main(String[] args) {
		
		//String filepath 만들기.

		try {
			FileReader fr = new FileReader("C:\\javaexercise\\javalearn\\src\\PrintWriterMain/phonebook.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line= "";
		String[]pdtoarr = line.split(",");
		PhoneDTO pdto = new PhoneDTO(pdtoarr[0], pdtoarr[1], pdtoarr[2]);
		ArrayList<PhoneDTO>arrayList = new ArrayList<>(); // arrayList 하나 만들어 주고
		for(int i=0;(line=br.readLine())!=null;i++) {	// txt파일에 있는 내용 line 별로 읽어오는 기능
			if(line.indexOf("")!=-1) {					// 안에 내용이 ("")문자열이 있으면
				
				
				arrayList.add(pdto);					// 더해준다.
			} else {
				System.out.println("아무것도 들어있지 않습니다.");
			}
				
		}
		
		arrayList.add( new PhoneDTO("10","스티브리"+"10","010123412310"));
		
		//System.out.println(arrayList.get(0).getName());
		//arrayList.remove(8); //배열 8번째 값 제거
		//arrayList.clear(); //초기화
		// 이미 arraylist 배열 0~8은 값이 차있으니, 9번째 값으로 하여 새롭게 더해준다.
		//System.out.println(arrayList); // Arraylist 객체에 값이 담겨졌다.
		//System.out.println(arrayList.get(9));// 객체값 하나하나 읽을 수 있게 해준다.
		
		
		//객체를 다시 스트링으로 바꿔 줘야 한다.
		PrintWriter pw = new PrintWriter("C:\\javaexercise\\javalearn\\src\\PrintWriterMain/phonebook.txt");
		for(int i = 0; i<arrayList.size(); i++) {
			pw.println(arrayList.get(i));
		}
			
			
			pw.close();
		
		
		
		
	}catch(IOException e) {
		e.printStackTrace();
	}

	}
}

