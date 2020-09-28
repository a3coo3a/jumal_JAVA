package 상속;

import java.util.Date;

public class 날짜스레드 extends Thread {
	@Override
	public void run() {
		
		for (int i = 0; i < 300; i++) {
			Date date = new Date();
			System.out.println(date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("날짜 변화중 오류 발생");
			}
			
		}
	}
}
