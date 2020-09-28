package 상속;

public class 마이너스스레드 extends Thread {

	public void run() {
		
		for (int i = 100; i > 0; i--) {
			
			System.out.println("★감소 : "+i);
		}
		
	}
}
