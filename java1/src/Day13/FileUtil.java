package Day13;


import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	
	// 리스트를 파일에 저장 메소드 
	public static void writefile( String dir , String filename , List< user> userlist ) throws Exception {
								// 1. 파일경로		// 2. 파일이름  	3. 리스트[데이터]
		// 1. 파일경로 유무확인
		File dirent = new File(dir);
		if( dirent.exists() ) { // 해당 경로[폴더]가 없으면 
			dirent.mkdir(); // 폴더 생성 메소드 
		}
		// 2. 파일 객체화 
		File file = new File( dir , filename );
							// 경로 , 파일명 
		OutputStream outputStream = new BufferedOutputStream( new FileOutputStream(file));
		
		// 3. 파일 쓰기 
		 	// for( int i = 0 ; i<userlist.size() ; i++ ) {}
		// for문 list 활용   :  for( 임시객체 : 리스트명 ) : 리스트내 객체수만큼 하나씩 대입
		for( user temp : userlist ) {
			
			// 1. 회원정보 하나의 문자열에 담기 [ 필드 구분 , 회원구분 \n ]
			String outstring = temp.getId() +","+temp.getPassword()+","+temp.getName()+"\n";
			// 2. 회원 파일쓰기 
			byte[] b = outstring.getBytes(); // 문자열 => 바이트 변경
			outputStream.write(b); // 파일 쓰기 
		}
		// 4. 스트림 초기화 
		outputStream.close();
	}
	
			
	// 파일을 읽어와서 리스트 저장 
	public static ArrayList<user> readReader( Reader reader ) throws Exception{
		
		BufferedReader bufferedReader = new BufferedReader(reader);
		ArrayList<user> userlist = new ArrayList<>();
		String line;
		// 읽어오기 
		while( ( line = bufferedReader.readLine() ) !=null ) {
									// .readLine() : 한 줄씩 읽어오기 [ \n 기준 ] 
									// .read() : 한 문자씩 읽어오기 
			// 읽어온 줄 분해 
			String[] b = line.split(","); // 읽어온 한줄을 , 기준으로 분해 => b[0]:아이디  b[1]:비밀번호  b[2] : 이름
							// 문자열.split("분해문자") : 분해문자 기준으로 분해 
			// user 객체에 담기 
			user temp = new user( b[0] , b[1] , b[2] );
			// 객체를 리스트 담기 
			userlist.add(temp);
		}
		bufferedReader.close(); // 버퍼 닫기 
		return userlist;
		
	}
	// 파일 읽어오는 메소드 
	public static ArrayList<user> readfile( File file ) throws Exception{ 
				// 반환타입
		
		FileReader fileReader = new FileReader(file);
		ArrayList<user> userlist = new ArrayList<>();
		
		userlist = readReader(fileReader);
		
		fileReader.close();
		return userlist;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
