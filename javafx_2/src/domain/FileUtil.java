package domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class FileUtil {
	
	// 파일에서 데이터 가져오기
	public static ArrayList<Member> readfile( File file ){
											// 1. 파일을 인수로 받기 
		try {
			FileReader fileReader = new FileReader(file);
						// 2. 해당 파일을  fileReader 객체에 넣기 
			BufferedReader bufferedReader = new BufferedReader(fileReader);
						// 3. 버퍼 클래스에  filfeReader 객체에 넣기 
			ArrayList<Member> members = new ArrayList<>();
			String line;
			while(  ( line = bufferedReader.readLine() ) != null ) {
						// 4. 버퍼에서 한줄씩 읽어오기 [ readLine() ] 	
				String[] b = line.split(",");
						// 5. 읽어온 한줄에서 , 로 분해하기 
				Member temp = new Member(b[0], b[1], b[2], b[3] );
						// 6. 분해된 데이터로 회원객체 만들기
				members.add(temp);
						// 7. 회원객체 리스트 담기 
			}
			bufferedReader.close();
			fileReader.close();
			
			return members; // 8. 파일 읽은 리스트를 반환
			
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;  // 오류 발생시 null 반환 

		
	}
	//				
	

}
