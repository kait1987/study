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
	
	
	Socket socket; // ���� ����
	
	// Ŭ���̾�Ʈ ���� �޼ҵ�
	public void clientstart() {
		// 1. ���� ���� -> 2. ������������ �����û
		
		// THread thread = new Thread() { run �޼ҵ� �������̵�};
		Thread thread = new Thread() {
			public void run() {
				try {
					socket = new Socket("127.0.0.1" , 1234);
					receive();
					
				} catch (Exception e) {}
			}
		}; // ������ ��ȣ ��
			thread.start();  	// run �޼ҵ�(��Ƽ������ ����) <------- start(run�޼ҵ�ȣ��)
		
	}
	// Ŭ���̾�Ʈ ���� �޼ҵ�
	public void clientstop() {
		try {
			socket.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// �޽��� ���� �޼ҵ�
	public void send( String msg) {
		Thread thread = new Thread() {
			public void run() {
				try {
					OutputStream outputStream = socket.getOutputStream();
					byte[] buffer = msg.getBytes(); // ���ڿ� --> ����Ʈ��
					outputStream.write(buffer); // ��Ʈ�� ��������
					outputStream.flush(); // ��Ʈ�� ���繰 �ʱ�ȭ
				} catch (Exception e) {	}
			}
			};
			thread.start();
		}
	
	// �޼��� �޴� �޼ҵ�
	
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// fxml û�� �������� �ʱⰪ
		txtcontents.setDisable(true); // �����ϱ��� �Է�â ����
		btnsend.setDisable(true); // �����ϱ��� ���۹�ư ����
		
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
	    	
	    	if (btnconn.getText().equals("�����ϱ�") ) { // ��ư�� �����ϱ� �̸�
	    		
	    	// 1. Ŭ���̾�Ʈ ����
	    		clientstart();
	    		Platform.runLater( () -> {
	    			txtclient.appendText("[ä�ù� ����] \n");
	    		} );
	    		
	    	// 2. ���� ��
	    		btnconn.setText("��������");
	    		txtcontents.setDisable(false);
	    		btnsend.setDisable(false);
	    		txtcontents.requestFocus();
	    		
	    	}else {
	    		// 1. Ŭ���̾�Ʈ ����
	    		clientstop();
	    		Platform.runLater( () ->{
	    			txtclient.appendText("[ä�ù� ����] \n");
	    		});
	    		// 2.���� ��
	    		btnconn.setText("�����ϱ�");
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
