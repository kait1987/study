package Day05;

public class Day05_3 {
	
	public static void main(String[] args) {
		
		
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
