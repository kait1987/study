package Day18;

import java.awt.Toolkit;

public class Day18_3 {

	public static void main(String[] args) {

		
		// 스레드 : 코드를 읽어주는 역활 
			// main 메소드에 : main 스레드 존재 
		// 멀티스레드 : 여러 코드를 동시 처리 
			// 코드 병행처리 
				// 컴퓨터 입장 => 병행처리 X => 순서대로 처리 
		
			// 멀티 스레드 정의 
			// 1. implements Runnable => run 메소드 @Override
			// 2. extends Thread => run 메소드 @Override
			// 3. new Thread( new Runnable() { run 메소드 @Override } );
		
			// 멀티 스레드 실행 
			// 1. 스레드명.start() : start() => 해당 스레드 run
		
			
		
		// 예제1) 단일 스레드 
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for( int i = 0 ; i<5 ; i++ ) {
			
			toolkit.beep(); // 비프음 소리 
			try {
				Thread.sleep(1000);  // 스레드 일시정지 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("------- 예제1 끝 ");
		
		// 예제2 ) 멀티 스레드 [ 인터페이스 ] 
		Runnable 소리 = new 소리스레드();
		Thread 멀티스레드1 = new Thread( 소리 );
		
		멀티스레드1.start(); // => 해당 스레드 run 메소드 호출 
		
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("------- 예제2 끝 ");
		
		// 예제3 ) 멀티 스레드  [ 클래스 ] 
		Thread 멀티스레드2 = new 소리스레드2();
		멀티스레드2.start();
		
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("------- 예제3 끝 ");
		
		// 예제4 ) 
		Thread 멀티스레드3 = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0 ; i<5 ; i++ ) {
					toolkit.beep(); // 비프음 소리 
					try {
						Thread.sleep(1000);  // 스레드 일시정지 
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}			
				}
			}
		}); // ; 
		
		멀티스레드3.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
