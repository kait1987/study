package Day18;

import java.awt.Toolkit;

public class 소리스레드2 extends Thread {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for( int i = 0 ; i<5 ; i++ ) {
			toolkit.beep();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
