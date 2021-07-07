package Day06;

public class Day06_1 {
	
	
	public static void main(String[] args) {
		
		
		// 제어문 = if[논리제어] , switch[값제어]
		// 반복문 = for , while , do~while
		
		// switch 
			// 1. (key) 에 해당하는 case 찾은후 아래 case 모두 출력 
			// 2. break; : switch 탈출
			// 3. case 논리X
		int 점수 = 80;
		switch( 점수 ) {
			case 90 :
				System.out.println("A등급");
				break;
			case 80 :
				System.out.println("B등급");
				break;
			case 70 :
				System.out.println("C등급");
				break;
			default :
				System.out.println("탈락");
		}
		// 값이 정해져있는 경우의 수 판단 
		int 버튼 = 3 ;
		switch( 버튼 ) {
			case 1 :
			case 2 : 
			case 3 :
			default :
		}
		// 3개의 점수를 평균을 계산후에 평균이 90점이상이면 "A" 80점이상이면 "B" 나머지 "탈락"
		int 국어=80,영어=80,수학=90;
		int 평균 = (국어+영어+수학) / 3 ;
			// 90이상 -> 9 
			// 80이상 -> 8
		switch( 평균/10 ) {
			case 9 : System.out.println("A등급"); break;
			case 8 : System.out.println("B등급"); break;
			default : System.out.println("탈락");
		}

		// while : 무한반복
		int i = 0 ; // 초기값
		int sum = 0; 
		while ( i < 10 ) { // 해당 논리가 T 이면 실행 아니면 F 이면 실행
			i++; // 증감식
			sum += i;
		} // i 가 10 이면 반복문 탈출 
		
		int j = 0; 
		while(true) {
			j++;
			System.out.println("무한반복");
			if( j == 10 ) break;
		}
	
	}
	
}
