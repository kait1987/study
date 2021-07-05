package Day14;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
	
	// 프로토콜 : 규약 , 약속
		// ip : 인터넷을 사용하기 위한 규칙 
		// tcp : 전송제어 프로토콜
			// 소켓 : 테이터를 통신라 수 있도록 연결해주는 연결부
	
	public static void main(String[] args) {
		// 서버 pc만들기
		
		try {
			
			// 1. 서버소켓 객체 생성
			ServerSocket serverSocket = new ServerSocket();
			// 2. 서버소켓 바인딩
			serverSocket.bind( new InetSocketAddress("localhost", 5001) );
						// 소켓. bind( ip 주소 , port)
			while (true) {
				 System.out.println("[연결 대기]");
				 Socket socket = serverSocket.accept();
				 				// .accept : 클라이언트가 서버소켓으로부터 접속 요청시 수락
				 // 수락된 소켓을 담기
				 // 5. 연결된 소켓 가져오기
				 InetSocketAddress socketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
				 System.out.println("[연결 수락]" + socketAddress.getHostName() );
			}
			
			
			
		} catch (Exception e) {
			
		
		
	}
	
	}
}
