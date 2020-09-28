package 상속;

public class 플러스스레드 extends Thread {
	int num;
	public void run() {
		for (int i = 1; i <= 500; i++) {
			System.out.println("☆증가 : " + i );
		}
		
	}
}
