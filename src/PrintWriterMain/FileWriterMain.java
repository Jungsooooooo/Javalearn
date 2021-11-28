package PrintWriterMain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;


// Text 파일에 출력해보기
public class FileWriterMain {

	public static void main(String[] args)  {
		
		try {
		//FileWriter fw = new FileWriter(""); // 파일 경로 지정
				
		
		PrintWriter pw = new PrintWriter("C:\\javaexercise\\javalearn\\src\\PrintWriterMain/phonebook.txt");
		for(int num = 1; num < 10 ; num++) {
			pw.println(new PhoneDTO(num +", ", "스티브리"+num + ", " ,"0101234123"+num+", ",10+num));
		}
			//pw.write("10" +","+ "스티브리"+ "10" + ","+"01023412310"+", "+20);
			pw.close();
		
	

			BufferedReader br = new BufferedReader( new FileReader("C:\\javaexercise\\javalearn\\src\\PrintWriterMain/phonebook.txt"));
			
			 
			
			String line = "";
			ArrayList<String> arraylist = new ArrayList<>();
			for(int i = 1;(line = br.readLine())!=null;i++){ 	// 데이터가 끝날 때 까지 라인 단위로 읽어라.
			 if(line.indexOf("")!=-1) 							//문자열을 포함하고 있는 정보 모두를 의미한다.
			//	 	System.out.println(line);
			
			 arraylist.add(line);
			}
			
			arraylist.add(9,"10" +", "+ "스티브리"+10+", "+ "01234123"+10+", "+ 10 );
		
			
			//arraylist.clear();
			System.out.println(arraylist);
		
			System.out.println(arraylist.get(9));
			
		
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
