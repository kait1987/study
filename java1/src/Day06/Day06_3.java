package Day06;

import java.util.Random;
import java.util.Scanner;

public class Day06_3 {
	
	public static void main(String[] args) {
		
		
		// 삼목 게임 
		Scanner scan = new Scanner(System.in);
		// 1. 게임판 만들기 
				//		String[] 게임판 = new String[9];
				//		게임판[0] = "[ ]";
				//		게임판[1] = "[ ]";
				//		게임판[2] = "[ ]";
				//		게임판[3] = "[ ]";
				//		게임판[4] = "[ ]";
				//		게임판[5] = "[ ]";
				//		게임판[6] = "[ ]";
				//		게임판[7] = "[ ]";
				//		게임판[8] = "[ ]";
		String[] 게임판 = { "[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
		
		while( true ) { // 무한루프 
			
			// 2. 게임판 출력 
			for( int i = 0 ; i< 게임판.length ; i++ ) {
				// i는 0 부터 게임판배열의 길이 전까지 1씩증가 반복
				
					System.out.print( 게임판[i] );
					// 3개씩 출력후 줄바꿈
					if( i%3 == 2 ) System.out.println();		
			}
			// 3. 플레이어 입력받아서 판모양 바꾸기 
			while(true) {
				System.out.print("번호 선택 [ 0 ~ 8 ] :");
				int 선택 = scan.nextInt();
					// 이미 둔 자리에는 입력할수 없도록 X
					if( 게임판[선택].equals("[ ]") ) {
						게임판[선택] = "[O]";
						break; // 정상적으로 입력후 반복문 종료
					}
					else System.out.println("이미 둔 자리 입니다 [ 다른곳 선택 ]");
			}
			// 4. 컴퓨터 플레이어 
			System.out.println("컴퓨터 순서 입니다 ");
			Random random = new Random();
			while(true) {
				int 선택 = random.nextInt(9);
					if( 게임판[선택].equals("[ ]") ) {
						게임판[선택] = "[X]";
						break;
					}
			}
			
			String 승리패 = "0" ;
			
			// 5. 이기는 경우의수 
				// 1. 가로로 이기는 수 
				for( int i = 0 ; i<=6 ; i+=3) {
					// i는 0부터 6까지 3씩 증가 => 0 , 3 , 6
					if( 게임판[i].equals(게임판[i+1]) && 게임판[i+1].equals(게임판[i+2])) {
						if( !게임판[i].equals("[ ]") ) 승리패 = 게임판[i];
						// ! : 부정  : T => F
					}
				}
				// 2. 세로로 이기는 수 
				for( int i = 0 ; i<=2 ; i++ ) {
					// i는 0부터 2까지 1씩 증가 => 0 , 1 , 2
					if( 게임판[i].equals(게임판[i+3]) && 게임판[i+3].equals(게임판[i+6])) {
						if( !게임판[i].equals("[ ]") ) 승리패 = 게임판[i];
						// ! : 부정  : T => F
					}
				}
				// 3. 대각선으로 이기는 수 
				if( 게임판[0].equals(게임판[4]) && 게임판[4].equals(게임판[8])) {
					if( !게임판[0].equals("[ ]") ) 승리패 = 게임판[0];
					// ! : 부정  : T => F
				}
				if( 게임판[2].equals(게임판[4]) && 게임판[4].equals(게임판[6])) {
					if( !게임판[2].equals("[ ]") ) 승리패 = 게임판[2];
					// ! : 부정  : T => F
				}
			// 6. 승리 판단 
				if( 승리패.equals("[O]")) {
					System.out.println("플레이어 승리");
					break; // 가장 위에 있는 while 탈출
				}
				if( 승리패.equals("[X]")) {
					System.out.println("컴퓨터 승리");
					break; // 가장 위에 있는 while 탈출
				}
		} // 게임루프 끝 
			
	}

}
