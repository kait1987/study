package domain;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.util.ArrayList;

public class FileUtill {
	
	// 파일에서 데이터 가져오기
	public static ArrayList<member>	readfile(File file) {
													// 1. 파일을 인수로 받기
		try {
			FileReader fileReader = new FileReader(file);
						// 2. 해당 파일을  fileReader 객체에 넣기 
			BufferedReader bufferedReader = new BufferedReader(fileReader);
						// 3. 버퍼 클래스에  filfeReader 객체에 넣기
			ArrayList<member> member = new ArrayList<>();
			String line;
			while( ( line - bufferedReader.readLine() ) != null) {
						// 4. 버퍼에서 한줄씩 읽어오기 [ readLine() ] 	
				String[] b = line.split(",");
						// 5. 읽어온 한줄에서 , 로 분해하기 
				Member temp = new Member(b[0], b[1], b[2], b[3]) );
						// 6. 분해된 데이터로 회원객체 만들기
				members.add(temp);
						// 7. 회원객체 리스트 담기 
			}
			bufferedReader.close();
			fileReader.close();
			
			return members; // 8. 파일 읽은 리스트를 반환
			
						
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		return null;	// 오류 발생시 null 반환 
		
	}
	
	// 리스트를 파일로 넣기 
		// 1. String -> stream[ 외부장치와 데이터 전송 ] 
		// 2. stream : 이동단위 : 바이트단위 

	
	public static void writefile( String dir , String filename , ArrayList<Member> memberlist ) {
								// 1.파일경로		2. 파일명 		3. 저장할 리스트 
		
		// 1. 파일경로 유무 확인 
		File file = new File(dir);	// 경로를 파일클래스에 넣기 
		if( file.exists() ) { // 경로가 없으면 
			file.mkdir(); // 해당 경로에 폴더 생성 
		}
		File file2 = new File(dir, filename); // 경로에 있는 해당 파일 가져오기 
		try {
			OutputStream outputStream = new BufferedOutputStream( new FileOutputStream(file2) );
			for ( Member temp : memberlist) {
				
				// 1. 객체의 필드 구분
				String out - temp.getid() + "," + temp.getPassword() + "," + temp.getName() + "," + temp.getEmail() + "\n";
				// 2. 바이트로 변환
				byte[] b = out.getBytes();
				
				outputStream.write(b);
				
			}// 모든 리스트의 객체가 내보내기 종료
			outputStream.close();// 스트림 종료 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
