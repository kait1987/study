package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_1 {
	
	
	public static void main(String[] args) {
		
		
		// if : 제어문 [ㅆ, ㄹ +> 비교연산자]
		
		// 점수가 80점 이상이면 합격
		//Scanner scan = new Scanner(System.in); 
		//String 점수 = scan.next();
//		int 점수 = 90;
//		if (점수 >= 80) System.out.println("합격");
//		// 80점 이상이 아니면 불합격
//		if (점수 >=80) System.out.println("홥격");
//		else System.out.println("불합격");
//		//점수가 80이상이면 합격 70점 이상이면 보류 아니면 합격
//		if (점수 >870) System.out.println("합격");
//		else if (점수 >=70) System.out.println("보류");
//		else System.out.println("불합격");
//		//점수가 80점 이상이면서 남자면  A 반 여자면 B반 점수가 70점 이상이면 C반
//		String 성별="남자";
//		if(점수 >=80) {
//			if( 성별.equals("남자") ) System.out.println("A반");
//			else System.out.println("B반");
//		}else System.out.println("C반");
//		
		//예제 1 : 가위바위보 게임
		// 1. 두 사용자에게 각 입력 받기
		// 2. 비교해서 이기는 수 판단 [if]
		// 3. 이긴 사용자 출력
		
		int 게임수 = 0 ; //while 안에서 혹은 밖에서 사용할 경우 선언위치;
		int 플레이어1승리수 = 0;
		int 플레이어2승리수 = 0;
		
	while(true) {//무한 반복 =>
		System.out.println("가위바위보 [끝내기=end] 게임");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 플레이어 선택 : ");
		String 플레이어1 = scan.next();
		int 플레이어1수 = 3; //(가위바위보 나올경우가 3
			if ( 플레이어1.equals("가위") ) 플레이어1수 = 0 ; //변수 초기화
			else if (플레이어1.equals("바위") ) 플레이어1수 = 1 ; // 변수 초기화
			else if (플레이어1.equals("보") ) 플레이어1수 = 2 ; // 변수 초기화
			else if (플레이어1.equals("end") ) break ; // 반복문 탈출
			else System.out.println("잘못입력했습니다."); //변수 초기화 x
			
//		System.out.println("두번째 플레이어 선택 : ");
//		String 플레이어2 = scan.next();
//		int 플레이어2수 = 3; //(가위바위보 나올경우가 3
//			if ( 플레이어1.equals("가위") ) 플레이어1수 = 0 ; //변수 초기화
//			else if (플레이어1.equals("바위") ) 플레이어1수 = 1 ; // 변수 초기화
//			else if (플레이어1.equals("보") ) 플레이어1수 = 2 ; // 변수 초기화
//			else if (플레이어1.equals("end") ) break ; // 반복문 탈출
//			else System.out.println("잘못입력했습니다."); //변수 초기화 x
			
			
		// 컴퓨터 난수를 생성해서 게임
		Random random = new Random(); // 난수 객체
		int 플레이어2수 = random.nextInt(3);
		// 컴퓨터 낸수 수
		if ( 플레이어2수 == 0) System.out.println("컴퓨터는 가위 냈습니다.");
		if ( 플레이어2수 == 1) System.out.println("컴퓨터는 바위 냈습니다.");
		if ( 플레이어2수 == 2) System.out.println("컴퓨터는 보 냈습니다.");
		
			//승리판단
			if ( 플레이어1수 == 0 ) { //가위일때 판단
				if ( 플레이어2수 == 2 ) {
					 플레이어1승리수 ++;
					 System.out.println("플레이어1 승리");
				}
				else if( 플레이어2수 ==1) {
					플레이어2승리수 ++;
					System.out.println("플레이어2 승리");
				}
				else System.out.println("무승부");
			}
			if ( 플레이어1수 == 1 ) { //바위일때 판단
				if ( 플레이어2수 == 0 ) {
					 플레이어1승리수 ++;
					 System.out.println("플레이어1 승리");
				}
				else if( 플레이어2수 ==2) {
					플레이어2승리수 ++;
					System.out.println("플레이어2 승리");
				}
				else System.out.println("무승부");
			}
			if ( 플레이어1수 == 2 ) { //보일때 판단
				if ( 플레이어2수 == 1 ) {
					 플레이어1승리수 ++;
					 System.out.println("플레이어1 승리");
				}
				else if( 플레이어2수 ==0) {
					플레이어2승리수 ++;
					System.out.println("플레이어2 승리");
				}
				else System.out.println("무승부");
			}
			else {// 한명이라도 수가 3이면[잘못 입력했을때]
				System.out.println("잘못 입력된 값이 있습니다 [다시]");
				게임수 --;
			}
		게임수++;
	} // w end
	
	System.out.println(" 실행된 게임수 : " + 게임수);
	
	// 최종승리판단
	if ( 플레이어1승리수 > 플레이어2승리수) System.out.println(" 최종승리 : 플레이어1" + "["+플레이어1승리수+"]");
	else if( 플레이어1승리수 < 플레이어2승리수) System.out.println(" 최종승리 : 컴퓨터" + "["+플레이어1승리수+"]");
	else System.out.println("무승부");
	} 
} // class end
