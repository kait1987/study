package Day14;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
	
	// �������� : �Ծ� , ���
		// ip : ���ͳ��� ����ϱ� ���� ��Ģ 
		// tcp : �������� ��������
			// ���� : �����͸� ��Ŷ� �� �ֵ��� �������ִ� �����
	
	public static void main(String[] args) {
		// ���� pc�����
		
		try {
			
			// 1. �������� ��ü ����
			ServerSocket serverSocket = new ServerSocket();
			// 2. �������� ���ε�
			serverSocket.bind( new InetSocketAddress("localhost", 5001) );
						// ����. bind( ip �ּ� , port)
			while (true) {
				 System.out.println("[���� ���]");
				 Socket socket = serverSocket.accept();
				 				// .accept : Ŭ���̾�Ʈ�� �����������κ��� ���� ��û�� ����
				 // ������ ������ ���
				 // 5. ����� ���� ��������
				 InetSocketAddress socketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
				 System.out.println("[���� ����]" + socketAddress.getHostName() );
			}
			
			
			
		} catch (Exception e) {
			
		
		
	}
	
	}
}
