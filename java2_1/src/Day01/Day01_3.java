package Day01;

public class Day01_3 {
	
	public static void main(String[] args) {
		
	//���ڿ� �ڸ���
		String �ֹε�Ϲ�ȣ = "880420-2541212";
		
		String ���ڸ� = �ֹε�Ϲ�ȣ.substring(0,6);
		System.out.println(���ڸ�);
		
		String ���ڸ� = �ֹε�Ϲ�ȣ.substring(7);
		System.out.println(���ڸ�);
	
		//���ڿ� �и� : split
		String[] �迭 = �ֹε�Ϲ�ȣ.split("-");
		System.out.println(�迭[0]);
		System.out.println(�迭[1]);
		
		//�� �ҹ��� ��ȯ
		String �������� = "Java Programming";
		System.out.println(��������.toLowerCase());// �빮��
		System.out.println(��������.toUpperCase());// �ҹ���
		
		
		// ���ڿ� => ���ڿ� // ���ڿ� => ���ڿ�
		String ���� = String.valueOf(10);
		
		System.out.println(����);		// int=>String
		String ����2 = String.valueOf(true);	//boolean => String
		System.out.println(����2);
		String ����3 = String.valueOf(10.5);	//Dobule => String
		System.out.println(����3);
		
		int ���� = Integer.parseInt(����); //String => int
		System.out.println(����);
		boolean �� = Boolean.parseBoolean(����2); // String => boolean
		System.out.println(��);
		double �Ǽ� = Double.parseDouble(����3);
		System.out.println(�Ǽ�);
		
		
		
		
		
	}

}
