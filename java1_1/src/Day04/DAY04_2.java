package Day04;

import java.util.Scanner;

public class Day04_2 {

	
	public static void main(String[] args) {
		

		
		
		
		Scanner scan = new Scanner(System.in);
//		1. 3���� ������ �Է¹޾� ���� ���� �� ���
//		System.out.print(" �ΰ��� ���� �Է� : "); 
//		int ����1  = scan.nextInt();
//		int ����2 = scan.nextInt();
//		int ����3 = scan.nextInt();
//		int min = ����1; // ���� ���� ���� �����ϴ� ����
//		if( min > ����2) min = ����2; // ����1�� ���� 2���� ������ ����2�� ��ü
//		if( min > ����3) min = ����3;
//		System.out.println("���� ���� ���� : "+ min);
		
//		2. 3���� ������ �Է¹޾� ������������ �ٽ� �����ϱ�
//		System.out.print(" �ΰ��� ���� �Է� : "); 
//		int ����1  = scan.nextInt();
//		int ����2 = scan.nextInt();
//		int ����3 = scan.nextInt();
//		
//		if (����1 > ����2) { //1������ 2������ ��
//			int �ӽ� = ����1;
//			����1 = ����2;
//			����2 = �ӽ�;
//			
//		}
//		if (����2 > ����3) { //2�� ���� 3���� ��
//			int �ӽ� = ����2;
//			����2 = ����3;
//			����3 = �ӽ�;
//		}
//		if (����1 > ����2) { // 1������ 2�� �� �� �İ������  ��ȯ
//			int �ӽ� = ����1;
//			����1 = ����2;
//			����2 = �ӽ�; 
//		}
//		
//		System.out.println("�������� ���� �� : " + ����1 +"\t"+ ����2+"\t" + ����3 + "�� �Դϴ�." );
		
//		3. ���̵� qew405060 ��й�ȣ 1234 ȸ�� �Ѹ��� ���� ������ 
//			1. �α��� ������ ���̵�� ��й�ȣ�� ������ ��쿡�� �α��� ���� ���
//			2. ������ ���̵� �� ��й�ȣ�� �ƴҰ�� �α��� �Է�â �ݺ�����
//		while (true) {//���ѹݺ�
//		System.out.println("�α��� â:");
//		System.out.println("���̵�"); String loginID = scan.next();
//		System.out.println("��й�ȣ"); String loginPassword = scan.next();
//		
//		if(loginID.equals("qew405060") && loginPassword.equals("1234")) {
//			//�Է��� ���̵�� �н����尡 ������ ���
//			System.out.println("�α��� ����");
//		}else {
//			System.out.println("--->������ ȸ���� �����ϴ�. [�ٽ� �Է����ּ���]");
//		}
				
	
		
//		����4 ���Ǳ� ����� [�ݶ�[��� : 10��]=>500��, ���̴�[���:5��] => 600��, ȯŸ [��� : 7��]=> 700��
//			1. ���Ǳ� ���α׷� ���ѷ���
//			2. ����ڿ��� �ݾ��� �Է� �ޱ�
//			3. �Է¹��� �ݾ����� ��ǰ ����
//				1.��ǰ ��ȣ�� ���� �Է¹޾� ����
//			4. ��������=> �����, ��������
		
		int �ݶ���� = 10;
		int ���̴���� = 5;
		int ȯŸ��� = 7;
		
		while( true ) { //��ü�ڵ� ���ѷ���
			System.out.println("---- ���Ǳ� ���α׷�-------");
			System.out.println("�ݾ��� �־��ּ��� : ");
				//�ݾ� ����
				int �ݾ� = scan.nextInt();
				int ��ٱ��ϱݾ� = 0;
				int �ݶ󱸸ż� = 0;
				int ���̴ٱ��ż� = 0;
				int ȯŸ���ż� = 0;
				
			while ( true ) { // ���� �ڵ� �ݺ�
				System.out.println("1. �ݶ�[500��] 2.���̴�[600��] 3.ȯŸ[700��] 4.����");
				// �޴� ���� ����
				int ���� = scan.nextInt();
				if ( ���� == 1 ) { 
					System.out.println(" �ݶ� ���Ű��� : "); int ���ż� = scan.nextInt();
					
					if( ���ż� > �ݶ���� ) System.out.println(" ��� �����մϴ� ");
					else if( (���ż�*500) > �ݾ�  ) System.out.println(" �ݾ��� �����մϴ� ");
					else {
						int �ݶ󰡰� = ���ż� * 500;
							int temp  = ��ٱ��ϱݾ� + �ݶ󰡰�;
						if(  temp > �ݾ�  ) System.out.println(" �ݾ� ���� ");
						else {
							System.out.println(" ��ٱ��� �߰� �߽��ϴ� ");
							��ٱ��ϱݾ� += �ݶ󰡰�;
							�ݶ󱸸ż� += ���ż�;
						}
					}
				}
				if (���� == 2) {
					System.out.println("���̴� ���Ű��� :"); int ���ż� = scan.nextInt();
					if( ���ż� > ���̴���� ) System.out.println("��� ���� �մϴ�.");
					else if( ( ���ż�*600) > �ݾ�) { System.out.println("�ݾ��� �����մϴ�.");
					}else {
						System.out.println("��ٱ��Ͽ� �߰� �߽��ϴ�.");
						
						int ���̴ٰ���= ���ż�*600;
							int temp = ��ٱ��ϱݾ� +���̴ٰ���;
						if(temp > �ݾ� ) System.out.println("�ݾ� ����");
						else{System.out.println("��ٱ��Ͽ� �߰� �߽��ϴ�.");
						��ٱ��ϱݾ� += ���̴ٰ���;
						���̴ٱ��ż� += ���ż�;
						}
						}
					}
					if (���� == 3) {
						System.out.println("ȯŸ ���Ű��� :"); 	int ���ż� = scan.nextInt();
						if( ���ż� > ȯŸ��� ) System.out.println("��� ���� �մϴ�.");
						else if( ( ���ż�*700) > �ݾ�) System.out.println("�ݾ��� �����մϴ�.");
						else {
								int ȯŸ����= ���ż�*700;
								int temp = ��ٱ��ϱݾ� +ȯŸ����;
							if( temp > �ݾ� ) System.out.println("�ݾ� ����");
							else{System.out.println("��ٱ��Ͽ� �߰� �߽��ϴ�.");
							��ٱ��ϱݾ� += ȯŸ����;
							ȯŸ���ż� += ���ż�;
							
						}
					}
					
					if (���� == 4) {
						System.out.println("----->��ٱ���");
						if(�ݶ󱸸ż� !=0) System.out.println("�ݶ� : " + �ݶ󱸸ż� + "�� �ݾ�: " + (�ݶ󱸸ż�*500));
						if(�ݶ󱸸ż� !=0) System.out.println("�ݶ� : " + ���̴ٱ��ż� + "�� �ݾ�: " + (���̴ٱ��ż�*600));
						if(�ݶ󱸸ż� !=0) System.out.println("�ݶ� : " + ȯŸ���ż� + "�� �ݾ�: " + (ȯŸ���ż�*700));
						System.out.println(" �� �ݾ� : " + ��ٱ��ϱݾ�);
							//������ ��� ����
						�ݶ���� -= �ݶ󱸸ż�;
						���̴���� -= ���̴ٱ��ż�;
						ȯŸ��� -= ȯŸ���ż�;
						
						System.out.println("�ܵ� :" +( �ݾ� - ��ٱ��ϱݾ�));
						
						break; //�ݺ��� Ż�� 
						}
					 }
			
				}
        }
	}	
}