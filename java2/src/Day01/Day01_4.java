package Day01;
import java.util.ArrayList;
import java.util.Scanner;

public class Day01_4 {
	
	public static void main(String[] args) {
		
/* ���� �˻� ���α׷�
 * 		[������]
 * 		1. �ȴ�! ���̹� ��α�&����Ʈ
 * 		2. ������ ��Ʈ ���� Ȱ�� ������
 * 		3. Tucker�� Go ��� ���α׷���
 * 		4. ȥ�� �����ϴ� C ���
 *
 * 	1. �˻��� �Է¹޾� �˻��� �ܾ ���Ե� ������ ��� ����ϱ�
 * 	2. �˻��� �ܾ ���ο� ��ü�� ���ڸ� �Է¹޾� ��ü�ϱ�
 * 
 * 		
 */
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> ������� = new ArrayList<>();
		�������.add("�ȴ�! ���̹� ��α�&����Ʈ");
		�������.add("������ ��Ʈ ���� Ȱ�� ������");
		�������.add("Tucker�� Go ��� ���α׷���");
		�������.add("ȥ�� �����ϴ� C ���");
		
		// �˻� �ޱ�
		System.out.println("�˻��� ������ :");
		String �˻��� = scanner.next();
		
		ArrayList<String> �˻���� = new ArrayList<>();
		
		// �˻��� ã��
			//for(int i =0 ; i<�������.size(); i++) {}
		for( String temp : �������) {
			//����Ʈ�� Ŭ������ : ����Ʈ��
				// ����Ʈ�� ��ü �� ��ŭ temp �� �ϳ��� ����
			if(temp.indexOf(�˻���) != -1) {
				�˻����.add(temp);
				System.out.println(temp);
			}
							// -1 : �ε����� ����
		}
		// ��ü�� �ܾ� �Է�
		System.out.println("��ü �ܾ� : ");
		String ��ü�ܾ� = scanner.next();
		System.out.println("���ο� �ܾ� : ");
		String ���ο�ܾ� = scanner.next();
		for( String temp:�˻����) {
			temp.replace(��ü�ܾ�, ���ο�ܾ�);
			System.out.println("��ü��" + temp);
		}
		
	}
	

}
