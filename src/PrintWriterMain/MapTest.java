package PrintWriterMain;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		String filePath="C:\\javaexercise\\javalearn\\src\\PrintWriterMain/phonebook.txt";
		
		
		try {
			PrintWriter pw = new PrintWriter(filePath);
			Map<String, PhoneDTO> map = new HashMap<>();
			  
			  for(int i = 0; i< 9;i++) {
				  map.put(i+"번", new PhoneDTO("홍길동"+i , "93050"+i ,"0101234123"+i));
				 pw.println(map.get(i+"번"));
				
			  }
			  	pw.close();
			  	map.remove("1번");
			  	 System.out.println(map.get("1번"));
			  	 
		} catch(IOException e) {
			e.printStackTrace();
		}
		
			
		
	}

}
