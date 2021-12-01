package PrintWriterMain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FIleRe {

	public static void main(String[] args) {
		try {
				BufferedReader br = new BufferedReader( new FileReader("C:\\javaexercise\\javalearn\\src\\PrintWriterMain/phonebook.txt"));
						
				String line = "";
				ArrayList<String> arraylist = new ArrayList<>();
				for(int i = 1;(line = br.readLine())!=null;i++){ 	// 데이터가 끝날 때 까지 라인 단위로 읽어라.
				 if(line.indexOf("")!=-1) 							//문자열을 포함하고 있는 정보 모두를 의미한다.
			
				
				 arraylist.add(line);
				 
				 }
					
				arraylist.add(9,"10" +", "+ "스티브리"+10+", "+ "01234123"+10+", "+ 20 );
				
								
				PrintWriter pw = new PrintWriter("C:\\javaexercise\\javalearn\\src\\PrintWriterMain/phonebook.txt");
				for(int i = 0; i<arraylist.size(); i++) {
					pw.println(arraylist.get(i));
				}
					//pw.write("10" +","+ "스티브리"+ "10" + ","+"01023412310"+", "+20);
					
					pw.close();
				
				
				
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
}
}