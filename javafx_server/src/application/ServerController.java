package application;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ServerController implements Initializable {
	
	// 스레드풀 사용
		// 외부로부터 대량의 요청을 순서매겨 하나씩 처리
	public static ExecutorService threadpool; 	// 쓰레드풀 구현 클래스 : ExecutorService
	
	// 접속된 클라이언트 저장하기 위한 리스트 [ 동기회 기능이 있는 vector]
		// 동기화 : 여러 스레드가 동일한 메소드 호출시 충돌 제거 [ 메소드에 스레드 호출 제한]
	public static Vector<Client> clients = new Vector<>() ;
	
	
	ServerSocket serverSocket; // 서버 소켓
	
	// 서버 실행 메소드 [ 서버소켓 생성 => 무한루프(클라이언트 접속 기다리기])
	
	public void serverstart() {
		try {
		// 1. 서버 실행시 메모리 할당
		serverSocket = new ServerSocket();
		// 2. 서버 바인딩 [ 서버소켓 구축 ip, port]
		serverSocket.bind( new InetSocketAddress("127.0.0.1", 1234));
	}
	catch (Exception e) { }
	
	Runnable thread = new Runnable() {
		
		@Override
		public void run() {
			try {				
				while(true) {
					// 1. 클라이언트 접속 요청시 허가
					Socket socket = serverSocket.accept();
					// 2. 허가된 클라이언트 리스트에 담기
					clients.add( new Client(socket));
				}
				
			} catch (Exception e) {	}
		}
			
	}; // 쓰레드 end
		// 서버를 실행시 쓰레드풀에 남아 있는 데이터를 초기화
		threadpool = Executors.newCachedThreadPool();
		threadpool.submit(thread);

	}
	// 서버 중지 메소드 [ 서버소켓 닫기]
	public void serverstop() {
		
		try {
		// 1. 현재 접속된 클라이언트 소켓 모두 종료
		Iterator< Client > iterator = clients.iterator();
			// Iterator : 컬레션프레임워크내 모든 요소들 하나 씩 순회
		while( iterator.hasNext() ) { // .hasNext () : 다음 요소가 있는지 확인
			Client client = iterator.next(); //.next() : 다음 요소 가져오기
			client.socket.close(); // 예외 처리 발생
			iterator.remove();
		}
		
		// 2. 서버소켓 종료
		serverSocket.close();
		
		
		
		// 3. 스레드풀 종료
		threadpool.shutdown();
		
		
		}catch (Exception e) {}		
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
	
    @FXML
    private TextArea txtserver;

    @FXML
    private Button btnstart;

    @FXML
    void start(ActionEvent event) {
    	
    	
    	if(btnstart.getText().equals("서버실행") ) { // 버튼이 서버실행이면
    		// 1. 서버 싷앵
    		
    		serverstart();	
    		// 람다식 표현 [ 텍스트창에 메시지 추가]
    			// Platform 모든 스테이지
    		// platform.runLater( (인수) -> { 실행코드 } );
    		Platform.runLater(  ( ) -> {
    			String msg = "[서버시작]\n"; 	// 메시지창에 표시할 내용
    			txtserver.appendText(msg);	// 메시지를 textarea 추가
    			btnstart.setText("서버중지");	// 버튼텍스트 서버중지로 설정
    		});
    		
    	}else { // 버튼이 서버중지이면
    		// 1. 서버중지
    		serverstop();
    		Platform.runLater( () -> {
    			String msg = "[서버중지]\n";	// 메시지창에 표시할 내용
    			txtserver.appendText(msg);	// 메시지를 textarea 추가
    			btnstart.setText("서버실행");	// 버튼텍스트 서버중지로 설정
    			
    		});
    	}
    

    }
	
}
