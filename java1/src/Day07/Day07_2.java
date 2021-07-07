package Day07;

import java.util.Scanner;

public class Day07_2 {
	
	public static void main(String[] args) {

	// 회원제 프로그램 [ 회원가입 , 로그인 ] 
		// 1. 2차원 배열 [ 최대 100명 ]  
		// 2. 메뉴 [ 무한루프 ]
			// 1. 회원가입
				// 1. 아이디와 비밀번호 입력받아 배열에 저장 
			// 2. 로그인 
				// 1. 아이디와 비밀번호 입력받아 배열에 존재하면 로그인 성공 
			// 3. 종료 
				// 반복문 종료 
		
		Scanner scan = new Scanner(System.in);
		//입력값을 저장 => 변수 => 여러개 변수 관리 => 배열
		String[][] 회원목록 = new String[100][2];
		
		while(true ) {
			System.out.println(" === 회원제 프로그램 === ");
			System.out.println("1.회원가입 2.로그인 3.종료"); int 선택 = scan.nextInt();
			
			if( 선택==1 ) { // 회원가입 
				System.out.println("--->회원가입 진행 ");
				System.out.print(" 아이디 : "); String 아이디 = scan.next();
				
				int 스위치 = 0; 
					// 이미 존재하는 아이디가 있으면 중복차단 
					for( int i =0 ; i<회원목록.length ; i++ ) {
						
						if( 회원목록[i][0] !=null ) {
							// 입력한 아이디가 존재하면 
							if( 회원목록[i][0].equals(아이디) ) {
								System.out.println("--> 이미 존재하는 아이디 입니다");
								스위치 = 1;
								break;
							}
						}
					}
				
				if( 스위치 == 0 ) { //
					
					System.out.print(" 패스워드 : "); String 비밀번호 = scan.next();
					// 입력받은 값을 저장 => 배열에 빈곳[null]에 저장 
					for( int i =0 ;  i < 회원목록.length ; i++ ) {
						
						if( 회원목록[i][0] == null ) { // !!! 해당 행이 null 이면
							회원목록[i][0] = 아이디; // 첫번째 열에 아이디 넣기 
							회원목록[i][1] = 비밀번호; // 두번째 열에 비밀번호 넣기 
							System.out.println("--->회원가입 완료 ");
							break; // !!!! : 회원가입 성공했으면 for문 종료 
						}
					}
				}
			}
			if( 선택==2 ) { // 로그인 : 입력값과 기존값[배열] 과 비교 
				
				System.out.println("--->로그인 진행 ");
				System.out.print(" 로그인 아이디 : "); String 아이디 = scan.next();
				System.out.print(" 로그인 패스워드 : "); String 비밀번호 = scan.next();
				
				// 입력값을 배열에 비교 
				for( int i = 0 ; i<회원목록.length ; i++  ) {
					
					if( 회원목록[i][0] != null ) { // 행에 회원이 존재할경우에만 검사 
	
						if( 회원목록[i][0].equals(아이디) && 회원목록[i][1].equals(비밀번호) ) {
							System.out.println("--->로그인 성공 ");
						
							while( true ) { // 로그인 성공시 해당하는 무한루프
								
								// 모든 회원 아이디 / 비밀번호 출력
								System.out.println(" === 회원 목록 === ");
								System.out.println("아이디\t\t비밀번호 ");
								for( int j = 0 ; j<회원목록.length ; j++) {
									if( 회원목록[j][0] !=null)
										System.out.println(회원목록[j][0]+"\t\t"+회원목록[j][1]);
								}
								
								System.out.println("1.회원탈퇴 2.패스워드변경 3.로그아웃"); int 선택2= scan.nextInt();
								if( 선택2==1 ) {
									
									// 회원탈퇴 => 배열에서 데이터를 null 변경 
									회원목록[i][0] = null; // 현재 로그인 된 행의 아이디 = [i] [0]
									회원목록[i][1] = null; // 현재 로그인 된 행의 비밀번호 = [i] [1]
									
										// 탈퇴한 회원 이후 회원을 한칸씩 당기기 
										for( int h = i ; h<99 ; h++ ) {
					
											if( 회원목록[h+1][0] !=null ) { // 다음 회원이 null 아니면 
												회원목록[h][0] = 회원목록[h+1][0]; // 뒤회원을 한칸 앞으로 이동
												회원목록[h][1] = 회원목록[h+1][0]; // 뒤회원을 한칸 앞으로 이동 
											}else {
												회원목록[h][0] = null; // 마지막 회원 이동후 마지막회원 null 로 변경 
												회원목록[h][1] = null; // 마지막 회원 이동후 마지막회원 null 로 변경 
												break; 
											}
										}
									System.out.println("---> 회원 탈퇴 성공");
									break;
								}
								if( 선택 == 2) {
									System.out.println("---> 패스워드 변경 : "); 
									String 변경비밀번호 = scan.next();
									회원목록[i][1] = 변경비밀번호; 
									System.out.println("---> 패스워드 변경완료 --->로그아웃");
									break;
								}
								if(선택2==3) { System.out.println("--->로그아웃"); break;}
							}
							break;
						}
					}else {
						System.out.println("--->동일한 회원정보가 없습니다. ");
						break;
					}
				}

			}
			if( 선택==3 ) { System.out.println("--->이용해주셔서 감사합니다"); break; }
			
		} // while 끝 
		
		
	
		
	}
}
