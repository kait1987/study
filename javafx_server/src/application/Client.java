package application;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	
	// ������ ���ӵ� Ŭ���̾�Ʈ
	
	Socket socket;
	
	public Client( Socket socket) {
		this.socket = socket;
		receive(); // ���Ӱ� ���ÿ� �޽��� �޴� �޼ҵ� ����
		
	}
	
	
	// �޽��� �޴� �޼ҵ� [ ���ѷ��� ]
	public void receive() {
		Runnable thread = new Runnable() {
			
			@Override
			public void run() {
				try {
					
					while(true) {
						InputStream inputStream = socket.getInputStream(); // ������ �Է½�Ʈ��
						
						byte[] buffer = new byte[1000]; // ����Ʈ�� �ޱ�
						inputStream.read(buffer); //  �о����
						
						
						String msg = new String( buffer ); // ����Ʈ => ���ڿ�
						// ���ӵ� ��� Ŭ���̾�Ʈ���� �ޱ� �޽��� ������
						
						System.out.println("[�޽��� ���� ����]" + socket.getRemoteSocketAddress() + " : " +
						Thread.currentThread().getName() );
						
						for( Client temp : ServerController.clients) {
							// ��� ����Ʈ�� 
							temp.send(msg);
						}
					}
					
				} catch (Exception e) {

				}
				
				
				
			}
		};
		
		// �ش� �����带 ������Ǯ�� ����
		
		ServerController.threadpool.submit(thread);
		
		
	}
	
	
	
	// �޽��� ������ �޼ҵ� 
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
		}; // ������ end
		
		ServerController.threadpool.submit(thread);
	}
	

}
