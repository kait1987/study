package Day05;

import java.util.Scanner;

public class Day05_2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// �ݺ���
		
			// 1. for �� (����) ��ø for, ����Ʈ�� ����Ҷ� ������
				//for (int i = 0 ; i <10 ; i += 3)
				// for (���۰� ; ���ǹ� ; ������)
		
			// 2. while �� (����) => ���ѷ���
				
				// int i = 0 ; ���۰�
				
				// while(i<10) { // ���ǹ�
				//		 i ++; //������
				//		}
		
		
			// 3. do ~ while �� : 1�� ���� ���� �� �˻�
				/*
				  do {
				  } while(���ǹ�)
				  */
		
		
		//for ��
			//if ��, for ��, while() => ; (X)
		for (int i = 0 ; i<10 ; i ++) {
			//i �� 0 ���� 10�̸����� 1�������ϸ鼭 �ݺ�
			System.out.println(i);
			// 1. �ʱⰪ �˻� => 2. ���ǹ� �˻� => 3. �ڵ带 ����
			// 4. ������ => ���ǹ� �˻� [T] => �ڵ� ����
			// 4. ������ => ���ǹ� �˻� [T] => �ڵ� ����
			// 4. ������ => ���ǹ� �˻� [T] => �ڵ� ����
			// 4. ������ => ���ǹ� �˻� [T] => �ڵ� ����
			// 4. ������ => ���ǹ� �˻� [F] => �ݺ��� Ż��
			
			}
		// ���� 1 : 1 ~  50 ���� ���
		for (int i = 1 ; i <=50 ; i++) {System.out.println(i);}
		
		// ���� 2 1 ~ 50 ���� 3�� ����
		for (int i = 1 ; i <=50 ; i+=3) {System.out.println(i);}
		
		// ���� 3 1 ~ 50 ���� �����հ�
		int �հ� = 0;
		for (int i = 1 ; i <= 50 ; i++) {�հ� = i;}
		System.out.println("1~50�� �����հ� : " + �հ�);
		
		// ���� 4 : 1~50������ 3����� �����հ�
		int �հ�2 = 0;
		for(int i = 1 ; i <=50 ; i++) {
			if( i%3 == 0) �հ�2 +=i;
			}
		System.out.println("1~50�� 3��� �հ�: " + �հ�2);
		
		
	//���� 5 : 2�� ������
		for (int i = 1 ; i<10 ; i++) {
			// i�� 1 ���� 10 �̸����� 1�� ���� �ݺ�
			System.out.println("2 X "+i+" = " +(2*i) );
			
		}
		// ���� 6 : ������ [for ��ø] = for () { for(){}
			// 1. �ܼ��� 2�� ~ 9��
			// 2. ���� 1 ~ 9
				// * �ܼ� �Ѱ��� �� 9�� ����
		for (int �� = 2 ; ��<10 ; ��++) { // �� 2~ 9 => 8�� �ݺ�
			for (int �� = 1 ; ��<10 ; ��++) { // �� 1~9 => 9�� �ݺ�
				System.out.println(�� +" X " + ��+ " = "+(�� * ��));
			}
		}// for�� �� �ݺ�Ƚ���� 72��
		
		//���� 7 : �Է��� ���� ��Ů ��[*] ���
		
		int ���� = scan.nextInt();
		
		for (int i = 1 ; i <=���� ; i++) {
			System.out.println("*");}
		
		
		
		
		//���� 8 : �Է��� ������Ů ��[*] ��� [* 5�� ���� �ٹٲ�]
		int ����2 = scan.nextInt();
		for( int i = 1 ;i<=����2 ; i++ ) {
			System.out.println("*");
			
			// i�� 5�� ��� ���� �� �ٲ� 
			if(i % 5 == 0) System.out.println();
		}
		
		
		//���� 9 : �Է��� ������Ů ��[*] ��� [for ��ø]
			/*��) 5
			 * 	 *						�� = 1 			�� = 1
			 * 	 **						�� = 2 			�� = 1 2
			 * 	 ***					�� = 3 			�� = 1 2 3 
			 * 	 ****					�� = 4 			�� = 1 2 3 4
			 * 	 *****					�� = 5 			�� = 1 2 3 4 5
			 * 							��++				��++			��<=��
			 */
				// 1. �ٹٲ� for ��
				// 2. �� for ��
					
		int �ټ�1 = scan.nextInt();
		for(int i = 1; i<=�ټ�1 ; i++) { // i �� 1���� �Է��� [�ټ�]����  1�� ����
			
			for (int s = 1 ; s<i ; s++) { // s�� 1���� i���� 1�� ����
				System.out.print("*");
			}
			// �ٹٲ�	
			System.out.println("");
			}
		
		// ���� 10 : �Է��� �� �� ��ŭ ��[*] ��� [for ��ø]
			/*��) 5
			 * 	 *****					i = 1 		s = 1 2 3 4 5 		5-1 => 4+1		5
			 * 	 ****
			 * 	 ***
			 * 	 **
			 * 	 *
			 * 
			 */
		
		int �ټ�2 = scan.nextInt();
		for (int i = 1; i<�ټ�2 ; i ++) {
			for (int j=1 ; j<=�ټ�2-i ; j++) {
				System.out.print("*");
				
			}
			System.out.println();		
		}
		
		
		
		// ���� 11 : for�ټ�() {for()����{} for()��{} }
		int �ټ�3 = scan.nextInt();
		for (int i = 1; i<=�ټ�3 ; i++) {
			
			// ���������
			
			for (int b= 1 ; b<=�ټ�3-i ; b++)	 {System.out.print(" ");
			
			// �����
			
			for(int s = 1 ; s<=i; s++) {System.out.println("*");
			}
			
			// �ٹٲ�
		}
		System.out.println();
		
		
		// ���� 12
		int �ټ�4 = scan.nextInt();
		
		for ( int i = 1 ; i<=�ټ�4 ; i++) {
			
			//�������
			for( int b = 1 ; b<=i-1 ; b++) { System.out.println(" ");}
			//�����
			for (int s = 1 ; s<=�ټ�4-i+1 ; s++) {System.out.println("*");}
			
			System.out.println();
		}
			
		// ���� 13	
/*	  1
	 333
	55555 	
   7777777		
  999999999
 
 
 		*/
		
		// ���� 14
		/*  	  *
		 *   	 ***
		 *  	*****
		 *     *******
		 *    *********
		 *    
		 */
		
		// ���� 15
			
	}		
}
