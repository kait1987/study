package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_1 {
	
	
	public static void main(String[] args) {
		
		
		// if : ��� [��, �� +> �񱳿�����]
		
		// ������ 80�� �̻��̸� �հ�
		//Scanner scan = new Scanner(System.in); 
		//String ���� = scan.next();
//		int ���� = 90;
//		if (���� >= 80) System.out.println("�հ�");
//		// 80�� �̻��� �ƴϸ� ���հ�
//		if (���� >=80) System.out.println("�d��");
//		else System.out.println("���հ�");
//		//������ 80�̻��̸� �հ� 70�� �̻��̸� ���� �ƴϸ� �հ�
//		if (���� >870) System.out.println("�հ�");
//		else if (���� >=70) System.out.println("����");
//		else System.out.println("���հ�");
//		//������ 80�� �̻��̸鼭 ���ڸ�  A �� ���ڸ� B�� ������ 70�� �̻��̸� C��
//		String ����="����";
//		if(���� >=80) {
//			if( ����.equals("����") ) System.out.println("A��");
//			else System.out.println("B��");
//		}else System.out.println("C��");
//		
		//���� 1 : ���������� ����
		// 1. �� ����ڿ��� �� �Է� �ޱ�
		// 2. ���ؼ� �̱�� �� �Ǵ� [if]
		// 3. �̱� ����� ���
		
		int ���Ӽ� = 0 ; //while �ȿ��� Ȥ�� �ۿ��� ����� ��� ������ġ;
		int �÷��̾�1�¸��� = 0;
		int �÷��̾�2�¸��� = 0;
		
	while(true) {//���� �ݺ� =>
		System.out.println("���������� [������=end] ����");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù��° �÷��̾� ���� : ");
		String �÷��̾�1 = scan.next();
		int �÷��̾�1�� = 3; //(���������� ���ð�찡 3
			if ( �÷��̾�1.equals("����") ) �÷��̾�1�� = 0 ; //���� �ʱ�ȭ
			else if (�÷��̾�1.equals("����") ) �÷��̾�1�� = 1 ; // ���� �ʱ�ȭ
			else if (�÷��̾�1.equals("��") ) �÷��̾�1�� = 2 ; // ���� �ʱ�ȭ
			else if (�÷��̾�1.equals("end") ) break ; // �ݺ��� Ż��
			else System.out.println("�߸��Է��߽��ϴ�."); //���� �ʱ�ȭ x
			
//		System.out.println("�ι�° �÷��̾� ���� : ");
//		String �÷��̾�2 = scan.next();
//		int �÷��̾�2�� = 3; //(���������� ���ð�찡 3
//			if ( �÷��̾�1.equals("����") ) �÷��̾�1�� = 0 ; //���� �ʱ�ȭ
//			else if (�÷��̾�1.equals("����") ) �÷��̾�1�� = 1 ; // ���� �ʱ�ȭ
//			else if (�÷��̾�1.equals("��") ) �÷��̾�1�� = 2 ; // ���� �ʱ�ȭ
//			else if (�÷��̾�1.equals("end") ) break ; // �ݺ��� Ż��
//			else System.out.println("�߸��Է��߽��ϴ�."); //���� �ʱ�ȭ x
			
			
		// ��ǻ�� ������ �����ؼ� ����
		Random random = new Random(); // ���� ��ü
		int �÷��̾�2�� = random.nextInt(3);
		// ��ǻ�� ���� ��
		if ( �÷��̾�2�� == 0) System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
		if ( �÷��̾�2�� == 1) System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
		if ( �÷��̾�2�� == 2) System.out.println("��ǻ�ʹ� �� �½��ϴ�.");
		
			//�¸��Ǵ�
			if ( �÷��̾�1�� == 0 ) { //�����϶� �Ǵ�
				if ( �÷��̾�2�� == 2 ) {
					 �÷��̾�1�¸��� ++;
					 System.out.println("�÷��̾�1 �¸�");
				}
				else if( �÷��̾�2�� ==1) {
					�÷��̾�2�¸��� ++;
					System.out.println("�÷��̾�2 �¸�");
				}
				else System.out.println("���º�");
			}
			if ( �÷��̾�1�� == 1 ) { //�����϶� �Ǵ�
				if ( �÷��̾�2�� == 0 ) {
					 �÷��̾�1�¸��� ++;
					 System.out.println("�÷��̾�1 �¸�");
				}
				else if( �÷��̾�2�� ==2) {
					�÷��̾�2�¸��� ++;
					System.out.println("�÷��̾�2 �¸�");
				}
				else System.out.println("���º�");
			}
			if ( �÷��̾�1�� == 2 ) { //���϶� �Ǵ�
				if ( �÷��̾�2�� == 1 ) {
					 �÷��̾�1�¸��� ++;
					 System.out.println("�÷��̾�1 �¸�");
				}
				else if( �÷��̾�2�� ==0) {
					�÷��̾�2�¸��� ++;
					System.out.println("�÷��̾�2 �¸�");
				}
				else System.out.println("���º�");
			}
			else {// �Ѹ��̶� ���� 3�̸�[�߸� �Է�������]
				System.out.println("�߸� �Էµ� ���� �ֽ��ϴ� [�ٽ�]");
				���Ӽ� --;
			}
		���Ӽ�++;
	} // w end
	
	System.out.println(" ����� ���Ӽ� : " + ���Ӽ�);
	
	// �����¸��Ǵ�
	if ( �÷��̾�1�¸��� > �÷��̾�2�¸���) System.out.println(" �����¸� : �÷��̾�1" + "["+�÷��̾�1�¸���+"]");
	else if( �÷��̾�1�¸��� < �÷��̾�2�¸���) System.out.println(" �����¸� : ��ǻ��" + "["+�÷��̾�1�¸���+"]");
	else System.out.println("���º�");
	} 
} // class end
