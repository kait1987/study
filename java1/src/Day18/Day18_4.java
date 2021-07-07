package Day18;

public class Day18_4 {
	
	public static void main(String[] args) {
	
		Thread 영화실행 = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0 ; i<5 ; i++ ) {
					System.out.println("영화실행중");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		Thread 음악실행 = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0 ; i<5 ; i++ ) {
					System.out.println("음악실행중");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		Thread 메일실행 = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0 ; i<5 ; i++ ) {
					System.out.println("메일실행중");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		영화실행.start();
		음악실행.start();
		메일실행.start();
		System.out.println(" ---------> 메인 스레드 끝 ");
		

	}
}
