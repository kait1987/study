package application;

import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ClientController implements Initializable{
	
	
	Socket socket; // 소켓 선언
	
	// 클라이언트 시작 메소드
	public void clientstart() {
		// 1. 소켓 생성 -> 2. 서버소켓으로 연결요청
		
		// THread thread = new Thread() { run 메소드 오버라이딩};
		Thread thread = new Thread() {
			public void run() {
				try {
					socket = new Socket("127.0.0.1" , 1234);
					receive();
					
				} catch (Exception e) {}
			}
		}; // 쓰레드 괄호 끝
			thread.start();  	// run 메소드(멀티스레드 로직) <------- start(run메소드호출)
		
	}
	// 클라이언트 종료 메소드
	public void clientstop() {
		try {
			socket.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// 메시지 전용 메소드
	public void send( String msg) {
		Thread thread = new Thread() {
			public void run() {
				try {
					OutputStream outputStream = socket.getOutputStream();
					byte[] buffer = msg.getBytes(); // 문자열 --> 바이트열
					outputStream.write(buffer); // 스트림 내보내기
					outputStream.flush(); // 스트림 내욜물 초기화
				} catch (Exception e) {	}
			}
			};
			thread.start();
		}
	
	// 메세지 받는 메소드
	
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// fxml 청므 열었을때 초기값
		txtcontents.setDisable(true); // 접속하기전 입력창 차단
		btnsend.setDisable(true); // 접속하기전 전송버튼 차단
		
	}
	
		@FXML
	    private TextArea txtclient;

	    @FXML
	    private TextField txtcontents;

	    @FXML
	    private Button btnsend;

	    @FXML
	    private Button btnconn;

	    @FXML
	    private TextField txtname;

	    @FXML
	    void conn(ActionEvent event) {
	    	
	    	if (btnconn.getText().equals("접속하기") ) { // 버튼이 접속하기 이면
	    		
	    	// 1. 클라이언트 실행
	    		clientstart();
	    		Platform.runLater( () -> {
	    			txtclient.appendText("[채팅방 접속] \n");
	    		} );
	    		
	    	// 2. 접속 후
	    		btnconn.setText("접속종료");
	    		txtcontents.setDisable(false);
	    		btnsend.setDisable(false);
	    		txtcontents.requestFocus();
	    		
	    	}else {
	    		// 1. 클라이언트 종료
	    		clientstop();
	    		Platform.runLater( () ->{
	    			txtclient.appendText("[채팅방 퇴장] \n");
	    		});
	    		// 2.종료 후
	    		btnconn.setText("접속하기");
	    		txtcontents.setDisable(true);
	    		btnsend.setDisable(true);
	    	}

	    }

	    @FXML
	    void send(ActionEvent event) {
	    	send( txtname.getText() + " : " + txtcontents.getText() + "\n" );
	    	
	    	txtcontents.setText("");
	    	txtcontents.requestFocus();

	    }
	
	
	
	
	
	
	
	
	
	
	
	}
