package Day16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Day16_1 {
	
	public static void main(String[] args ) {
		
		
		
		// �÷��� �����ӿ�ũ
			// 1. List �÷���
				// 1. ArrayList Ŭ���� : ����ȭX
				// 2. Vector Ŭ���� : ����ȭ O
				// 3. LickedList Ŭ���� : ����/���� ����
		
			// 2. Set �÷��� : ������ ���� ���� // �ߺ���� X
				// 1. Hashset Ŭ����
					// Iterator �������̽� �̿��� ��� ����
		
			// 3. Map �÷��� : Ű, �� => �ѽ�
		
		
		
		
		// 1. ����
		java.util.List<User> list = new Vector<>();
			// �������̽� : �߻�޼ҵ� [ �������� �ʴ� �޼ҵ�]
				// �������̽� ȥ�ڼ� �� �� �ִ� ��� x
		
		Vector<User> list2 = new Vector<>();
			// < > ���׸� : �ش� Ŭ������ Ŭ���� �ֱ�
		// 2. �޼ҵ�
		User user = new User();// ��ü����
		list.add( user );
				// <Ŭ����>�� ��ü
		list.add(new User()); // �ߺ����
		
		list.remove(0); // ù��° ��ü ����
		System.out.println(list.size()); // ����Ʈ�� ��ü ��
		
		for (User temp : list) {
					// list�� ��ü�� �ϳ��� Temp ����
			System.out.println(temp);
		}
		
		
		//
		List<String> list3 = new ArrayList<String>();
		List <String> list4 = new LinkedList<>();
		
		Long ����;
		Long ��;
		���� = System.nanoTime(); // ����ð�[����] �޼ҵ�
		for( int i = 0 ; i<10000 ;i++ ) {
			list3.add(0, String.valueOf(i));
								//	String.valueof(����) = > ����
		}
		�� = System.nanoTime();
		System.out.println("ArrayList 10000�� ���� �ɸ��ð� :" + (��-����)+ "ns");
		
		
		//HashSet Ŭ����
		//1. ����
		Set<String > set = new HashSet<>();
		HashSet<String > set2 = new HashSet<>();
		
		//2. �޼ҵ�
		set.add("java");
		set.add("java"); // �ߺ�����
		set.add("c");
		set.add("database");
		System.out.println(" set�� ��ü�� : "+ set.size());
		set.remove("c"); // ��ü����
		System.out.println(" set�� ��ü�� : "+ set.size());
		//
		for (String temp : set) {
			System.out.println(temp);
			
		}
		
		//get??? ------->Iterator
		Iterator<String> iterator = set.iterator();
			//Iterator : ���� ���� �÷��ǿ� ��� ��ü ��ȣ ���������̽�
				// null ���� ���� next() �żҵ� �������� �̵�
		while(iterator.hasNext()) {
					// hasNext() : ������Ұ� �ִ��� ���� Ȯ�� T / F 
			String temp = iterator.next(); // ������� ȣ��
			System.out.println(temp);
			
		}
		set.clear();
		
		
		
		
		
		
		
		
		
	}

}
