package Day14;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;



public class server {
	
	
	
	// �������� : �Ծ� , ���
		// ip : ���ͳ��� ����ϱ� ���� ��Ģ 
		// tcp : �������� ��������
			// ���� : �����͸� ��Ŷ� �� �ֵ��� �������ִ� �����
	
	public static void main(String[] args) {
		// ���� pc�����
		Scanner scanner = new Scanner(System.in);
		
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
				 
				 // 6. Ŭ���̾�Ʈ���� ������ �ޱ�
				 String �޽��� = null;
				 byte[] ����Ʈ = new byte[100];
				 
				 // ����� ������ �Է½�Ʈ�� ��������
				 InputStream �ޱ� = socket.getInputStream();
				 // ��Ʈ�� �о���� => �迭�� ����
				 �ޱ�.read(����Ʈ);
				 // ����Ʈ => String
				 �޽��� = new String(����Ʈ);
				 System.out.println("[���� �޽��� �ޱ� ����]" + �޽���);
				 
				 // 7. Ŭ���̾�Ʈ���� ������ ����
				 
				 OutputStream ������ = socket.getOutputStream();
				 System.out.println("Ŭ���̾�Ʈ���� ���� �Ž��� �Է� : " );
				 �޽��� = scanner.next();
				 ����Ʈ = �޽���.getBytes();
				 ������.write(����Ʈ);
				 System.out.println("[�޽��� ���� ����]");
				 
			}
			
			
			
		} catch (Exception e) {
			
		
		
	}
	
	}
}
