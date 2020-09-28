package 상속;

public class 카운터스레드 extends Thread {
	@Override
	public void run() {
		// 예외처리의 경우 
		// - network, file, cpu  관련 메서드의 경우 예외처리를 해야함.
		for (int i = 500; i > 0; i--) {
			System.out.println("카운트 : " + i);
			//l1.setText("카운터 : "+i);
			try {		// 오버라이딩하는 경우 throws로 예외처리 불가 (원본 불변) try-catch 사용해야 함.
				Thread.sleep(500);	// 1초
			} catch (InterruptedException e) {
				System.out.println("cpu와 연결하던 중 에러 발생");
			}		
		}

	}
}
