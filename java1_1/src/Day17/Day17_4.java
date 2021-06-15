package Day17;

public class Day17_4 { 
	
	public static void main(String[] args) {
		
		// ����ó�� : ����(����)�߻� ������ ó�� �ڵ� �Է�
			// *�ڵ�� ������ ������ ����ó��
				// if : ���� [�Ϲ����� ������ �Ǵ� ���� ] ����
			// 1. ������� �ʴ� ������ ó��
			// 2. ����� ���� ���� ���� ó�� => �ٸ� �ڵ�� ��ü
			// 3. try{ ������ �߻��� �� ���� ����}catch( ){ ��ü�ڵ� }
			// 4. ������ �߻��ϸ� => ���α׷� ���� /// ������ �߻� ������ => ����ó�� => ���α׷� ����ȭ <--������
			// 5. Exception : ����ó�� �ֻ��� Ŭ����
				// 1. ArrayIndexOutOfBoundsException
				// 2. NumberFormatException
				// 3. NullPointerException
		
		
		
		// ���� 1 )
		String[] �迭 = new String[3]; //�迭 ũ�� = 3
		try {
					
		�迭[0] = "java";
		�迭[1] = "java";
		�迭[2] = "java";
		�迭[3] = "java";
		}catch (ArrayIndexOutOfBoundsException e) {
			
		System.out.println("���ܹ߻�" + e);
		}
		
		//���� 2)
		try {
			String ����1 = "100";
			String ����2 = "a100";
			
			System.out.println("���ڿ� -> ���ڿ� ��ȯ :" + Integer.parseInt(����1));
			System.out.println("���ڿ� -> ���ڿ� ��ȯ :" + Integer.parseInt(����2));
			
			
		} catch (NumberFormatException e) {
			System.out.println("���� �߻� :" + e);
		}
		
		// ���� 3 ) �޸𸮰� null �� ��� ���� �߻�
		
		try {
			String ����3 = null;
			System.out.println("����3 �� ����" + ����3.toString() );
			
		} catch (NullPointerException e) {
			System.out.println("���� �߻� :" + e);
		}
		
		// ���� 4 ) ��� ���� ���
		
		try {
			
			String ����4 = null;
			System.out.println("����3 �� ����" + ����4.toString() );
			
		} catch (Exception e) {
			System.out.println("���� �߻� :" + e);
		}
		
		
		
		
		
		
		
	}

}
