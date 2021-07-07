package Day14;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			
	
		
		while(true) { 
			// 1. 소켓 만들기 
			Socket socket = new Socket();
			// 2. 서버소켓 연결하기 [ 서버소켓의 bind 된 ip주소, port번호]
			socket.connect( new InetSocketAddress("localhost" , 5001) );
				// 소켓.connet( ip주소, port)
			System.out.println("[연결 성공]");
			// 3. 데이터 전송하기 [ 소켓의 스트림 이용]
				// 스트림 : 외부장치와 데이터 [ 단위 : 바이트]
			String 메시지 = null;
			byte[] 바이트 = null;
			
			System.out.println(" 서버로 보낼 메시지 입력:");
			메시지 = scanner.next();
				// string -----> 바이트
			바이트 = 메시지.getBytes(); // 바이트로 변환
			// 소켓의 출력스트림 가져오기
			OutputStream 보내기 = socket.getOutputStream();
			// 전송
			보내기.write(바이트);
			System.out.println("[메시지 전송 성공]");
			
			// 4. 데이터 받기
			InputStream 받기 = socket.getInputStream();
			받기.read(바이트);
			메시지 = new String(바이트);
			System.out.println("[ 클라이언트 메시지 받기 성공] " + 메시지);
			
			
		}
	} catch (Exception e) {
		// TODO: handle exception
		
	}
	}

}
