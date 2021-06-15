package Day05;

import java.util.Scanner;

public class Day05_3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 예제 11 : for줄수 () { for ()공백{} for() 별{} }
			/*
			 			    *			i = 1 		b = 1 2 3 4 	s = 1 
			 			   **			i = 2 		b = 1 2 3 		s = 1 2
			 			  ***			i = 3		b = 1 2			s = 1 2 3
			 			 ****			i = 4 		b = 1 			s = 1 2 3 4
			 			*****			i = 5		b = 			s = 1 2 3 4 5
			 										최대줄수 - 현재줄수		s<=현재줄수
			 */
		
		int 줄수3 = scan.nextInt();
		for ( int i = 1 ; i<=줄수3 ; i++) {
			
			//공백찍기
			for(int b = 1 ; b<=줄수3-i ; b++) {System.out.println(" ");}
			
			//별찍기
			for(int s = 1; s<=i ; s++) {System.out.println("*");}
			
			//줄바꿈
			System.out.println();
		}
		 
		// 예제 12 :
		/*
		   ***** 		i = 1			b = 			s = 1 2 3 4 5
		 	**** 		i = 2			b = 1			s = 1 2 3 4
		 	 *** 		i = 3 			b = 1 2 		s = 1 2 3
		 	  **		i = 4			b = 1 2 3 		s = 1 2
		 	   * 		i = 5 			b = 1 2 3 4		s = 1 
		 	   							b <=i - 1		최대줄수 - 현재줄수+1
		 */
		int 줄수4 = scan.nextInt();
		for (int i = 1 ; i<=줄수4 ; i++) {
			
			//공백찍기
			for (int b = 1 ; b<=i-1 ; b++) {System.out.println(" ");}
			//별찍기
			for (int s = 1 ; s<=줄수4-i+1; s++) {System.out.println("*");}
			//줄바꿈
			System.out.println();			
		}
		
		// 예제 13 : 
		/*
		 			* 		i = 1 	b = 1 2 3 4		s = 1					2-1 = 1
		 		   *** 		i = 2	b = 1 2 3		s = 1 2 3				4-1 = 3
		 		  ***** 	i = 3 	b = 1 2			s = 1 2 3 4 5			6-1 = 5
		 		 ******* 	i = 4	b = 1			s = 1 2 3 4 5 6 7		8-1 = 7
		 		*********	i = 5	b = 			s = 1 2 3 4 5 6 7 8 9	10-1 = 9
		 		 					최대줄수-현재줄수			현재줄수 * 2-1
		 */
		int 줄수5 = scan.nextInt();
		for ( int i = 1 ; i<=줄수5 ; i++) {
			//공백
			for(int b = 1 ; b<=줄수5-i ; b++) {System.out.println(" ");}
			//별찍기
			for (int s = 1 ; s<=i*2-1 ; s++) {System.out.println("*");}
			//줄바꿈
			System.out.println();
		}
		
	}

}
