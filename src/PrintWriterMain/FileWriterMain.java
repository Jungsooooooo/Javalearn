package javalearn;

import java.io.PrintWriter;
import java.util.ArrayList;


public class FileWriterMain {

	public static void main(String[] args)  {
		
		try {
		//FileWriter fw = new FileWriter(""); // 파일 경로 지정
				
		
		PrintWriter pw = new PrintWriter("C:\\javaexercise\\javalearn\\src\\javalearn//phonebook.txt");
		for(int num = 1; num < 10 ; num++) {
			pw.println(new PhoneDTO(num +", ", "스티브리"+num + ", " ,"0101234123"+num));
		}
		
		/*
		 * pw.close(); ArrayList<String> arraylist = new ArrayList<String>();
		 * arraylist.add(phonebook.txt);
		 */
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
