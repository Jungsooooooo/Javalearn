package PrintWriterMain;

import java.io.PrintWriter;
import java.util.ArrayList;


// Text 파일에 출력해보기
public class FileWriterMain {

	public static void main(String[] args)  {
		
		try {
		//FileWriter fw = new FileWriter(""); // 파일 경로 지정
				
		
		PrintWriter pw = new PrintWriter("C:\\javaexercise\\javalearn\\src\\PrintWriterMain/phonebook.txt");
		for(int num = 1; num < 10 ; num++) {
			pw.println(new PhoneDTO(num +", ", "스티브리"+num + ", " ,"0101234123"+num));
		}
			//pw.write("10" +","+ "스티브리"+ "10" + ","+"01023412310");
			pw.close();
			
		/*
		 * pw.close(); ArrayList<String> arraylist = new ArrayList<String>();
		 * arraylist.add(phonebook.txt);
		 */
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
