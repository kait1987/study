package Day06;

import java.util.Random;
import java.util.Scanner;

public class Day06_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
//		 �ζ� �Ǻ���
//		 1. �迭���
//		 2. 1~45 ���� 6�� �Է� �ޱ� / �ߺ��� x
//		 3. ����[ ��÷��ȣ 6�� ����] / �ߺ��� x
//		 4. �Է¹��� ���� ��÷��ȣ ��
//		 5. 6�� ��� �����ϸ� 1�� 
//		 	5�� ��� �����ϸ� 2��
//		 	4�� ��� �����ϸ� 3��
//		 	3�� ��� �����ϸ� 4��
//		 	2�� ��� �����ϸ� 5��
//		 	0~1�� �̸� ��
		
		// �ζ� �Ǻ���
		
		// �غ� = �迭 ���� [1.����. 2.��÷��ȣ]
		int [] �ζ� = new int[6];
		int [] ��÷��ȣ = new int[6];
		
		// 1.�Է¹ޱ�
		
		for (int i = 0 ; i<=5 ; i++) {
			while(true) {// �������� �Է� �Ҷ� ���� ����
				int ����ġ = 0;
			//i �� 0���� 5���� 1 �� ���� �ݺ�
				System.out.print((i+1)+"��° 1~45 ������ ���� �Է� : ");
				int temp = scan.nextInt();
			// 1~45 ����
					if (temp <0 || temp > 45 ) System.out.println("1~45");
						System.out.println("1~45 ���̸� �����մϴ�.");
						����ġ = 1; // ������
						
			// �ߺ��� ���� [ ���� �迭�� �̹� �ִ� ��]
				for ( int j = 0 ; j<=5 ; j++) {
					if(�ζ�[j] == temp ) {
						System.out.println("�̹� �����ϴ� �� �Դϴ�.");	
						����ġ = 1; // ������
					}
				}
				// �����Է�
				if(����ġ == 0 ) {�ζ�[i] = temp;}
			
	}
		
		//Ȯ��
		System.out.println("�����Ͻ� ��ȣ : "); 
		for (int i = 0 ; i<=5 ; i++) {
				System.out.println(�ζ�[i]+" ");
		}
		
		//��÷��ȣ -> ���� 6�� ����
		for (int i = 0 ; i<=5 ; i++) {
			while(true) {// �������� �Է� �Ҷ� ���� ����
				int ����ġ = 0;
			//i �� 0���� 5���� 1 �� ���� �ݺ�
				Random random = new random();
				int temp = random.nextInt(45)+i;
			// 1~45 ����
					if (temp <0 || temp > 45 ) 
						System.out.println("1~45 ���̸� �����մϴ�.");
						����ġ = 1; // ������
						
			// �ߺ��� ���� [ ���� �迭�� �̹� �ִ� ��]
				for ( int j = 0 ; j<=5 ; j++) {
					if(�ζ�[j] == temp ) {
						System.out.println("�̹� �����ϴ� �� �Դϴ�.");	
						����ġ = 1; // ������
					}
					
				}
			�ζ�[i] = temp;
		}
			
	}
		
		// ��÷ ��� [ �迭 ��]
		for (int i =0 ; i<=5 ; i++) {
			
			for (int j = 0 ; j<=5 ; j++ ) {
				if( �ζ� [i] == ��÷��ȣ[j] ) ��÷����++;
			}
		}// i�� 1�� �����Ҷ����� J�� 6�� ���� => �� ���� Ƚ�� => 36�� 
		
		if( ��÷���� == 6) System.out.println( " ��÷��� : 1�� ");
		if( ��÷���� == 5) System.out.println( " ��÷��� :2�� ");
		if( ��÷���� == 4) System.out.println( " 3�� ");
		if( ��÷���� == 3) System.out.println( " 4�� ");
		if( ��÷���� == 2) System.out.println( " �� ");
		if( ��÷���� == 1) System.out.println( " �� ");
	}

}
