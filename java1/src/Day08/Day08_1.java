package Day08;

public class Day08_1 {
	
	public static void main(String[] args) {
	
		// Ŭ���� : ������ ���� ���� => ��üȭ 
		
		// ����1: ���̵�,��й�ȣ,����,���� �Է¹޾� 3���� ȸ��(��ü) �����
			// 1. Ŭ���� ���� [ �ʵ�(����) , �޼ҵ�(�Լ�) , ������ ]
			// 2. Ŭ����������� ��ü ����
				// Ŭ������ ��ü�� = new Ŭ������();
			// 3. ���� ��� [ ��ü�� Ŭ������ ���� ���� [ ���ٿ����� : . ]
				// 1. ��ü��.�ʵ��
				// 2. new Ŭ������(  ) : �����ڷ� ���� ��� 
			// 4. �޼ҵ� : �Լ�
				// �Լ� : ��[����] ��[����] : ���� �ȿ� ����ִ� �� => �̸� �־�� �� 
				// �޼ҵ� : �̸� �ۼ��� �ڵ�
					// 1. �ѹ� ���Ǵ� �ڵ�� => �޼ҵ�� ���� �ʿ� ����
					// 1. ��Ȱ��[ �ݺ��Ǵ� �ڵ� ] => �޼ҵ� ���� ȿ���� ũ�� 
					// 2. ������ �ڵ� ����
					// 3. �μ� �� ��ȯ�� ���� [ �޸� ȿ���� ]
						// 1. �μ� : ���� ��(�ڵ�)
						// 2. ��ȯ : �����ִ� ��(�ڵ�)
					// 4. �޼ҵ�{ } �ȿ��� ����� ������ ������ ����Ǹ� �ʱ�ȭ
						// ���� �����ʹ� ��ȯ�ؼ� �������� 
						// return
		
		// 1��° ȸ��
		ȸ�� ȸ��1 = new ȸ��(); // ��ü ����  => 1��° ������ ��� => ���� 
		
			System.out.println("--->ȸ��1�� ����");
		ȸ��1.ȸ������(); // �޼ҵ� ȣ��
		
		ȸ��1.���̵�="qwe"; // �ʵ忡 �����ؼ� ���ֱ� 
		ȸ��1.��й�ȣ="qwe";
		ȸ��1.����="qwe";
		ȸ��1.����=30;
		
			System.out.println("--->ȸ��1�� ����");
		ȸ��1.ȸ������(); // �޼ҵ� ȣ�� 
		
		// 2��° ȸ��
		ȸ�� ȸ��2 = new ȸ��("asd"); // 2��°�� ������ ��� => ���̵� �ް� 
		ȸ��2.��й�ȣ="asd";
		ȸ��2.����="asd";
		ȸ��2.����=30;
		
			System.out.println("--->ȸ��2�� ����");
		ȸ��2.ȸ������();
		
		// 3��° ȸ�� 
		ȸ�� ȸ��3 = new ȸ��("zxc", "zxc", "zxc", 40);
			System.out.println("--->ȸ��3�� ����");
		ȸ��3.ȸ������();
		

	}
}