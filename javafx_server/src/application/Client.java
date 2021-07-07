package application;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	
	// 서버에 접속된 클라이언트
	
	Socket socket;
	
	public Client( Socket socket) {
		this.socket = socket;
		receive(); // 접속과 동시에 메시지 받는 메소드 실행
		
	}
	
	
	// 메시지 받는 메소드 [ 무한루프 ]
	public void receive() {
		Runnable thread = new Runnable() {
			
			@Override
			public void run() {
				try {
					
					while(true) {
						InputStream inputStream = socket.getInputStream(); // 소켓의 입력스트림
						
						byte[] buffer = new byte[1000]; // 버이트로 받기
						inputStream.read(buffer); //  읽어오기
						
						
						String msg = new String( buffer ); // 바이트 => 문자열
						// 접속된 모든 클라이언트에게 받기 메시지 보내기
						
						System.out.println("[메시지 수신 성공]" + socket.getRemoteSocketAddress() + " : " +
						Thread.currentThread().getName() );
						
						for( Client temp : ServerController.clients) {
							// 모든 리스트에 
							temp.send(msg);
						}
					}
					
				} catch (Exception e) {

				}
				
				
				
			}
		};
		
		// 해당 쓰레드를 쓰레드풀에 저장
		
		ServerController.threadpool.submit(thread);
		
		
	}
	
	
	
	// 메시지 보내는 메소드 
	public void send ( String msg) {
		Runnable thread = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					OutputStream outputStream = socket.getOutputStream();
					byte [] buffer = msg.getBytes();
					
					outputStream.write(buffer);
					outputStream.flush();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}; // 쓰레드 end
		
		ServerController.threadpool.submit(thread);
	}
	

}
