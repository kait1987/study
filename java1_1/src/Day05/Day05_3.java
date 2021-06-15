package Day05;

public class Day05_3 {
	
	public static void main(String[] args) {
		
		
		// 예제 11 : for줄수() {for()공백{} for()별{} }
				int 줄수3 = scan.nextInt();
				for (int i = 1; i<=줄수3 ; i++) {
					
					// 공백이찍기
					
					for (int b= 1 ; b<=줄수3-i ; b++)	 {System.out.print(" ");
					
					// 별찍기
					
					for(int s = 1 ; s<=i; s++) {System.out.println("*");
					}
					
					// 줄바꿈
				}
				System.out.println();
				
				
				// 예제 12
				int 줄수4 = scan.nextInt();
				
				for ( int i = 1 ; i<=줄수4 ; i++) {
					
					//공백찍기
					for( int b = 1 ; b<=i-1 ; b++) { System.out.println(" ");}
					//별찍기
					for (int s = 1 ; s<=줄수4-i+1 ; s++) {System.out.println("*");}
					
					System.out.println();
				}
					
				// 예제 13	
		/*	  1
			 333
			55555 	
		   7777777		
		  999999999
		 
		 
		 		*/
				
				// 예제 14
				/*  	  *
				 *   	 ***
				 *  	*****
				 *     *******
				 *    *********
				 *    
				 */
				
				// 예제 15
					
	}

}
