package PrintWriterMain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BFReader {

	public static void main(String[] args){
		try {
			//FileReader fr	= new FileReader("C:\\javaexercise\\javalearn\\src\\PrintWriterMain/phonebook.txt");
			BufferedReader br = new BufferedReader( new FileReader("C:\\javaexercise\\javalearn\\src\\PrintWriterMain/phonebook.txt"));
			
			
			String line = "";
			String z ="";
			
//			for(int i = 1;(line = br.readLine())!=null;i++){ // 문자열이 끝날 때 까지 라인 단위로 읽어라.
//			 if(line.indexOf("")!=-1) //문자열을 포함하고 있는 정보 모두를 의미한다.
//				 	System.out.println(line);
//			}
//			br.close();
			
			while((z=br.readLine())!=null) {
				if(z.indexOf("")!=-1) {
					System.out.println(z);
				}
			}
		
		} catch(IOException e){
			e.printStackTrace();
		}
	}

}
