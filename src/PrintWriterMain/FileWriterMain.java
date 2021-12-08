package PrintWriterMain;


import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;


// Text 파일에 출력해보기
public class FileWriterMain {

	public static void main(String[] args)  {
		
		try {
		//FileWriter fw = new FileWriter(""); // 파일 경로 지정
				
		
		PrintWriter pw = new PrintWriter("C:\\javaexercise\\javalearn\\src\\PrintWriterMain/phonebook.txt");
		for(int i = 0; i < 9 ; i++) {
			pw.println(new PhoneDTO("김정수"+i , "93050"+i ,"0101234123"+i));
		}
			//pw.write("10" +","+ "스티브리"+ "10" + ","+"01023412310"+", "+20);
			pw.close();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
