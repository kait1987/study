package Day17;

import java.util.Stack;

public class Day17_1 {
	public static void main(String[] args) {
	
		// �÷��� ���� : �ڷᱸ�� [ ������ ���� ����]
		
		// Stack Ŭ���� : LIFO
				// ��) 
				// ��) �Ա�/�ⱸ ����
		
		
		Stack < ���� > �������� = new Stack<>();
			// < > ���׸�
		
		��������.push( new ����(100) ) ;
		��������.push( new ����(200) ) ;
		��������.push( new ����(300) ) ;
		System.out.println("���������� ������ : " + ��������.size());
		
		//for (int i = 0 ; i<��������.size ; i++) { }
		for (���� temp : �������� ) {
			System.out.println(" �����ݾ� : "+ temp.����);			
		}
		
		while( !��������.isEmpty() ) {
			���� temp = ��������.pop();
			System.out.println( " ���� ���� : "+ temp.����);			
		}
		
		Queue<����> �������� 2 = new Linkedlist<>();
		
		
		��������2.offer (new ����(100) );
		��������2.offer (new ����(200) );
		��������2.offer (new ����(300) );
		
		System.out.println(" ��������2 : "+ ��������2.size() );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
